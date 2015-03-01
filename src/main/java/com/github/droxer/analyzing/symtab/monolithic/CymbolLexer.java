// $ANTLR 3.5.2 /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g 2015-03-01 19:59:35
package com.github.droxer.analyzing.symtab.monolithic;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CymbolLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int ID=4;
	public static final int INT=5;
	public static final int LETTER=6;
	public static final int SL_COMMENT=7;
	public static final int WS=8;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CymbolLexer() {} 
	public CymbolLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CymbolLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g"; }

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:2:6: ( '(' )
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:2:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:3:7: ( ')' )
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:3:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:4:7: ( '+' )
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:4:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:5:7: ( ';' )
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:5:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:6:7: ( '=' )
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:6:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:7:7: ( 'float' )
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:7:9: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:8:7: ( 'int' )
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:8:9: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:38:5: ( LETTER ( LETTER | '0' .. '9' )* )
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:38:9: LETTER ( LETTER | '0' .. '9' )*
			{
			mLETTER(); 

			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:38:16: ( LETTER | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:43:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:45:5: ( ( '0' .. '9' )+ )
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:45:9: ( '0' .. '9' )+
			{
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:45:9: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:48:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:48:9: ( ' ' | '\\r' | '\\t' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "SL_COMMENT"
	public final void mSL_COMMENT() throws RecognitionException {
		try {
			int _type = SL_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:52:5: ( '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n' )
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:52:9: '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:52:14: (~ ( '\\r' | '\\n' ) )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:52:28: ( '\\r' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\r') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:52:28: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SL_COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | ID | INT | WS | SL_COMMENT )
		int alt5=11;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt5=1;
			}
			break;
		case ')':
			{
			alt5=2;
			}
			break;
		case '+':
			{
			alt5=3;
			}
			break;
		case ';':
			{
			alt5=4;
			}
			break;
		case '=':
			{
			alt5=5;
			}
			break;
		case 'f':
			{
			int LA5_6 = input.LA(2);
			if ( (LA5_6=='l') ) {
				int LA5_12 = input.LA(3);
				if ( (LA5_12=='o') ) {
					int LA5_14 = input.LA(4);
					if ( (LA5_14=='a') ) {
						int LA5_16 = input.LA(5);
						if ( (LA5_16=='t') ) {
							int LA5_18 = input.LA(6);
							if ( ((LA5_18 >= '0' && LA5_18 <= '9')||(LA5_18 >= 'A' && LA5_18 <= 'Z')||(LA5_18 >= 'a' && LA5_18 <= 'z')) ) {
								alt5=8;
							}

							else {
								alt5=6;
							}

						}

						else {
							alt5=8;
						}

					}

					else {
						alt5=8;
					}

				}

				else {
					alt5=8;
				}

			}

			else {
				alt5=8;
			}

			}
			break;
		case 'i':
			{
			int LA5_7 = input.LA(2);
			if ( (LA5_7=='n') ) {
				int LA5_13 = input.LA(3);
				if ( (LA5_13=='t') ) {
					int LA5_15 = input.LA(4);
					if ( ((LA5_15 >= '0' && LA5_15 <= '9')||(LA5_15 >= 'A' && LA5_15 <= 'Z')||(LA5_15 >= 'a' && LA5_15 <= 'z')) ) {
						alt5=8;
					}

					else {
						alt5=7;
					}

				}

				else {
					alt5=8;
				}

			}

			else {
				alt5=8;
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt5=8;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt5=9;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt5=10;
			}
			break;
		case '/':
			{
			alt5=11;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 5, 0, input);
			throw nvae;
		}
		switch (alt5) {
			case 1 :
				// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:1:10: T__9
				{
				mT__9(); 

				}
				break;
			case 2 :
				// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:1:15: T__10
				{
				mT__10(); 

				}
				break;
			case 3 :
				// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:1:21: T__11
				{
				mT__11(); 

				}
				break;
			case 4 :
				// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:1:27: T__12
				{
				mT__12(); 

				}
				break;
			case 5 :
				// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:1:33: T__13
				{
				mT__13(); 

				}
				break;
			case 6 :
				// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:1:39: T__14
				{
				mT__14(); 

				}
				break;
			case 7 :
				// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:1:45: T__15
				{
				mT__15(); 

				}
				break;
			case 8 :
				// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:1:51: ID
				{
				mID(); 

				}
				break;
			case 9 :
				// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:1:54: INT
				{
				mINT(); 

				}
				break;
			case 10 :
				// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:1:58: WS
				{
				mWS(); 

				}
				break;
			case 11 :
				// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:1:61: SL_COMMENT
				{
				mSL_COMMENT(); 

				}
				break;

		}
	}



}
