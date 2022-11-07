// Generated from alexandremarcelo\alma\analisadorlexico\Expressoes.g4 by ANTLR 4.7.2
package alexandremarcelo.alma.analisadorlexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Expressoes extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRA_RESERVADA=1, NUMINT=2, NUMREAL=3, VARIAVEL=4, CADEIA=5, COMENTARIO=6, 
		WS=7, OP_RELELACIONAL=8, OP_ARITMETICO=9, DELIMITADOR=10, ABREPARENTESES=11, 
		FECHAPARENTESES=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_RESERVADA", "NUMINT", "NUMREAL", "VARIAVEL", "CADEIA", "ESC_SEQ", 
			"COMENTARIO", "WS", "OP_RELELACIONAL", "OP_ARITMETICO", "DELIMITADOR", 
			"ABREPARENTESES", "FECHAPARENTESES"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "':'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_RESERVADA", "NUMINT", "NUMREAL", "VARIAVEL", "CADEIA", 
			"COMENTARIO", "WS", "OP_RELELACIONAL", "OP_ARITMETICO", "DELIMITADOR", 
			"ABREPARENTESES", "FECHAPARENTESES"
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


	public Expressoes(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expressoes.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u00b5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2c\n\2\3\3\5\3f\n\3\3\3\6\3i\n\3\r\3"+
		"\16\3j\3\4\5\4n\n\4\3\4\6\4q\n\4\r\4\16\4r\3\4\3\4\6\4w\n\4\r\4\16\4x"+
		"\5\4{\n\4\3\5\3\5\7\5\177\n\5\f\5\16\5\u0082\13\5\3\6\3\6\3\6\7\6\u0087"+
		"\n\6\f\6\16\6\u008a\13\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u0095"+
		"\n\b\f\b\16\b\u0098\13\b\3\b\5\b\u009b\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ac\n\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\2\17\b\21\t\23\n\25\13\27\f"+
		"\31\r\33\16\3\2\t\4\2--//\4\2C\\c|\5\2\62;C\\c|\4\2))^^\4\2\f\f\17\17"+
		"\5\2\13\f\17\17\"\"\5\2,-//\61\61\2\u00d1\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3b\3\2\2\2\5e\3"+
		"\2\2\2\7m\3\2\2\2\t|\3\2\2\2\13\u0083\3\2\2\2\r\u008d\3\2\2\2\17\u0090"+
		"\3\2\2\2\21\u009f\3\2\2\2\23\u00ab\3\2\2\2\25\u00ad\3\2\2\2\27\u00af\3"+
		"\2\2\2\31\u00b1\3\2\2\2\33\u00b3\3\2\2\2\35\36\7E\2\2\36\37\7q\2\2\37"+
		" \7o\2\2 !\7g\2\2!\"\7e\2\2\"c\7q\2\2#$\7C\2\2$%\7n\2\2%&\7i\2\2&\'\7"+
		"q\2\2\'(\7t\2\2()\7k\2\2)*\7v\2\2*+\7o\2\2+c\7q\2\2,-\7K\2\2-.\7p\2\2"+
		"./\7v\2\2/\60\7g\2\2\60\61\7k\2\2\61\62\7t\2\2\62c\7q\2\2\63\64\7T\2\2"+
		"\64\65\7g\2\2\65\66\7c\2\2\66c\7n\2\2\678\7C\2\289\7v\2\29:\7t\2\2:;\7"+
		"k\2\2;<\7d\2\2<=\7w\2\2=>\7k\2\2>?\7e\2\2?@\7c\2\2@c\7q\2\2Ac\7C\2\2B"+
		"C\7N\2\2CD\7g\2\2Dc\7t\2\2EF\7R\2\2FG\7t\2\2GH\7k\2\2HI\7p\2\2Ic\7v\2"+
		"\2JK\7K\2\2Kc\7h\2\2LM\7V\2\2MN\7j\2\2NO\7g\2\2Oc\7p\2\2PQ\7Y\2\2QR\7"+
		"j\2\2RS\7k\2\2ST\7n\2\2Tc\7g\2\2UV\7U\2\2VW\7v\2\2WX\7c\2\2XY\7t\2\2Y"+
		"c\7v\2\2Z[\7G\2\2[\\\7p\2\2\\c\7f\2\2]^\7C\2\2^_\7p\2\2_c\7f\2\2`a\7Q"+
		"\2\2ac\7t\2\2b\35\3\2\2\2b#\3\2\2\2b,\3\2\2\2b\63\3\2\2\2b\67\3\2\2\2"+
		"bA\3\2\2\2bB\3\2\2\2bE\3\2\2\2bJ\3\2\2\2bL\3\2\2\2bP\3\2\2\2bU\3\2\2\2"+
		"bZ\3\2\2\2b]\3\2\2\2b`\3\2\2\2c\4\3\2\2\2df\t\2\2\2ed\3\2\2\2ef\3\2\2"+
		"\2fh\3\2\2\2gi\4\62;\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\6\3\2"+
		"\2\2ln\t\2\2\2ml\3\2\2\2mn\3\2\2\2np\3\2\2\2oq\4\62;\2po\3\2\2\2qr\3\2"+
		"\2\2rp\3\2\2\2rs\3\2\2\2sz\3\2\2\2tv\7\60\2\2uw\4\62;\2vu\3\2\2\2wx\3"+
		"\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zt\3\2\2\2z{\3\2\2\2{\b\3\2\2\2|\u0080"+
		"\t\3\2\2}\177\t\4\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\n\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0088\7)\2\2"+
		"\u0084\u0087\5\r\7\2\u0085\u0087\n\5\2\2\u0086\u0084\3\2\2\2\u0086\u0085"+
		"\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7)\2\2\u008c\f\3\2\2\2"+
		"\u008d\u008e\7^\2\2\u008e\u008f\7)\2\2\u008f\16\3\2\2\2\u0090\u0091\7"+
		"\61\2\2\u0091\u0092\7\61\2\2\u0092\u0096\3\2\2\2\u0093\u0095\n\6\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\7\17\2\2\u009a"+
		"\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\f"+
		"\2\2\u009d\u009e\b\b\2\2\u009e\20\3\2\2\2\u009f\u00a0\t\7\2\2\u00a0\u00a1"+
		"\b\t\3\2\u00a1\22\3\2\2\2\u00a2\u00ac\7@\2\2\u00a3\u00a4\7@\2\2\u00a4"+
		"\u00ac\7?\2\2\u00a5\u00ac\7>\2\2\u00a6\u00a7\7>\2\2\u00a7\u00ac\7?\2\2"+
		"\u00a8\u00a9\7>\2\2\u00a9\u00ac\7@\2\2\u00aa\u00ac\7?\2\2\u00ab\u00a2"+
		"\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ab"+
		"\u00a8\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\24\3\2\2\2\u00ad\u00ae\t\b\2"+
		"\2\u00ae\26\3\2\2\2\u00af\u00b0\7<\2\2\u00b0\30\3\2\2\2\u00b1\u00b2\7"+
		"*\2\2\u00b2\32\3\2\2\2\u00b3\u00b4\7+\2\2\u00b4\34\3\2\2\2\20\2bejmrx"+
		"z\u0080\u0086\u0088\u0096\u009a\u00ab\4\3\b\2\3\t\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}