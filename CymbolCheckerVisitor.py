from antlr4 import *
from autogen.CymbolParser import CymbolParser 
from autogen.CymbolVisitor import CymbolVisitor

class TypeEnum:
	INT = "int"#, llvm_type: "i32"}
	FLOAT ="float" # llvm_type: "float"}
	BOOLEAN = "boolean" #llvm_type: "i8"}


class Type:
	def __init__(self, name):
		self.name = name

		llvm_type = ""
		if self.name == TypeEnum.INT:
			llvm_type = "i32"
		elif self.name == TypeEnum.FLOAT:
			llvm_type = "float"
		elif self.name == TypeEnum.BOOLEAN:
			llvm_type = "i8"

		self.llvm_type = llvm_type

	def get_llvm_type(self):
		return self.llvm_type
	
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
		tyype = Type(ctx.tyype().getText())
		name = ctx.ID().getText()

		block = ""
		if ctx.block().stat(): 
			for stat in ctx.block().stat():
				ret = self.visit(stat)
				if ret is not None:
					block += ret

		print(tyype)
		print(name)
		print(block)

		out = "define " + tyype.get_llvm_type() + " @" + name +"() #0{\n"
		out += block
		out += "}"

		return out 



	def visitVarDecl(self, ctx:CymbolParser.VarDeclContext):
		# print("var decl")
		return "    ret i32 42\n"

    