from antlr4 import *
from autogen.CymbolParser import CymbolParser 
from autogen.CymbolVisitor import CymbolVisitor

class Type:
	VOID = "void"
	INT = "int"


class CymbolCheckerVisitor(CymbolVisitor):
	id_values = {}

	def visitVarDecl(self, ctx:CymbolParser.VarDeclContext):
		print("var decl")
		var_name = ctx.ID().getText()
		tyype = ctx.tyype().getText()
		print("tyype = " + tyype)
		
		if (tyype == Type.VOID):
			result = Type.VOID
			print("Mensagem de erro 1...")
			exit(1)
		else:
			if ctx.expr() != None:
				init = ctx.expr().accept(self)
				print("init = " + init)
				if init != tyype:
					print("Mensagem de erro 2...")
					exit(2)

			result = tyype
			self.id_values[var_name] = tyype

		print("saved variable " + var_name + " of type " + tyype)
		return result
