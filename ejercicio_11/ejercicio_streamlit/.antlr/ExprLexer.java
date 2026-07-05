// Generated from c:/Users/spide/OneDrive/Escritorio/Competencia_2_parte3/ejercicio_11/ejercicio_streamlit/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUBLIC=1, CLASS=2, STATIC=3, VOID=4, MAIN=5, INT=6, SYSTEM=7, DOT=8, OUT=9, 
		PRINTLN=10, CADENA=11, MAS=12, LA=13, LC=14, PA=15, PC=16, CA=17, CC=18, 
		ASIG=19, NUM=20, IDF=21, FIN=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PUBLIC", "CLASS", "STATIC", "VOID", "MAIN", "INT", "SYSTEM", "DOT", 
			"OUT", "PRINTLN", "CADENA", "MAS", "LA", "LC", "PA", "PC", "CA", "CC", 
			"ASIG", "NUM", "IDF", "FIN", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'class'", "'static'", "'void'", "'main'", "'int'", 
			"'System'", "'.'", "'out'", "'println'", null, "'+'", "'{'", "'}'", "'('", 
			"')'", "'['", "']'", "'='", null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUBLIC", "CLASS", "STATIC", "VOID", "MAIN", "INT", "SYSTEM", "DOT", 
			"OUT", "PRINTLN", "CADENA", "MAS", "LA", "LC", "PA", "PC", "CA", "CC", 
			"ASIG", "NUM", "IDF", "FIN", "WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0017\u0092\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0005\ni\b\n\n\n\f\nl\t\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013\u0081\b\u0013\u000b\u0013"+
		"\f\u0013\u0082\u0001\u0014\u0004\u0014\u0086\b\u0014\u000b\u0014\f\u0014"+
		"\u0087\u0001\u0015\u0001\u0015\u0001\u0016\u0004\u0016\u008d\b\u0016\u000b"+
		"\u0016\f\u0016\u008e\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001\u0000"+
		"\u0004\u0004\u0000\n\n\r\r\"\"\\\\\u0001\u000009\u0003\u000009AZaz\u0003"+
		"\u0000\t\n\r\r  \u0095\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000\u00036\u0001\u0000\u0000"+
		"\u0000\u0005<\u0001\u0000\u0000\u0000\u0007C\u0001\u0000\u0000\u0000\t"+
		"H\u0001\u0000\u0000\u0000\u000bM\u0001\u0000\u0000\u0000\rQ\u0001\u0000"+
		"\u0000\u0000\u000fX\u0001\u0000\u0000\u0000\u0011Z\u0001\u0000\u0000\u0000"+
		"\u0013^\u0001\u0000\u0000\u0000\u0015f\u0001\u0000\u0000\u0000\u0017o"+
		"\u0001\u0000\u0000\u0000\u0019q\u0001\u0000\u0000\u0000\u001bs\u0001\u0000"+
		"\u0000\u0000\u001du\u0001\u0000\u0000\u0000\u001fw\u0001\u0000\u0000\u0000"+
		"!y\u0001\u0000\u0000\u0000#{\u0001\u0000\u0000\u0000%}\u0001\u0000\u0000"+
		"\u0000\'\u0080\u0001\u0000\u0000\u0000)\u0085\u0001\u0000\u0000\u0000"+
		"+\u0089\u0001\u0000\u0000\u0000-\u008c\u0001\u0000\u0000\u0000/0\u0005"+
		"p\u0000\u000001\u0005u\u0000\u000012\u0005b\u0000\u000023\u0005l\u0000"+
		"\u000034\u0005i\u0000\u000045\u0005c\u0000\u00005\u0002\u0001\u0000\u0000"+
		"\u000067\u0005c\u0000\u000078\u0005l\u0000\u000089\u0005a\u0000\u0000"+
		"9:\u0005s\u0000\u0000:;\u0005s\u0000\u0000;\u0004\u0001\u0000\u0000\u0000"+
		"<=\u0005s\u0000\u0000=>\u0005t\u0000\u0000>?\u0005a\u0000\u0000?@\u0005"+
		"t\u0000\u0000@A\u0005i\u0000\u0000AB\u0005c\u0000\u0000B\u0006\u0001\u0000"+
		"\u0000\u0000CD\u0005v\u0000\u0000DE\u0005o\u0000\u0000EF\u0005i\u0000"+
		"\u0000FG\u0005d\u0000\u0000G\b\u0001\u0000\u0000\u0000HI\u0005m\u0000"+
		"\u0000IJ\u0005a\u0000\u0000JK\u0005i\u0000\u0000KL\u0005n\u0000\u0000"+
		"L\n\u0001\u0000\u0000\u0000MN\u0005i\u0000\u0000NO\u0005n\u0000\u0000"+
		"OP\u0005t\u0000\u0000P\f\u0001\u0000\u0000\u0000QR\u0005S\u0000\u0000"+
		"RS\u0005y\u0000\u0000ST\u0005s\u0000\u0000TU\u0005t\u0000\u0000UV\u0005"+
		"e\u0000\u0000VW\u0005m\u0000\u0000W\u000e\u0001\u0000\u0000\u0000XY\u0005"+
		".\u0000\u0000Y\u0010\u0001\u0000\u0000\u0000Z[\u0005o\u0000\u0000[\\\u0005"+
		"u\u0000\u0000\\]\u0005t\u0000\u0000]\u0012\u0001\u0000\u0000\u0000^_\u0005"+
		"p\u0000\u0000_`\u0005r\u0000\u0000`a\u0005i\u0000\u0000ab\u0005n\u0000"+
		"\u0000bc\u0005t\u0000\u0000cd\u0005l\u0000\u0000de\u0005n\u0000\u0000"+
		"e\u0014\u0001\u0000\u0000\u0000fj\u0005\"\u0000\u0000gi\b\u0000\u0000"+
		"\u0000hg\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000mn\u0005\"\u0000\u0000n\u0016\u0001\u0000\u0000\u0000"+
		"op\u0005+\u0000\u0000p\u0018\u0001\u0000\u0000\u0000qr\u0005{\u0000\u0000"+
		"r\u001a\u0001\u0000\u0000\u0000st\u0005}\u0000\u0000t\u001c\u0001\u0000"+
		"\u0000\u0000uv\u0005(\u0000\u0000v\u001e\u0001\u0000\u0000\u0000wx\u0005"+
		")\u0000\u0000x \u0001\u0000\u0000\u0000yz\u0005[\u0000\u0000z\"\u0001"+
		"\u0000\u0000\u0000{|\u0005]\u0000\u0000|$\u0001\u0000\u0000\u0000}~\u0005"+
		"=\u0000\u0000~&\u0001\u0000\u0000\u0000\u007f\u0081\u0007\u0001\u0000"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083(\u0001\u0000\u0000\u0000\u0084\u0086\u0007\u0002\u0000\u0000"+
		"\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u0088*\u0001\u0000\u0000\u0000\u0089\u008a\u0005;\u0000\u0000\u008a,"+
		"\u0001\u0000\u0000\u0000\u008b\u008d\u0007\u0003\u0000\u0000\u008c\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0006\u0016\u0000\u0000\u0091.\u0001"+
		"\u0000\u0000\u0000\u0005\u0000j\u0082\u0087\u008e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}