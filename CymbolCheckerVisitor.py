from antlr4 import *
from autogen.CymbolParser import CymbolParser 
from autogen.CymbolVisitor import CymbolVisitor

class Type:
	VOID = "void"
	INT = "int"
	BOOLEAN = "boolean"


class CymbolCheckerVisitor(CymbolVisitor):
	def visitFiile(self, ctx:CymbolParser.FiileContext):
		output = self.visitChildren(ctx)
		print(output)
		if output:
			file = open("out.ll", "w")
			file.write(output)

	def visitVarDecl(self, ctx:CymbolParser.VarDeclContext):
		print("var decl")
		return "var decl"

    