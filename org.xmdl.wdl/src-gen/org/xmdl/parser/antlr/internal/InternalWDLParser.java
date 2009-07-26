package org.xmdl.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.xmdl.services.WDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalWDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'type'", "'is'", "'.'", "'entity'", "'*'", "'enum'", "'{'", "'}'", "'('", "')'", "'embed'", "'extends'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalWDLParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g"; }


     
     	private WDLGrammarAccess grammarAccess;
     	
        public InternalWDLParser(TokenStream input, IAstFactory factory, WDLGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/xmdl/parser/antlr/internal/InternalWDL.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	} 



    // $ANTLR start entryRuleModel
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:72:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:72:47: (iv_ruleModel= ruleModel EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:73:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel73);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel83); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:80:1: ruleModel returns [EObject current=null] : (lv_types_0= ruleType )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_types_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:85:6: ( (lv_types_0= ruleType )* )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:86:1: (lv_types_0= ruleType )*
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:86:1: (lv_types_0= ruleType )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14||LA1_0==16||LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:89:6: lv_types_0= ruleType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleModel141);
            	    lv_types_0=ruleType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "types", lv_types_0, "Type", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleType
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:114:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:114:46: (iv_ruleType= ruleType EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:115:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType178);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType188); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:122:1: ruleType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity | this_Enum_2= ruleEnum | this_Embed_3= ruleEmbed ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_Entity_1 = null;

        EObject this_Enum_2 = null;

        EObject this_Embed_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:127:6: ( (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity | this_Enum_2= ruleEnum | this_Embed_3= ruleEmbed ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:128:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity | this_Enum_2= ruleEnum | this_Embed_3= ruleEmbed )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:128:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity | this_Enum_2= ruleEnum | this_Embed_3= ruleEmbed )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("128:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity | this_Enum_2= ruleEnum | this_Embed_3= ruleEmbed )", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:129:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_ruleType235);
                    this_SimpleType_0=ruleSimpleType();
                    _fsp--;

                     
                            current = this_SimpleType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:139:5: this_Entity_1= ruleEntity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType262);
                    this_Entity_1=ruleEntity();
                    _fsp--;

                     
                            current = this_Entity_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:149:5: this_Enum_2= ruleEnum
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEnumParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnum_in_ruleType289);
                    this_Enum_2=ruleEnum();
                    _fsp--;

                     
                            current = this_Enum_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:159:5: this_Embed_3= ruleEmbed
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEmbedParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEmbed_in_ruleType316);
                    this_Embed_3=ruleEmbed();
                    _fsp--;

                     
                            current = this_Embed_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleSimpleType
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:174:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:174:52: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:175:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType348);
            iv_ruleSimpleType=ruleSimpleType();
            _fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType358); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSimpleType


    // $ANTLR start ruleSimpleType
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:182:1: ruleSimpleType returns [EObject current=null] : ( 'type' (lv_name_1= RULE_ID ) ( 'is' (lv_mappedType_3= ruleJAVAID ) )? ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_mappedType_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:187:6: ( ( 'type' (lv_name_1= RULE_ID ) ( 'is' (lv_mappedType_3= ruleJAVAID ) )? ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:188:1: ( 'type' (lv_name_1= RULE_ID ) ( 'is' (lv_mappedType_3= ruleJAVAID ) )? )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:188:1: ( 'type' (lv_name_1= RULE_ID ) ( 'is' (lv_mappedType_3= ruleJAVAID ) )? )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:188:2: 'type' (lv_name_1= RULE_ID ) ( 'is' (lv_mappedType_3= ruleJAVAID ) )?
            {
            match(input,11,FOLLOW_11_in_ruleSimpleType392); 

                    createLeafNode(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:192:1: (lv_name_1= RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:194:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleType414); 

            		createLeafNode(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSimpleTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:212:2: ( 'is' (lv_mappedType_3= ruleJAVAID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:212:3: 'is' (lv_mappedType_3= ruleJAVAID )
                    {
                    match(input,12,FOLLOW_12_in_ruleSimpleType432); 

                            createLeafNode(grammarAccess.getSimpleTypeAccess().getIsKeyword_2_0(), null); 
                        
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:216:1: (lv_mappedType_3= ruleJAVAID )
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:219:6: lv_mappedType_3= ruleJAVAID
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSimpleTypeAccess().getMappedTypeJAVAIDParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleJAVAID_in_ruleSimpleType466);
                    lv_mappedType_3=ruleJAVAID();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSimpleTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "mappedType", lv_mappedType_3, "JAVAID", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSimpleType


    // $ANTLR start entryRuleJAVAID
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:244:1: entryRuleJAVAID returns [EObject current=null] : iv_ruleJAVAID= ruleJAVAID EOF ;
    public final EObject entryRuleJAVAID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJAVAID = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:244:48: (iv_ruleJAVAID= ruleJAVAID EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:245:2: iv_ruleJAVAID= ruleJAVAID EOF
            {
             currentNode = createCompositeNode(grammarAccess.getJAVAIDRule(), currentNode); 
            pushFollow(FOLLOW_ruleJAVAID_in_entryRuleJAVAID505);
            iv_ruleJAVAID=ruleJAVAID();
            _fsp--;

             current =iv_ruleJAVAID; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJAVAID515); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleJAVAID


    // $ANTLR start ruleJAVAID
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:252:1: ruleJAVAID returns [EObject current=null] : ( (lv_name_0= RULE_ID ) ( '.' RULE_ID )* ) ;
    public final EObject ruleJAVAID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:257:6: ( ( (lv_name_0= RULE_ID ) ( '.' RULE_ID )* ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:258:1: ( (lv_name_0= RULE_ID ) ( '.' RULE_ID )* )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:258:1: ( (lv_name_0= RULE_ID ) ( '.' RULE_ID )* )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:258:2: (lv_name_0= RULE_ID ) ( '.' RULE_ID )*
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:258:2: (lv_name_0= RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:260:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJAVAID562); 

            		createLeafNode(grammarAccess.getJAVAIDAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getJAVAIDRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:278:2: ( '.' RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:278:3: '.' RULE_ID
            	    {
            	    match(input,13,FOLLOW_13_in_ruleJAVAID580); 

            	            createLeafNode(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJAVAID589); 
            	     
            	        createLeafNode(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleJAVAID


    // $ANTLR start entryRuleEntity
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:293:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:293:48: (iv_ruleEntity= ruleEntity EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:294:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity623);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity633); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:301:1: ruleEntity returns [EObject current=null] : ( 'entity' this_EntityBody_1= ruleEntityBody ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_EntityBody_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:306:6: ( ( 'entity' this_EntityBody_1= ruleEntityBody ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:307:1: ( 'entity' this_EntityBody_1= ruleEntityBody )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:307:1: ( 'entity' this_EntityBody_1= ruleEntityBody )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:307:2: 'entity' this_EntityBody_1= ruleEntityBody
            {
            match(input,14,FOLLOW_14_in_ruleEntity667); 

                    createLeafNode(grammarAccess.getEntityAccess().getEntityKeyword_0(), null); 
                
             
                    currentNode=createCompositeNode(grammarAccess.getEntityAccess().getEntityBodyParserRuleCall_1(), currentNode); 
                
            pushFollow(FOLLOW_ruleEntityBody_in_ruleEntity689);
            this_EntityBody_1=ruleEntityBody();
            _fsp--;

             
                    current = this_EntityBody_1; 
                    currentNode = currentNode.getParent();
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleAttribute
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:327:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:327:51: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:328:2: iv_ruleAttribute= ruleAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute721);
            iv_ruleAttribute=ruleAttribute();
            _fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute731); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAttribute


    // $ANTLR start ruleAttribute
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:335:1: ruleAttribute returns [EObject current=null] : ( ( RULE_ID ) (lv_many_1= '*' )? (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_many_1=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:340:6: ( ( ( RULE_ID ) (lv_many_1= '*' )? (lv_name_2= RULE_ID ) ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:341:1: ( ( RULE_ID ) (lv_many_1= '*' )? (lv_name_2= RULE_ID ) )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:341:1: ( ( RULE_ID ) (lv_many_1= '*' )? (lv_name_2= RULE_ID ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:341:2: ( RULE_ID ) (lv_many_1= '*' )? (lv_name_2= RULE_ID )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:341:2: ( RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:344:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute778); 

            		createLeafNode(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0(), "type"); 
            	

            }

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:357:2: (lv_many_1= '*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:359:6: lv_many_1= '*'
                    {
                    lv_many_1=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_ruleAttribute802); 

                            createLeafNode(grammarAccess.getAttributeAccess().getManyAsteriskKeyword_1_0(), "many"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "many", true, "*", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:378:3: (lv_name_2= RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:380:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute838); 

            		createLeafNode(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAttribute


    // $ANTLR start entryRuleEnum
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:405:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:405:46: (iv_ruleEnum= ruleEnum EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:406:2: iv_ruleEnum= ruleEnum EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum879);
            iv_ruleEnum=ruleEnum();
            _fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum889); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnum


    // $ANTLR start ruleEnum
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:413:1: ruleEnum returns [EObject current=null] : ( 'enum' (lv_name_1= RULE_ID ) '{' (lv_literals_3= ruleEnumLiteral )* '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_literals_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:418:6: ( ( 'enum' (lv_name_1= RULE_ID ) '{' (lv_literals_3= ruleEnumLiteral )* '}' ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:419:1: ( 'enum' (lv_name_1= RULE_ID ) '{' (lv_literals_3= ruleEnumLiteral )* '}' )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:419:1: ( 'enum' (lv_name_1= RULE_ID ) '{' (lv_literals_3= ruleEnumLiteral )* '}' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:419:2: 'enum' (lv_name_1= RULE_ID ) '{' (lv_literals_3= ruleEnumLiteral )* '}'
            {
            match(input,16,FOLLOW_16_in_ruleEnum923); 

                    createLeafNode(grammarAccess.getEnumAccess().getEnumKeyword_0(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:423:1: (lv_name_1= RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:425:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum945); 

            		createLeafNode(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,17,FOLLOW_17_in_ruleEnum962); 

                    createLeafNode(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:447:1: (lv_literals_3= ruleEnumLiteral )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:450:6: lv_literals_3= ruleEnumLiteral
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEnumAccess().getLiteralsEnumLiteralParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumLiteral_in_ruleEnum996);
            	    lv_literals_3=ruleEnumLiteral();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEnumRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "literals", lv_literals_3, "EnumLiteral", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleEnum1010); 

                    createLeafNode(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnum


    // $ANTLR start entryRuleEnumLiteral
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:479:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:479:53: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:480:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral1043);
            iv_ruleEnumLiteral=ruleEnumLiteral();
            _fsp--;

             current =iv_ruleEnumLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLiteral1053); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnumLiteral


    // $ANTLR start ruleEnumLiteral
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:487:1: ruleEnumLiteral returns [EObject current=null] : ( (lv_name_0= RULE_ID ) '(' (lv_ordinal_2= RULE_INT ) ')' ) ;
    public final EObject ruleEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_ordinal_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:492:6: ( ( (lv_name_0= RULE_ID ) '(' (lv_ordinal_2= RULE_INT ) ')' ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:493:1: ( (lv_name_0= RULE_ID ) '(' (lv_ordinal_2= RULE_INT ) ')' )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:493:1: ( (lv_name_0= RULE_ID ) '(' (lv_ordinal_2= RULE_INT ) ')' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:493:2: (lv_name_0= RULE_ID ) '(' (lv_ordinal_2= RULE_INT ) ')'
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:493:2: (lv_name_0= RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:495:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumLiteral1100); 

            		createLeafNode(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,19,FOLLOW_19_in_ruleEnumLiteral1117); 

                    createLeafNode(grammarAccess.getEnumLiteralAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:517:1: (lv_ordinal_2= RULE_INT )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:519:6: lv_ordinal_2= RULE_INT
            {
            lv_ordinal_2=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumLiteral1139); 

            		createLeafNode(grammarAccess.getEnumLiteralAccess().getOrdinalINTTerminalRuleCall_2_0(), "ordinal"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "ordinal", lv_ordinal_2, "INT", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,20,FOLLOW_20_in_ruleEnumLiteral1156); 

                    createLeafNode(grammarAccess.getEnumLiteralAccess().getRightParenthesisKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumLiteral


    // $ANTLR start entryRuleEmbed
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:548:1: entryRuleEmbed returns [EObject current=null] : iv_ruleEmbed= ruleEmbed EOF ;
    public final EObject entryRuleEmbed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmbed = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:548:47: (iv_ruleEmbed= ruleEmbed EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:549:2: iv_ruleEmbed= ruleEmbed EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEmbedRule(), currentNode); 
            pushFollow(FOLLOW_ruleEmbed_in_entryRuleEmbed1189);
            iv_ruleEmbed=ruleEmbed();
            _fsp--;

             current =iv_ruleEmbed; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmbed1199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEmbed


    // $ANTLR start ruleEmbed
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:556:1: ruleEmbed returns [EObject current=null] : ( 'embed' this_EntityBody_1= ruleEntityBody ) ;
    public final EObject ruleEmbed() throws RecognitionException {
        EObject current = null;

        EObject this_EntityBody_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:561:6: ( ( 'embed' this_EntityBody_1= ruleEntityBody ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:562:1: ( 'embed' this_EntityBody_1= ruleEntityBody )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:562:1: ( 'embed' this_EntityBody_1= ruleEntityBody )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:562:2: 'embed' this_EntityBody_1= ruleEntityBody
            {
            match(input,21,FOLLOW_21_in_ruleEmbed1233); 

                    createLeafNode(grammarAccess.getEmbedAccess().getEmbedKeyword_0(), null); 
                
             
                    currentNode=createCompositeNode(grammarAccess.getEmbedAccess().getEntityBodyParserRuleCall_1(), currentNode); 
                
            pushFollow(FOLLOW_ruleEntityBody_in_ruleEmbed1255);
            this_EntityBody_1=ruleEntityBody();
            _fsp--;

             
                    current = this_EntityBody_1; 
                    currentNode = currentNode.getParent();
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEmbed


    // $ANTLR start entryRuleEntityBody
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:582:1: entryRuleEntityBody returns [EObject current=null] : iv_ruleEntityBody= ruleEntityBody EOF ;
    public final EObject entryRuleEntityBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityBody = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:582:52: (iv_ruleEntityBody= ruleEntityBody EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:583:2: iv_ruleEntityBody= ruleEntityBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityBodyRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntityBody_in_entryRuleEntityBody1287);
            iv_ruleEntityBody=ruleEntityBody();
            _fsp--;

             current =iv_ruleEntityBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityBody1297); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEntityBody


    // $ANTLR start ruleEntityBody
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:590:1: ruleEntityBody returns [EObject current=null] : ( (lv_name_0= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_4= ruleAttribute )* '}' ) ;
    public final EObject ruleEntityBody() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        EObject lv_attributes_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:595:6: ( ( (lv_name_0= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_4= ruleAttribute )* '}' ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:596:1: ( (lv_name_0= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_4= ruleAttribute )* '}' )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:596:1: ( (lv_name_0= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_4= ruleAttribute )* '}' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:596:2: (lv_name_0= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_4= ruleAttribute )* '}'
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:596:2: (lv_name_0= RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:598:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityBody1344); 

            		createLeafNode(grammarAccess.getEntityBodyAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEntityBodyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:616:2: ( 'extends' ( RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:616:3: 'extends' ( RULE_ID )
                    {
                    match(input,22,FOLLOW_22_in_ruleEntityBody1362); 

                            createLeafNode(grammarAccess.getEntityBodyAccess().getExtendsKeyword_1_0(), null); 
                        
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:620:1: ( RULE_ID )
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:623:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getEntityBodyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityBody1384); 

                    		createLeafNode(grammarAccess.getEntityBodyAccess().getSuperEntityEntityCrossReference_1_1_0(), "superEntity"); 
                    	

                    }


                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_ruleEntityBody1398); 

                    createLeafNode(grammarAccess.getEntityBodyAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:640:1: (lv_attributes_4= ruleAttribute )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:643:6: lv_attributes_4= ruleAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityBodyAccess().getAttributesAttributeParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntityBody1432);
            	    lv_attributes_4=ruleAttribute();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEntityBodyRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "attributes", lv_attributes_4, "Attribute", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleEntityBody1446); 

                    createLeafNode(grammarAccess.getEntityBodyAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEntityBody


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleModel141 = new BitSet(new long[]{0x0000000000214802L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleType235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleType289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbed_in_ruleType316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSimpleType392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleType414 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleSimpleType432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJAVAID_in_ruleSimpleType466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_entryRuleJAVAID505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJAVAID515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJAVAID562 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleJAVAID580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJAVAID589 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleEntity667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEntityBody_in_ruleEntity689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute778 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleAttribute802 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleEnum923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum945 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEnum962 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_ruleEnum996 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleEnum1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral1043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteral1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumLiteral1100 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEnumLiteral1117 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumLiteral1139 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEnumLiteral1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbed_in_entryRuleEmbed1189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmbed1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEmbed1233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEntityBody_in_ruleEmbed1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityBody_in_entryRuleEntityBody1287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityBody1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityBody1344 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_22_in_ruleEntityBody1362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityBody1384 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEntityBody1398 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntityBody1432 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleEntityBody1446 = new BitSet(new long[]{0x0000000000000002L});

}