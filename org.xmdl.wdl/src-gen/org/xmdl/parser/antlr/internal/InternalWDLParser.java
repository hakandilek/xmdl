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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'{'", "'projectName'", "':'", "'basePackage'", "'}'", "'type'", "'is'", "'.'", "'entity'", "'extends'", "'embed'", "'*'", "'enum'", "'('", "')'"
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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:80:1: ruleModel returns [EObject current=null] : ( (lv_project_0= ruleProject ) (lv_types_1= ruleType )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_project_0 = null;

        EObject lv_types_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:85:6: ( ( (lv_project_0= ruleProject ) (lv_types_1= ruleType )* ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:86:1: ( (lv_project_0= ruleProject ) (lv_types_1= ruleType )* )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:86:1: ( (lv_project_0= ruleProject ) (lv_types_1= ruleType )* )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:86:2: (lv_project_0= ruleProject ) (lv_types_1= ruleType )*
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:86:2: (lv_project_0= ruleProject )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:89:6: lv_project_0= ruleProject
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

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:107:2: (lv_types_1= ruleType )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17||LA1_0==20||LA1_0==22||LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:110:6: lv_types_1= ruleType
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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:135:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:135:49: (iv_ruleProject= ruleProject EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:136:2: iv_ruleProject= ruleProject EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProjectRule(), currentNode); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject218);
            iv_ruleProject=ruleProject();
            _fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject228); 

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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:143:1: ruleProject returns [EObject current=null] : ( 'project' '{' 'projectName' ':' (lv_name_4= RULE_STRING ) 'basePackage' ':' (lv_basePackage_7= RULE_STRING ) '}' ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token lv_name_4=null;
        Token lv_basePackage_7=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:148:6: ( ( 'project' '{' 'projectName' ':' (lv_name_4= RULE_STRING ) 'basePackage' ':' (lv_basePackage_7= RULE_STRING ) '}' ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:149:1: ( 'project' '{' 'projectName' ':' (lv_name_4= RULE_STRING ) 'basePackage' ':' (lv_basePackage_7= RULE_STRING ) '}' )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:149:1: ( 'project' '{' 'projectName' ':' (lv_name_4= RULE_STRING ) 'basePackage' ':' (lv_basePackage_7= RULE_STRING ) '}' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:149:2: 'project' '{' 'projectName' ':' (lv_name_4= RULE_STRING ) 'basePackage' ':' (lv_basePackage_7= RULE_STRING ) '}'
            {
            match(input,11,FOLLOW_11_in_ruleProject262); 

                    createLeafNode(grammarAccess.getProjectAccess().getProjectKeyword_0(), null); 
                
            match(input,12,FOLLOW_12_in_ruleProject271); 

                    createLeafNode(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            match(input,13,FOLLOW_13_in_ruleProject280); 

                    createLeafNode(grammarAccess.getProjectAccess().getProjectNameKeyword_2(), null); 
                
            match(input,14,FOLLOW_14_in_ruleProject289); 

                    createLeafNode(grammarAccess.getProjectAccess().getColonKeyword_3(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:165:1: (lv_name_4= RULE_STRING )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:167:6: lv_name_4= RULE_STRING
            {
            lv_name_4=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProject311); 

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

            match(input,15,FOLLOW_15_in_ruleProject328); 

                    createLeafNode(grammarAccess.getProjectAccess().getBasePackageKeyword_5(), null); 
                
            match(input,14,FOLLOW_14_in_ruleProject337); 

                    createLeafNode(grammarAccess.getProjectAccess().getColonKeyword_6(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:193:1: (lv_basePackage_7= RULE_STRING )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:195:6: lv_basePackage_7= RULE_STRING
            {
            lv_basePackage_7=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProject359); 

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

            match(input,16,FOLLOW_16_in_ruleProject376); 

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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:224:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:224:46: (iv_ruleType= ruleType EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:225:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType409);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType419); 

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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:232:1: ruleType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity | this_Enumeration_2= ruleEnumeration | this_Embed_3= ruleEmbed ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_Entity_1 = null;

        EObject this_Enumeration_2 = null;

        EObject this_Embed_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:237:6: ( (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity | this_Enumeration_2= ruleEnumeration | this_Embed_3= ruleEmbed ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:238:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity | this_Enumeration_2= ruleEnumeration | this_Embed_3= ruleEmbed )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:238:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity | this_Enumeration_2= ruleEnumeration | this_Embed_3= ruleEmbed )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 22:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("238:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity | this_Enumeration_2= ruleEnumeration | this_Embed_3= ruleEmbed )", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:239:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_ruleType466);
                    this_SimpleType_0=ruleSimpleType();
                    _fsp--;

                     
                            current = this_SimpleType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:249:5: this_Entity_1= ruleEntity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType493);
                    this_Entity_1=ruleEntity();
                    _fsp--;

                     
                            current = this_Entity_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:259:5: this_Enumeration_2= ruleEnumeration
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumeration_in_ruleType520);
                    this_Enumeration_2=ruleEnumeration();
                    _fsp--;

                     
                            current = this_Enumeration_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:269:5: this_Embed_3= ruleEmbed
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEmbedParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEmbed_in_ruleType547);
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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:284:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:284:52: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:285:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType579);
            iv_ruleSimpleType=ruleSimpleType();
            _fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType589); 

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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:292:1: ruleSimpleType returns [EObject current=null] : ( 'type' (lv_name_1= RULE_ID ) ( 'is' (lv_mappedType_3= ruleJAVAID ) )? ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_mappedType_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:297:6: ( ( 'type' (lv_name_1= RULE_ID ) ( 'is' (lv_mappedType_3= ruleJAVAID ) )? ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:298:1: ( 'type' (lv_name_1= RULE_ID ) ( 'is' (lv_mappedType_3= ruleJAVAID ) )? )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:298:1: ( 'type' (lv_name_1= RULE_ID ) ( 'is' (lv_mappedType_3= ruleJAVAID ) )? )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:298:2: 'type' (lv_name_1= RULE_ID ) ( 'is' (lv_mappedType_3= ruleJAVAID ) )?
            {
            match(input,17,FOLLOW_17_in_ruleSimpleType623); 

                    createLeafNode(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:302:1: (lv_name_1= RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:304:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleType645); 

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

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:322:2: ( 'is' (lv_mappedType_3= ruleJAVAID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:322:3: 'is' (lv_mappedType_3= ruleJAVAID )
                    {
                    match(input,18,FOLLOW_18_in_ruleSimpleType663); 

                            createLeafNode(grammarAccess.getSimpleTypeAccess().getIsKeyword_2_0(), null); 
                        
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:326:1: (lv_mappedType_3= ruleJAVAID )
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:329:6: lv_mappedType_3= ruleJAVAID
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSimpleTypeAccess().getMappedTypeJAVAIDParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleJAVAID_in_ruleSimpleType697);
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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:354:1: entryRuleJAVAID returns [EObject current=null] : iv_ruleJAVAID= ruleJAVAID EOF ;
    public final EObject entryRuleJAVAID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJAVAID = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:354:48: (iv_ruleJAVAID= ruleJAVAID EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:355:2: iv_ruleJAVAID= ruleJAVAID EOF
            {
             currentNode = createCompositeNode(grammarAccess.getJAVAIDRule(), currentNode); 
            pushFollow(FOLLOW_ruleJAVAID_in_entryRuleJAVAID736);
            iv_ruleJAVAID=ruleJAVAID();
            _fsp--;

             current =iv_ruleJAVAID; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJAVAID746); 

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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:362:1: ruleJAVAID returns [EObject current=null] : ( (lv_name_0= RULE_ID ) ( '.' RULE_ID )* ) ;
    public final EObject ruleJAVAID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:367:6: ( ( (lv_name_0= RULE_ID ) ( '.' RULE_ID )* ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:368:1: ( (lv_name_0= RULE_ID ) ( '.' RULE_ID )* )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:368:1: ( (lv_name_0= RULE_ID ) ( '.' RULE_ID )* )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:368:2: (lv_name_0= RULE_ID ) ( '.' RULE_ID )*
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:368:2: (lv_name_0= RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:370:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJAVAID793); 

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

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:388:2: ( '.' RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:388:3: '.' RULE_ID
            	    {
            	    match(input,19,FOLLOW_19_in_ruleJAVAID811); 

            	            createLeafNode(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJAVAID820); 
            	     
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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:403:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:403:48: (iv_ruleEntity= ruleEntity EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:404:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity854);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity864); 

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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:411:1: ruleEntity returns [EObject current=null] : ( 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_attributes_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:416:6: ( ( 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}' ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:417:1: ( 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}' )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:417:1: ( 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:417:2: 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}'
            {
            match(input,20,FOLLOW_20_in_ruleEntity898); 

                    createLeafNode(grammarAccess.getEntityAccess().getEntityKeyword_0(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:421:1: (lv_name_1= RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:423:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity920); 

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

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:441:2: ( 'extends' ( RULE_ID ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:441:3: 'extends' ( RULE_ID )
                    {
                    match(input,21,FOLLOW_21_in_ruleEntity938); 

                            createLeafNode(grammarAccess.getEntityAccess().getExtendsKeyword_2_0(), null); 
                        
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:445:1: ( RULE_ID )
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:448:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity960); 

                    		createLeafNode(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_2_1_0(), "superEntity"); 
                    	

                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleEntity974); 

                    createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:465:1: (lv_attributes_5= ruleAttribute )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:468:6: lv_attributes_5= ruleAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity1008);
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
            	    break loop6;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleEntity1022); 

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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:497:1: entryRuleEmbed returns [EObject current=null] : iv_ruleEmbed= ruleEmbed EOF ;
    public final EObject entryRuleEmbed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmbed = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:497:47: (iv_ruleEmbed= ruleEmbed EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:498:2: iv_ruleEmbed= ruleEmbed EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEmbedRule(), currentNode); 
            pushFollow(FOLLOW_ruleEmbed_in_entryRuleEmbed1055);
            iv_ruleEmbed=ruleEmbed();
            _fsp--;

             current =iv_ruleEmbed; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmbed1065); 

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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:505:1: ruleEmbed returns [EObject current=null] : ( 'embed' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}' ) ;
    public final EObject ruleEmbed() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_attributes_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:510:6: ( ( 'embed' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}' ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:511:1: ( 'embed' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}' )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:511:1: ( 'embed' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:511:2: 'embed' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_attributes_5= ruleAttribute )* '}'
            {
            match(input,22,FOLLOW_22_in_ruleEmbed1099); 

                    createLeafNode(grammarAccess.getEmbedAccess().getEmbedKeyword_0(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:515:1: (lv_name_1= RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:517:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmbed1121); 

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

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:535:2: ( 'extends' ( RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:535:3: 'extends' ( RULE_ID )
                    {
                    match(input,21,FOLLOW_21_in_ruleEmbed1139); 

                            createLeafNode(grammarAccess.getEmbedAccess().getExtendsKeyword_2_0(), null); 
                        
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:539:1: ( RULE_ID )
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:542:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getEmbedRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmbed1161); 

                    		createLeafNode(grammarAccess.getEmbedAccess().getSuperEntityEntityCrossReference_2_1_0(), "superEntity"); 
                    	

                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleEmbed1175); 

                    createLeafNode(grammarAccess.getEmbedAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:559:1: (lv_attributes_5= ruleAttribute )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:562:6: lv_attributes_5= ruleAttribute
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEmbedAccess().getAttributesAttributeParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEmbed1209);
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
            	    break loop8;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleEmbed1223); 

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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:591:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:591:51: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:592:2: iv_ruleAttribute= ruleAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1256);
            iv_ruleAttribute=ruleAttribute();
            _fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1266); 

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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:599:1: ruleAttribute returns [EObject current=null] : ( ( RULE_ID ) (lv_many_1= '*' )? (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_many_1=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:604:6: ( ( ( RULE_ID ) (lv_many_1= '*' )? (lv_name_2= RULE_ID ) ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:605:1: ( ( RULE_ID ) (lv_many_1= '*' )? (lv_name_2= RULE_ID ) )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:605:1: ( ( RULE_ID ) (lv_many_1= '*' )? (lv_name_2= RULE_ID ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:605:2: ( RULE_ID ) (lv_many_1= '*' )? (lv_name_2= RULE_ID )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:605:2: ( RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:608:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1313); 

            		createLeafNode(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0(), "type"); 
            	

            }

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:621:2: (lv_many_1= '*' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:623:6: lv_many_1= '*'
                    {
                    lv_many_1=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_ruleAttribute1337); 

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

            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:642:3: (lv_name_2= RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:644:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1373); 

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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:669:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:669:53: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:670:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration1414);
            iv_ruleEnumeration=ruleEnumeration();
            _fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration1424); 

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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:677:1: ruleEnumeration returns [EObject current=null] : ( 'enum' (lv_name_1= RULE_ID ) '{' (lv_literals_3= ruleEnumerationLiteral )* '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_literals_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:682:6: ( ( 'enum' (lv_name_1= RULE_ID ) '{' (lv_literals_3= ruleEnumerationLiteral )* '}' ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:683:1: ( 'enum' (lv_name_1= RULE_ID ) '{' (lv_literals_3= ruleEnumerationLiteral )* '}' )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:683:1: ( 'enum' (lv_name_1= RULE_ID ) '{' (lv_literals_3= ruleEnumerationLiteral )* '}' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:683:2: 'enum' (lv_name_1= RULE_ID ) '{' (lv_literals_3= ruleEnumerationLiteral )* '}'
            {
            match(input,24,FOLLOW_24_in_ruleEnumeration1458); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getEnumKeyword_0(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:687:1: (lv_name_1= RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:689:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration1480); 

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

            match(input,12,FOLLOW_12_in_ruleEnumeration1497); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:711:1: (lv_literals_3= ruleEnumerationLiteral )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:714:6: lv_literals_3= ruleEnumerationLiteral
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration1531);
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
            	    break loop10;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleEnumeration1545); 

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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:743:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:743:60: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:744:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral1578);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();
            _fsp--;

             current =iv_ruleEnumerationLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral1588); 

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
    // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:751:1: ruleEnumerationLiteral returns [EObject current=null] : ( (lv_name_0= RULE_ID ) '(' (lv_ordinal_2= RULE_INT ) ')' ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_ordinal_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:756:6: ( ( (lv_name_0= RULE_ID ) '(' (lv_ordinal_2= RULE_INT ) ')' ) )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:757:1: ( (lv_name_0= RULE_ID ) '(' (lv_ordinal_2= RULE_INT ) ')' )
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:757:1: ( (lv_name_0= RULE_ID ) '(' (lv_ordinal_2= RULE_INT ) ')' )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:757:2: (lv_name_0= RULE_ID ) '(' (lv_ordinal_2= RULE_INT ) ')'
            {
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:757:2: (lv_name_0= RULE_ID )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:759:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationLiteral1635); 

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

            match(input,25,FOLLOW_25_in_ruleEnumerationLiteral1652); 

                    createLeafNode(grammarAccess.getEnumerationLiteralAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:781:1: (lv_ordinal_2= RULE_INT )
            // ../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g:783:6: lv_ordinal_2= RULE_INT
            {
            lv_ordinal_2=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumerationLiteral1674); 

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

            match(input,26,FOLLOW_26_in_ruleEnumerationLiteral1691); 

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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_ruleModel142 = new BitSet(new long[]{0x0000000001520002L});
    public static final BitSet FOLLOW_ruleType_in_ruleModel180 = new BitSet(new long[]{0x0000000001520002L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProject262 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProject271 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProject280 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProject289 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProject311 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProject328 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProject337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProject359 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleProject376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleType466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleType520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbed_in_ruleType547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSimpleType623 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleType645 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleSimpleType663 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJAVAID_in_ruleSimpleType697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_entryRuleJAVAID736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJAVAID746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJAVAID793 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleJAVAID811 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJAVAID820 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleEntity898 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity920 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_21_in_ruleEntity938 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity960 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity974 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity1008 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_ruleEntity1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbed_in_entryRuleEmbed1055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmbed1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEmbed1099 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmbed1121 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_21_in_ruleEmbed1139 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmbed1161 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEmbed1175 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEmbed1209 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_ruleEmbed1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1313 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_23_in_ruleAttribute1337 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleEnumeration1458 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration1480 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEnumeration1497 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration1531 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_ruleEnumeration1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral1578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteral1635 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEnumerationLiteral1652 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumerationLiteral1674 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEnumerationLiteral1691 = new BitSet(new long[]{0x0000000000000002L});

}