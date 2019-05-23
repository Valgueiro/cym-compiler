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
        return self.name + "   ->  " + self.llvm_type


class Expr():
	def __init__(self, tyype, value):
		self.type = tyype
		self.value = value


class CymbolCheckerVisitor(CymbolVisitor):
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

        block = ""
        returns = []

        if ctx.block().stat():
            for stat in ctx.block().stat():
                ret = self.visit(stat)
                if ret is not None:
               		returns.extend(ret.split('\n'))

            for ret in returns:
                block += f'  {ret}\n'
		
        out = f'define {tyype} @{name}() #0 {{ \n'
        out += block
        out += "\n}\n"

        return out

    def visitVarDecl(self, ctx: CymbolParser.VarDeclContext):
        tyype = TypeEnum(ctx.tyype().getText()).get_llvm_type()
        name = ctx.ID().getText()

        mem_alloc = f'%{name} = alloca {tyype}, align 4\n'
        out = mem_alloc
        if ctx.expr() is not None:
            expr = self.visit(ctx.expr())
            print(expr.type)
            out += f'store {expr.type} {expr.value}, {tyype}* %{name}, align 4\n'
        return out

    def visitReturnStat(self, ctx: CymbolParser.ReturnStatContext):
        expr = self.visit(ctx.expr())

        out = "ret "
        
        if expr:
            out += f'{expr.type} {expr.value}'

        print(out)
        return out

    def visitIntExpr(self, ctx: CymbolParser.IntExprContext):
        tyype = TypeEnum.INT.get_llvm_type()
        value = ctx.INT().getText()
        return Expr(tyype, value)

    def visitFloatExpr(self, ctx: CymbolParser.FloatExprContext):
        # TODO probably we will have to transform text to hexadecimal
        tyype = TypeEnum.FLOAT.get_llvm_type()
        value = ctx.INT().getText()
        return Expr(tyype, value)

    def visitBooleanExpr(self, ctx: CymbolParser.BooleanExprContext):
        # TODO check if it is using it right. I think it uses i32 (like int) instead
        tyype = TypeEnum.BOOLEAN.get_llvm_type()
        value = 1 if ctx.getText() == 'true' else 0

        return Expr(tyype, value)
