package org.xmdl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalWDLLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=29;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=4;
    public static final int RULE_INT=6;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalWDLLexer() {;} 
    public InternalWDLLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:10:5: ( 'project' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:10:7: 'project'
            {
            match("project"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:11:5: ( '{' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:11:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:12:5: ( 'projectName' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:12:7: 'projectName'
            {
            match("projectName"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:13:5: ( ':' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:13:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:14:5: ( 'basePackage' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:14:7: 'basePackage'
            {
            match("basePackage"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:15:5: ( '}' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:15:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:16:5: ( 'type' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:16:7: 'type'
            {
            match("type"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:17:5: ( 'is' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:17:7: 'is'
            {
            match("is"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:18:5: ( '.' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:18:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:19:5: ( 'entity' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:19:7: 'entity'
            {
            match("entity"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:20:5: ( 'extends' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:20:7: 'extends'
            {
            match("extends"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:21:5: ( 'embed' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:21:7: 'embed'
            {
            match("embed"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:22:5: ( 'enum' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:22:7: 'enum'
            {
            match("enum"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:23:5: ( '(' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:23:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:24:5: ( ')' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:24:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:25:5: ( 'NONE' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:25:7: 'NONE'
            {
            match("NONE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:26:5: ( '*' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:26:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:27:5: ( '#' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:27:7: '#'
            {
            match('#'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:839:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:839:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:839:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:839:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:839:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:841:10: ( ( '0' .. '9' )+ )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:841:12: ( '0' .. '9' )+
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:841:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:841:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:843:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:843:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:843:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("843:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:843:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:843:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:843:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:843:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:843:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:843:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:843:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:843:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:845:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:845:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:845:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:845:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:847:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:847:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:847:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:847:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:847:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:847:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:847:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:847:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:849:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:849:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:849:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:851:16: ( . )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:851:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=25;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='p') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='r') ) {
                int LA12_23 = input.LA(3);

                if ( (LA12_23=='o') ) {
                    int LA12_45 = input.LA(4);

                    if ( (LA12_45=='j') ) {
                        int LA12_54 = input.LA(5);

                        if ( (LA12_54=='e') ) {
                            int LA12_62 = input.LA(6);

                            if ( (LA12_62=='c') ) {
                                int LA12_70 = input.LA(7);

                                if ( (LA12_70=='t') ) {
                                    switch ( input.LA(8) ) {
                                    case 'N':
                                        {
                                        int LA12_79 = input.LA(9);

                                        if ( (LA12_79=='a') ) {
                                            int LA12_83 = input.LA(10);

                                            if ( (LA12_83=='m') ) {
                                                int LA12_85 = input.LA(11);

                                                if ( (LA12_85=='e') ) {
                                                    int LA12_87 = input.LA(12);

                                                    if ( ((LA12_87>='0' && LA12_87<='9')||(LA12_87>='A' && LA12_87<='Z')||LA12_87=='_'||(LA12_87>='a' && LA12_87<='z')) ) {
                                                        alt12=19;
                                                    }
                                                    else {
                                                        alt12=3;}
                                                }
                                                else {
                                                    alt12=19;}
                                            }
                                            else {
                                                alt12=19;}
                                        }
                                        else {
                                            alt12=19;}
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
                                    case '_':
                                    case 'a':
                                    case 'b':
                                    case 'c':
                                    case 'd':
                                    case 'e':
                                    case 'f':
                                    case 'g':
                                    case 'h':
                                    case 'i':
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
                                        alt12=19;
                                        }
                                        break;
                                    default:
                                        alt12=1;}

                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
            }
            else {
                alt12=19;}
        }
        else if ( (LA12_0=='{') ) {
            alt12=2;
        }
        else if ( (LA12_0==':') ) {
            alt12=4;
        }
        else if ( (LA12_0=='b') ) {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='a') ) {
                int LA12_27 = input.LA(3);

                if ( (LA12_27=='s') ) {
                    int LA12_46 = input.LA(4);

                    if ( (LA12_46=='e') ) {
                        int LA12_55 = input.LA(5);

                        if ( (LA12_55=='P') ) {
                            int LA12_63 = input.LA(6);

                            if ( (LA12_63=='a') ) {
                                int LA12_71 = input.LA(7);

                                if ( (LA12_71=='c') ) {
                                    int LA12_76 = input.LA(8);

                                    if ( (LA12_76=='k') ) {
                                        int LA12_81 = input.LA(9);

                                        if ( (LA12_81=='a') ) {
                                            int LA12_84 = input.LA(10);

                                            if ( (LA12_84=='g') ) {
                                                int LA12_86 = input.LA(11);

                                                if ( (LA12_86=='e') ) {
                                                    int LA12_88 = input.LA(12);

                                                    if ( ((LA12_88>='0' && LA12_88<='9')||(LA12_88>='A' && LA12_88<='Z')||LA12_88=='_'||(LA12_88>='a' && LA12_88<='z')) ) {
                                                        alt12=19;
                                                    }
                                                    else {
                                                        alt12=5;}
                                                }
                                                else {
                                                    alt12=19;}
                                            }
                                            else {
                                                alt12=19;}
                                        }
                                        else {
                                            alt12=19;}
                                    }
                                    else {
                                        alt12=19;}
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
            }
            else {
                alt12=19;}
        }
        else if ( (LA12_0=='}') ) {
            alt12=6;
        }
        else if ( (LA12_0=='t') ) {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='y') ) {
                int LA12_29 = input.LA(3);

                if ( (LA12_29=='p') ) {
                    int LA12_47 = input.LA(4);

                    if ( (LA12_47=='e') ) {
                        int LA12_56 = input.LA(5);

                        if ( ((LA12_56>='0' && LA12_56<='9')||(LA12_56>='A' && LA12_56<='Z')||LA12_56=='_'||(LA12_56>='a' && LA12_56<='z')) ) {
                            alt12=19;
                        }
                        else {
                            alt12=7;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
            }
            else {
                alt12=19;}
        }
        else if ( (LA12_0=='i') ) {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='s') ) {
                int LA12_30 = input.LA(3);

                if ( ((LA12_30>='0' && LA12_30<='9')||(LA12_30>='A' && LA12_30<='Z')||LA12_30=='_'||(LA12_30>='a' && LA12_30<='z')) ) {
                    alt12=19;
                }
                else {
                    alt12=8;}
            }
            else {
                alt12=19;}
        }
        else if ( (LA12_0=='.') ) {
            alt12=9;
        }
        else if ( (LA12_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'x':
                {
                int LA12_32 = input.LA(3);

                if ( (LA12_32=='t') ) {
                    int LA12_49 = input.LA(4);

                    if ( (LA12_49=='e') ) {
                        int LA12_57 = input.LA(5);

                        if ( (LA12_57=='n') ) {
                            int LA12_65 = input.LA(6);

                            if ( (LA12_65=='d') ) {
                                int LA12_72 = input.LA(7);

                                if ( (LA12_72=='s') ) {
                                    int LA12_77 = input.LA(8);

                                    if ( ((LA12_77>='0' && LA12_77<='9')||(LA12_77>='A' && LA12_77<='Z')||LA12_77=='_'||(LA12_77>='a' && LA12_77<='z')) ) {
                                        alt12=19;
                                    }
                                    else {
                                        alt12=11;}
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
                }
                break;
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 'u':
                    {
                    int LA12_50 = input.LA(4);

                    if ( (LA12_50=='m') ) {
                        int LA12_58 = input.LA(5);

                        if ( ((LA12_58>='0' && LA12_58<='9')||(LA12_58>='A' && LA12_58<='Z')||LA12_58=='_'||(LA12_58>='a' && LA12_58<='z')) ) {
                            alt12=19;
                        }
                        else {
                            alt12=13;}
                    }
                    else {
                        alt12=19;}
                    }
                    break;
                case 't':
                    {
                    int LA12_51 = input.LA(4);

                    if ( (LA12_51=='i') ) {
                        int LA12_59 = input.LA(5);

                        if ( (LA12_59=='t') ) {
                            int LA12_67 = input.LA(6);

                            if ( (LA12_67=='y') ) {
                                int LA12_73 = input.LA(7);

                                if ( ((LA12_73>='0' && LA12_73<='9')||(LA12_73>='A' && LA12_73<='Z')||LA12_73=='_'||(LA12_73>='a' && LA12_73<='z')) ) {
                                    alt12=19;
                                }
                                else {
                                    alt12=10;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                    }
                    break;
                default:
                    alt12=19;}

                }
                break;
            case 'm':
                {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='b') ) {
                    int LA12_52 = input.LA(4);

                    if ( (LA12_52=='e') ) {
                        int LA12_60 = input.LA(5);

                        if ( (LA12_60=='d') ) {
                            int LA12_68 = input.LA(6);

                            if ( ((LA12_68>='0' && LA12_68<='9')||(LA12_68>='A' && LA12_68<='Z')||LA12_68=='_'||(LA12_68>='a' && LA12_68<='z')) ) {
                                alt12=19;
                            }
                            else {
                                alt12=12;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
                }
                break;
            default:
                alt12=19;}

        }
        else if ( (LA12_0=='(') ) {
            alt12=14;
        }
        else if ( (LA12_0==')') ) {
            alt12=15;
        }
        else if ( (LA12_0=='N') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='O') ) {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='N') ) {
                    int LA12_53 = input.LA(4);

                    if ( (LA12_53=='E') ) {
                        int LA12_61 = input.LA(5);

                        if ( ((LA12_61>='0' && LA12_61<='9')||(LA12_61>='A' && LA12_61<='Z')||LA12_61=='_'||(LA12_61>='a' && LA12_61<='z')) ) {
                            alt12=19;
                        }
                        else {
                            alt12=16;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
            }
            else {
                alt12=19;}
        }
        else if ( (LA12_0=='*') ) {
            alt12=17;
        }
        else if ( (LA12_0=='#') ) {
            alt12=18;
        }
        else if ( (LA12_0=='^') ) {
            int LA12_15 = input.LA(2);

            if ( ((LA12_15>='A' && LA12_15<='Z')||LA12_15=='_'||(LA12_15>='a' && LA12_15<='z')) ) {
                alt12=19;
            }
            else {
                alt12=25;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='M')||(LA12_0>='O' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='a'||(LA12_0>='c' && LA12_0<='d')||(LA12_0>='f' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='o')||(LA12_0>='q' && LA12_0<='s')||(LA12_0>='u' && LA12_0<='z')) ) {
            alt12=19;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=20;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_18 = input.LA(2);

            if ( ((LA12_18>='\u0000' && LA12_18<='\uFFFE')) ) {
                alt12=21;
            }
            else {
                alt12=25;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_19 = input.LA(2);

            if ( ((LA12_19>='\u0000' && LA12_19<='\uFFFE')) ) {
                alt12=21;
            }
            else {
                alt12=25;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=22;
                }
                break;
            case '/':
                {
                alt12=23;
                }
                break;
            default:
                alt12=25;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=24;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='$' && LA12_0<='&')||(LA12_0>='+' && LA12_0<='-')||(LA12_0>=';' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=25;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:82: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:90: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 21 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:99: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:111: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:127: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:143: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1:151: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}