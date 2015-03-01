// $ANTLR 3.5.2 /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g 2015-03-01 19:59:35
package com.github.droxer.analyzing.symtab.monolithic;

import com.github.droxer.analyzing.symtab.monolithic.SymbolTable;
import com.github.droxer.analyzing.symtab.monolithic.VariableSymbol;
import org.antlr.runtime.*;

import java.lang.reflect.Type;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CymbolParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "LETTER", "SL_COMMENT", 
		"WS", "'('", "')'", "'+'", "';'", "'='", "'float'", "'int'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public CymbolParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CymbolParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return CymbolParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g"; }

	SymbolTable symtab;


	// $ANTLR start "compilationUnit"
	// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:3:1: compilationUnit[SymbolTable symtab] : ( varDeclaration )+ ;
	public final void compilationUnit(SymbolTable symtab) throws RecognitionException {
		this.symtab = symtab;
		try {
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:5:5: ( ( varDeclaration )+ )
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:5:7: ( varDeclaration )+
			{
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:5:7: ( varDeclaration )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 14 && LA1_0 <= 15)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:5:7: varDeclaration
					{
					pushFollow(FOLLOW_varDeclaration_in_compilationUnit24);
					varDeclaration();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "compilationUnit"


	public static class type_return extends ParserRuleReturnScope {
		public Type tsym;
	};


	// $ANTLR start "type"
	// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:8:1: type returns [Type tsym] : ( 'float' | 'int' );
	public final CymbolParser.type_return type() throws RecognitionException {
		CymbolParser.type_return retval = new CymbolParser.type_return();
		retval.start = input.LT(1);

		try {
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:12:5: ( 'float' | 'int' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==14) ) {
				alt2=1;
			}
			else if ( (LA2_0==15) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:12:7: 'float'
					{
					match(input,14,FOLLOW_14_in_type51); 
					retval.tsym = (Type)symtab.resolve("float");
					}
					break;
				case 2 :
					// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:13:7: 'int'
					{
					match(input,15,FOLLOW_15_in_type61); 
					retval.tsym = (Type)symtab.resolve("int");
					}
					break;

			}
			retval.stop = input.LT(-1);


			    System.out.println("line" + (retval.start).getLine()+": ref " + retval.tsym.getTypeName());

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"



	// $ANTLR start "varDeclaration"
	// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:16:1: varDeclaration : type ID ( '=' expression )? ';' ;
	public final void varDeclaration() throws RecognitionException {
		Token ID1=null;
		ParserRuleReturnScope type2 =null;

		try {
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:17:5: ( type ID ( '=' expression )? ';' )
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:17:7: type ID ( '=' expression )? ';'
			{
			pushFollow(FOLLOW_type_in_varDeclaration82);
			type2=type();
			state._fsp--;

			ID1=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration84); 
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:17:15: ( '=' expression )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==13) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:17:16: '=' expression
					{
					match(input,13,FOLLOW_13_in_varDeclaration87); 
					pushFollow(FOLLOW_expression_in_varDeclaration89);
					expression();
					state._fsp--;

					}
					break;

			}

			match(input,12,FOLLOW_12_in_varDeclaration93); 

			        System.out.println("line " + ID1.getLine()+ ": def " + (ID1!=null?ID1.getText():null));
			        VariableSymbol vs = new VariableSymbol((ID1!=null?ID1.getText():null), (type2!=null?((CymbolParser.type_return)type2).tsym:null));
			        symtab.define(vs);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varDeclaration"



	// $ANTLR start "expression"
	// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:25:1: expression : primary ( '+' primary )* ;
	public final void expression() throws RecognitionException {
		try {
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:26:5: ( primary ( '+' primary )* )
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:26:9: primary ( '+' primary )*
			{
			pushFollow(FOLLOW_primary_in_expression120);
			primary();
			state._fsp--;

			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:26:17: ( '+' primary )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==11) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:26:18: '+' primary
					{
					match(input,11,FOLLOW_11_in_expression123); 
					pushFollow(FOLLOW_primary_in_expression125);
					primary();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "primary"
	// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:29:1: primary : ( ID | INT | '(' expression ')' );
	public final void primary() throws RecognitionException {
		Token ID3=null;

		try {
			// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:30:5: ( ID | INT | '(' expression ')' )
			int alt5=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt5=1;
				}
				break;
			case INT:
				{
				alt5=2;
				}
				break;
			case 9:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:30:7: ID
					{
					ID3=(Token)match(input,ID,FOLLOW_ID_in_primary144); 

					        System.out.println("line " + ID3.getLine() + ": ref to " + symtab.resolve((ID3!=null?ID3.getText():null)));
					      
					}
					break;
				case 2 :
					// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:34:7: INT
					{
					match(input,INT,FOLLOW_INT_in_primary160); 
					}
					break;
				case 3 :
					// /Users/feihe/Workspace/lang-impl/src/main/java/com/github/droxer/analyzing/symtab/monolithic/Cymbol.g:35:7: '(' expression ')'
					{
					match(input,9,FOLLOW_9_in_primary168); 
					pushFollow(FOLLOW_expression_in_primary170);
					expression();
					state._fsp--;

					match(input,10,FOLLOW_10_in_primary172); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "primary"

	// Delegated rules



	public static final BitSet FOLLOW_varDeclaration_in_compilationUnit24 = new BitSet(new long[]{0x000000000000C002L});
	public static final BitSet FOLLOW_14_in_type51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_type61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_varDeclaration82 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_varDeclaration84 = new BitSet(new long[]{0x0000000000003000L});
	public static final BitSet FOLLOW_13_in_varDeclaration87 = new BitSet(new long[]{0x0000000000000230L});
	public static final BitSet FOLLOW_expression_in_varDeclaration89 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_varDeclaration93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_expression120 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_expression123 = new BitSet(new long[]{0x0000000000000230L});
	public static final BitSet FOLLOW_primary_in_expression125 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ID_in_primary144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_primary160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_primary168 = new BitSet(new long[]{0x0000000000000230L});
	public static final BitSet FOLLOW_expression_in_primary170 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_primary172 = new BitSet(new long[]{0x0000000000000002L});
}
