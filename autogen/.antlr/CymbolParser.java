// Generated from /Users/mateusvalgueiro/git/cym-compiler/autogen/Cymbol.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CymbolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPEINT=1, TYPEFLOAT=2, TYPEBOOLEAN=3, IF=4, ELSE=5, RETURN=6, LP=7, RP=8, 
		COMMA=9, SEMICOLON=10, LB=11, RB=12, AS=13, EQ=14, NE=15, NOT=16, GT=17, 
		LT=18, GE=19, LE=20, MUL=21, DIV=22, PLUS=23, MINUS=24, AND=25, OR=26, 
		BOOLEAN=27, ID=28, INT=29, FLOAT=30, BLOCKCOMMENT=31, LINECOMMENT=32, 
		WS=33;
	public static final int
		RULE_fiile = 0, RULE_varDecl = 1, RULE_tyype = 2, RULE_funcDecl = 3, RULE_paramTypeList = 4, 
		RULE_paramType = 5, RULE_block = 6, RULE_assignStat = 7, RULE_returnStat = 8, 
		RULE_ifElseStat = 9, RULE_ifElseExprStat = 10, RULE_ifStat = 11, RULE_elseStat = 12, 
		RULE_exprStat = 13, RULE_exprList = 14, RULE_stat = 15, RULE_expr = 16;
	public static final String[] ruleNames = {
		"fiile", "varDecl", "tyype", "funcDecl", "paramTypeList", "paramType", 
		"block", "assignStat", "returnStat", "ifElseStat", "ifElseExprStat", "ifStat", 
		"elseStat", "exprStat", "exprList", "stat", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'float'", "'boolean'", "'if'", "'else'", "'return'", "'('", 
		"')'", "','", "';'", "'{'", "'}'", "'='", "'=='", "'!='", "'!'", "'>'", 
		"'<'", "'>='", "'<='", "'*'", "'/'", "'+'", "'-'", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TYPEINT", "TYPEFLOAT", "TYPEBOOLEAN", "IF", "ELSE", "RETURN", "LP", 
		"RP", "COMMA", "SEMICOLON", "LB", "RB", "AS", "EQ", "NE", "NOT", "GT", 
		"LT", "GE", "LE", "MUL", "DIV", "PLUS", "MINUS", "AND", "OR", "BOOLEAN", 
		"ID", "INT", "FLOAT", "BLOCKCOMMENT", "LINECOMMENT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Cymbol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CymbolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FiileContext extends ParserRuleContext {
		public List<FuncDeclContext> funcDecl() {
			return getRuleContexts(FuncDeclContext.class);
		}
		public FuncDeclContext funcDecl(int i) {
			return getRuleContext(FuncDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public TerminalNode EOF() { return getToken(CymbolParser.EOF, 0); }
		public FiileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fiile; }
	}

	public final FiileContext fiile() throws RecognitionException {
		FiileContext _localctx = new FiileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fiile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(36);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(34);
					funcDecl();
					}
					break;
				case 2:
					{
					setState(35);
					varDecl();
					}
					break;
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEINT) | (1L << TYPEFLOAT) | (1L << TYPEBOOLEAN))) != 0) );
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(40);
				match(EOF);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TyypeContext tyype() {
			return getRuleContext(TyypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			tyype();
			setState(44);
			match(ID);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(45);
				match(AS);
				setState(46);
				expr(0);
				}
			}

			setState(49);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TyypeContext extends ParserRuleContext {
		public TerminalNode TYPEINT() { return getToken(CymbolParser.TYPEINT, 0); }
		public TerminalNode TYPEFLOAT() { return getToken(CymbolParser.TYPEFLOAT, 0); }
		public TerminalNode TYPEBOOLEAN() { return getToken(CymbolParser.TYPEBOOLEAN, 0); }
		public TyypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tyype; }
	}

	public final TyypeContext tyype() throws RecognitionException {
		TyypeContext _localctx = new TyypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tyype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEINT) | (1L << TYPEFLOAT) | (1L << TYPEBOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclContext extends ParserRuleContext {
		public TyypeContext tyype() {
			return getRuleContext(TyypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamTypeListContext paramTypeList() {
			return getRuleContext(ParamTypeListContext.class,0);
		}
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			tyype();
			setState(54);
			match(ID);
			setState(55);
			match(LP);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEINT) | (1L << TYPEFLOAT) | (1L << TYPEBOOLEAN))) != 0)) {
				{
				setState(56);
				paramTypeList();
				}
			}

			setState(59);
			match(RP);
			setState(60);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamTypeListContext extends ParserRuleContext {
		public List<ParamTypeContext> paramType() {
			return getRuleContexts(ParamTypeContext.class);
		}
		public ParamTypeContext paramType(int i) {
			return getRuleContext(ParamTypeContext.class,i);
		}
		public ParamTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramTypeList; }
	}

	public final ParamTypeListContext paramTypeList() throws RecognitionException {
		ParamTypeListContext _localctx = new ParamTypeListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_paramTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			paramType();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(63);
				match(COMMA);
				setState(64);
				paramType();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamTypeContext extends ParserRuleContext {
		public TyypeContext tyype() {
			return getRuleContext(TyypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public ParamTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramType; }
	}

	public final ParamTypeContext paramType() throws RecognitionException {
		ParamTypeContext _localctx = new ParamTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paramType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			tyype();
			setState(71);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(LB);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEINT) | (1L << TYPEFLOAT) | (1L << TYPEBOOLEAN) | (1L << IF) | (1L << RETURN) | (1L << LP) | (1L << NOT) | (1L << PLUS) | (1L << MINUS) | (1L << BOOLEAN) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				{
				setState(74);
				stat();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(RB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignStatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStat; }
	}

	public final AssignStatContext assignStat() throws RecognitionException {
		AssignStatContext _localctx = new AssignStatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(ID);
			setState(83);
			match(AS);
			setState(84);
			expr(0);
			setState(85);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStat; }
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(RETURN);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LP) | (1L << NOT) | (1L << PLUS) | (1L << MINUS) | (1L << BOOLEAN) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				setState(88);
				expr(0);
				}
			}

			setState(91);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfElseStatContext extends ParserRuleContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public ElseStatContext elseStat() {
			return getRuleContext(ElseStatContext.class,0);
		}
		public IfElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseStat; }
	}

	public final IfElseStatContext ifElseStat() throws RecognitionException {
		IfElseStatContext _localctx = new IfElseStatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifElseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			ifStat();
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(94);
				elseStat();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfElseExprStatContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfElseStatContext ifElseStat() {
			return getRuleContext(IfElseStatContext.class,0);
		}
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
		}
		public AssignStatContext assignStat() {
			return getRuleContext(AssignStatContext.class,0);
		}
		public ExprStatContext exprStat() {
			return getRuleContext(ExprStatContext.class,0);
		}
		public IfElseExprStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseExprStat; }
	}

	public final IfElseExprStatContext ifElseExprStat() throws RecognitionException {
		IfElseExprStatContext _localctx = new IfElseExprStatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifElseExprStat);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				ifElseStat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				returnStat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				assignStat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				exprStat();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfElseExprStatContext ifElseExprStat() {
			return getRuleContext(IfElseExprStatContext.class,0);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IF);
			setState(105);
			match(LP);
			setState(106);
			expr(0);
			setState(107);
			match(RP);
			setState(108);
			ifElseExprStat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatContext extends ParserRuleContext {
		public IfElseExprStatContext ifElseExprStat() {
			return getRuleContext(IfElseExprStatContext.class,0);
		}
		public ElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStat; }
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(ELSE);
			setState(111);
			ifElseExprStat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprStatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStat; }
	}

	public final ExprStatContext exprStat() throws RecognitionException {
		ExprStatContext _localctx = new ExprStatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exprStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			expr(0);
			setState(114);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			expr(0);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(117);
				match(COMMA);
				setState(118);
				expr(0);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public IfElseStatContext ifElseStat() {
			return getRuleContext(IfElseStatContext.class,0);
		}
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
		}
		public AssignStatContext assignStat() {
			return getRuleContext(AssignStatContext.class,0);
		}
		public ExprStatContext exprStat() {
			return getRuleContext(ExprStatContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stat);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				ifElseStat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				returnStat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				assignStat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				exprStat();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INT() { return getToken(CymbolParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CymbolParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(CymbolParser.BOOLEAN, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(132);
				match(ID);
				setState(133);
				match(LP);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LP) | (1L << NOT) | (1L << PLUS) | (1L << MINUS) | (1L << BOOLEAN) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
					{
					setState(134);
					exprList();
					}
				}

				setState(137);
				match(RP);
				}
				break;
			case 2:
				{
				setState(138);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(139);
				expr(12);
				}
				break;
			case 3:
				{
				setState(140);
				match(NOT);
				setState(141);
				expr(11);
				}
				break;
			case 4:
				{
				setState(142);
				match(ID);
				}
				break;
			case 5:
				{
				setState(143);
				match(INT);
				}
				break;
			case 6:
				{
				setState(144);
				match(FLOAT);
				}
				break;
			case 7:
				{
				setState(145);
				match(BOOLEAN);
				}
				break;
			case 8:
				{
				setState(146);
				match(LP);
				setState(147);
				expr(0);
				setState(148);
				match(RP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(167);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(153);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GE) | (1L << LE))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(154);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(156);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(157);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(159);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(160);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(162);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(163);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(165);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NE) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(166);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\6\2\'\n\2\r\2\16\2(\3\2\5\2,\n\2\3\3\3\3\3\3\3\3\5\3\62\n\3\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5<\n\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6D\n"+
		"\6\f\6\16\6G\13\6\3\7\3\7\3\7\3\b\3\b\7\bN\n\b\f\b\16\bQ\13\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\5\n\\\n\n\3\n\3\n\3\13\3\13\5\13b\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\5\fi\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\7\20z\n\20\f\20\16\20}\13\20\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0084\n\21\3\22\3\22\3\22\3\22\5\22\u008a\n\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0099"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u00aa\n\22\f\22\16\22\u00ad\13\22\3\22\2\3\"\23\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\b\3\2\3\5\3\2\31\32\3\2\23\26\3"+
		"\2\27\30\3\2\33\34\3\2\20\21\2\u00bc\2&\3\2\2\2\4-\3\2\2\2\6\65\3\2\2"+
		"\2\b\67\3\2\2\2\n@\3\2\2\2\fH\3\2\2\2\16K\3\2\2\2\20T\3\2\2\2\22Y\3\2"+
		"\2\2\24_\3\2\2\2\26h\3\2\2\2\30j\3\2\2\2\32p\3\2\2\2\34s\3\2\2\2\36v\3"+
		"\2\2\2 \u0083\3\2\2\2\"\u0098\3\2\2\2$\'\5\b\5\2%\'\5\4\3\2&$\3\2\2\2"+
		"&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*,\7\2\2\3+*\3\2\2"+
		"\2+,\3\2\2\2,\3\3\2\2\2-.\5\6\4\2.\61\7\36\2\2/\60\7\17\2\2\60\62\5\""+
		"\22\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7\f\2\2\64\5\3\2\2"+
		"\2\65\66\t\2\2\2\66\7\3\2\2\2\678\5\6\4\289\7\36\2\29;\7\t\2\2:<\5\n\6"+
		"\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7\n\2\2>?\5\16\b\2?\t\3\2\2\2@E\5\f"+
		"\7\2AB\7\13\2\2BD\5\f\7\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\13"+
		"\3\2\2\2GE\3\2\2\2HI\5\6\4\2IJ\7\36\2\2J\r\3\2\2\2KO\7\r\2\2LN\5 \21\2"+
		"ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\16\2"+
		"\2S\17\3\2\2\2TU\7\36\2\2UV\7\17\2\2VW\5\"\22\2WX\7\f\2\2X\21\3\2\2\2"+
		"Y[\7\b\2\2Z\\\5\"\22\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\f\2\2^\23\3"+
		"\2\2\2_a\5\30\r\2`b\5\32\16\2a`\3\2\2\2ab\3\2\2\2b\25\3\2\2\2ci\5\16\b"+
		"\2di\5\24\13\2ei\5\22\n\2fi\5\20\t\2gi\5\34\17\2hc\3\2\2\2hd\3\2\2\2h"+
		"e\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\27\3\2\2\2jk\7\6\2\2kl\7\t\2\2lm\5\"\22"+
		"\2mn\7\n\2\2no\5\26\f\2o\31\3\2\2\2pq\7\7\2\2qr\5\26\f\2r\33\3\2\2\2s"+
		"t\5\"\22\2tu\7\f\2\2u\35\3\2\2\2v{\5\"\22\2wx\7\13\2\2xz\5\"\22\2yw\3"+
		"\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\37\3\2\2\2}{\3\2\2\2~\u0084\5\4"+
		"\3\2\177\u0084\5\24\13\2\u0080\u0084\5\22\n\2\u0081\u0084\5\20\t\2\u0082"+
		"\u0084\5\34\17\2\u0083~\3\2\2\2\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084!\3\2\2\2\u0085\u0086\b"+
		"\22\1\2\u0086\u0087\7\36\2\2\u0087\u0089\7\t\2\2\u0088\u008a\5\36\20\2"+
		"\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0099"+
		"\7\n\2\2\u008c\u008d\t\3\2\2\u008d\u0099\5\"\22\16\u008e\u008f\7\22\2"+
		"\2\u008f\u0099\5\"\22\r\u0090\u0099\7\36\2\2\u0091\u0099\7\37\2\2\u0092"+
		"\u0099\7 \2\2\u0093\u0099\7\35\2\2\u0094\u0095\7\t\2\2\u0095\u0096\5\""+
		"\22\2\u0096\u0097\7\n\2\2\u0097\u0099\3\2\2\2\u0098\u0085\3\2\2\2\u0098"+
		"\u008c\3\2\2\2\u0098\u008e\3\2\2\2\u0098\u0090\3\2\2\2\u0098\u0091\3\2"+
		"\2\2\u0098\u0092\3\2\2\2\u0098\u0093\3\2\2\2\u0098\u0094\3\2\2\2\u0099"+
		"\u00ab\3\2\2\2\u009a\u009b\f\f\2\2\u009b\u009c\t\4\2\2\u009c\u00aa\5\""+
		"\22\r\u009d\u009e\f\13\2\2\u009e\u009f\t\5\2\2\u009f\u00aa\5\"\22\f\u00a0"+
		"\u00a1\f\n\2\2\u00a1\u00a2\t\3\2\2\u00a2\u00aa\5\"\22\13\u00a3\u00a4\f"+
		"\t\2\2\u00a4\u00a5\t\6\2\2\u00a5\u00aa\5\"\22\n\u00a6\u00a7\f\b\2\2\u00a7"+
		"\u00a8\t\7\2\2\u00a8\u00aa\5\"\22\t\u00a9\u009a\3\2\2\2\u00a9\u009d\3"+
		"\2\2\2\u00a9\u00a0\3\2\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a6\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac#\3\2\2\2"+
		"\u00ad\u00ab\3\2\2\2\22&(+\61;EO[ah{\u0083\u0089\u0098\u00a9\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}