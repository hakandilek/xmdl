package org.xmdl.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'{'", "'projectName'", "':'", "'basePackage'", "'}'", "'type'", "'is'", "'.'", "'entity'", "'extends'", "'embed'", "'enum'", "'('", "')'", "'query'", "'<'", "','", "'>'", "'with'", "'-max'", "'-offset'", "'-order'", "'='", "'NONE'", "'*'", "'#'", "'+'", "'-'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:73:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:73:47: (iv_ruleModel= ruleModel EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:74:2: iv_ruleModel= ruleModel EOF
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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:81:1: ruleModel returns [EObject current=null] : ( (lv_project_0= ruleProject ) (lv_types_1= ruleType )* (lv_queries_2= ruleQuery )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_project_0 = null;

        EObject lv_types_1 = null;

        EObject lv_queries_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:86:6: ( ( (lv_project_0= ruleProject ) (lv_types_1= ruleType )* (lv_queries_2= ruleQuery )* ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:87:1: ( (lv_project_0= ruleProject ) (lv_types_1= ruleType )* (lv_queries_2= ruleQuery )* )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:87:1: ( (lv_project_0= ruleProject ) (lv_types_1= ruleType )* (lv_queries_2= ruleQuery )* )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:87:2: (lv_project_0= ruleProject ) (lv_types_1= ruleType )* (lv_queries_2= ruleQuery )*
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:87:2: (lv_project_0= ruleProject )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:90:6: lv_project_0= ruleProject
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getProjectProjectParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleProject_in_ruleModel142);
            lv_project_0=ruleProject();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "project", lv_project_0, "Project", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:108:2: (lv_types_1= ruleType )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17||LA1_0==20||(LA1_0>=22 && LA1_0<=23)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:111:6: lv_types_1= ruleType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleModel180);
            	    lv_types_1=ruleType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "types", lv_types_1, "Type", currentNode);
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

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:129:3: (lv_queries_2= ruleQuery )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==26) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:132:6: lv_queries_2= ruleQuery
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getQueriesQueryParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuery_in_ruleModel219);
            	    lv_queries_2=ruleQuery();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "queries", lv_queries_2, "Query", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleProject
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:157:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:157:49: (iv_ruleProject= ruleProject EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:158:2: iv_ruleProject= ruleProject EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProjectRule(), currentNode); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject257);
            iv_ruleProject=ruleProject();
            _fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject267); 

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
    // $ANTLR end entryRuleProject


    // $ANTLR start ruleProject
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:165:1: ruleProject returns [EObject current=null] : ( 'project' '{' 'projectName' ':' (lv_name_4= RULE_STRING ) 'basePackage' ':' (lv_basePackage_7= RULE_STRING ) '}' ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token lv_name_4=null;
        Token lv_basePackage_7=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:170:6: ( ( 'project' '{' 'projectName' ':' (lv_name_4= RULE_STRING ) 'basePackage' ':' (lv_basePackage_7= RULE_STRING ) '}' ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:171:1: ( 'project' '{' 'projectName' ':' (lv_name_4= RULE_STRING ) 'basePackage' ':' (lv_basePackage_7= RULE_STRING ) '}' )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:171:1: ( 'project' '{' 'projectName' ':' (lv_name_4= RULE_STRING ) 'basePackage' ':' (lv_basePackage_7= RULE_STRING ) '}' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:171:2: 'project' '{' 'projectName' ':' (lv_name_4= RULE_STRING ) 'basePackage' ':' (lv_basePackage_7= RULE_STRING ) '}'
            {
            match(input,11,FOLLOW_11_in_ruleProject301); 

                    createLeafNode(grammarAccess.getProjectAccess().getProjectKeyword_0(), null); 
                
            match(input,12,FOLLOW_12_in_ruleProject310); 

                    createLeafNode(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            match(input,13,FOLLOW_13_in_ruleProject319); 

                    createLeafNode(grammarAccess.getProjectAccess().getProjectNameKeyword_2(), null); 
                
            match(input,14,FOLLOW_14_in_ruleProject328); 

                    createLeafNode(grammarAccess.getProjectAccess().getColonKeyword_3(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:187:1: (lv_name_4= RULE_STRING )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:189:6: lv_name_4= RULE_STRING
            {
            lv_name_4=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProject350); 

            		createLeafNode(grammarAccess.getProjectAccess().getNameSTRINGTerminalRuleCall_4_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProjectRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_4, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,15,FOLLOW_15_in_ruleProject367); 

                    createLeafNode(grammarAccess.getProjectAccess().getBasePackageKeyword_5(), null); 
                
            match(input,14,FOLLOW_14_in_ruleProject376); 

                    createLeafNode(grammarAccess.getProjectAccess().getColonKeyword_6(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:215:1: (lv_basePackage_7= RULE_STRING )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:217:6: lv_basePackage_7= RULE_STRING
            {
            lv_basePackage_7=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProject398); 

            		createLeafNode(grammarAccess.getProjectAccess().getBasePackageSTRINGTerminalRuleCall_7_0(), "basePackage"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProjectRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "basePackage", lv_basePackage_7, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,16,FOLLOW_16_in_ruleProject415); 

                    createLeafNode(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_8(), null); 
                

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
    // $ANTLR end ruleProject


    // $ANTLR start entryRuleType
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:246:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:246:46: (iv_ruleType= ruleType EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:247:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType448);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType458); 

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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:254:1: ruleType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity | this_Enumeration_2= ruleEnumeration | this_Embed_3= ruleEmbed ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_Entity_1 = null;

        EObject this_Enumeration_2 = null;

        EObject this_Embed_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:259:6: ( (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity | this_Enumeration_2= ruleEnumeration | this_Embed_3= ruleEmbed ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:260:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity | this_Enumeration_2= ruleEnumeration | this_Embed_3= ruleEmbed )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:260:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity | this_Enumeration_2= ruleEnumeration | this_Embed_3= ruleEmbed )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 23:
                {
                alt3=3;
                }
                break;
            case 22:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("260:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity | this_Enumeration_2= ruleEnumeration | this_Embed_3= ruleEmbed )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:261:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_ruleType505);
                    this_SimpleType_0=ruleSimpleType();
                    _fsp--;

                     
                            current = this_SimpleType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:271:5: this_Entity_1= ruleEntity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType532);
                    this_Entity_1=ruleEntity();
                    _fsp--;

                     
                            current = this_Entity_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:281:5: this_Enumeration_2= ruleEnumeration
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumeration_in_ruleType559);
                    this_Enumeration_2=ruleEnumeration();
                    _fsp--;

                     
                            current = this_Enumeration_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:291:5: this_Embed_3= ruleEmbed
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEmbedParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEmbed_in_ruleType586);
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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:306:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:306:52: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:307:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType618);
            iv_ruleSimpleType=ruleSimpleType();
            _fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType628); 

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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:314:1: ruleSimpleType returns [EObject current=null] : ( 'type' (lv_name_1= RULE_ID ) ( 'is' (lv_mappedType_3= ruleJAVAID ) )? ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_mappedType_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:319:6: ( ( 'type' (lv_name_1= RULE_ID ) ( 'is' (lv_mappedType_3= ruleJAVAID ) )? ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:320:1: ( 'type' (lv_name_1= RULE_ID ) ( 'is' (lv_mappedType_3= ruleJAVAID ) )? )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:320:1: ( 'type' (lv_name_1= RULE_ID ) ( 'is' (lv_mappedType_3= ruleJAVAID ) )? )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:320:2: 'type' (lv_name_1= RULE_ID ) ( 'is' (lv_mappedType_3= ruleJAVAID ) )?
            {
            match(input,17,FOLLOW_17_in_ruleSimpleType662); 

                    createLeafNode(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:324:1: (lv_name_1= RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:326:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleType684); 

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

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:344:2: ( 'is' (lv_mappedType_3= ruleJAVAID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:344:3: 'is' (lv_mappedType_3= ruleJAVAID )
                    {
                    match(input,18,FOLLOW_18_in_ruleSimpleType702); 

                            createLeafNode(grammarAccess.getSimpleTypeAccess().getIsKeyword_2_0(), null); 
                        
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:348:1: (lv_mappedType_3= ruleJAVAID )
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:351:6: lv_mappedType_3= ruleJAVAID
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSimpleTypeAccess().getMappedTypeJAVAIDParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleJAVAID_in_ruleSimpleType736);
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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:376:1: entryRuleJAVAID returns [EObject current=null] : iv_ruleJAVAID= ruleJAVAID EOF ;
    public final EObject entryRuleJAVAID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJAVAID = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:376:48: (iv_ruleJAVAID= ruleJAVAID EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:377:2: iv_ruleJAVAID= ruleJAVAID EOF
            {
             currentNode = createCompositeNode(grammarAccess.getJAVAIDRule(), currentNode); 
            pushFollow(FOLLOW_ruleJAVAID_in_entryRuleJAVAID775);
            iv_ruleJAVAID=ruleJAVAID();
            _fsp--;

             current =iv_ruleJAVAID; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJAVAID785); 

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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:384:1: ruleJAVAID returns [EObject current=null] : ( (lv_name_0= RULE_ID ) ( '.' RULE_ID )* ) ;
    public final EObject ruleJAVAID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:389:6: ( ( (lv_name_0= RULE_ID ) ( '.' RULE_ID )* ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:390:1: ( (lv_name_0= RULE_ID ) ( '.' RULE_ID )* )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:390:1: ( (lv_name_0= RULE_ID ) ( '.' RULE_ID )* )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:390:2: (lv_name_0= RULE_ID ) ( '.' RULE_ID )*
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:390:2: (lv_name_0= RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:392:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJAVAID832); 

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

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:410:2: ( '.' RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:410:3: '.' RULE_ID
            	    {
            	    match(input,19,FOLLOW_19_in_ruleJAVAID850); 

            	            createLeafNode(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJAVAID859); 
            	     
            	        createLeafNode(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:425:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:425:48: (iv_ruleEntity= ruleEntity EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:426:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity893);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity903); 

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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:433:1: ruleEntity returns [EObject current=null] : ( 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_attributes_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:438:6: ( ( 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}' ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:439:1: ( 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}' )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:439:1: ( 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:439:2: 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}'
            {
            match(input,20,FOLLOW_20_in_ruleEntity937); 

                    createLeafNode(grammarAccess.getEntityAccess().getEntityKeyword_0(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:443:1: (lv_name_1= RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:445:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity959); 

            		createLeafNode(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:463:2: ( 'extends' ( RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:463:3: 'extends' ( RULE_ID )
                    {
                    match(input,21,FOLLOW_21_in_ruleEntity977); 

                            createLeafNode(grammarAccess.getEntityAccess().getExtendsKeyword_2_0(), null); 
                        
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:467:1: ( RULE_ID )
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:470:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity999); 

                    		createLeafNode(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_2_1_0(), "superEntity"); 
                    	

                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleEntity1013); 

                    createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:487:1: (lv_attributes_5= ruleAttribute )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:490:6: lv_attributes_5= ruleAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity1047);
            	    lv_attributes_5=ruleAttribute();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "attributes", lv_attributes_5, "Attribute", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleEntity1061); 

                    createLeafNode(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5(), null); 
                

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


    // $ANTLR start entryRuleEmbed
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:519:1: entryRuleEmbed returns [EObject current=null] : iv_ruleEmbed= ruleEmbed EOF ;
    public final EObject entryRuleEmbed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmbed = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:519:47: (iv_ruleEmbed= ruleEmbed EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:520:2: iv_ruleEmbed= ruleEmbed EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEmbedRule(), currentNode); 
            pushFollow(FOLLOW_ruleEmbed_in_entryRuleEmbed1094);
            iv_ruleEmbed=ruleEmbed();
            _fsp--;

             current =iv_ruleEmbed; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmbed1104); 

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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:527:1: ruleEmbed returns [EObject current=null] : ( 'embed' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}' ) ;
    public final EObject ruleEmbed() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_attributes_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:532:6: ( ( 'embed' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}' ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:533:1: ( 'embed' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}' )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:533:1: ( 'embed' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:533:2: 'embed' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}'
            {
            match(input,22,FOLLOW_22_in_ruleEmbed1138); 

                    createLeafNode(grammarAccess.getEmbedAccess().getEmbedKeyword_0(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:537:1: (lv_name_1= RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:539:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmbed1160); 

            		createLeafNode(grammarAccess.getEmbedAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEmbedRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:557:2: ( 'extends' ( RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:557:3: 'extends' ( RULE_ID )
                    {
                    match(input,21,FOLLOW_21_in_ruleEmbed1178); 

                            createLeafNode(grammarAccess.getEmbedAccess().getExtendsKeyword_2_0(), null); 
                        
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:561:1: ( RULE_ID )
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:564:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getEmbedRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmbed1200); 

                    		createLeafNode(grammarAccess.getEmbedAccess().getSuperEntityEntityCrossReference_2_1_0(), "superEntity"); 
                    	

                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleEmbed1214); 

                    createLeafNode(grammarAccess.getEmbedAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:581:1: (lv_attributes_5= ruleAttribute )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:584:6: lv_attributes_5= ruleAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEmbedAccess().getAttributesAttributeParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEmbed1248);
            	    lv_attributes_5=ruleAttribute();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEmbedRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "attributes", lv_attributes_5, "Attribute", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleEmbed1262); 

                    createLeafNode(grammarAccess.getEmbedAccess().getRightCurlyBracketKeyword_5(), null); 
                

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


    // $ANTLR start entryRuleAttribute
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:613:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:613:51: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:614:2: iv_ruleAttribute= ruleAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1295);
            iv_ruleAttribute=ruleAttribute();
            _fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1305); 

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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:621:1: ruleAttribute returns [EObject current=null] : ( ( RULE_ID ) (lv_manyReference_1= ruleAttributeManyReference )? (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;
        Enumerator lv_manyReference_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:626:6: ( ( ( RULE_ID ) (lv_manyReference_1= ruleAttributeManyReference )? (lv_name_2= RULE_ID ) ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:627:1: ( ( RULE_ID ) (lv_manyReference_1= ruleAttributeManyReference )? (lv_name_2= RULE_ID ) )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:627:1: ( ( RULE_ID ) (lv_manyReference_1= ruleAttributeManyReference )? (lv_name_2= RULE_ID ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:627:2: ( RULE_ID ) (lv_manyReference_1= ruleAttributeManyReference )? (lv_name_2= RULE_ID )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:627:2: ( RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:630:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1352); 

            		createLeafNode(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0(), "type"); 
            	

            }

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:643:2: (lv_manyReference_1= ruleAttributeManyReference )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=35 && LA10_0<=37)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:646:6: lv_manyReference_1= ruleAttributeManyReference
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getManyReferenceAttributeManyReferenceEnumRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeManyReference_in_ruleAttribute1389);
                    lv_manyReference_1=ruleAttributeManyReference();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "manyReference", lv_manyReference_1, "AttributeManyReference", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:664:3: (lv_name_2= RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:666:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1416); 

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


    // $ANTLR start entryRuleEnumeration
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:691:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:691:53: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:692:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration1457);
            iv_ruleEnumeration=ruleEnumeration();
            _fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration1467); 

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
    // $ANTLR end entryRuleEnumeration


    // $ANTLR start ruleEnumeration
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:699:1: ruleEnumeration returns [EObject current=null] : ( 'enum' (lv_name_1= RULE_ID ) '{' (lv_literals_3= ruleEnumerationLiteral )* '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_literals_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:704:6: ( ( 'enum' (lv_name_1= RULE_ID ) '{' (lv_literals_3= ruleEnumerationLiteral )* '}' ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:705:1: ( 'enum' (lv_name_1= RULE_ID ) '{' (lv_literals_3= ruleEnumerationLiteral )* '}' )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:705:1: ( 'enum' (lv_name_1= RULE_ID ) '{' (lv_literals_3= ruleEnumerationLiteral )* '}' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:705:2: 'enum' (lv_name_1= RULE_ID ) '{' (lv_literals_3= ruleEnumerationLiteral )* '}'
            {
            match(input,23,FOLLOW_23_in_ruleEnumeration1501); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getEnumKeyword_0(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:709:1: (lv_name_1= RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:711:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration1523); 

            		createLeafNode(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,12,FOLLOW_12_in_ruleEnumeration1540); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:733:1: (lv_literals_3= ruleEnumerationLiteral )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:736:6: lv_literals_3= ruleEnumerationLiteral
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration1574);
            	    lv_literals_3=ruleEnumerationLiteral();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEnumerationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "literals", lv_literals_3, "EnumerationLiteral", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleEnumeration1588); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4(), null); 
                

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
    // $ANTLR end ruleEnumeration


    // $ANTLR start entryRuleEnumerationLiteral
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:765:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:765:60: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:766:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral1621);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();
            _fsp--;

             current =iv_ruleEnumerationLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral1631); 

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
    // $ANTLR end entryRuleEnumerationLiteral


    // $ANTLR start ruleEnumerationLiteral
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:773:1: ruleEnumerationLiteral returns [EObject current=null] : ( (lv_name_0= RULE_ID ) '(' (lv_ordinal_2= RULE_INT ) ')' ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_ordinal_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:778:6: ( ( (lv_name_0= RULE_ID ) '(' (lv_ordinal_2= RULE_INT ) ')' ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:779:1: ( (lv_name_0= RULE_ID ) '(' (lv_ordinal_2= RULE_INT ) ')' )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:779:1: ( (lv_name_0= RULE_ID ) '(' (lv_ordinal_2= RULE_INT ) ')' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:779:2: (lv_name_0= RULE_ID ) '(' (lv_ordinal_2= RULE_INT ) ')'
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:779:2: (lv_name_0= RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:781:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationLiteral1678); 

            		createLeafNode(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,24,FOLLOW_24_in_ruleEnumerationLiteral1695); 

                    createLeafNode(grammarAccess.getEnumerationLiteralAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:803:1: (lv_ordinal_2= RULE_INT )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:805:6: lv_ordinal_2= RULE_INT
            {
            lv_ordinal_2=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumerationLiteral1717); 

            		createLeafNode(grammarAccess.getEnumerationLiteralAccess().getOrdinalINTTerminalRuleCall_2_0(), "ordinal"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "ordinal", lv_ordinal_2, "INT", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,25,FOLLOW_25_in_ruleEnumerationLiteral1734); 

                    createLeafNode(grammarAccess.getEnumerationLiteralAccess().getRightParenthesisKeyword_3(), null); 
                

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
    // $ANTLR end ruleEnumerationLiteral


    // $ANTLR start entryRuleQuery
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:834:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:834:47: (iv_ruleQuery= ruleQuery EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:835:2: iv_ruleQuery= ruleQuery EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQueryRule(), currentNode); 
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery1767);
            iv_ruleQuery=ruleQuery();
            _fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery1777); 

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
    // $ANTLR end entryRuleQuery


    // $ANTLR start ruleQuery
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:842:1: ruleQuery returns [EObject current=null] : ( 'query' (lv_name_1= RULE_ID ) '<' ( RULE_ID ) ( ',' ( RULE_ID ) )* '>' 'with' '(' (lv_parameters_9= ruleQueryParameter )? ( ',' (lv_parameters_11= ruleQueryParameter ) )* ')' '{' (lv_filters_14= ruleQueryFilter )* ( '-max' '(' (lv_max_17= RULE_INT ) ')' )? ( '-offset' '(' (lv_offset_21= RULE_INT ) ')' )? ( '-order' '(' (lv_orders_25= ruleQueryOrder )? ( ',' (lv_orders_27= ruleQueryOrder ) )* ')' )? '}' ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        Token lv_max_17=null;
        Token lv_offset_21=null;
        EObject lv_parameters_9 = null;

        EObject lv_parameters_11 = null;

        EObject lv_filters_14 = null;

        EObject lv_orders_25 = null;

        EObject lv_orders_27 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:847:6: ( ( 'query' (lv_name_1= RULE_ID ) '<' ( RULE_ID ) ( ',' ( RULE_ID ) )* '>' 'with' '(' (lv_parameters_9= ruleQueryParameter )? ( ',' (lv_parameters_11= ruleQueryParameter ) )* ')' '{' (lv_filters_14= ruleQueryFilter )* ( '-max' '(' (lv_max_17= RULE_INT ) ')' )? ( '-offset' '(' (lv_offset_21= RULE_INT ) ')' )? ( '-order' '(' (lv_orders_25= ruleQueryOrder )? ( ',' (lv_orders_27= ruleQueryOrder ) )* ')' )? '}' ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:848:1: ( 'query' (lv_name_1= RULE_ID ) '<' ( RULE_ID ) ( ',' ( RULE_ID ) )* '>' 'with' '(' (lv_parameters_9= ruleQueryParameter )? ( ',' (lv_parameters_11= ruleQueryParameter ) )* ')' '{' (lv_filters_14= ruleQueryFilter )* ( '-max' '(' (lv_max_17= RULE_INT ) ')' )? ( '-offset' '(' (lv_offset_21= RULE_INT ) ')' )? ( '-order' '(' (lv_orders_25= ruleQueryOrder )? ( ',' (lv_orders_27= ruleQueryOrder ) )* ')' )? '}' )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:848:1: ( 'query' (lv_name_1= RULE_ID ) '<' ( RULE_ID ) ( ',' ( RULE_ID ) )* '>' 'with' '(' (lv_parameters_9= ruleQueryParameter )? ( ',' (lv_parameters_11= ruleQueryParameter ) )* ')' '{' (lv_filters_14= ruleQueryFilter )* ( '-max' '(' (lv_max_17= RULE_INT ) ')' )? ( '-offset' '(' (lv_offset_21= RULE_INT ) ')' )? ( '-order' '(' (lv_orders_25= ruleQueryOrder )? ( ',' (lv_orders_27= ruleQueryOrder ) )* ')' )? '}' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:848:2: 'query' (lv_name_1= RULE_ID ) '<' ( RULE_ID ) ( ',' ( RULE_ID ) )* '>' 'with' '(' (lv_parameters_9= ruleQueryParameter )? ( ',' (lv_parameters_11= ruleQueryParameter ) )* ')' '{' (lv_filters_14= ruleQueryFilter )* ( '-max' '(' (lv_max_17= RULE_INT ) ')' )? ( '-offset' '(' (lv_offset_21= RULE_INT ) ')' )? ( '-order' '(' (lv_orders_25= ruleQueryOrder )? ( ',' (lv_orders_27= ruleQueryOrder ) )* ')' )? '}'
            {
            match(input,26,FOLLOW_26_in_ruleQuery1811); 

                    createLeafNode(grammarAccess.getQueryAccess().getQueryKeyword_0(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:852:1: (lv_name_1= RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:854:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery1833); 

            		createLeafNode(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getQueryRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,27,FOLLOW_27_in_ruleQuery1850); 

                    createLeafNode(grammarAccess.getQueryAccess().getLessThanSignKeyword_2(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:876:1: ( RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:879:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getQueryRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery1872); 

            		createLeafNode(grammarAccess.getQueryAccess().getEntitiesEntityCrossReference_3_0(), "entities"); 
            	

            }

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:892:2: ( ',' ( RULE_ID ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:892:3: ',' ( RULE_ID )
            	    {
            	    match(input,28,FOLLOW_28_in_ruleQuery1885); 

            	            createLeafNode(grammarAccess.getQueryAccess().getCommaKeyword_4_0(), null); 
            	        
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:896:1: ( RULE_ID )
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:899:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getQueryRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuery1907); 

            	    		createLeafNode(grammarAccess.getQueryAccess().getEntitiesEntityCrossReference_4_1_0(), "entities"); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match(input,29,FOLLOW_29_in_ruleQuery1921); 

                    createLeafNode(grammarAccess.getQueryAccess().getGreaterThanSignKeyword_5(), null); 
                
            match(input,30,FOLLOW_30_in_ruleQuery1930); 

                    createLeafNode(grammarAccess.getQueryAccess().getWithKeyword_6(), null); 
                
            match(input,24,FOLLOW_24_in_ruleQuery1939); 

                    createLeafNode(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_7(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:924:1: (lv_parameters_9= ruleQueryParameter )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:927:6: lv_parameters_9= ruleQueryParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getQueryAccess().getParametersQueryParameterParserRuleCall_8_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQueryParameter_in_ruleQuery1973);
                    lv_parameters_9=ruleQueryParameter();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getQueryRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "parameters", lv_parameters_9, "QueryParameter", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:945:3: ( ',' (lv_parameters_11= ruleQueryParameter ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:945:4: ',' (lv_parameters_11= ruleQueryParameter )
            	    {
            	    match(input,28,FOLLOW_28_in_ruleQuery1988); 

            	            createLeafNode(grammarAccess.getQueryAccess().getCommaKeyword_9_0(), null); 
            	        
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:949:1: (lv_parameters_11= ruleQueryParameter )
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:952:6: lv_parameters_11= ruleQueryParameter
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getQueryAccess().getParametersQueryParameterParserRuleCall_9_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleQueryParameter_in_ruleQuery2022);
            	    lv_parameters_11=ruleQueryParameter();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getQueryRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "parameters", lv_parameters_11, "QueryParameter", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match(input,25,FOLLOW_25_in_ruleQuery2037); 

                    createLeafNode(grammarAccess.getQueryAccess().getRightParenthesisKeyword_10(), null); 
                
            match(input,12,FOLLOW_12_in_ruleQuery2046); 

                    createLeafNode(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_11(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:978:1: (lv_filters_14= ruleQueryFilter )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:981:6: lv_filters_14= ruleQueryFilter
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getQueryAccess().getFiltersQueryFilterParserRuleCall_12_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleQueryFilter_in_ruleQuery2080);
            	    lv_filters_14=ruleQueryFilter();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getQueryRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "filters", lv_filters_14, "QueryFilter", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:999:3: ( '-max' '(' (lv_max_17= RULE_INT ) ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:999:4: '-max' '(' (lv_max_17= RULE_INT ) ')'
                    {
                    match(input,31,FOLLOW_31_in_ruleQuery2095); 

                            createLeafNode(grammarAccess.getQueryAccess().getMaxKeyword_13_0(), null); 
                        
                    match(input,24,FOLLOW_24_in_ruleQuery2104); 

                            createLeafNode(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_13_1(), null); 
                        
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1007:1: (lv_max_17= RULE_INT )
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1009:6: lv_max_17= RULE_INT
                    {
                    lv_max_17=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQuery2126); 

                    		createLeafNode(grammarAccess.getQueryAccess().getMaxINTTerminalRuleCall_13_2_0(), "max"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getQueryRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "max", lv_max_17, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,25,FOLLOW_25_in_ruleQuery2143); 

                            createLeafNode(grammarAccess.getQueryAccess().getRightParenthesisKeyword_13_3(), null); 
                        

                    }
                    break;

            }

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1031:3: ( '-offset' '(' (lv_offset_21= RULE_INT ) ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1031:4: '-offset' '(' (lv_offset_21= RULE_INT ) ')'
                    {
                    match(input,32,FOLLOW_32_in_ruleQuery2155); 

                            createLeafNode(grammarAccess.getQueryAccess().getOffsetKeyword_14_0(), null); 
                        
                    match(input,24,FOLLOW_24_in_ruleQuery2164); 

                            createLeafNode(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_14_1(), null); 
                        
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1039:1: (lv_offset_21= RULE_INT )
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1041:6: lv_offset_21= RULE_INT
                    {
                    lv_offset_21=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQuery2186); 

                    		createLeafNode(grammarAccess.getQueryAccess().getOffsetINTTerminalRuleCall_14_2_0(), "offset"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getQueryRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "offset", lv_offset_21, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,25,FOLLOW_25_in_ruleQuery2203); 

                            createLeafNode(grammarAccess.getQueryAccess().getRightParenthesisKeyword_14_3(), null); 
                        

                    }
                    break;

            }

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1063:3: ( '-order' '(' (lv_orders_25= ruleQueryOrder )? ( ',' (lv_orders_27= ruleQueryOrder ) )* ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1063:4: '-order' '(' (lv_orders_25= ruleQueryOrder )? ( ',' (lv_orders_27= ruleQueryOrder ) )* ')'
                    {
                    match(input,33,FOLLOW_33_in_ruleQuery2215); 

                            createLeafNode(grammarAccess.getQueryAccess().getOrderKeyword_15_0(), null); 
                        
                    match(input,24,FOLLOW_24_in_ruleQuery2224); 

                            createLeafNode(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_15_1(), null); 
                        
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1071:1: (lv_orders_25= ruleQueryOrder )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID||LA18_0==19) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1074:6: lv_orders_25= ruleQueryOrder
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getQueryAccess().getOrdersQueryOrderParserRuleCall_15_2_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleQueryOrder_in_ruleQuery2258);
                            lv_orders_25=ruleQueryOrder();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getQueryRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		add(current, "orders", lv_orders_25, "QueryOrder", currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }
                            break;

                    }

                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1092:3: ( ',' (lv_orders_27= ruleQueryOrder ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==28) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1092:4: ',' (lv_orders_27= ruleQueryOrder )
                    	    {
                    	    match(input,28,FOLLOW_28_in_ruleQuery2273); 

                    	            createLeafNode(grammarAccess.getQueryAccess().getCommaKeyword_15_3_0(), null); 
                    	        
                    	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1096:1: (lv_orders_27= ruleQueryOrder )
                    	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1099:6: lv_orders_27= ruleQueryOrder
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getQueryAccess().getOrdersQueryOrderParserRuleCall_15_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQueryOrder_in_ruleQuery2307);
                    	    lv_orders_27=ruleQueryOrder();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getQueryRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "orders", lv_orders_27, "QueryOrder", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    match(input,25,FOLLOW_25_in_ruleQuery2322); 

                            createLeafNode(grammarAccess.getQueryAccess().getRightParenthesisKeyword_15_4(), null); 
                        

                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_ruleQuery2333); 

                    createLeafNode(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_16(), null); 
                

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
    // $ANTLR end ruleQuery


    // $ANTLR start entryRuleQueryParameter
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1132:1: entryRuleQueryParameter returns [EObject current=null] : iv_ruleQueryParameter= ruleQueryParameter EOF ;
    public final EObject entryRuleQueryParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryParameter = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1132:56: (iv_ruleQueryParameter= ruleQueryParameter EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1133:2: iv_ruleQueryParameter= ruleQueryParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQueryParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleQueryParameter_in_entryRuleQueryParameter2366);
            iv_ruleQueryParameter=ruleQueryParameter();
            _fsp--;

             current =iv_ruleQueryParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryParameter2376); 

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
    // $ANTLR end entryRuleQueryParameter


    // $ANTLR start ruleQueryParameter
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1140:1: ruleQueryParameter returns [EObject current=null] : ( ( RULE_ID ) (lv_name_1= RULE_ID ) ) ;
    public final EObject ruleQueryParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1145:6: ( ( ( RULE_ID ) (lv_name_1= RULE_ID ) ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1146:1: ( ( RULE_ID ) (lv_name_1= RULE_ID ) )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1146:1: ( ( RULE_ID ) (lv_name_1= RULE_ID ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1146:2: ( RULE_ID ) (lv_name_1= RULE_ID )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1146:2: ( RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1149:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getQueryParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQueryParameter2423); 

            		createLeafNode(grammarAccess.getQueryParameterAccess().getTypeTypeCrossReference_0_0(), "type"); 
            	

            }

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1162:2: (lv_name_1= RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1164:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQueryParameter2448); 

            		createLeafNode(grammarAccess.getQueryParameterAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getQueryParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
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
    // $ANTLR end ruleQueryParameter


    // $ANTLR start entryRuleQueryFilter
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1189:1: entryRuleQueryFilter returns [EObject current=null] : iv_ruleQueryFilter= ruleQueryFilter EOF ;
    public final EObject entryRuleQueryFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryFilter = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1189:53: (iv_ruleQueryFilter= ruleQueryFilter EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1190:2: iv_ruleQueryFilter= ruleQueryFilter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQueryFilterRule(), currentNode); 
            pushFollow(FOLLOW_ruleQueryFilter_in_entryRuleQueryFilter2489);
            iv_ruleQueryFilter=ruleQueryFilter();
            _fsp--;

             current =iv_ruleQueryFilter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryFilter2499); 

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
    // $ANTLR end entryRuleQueryFilter


    // $ANTLR start ruleQueryFilter
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1197:1: ruleQueryFilter returns [EObject current=null] : ( ( RULE_ID )? '.' ( RULE_ID ) '=' ( RULE_ID ) ) ;
    public final EObject ruleQueryFilter() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1202:6: ( ( ( RULE_ID )? '.' ( RULE_ID ) '=' ( RULE_ID ) ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1203:1: ( ( RULE_ID )? '.' ( RULE_ID ) '=' ( RULE_ID ) )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1203:1: ( ( RULE_ID )? '.' ( RULE_ID ) '=' ( RULE_ID ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1203:2: ( RULE_ID )? '.' ( RULE_ID ) '=' ( RULE_ID )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1203:2: ( RULE_ID )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1206:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getQueryFilterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQueryFilter2546); 

                    		createLeafNode(grammarAccess.getQueryFilterAccess().getEntityEntityCrossReference_0_0(), "entity"); 
                    	

                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleQueryFilter2559); 

                    createLeafNode(grammarAccess.getQueryFilterAccess().getFullStopKeyword_1(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1223:1: ( RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1226:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getQueryFilterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQueryFilter2581); 

            		createLeafNode(grammarAccess.getQueryFilterAccess().getAttributeAttributeCrossReference_2_0(), "attribute"); 
            	

            }

            match(input,34,FOLLOW_34_in_ruleQueryFilter2593); 

                    createLeafNode(grammarAccess.getQueryFilterAccess().getEqualsSignKeyword_3(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1243:1: ( RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1246:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getQueryFilterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQueryFilter2615); 

            		createLeafNode(grammarAccess.getQueryFilterAccess().getValueQueryParameterCrossReference_4_0(), "value"); 
            	

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
    // $ANTLR end ruleQueryFilter


    // $ANTLR start entryRuleQueryOrder
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1266:1: entryRuleQueryOrder returns [EObject current=null] : iv_ruleQueryOrder= ruleQueryOrder EOF ;
    public final EObject entryRuleQueryOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryOrder = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1266:52: (iv_ruleQueryOrder= ruleQueryOrder EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1267:2: iv_ruleQueryOrder= ruleQueryOrder EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQueryOrderRule(), currentNode); 
            pushFollow(FOLLOW_ruleQueryOrder_in_entryRuleQueryOrder2651);
            iv_ruleQueryOrder=ruleQueryOrder();
            _fsp--;

             current =iv_ruleQueryOrder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryOrder2661); 

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
    // $ANTLR end entryRuleQueryOrder


    // $ANTLR start ruleQueryOrder
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1274:1: ruleQueryOrder returns [EObject current=null] : ( ( RULE_ID )? '.' ( RULE_ID ) (lv_type_3= ruleQueryOrderType )? ) ;
    public final EObject ruleQueryOrder() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1279:6: ( ( ( RULE_ID )? '.' ( RULE_ID ) (lv_type_3= ruleQueryOrderType )? ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1280:1: ( ( RULE_ID )? '.' ( RULE_ID ) (lv_type_3= ruleQueryOrderType )? )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1280:1: ( ( RULE_ID )? '.' ( RULE_ID ) (lv_type_3= ruleQueryOrderType )? )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1280:2: ( RULE_ID )? '.' ( RULE_ID ) (lv_type_3= ruleQueryOrderType )?
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1280:2: ( RULE_ID )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1283:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getQueryOrderRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQueryOrder2708); 

                    		createLeafNode(grammarAccess.getQueryOrderAccess().getEntityEntityCrossReference_0_0(), "entity"); 
                    	

                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleQueryOrder2721); 

                    createLeafNode(grammarAccess.getQueryOrderAccess().getFullStopKeyword_1(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1300:1: ( RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1303:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getQueryOrderRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQueryOrder2743); 

            		createLeafNode(grammarAccess.getQueryOrderAccess().getAttributeAttributeCrossReference_2_0(), "attribute"); 
            	

            }

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1316:2: (lv_type_3= ruleQueryOrderType )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=38 && LA23_0<=39)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1319:6: lv_type_3= ruleQueryOrderType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getQueryOrderAccess().getTypeQueryOrderTypeEnumRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQueryOrderType_in_ruleQueryOrder2780);
                    lv_type_3=ruleQueryOrderType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getQueryOrderRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_3, "QueryOrderType", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

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
    // $ANTLR end ruleQueryOrder


    // $ANTLR start ruleAttributeManyReference
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1344:1: ruleAttributeManyReference returns [Enumerator current=null] : ( ( 'NONE' ) | ( '*' ) | ( '#' ) ) ;
    public final Enumerator ruleAttributeManyReference() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1348:6: ( ( ( 'NONE' ) | ( '*' ) | ( '#' ) ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1349:1: ( ( 'NONE' ) | ( '*' ) | ( '#' ) )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1349:1: ( ( 'NONE' ) | ( '*' ) | ( '#' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt24=1;
                }
                break;
            case 36:
                {
                alt24=2;
                }
                break;
            case 37:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1349:1: ( ( 'NONE' ) | ( '*' ) | ( '#' ) )", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1349:2: ( 'NONE' )
                    {
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1349:2: ( 'NONE' )
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1349:4: 'NONE'
                    {
                    match(input,35,FOLLOW_35_in_ruleAttributeManyReference2832); 

                            current = grammarAccess.getAttributeManyReferenceAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAttributeManyReferenceAccess().getNONEEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1355:6: ( '*' )
                    {
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1355:6: ( '*' )
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1355:8: '*'
                    {
                    match(input,36,FOLLOW_36_in_ruleAttributeManyReference2847); 

                            current = grammarAccess.getAttributeManyReferenceAccess().getWEAKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAttributeManyReferenceAccess().getWEAKEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1361:6: ( '#' )
                    {
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1361:6: ( '#' )
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1361:8: '#'
                    {
                    match(input,37,FOLLOW_37_in_ruleAttributeManyReference2862); 

                            current = grammarAccess.getAttributeManyReferenceAccess().getSTRONGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAttributeManyReferenceAccess().getSTRONGEnumLiteralDeclaration_2(), null); 
                        

                    }


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
    // $ANTLR end ruleAttributeManyReference


    // $ANTLR start ruleQueryOrderType
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1371:1: ruleQueryOrderType returns [Enumerator current=null] : ( ( '+' ) | ( '-' ) ) ;
    public final Enumerator ruleQueryOrderType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1375:6: ( ( ( '+' ) | ( '-' ) ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1376:1: ( ( '+' ) | ( '-' ) )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1376:1: ( ( '+' ) | ( '-' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            else if ( (LA25_0==39) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1376:1: ( ( '+' ) | ( '-' ) )", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1376:2: ( '+' )
                    {
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1376:2: ( '+' )
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1376:4: '+'
                    {
                    match(input,38,FOLLOW_38_in_ruleQueryOrderType2905); 

                            current = grammarAccess.getQueryOrderTypeAccess().getASCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getQueryOrderTypeAccess().getASCEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1382:6: ( '-' )
                    {
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1382:6: ( '-' )
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:1382:8: '-'
                    {
                    match(input,39,FOLLOW_39_in_ruleQueryOrderType2920); 

                            current = grammarAccess.getQueryOrderTypeAccess().getDESCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getQueryOrderTypeAccess().getDESCEnumLiteralDeclaration_1(), null); 
                        

                    }


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
    // $ANTLR end ruleQueryOrderType


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_ruleModel142 = new BitSet(new long[]{0x0000000004D20002L});
    public static final BitSet FOLLOW_ruleType_in_ruleModel180 = new BitSet(new long[]{0x0000000004D20002L});
    public static final BitSet FOLLOW_ruleQuery_in_ruleModel219 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProject301 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProject310 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProject319 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProject328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProject350 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProject367 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProject376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProject398 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleProject415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleType505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleType559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbed_in_ruleType586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSimpleType662 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleType684 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleSimpleType702 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJAVAID_in_ruleSimpleType736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_entryRuleJAVAID775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJAVAID785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJAVAID832 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleJAVAID850 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJAVAID859 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleEntity937 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity959 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_21_in_ruleEntity977 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity999 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity1013 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity1047 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_ruleEntity1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbed_in_entryRuleEmbed1094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmbed1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEmbed1138 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmbed1160 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_21_in_ruleEmbed1178 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmbed1200 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEmbed1214 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEmbed1248 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_ruleEmbed1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1352 = new BitSet(new long[]{0x0000003800000020L});
    public static final BitSet FOLLOW_ruleAttributeManyReference_in_ruleAttribute1389 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleEnumeration1501 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration1523 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEnumeration1540 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration1574 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_ruleEnumeration1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteral1678 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleEnumerationLiteral1695 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumerationLiteral1717 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEnumerationLiteral1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery1767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleQuery1811 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery1833 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleQuery1850 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery1872 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleQuery1885 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuery1907 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleQuery1921 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleQuery1930 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQuery1939 = new BitSet(new long[]{0x0000000012000020L});
    public static final BitSet FOLLOW_ruleQueryParameter_in_ruleQuery1973 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_28_in_ruleQuery1988 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQueryParameter_in_ruleQuery2022 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_25_in_ruleQuery2037 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQuery2046 = new BitSet(new long[]{0x0000000380090020L});
    public static final BitSet FOLLOW_ruleQueryFilter_in_ruleQuery2080 = new BitSet(new long[]{0x0000000380090020L});
    public static final BitSet FOLLOW_31_in_ruleQuery2095 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQuery2104 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQuery2126 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleQuery2143 = new BitSet(new long[]{0x0000000300010000L});
    public static final BitSet FOLLOW_32_in_ruleQuery2155 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQuery2164 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQuery2186 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleQuery2203 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_33_in_ruleQuery2215 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQuery2224 = new BitSet(new long[]{0x0000000012080020L});
    public static final BitSet FOLLOW_ruleQueryOrder_in_ruleQuery2258 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_28_in_ruleQuery2273 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_ruleQueryOrder_in_ruleQuery2307 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_25_in_ruleQuery2322 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleQuery2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryParameter_in_entryRuleQueryParameter2366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryParameter2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQueryParameter2423 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQueryParameter2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryFilter_in_entryRuleQueryFilter2489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryFilter2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQueryFilter2546 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQueryFilter2559 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQueryFilter2581 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleQueryFilter2593 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQueryFilter2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryOrder_in_entryRuleQueryOrder2651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryOrder2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQueryOrder2708 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQueryOrder2721 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQueryOrder2743 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleQueryOrderType_in_ruleQueryOrder2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleAttributeManyReference2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAttributeManyReference2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleAttributeManyReference2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleQueryOrderType2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleQueryOrderType2920 = new BitSet(new long[]{0x0000000000000002L});

}