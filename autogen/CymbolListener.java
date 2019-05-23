// Generated from autogen/Cymbol.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CymbolParser}.
 */
public interface CymbolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CymbolParser#fiile}.
	 * @param ctx the parse tree
	 */
	void enterFiile(CymbolParser.FiileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#fiile}.
	 * @param ctx the parse tree
	 */
	void exitFiile(CymbolParser.FiileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(CymbolParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(CymbolParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#tyype}.
	 * @param ctx the parse tree
	 */
	void enterTyype(CymbolParser.TyypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#tyype}.
	 * @param ctx the parse tree
	 */
	void exitTyype(CymbolParser.TyypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(CymbolParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(CymbolParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#paramTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParamTypeList(CymbolParser.ParamTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#paramTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParamTypeList(CymbolParser.ParamTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#paramType}.
	 * @param ctx the parse tree
	 */
	void enterParamType(CymbolParser.ParamTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#paramType}.
	 * @param ctx the parse tree
	 */
	void exitParamType(CymbolParser.ParamTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CymbolParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CymbolParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(CymbolParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(CymbolParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(CymbolParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(CymbolParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#ifElseStat}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStat(CymbolParser.IfElseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#ifElseStat}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStat(CymbolParser.IfElseStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#ifElseExprStat}.
	 * @param ctx the parse tree
	 */
	void enterIfElseExprStat(CymbolParser.IfElseExprStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#ifElseExprStat}.
	 * @param ctx the parse tree
	 */
	void exitIfElseExprStat(CymbolParser.IfElseExprStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(CymbolParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(CymbolParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(CymbolParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(CymbolParser.ElseStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#exprStat}.
	 * @param ctx the parse tree
	 */
	void enterExprStat(CymbolParser.ExprStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#exprStat}.
	 * @param ctx the parse tree
	 */
	void exitExprStat(CymbolParser.ExprStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(CymbolParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(CymbolParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CymbolParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CymbolParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CymbolParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CymbolParser.ExprContext ctx);
}