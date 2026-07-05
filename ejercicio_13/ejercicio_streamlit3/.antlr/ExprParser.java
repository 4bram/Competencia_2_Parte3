// Generated from c:/Users/spide/OneDrive/Escritorio/Competencia_2_parte3/ejercicio_13/ejercicio_streamlit3/Expr.g4 by ANTLR 4.13.1
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
		ASTERISK=1, INT=2, DOUBLE=3, NUM=4, VAR=5, NULL=6, CREATE=7, SELECT=8, 
		TABLE=9, FROM=10, WHERE=11, SERIAL=12, PRIMARY=13, INSERT=14, INTO=15, 
		KEY=16, NOT=17, VALUES=18, ON=19, INNER=20, JOIN=21, LLLAVE=22, RLLAVE=23, 
		LPAREN=24, RPAREN=25, LCORCH=26, RCORCH=27, PUNTO=28, COMMA=29, PUNTOC=30, 
		MAYOR=31, ASIGN=32, MENOR=33, DIF=34, AND=35, GUION=36, CADENACOMSEN=37, 
		CADENA=38, IDT=39, WS=40;
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
			null, "'*'", "'INTEGER'", "'DOUBLE'", null, "'VARCHAR'", "'NULL'", "'CREATE'", 
			"'SELECT'", "'TABLE'", "'FROM'", "'WHERE'", "'SERIAL'", "'PRIMARY'", 
			"'INSERT'", "'INTO'", "'KEY'", "'NOT'", "'VALUES'", "'ON'", "'INNER'", 
			"'JOIN'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'.'", "','", "';'", 
			"'>'", "'='", "'<'", "'!'", "'&'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASTERISK", "INT", "DOUBLE", "NUM", "VAR", "NULL", "CREATE", "SELECT", 
			"TABLE", "FROM", "WHERE", "SERIAL", "PRIMARY", "INSERT", "INTO", "KEY", 
			"NOT", "VALUES", "ON", "INNER", "JOIN", "LLLAVE", "RLLAVE", "LPAREN", 
			"RPAREN", "LCORCH", "RCORCH", "PUNTO", "COMMA", "PUNTOC", "MAYOR", "ASIGN", 
			"MENOR", "DIF", "AND", "GUION", "CADENACOMSEN", "CADENA", "IDT", "WS"
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
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(ExprParser.DOUBLE, 0); }
		public TerminalNode NULL() { return getToken(ExprParser.NULL, 0); }
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode SELECT() { return getToken(ExprParser.SELECT, 0); }
		public TerminalNode TABLE() { return getToken(ExprParser.TABLE, 0); }
		public TerminalNode FROM() { return getToken(ExprParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(ExprParser.WHERE, 0); }
		public TerminalNode SERIAL() { return getToken(ExprParser.SERIAL, 0); }
		public TerminalNode PRIMARY() { return getToken(ExprParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ExprParser.KEY, 0); }
		public TerminalNode LLLAVE() { return getToken(ExprParser.LLLAVE, 0); }
		public TerminalNode RLLAVE() { return getToken(ExprParser.RLLAVE, 0); }
		public TerminalNode LPAREN() { return getToken(ExprParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ExprParser.RPAREN, 0); }
		public TerminalNode LCORCH() { return getToken(ExprParser.LCORCH, 0); }
		public TerminalNode RCORCH() { return getToken(ExprParser.RCORCH, 0); }
		public TerminalNode PUNTO() { return getToken(ExprParser.PUNTO, 0); }
		public TerminalNode COMMA() { return getToken(ExprParser.COMMA, 0); }
		public TerminalNode PUNTOC() { return getToken(ExprParser.PUNTOC, 0); }
		public TerminalNode MAYOR() { return getToken(ExprParser.MAYOR, 0); }
		public TerminalNode ASIGN() { return getToken(ExprParser.ASIGN, 0); }
		public TerminalNode MENOR() { return getToken(ExprParser.MENOR, 0); }
		public TerminalNode DIF() { return getToken(ExprParser.DIF, 0); }
		public TerminalNode AND() { return getToken(ExprParser.AND, 0); }
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public TerminalNode IDT() { return getToken(ExprParser.IDT, 0); }
		public TerminalNode ASTERISK() { return getToken(ExprParser.ASTERISK, 0); }
		public TerminalNode CADENA() { return getToken(ExprParser.CADENA, 0); }
		public TerminalNode INSERT() { return getToken(ExprParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(ExprParser.INTO, 0); }
		public TerminalNode VALUES() { return getToken(ExprParser.VALUES, 0); }
		public TerminalNode ON() { return getToken(ExprParser.ON, 0); }
		public TerminalNode INNER() { return getToken(ExprParser.INNER, 0); }
		public TerminalNode JOIN() { return getToken(ExprParser.JOIN, 0); }
		public TerminalNode CADENACOMSEN() { return getToken(ExprParser.CADENACOMSEN, 0); }
		public TerminalNode GUION() { return getToken(ExprParser.GUION, 0); }
		public TerminalNode VAR() { return getToken(ExprParser.VAR, 0); }
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099511496702L) != 0)) ) {
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
		"\u0004\u0001(\n\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000"+
		"\u0000\u0002\u0000\u0002\u0000\u0001\u0002\u0000\u0001\u0010\u0012\'\u0007"+
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