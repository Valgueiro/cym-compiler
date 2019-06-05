from antlr4 import *
from autogen.CymbolParser import CymbolParser
from autogen.CymbolVisitor import CymbolVisitor
from enum import Enum


class TypeEnum(Enum):
    INT = "int"  # , llvm_type: "i32"}
    FLOAT = "float"  # llvm_type: "float"}
    BOOLEAN = "boolean"  # llvm_type: "i8"}

    def get_llvm_type(self):
        llvm_type = ""
        if self.value == self.INT.value:
            llvm_type = "i32"
        elif self.value == self.FLOAT.value:
            llvm_type = "float"
        elif self.value == self.BOOLEAN.value:
            llvm_type = "i8"
        return llvm_type

    def __str__(self):
        return self.get_llvm_type()


class Expr():
    def __init__(self, tyype, value, loaded=False, declarations="", nmfnc = "global"):
        """
        Initialize Expr Object
        :param: tyype - type of the expr
        :param: value - the value, can be number or register
        :param: declarations - contains all the commands that you have to do before calling this expr
        """
        self.type = tyype
        self.value = value
        self.loaded = loaded
        self.declarations = declarations
        self.nmfnc = nmfnc

    def load(self):
        """
        Used to load variable in a new register
        """
        dest_reg = function_heaps[self.nmfnc].get_new_register()
        self.declarations += f'%{dest_reg} = load {self.type}, {self.type}* {self.value}, align 4\n'
        return f'%{dest_reg}'

    def get_assigned_register(self):
        """
        Get the register assigned with expr (or load one if not already assigned)
        """
        if self.loaded:
            return self.value

        return self.load()

    def __str__(self):
        return f'{{value: {self.value}; type: {self.type}; dec: {self.declarations}; loaded: {self.loaded}}} --end'


class RegisterHeap():
    def __init__(self):
        self.heap = []

    # def load_registers(self):
    #     for

    def get_new_register(self):
        self.heap.append(1)
        register = len(self.heap)
        return register


#register_heap = RegisterHeap()
function_heaps = {}


class CymbolCheckerVisitor(CymbolVisitor):
    variables_type = {}
    variables_type["global"] = {} 
    namefunc = "global"
    function_heaps["global"] = RegisterHeap()
    def visitFiile(self, ctx: CymbolParser.FiileContext):
        output = ""
        if ctx.children:
            for child in ctx.children:
                ret = self.visit(child)
                if ret is not None:
                    output += ret
        print(output)
        if len(output) > 0:
            file = open("out.ll", "w")
            file.write(output)

    def visitFuncDecl(self, ctx: CymbolParser.FuncDeclContext):
        tyype = TypeEnum(ctx.tyype().getText()).get_llvm_type()
        name = ctx.ID().getText()
        self.variables_type["global"][name]=tyype
        self.namefunc=name
        function_heaps[name] = RegisterHeap()
        self.variables_type[self.namefunc]={}
        block = ""
        paramtypelist = ""
        paramnamelist=[]
        returns = []
        firstparam=1
        if ctx.paramTypeList():
            paramlist = ctx.paramTypeList().paramType()
            for paramtype in paramlist: #faz para o resto
                (rettyype, retname) = self.visit(paramtype)
                if rettyype is not None:
                    if firstparam:
                        firstparam = 0
                        paramtypelist += f'{rettyype}'
                    else:
                        paramtypelist += f', {rettyype}'
                if retname is not None:
                    paramnamelist.append(retname)
            for paramname in paramnamelist:
                block += f'%{paramname} = alloca {self.variables_type[self.namefunc][paramname]}, align 4\n'
            n = len(paramnamelist)
            for i in range (n):
                iname=paramnamelist[i]
                itp = self.variables_type[self.namefunc][iname]
                block += f'store {itp} %{i}, {itp}* %{iname}, align 4\n'
        if ctx.block().stat():
            for stat in ctx.block().stat():
                ret = self.visit(stat)
                if ret is not None:
                    returns.extend(ret.split('\n'))

            for ret in returns:
                block += f' {ret}\n'
        out = f'define {tyype} @{name}({paramtypelist}) #0 {{ \n'
        out += block
        out += "\n}\n"
        self.namefunc="global"

        return out

    def visitVarDecl(self, ctx: CymbolParser.VarDeclContext):
        tyype = TypeEnum(ctx.tyype().getText())
        name = ctx.ID().getText()
        self.variables_type[self.namefunc][name] = tyype
        if self.namefunc == "global":
            if ctx.expr() is not None:
                expr = self.visit(ctx.expr())
                out = expr.declarations
                out += f'@{name} = global {tyype} {expr.value}, align 4\n'
            else:
                out = f'@{name} = common global {tyype} 0, align 4\n' 
            
        else:    
            mem_alloc = f'%{name} = alloca {tyype}, align 4\n'
            out = mem_alloc
            if ctx.expr() is not None:
                expr = self.visit(ctx.expr())
                out += expr.declarations
                out += f'store {expr.type} {expr.value}, {tyype}* %{name}, align 4\n'
        return out

    def visitParamType(self, ctx: CymbolParser.ParamTypeContext):
        tyype = TypeEnum(ctx.tyype().getText())
        name = ctx.ID().getText()
        self.variables_type[self.namefunc][name] = tyype
        n = function_heaps[self.namefunc].get_new_register()

        return (f'{tyype}', name)

    def visitAssignStat(self, ctx: CymbolParser.AssignStatContext):
        name = ctx.ID().getText()
        if name in self.variables_type[self.namefunc]:
            tyype = self.variables_type[self.namefunc][name]
        else:
            tyype = self.variables_type["global"][name]
        expr = self.visit(ctx.expr())
        out  = expr.declarations
        out += f'store {expr.type} {expr.value}, {tyype}* %{name}, align 4\n'
        return out

    def visitReturnStat(self, ctx: CymbolParser.ReturnStatContext):
        expr = self.visit(ctx.expr())
        if expr:
            reg = expr.get_assigned_register()
            out = expr.declarations + '\n'
            out += f'ret {expr.type} {reg}'
        else:
            out = 'ret i32 0'

        return out

    def visitIntExpr(self, ctx: CymbolParser.IntExprContext):
        tyype = TypeEnum.INT
        value = ctx.INT().getText()
        return Expr(tyype, value, loaded=True)

    def visitFloatExpr(self, ctx: CymbolParser.FloatExprContext):
        # TODO probably we will have to transform text to hexadecimal
        tyype = TypeEnum.FLOAT
        value = ctx.INT().getText()
        return Expr(tyype, value, loaded=True)

    def visitBooleanExpr(self, ctx: CymbolParser.BooleanExprContext):
        # TODO check if it is using it right. I think it uses i32 (like int) instead
        tyype = TypeEnum.BOOLEAN
        value = 1 if ctx.getText() == 'true' else 0

        return Expr(tyype, value, loaded=True)

    def visitIDExpr(self, ctx: CymbolParser.IDExprContext):
        name = ctx.ID().getText()
        if name in self.variables_type[self.namefunc]:
            tyype = self.variables_type[self.namefunc][name]
            return Expr(tyype, f'%{name}', nmfnc=self.namefunc)
        else:
            tyype = self.variables_type["global"][name]
            return Expr(tyype, f'@{name}', nmfnc=self.namefunc)

    def visitFuncCallExpr(self, ctx: CymbolParser.FuncCallExprContext):
        name = ctx.ID().getText()
        tyype = self.variables_type["global"][name]
        out = ""
        paramout = ""
        firstparam = 1
        if ctx.exprList():
            exprlist = ctx.exprList().expr()
            for exprn in exprlist:
                expr = self.visit(exprn)
                reg=expr.get_assigned_register()
                if expr.declarations != "":
                    out += expr.declarations + '\n'
                if firstparam:
                    paramout += f'{expr.type} {reg}'
                    firstparam=0
                else:
                    paramout += f', {expr.type} {reg}'
        out_reg = function_heaps[self.namefunc].get_new_register()
        out += f'%{out_reg} = call {tyype} @{name}({paramout})\n'
        expression = Expr(tyype, f'%{out_reg}', declarations=out, loaded= True, nmfnc = self.namefunc)
        return expression

    def visitExprStat(self, ctx: CymbolParser.exprStat):
        expr = self.visit(ctx.expr())
        out = expr.declarations
        if "call" in out:
            return out
        return ""

    def visitAddSubExpr(self, ctx: CymbolParser.AddSubExprContext):
        expr_1 = self.visit(ctx.expr()[0])
        expr_2 = self.visit(ctx.expr()[1])
        out = ""

        if ctx.op.text == '+':
            symbol = 'add nsw'
        else:
            symbol = 'sub nsw'
        if expr_1.type == expr_2.type:
            tyype = expr_1.type

            register_1 = expr_1.get_assigned_register()
            if expr_1.declarations != "":
                out += expr_1.declarations + '\n'

            register_2 = expr_2.get_assigned_register()
            if expr_2.declarations != "":
                out += (expr_2.declarations + '\n')

            out_reg = function_heaps[self.namefunc].get_new_register()
            out += f'%{out_reg} = {symbol} {tyype} {register_1}, {register_2}\n'
            expression = Expr(tyype, f'%{out_reg}',
                              declarations=out, loaded=True)
                              
            return expression

    def visitAndOrExpr(self, ctx: CymbolParser.AndOrExprContext):
        expr_1 = self.visit(ctx.expr()[0])
        expr_2 = self.visit(ctx.expr()[1])

        if ctx.op.text == '&&':
            symbol = 'and'
        else:
            symbol = 'or'

        if expr_1.type == expr_2.type:
            tyype = expr_1.type

            register_1 = expr_1.get_assigned_register()
            if expr_1.declarations != "":
                out += expr_1.declarations + '\n'

            register_2 = expr_2.get_assigned_register()
            if expr_2.declarations != "":
                out += (expr_2.declarations + '\n')
            
            out_reg = function_heaps[self.namefunc].get_new_register()
            out = f'%{out_reg} = {symbol} {tyype} {register_1}, {register_2}'
            return Expr(tyype, f'%{out_reg}', declarations=out, loaded= True, nmfnc=self.namefunc)
