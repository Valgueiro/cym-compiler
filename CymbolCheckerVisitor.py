from antlr4 import *
from autogen.CymbolParser import CymbolParser 
from autogen.CymbolVisitor import CymbolVisitor
from enum import Enum

class TypeEnum(Enum):
	INT = "int"#, llvm_type: "i32"}
	FLOAT ="float" # llvm_type: "float"}
	BOOLEAN = "boolean" #llvm_type: "i8"}

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

class CymbolCheckerVisitor(CymbolVisitor):
	def visitFiile(self, ctx:CymbolParser.FiileContext):
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

	def visitFuncDecl(self, ctx:CymbolParser.FuncDeclContext):
		tyype = TypeEnum(ctx.tyype().getText()).get_llvm_type()
		name = ctx.ID().getText()

		block = ""
		if ctx.block().stat(): 
			for stat in ctx.block().stat():
				ret = self.visit(stat)
				if ret is not None:
					block += "  " + ret

	
		out = f'define {tyype} @ {name}() #0 {{ \n'
		out += block
		out += "\n}\n"

		return out 


	def visitVarDecl(self, ctx:CymbolParser.VarDeclContext):
		tyype = TypeEnum(ctx.tyype().getText())
		name = ctx.ID().getText()
		out = tyype.get_llvm_type() + " " + name + ";\n"
		return out

	def visitReturnStat(self, ctx:CymbolParser.ReturnStatContext):
		expr = self.visit(ctx.expr())
		
		out = "ret "
		if expr:
			out += expr

		print(out)
		return out

	def visitIntExpr(self, ctx:CymbolParser.IntExprContext):
		tyype = TypeEnum.INT.get_llvm_type()
		return f'{tyype} {ctx.getText()}'

	def visitFloatExpr(self, ctx:CymbolParser.FloatExprContext):
		# TODO probably we will have to transform text to hexadecimal
		tyype = TypeEnum.FLOAT.get_llvm_type()
		return f'{tyype} {ctx.getText()}'
	
	def visitBooleanExpr(self, ctx:CymbolParser.BooleanExprContext):
		# TODO check if it is using it right. I think it uses i32 (like int) instead
		tyype = TypeEnum.BOOLEAN.get_llvm_type()
		value = 1 if ctx.getText() == 'true' else 0
		
		return f'{tyype} {value}'
    