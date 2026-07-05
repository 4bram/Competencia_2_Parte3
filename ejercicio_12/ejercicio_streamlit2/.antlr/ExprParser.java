// Generated from c:/Users/spide/OneDrive/Escritorio/Competencia_2_parte3/ejercicio_12/ejercicio_streamlit2/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUBLIC=1, CLASS=2, STATIC=3, VOID=4, MAIN=5, INT=6, SYSTEM=7, DOT=8, OUT=9, 
		PRINTLN=10, CADENA=11, MAS=12, LA=13, LC=14, PA=15, PC=16, CA=17, CC=18, 
		ASIG=19, STR=20, MAYOR=21, NUM=22, IDF=23, FIN=24, WS=25;
	public static final int
		RULE_root = 0, RULE_expr = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'class'", "'static'", "'void'", "'main'", "'int'", 
			"'System'", "'.'", "'out'", "'println'", null, "'+'", "'{'", "'}'", "'('", 
			"')'", "'['", "']'", "'='", "'String'", "'>'", null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUBLIC", "CLASS", "STATIC", "VOID", "MAIN", "INT", "SYSTEM", "DOT", 
			"OUT", "PRINTLN", "CADENA", "MAS", "LA", "LC", "PA", "PC", "CA", "CC", 
			"ASIG", "STR", "MAYOR", "NUM", "IDF", "FIN", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			expr();
			setState(5);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public TerminalNode IDF() { return getToken(ExprParser.IDF, 0); }
		public TerminalNode PUBLIC() { return getToken(ExprParser.PUBLIC, 0); }
		public TerminalNode CLASS() { return getToken(ExprParser.CLASS, 0); }
		public TerminalNode STATIC() { return getToken(ExprParser.STATIC, 0); }
		public TerminalNode VOID() { return getToken(ExprParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(ExprParser.MAIN, 0); }
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode STR() { return getToken(ExprParser.STR, 0); }
		public TerminalNode MAYOR() { return getToken(ExprParser.MAYOR, 0); }
		public TerminalNode DOT() { return getToken(ExprParser.DOT, 0); }
		public TerminalNode OUT() { return getToken(ExprParser.OUT, 0); }
		public TerminalNode PRINTLN() { return getToken(ExprParser.PRINTLN, 0); }
		public TerminalNode CADENA() { return getToken(ExprParser.CADENA, 0); }
		public TerminalNode MAS() { return getToken(ExprParser.MAS, 0); }
		public TerminalNode LA() { return getToken(ExprParser.LA, 0); }
		public TerminalNode LC() { return getToken(ExprParser.LC, 0); }
		public TerminalNode PA() { return getToken(ExprParser.PA, 0); }
		public TerminalNode PC() { return getToken(ExprParser.PC, 0); }
		public TerminalNode CA() { return getToken(ExprParser.CA, 0); }
		public TerminalNode CC() { return getToken(ExprParser.CC, 0); }
		public TerminalNode ASIG() { return getToken(ExprParser.ASIG, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16777086L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u0019\n\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000"+
		"\u0000\u0002\u0000\u0002\u0000\u0001\u0002\u0000\u0001\u0006\b\u0017\u0007"+
		"\u0000\u0004\u0001\u0000\u0000\u0000\u0002\u0007\u0001\u0000\u0000\u0000"+
		"\u0004\u0005\u0003\u0002\u0001\u0000\u0005\u0006\u0005\u0000\u0000\u0001"+
		"\u0006\u0001\u0001\u0000\u0000\u0000\u0007\b\u0007\u0000\u0000\u0000\b"+
		"\u0003\u0001\u0000\u0000\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}