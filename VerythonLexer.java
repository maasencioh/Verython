// Generated from Verython.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VerythonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, DEF=2, RETURN=3, IF=4, ELIF=5, ELSE=6, SWITCH=7, CASE=8, DEFAULT=9, 
		WHILE=10, FOR=11, IN=12, OR=13, AND=14, NOT=15, IS=16, NONE=17, TRUE=18, 
		FALSE=19, DEL=20, PASS=21, CONTINUE=22, BREAK=23, BLOCK=24, NEWLINE=25, 
		NAME=26, DECIMAL_INTEGER=27, OCT_INTEGER=28, HEX_INTEGER=29, BIN_INTEGER=30, 
		DOT=31, STAR=32, OPEN_PAREN=33, CLOSE_PAREN=34, COMMA=35, COLON=36, SEMI_COLON=37, 
		ASSIGN=38, OPEN_BRACK=39, CLOSE_BRACK=40, OR_OP=41, XOR=42, AND_OP=43, 
		LEFT_SHIFT=44, RIGHT_SHIFT=45, ADD=46, MINUS=47, DIV=48, MOD=49, NOT_OP=50, 
		OPEN_BRACE=51, CLOSE_BRACE=52, LESS_THAN=53, GREATER_THAN=54, EQUALS=55, 
		GT_EQ=56, LT_EQ=57, NOT_EQ_1=58, NOT_EQ_2=59, ADD_ASSIGN=60, SUB_ASSIGN=61, 
		MULT_ASSIGN=62, DIV_ASSIGN=63, MOD_ASSIGN=64, AND_ASSIGN=65, OR_ASSIGN=66, 
		XOR_ASSIGN=67, LEFT_SHIFT_ASSIGN=68, RIGHT_SHIFT_ASSIGN=69, TOP=70, INITAL=71, 
		ALWAYS=72, POSEDGE=73, NEGEDGE=74, SKIP_=75, UNKNOWN_CHAR=76;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "DEF", "RETURN", "IF", "ELIF", "ELSE", "SWITCH", "CASE", "DEFAULT", 
		"WHILE", "FOR", "IN", "OR", "AND", "NOT", "IS", "NONE", "TRUE", "FALSE", 
		"DEL", "PASS", "CONTINUE", "BREAK", "BLOCK", "NEWLINE", "NAME", "DECIMAL_INTEGER", 
		"OCT_INTEGER", "HEX_INTEGER", "BIN_INTEGER", "DOT", "STAR", "OPEN_PAREN", 
		"CLOSE_PAREN", "COMMA", "COLON", "SEMI_COLON", "ASSIGN", "OPEN_BRACK", 
		"CLOSE_BRACK", "OR_OP", "XOR", "AND_OP", "LEFT_SHIFT", "RIGHT_SHIFT", 
		"ADD", "MINUS", "DIV", "MOD", "NOT_OP", "OPEN_BRACE", "CLOSE_BRACE", "LESS_THAN", 
		"GREATER_THAN", "EQUALS", "GT_EQ", "LT_EQ", "NOT_EQ_1", "NOT_EQ_2", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", 
		"OR_ASSIGN", "XOR_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", 
		"TOP", "INITAL", "ALWAYS", "POSEDGE", "NEGEDGE", "SKIP_", "UNKNOWN_CHAR", 
		"NON_ZERO_DIGIT", "DIGIT", "OCT_DIGIT", "HEX_DIGIT", "BIN_DIGIT", "SPACES", 
		"COMMENT", "LINE_JOINING", "ID_START", "ID_CONTINUE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'...'", "'def'", "'return'", "'if'", "'elif'", "'else'", "'switch'", 
		"'case'", "'default'", "'while'", "'for'", "'in'", "'or'", "'and'", "'not'", 
		"'is'", "'None'", "'True'", "'False'", "'del'", "'pass'", "'continue'", 
		"'break'", "'block'", null, null, null, null, null, null, "'.'", "'*'", 
		"'('", "')'", "','", "':'", "';'", "'='", "'['", "']'", "'|'", "'^'", 
		"'&'", "'<<'", "'>>'", "'+'", "'-'", "'/'", "'%'", "'~'", "'{'", "'}'", 
		"'<'", "'>'", "'=='", "'>='", "'<='", "'<>'", "'!='", "'+='", "'-='", 
		"'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'@top'", 
		"'@initial'", "'@always'", "'.posedge'", "'.negedge'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "DEF", "RETURN", "IF", "ELIF", "ELSE", "SWITCH", "CASE", "DEFAULT", 
		"WHILE", "FOR", "IN", "OR", "AND", "NOT", "IS", "NONE", "TRUE", "FALSE", 
		"DEL", "PASS", "CONTINUE", "BREAK", "BLOCK", "NEWLINE", "NAME", "DECIMAL_INTEGER", 
		"OCT_INTEGER", "HEX_INTEGER", "BIN_INTEGER", "DOT", "STAR", "OPEN_PAREN", 
		"CLOSE_PAREN", "COMMA", "COLON", "SEMI_COLON", "ASSIGN", "OPEN_BRACK", 
		"CLOSE_BRACK", "OR_OP", "XOR", "AND_OP", "LEFT_SHIFT", "RIGHT_SHIFT", 
		"ADD", "MINUS", "DIV", "MOD", "NOT_OP", "OPEN_BRACE", "CLOSE_BRACE", "LESS_THAN", 
		"GREATER_THAN", "EQUALS", "GT_EQ", "LT_EQ", "NOT_EQ_1", "NOT_EQ_2", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", 
		"OR_ASSIGN", "XOR_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", 
		"TOP", "INITAL", "ALWAYS", "POSEDGE", "NEGEDGE", "SKIP_", "UNKNOWN_CHAR"
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


	  private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
	  private java.util.Stack<Integer> indents = new java.util.Stack<>();
	  private int opened = 0;
	  private Token lastToken = null;

	  @Override
	  public void emit(Token t) {
	    super.setToken(t);
	    tokens.offer(t);
	  }

	  @Override
	  public Token nextToken() {
	    if (_input.LA(1) == EOF && !this.indents.isEmpty()) {
	      for (int i = tokens.size() - 1; i >= 0; i--) {
	        if (tokens.get(i).getType() == EOF) {
	          tokens.remove(i);
	        }
	      }
	      this.emit(commonToken(VerythonParser.NEWLINE, "\n"));
	      while (!indents.isEmpty()) {
	        this.emit(createDedent());
	        indents.pop();
	      }
	      this.emit(commonToken(VerythonParser.EOF, "<EOF>"));
	    }
	    Token next = super.nextToken();
	    if (next.getChannel() == Token.DEFAULT_CHANNEL) {
	      this.lastToken = next;
	    }
	    return tokens.isEmpty() ? next : tokens.poll();
	  }

	  private Token createDedent() {
	    CommonToken dedent = commonToken(VerythonParser.DEDENT, "");
	    dedent.setLine(this.lastToken.getLine());
	    return dedent;
	  }

	  private CommonToken commonToken(int type, String text) {
	    int stop = this.getCharIndex() - 1;
	    int start = text.isEmpty() ? stop : stop - text.length() + 1;
	    return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
	  }

	  static int getIndentationCount(String spaces) {
	    int count = 0;
	    for (char ch : spaces.toCharArray()) {
	      switch (ch) {
	        case '\t':
	          count += 8 - (count % 8);
	          break;
	        default:
	          count++;
	      }
	    }
	    return count;
	  }

	  boolean atStartOfInput() {
	    return super.getCharPositionInLine() == 0 && super.getLine() == 1;
	  }


	public VerythonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Verython.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 24:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			OPEN_PAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
			CLOSE_PAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			OPEN_BRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			CLOSE_BRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 50:
			OPEN_BRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 51:
			CLOSE_BRACE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			     String newLine = getText().replaceAll("[^\r\n]+", "");
			     String spaces = getText().replaceAll("[\r\n]+", "");
			     int next = _input.LA(1);

			     if (opened > 0 || next == '\r' || next == '\n' || next == '#') {
			       // If we're inside a list or on a blank line, ignore all indents,
			       // dedents and line breaks.
			       skip();
			     }
			     else {
			       emit(commonToken(NEWLINE, newLine));

			       int indent = getIndentationCount(spaces);
			       int previous = indents.isEmpty() ? 0 : indents.peek();

			       if (indent == previous) {
			         // skip indents of the same size as the present indent-size
			         skip();
			       }
			       else if (indent > previous) {
			         indents.push(indent);
			         emit(commonToken(VerythonParser.INDENT, spaces));
			       }
			       else {
			         // Possibly emit more than 1 DEDENT token.
			         while(!indents.isEmpty() && indents.peek() > indent) {
			           this.emit(createDedent());
			           indents.pop();
			         }
			       }
			     }
			   
			break;
		}
	}
	private void OPEN_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			opened++;
			break;
		}
	}
	private void CLOSE_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			opened--;
			break;
		}
	}
	private void OPEN_BRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			opened++;
			break;
		}
	}
	private void CLOSE_BRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			opened--;
			break;
		}
	}
	private void OPEN_BRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			opened++;
			break;
		}
	}
	private void CLOSE_BRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			opened--;
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return NEWLINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean NEWLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return atStartOfInput();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2N\u0222\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\5\32\u012c\n\32\3\32\3\32\5\32\u0130\n\32\3\32"+
		"\5\32\u0133\n\32\5\32\u0135\n\32\3\32\3\32\3\33\3\33\7\33\u013b\n\33\f"+
		"\33\16\33\u013e\13\33\3\34\3\34\7\34\u0142\n\34\f\34\16\34\u0145\13\34"+
		"\3\34\6\34\u0148\n\34\r\34\16\34\u0149\5\34\u014c\n\34\3\35\3\35\3\35"+
		"\6\35\u0151\n\35\r\35\16\35\u0152\3\36\3\36\3\36\6\36\u0158\n\36\r\36"+
		"\16\36\u0159\3\37\3\37\3\37\6\37\u015f\n\37\r\37\16\37\u0160\3 \3 \3!"+
		"\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3"+
		"*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38"+
		"\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@"+
		"\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3E\3F\3F\3F\3F\3G\3G"+
		"\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J"+
		"\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\5L\u01f5\nL\3L"+
		"\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\6S\u0206\nS\rS\16S\u0207\3"+
		"T\3T\7T\u020c\nT\fT\16T\u020f\13T\3U\3U\5U\u0213\nU\3U\5U\u0216\nU\3U"+
		"\3U\5U\u021a\nU\3V\5V\u021d\nV\3W\3W\5W\u0221\nW\2\2X\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093"+
		"K\u0095L\u0097M\u0099N\u009b\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2"+
		"\u00a7\2\u00a9\2\u00ab\2\u00ad\2\3\2\16\4\2QQqq\4\2ZZzz\4\2DDdd\3\2\63"+
		";\3\2\62;\3\2\629\5\2\62;CHch\3\2\62\63\4\2\13\13\"\"\4\2\f\f\17\17\u0129"+
		"\2C\\aac|\u00ac\u00ac\u00b7\u00b7\u00bc\u00bc\u00c2\u00d8\u00da\u00f8"+
		"\u00fa\u0243\u0252\u02c3\u02c8\u02d3\u02e2\u02e6\u02f0\u02f0\u037c\u037c"+
		"\u0388\u0388\u038a\u038c\u038e\u038e\u0390\u03a3\u03a5\u03d0\u03d2\u03f7"+
		"\u03f9\u0483\u048c\u04d0\u04d2\u04fb\u0502\u0511\u0533\u0558\u055b\u055b"+
		"\u0563\u0589\u05d2\u05ec\u05f2\u05f4\u0623\u063c\u0642\u064c\u0670\u0671"+
		"\u0673\u06d5\u06d7\u06d7\u06e7\u06e8\u06f0\u06f1\u06fc\u06fe\u0701\u0701"+
		"\u0712\u0712\u0714\u0731\u074f\u076f\u0782\u07a7\u07b3\u07b3\u0906\u093b"+
		"\u093f\u093f\u0952\u0952\u095a\u0963\u097f\u097f\u0987\u098e\u0991\u0992"+
		"\u0995\u09aa\u09ac\u09b2\u09b4\u09b4\u09b8\u09bb\u09bf\u09bf\u09d0\u09d0"+
		"\u09de\u09df\u09e1\u09e3\u09f2\u09f3\u0a07\u0a0c\u0a11\u0a12\u0a15\u0a2a"+
		"\u0a2c\u0a32\u0a34\u0a35\u0a37\u0a38\u0a3a\u0a3b\u0a5b\u0a5e\u0a60\u0a60"+
		"\u0a74\u0a76\u0a87\u0a8f\u0a91\u0a93\u0a95\u0aaa\u0aac\u0ab2\u0ab4\u0ab5"+
		"\u0ab7\u0abb\u0abf\u0abf\u0ad2\u0ad2\u0ae2\u0ae3\u0b07\u0b0e\u0b11\u0b12"+
		"\u0b15\u0b2a\u0b2c\u0b32\u0b34\u0b35\u0b37\u0b3b\u0b3f\u0b3f\u0b5e\u0b5f"+
		"\u0b61\u0b63\u0b73\u0b73\u0b85\u0b85\u0b87\u0b8c\u0b90\u0b92\u0b94\u0b97"+
		"\u0b9b\u0b9c\u0b9e\u0b9e\u0ba0\u0ba1\u0ba5\u0ba6\u0baa\u0bac\u0bb0\u0bbb"+
		"\u0c07\u0c0e\u0c10\u0c12\u0c14\u0c2a\u0c2c\u0c35\u0c37\u0c3b\u0c62\u0c63"+
		"\u0c87\u0c8e\u0c90\u0c92\u0c94\u0caa\u0cac\u0cb5\u0cb7\u0cbb\u0cbf\u0cbf"+
		"\u0ce0\u0ce0\u0ce2\u0ce3\u0d07\u0d0e\u0d10\u0d12\u0d14\u0d2a\u0d2c\u0d3b"+
		"\u0d62\u0d63\u0d87\u0d98\u0d9c\u0db3\u0db5\u0dbd\u0dbf\u0dbf\u0dc2\u0dc8"+
		"\u0e03\u0e32\u0e34\u0e35\u0e42\u0e48\u0e83\u0e84\u0e86\u0e86\u0e89\u0e8a"+
		"\u0e8c\u0e8c\u0e8f\u0e8f\u0e96\u0e99\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7\u0ea7"+
		"\u0ea9\u0ea9\u0eac\u0ead\u0eaf\u0eb2\u0eb4\u0eb5\u0ebf\u0ebf\u0ec2\u0ec6"+
		"\u0ec8\u0ec8\u0ede\u0edf\u0f02\u0f02\u0f42\u0f49\u0f4b\u0f6c\u0f8a\u0f8d"+
		"\u1002\u1023\u1025\u1029\u102b\u102c\u1052\u1057\u10a2\u10c7\u10d2\u10fc"+
		"\u10fe\u10fe\u1102\u115b\u1161\u11a4\u11aa\u11fb\u1202\u124a\u124c\u124f"+
		"\u1252\u1258\u125a\u125a\u125c\u125f\u1262\u128a\u128c\u128f\u1292\u12b2"+
		"\u12b4\u12b7\u12ba\u12c0\u12c2\u12c2\u12c4\u12c7\u12ca\u12d8\u12da\u1312"+
		"\u1314\u1317\u131a\u135c\u1382\u1391\u13a2\u13f6\u1403\u166e\u1671\u1678"+
		"\u1683\u169c\u16a2\u16ec\u16f0\u16f2\u1702\u170e\u1710\u1713\u1722\u1733"+
		"\u1742\u1753\u1762\u176e\u1770\u1772\u1782\u17b5\u17d9\u17d9\u17de\u17de"+
		"\u1822\u1879\u1882\u18aa\u1902\u191e\u1952\u196f\u1972\u1976\u1982\u19ab"+
		"\u19c3\u19c9\u1a02\u1a18\u1d02\u1dc1\u1e02\u1e9d\u1ea2\u1efb\u1f02\u1f17"+
		"\u1f1a\u1f1f\u1f22\u1f47\u1f4a\u1f4f\u1f52\u1f59\u1f5b\u1f5b\u1f5d\u1f5d"+
		"\u1f5f\u1f5f\u1f61\u1f7f\u1f82\u1fb6\u1fb8\u1fbe\u1fc0\u1fc0\u1fc4\u1fc6"+
		"\u1fc8\u1fce\u1fd2\u1fd5\u1fd8\u1fdd\u1fe2\u1fee\u1ff4\u1ff6\u1ff8\u1ffe"+
		"\u2073\u2073\u2081\u2081\u2092\u2096\u2104\u2104\u2109\u2109\u210c\u2115"+
		"\u2117\u2117\u211a\u211f\u2126\u2126\u2128\u2128\u212a\u212a\u212c\u2133"+
		"\u2135\u213b\u213e\u2141\u2147\u214b\u2162\u2185\u2c02\u2c30\u2c32\u2c60"+
		"\u2c82\u2ce6\u2d02\u2d27\u2d32\u2d67\u2d71\u2d71\u2d82\u2d98\u2da2\u2da8"+
		"\u2daa\u2db0\u2db2\u2db8\u2dba\u2dc0\u2dc2\u2dc8\u2dca\u2dd0\u2dd2\u2dd8"+
		"\u2dda\u2de0\u3007\u3009\u3023\u302b\u3033\u3037\u303a\u303e\u3043\u3098"+
		"\u309d\u30a1\u30a3\u30fc\u30fe\u3101\u3107\u312e\u3133\u3190\u31a2\u31b9"+
		"\u31f2\u3201\u3402\u4db7\u4e02\u9fbd\ua002\ua48e\ua802\ua803\ua805\ua807"+
		"\ua809\ua80c\ua80e\ua824\uac02\ud7a5\uf902\ufa2f\ufa32\ufa6c\ufa72\ufadb"+
		"\ufb02\ufb08\ufb15\ufb19\ufb1f\ufb1f\ufb21\ufb2a\ufb2c\ufb38\ufb3a\ufb3e"+
		"\ufb40\ufb40\ufb42\ufb43\ufb45\ufb46\ufb48\ufbb3\ufbd5\ufd3f\ufd52\ufd91"+
		"\ufd94\ufdc9\ufdf2\ufdfd\ufe72\ufe76\ufe78\ufefe\uff23\uff3c\uff43\uff5c"+
		"\uff68\uffc0\uffc4\uffc9\uffcc\uffd1\uffd4\uffd9\uffdc\uffde\u0096\2\62"+
		";\u0302\u0371\u0485\u0488\u0593\u05bb\u05bd\u05bf\u05c1\u05c1\u05c3\u05c4"+
		"\u05c6\u05c7\u05c9\u05c9\u0612\u0617\u064d\u0660\u0662\u066b\u0672\u0672"+
		"\u06d8\u06de\u06e1\u06e6\u06e9\u06ea\u06ec\u06ef\u06f2\u06fb\u0713\u0713"+
		"\u0732\u074c\u07a8\u07b2\u0903\u0905\u093e\u093e\u0940\u094f\u0953\u0956"+
		"\u0964\u0965\u0968\u0971\u0983\u0985\u09be\u09be\u09c0\u09c6\u09c9\u09ca"+
		"\u09cd\u09cf\u09d9\u09d9\u09e4\u09e5\u09e8\u09f1\u0a03\u0a05\u0a3e\u0a3e"+
		"\u0a40\u0a44\u0a49\u0a4a\u0a4d\u0a4f\u0a68\u0a73\u0a83\u0a85\u0abe\u0abe"+
		"\u0ac0\u0ac7\u0ac9\u0acb\u0acd\u0acf\u0ae4\u0ae5\u0ae8\u0af1\u0b03\u0b05"+
		"\u0b3e\u0b3e\u0b40\u0b45\u0b49\u0b4a\u0b4d\u0b4f\u0b58\u0b59\u0b68\u0b71"+
		"\u0b84\u0b84\u0bc0\u0bc4\u0bc8\u0bca\u0bcc\u0bcf\u0bd9\u0bd9\u0be8\u0bf1"+
		"\u0c03\u0c05\u0c40\u0c46\u0c48\u0c4a\u0c4c\u0c4f\u0c57\u0c58\u0c68\u0c71"+
		"\u0c84\u0c85\u0cbe\u0cbe\u0cc0\u0cc6\u0cc8\u0cca\u0ccc\u0ccf\u0cd7\u0cd8"+
		"\u0ce8\u0cf1\u0d04\u0d05\u0d40\u0d45\u0d48\u0d4a\u0d4c\u0d4f\u0d59\u0d59"+
		"\u0d68\u0d71\u0d84\u0d85\u0dcc\u0dcc\u0dd1\u0dd6\u0dd8\u0dd8\u0dda\u0de1"+
		"\u0df4\u0df5\u0e33\u0e33\u0e36\u0e3c\u0e49\u0e50\u0e52\u0e5b\u0eb3\u0eb3"+
		"\u0eb6\u0ebb\u0ebd\u0ebe\u0eca\u0ecf\u0ed2\u0edb\u0f1a\u0f1b\u0f22\u0f2b"+
		"\u0f37\u0f37\u0f39\u0f39\u0f3b\u0f3b\u0f40\u0f41\u0f73\u0f86\u0f88\u0f89"+
		"\u0f92\u0f99\u0f9b\u0fbe\u0fc8\u0fc8\u102e\u1034\u1038\u103b\u1042\u104b"+
		"\u1058\u105b\u1361\u1361\u136b\u1373\u1714\u1716\u1734\u1736\u1754\u1755"+
		"\u1774\u1775\u17b8\u17d5\u17df\u17df\u17e2\u17eb\u180d\u180f\u1812\u181b"+
		"\u18ab\u18ab\u1922\u192d\u1932\u193d\u1948\u1951\u19b2\u19c2\u19ca\u19cb"+
		"\u19d2\u19db\u1a19\u1a1d\u1dc2\u1dc5\u2041\u2042\u2056\u2056\u20d2\u20de"+
		"\u20e3\u20e3\u20e7\u20ed\u302c\u3031\u309b\u309c\ua804\ua804\ua808\ua808"+
		"\ua80d\ua80d\ua825\ua829\ufb20\ufb20\ufe02\ufe11\ufe22\ufe25\ufe35\ufe36"+
		"\ufe4f\ufe51\uff12\uff1b\uff41\uff41\u022a\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s"+
		"\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\3\u00af\3\2\2\2\5\u00b3\3\2\2\2\7\u00b7\3\2\2\2\t\u00be\3\2\2\2\13"+
		"\u00c1\3\2\2\2\r\u00c6\3\2\2\2\17\u00cb\3\2\2\2\21\u00d2\3\2\2\2\23\u00d7"+
		"\3\2\2\2\25\u00df\3\2\2\2\27\u00e5\3\2\2\2\31\u00e9\3\2\2\2\33\u00ec\3"+
		"\2\2\2\35\u00ef\3\2\2\2\37\u00f3\3\2\2\2!\u00f7\3\2\2\2#\u00fa\3\2\2\2"+
		"%\u00ff\3\2\2\2\'\u0104\3\2\2\2)\u010a\3\2\2\2+\u010e\3\2\2\2-\u0113\3"+
		"\2\2\2/\u011c\3\2\2\2\61\u0122\3\2\2\2\63\u0134\3\2\2\2\65\u0138\3\2\2"+
		"\2\67\u014b\3\2\2\29\u014d\3\2\2\2;\u0154\3\2\2\2=\u015b\3\2\2\2?\u0162"+
		"\3\2\2\2A\u0164\3\2\2\2C\u0166\3\2\2\2E\u0169\3\2\2\2G\u016c\3\2\2\2I"+
		"\u016e\3\2\2\2K\u0170\3\2\2\2M\u0172\3\2\2\2O\u0174\3\2\2\2Q\u0177\3\2"+
		"\2\2S\u017a\3\2\2\2U\u017c\3\2\2\2W\u017e\3\2\2\2Y\u0180\3\2\2\2[\u0183"+
		"\3\2\2\2]\u0186\3\2\2\2_\u0188\3\2\2\2a\u018a\3\2\2\2c\u018c\3\2\2\2e"+
		"\u018e\3\2\2\2g\u0190\3\2\2\2i\u0193\3\2\2\2k\u0196\3\2\2\2m\u0198\3\2"+
		"\2\2o\u019a\3\2\2\2q\u019d\3\2\2\2s\u01a0\3\2\2\2u\u01a3\3\2\2\2w\u01a6"+
		"\3\2\2\2y\u01a9\3\2\2\2{\u01ac\3\2\2\2}\u01af\3\2\2\2\177\u01b2\3\2\2"+
		"\2\u0081\u01b5\3\2\2\2\u0083\u01b8\3\2\2\2\u0085\u01bb\3\2\2\2\u0087\u01be"+
		"\3\2\2\2\u0089\u01c1\3\2\2\2\u008b\u01c5\3\2\2\2\u008d\u01c9\3\2\2\2\u008f"+
		"\u01ce\3\2\2\2\u0091\u01d7\3\2\2\2\u0093\u01df\3\2\2\2\u0095\u01e8\3\2"+
		"\2\2\u0097\u01f4\3\2\2\2\u0099\u01f8\3\2\2\2\u009b\u01fa\3\2\2\2\u009d"+
		"\u01fc\3\2\2\2\u009f\u01fe\3\2\2\2\u00a1\u0200\3\2\2\2\u00a3\u0202\3\2"+
		"\2\2\u00a5\u0205\3\2\2\2\u00a7\u0209\3\2\2\2\u00a9\u0210\3\2\2\2\u00ab"+
		"\u021c\3\2\2\2\u00ad\u0220\3\2\2\2\u00af\u00b0\7\60\2\2\u00b0\u00b1\7"+
		"\60\2\2\u00b1\u00b2\7\60\2\2\u00b2\4\3\2\2\2\u00b3\u00b4\7f\2\2\u00b4"+
		"\u00b5\7g\2\2\u00b5\u00b6\7h\2\2\u00b6\6\3\2\2\2\u00b7\u00b8\7t\2\2\u00b8"+
		"\u00b9\7g\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc\7t\2\2"+
		"\u00bc\u00bd\7p\2\2\u00bd\b\3\2\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7h"+
		"\2\2\u00c0\n\3\2\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4"+
		"\7k\2\2\u00c4\u00c5\7h\2\2\u00c5\f\3\2\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8"+
		"\7n\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7g\2\2\u00ca\16\3\2\2\2\u00cb\u00cc"+
		"\7u\2\2\u00cc\u00cd\7y\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7v\2\2\u00cf"+
		"\u00d0\7e\2\2\u00d0\u00d1\7j\2\2\u00d1\20\3\2\2\2\u00d2\u00d3\7e\2\2\u00d3"+
		"\u00d4\7c\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7g\2\2\u00d6\22\3\2\2\2\u00d7"+
		"\u00d8\7f\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7h\2\2\u00da\u00db\7c\2\2"+
		"\u00db\u00dc\7w\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de\7v\2\2\u00de\24\3\2"+
		"\2\2\u00df\u00e0\7y\2\2\u00e0\u00e1\7j\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3"+
		"\7n\2\2\u00e3\u00e4\7g\2\2\u00e4\26\3\2\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7"+
		"\7q\2\2\u00e7\u00e8\7t\2\2\u00e8\30\3\2\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb"+
		"\7p\2\2\u00eb\32\3\2\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7t\2\2\u00ee\34"+
		"\3\2\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7f\2\2\u00f2"+
		"\36\3\2\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7v\2\2\u00f6"+
		" \3\2\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7u\2\2\u00f9\"\3\2\2\2\u00fa"+
		"\u00fb\7P\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7g\2\2"+
		"\u00fe$\3\2\2\2\u00ff\u0100\7V\2\2\u0100\u0101\7t\2\2\u0101\u0102\7w\2"+
		"\2\u0102\u0103\7g\2\2\u0103&\3\2\2\2\u0104\u0105\7H\2\2\u0105\u0106\7"+
		"c\2\2\u0106\u0107\7n\2\2\u0107\u0108\7u\2\2\u0108\u0109\7g\2\2\u0109("+
		"\3\2\2\2\u010a\u010b\7f\2\2\u010b\u010c\7g\2\2\u010c\u010d\7n\2\2\u010d"+
		"*\3\2\2\2\u010e\u010f\7r\2\2\u010f\u0110\7c\2\2\u0110\u0111\7u\2\2\u0111"+
		"\u0112\7u\2\2\u0112,\3\2\2\2\u0113\u0114\7e\2\2\u0114\u0115\7q\2\2\u0115"+
		"\u0116\7p\2\2\u0116\u0117\7v\2\2\u0117\u0118\7k\2\2\u0118\u0119\7p\2\2"+
		"\u0119\u011a\7w\2\2\u011a\u011b\7g\2\2\u011b.\3\2\2\2\u011c\u011d\7d\2"+
		"\2\u011d\u011e\7t\2\2\u011e\u011f\7g\2\2\u011f\u0120\7c\2\2\u0120\u0121"+
		"\7m\2\2\u0121\60\3\2\2\2\u0122\u0123\7d\2\2\u0123\u0124\7n\2\2\u0124\u0125"+
		"\7q\2\2\u0125\u0126\7e\2\2\u0126\u0127\7m\2\2\u0127\62\3\2\2\2\u0128\u0129"+
		"\6\32\2\2\u0129\u0135\5\u00a5S\2\u012a\u012c\7\17\2\2\u012b\u012a\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0130\7\f\2\2\u012e"+
		"\u0130\7\17\2\2\u012f\u012b\3\2\2\2\u012f\u012e\3\2\2\2\u0130\u0132\3"+
		"\2\2\2\u0131\u0133\5\u00a5S\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2"+
		"\u0133\u0135\3\2\2\2\u0134\u0128\3\2\2\2\u0134\u012f\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0137\b\32\2\2\u0137\64\3\2\2\2\u0138\u013c\5\u00abV\2"+
		"\u0139\u013b\5\u00adW\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\66\3\2\2\2\u013e\u013c\3\2\2"+
		"\2\u013f\u0143\5\u009bN\2\u0140\u0142\5\u009dO\2\u0141\u0140\3\2\2\2\u0142"+
		"\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u014c\3\2"+
		"\2\2\u0145\u0143\3\2\2\2\u0146\u0148\7\62\2\2\u0147\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2"+
		"\2\2\u014b\u013f\3\2\2\2\u014b\u0147\3\2\2\2\u014c8\3\2\2\2\u014d\u014e"+
		"\7\62\2\2\u014e\u0150\t\2\2\2\u014f\u0151\5\u009fP\2\u0150\u014f\3\2\2"+
		"\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153:"+
		"\3\2\2\2\u0154\u0155\7\62\2\2\u0155\u0157\t\3\2\2\u0156\u0158\5\u00a1"+
		"Q\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a<\3\2\2\2\u015b\u015c\7\62\2\2\u015c\u015e\t\4\2\2"+
		"\u015d\u015f\5\u00a3R\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161>\3\2\2\2\u0162\u0163\7\60\2\2"+
		"\u0163@\3\2\2\2\u0164\u0165\7,\2\2\u0165B\3\2\2\2\u0166\u0167\7*\2\2\u0167"+
		"\u0168\b\"\3\2\u0168D\3\2\2\2\u0169\u016a\7+\2\2\u016a\u016b\b#\4\2\u016b"+
		"F\3\2\2\2\u016c\u016d\7.\2\2\u016dH\3\2\2\2\u016e\u016f\7<\2\2\u016fJ"+
		"\3\2\2\2\u0170\u0171\7=\2\2\u0171L\3\2\2\2\u0172\u0173\7?\2\2\u0173N\3"+
		"\2\2\2\u0174\u0175\7]\2\2\u0175\u0176\b(\5\2\u0176P\3\2\2\2\u0177\u0178"+
		"\7_\2\2\u0178\u0179\b)\6\2\u0179R\3\2\2\2\u017a\u017b\7~\2\2\u017bT\3"+
		"\2\2\2\u017c\u017d\7`\2\2\u017dV\3\2\2\2\u017e\u017f\7(\2\2\u017fX\3\2"+
		"\2\2\u0180\u0181\7>\2\2\u0181\u0182\7>\2\2\u0182Z\3\2\2\2\u0183\u0184"+
		"\7@\2\2\u0184\u0185\7@\2\2\u0185\\\3\2\2\2\u0186\u0187\7-\2\2\u0187^\3"+
		"\2\2\2\u0188\u0189\7/\2\2\u0189`\3\2\2\2\u018a\u018b\7\61\2\2\u018bb\3"+
		"\2\2\2\u018c\u018d\7\'\2\2\u018dd\3\2\2\2\u018e\u018f\7\u0080\2\2\u018f"+
		"f\3\2\2\2\u0190\u0191\7}\2\2\u0191\u0192\b\64\7\2\u0192h\3\2\2\2\u0193"+
		"\u0194\7\177\2\2\u0194\u0195\b\65\b\2\u0195j\3\2\2\2\u0196\u0197\7>\2"+
		"\2\u0197l\3\2\2\2\u0198\u0199\7@\2\2\u0199n\3\2\2\2\u019a\u019b\7?\2\2"+
		"\u019b\u019c\7?\2\2\u019cp\3\2\2\2\u019d\u019e\7@\2\2\u019e\u019f\7?\2"+
		"\2\u019fr\3\2\2\2\u01a0\u01a1\7>\2\2\u01a1\u01a2\7?\2\2\u01a2t\3\2\2\2"+
		"\u01a3\u01a4\7>\2\2\u01a4\u01a5\7@\2\2\u01a5v\3\2\2\2\u01a6\u01a7\7#\2"+
		"\2\u01a7\u01a8\7?\2\2\u01a8x\3\2\2\2\u01a9\u01aa\7-\2\2\u01aa\u01ab\7"+
		"?\2\2\u01abz\3\2\2\2\u01ac\u01ad\7/\2\2\u01ad\u01ae\7?\2\2\u01ae|\3\2"+
		"\2\2\u01af\u01b0\7,\2\2\u01b0\u01b1\7?\2\2\u01b1~\3\2\2\2\u01b2\u01b3"+
		"\7\61\2\2\u01b3\u01b4\7?\2\2\u01b4\u0080\3\2\2\2\u01b5\u01b6\7\'\2\2\u01b6"+
		"\u01b7\7?\2\2\u01b7\u0082\3\2\2\2\u01b8\u01b9\7(\2\2\u01b9\u01ba\7?\2"+
		"\2\u01ba\u0084\3\2\2\2\u01bb\u01bc\7~\2\2\u01bc\u01bd\7?\2\2\u01bd\u0086"+
		"\3\2\2\2\u01be\u01bf\7`\2\2\u01bf\u01c0\7?\2\2\u01c0\u0088\3\2\2\2\u01c1"+
		"\u01c2\7>\2\2\u01c2\u01c3\7>\2\2\u01c3\u01c4\7?\2\2\u01c4\u008a\3\2\2"+
		"\2\u01c5\u01c6\7@\2\2\u01c6\u01c7\7@\2\2\u01c7\u01c8\7?\2\2\u01c8\u008c"+
		"\3\2\2\2\u01c9\u01ca\7B\2\2\u01ca\u01cb\7v\2\2\u01cb\u01cc\7q\2\2\u01cc"+
		"\u01cd\7r\2\2\u01cd\u008e\3\2\2\2\u01ce\u01cf\7B\2\2\u01cf\u01d0\7k\2"+
		"\2\u01d0\u01d1\7p\2\2\u01d1\u01d2\7k\2\2\u01d2\u01d3\7v\2\2\u01d3\u01d4"+
		"\7k\2\2\u01d4\u01d5\7c\2\2\u01d5\u01d6\7n\2\2\u01d6\u0090\3\2\2\2\u01d7"+
		"\u01d8\7B\2\2\u01d8\u01d9\7c\2\2\u01d9\u01da\7n\2\2\u01da\u01db\7y\2\2"+
		"\u01db\u01dc\7c\2\2\u01dc\u01dd\7{\2\2\u01dd\u01de\7u\2\2\u01de\u0092"+
		"\3\2\2\2\u01df\u01e0\7\60\2\2\u01e0\u01e1\7r\2\2\u01e1\u01e2\7q\2\2\u01e2"+
		"\u01e3\7u\2\2\u01e3\u01e4\7g\2\2\u01e4\u01e5\7f\2\2\u01e5\u01e6\7i\2\2"+
		"\u01e6\u01e7\7g\2\2\u01e7\u0094\3\2\2\2\u01e8\u01e9\7\60\2\2\u01e9\u01ea"+
		"\7p\2\2\u01ea\u01eb\7g\2\2\u01eb\u01ec\7i\2\2\u01ec\u01ed\7g\2\2\u01ed"+
		"\u01ee\7f\2\2\u01ee\u01ef\7i\2\2\u01ef\u01f0\7g\2\2\u01f0\u0096\3\2\2"+
		"\2\u01f1\u01f5\5\u00a5S\2\u01f2\u01f5\5\u00a7T\2\u01f3\u01f5\5\u00a9U"+
		"\2\u01f4\u01f1\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f6"+
		"\3\2\2\2\u01f6\u01f7\bL\t\2\u01f7\u0098\3\2\2\2\u01f8\u01f9\13\2\2\2\u01f9"+
		"\u009a\3\2\2\2\u01fa\u01fb\t\5\2\2\u01fb\u009c\3\2\2\2\u01fc\u01fd\t\6"+
		"\2\2\u01fd\u009e\3\2\2\2\u01fe\u01ff\t\7\2\2\u01ff\u00a0\3\2\2\2\u0200"+
		"\u0201\t\b\2\2\u0201\u00a2\3\2\2\2\u0202\u0203\t\t\2\2\u0203\u00a4\3\2"+
		"\2\2\u0204\u0206\t\n\2\2\u0205\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u00a6\3\2\2\2\u0209\u020d\7%"+
		"\2\2\u020a\u020c\n\13\2\2\u020b\u020a\3\2\2\2\u020c\u020f\3\2\2\2\u020d"+
		"\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u00a8\3\2\2\2\u020f\u020d\3\2"+
		"\2\2\u0210\u0212\7^\2\2\u0211\u0213\5\u00a5S\2\u0212\u0211\3\2\2\2\u0212"+
		"\u0213\3\2\2\2\u0213\u0219\3\2\2\2\u0214\u0216\7\17\2\2\u0215\u0214\3"+
		"\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u021a\7\f\2\2\u0218"+
		"\u021a\7\17\2\2\u0219\u0215\3\2\2\2\u0219\u0218\3\2\2\2\u021a\u00aa\3"+
		"\2\2\2\u021b\u021d\t\f\2\2\u021c\u021b\3\2\2\2\u021d\u00ac\3\2\2\2\u021e"+
		"\u0221\5\u00abV\2\u021f\u0221\t\r\2\2\u0220\u021e\3\2\2\2\u0220\u021f"+
		"\3\2\2\2\u0221\u00ae\3\2\2\2\26\2\u012b\u012f\u0132\u0134\u013c\u0143"+
		"\u0149\u014b\u0152\u0159\u0160\u01f4\u0207\u020d\u0212\u0215\u0219\u021c"+
		"\u0220\n\3\32\2\3\"\3\3#\4\3(\5\3)\6\3\64\7\3\65\b\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}