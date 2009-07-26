package org.xmdl.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xmdl.services.WDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalWDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'type'", "'is'", "'.'", "'entity'", "'enum'", "'{'", "'}'", "'('", "')'", "'embed'", "'extends'", "'*'"
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
    public String getGrammarFileName() { return "../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g"; }


     
     	private WDLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(WDLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }




    // $ANTLR start entryRuleModel
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:55:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:55:16: ( ruleModel EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:56:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel60);
            ruleModel();
            _fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel67); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:63:1: ruleModel : ( ( rule__Model__TypesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:67:2: ( ( ( rule__Model__TypesAssignment )* ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:68:1: ( ( rule__Model__TypesAssignment )* )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:68:1: ( ( rule__Model__TypesAssignment )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:69:1: ( rule__Model__TypesAssignment )*
            {
             before(grammarAccess.getModelAccess().getTypesAssignment()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:70:1: ( rule__Model__TypesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=14 && LA1_0<=15)||LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:70:2: rule__Model__TypesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__TypesAssignment_in_ruleModel94);
            	    rule__Model__TypesAssignment();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTypesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleType
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:82:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:82:15: ( ruleType EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:83:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType121);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:90:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:94:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:95:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:95:1: ( ( rule__Type__Alternatives ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:96:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:97:1: ( rule__Type__Alternatives )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:97:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType155);
            rule__Type__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleSimpleType
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:109:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:109:21: ( ruleSimpleType EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:110:1: ruleSimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType181);
            ruleSimpleType();
            _fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSimpleType


    // $ANTLR start ruleSimpleType
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:117:1: ruleSimpleType : ( ( rule__SimpleType__Group__0 ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:121:2: ( ( ( rule__SimpleType__Group__0 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:122:1: ( ( rule__SimpleType__Group__0 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:122:1: ( ( rule__SimpleType__Group__0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:123:1: ( rule__SimpleType__Group__0 )
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:124:1: ( rule__SimpleType__Group__0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:124:2: rule__SimpleType__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType215);
            rule__SimpleType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSimpleType


    // $ANTLR start entryRuleJAVAID
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:136:1: entryRuleJAVAID : ruleJAVAID EOF ;
    public final void entryRuleJAVAID() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:136:17: ( ruleJAVAID EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:137:1: ruleJAVAID EOF
            {
             before(grammarAccess.getJAVAIDRule()); 
            pushFollow(FOLLOW_ruleJAVAID_in_entryRuleJAVAID241);
            ruleJAVAID();
            _fsp--;

             after(grammarAccess.getJAVAIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJAVAID248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleJAVAID


    // $ANTLR start ruleJAVAID
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:144:1: ruleJAVAID : ( ( rule__JAVAID__Group__0 ) ) ;
    public final void ruleJAVAID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:148:2: ( ( ( rule__JAVAID__Group__0 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:149:1: ( ( rule__JAVAID__Group__0 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:149:1: ( ( rule__JAVAID__Group__0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:150:1: ( rule__JAVAID__Group__0 )
            {
             before(grammarAccess.getJAVAIDAccess().getGroup()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:151:1: ( rule__JAVAID__Group__0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:151:2: rule__JAVAID__Group__0
            {
            pushFollow(FOLLOW_rule__JAVAID__Group__0_in_ruleJAVAID275);
            rule__JAVAID__Group__0();
            _fsp--;


            }

             after(grammarAccess.getJAVAIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleJAVAID


    // $ANTLR start entryRuleEntity
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:163:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:163:17: ( ruleEntity EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:164:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity301);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:171:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:175:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:176:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:176:1: ( ( rule__Entity__Group__0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:177:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:178:1: ( rule__Entity__Group__0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:178:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity335);
            rule__Entity__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleAttribute
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:190:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:190:20: ( ruleAttribute EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:191:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute361);
            ruleAttribute();
            _fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAttribute


    // $ANTLR start ruleAttribute
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:198:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:202:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:203:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:203:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:204:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:205:1: ( rule__Attribute__Group__0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:205:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute395);
            rule__Attribute__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAttribute


    // $ANTLR start entryRuleEnum
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:217:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:217:15: ( ruleEnum EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:218:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum421);
            ruleEnum();
            _fsp--;

             after(grammarAccess.getEnumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEnum


    // $ANTLR start ruleEnum
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:225:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:229:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:230:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:230:1: ( ( rule__Enum__Group__0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:231:1: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:232:1: ( rule__Enum__Group__0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:232:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum455);
            rule__Enum__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnum


    // $ANTLR start entryRuleEnumLiteral
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:244:1: entryRuleEnumLiteral : ruleEnumLiteral EOF ;
    public final void entryRuleEnumLiteral() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:244:22: ( ruleEnumLiteral EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:245:1: ruleEnumLiteral EOF
            {
             before(grammarAccess.getEnumLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral481);
            ruleEnumLiteral();
            _fsp--;

             after(grammarAccess.getEnumLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLiteral488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEnumLiteral


    // $ANTLR start ruleEnumLiteral
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:252:1: ruleEnumLiteral : ( ( rule__EnumLiteral__Group__0 ) ) ;
    public final void ruleEnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:256:2: ( ( ( rule__EnumLiteral__Group__0 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:257:1: ( ( rule__EnumLiteral__Group__0 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:257:1: ( ( rule__EnumLiteral__Group__0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:258:1: ( rule__EnumLiteral__Group__0 )
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:259:1: ( rule__EnumLiteral__Group__0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:259:2: rule__EnumLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumLiteral__Group__0_in_ruleEnumLiteral515);
            rule__EnumLiteral__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumLiteral


    // $ANTLR start entryRuleEmbed
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:271:1: entryRuleEmbed : ruleEmbed EOF ;
    public final void entryRuleEmbed() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:271:16: ( ruleEmbed EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:272:1: ruleEmbed EOF
            {
             before(grammarAccess.getEmbedRule()); 
            pushFollow(FOLLOW_ruleEmbed_in_entryRuleEmbed541);
            ruleEmbed();
            _fsp--;

             after(grammarAccess.getEmbedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmbed548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEmbed


    // $ANTLR start ruleEmbed
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:279:1: ruleEmbed : ( ( rule__Embed__Group__0 ) ) ;
    public final void ruleEmbed() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:283:2: ( ( ( rule__Embed__Group__0 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:284:1: ( ( rule__Embed__Group__0 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:284:1: ( ( rule__Embed__Group__0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:285:1: ( rule__Embed__Group__0 )
            {
             before(grammarAccess.getEmbedAccess().getGroup()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:286:1: ( rule__Embed__Group__0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:286:2: rule__Embed__Group__0
            {
            pushFollow(FOLLOW_rule__Embed__Group__0_in_ruleEmbed575);
            rule__Embed__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEmbedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEmbed


    // $ANTLR start entryRuleEntityBody
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:298:1: entryRuleEntityBody : ruleEntityBody EOF ;
    public final void entryRuleEntityBody() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:298:21: ( ruleEntityBody EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:299:1: ruleEntityBody EOF
            {
             before(grammarAccess.getEntityBodyRule()); 
            pushFollow(FOLLOW_ruleEntityBody_in_entryRuleEntityBody601);
            ruleEntityBody();
            _fsp--;

             after(grammarAccess.getEntityBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityBody608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEntityBody


    // $ANTLR start ruleEntityBody
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:306:1: ruleEntityBody : ( ( rule__EntityBody__Group__0 ) ) ;
    public final void ruleEntityBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:310:2: ( ( ( rule__EntityBody__Group__0 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:311:1: ( ( rule__EntityBody__Group__0 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:311:1: ( ( rule__EntityBody__Group__0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:312:1: ( rule__EntityBody__Group__0 )
            {
             before(grammarAccess.getEntityBodyAccess().getGroup()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:313:1: ( rule__EntityBody__Group__0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:313:2: rule__EntityBody__Group__0
            {
            pushFollow(FOLLOW_rule__EntityBody__Group__0_in_ruleEntityBody635);
            rule__EntityBody__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEntityBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEntityBody


    // $ANTLR start rule__Type__Alternatives
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:325:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) | ( ruleEnum ) | ( ruleEmbed ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:329:1: ( ( ruleSimpleType ) | ( ruleEntity ) | ( ruleEnum ) | ( ruleEmbed ) )
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
            case 15:
                {
                alt2=3;
                }
                break;
            case 20:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("325:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) | ( ruleEnum ) | ( ruleEmbed ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:330:1: ( ruleSimpleType )
                    {
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:330:1: ( ruleSimpleType )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:331:1: ruleSimpleType
                    {
                     before(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleType_in_rule__Type__Alternatives671);
                    ruleSimpleType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:336:6: ( ruleEntity )
                    {
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:336:6: ( ruleEntity )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:337:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives688);
                    ruleEntity();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:342:6: ( ruleEnum )
                    {
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:342:6: ( ruleEnum )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:343:1: ruleEnum
                    {
                     before(grammarAccess.getTypeAccess().getEnumParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnum_in_rule__Type__Alternatives705);
                    ruleEnum();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getEnumParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:348:6: ( ruleEmbed )
                    {
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:348:6: ( ruleEmbed )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:349:1: ruleEmbed
                    {
                     before(grammarAccess.getTypeAccess().getEmbedParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleEmbed_in_rule__Type__Alternatives722);
                    ruleEmbed();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getEmbedParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__Alternatives


    // $ANTLR start rule__SimpleType__Group__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:361:1: rule__SimpleType__Group__0 : ( 'type' ) rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:365:1: ( ( 'type' ) rule__SimpleType__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:366:1: ( 'type' ) rule__SimpleType__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:366:1: ( 'type' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:367:1: 'type'
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__SimpleType__Group__0757); 
             after(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__0767);
            rule__SimpleType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__0


    // $ANTLR start rule__SimpleType__Group__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:381:1: rule__SimpleType__Group__1 : ( ( rule__SimpleType__NameAssignment_1 ) ) rule__SimpleType__Group__2 ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:385:1: ( ( ( rule__SimpleType__NameAssignment_1 ) ) rule__SimpleType__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:386:1: ( ( rule__SimpleType__NameAssignment_1 ) ) rule__SimpleType__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:386:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:387:1: ( rule__SimpleType__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:388:1: ( rule__SimpleType__NameAssignment_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:388:2: rule__SimpleType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1795);
            rule__SimpleType__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__SimpleType__Group__2_in_rule__SimpleType__Group__1804);
            rule__SimpleType__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__1


    // $ANTLR start rule__SimpleType__Group__2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:399:1: rule__SimpleType__Group__2 : ( ( rule__SimpleType__Group_2__0 )? ) ;
    public final void rule__SimpleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:403:1: ( ( ( rule__SimpleType__Group_2__0 )? ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:404:1: ( ( rule__SimpleType__Group_2__0 )? )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:404:1: ( ( rule__SimpleType__Group_2__0 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:405:1: ( rule__SimpleType__Group_2__0 )?
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:406:1: ( rule__SimpleType__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:406:2: rule__SimpleType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SimpleType__Group_2__0_in_rule__SimpleType__Group__2832);
                    rule__SimpleType__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__2


    // $ANTLR start rule__SimpleType__Group_2__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:422:1: rule__SimpleType__Group_2__0 : ( 'is' ) rule__SimpleType__Group_2__1 ;
    public final void rule__SimpleType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:426:1: ( ( 'is' ) rule__SimpleType__Group_2__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:427:1: ( 'is' ) rule__SimpleType__Group_2__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:427:1: ( 'is' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:428:1: 'is'
            {
             before(grammarAccess.getSimpleTypeAccess().getIsKeyword_2_0()); 
            match(input,12,FOLLOW_12_in_rule__SimpleType__Group_2__0874); 
             after(grammarAccess.getSimpleTypeAccess().getIsKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleType__Group_2__1_in_rule__SimpleType__Group_2__0884);
            rule__SimpleType__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group_2__0


    // $ANTLR start rule__SimpleType__Group_2__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:442:1: rule__SimpleType__Group_2__1 : ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) ) ;
    public final void rule__SimpleType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:446:1: ( ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:447:1: ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:447:1: ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:448:1: ( rule__SimpleType__MappedTypeAssignment_2_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getMappedTypeAssignment_2_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:449:1: ( rule__SimpleType__MappedTypeAssignment_2_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:449:2: rule__SimpleType__MappedTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SimpleType__MappedTypeAssignment_2_1_in_rule__SimpleType__Group_2__1912);
            rule__SimpleType__MappedTypeAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getMappedTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group_2__1


    // $ANTLR start rule__JAVAID__Group__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:463:1: rule__JAVAID__Group__0 : ( ( rule__JAVAID__NameAssignment_0 ) ) rule__JAVAID__Group__1 ;
    public final void rule__JAVAID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:467:1: ( ( ( rule__JAVAID__NameAssignment_0 ) ) rule__JAVAID__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:468:1: ( ( rule__JAVAID__NameAssignment_0 ) ) rule__JAVAID__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:468:1: ( ( rule__JAVAID__NameAssignment_0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:469:1: ( rule__JAVAID__NameAssignment_0 )
            {
             before(grammarAccess.getJAVAIDAccess().getNameAssignment_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:470:1: ( rule__JAVAID__NameAssignment_0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:470:2: rule__JAVAID__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__JAVAID__NameAssignment_0_in_rule__JAVAID__Group__0950);
            rule__JAVAID__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getJAVAIDAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__JAVAID__Group__1_in_rule__JAVAID__Group__0959);
            rule__JAVAID__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JAVAID__Group__0


    // $ANTLR start rule__JAVAID__Group__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:481:1: rule__JAVAID__Group__1 : ( ( rule__JAVAID__Group_1__0 )* ) ;
    public final void rule__JAVAID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:485:1: ( ( ( rule__JAVAID__Group_1__0 )* ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:486:1: ( ( rule__JAVAID__Group_1__0 )* )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:486:1: ( ( rule__JAVAID__Group_1__0 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:487:1: ( rule__JAVAID__Group_1__0 )*
            {
             before(grammarAccess.getJAVAIDAccess().getGroup_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:488:1: ( rule__JAVAID__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:488:2: rule__JAVAID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__JAVAID__Group_1__0_in_rule__JAVAID__Group__1987);
            	    rule__JAVAID__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getJAVAIDAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JAVAID__Group__1


    // $ANTLR start rule__JAVAID__Group_1__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:502:1: rule__JAVAID__Group_1__0 : ( '.' ) rule__JAVAID__Group_1__1 ;
    public final void rule__JAVAID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:506:1: ( ( '.' ) rule__JAVAID__Group_1__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:507:1: ( '.' ) rule__JAVAID__Group_1__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:507:1: ( '.' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:508:1: '.'
            {
             before(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__JAVAID__Group_1__01027); 
             after(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__JAVAID__Group_1__1_in_rule__JAVAID__Group_1__01037);
            rule__JAVAID__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JAVAID__Group_1__0


    // $ANTLR start rule__JAVAID__Group_1__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:522:1: rule__JAVAID__Group_1__1 : ( RULE_ID ) ;
    public final void rule__JAVAID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:526:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:527:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:527:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:528:1: RULE_ID
            {
             before(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JAVAID__Group_1__11065); 
             after(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JAVAID__Group_1__1


    // $ANTLR start rule__Entity__Group__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:543:1: rule__Entity__Group__0 : ( 'entity' ) rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:547:1: ( ( 'entity' ) rule__Entity__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:548:1: ( 'entity' ) rule__Entity__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:548:1: ( 'entity' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:549:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Entity__Group__01103); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01113);
            rule__Entity__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__0


    // $ANTLR start rule__Entity__Group__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:563:1: rule__Entity__Group__1 : ( ruleEntityBody ) ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:567:1: ( ( ruleEntityBody ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:568:1: ( ruleEntityBody )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:568:1: ( ruleEntityBody )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:569:1: ruleEntityBody
            {
             before(grammarAccess.getEntityAccess().getEntityBodyParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleEntityBody_in_rule__Entity__Group__11141);
            ruleEntityBody();
            _fsp--;

             after(grammarAccess.getEntityAccess().getEntityBodyParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__1


    // $ANTLR start rule__Attribute__Group__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:584:1: rule__Attribute__Group__0 : ( ( rule__Attribute__TypeAssignment_0 ) ) rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:588:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) rule__Attribute__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:589:1: ( ( rule__Attribute__TypeAssignment_0 ) ) rule__Attribute__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:589:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:590:1: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:591:1: ( rule__Attribute__TypeAssignment_0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:591:2: rule__Attribute__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__01178);
            rule__Attribute__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01187);
            rule__Attribute__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__0


    // $ANTLR start rule__Attribute__Group__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:602:1: rule__Attribute__Group__1 : ( ( rule__Attribute__ManyAssignment_1 )? ) rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:606:1: ( ( ( rule__Attribute__ManyAssignment_1 )? ) rule__Attribute__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:607:1: ( ( rule__Attribute__ManyAssignment_1 )? ) rule__Attribute__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:607:1: ( ( rule__Attribute__ManyAssignment_1 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:608:1: ( rule__Attribute__ManyAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getManyAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:609:1: ( rule__Attribute__ManyAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:609:2: rule__Attribute__ManyAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__ManyAssignment_1_in_rule__Attribute__Group__11215);
                    rule__Attribute__ManyAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getManyAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11225);
            rule__Attribute__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__1


    // $ANTLR start rule__Attribute__Group__2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:620:1: rule__Attribute__Group__2 : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:624:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:625:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:625:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:626:1: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:627:1: ( rule__Attribute__NameAssignment_2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:627:2: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__21253);
            rule__Attribute__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__2


    // $ANTLR start rule__Enum__Group__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:643:1: rule__Enum__Group__0 : ( 'enum' ) rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:647:1: ( ( 'enum' ) rule__Enum__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:648:1: ( 'enum' ) rule__Enum__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:648:1: ( 'enum' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:649:1: 'enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Enum__Group__01294); 
             after(grammarAccess.getEnumAccess().getEnumKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__01304);
            rule__Enum__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enum__Group__0


    // $ANTLR start rule__Enum__Group__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:663:1: rule__Enum__Group__1 : ( ( rule__Enum__NameAssignment_1 ) ) rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:667:1: ( ( ( rule__Enum__NameAssignment_1 ) ) rule__Enum__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:668:1: ( ( rule__Enum__NameAssignment_1 ) ) rule__Enum__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:668:1: ( ( rule__Enum__NameAssignment_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:669:1: ( rule__Enum__NameAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:670:1: ( rule__Enum__NameAssignment_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:670:2: rule__Enum__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__11332);
            rule__Enum__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEnumAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__11341);
            rule__Enum__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enum__Group__1


    // $ANTLR start rule__Enum__Group__2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:681:1: rule__Enum__Group__2 : ( '{' ) rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:685:1: ( ( '{' ) rule__Enum__Group__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:686:1: ( '{' ) rule__Enum__Group__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:686:1: ( '{' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:687:1: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Enum__Group__21370); 
             after(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__21380);
            rule__Enum__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enum__Group__2


    // $ANTLR start rule__Enum__Group__3
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:701:1: rule__Enum__Group__3 : ( ( rule__Enum__LiteralsAssignment_3 )* ) rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:705:1: ( ( ( rule__Enum__LiteralsAssignment_3 )* ) rule__Enum__Group__4 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:706:1: ( ( rule__Enum__LiteralsAssignment_3 )* ) rule__Enum__Group__4
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:706:1: ( ( rule__Enum__LiteralsAssignment_3 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:707:1: ( rule__Enum__LiteralsAssignment_3 )*
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_3()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:708:1: ( rule__Enum__LiteralsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:708:2: rule__Enum__LiteralsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enum__LiteralsAssignment_3_in_rule__Enum__Group__31408);
            	    rule__Enum__LiteralsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEnumAccess().getLiteralsAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__31418);
            rule__Enum__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enum__Group__3


    // $ANTLR start rule__Enum__Group__4
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:719:1: rule__Enum__Group__4 : ( '}' ) ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:723:1: ( ( '}' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:724:1: ( '}' )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:724:1: ( '}' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:725:1: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Enum__Group__41447); 
             after(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enum__Group__4


    // $ANTLR start rule__EnumLiteral__Group__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:748:1: rule__EnumLiteral__Group__0 : ( ( rule__EnumLiteral__NameAssignment_0 ) ) rule__EnumLiteral__Group__1 ;
    public final void rule__EnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:752:1: ( ( ( rule__EnumLiteral__NameAssignment_0 ) ) rule__EnumLiteral__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:753:1: ( ( rule__EnumLiteral__NameAssignment_0 ) ) rule__EnumLiteral__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:753:1: ( ( rule__EnumLiteral__NameAssignment_0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:754:1: ( rule__EnumLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumLiteralAccess().getNameAssignment_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:755:1: ( rule__EnumLiteral__NameAssignment_0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:755:2: rule__EnumLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumLiteral__NameAssignment_0_in_rule__EnumLiteral__Group__01492);
            rule__EnumLiteral__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getEnumLiteralAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__EnumLiteral__Group__1_in_rule__EnumLiteral__Group__01501);
            rule__EnumLiteral__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumLiteral__Group__0


    // $ANTLR start rule__EnumLiteral__Group__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:766:1: rule__EnumLiteral__Group__1 : ( '(' ) rule__EnumLiteral__Group__2 ;
    public final void rule__EnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:770:1: ( ( '(' ) rule__EnumLiteral__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:771:1: ( '(' ) rule__EnumLiteral__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:771:1: ( '(' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:772:1: '('
            {
             before(grammarAccess.getEnumLiteralAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__EnumLiteral__Group__11530); 
             after(grammarAccess.getEnumLiteralAccess().getLeftParenthesisKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__EnumLiteral__Group__2_in_rule__EnumLiteral__Group__11540);
            rule__EnumLiteral__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumLiteral__Group__1


    // $ANTLR start rule__EnumLiteral__Group__2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:786:1: rule__EnumLiteral__Group__2 : ( ( rule__EnumLiteral__OrdinalAssignment_2 ) ) rule__EnumLiteral__Group__3 ;
    public final void rule__EnumLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:790:1: ( ( ( rule__EnumLiteral__OrdinalAssignment_2 ) ) rule__EnumLiteral__Group__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:791:1: ( ( rule__EnumLiteral__OrdinalAssignment_2 ) ) rule__EnumLiteral__Group__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:791:1: ( ( rule__EnumLiteral__OrdinalAssignment_2 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:792:1: ( rule__EnumLiteral__OrdinalAssignment_2 )
            {
             before(grammarAccess.getEnumLiteralAccess().getOrdinalAssignment_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:793:1: ( rule__EnumLiteral__OrdinalAssignment_2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:793:2: rule__EnumLiteral__OrdinalAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumLiteral__OrdinalAssignment_2_in_rule__EnumLiteral__Group__21568);
            rule__EnumLiteral__OrdinalAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getEnumLiteralAccess().getOrdinalAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__EnumLiteral__Group__3_in_rule__EnumLiteral__Group__21577);
            rule__EnumLiteral__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumLiteral__Group__2


    // $ANTLR start rule__EnumLiteral__Group__3
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:804:1: rule__EnumLiteral__Group__3 : ( ')' ) ;
    public final void rule__EnumLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:808:1: ( ( ')' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:809:1: ( ')' )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:809:1: ( ')' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:810:1: ')'
            {
             before(grammarAccess.getEnumLiteralAccess().getRightParenthesisKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__EnumLiteral__Group__31606); 
             after(grammarAccess.getEnumLiteralAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumLiteral__Group__3


    // $ANTLR start rule__Embed__Group__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:831:1: rule__Embed__Group__0 : ( 'embed' ) rule__Embed__Group__1 ;
    public final void rule__Embed__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:835:1: ( ( 'embed' ) rule__Embed__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:836:1: ( 'embed' ) rule__Embed__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:836:1: ( 'embed' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:837:1: 'embed'
            {
             before(grammarAccess.getEmbedAccess().getEmbedKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Embed__Group__01650); 
             after(grammarAccess.getEmbedAccess().getEmbedKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Embed__Group__1_in_rule__Embed__Group__01660);
            rule__Embed__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Embed__Group__0


    // $ANTLR start rule__Embed__Group__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:851:1: rule__Embed__Group__1 : ( ruleEntityBody ) ;
    public final void rule__Embed__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:855:1: ( ( ruleEntityBody ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:856:1: ( ruleEntityBody )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:856:1: ( ruleEntityBody )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:857:1: ruleEntityBody
            {
             before(grammarAccess.getEmbedAccess().getEntityBodyParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleEntityBody_in_rule__Embed__Group__11688);
            ruleEntityBody();
            _fsp--;

             after(grammarAccess.getEmbedAccess().getEntityBodyParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Embed__Group__1


    // $ANTLR start rule__EntityBody__Group__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:872:1: rule__EntityBody__Group__0 : ( ( rule__EntityBody__NameAssignment_0 ) ) rule__EntityBody__Group__1 ;
    public final void rule__EntityBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:876:1: ( ( ( rule__EntityBody__NameAssignment_0 ) ) rule__EntityBody__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:877:1: ( ( rule__EntityBody__NameAssignment_0 ) ) rule__EntityBody__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:877:1: ( ( rule__EntityBody__NameAssignment_0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:878:1: ( rule__EntityBody__NameAssignment_0 )
            {
             before(grammarAccess.getEntityBodyAccess().getNameAssignment_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:879:1: ( rule__EntityBody__NameAssignment_0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:879:2: rule__EntityBody__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EntityBody__NameAssignment_0_in_rule__EntityBody__Group__01725);
            rule__EntityBody__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getEntityBodyAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__EntityBody__Group__1_in_rule__EntityBody__Group__01734);
            rule__EntityBody__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EntityBody__Group__0


    // $ANTLR start rule__EntityBody__Group__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:890:1: rule__EntityBody__Group__1 : ( ( rule__EntityBody__Group_1__0 )? ) rule__EntityBody__Group__2 ;
    public final void rule__EntityBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:894:1: ( ( ( rule__EntityBody__Group_1__0 )? ) rule__EntityBody__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:895:1: ( ( rule__EntityBody__Group_1__0 )? ) rule__EntityBody__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:895:1: ( ( rule__EntityBody__Group_1__0 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:896:1: ( rule__EntityBody__Group_1__0 )?
            {
             before(grammarAccess.getEntityBodyAccess().getGroup_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:897:1: ( rule__EntityBody__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:897:2: rule__EntityBody__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EntityBody__Group_1__0_in_rule__EntityBody__Group__11762);
                    rule__EntityBody__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityBodyAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__EntityBody__Group__2_in_rule__EntityBody__Group__11772);
            rule__EntityBody__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EntityBody__Group__1


    // $ANTLR start rule__EntityBody__Group__2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:908:1: rule__EntityBody__Group__2 : ( '{' ) rule__EntityBody__Group__3 ;
    public final void rule__EntityBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:912:1: ( ( '{' ) rule__EntityBody__Group__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:913:1: ( '{' ) rule__EntityBody__Group__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:913:1: ( '{' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:914:1: '{'
            {
             before(grammarAccess.getEntityBodyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__EntityBody__Group__21801); 
             after(grammarAccess.getEntityBodyAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__EntityBody__Group__3_in_rule__EntityBody__Group__21811);
            rule__EntityBody__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EntityBody__Group__2


    // $ANTLR start rule__EntityBody__Group__3
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:928:1: rule__EntityBody__Group__3 : ( ( rule__EntityBody__AttributesAssignment_3 )* ) rule__EntityBody__Group__4 ;
    public final void rule__EntityBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:932:1: ( ( ( rule__EntityBody__AttributesAssignment_3 )* ) rule__EntityBody__Group__4 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:933:1: ( ( rule__EntityBody__AttributesAssignment_3 )* ) rule__EntityBody__Group__4
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:933:1: ( ( rule__EntityBody__AttributesAssignment_3 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:934:1: ( rule__EntityBody__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEntityBodyAccess().getAttributesAssignment_3()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:935:1: ( rule__EntityBody__AttributesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:935:2: rule__EntityBody__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__EntityBody__AttributesAssignment_3_in_rule__EntityBody__Group__31839);
            	    rule__EntityBody__AttributesAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEntityBodyAccess().getAttributesAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__EntityBody__Group__4_in_rule__EntityBody__Group__31849);
            rule__EntityBody__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EntityBody__Group__3


    // $ANTLR start rule__EntityBody__Group__4
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:946:1: rule__EntityBody__Group__4 : ( '}' ) ;
    public final void rule__EntityBody__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:950:1: ( ( '}' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:951:1: ( '}' )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:951:1: ( '}' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:952:1: '}'
            {
             before(grammarAccess.getEntityBodyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__EntityBody__Group__41878); 
             after(grammarAccess.getEntityBodyAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EntityBody__Group__4


    // $ANTLR start rule__EntityBody__Group_1__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:975:1: rule__EntityBody__Group_1__0 : ( 'extends' ) rule__EntityBody__Group_1__1 ;
    public final void rule__EntityBody__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:979:1: ( ( 'extends' ) rule__EntityBody__Group_1__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:980:1: ( 'extends' ) rule__EntityBody__Group_1__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:980:1: ( 'extends' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:981:1: 'extends'
            {
             before(grammarAccess.getEntityBodyAccess().getExtendsKeyword_1_0()); 
            match(input,21,FOLLOW_21_in_rule__EntityBody__Group_1__01924); 
             after(grammarAccess.getEntityBodyAccess().getExtendsKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__EntityBody__Group_1__1_in_rule__EntityBody__Group_1__01934);
            rule__EntityBody__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EntityBody__Group_1__0


    // $ANTLR start rule__EntityBody__Group_1__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:995:1: rule__EntityBody__Group_1__1 : ( ( rule__EntityBody__SuperEntityAssignment_1_1 ) ) ;
    public final void rule__EntityBody__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:999:1: ( ( ( rule__EntityBody__SuperEntityAssignment_1_1 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1000:1: ( ( rule__EntityBody__SuperEntityAssignment_1_1 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1000:1: ( ( rule__EntityBody__SuperEntityAssignment_1_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1001:1: ( rule__EntityBody__SuperEntityAssignment_1_1 )
            {
             before(grammarAccess.getEntityBodyAccess().getSuperEntityAssignment_1_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1002:1: ( rule__EntityBody__SuperEntityAssignment_1_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1002:2: rule__EntityBody__SuperEntityAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EntityBody__SuperEntityAssignment_1_1_in_rule__EntityBody__Group_1__11962);
            rule__EntityBody__SuperEntityAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getEntityBodyAccess().getSuperEntityAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EntityBody__Group_1__1


    // $ANTLR start rule__Model__TypesAssignment
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1016:1: rule__Model__TypesAssignment : ( ruleType ) ;
    public final void rule__Model__TypesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1020:1: ( ( ruleType ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1021:1: ( ruleType )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1021:1: ( ruleType )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1022:1: ruleType
            {
             before(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Model__TypesAssignment2000);
            ruleType();
            _fsp--;

             after(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__TypesAssignment


    // $ANTLR start rule__SimpleType__NameAssignment_1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1031:1: rule__SimpleType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1035:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1036:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1036:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1037:1: RULE_ID
            {
             before(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_12031); 
             after(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__NameAssignment_1


    // $ANTLR start rule__SimpleType__MappedTypeAssignment_2_1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1046:1: rule__SimpleType__MappedTypeAssignment_2_1 : ( ruleJAVAID ) ;
    public final void rule__SimpleType__MappedTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1050:1: ( ( ruleJAVAID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1051:1: ( ruleJAVAID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1051:1: ( ruleJAVAID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1052:1: ruleJAVAID
            {
             before(grammarAccess.getSimpleTypeAccess().getMappedTypeJAVAIDParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleJAVAID_in_rule__SimpleType__MappedTypeAssignment_2_12062);
            ruleJAVAID();
            _fsp--;

             after(grammarAccess.getSimpleTypeAccess().getMappedTypeJAVAIDParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__MappedTypeAssignment_2_1


    // $ANTLR start rule__JAVAID__NameAssignment_0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1061:1: rule__JAVAID__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__JAVAID__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1065:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1066:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1066:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1067:1: RULE_ID
            {
             before(grammarAccess.getJAVAIDAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JAVAID__NameAssignment_02093); 
             after(grammarAccess.getJAVAIDAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JAVAID__NameAssignment_0


    // $ANTLR start rule__Attribute__TypeAssignment_0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1076:1: rule__Attribute__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1080:1: ( ( ( RULE_ID ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1081:1: ( ( RULE_ID ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1081:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1082:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1083:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1084:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_02128); 
             after(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__TypeAssignment_0


    // $ANTLR start rule__Attribute__ManyAssignment_1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1095:1: rule__Attribute__ManyAssignment_1 : ( ( '*' ) ) ;
    public final void rule__Attribute__ManyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1099:1: ( ( ( '*' ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1100:1: ( ( '*' ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1100:1: ( ( '*' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1101:1: ( '*' )
            {
             before(grammarAccess.getAttributeAccess().getManyAsteriskKeyword_1_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1102:1: ( '*' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1103:1: '*'
            {
             before(grammarAccess.getAttributeAccess().getManyAsteriskKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Attribute__ManyAssignment_12168); 
             after(grammarAccess.getAttributeAccess().getManyAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getAttributeAccess().getManyAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__ManyAssignment_1


    // $ANTLR start rule__Attribute__NameAssignment_2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1118:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1122:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1123:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1123:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1124:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_22207); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__NameAssignment_2


    // $ANTLR start rule__Enum__NameAssignment_1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1133:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1137:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1138:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1138:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1139:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_12238); 
             after(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enum__NameAssignment_1


    // $ANTLR start rule__Enum__LiteralsAssignment_3
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1148:1: rule__Enum__LiteralsAssignment_3 : ( ruleEnumLiteral ) ;
    public final void rule__Enum__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1152:1: ( ( ruleEnumLiteral ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1153:1: ( ruleEnumLiteral )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1153:1: ( ruleEnumLiteral )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1154:1: ruleEnumLiteral
            {
             before(grammarAccess.getEnumAccess().getLiteralsEnumLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_rule__Enum__LiteralsAssignment_32269);
            ruleEnumLiteral();
            _fsp--;

             after(grammarAccess.getEnumAccess().getLiteralsEnumLiteralParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enum__LiteralsAssignment_3


    // $ANTLR start rule__EnumLiteral__NameAssignment_0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1163:1: rule__EnumLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1167:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1168:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1168:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1169:1: RULE_ID
            {
             before(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumLiteral__NameAssignment_02300); 
             after(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumLiteral__NameAssignment_0


    // $ANTLR start rule__EnumLiteral__OrdinalAssignment_2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1178:1: rule__EnumLiteral__OrdinalAssignment_2 : ( RULE_INT ) ;
    public final void rule__EnumLiteral__OrdinalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1182:1: ( ( RULE_INT ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1183:1: ( RULE_INT )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1183:1: ( RULE_INT )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1184:1: RULE_INT
            {
             before(grammarAccess.getEnumLiteralAccess().getOrdinalINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumLiteral__OrdinalAssignment_22331); 
             after(grammarAccess.getEnumLiteralAccess().getOrdinalINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumLiteral__OrdinalAssignment_2


    // $ANTLR start rule__EntityBody__NameAssignment_0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1193:1: rule__EntityBody__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EntityBody__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1197:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1198:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1198:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1199:1: RULE_ID
            {
             before(grammarAccess.getEntityBodyAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityBody__NameAssignment_02362); 
             after(grammarAccess.getEntityBodyAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EntityBody__NameAssignment_0


    // $ANTLR start rule__EntityBody__SuperEntityAssignment_1_1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1208:1: rule__EntityBody__SuperEntityAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__EntityBody__SuperEntityAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1212:1: ( ( ( RULE_ID ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1213:1: ( ( RULE_ID ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1213:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1214:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityBodyAccess().getSuperEntityEntityCrossReference_1_1_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1215:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1216:1: RULE_ID
            {
             before(grammarAccess.getEntityBodyAccess().getSuperEntityEntityIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityBody__SuperEntityAssignment_1_12397); 
             after(grammarAccess.getEntityBodyAccess().getSuperEntityEntityIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getEntityBodyAccess().getSuperEntityEntityCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EntityBody__SuperEntityAssignment_1_1


    // $ANTLR start rule__EntityBody__AttributesAssignment_3
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1227:1: rule__EntityBody__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__EntityBody__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1231:1: ( ( ruleAttribute ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1232:1: ( ruleAttribute )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1232:1: ( ruleAttribute )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1233:1: ruleAttribute
            {
             before(grammarAccess.getEntityBodyAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__EntityBody__AttributesAssignment_32432);
            ruleAttribute();
            _fsp--;

             after(grammarAccess.getEntityBodyAccess().getAttributesAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EntityBody__AttributesAssignment_3


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TypesAssignment_in_ruleModel94 = new BitSet(new long[]{0x000000000010C802L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_entryRuleJAVAID241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJAVAID248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group__0_in_ruleJAVAID275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteral488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteral__Group__0_in_ruleEnumLiteral515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbed_in_entryRuleEmbed541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmbed548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Embed__Group__0_in_ruleEmbed575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityBody_in_entryRuleEntityBody601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityBody608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBody__Group__0_in_ruleEntityBody635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__Type__Alternatives671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__Type__Alternatives705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbed_in_rule__Type__Alternatives722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SimpleType__Group__0757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__0767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1795 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__2_in_rule__SimpleType__Group__1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group_2__0_in_rule__SimpleType__Group__2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SimpleType__Group_2__0874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleType__Group_2__1_in_rule__SimpleType__Group_2__0884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__MappedTypeAssignment_2_1_in_rule__SimpleType__Group_2__1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JAVAID__NameAssignment_0_in_rule__JAVAID__Group__0950 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group__1_in_rule__JAVAID__Group__0959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group_1__0_in_rule__JAVAID__Group__1987 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_rule__JAVAID__Group_1__01027 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JAVAID__Group_1__1_in_rule__JAVAID__Group_1__01037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JAVAID__Group_1__11065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Entity__Group__01103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityBody_in_rule__Entity__Group__11141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__01178 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ManyAssignment_1_in_rule__Attribute__Group__11215 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__21253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Enum__Group__01294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__01304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__11332 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__11341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Enum__Group__21370 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__21380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__LiteralsAssignment_3_in_rule__Enum__Group__31408 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__31418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Enum__Group__41447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteral__NameAssignment_0_in_rule__EnumLiteral__Group__01492 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__EnumLiteral__Group__1_in_rule__EnumLiteral__Group__01501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EnumLiteral__Group__11530 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumLiteral__Group__2_in_rule__EnumLiteral__Group__11540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteral__OrdinalAssignment_2_in_rule__EnumLiteral__Group__21568 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EnumLiteral__Group__3_in_rule__EnumLiteral__Group__21577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EnumLiteral__Group__31606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Embed__Group__01650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Embed__Group__1_in_rule__Embed__Group__01660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityBody_in_rule__Embed__Group__11688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBody__NameAssignment_0_in_rule__EntityBody__Group__01725 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_rule__EntityBody__Group__1_in_rule__EntityBody__Group__01734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBody__Group_1__0_in_rule__EntityBody__Group__11762 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__EntityBody__Group__2_in_rule__EntityBody__Group__11772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EntityBody__Group__21801 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__EntityBody__Group__3_in_rule__EntityBody__Group__21811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBody__AttributesAssignment_3_in_rule__EntityBody__Group__31839 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__EntityBody__Group__4_in_rule__EntityBody__Group__31849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EntityBody__Group__41878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EntityBody__Group_1__01924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityBody__Group_1__1_in_rule__EntityBody__Group_1__01934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBody__SuperEntityAssignment_1_1_in_rule__EntityBody__Group_1__11962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Model__TypesAssignment2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_12031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_rule__SimpleType__MappedTypeAssignment_2_12062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JAVAID__NameAssignment_02093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_02128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Attribute__ManyAssignment_12168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_22207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_12238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_rule__Enum__LiteralsAssignment_32269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumLiteral__NameAssignment_02300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumLiteral__OrdinalAssignment_22331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityBody__NameAssignment_02362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityBody__SuperEntityAssignment_1_12397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__EntityBody__AttributesAssignment_32432 = new BitSet(new long[]{0x0000000000000002L});

}