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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'{'", "'projectName'", "':'", "'basePackage'", "'}'", "'type'", "'is'", "'.'", "'entity'", "'extends'", "'embed'", "'enum'", "'('", "')'", "'*'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:63:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:67:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:68:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:68:1: ( ( rule__Model__Group__0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:69:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:70:1: ( rule__Model__Group__0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:70:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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


    // $ANTLR start entryRuleProject
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:82:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:82:18: ( ruleProject EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:83:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject120);
            ruleProject();
            _fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject127); 

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
    // $ANTLR end entryRuleProject


    // $ANTLR start ruleProject
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:90:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:94:2: ( ( ( rule__Project__Group__0 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:95:1: ( ( rule__Project__Group__0 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:95:1: ( ( rule__Project__Group__0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:96:1: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:97:1: ( rule__Project__Group__0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:97:2: rule__Project__Group__0
            {
            pushFollow(FOLLOW_rule__Project__Group__0_in_ruleProject154);
            rule__Project__Group__0();
            _fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

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
    // $ANTLR end ruleProject


    // $ANTLR start entryRuleType
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:109:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:109:15: ( ruleType EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:110:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType180);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType187); 

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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:117:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:121:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:122:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:122:1: ( ( rule__Type__Alternatives ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:123:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:124:1: ( rule__Type__Alternatives )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:124:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType214);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:136:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:136:21: ( ruleSimpleType EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:137:1: ruleSimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType240);
            ruleSimpleType();
            _fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType247); 

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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:144:1: ruleSimpleType : ( ( rule__SimpleType__Group__0 ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:148:2: ( ( ( rule__SimpleType__Group__0 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:149:1: ( ( rule__SimpleType__Group__0 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:149:1: ( ( rule__SimpleType__Group__0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:150:1: ( rule__SimpleType__Group__0 )
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:151:1: ( rule__SimpleType__Group__0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:151:2: rule__SimpleType__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType274);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:163:1: entryRuleJAVAID : ruleJAVAID EOF ;
    public final void entryRuleJAVAID() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:163:17: ( ruleJAVAID EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:164:1: ruleJAVAID EOF
            {
             before(grammarAccess.getJAVAIDRule()); 
            pushFollow(FOLLOW_ruleJAVAID_in_entryRuleJAVAID300);
            ruleJAVAID();
            _fsp--;

             after(grammarAccess.getJAVAIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJAVAID307); 

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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:171:1: ruleJAVAID : ( ( rule__JAVAID__Group__0 ) ) ;
    public final void ruleJAVAID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:175:2: ( ( ( rule__JAVAID__Group__0 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:176:1: ( ( rule__JAVAID__Group__0 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:176:1: ( ( rule__JAVAID__Group__0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:177:1: ( rule__JAVAID__Group__0 )
            {
             before(grammarAccess.getJAVAIDAccess().getGroup()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:178:1: ( rule__JAVAID__Group__0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:178:2: rule__JAVAID__Group__0
            {
            pushFollow(FOLLOW_rule__JAVAID__Group__0_in_ruleJAVAID334);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:190:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:190:17: ( ruleEntity EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:191:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity360);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity367); 

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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:198:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:202:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:203:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:203:1: ( ( rule__Entity__Group__0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:204:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:205:1: ( rule__Entity__Group__0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:205:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity394);
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


    // $ANTLR start entryRuleEmbed
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:217:1: entryRuleEmbed : ruleEmbed EOF ;
    public final void entryRuleEmbed() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:217:16: ( ruleEmbed EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:218:1: ruleEmbed EOF
            {
             before(grammarAccess.getEmbedRule()); 
            pushFollow(FOLLOW_ruleEmbed_in_entryRuleEmbed420);
            ruleEmbed();
            _fsp--;

             after(grammarAccess.getEmbedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmbed427); 

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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:225:1: ruleEmbed : ( ( rule__Embed__Group__0 ) ) ;
    public final void ruleEmbed() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:229:2: ( ( ( rule__Embed__Group__0 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:230:1: ( ( rule__Embed__Group__0 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:230:1: ( ( rule__Embed__Group__0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:231:1: ( rule__Embed__Group__0 )
            {
             before(grammarAccess.getEmbedAccess().getGroup()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:232:1: ( rule__Embed__Group__0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:232:2: rule__Embed__Group__0
            {
            pushFollow(FOLLOW_rule__Embed__Group__0_in_ruleEmbed454);
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


    // $ANTLR start entryRuleAttribute
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:244:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:244:20: ( ruleAttribute EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:245:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute480);
            ruleAttribute();
            _fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute487); 

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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:252:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:256:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:257:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:257:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:258:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:259:1: ( rule__Attribute__Group__0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:259:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute514);
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


    // $ANTLR start entryRuleEnumeration
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:271:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:271:22: ( ruleEnumeration EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:272:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration540);
            ruleEnumeration();
            _fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration547); 

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
    // $ANTLR end entryRuleEnumeration


    // $ANTLR start ruleEnumeration
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:279:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:283:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:284:1: ( ( rule__Enumeration__Group__0 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:284:1: ( ( rule__Enumeration__Group__0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:285:1: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:286:1: ( rule__Enumeration__Group__0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:286:2: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration574);
            rule__Enumeration__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getGroup()); 

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
    // $ANTLR end ruleEnumeration


    // $ANTLR start entryRuleEnumerationLiteral
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:298:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:298:29: ( ruleEnumerationLiteral EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:299:1: ruleEnumerationLiteral EOF
            {
             before(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral600);
            ruleEnumerationLiteral();
            _fsp--;

             after(grammarAccess.getEnumerationLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral607); 

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
    // $ANTLR end entryRuleEnumerationLiteral


    // $ANTLR start ruleEnumerationLiteral
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:306:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:310:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:311:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:311:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:312:1: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:313:1: ( rule__EnumerationLiteral__Group__0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:313:2: rule__EnumerationLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral634);
            rule__EnumerationLiteral__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getGroup()); 

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
    // $ANTLR end ruleEnumerationLiteral


    // $ANTLR start rule__Type__Alternatives
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:325:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) | ( ruleEnumeration ) | ( ruleEmbed ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:329:1: ( ( ruleSimpleType ) | ( ruleEntity ) | ( ruleEnumeration ) | ( ruleEmbed ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 20:
                {
                alt1=2;
                }
                break;
            case 23:
                {
                alt1=3;
                }
                break;
            case 22:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("325:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) | ( ruleEnumeration ) | ( ruleEmbed ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:330:1: ( ruleSimpleType )
                    {
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:330:1: ( ruleSimpleType )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:331:1: ruleSimpleType
                    {
                     before(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleType_in_rule__Type__Alternatives670);
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
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives687);
                    ruleEntity();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:342:6: ( ruleEnumeration )
                    {
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:342:6: ( ruleEnumeration )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:343:1: ruleEnumeration
                    {
                     before(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnumeration_in_rule__Type__Alternatives704);
                    ruleEnumeration();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2()); 

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
                    pushFollow(FOLLOW_ruleEmbed_in_rule__Type__Alternatives721);
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


    // $ANTLR start rule__Model__Group__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:361:1: rule__Model__Group__0 : ( ( rule__Model__ProjectAssignment_0 ) ) rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:365:1: ( ( ( rule__Model__ProjectAssignment_0 ) ) rule__Model__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:366:1: ( ( rule__Model__ProjectAssignment_0 ) ) rule__Model__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:366:1: ( ( rule__Model__ProjectAssignment_0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:367:1: ( rule__Model__ProjectAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getProjectAssignment_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:368:1: ( rule__Model__ProjectAssignment_0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:368:2: rule__Model__ProjectAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__ProjectAssignment_0_in_rule__Model__Group__0755);
            rule__Model__ProjectAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getProjectAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0764);
            rule__Model__Group__1();
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
    // $ANTLR end rule__Model__Group__0


    // $ANTLR start rule__Model__Group__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:379:1: rule__Model__Group__1 : ( ( rule__Model__TypesAssignment_1 )* ) ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:383:1: ( ( ( rule__Model__TypesAssignment_1 )* ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:384:1: ( ( rule__Model__TypesAssignment_1 )* )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:384:1: ( ( rule__Model__TypesAssignment_1 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:385:1: ( rule__Model__TypesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getTypesAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:386:1: ( rule__Model__TypesAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17||LA2_0==20||(LA2_0>=22 && LA2_0<=23)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:386:2: rule__Model__TypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__TypesAssignment_1_in_rule__Model__Group__1792);
            	    rule__Model__TypesAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTypesAssignment_1()); 

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
    // $ANTLR end rule__Model__Group__1


    // $ANTLR start rule__Project__Group__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:400:1: rule__Project__Group__0 : ( 'project' ) rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:404:1: ( ( 'project' ) rule__Project__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:405:1: ( 'project' ) rule__Project__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:405:1: ( 'project' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:406:1: 'project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Project__Group__0832); 
             after(grammarAccess.getProjectAccess().getProjectKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__1_in_rule__Project__Group__0842);
            rule__Project__Group__1();
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
    // $ANTLR end rule__Project__Group__0


    // $ANTLR start rule__Project__Group__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:420:1: rule__Project__Group__1 : ( '{' ) rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:424:1: ( ( '{' ) rule__Project__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:425:1: ( '{' ) rule__Project__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:425:1: ( '{' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:426:1: '{'
            {
             before(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Project__Group__1871); 
             after(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__2_in_rule__Project__Group__1881);
            rule__Project__Group__2();
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
    // $ANTLR end rule__Project__Group__1


    // $ANTLR start rule__Project__Group__2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:440:1: rule__Project__Group__2 : ( 'projectName' ) rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:444:1: ( ( 'projectName' ) rule__Project__Group__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:445:1: ( 'projectName' ) rule__Project__Group__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:445:1: ( 'projectName' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:446:1: 'projectName'
            {
             before(grammarAccess.getProjectAccess().getProjectNameKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Project__Group__2910); 
             after(grammarAccess.getProjectAccess().getProjectNameKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__3_in_rule__Project__Group__2920);
            rule__Project__Group__3();
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
    // $ANTLR end rule__Project__Group__2


    // $ANTLR start rule__Project__Group__3
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:460:1: rule__Project__Group__3 : ( ':' ) rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:464:1: ( ( ':' ) rule__Project__Group__4 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:465:1: ( ':' ) rule__Project__Group__4
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:465:1: ( ':' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:466:1: ':'
            {
             before(grammarAccess.getProjectAccess().getColonKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Project__Group__3949); 
             after(grammarAccess.getProjectAccess().getColonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__4_in_rule__Project__Group__3959);
            rule__Project__Group__4();
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
    // $ANTLR end rule__Project__Group__3


    // $ANTLR start rule__Project__Group__4
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:480:1: rule__Project__Group__4 : ( ( rule__Project__NameAssignment_4 ) ) rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:484:1: ( ( ( rule__Project__NameAssignment_4 ) ) rule__Project__Group__5 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:485:1: ( ( rule__Project__NameAssignment_4 ) ) rule__Project__Group__5
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:485:1: ( ( rule__Project__NameAssignment_4 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:486:1: ( rule__Project__NameAssignment_4 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_4()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:487:1: ( rule__Project__NameAssignment_4 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:487:2: rule__Project__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__Project__NameAssignment_4_in_rule__Project__Group__4987);
            rule__Project__NameAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getProjectAccess().getNameAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__5_in_rule__Project__Group__4996);
            rule__Project__Group__5();
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
    // $ANTLR end rule__Project__Group__4


    // $ANTLR start rule__Project__Group__5
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:498:1: rule__Project__Group__5 : ( 'basePackage' ) rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:502:1: ( ( 'basePackage' ) rule__Project__Group__6 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:503:1: ( 'basePackage' ) rule__Project__Group__6
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:503:1: ( 'basePackage' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:504:1: 'basePackage'
            {
             before(grammarAccess.getProjectAccess().getBasePackageKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Project__Group__51025); 
             after(grammarAccess.getProjectAccess().getBasePackageKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__6_in_rule__Project__Group__51035);
            rule__Project__Group__6();
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
    // $ANTLR end rule__Project__Group__5


    // $ANTLR start rule__Project__Group__6
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:518:1: rule__Project__Group__6 : ( ':' ) rule__Project__Group__7 ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:522:1: ( ( ':' ) rule__Project__Group__7 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:523:1: ( ':' ) rule__Project__Group__7
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:523:1: ( ':' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:524:1: ':'
            {
             before(grammarAccess.getProjectAccess().getColonKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Project__Group__61064); 
             after(grammarAccess.getProjectAccess().getColonKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__7_in_rule__Project__Group__61074);
            rule__Project__Group__7();
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
    // $ANTLR end rule__Project__Group__6


    // $ANTLR start rule__Project__Group__7
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:538:1: rule__Project__Group__7 : ( ( rule__Project__BasePackageAssignment_7 ) ) rule__Project__Group__8 ;
    public final void rule__Project__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:542:1: ( ( ( rule__Project__BasePackageAssignment_7 ) ) rule__Project__Group__8 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:543:1: ( ( rule__Project__BasePackageAssignment_7 ) ) rule__Project__Group__8
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:543:1: ( ( rule__Project__BasePackageAssignment_7 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:544:1: ( rule__Project__BasePackageAssignment_7 )
            {
             before(grammarAccess.getProjectAccess().getBasePackageAssignment_7()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:545:1: ( rule__Project__BasePackageAssignment_7 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:545:2: rule__Project__BasePackageAssignment_7
            {
            pushFollow(FOLLOW_rule__Project__BasePackageAssignment_7_in_rule__Project__Group__71102);
            rule__Project__BasePackageAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getProjectAccess().getBasePackageAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__8_in_rule__Project__Group__71111);
            rule__Project__Group__8();
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
    // $ANTLR end rule__Project__Group__7


    // $ANTLR start rule__Project__Group__8
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:556:1: rule__Project__Group__8 : ( '}' ) ;
    public final void rule__Project__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:560:1: ( ( '}' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:561:1: ( '}' )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:561:1: ( '}' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:562:1: '}'
            {
             before(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_16_in_rule__Project__Group__81140); 
             after(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end rule__Project__Group__8


    // $ANTLR start rule__SimpleType__Group__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:593:1: rule__SimpleType__Group__0 : ( 'type' ) rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:597:1: ( ( 'type' ) rule__SimpleType__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:598:1: ( 'type' ) rule__SimpleType__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:598:1: ( 'type' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:599:1: 'type'
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__SimpleType__Group__01194); 
             after(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__01204);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:613:1: rule__SimpleType__Group__1 : ( ( rule__SimpleType__NameAssignment_1 ) ) rule__SimpleType__Group__2 ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:617:1: ( ( ( rule__SimpleType__NameAssignment_1 ) ) rule__SimpleType__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:618:1: ( ( rule__SimpleType__NameAssignment_1 ) ) rule__SimpleType__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:618:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:619:1: ( rule__SimpleType__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:620:1: ( rule__SimpleType__NameAssignment_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:620:2: rule__SimpleType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__11232);
            rule__SimpleType__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__SimpleType__Group__2_in_rule__SimpleType__Group__11241);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:631:1: rule__SimpleType__Group__2 : ( ( rule__SimpleType__Group_2__0 )? ) ;
    public final void rule__SimpleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:635:1: ( ( ( rule__SimpleType__Group_2__0 )? ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:636:1: ( ( rule__SimpleType__Group_2__0 )? )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:636:1: ( ( rule__SimpleType__Group_2__0 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:637:1: ( rule__SimpleType__Group_2__0 )?
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:638:1: ( rule__SimpleType__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:638:2: rule__SimpleType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SimpleType__Group_2__0_in_rule__SimpleType__Group__21269);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:654:1: rule__SimpleType__Group_2__0 : ( 'is' ) rule__SimpleType__Group_2__1 ;
    public final void rule__SimpleType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:658:1: ( ( 'is' ) rule__SimpleType__Group_2__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:659:1: ( 'is' ) rule__SimpleType__Group_2__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:659:1: ( 'is' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:660:1: 'is'
            {
             before(grammarAccess.getSimpleTypeAccess().getIsKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__SimpleType__Group_2__01311); 
             after(grammarAccess.getSimpleTypeAccess().getIsKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleType__Group_2__1_in_rule__SimpleType__Group_2__01321);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:674:1: rule__SimpleType__Group_2__1 : ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) ) ;
    public final void rule__SimpleType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:678:1: ( ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:679:1: ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:679:1: ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:680:1: ( rule__SimpleType__MappedTypeAssignment_2_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getMappedTypeAssignment_2_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:681:1: ( rule__SimpleType__MappedTypeAssignment_2_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:681:2: rule__SimpleType__MappedTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SimpleType__MappedTypeAssignment_2_1_in_rule__SimpleType__Group_2__11349);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:695:1: rule__JAVAID__Group__0 : ( ( rule__JAVAID__NameAssignment_0 ) ) rule__JAVAID__Group__1 ;
    public final void rule__JAVAID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:699:1: ( ( ( rule__JAVAID__NameAssignment_0 ) ) rule__JAVAID__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:700:1: ( ( rule__JAVAID__NameAssignment_0 ) ) rule__JAVAID__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:700:1: ( ( rule__JAVAID__NameAssignment_0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:701:1: ( rule__JAVAID__NameAssignment_0 )
            {
             before(grammarAccess.getJAVAIDAccess().getNameAssignment_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:702:1: ( rule__JAVAID__NameAssignment_0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:702:2: rule__JAVAID__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__JAVAID__NameAssignment_0_in_rule__JAVAID__Group__01387);
            rule__JAVAID__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getJAVAIDAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__JAVAID__Group__1_in_rule__JAVAID__Group__01396);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:713:1: rule__JAVAID__Group__1 : ( ( rule__JAVAID__Group_1__0 )* ) ;
    public final void rule__JAVAID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:717:1: ( ( ( rule__JAVAID__Group_1__0 )* ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:718:1: ( ( rule__JAVAID__Group_1__0 )* )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:718:1: ( ( rule__JAVAID__Group_1__0 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:719:1: ( rule__JAVAID__Group_1__0 )*
            {
             before(grammarAccess.getJAVAIDAccess().getGroup_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:720:1: ( rule__JAVAID__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:720:2: rule__JAVAID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__JAVAID__Group_1__0_in_rule__JAVAID__Group__11424);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:734:1: rule__JAVAID__Group_1__0 : ( '.' ) rule__JAVAID__Group_1__1 ;
    public final void rule__JAVAID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:738:1: ( ( '.' ) rule__JAVAID__Group_1__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:739:1: ( '.' ) rule__JAVAID__Group_1__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:739:1: ( '.' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:740:1: '.'
            {
             before(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__JAVAID__Group_1__01464); 
             after(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__JAVAID__Group_1__1_in_rule__JAVAID__Group_1__01474);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:754:1: rule__JAVAID__Group_1__1 : ( RULE_ID ) ;
    public final void rule__JAVAID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:758:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:759:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:759:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:760:1: RULE_ID
            {
             before(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JAVAID__Group_1__11502); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:775:1: rule__Entity__Group__0 : ( 'entity' ) rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:779:1: ( ( 'entity' ) rule__Entity__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:780:1: ( 'entity' ) rule__Entity__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:780:1: ( 'entity' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:781:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Entity__Group__01540); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01550);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:795:1: rule__Entity__Group__1 : ( ( rule__Entity__NameAssignment_1 ) ) rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:799:1: ( ( ( rule__Entity__NameAssignment_1 ) ) rule__Entity__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:800:1: ( ( rule__Entity__NameAssignment_1 ) ) rule__Entity__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:800:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:801:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:802:1: ( rule__Entity__NameAssignment_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:802:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__11578);
            rule__Entity__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11587);
            rule__Entity__Group__2();
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
    // $ANTLR end rule__Entity__Group__1


    // $ANTLR start rule__Entity__Group__2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:813:1: rule__Entity__Group__2 : ( ( rule__Entity__Group_2__0 )? ) rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:817:1: ( ( ( rule__Entity__Group_2__0 )? ) rule__Entity__Group__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:818:1: ( ( rule__Entity__Group_2__0 )? ) rule__Entity__Group__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:818:1: ( ( rule__Entity__Group_2__0 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:819:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:820:1: ( rule__Entity__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:820:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__21615);
                    rule__Entity__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21625);
            rule__Entity__Group__3();
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
    // $ANTLR end rule__Entity__Group__2


    // $ANTLR start rule__Entity__Group__3
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:831:1: rule__Entity__Group__3 : ( '{' ) rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:835:1: ( ( '{' ) rule__Entity__Group__4 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:836:1: ( '{' ) rule__Entity__Group__4
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:836:1: ( '{' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:837:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Entity__Group__31654); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31664);
            rule__Entity__Group__4();
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
    // $ANTLR end rule__Entity__Group__3


    // $ANTLR start rule__Entity__Group__4
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:851:1: rule__Entity__Group__4 : ( ( rule__Entity__AttributesAssignment_4 )* ) rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:855:1: ( ( ( rule__Entity__AttributesAssignment_4 )* ) rule__Entity__Group__5 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:856:1: ( ( rule__Entity__AttributesAssignment_4 )* ) rule__Entity__Group__5
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:856:1: ( ( rule__Entity__AttributesAssignment_4 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:857:1: ( rule__Entity__AttributesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:858:1: ( rule__Entity__AttributesAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:858:2: rule__Entity__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AttributesAssignment_4_in_rule__Entity__Group__41692);
            	    rule__Entity__AttributesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41702);
            rule__Entity__Group__5();
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
    // $ANTLR end rule__Entity__Group__4


    // $ANTLR start rule__Entity__Group__5
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:869:1: rule__Entity__Group__5 : ( '}' ) ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:873:1: ( ( '}' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:874:1: ( '}' )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:874:1: ( '}' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:875:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Entity__Group__51731); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end rule__Entity__Group__5


    // $ANTLR start rule__Entity__Group_2__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:900:1: rule__Entity__Group_2__0 : ( 'extends' ) rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:904:1: ( ( 'extends' ) rule__Entity__Group_2__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:905:1: ( 'extends' ) rule__Entity__Group_2__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:905:1: ( 'extends' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:906:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Entity__Group_2__01779); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01789);
            rule__Entity__Group_2__1();
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
    // $ANTLR end rule__Entity__Group_2__0


    // $ANTLR start rule__Entity__Group_2__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:920:1: rule__Entity__Group_2__1 : ( ( rule__Entity__SuperEntityAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:924:1: ( ( ( rule__Entity__SuperEntityAssignment_2_1 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:925:1: ( ( rule__Entity__SuperEntityAssignment_2_1 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:925:1: ( ( rule__Entity__SuperEntityAssignment_2_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:926:1: ( rule__Entity__SuperEntityAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityAssignment_2_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:927:1: ( rule__Entity__SuperEntityAssignment_2_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:927:2: rule__Entity__SuperEntityAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperEntityAssignment_2_1_in_rule__Entity__Group_2__11817);
            rule__Entity__SuperEntityAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperEntityAssignment_2_1()); 

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
    // $ANTLR end rule__Entity__Group_2__1


    // $ANTLR start rule__Embed__Group__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:941:1: rule__Embed__Group__0 : ( 'embed' ) rule__Embed__Group__1 ;
    public final void rule__Embed__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:945:1: ( ( 'embed' ) rule__Embed__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:946:1: ( 'embed' ) rule__Embed__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:946:1: ( 'embed' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:947:1: 'embed'
            {
             before(grammarAccess.getEmbedAccess().getEmbedKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Embed__Group__01856); 
             after(grammarAccess.getEmbedAccess().getEmbedKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Embed__Group__1_in_rule__Embed__Group__01866);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:961:1: rule__Embed__Group__1 : ( ( rule__Embed__NameAssignment_1 ) ) rule__Embed__Group__2 ;
    public final void rule__Embed__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:965:1: ( ( ( rule__Embed__NameAssignment_1 ) ) rule__Embed__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:966:1: ( ( rule__Embed__NameAssignment_1 ) ) rule__Embed__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:966:1: ( ( rule__Embed__NameAssignment_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:967:1: ( rule__Embed__NameAssignment_1 )
            {
             before(grammarAccess.getEmbedAccess().getNameAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:968:1: ( rule__Embed__NameAssignment_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:968:2: rule__Embed__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Embed__NameAssignment_1_in_rule__Embed__Group__11894);
            rule__Embed__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEmbedAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Embed__Group__2_in_rule__Embed__Group__11903);
            rule__Embed__Group__2();
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
    // $ANTLR end rule__Embed__Group__1


    // $ANTLR start rule__Embed__Group__2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:979:1: rule__Embed__Group__2 : ( ( rule__Embed__Group_2__0 )? ) rule__Embed__Group__3 ;
    public final void rule__Embed__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:983:1: ( ( ( rule__Embed__Group_2__0 )? ) rule__Embed__Group__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:984:1: ( ( rule__Embed__Group_2__0 )? ) rule__Embed__Group__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:984:1: ( ( rule__Embed__Group_2__0 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:985:1: ( rule__Embed__Group_2__0 )?
            {
             before(grammarAccess.getEmbedAccess().getGroup_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:986:1: ( rule__Embed__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:986:2: rule__Embed__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Embed__Group_2__0_in_rule__Embed__Group__21931);
                    rule__Embed__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmbedAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Embed__Group__3_in_rule__Embed__Group__21941);
            rule__Embed__Group__3();
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
    // $ANTLR end rule__Embed__Group__2


    // $ANTLR start rule__Embed__Group__3
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:997:1: rule__Embed__Group__3 : ( '{' ) rule__Embed__Group__4 ;
    public final void rule__Embed__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1001:1: ( ( '{' ) rule__Embed__Group__4 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1002:1: ( '{' ) rule__Embed__Group__4
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1002:1: ( '{' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1003:1: '{'
            {
             before(grammarAccess.getEmbedAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Embed__Group__31970); 
             after(grammarAccess.getEmbedAccess().getLeftCurlyBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Embed__Group__4_in_rule__Embed__Group__31980);
            rule__Embed__Group__4();
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
    // $ANTLR end rule__Embed__Group__3


    // $ANTLR start rule__Embed__Group__4
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1017:1: rule__Embed__Group__4 : ( ( rule__Embed__AttributesAssignment_4 )* ) rule__Embed__Group__5 ;
    public final void rule__Embed__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1021:1: ( ( ( rule__Embed__AttributesAssignment_4 )* ) rule__Embed__Group__5 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1022:1: ( ( rule__Embed__AttributesAssignment_4 )* ) rule__Embed__Group__5
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1022:1: ( ( rule__Embed__AttributesAssignment_4 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1023:1: ( rule__Embed__AttributesAssignment_4 )*
            {
             before(grammarAccess.getEmbedAccess().getAttributesAssignment_4()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1024:1: ( rule__Embed__AttributesAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1024:2: rule__Embed__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Embed__AttributesAssignment_4_in_rule__Embed__Group__42008);
            	    rule__Embed__AttributesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEmbedAccess().getAttributesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Embed__Group__5_in_rule__Embed__Group__42018);
            rule__Embed__Group__5();
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
    // $ANTLR end rule__Embed__Group__4


    // $ANTLR start rule__Embed__Group__5
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1035:1: rule__Embed__Group__5 : ( '}' ) ;
    public final void rule__Embed__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1039:1: ( ( '}' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1040:1: ( '}' )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1040:1: ( '}' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1041:1: '}'
            {
             before(grammarAccess.getEmbedAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Embed__Group__52047); 
             after(grammarAccess.getEmbedAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end rule__Embed__Group__5


    // $ANTLR start rule__Embed__Group_2__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1066:1: rule__Embed__Group_2__0 : ( 'extends' ) rule__Embed__Group_2__1 ;
    public final void rule__Embed__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1070:1: ( ( 'extends' ) rule__Embed__Group_2__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1071:1: ( 'extends' ) rule__Embed__Group_2__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1071:1: ( 'extends' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1072:1: 'extends'
            {
             before(grammarAccess.getEmbedAccess().getExtendsKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Embed__Group_2__02095); 
             after(grammarAccess.getEmbedAccess().getExtendsKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Embed__Group_2__1_in_rule__Embed__Group_2__02105);
            rule__Embed__Group_2__1();
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
    // $ANTLR end rule__Embed__Group_2__0


    // $ANTLR start rule__Embed__Group_2__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1086:1: rule__Embed__Group_2__1 : ( ( rule__Embed__SuperEntityAssignment_2_1 ) ) ;
    public final void rule__Embed__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1090:1: ( ( ( rule__Embed__SuperEntityAssignment_2_1 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1091:1: ( ( rule__Embed__SuperEntityAssignment_2_1 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1091:1: ( ( rule__Embed__SuperEntityAssignment_2_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1092:1: ( rule__Embed__SuperEntityAssignment_2_1 )
            {
             before(grammarAccess.getEmbedAccess().getSuperEntityAssignment_2_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1093:1: ( rule__Embed__SuperEntityAssignment_2_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1093:2: rule__Embed__SuperEntityAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Embed__SuperEntityAssignment_2_1_in_rule__Embed__Group_2__12133);
            rule__Embed__SuperEntityAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getEmbedAccess().getSuperEntityAssignment_2_1()); 

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
    // $ANTLR end rule__Embed__Group_2__1


    // $ANTLR start rule__Attribute__Group__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1107:1: rule__Attribute__Group__0 : ( ( rule__Attribute__TypeAssignment_0 ) ) rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1111:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) rule__Attribute__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1112:1: ( ( rule__Attribute__TypeAssignment_0 ) ) rule__Attribute__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1112:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1113:1: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1114:1: ( rule__Attribute__TypeAssignment_0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1114:2: rule__Attribute__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__02171);
            rule__Attribute__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02180);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1125:1: rule__Attribute__Group__1 : ( ( rule__Attribute__ManyAssignment_1 )? ) rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1129:1: ( ( ( rule__Attribute__ManyAssignment_1 )? ) rule__Attribute__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1130:1: ( ( rule__Attribute__ManyAssignment_1 )? ) rule__Attribute__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1130:1: ( ( rule__Attribute__ManyAssignment_1 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1131:1: ( rule__Attribute__ManyAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getManyAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1132:1: ( rule__Attribute__ManyAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1132:2: rule__Attribute__ManyAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__ManyAssignment_1_in_rule__Attribute__Group__12208);
                    rule__Attribute__ManyAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getManyAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12218);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1143:1: rule__Attribute__Group__2 : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1147:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1148:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1148:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1149:1: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1150:1: ( rule__Attribute__NameAssignment_2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1150:2: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__22246);
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


    // $ANTLR start rule__Enumeration__Group__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1166:1: rule__Enumeration__Group__0 : ( 'enum' ) rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1170:1: ( ( 'enum' ) rule__Enumeration__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1171:1: ( 'enum' ) rule__Enumeration__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1171:1: ( 'enum' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1172:1: 'enum'
            {
             before(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Enumeration__Group__02287); 
             after(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__02297);
            rule__Enumeration__Group__1();
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
    // $ANTLR end rule__Enumeration__Group__0


    // $ANTLR start rule__Enumeration__Group__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1186:1: rule__Enumeration__Group__1 : ( ( rule__Enumeration__NameAssignment_1 ) ) rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1190:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) rule__Enumeration__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1191:1: ( ( rule__Enumeration__NameAssignment_1 ) ) rule__Enumeration__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1191:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1192:1: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1193:1: ( rule__Enumeration__NameAssignment_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1193:2: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__12325);
            rule__Enumeration__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__12334);
            rule__Enumeration__Group__2();
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
    // $ANTLR end rule__Enumeration__Group__1


    // $ANTLR start rule__Enumeration__Group__2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1204:1: rule__Enumeration__Group__2 : ( '{' ) rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1208:1: ( ( '{' ) rule__Enumeration__Group__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1209:1: ( '{' ) rule__Enumeration__Group__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1209:1: ( '{' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1210:1: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Enumeration__Group__22363); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__22373);
            rule__Enumeration__Group__3();
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
    // $ANTLR end rule__Enumeration__Group__2


    // $ANTLR start rule__Enumeration__Group__3
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1224:1: rule__Enumeration__Group__3 : ( ( rule__Enumeration__LiteralsAssignment_3 )* ) rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1228:1: ( ( ( rule__Enumeration__LiteralsAssignment_3 )* ) rule__Enumeration__Group__4 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1229:1: ( ( rule__Enumeration__LiteralsAssignment_3 )* ) rule__Enumeration__Group__4
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1229:1: ( ( rule__Enumeration__LiteralsAssignment_3 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1230:1: ( rule__Enumeration__LiteralsAssignment_3 )*
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1231:1: ( rule__Enumeration__LiteralsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1231:2: rule__Enumeration__LiteralsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__LiteralsAssignment_3_in_rule__Enumeration__Group__32401);
            	    rule__Enumeration__LiteralsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__32411);
            rule__Enumeration__Group__4();
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
    // $ANTLR end rule__Enumeration__Group__3


    // $ANTLR start rule__Enumeration__Group__4
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1242:1: rule__Enumeration__Group__4 : ( '}' ) ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1246:1: ( ( '}' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1247:1: ( '}' )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1247:1: ( '}' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1248:1: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Enumeration__Group__42440); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end rule__Enumeration__Group__4


    // $ANTLR start rule__EnumerationLiteral__Group__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1271:1: rule__EnumerationLiteral__Group__0 : ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1275:1: ( ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) rule__EnumerationLiteral__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1276:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) rule__EnumerationLiteral__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1276:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1277:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1278:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1278:2: rule__EnumerationLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__02485);
            rule__EnumerationLiteral__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__02494);
            rule__EnumerationLiteral__Group__1();
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
    // $ANTLR end rule__EnumerationLiteral__Group__0


    // $ANTLR start rule__EnumerationLiteral__Group__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1289:1: rule__EnumerationLiteral__Group__1 : ( '(' ) rule__EnumerationLiteral__Group__2 ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1293:1: ( ( '(' ) rule__EnumerationLiteral__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1294:1: ( '(' ) rule__EnumerationLiteral__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1294:1: ( '(' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1295:1: '('
            {
             before(grammarAccess.getEnumerationLiteralAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__EnumerationLiteral__Group__12523); 
             after(grammarAccess.getEnumerationLiteralAccess().getLeftParenthesisKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__12533);
            rule__EnumerationLiteral__Group__2();
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
    // $ANTLR end rule__EnumerationLiteral__Group__1


    // $ANTLR start rule__EnumerationLiteral__Group__2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1309:1: rule__EnumerationLiteral__Group__2 : ( ( rule__EnumerationLiteral__OrdinalAssignment_2 ) ) rule__EnumerationLiteral__Group__3 ;
    public final void rule__EnumerationLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1313:1: ( ( ( rule__EnumerationLiteral__OrdinalAssignment_2 ) ) rule__EnumerationLiteral__Group__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1314:1: ( ( rule__EnumerationLiteral__OrdinalAssignment_2 ) ) rule__EnumerationLiteral__Group__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1314:1: ( ( rule__EnumerationLiteral__OrdinalAssignment_2 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1315:1: ( rule__EnumerationLiteral__OrdinalAssignment_2 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getOrdinalAssignment_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1316:1: ( rule__EnumerationLiteral__OrdinalAssignment_2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1316:2: rule__EnumerationLiteral__OrdinalAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__OrdinalAssignment_2_in_rule__EnumerationLiteral__Group__22561);
            rule__EnumerationLiteral__OrdinalAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getOrdinalAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__3_in_rule__EnumerationLiteral__Group__22570);
            rule__EnumerationLiteral__Group__3();
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
    // $ANTLR end rule__EnumerationLiteral__Group__2


    // $ANTLR start rule__EnumerationLiteral__Group__3
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1327:1: rule__EnumerationLiteral__Group__3 : ( ')' ) ;
    public final void rule__EnumerationLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1331:1: ( ( ')' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1332:1: ( ')' )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1332:1: ( ')' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1333:1: ')'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__EnumerationLiteral__Group__32599); 
             after(grammarAccess.getEnumerationLiteralAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end rule__EnumerationLiteral__Group__3


    // $ANTLR start rule__Model__ProjectAssignment_0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1354:1: rule__Model__ProjectAssignment_0 : ( ruleProject ) ;
    public final void rule__Model__ProjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1358:1: ( ( ruleProject ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1359:1: ( ruleProject )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1359:1: ( ruleProject )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1360:1: ruleProject
            {
             before(grammarAccess.getModelAccess().getProjectProjectParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleProject_in_rule__Model__ProjectAssignment_02642);
            ruleProject();
            _fsp--;

             after(grammarAccess.getModelAccess().getProjectProjectParserRuleCall_0_0()); 

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
    // $ANTLR end rule__Model__ProjectAssignment_0


    // $ANTLR start rule__Model__TypesAssignment_1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1369:1: rule__Model__TypesAssignment_1 : ( ruleType ) ;
    public final void rule__Model__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1373:1: ( ( ruleType ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1374:1: ( ruleType )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1374:1: ( ruleType )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1375:1: ruleType
            {
             before(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Model__TypesAssignment_12673);
            ruleType();
            _fsp--;

             after(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_1_0()); 

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
    // $ANTLR end rule__Model__TypesAssignment_1


    // $ANTLR start rule__Project__NameAssignment_4
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1384:1: rule__Project__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Project__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1388:1: ( ( RULE_STRING ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1389:1: ( RULE_STRING )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1389:1: ( RULE_STRING )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1390:1: RULE_STRING
            {
             before(grammarAccess.getProjectAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Project__NameAssignment_42704); 
             after(grammarAccess.getProjectAccess().getNameSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end rule__Project__NameAssignment_4


    // $ANTLR start rule__Project__BasePackageAssignment_7
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1399:1: rule__Project__BasePackageAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Project__BasePackageAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1403:1: ( ( RULE_STRING ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1404:1: ( RULE_STRING )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1404:1: ( RULE_STRING )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1405:1: RULE_STRING
            {
             before(grammarAccess.getProjectAccess().getBasePackageSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Project__BasePackageAssignment_72735); 
             after(grammarAccess.getProjectAccess().getBasePackageSTRINGTerminalRuleCall_7_0()); 

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
    // $ANTLR end rule__Project__BasePackageAssignment_7


    // $ANTLR start rule__SimpleType__NameAssignment_1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1414:1: rule__SimpleType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1418:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1419:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1419:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1420:1: RULE_ID
            {
             before(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_12766); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1429:1: rule__SimpleType__MappedTypeAssignment_2_1 : ( ruleJAVAID ) ;
    public final void rule__SimpleType__MappedTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1433:1: ( ( ruleJAVAID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1434:1: ( ruleJAVAID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1434:1: ( ruleJAVAID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1435:1: ruleJAVAID
            {
             before(grammarAccess.getSimpleTypeAccess().getMappedTypeJAVAIDParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleJAVAID_in_rule__SimpleType__MappedTypeAssignment_2_12797);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1444:1: rule__JAVAID__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__JAVAID__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1448:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1449:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1449:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1450:1: RULE_ID
            {
             before(grammarAccess.getJAVAIDAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JAVAID__NameAssignment_02828); 
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


    // $ANTLR start rule__Entity__NameAssignment_1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1459:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1463:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1464:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1464:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1465:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12859); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Entity__NameAssignment_1


    // $ANTLR start rule__Entity__SuperEntityAssignment_2_1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1474:1: rule__Entity__SuperEntityAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperEntityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1478:1: ( ( ( RULE_ID ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1479:1: ( ( RULE_ID ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1479:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1480:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_2_1_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1481:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1482:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_2_12894); 
             after(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_2_1_0()); 

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
    // $ANTLR end rule__Entity__SuperEntityAssignment_2_1


    // $ANTLR start rule__Entity__AttributesAssignment_4
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1493:1: rule__Entity__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1497:1: ( ( ruleAttribute ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1498:1: ( ruleAttribute )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1498:1: ( ruleAttribute )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1499:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_42929);
            ruleAttribute();
            _fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 

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
    // $ANTLR end rule__Entity__AttributesAssignment_4


    // $ANTLR start rule__Embed__NameAssignment_1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1508:1: rule__Embed__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Embed__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1512:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1513:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1513:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1514:1: RULE_ID
            {
             before(grammarAccess.getEmbedAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Embed__NameAssignment_12960); 
             after(grammarAccess.getEmbedAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Embed__NameAssignment_1


    // $ANTLR start rule__Embed__SuperEntityAssignment_2_1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1523:1: rule__Embed__SuperEntityAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Embed__SuperEntityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1527:1: ( ( ( RULE_ID ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1528:1: ( ( RULE_ID ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1528:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1529:1: ( RULE_ID )
            {
             before(grammarAccess.getEmbedAccess().getSuperEntityEntityCrossReference_2_1_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1530:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1531:1: RULE_ID
            {
             before(grammarAccess.getEmbedAccess().getSuperEntityEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Embed__SuperEntityAssignment_2_12995); 
             after(grammarAccess.getEmbedAccess().getSuperEntityEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEmbedAccess().getSuperEntityEntityCrossReference_2_1_0()); 

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
    // $ANTLR end rule__Embed__SuperEntityAssignment_2_1


    // $ANTLR start rule__Embed__AttributesAssignment_4
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1542:1: rule__Embed__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Embed__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1546:1: ( ( ruleAttribute ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1547:1: ( ruleAttribute )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1547:1: ( ruleAttribute )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1548:1: ruleAttribute
            {
             before(grammarAccess.getEmbedAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Embed__AttributesAssignment_43030);
            ruleAttribute();
            _fsp--;

             after(grammarAccess.getEmbedAccess().getAttributesAttributeParserRuleCall_4_0()); 

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
    // $ANTLR end rule__Embed__AttributesAssignment_4


    // $ANTLR start rule__Attribute__TypeAssignment_0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1557:1: rule__Attribute__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1561:1: ( ( ( RULE_ID ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1562:1: ( ( RULE_ID ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1562:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1563:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1564:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1565:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_03065); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1576:1: rule__Attribute__ManyAssignment_1 : ( ( '*' ) ) ;
    public final void rule__Attribute__ManyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1580:1: ( ( ( '*' ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1581:1: ( ( '*' ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1581:1: ( ( '*' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1582:1: ( '*' )
            {
             before(grammarAccess.getAttributeAccess().getManyAsteriskKeyword_1_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1583:1: ( '*' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1584:1: '*'
            {
             before(grammarAccess.getAttributeAccess().getManyAsteriskKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Attribute__ManyAssignment_13105); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1599:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1603:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1604:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1604:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1605:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_23144); 
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


    // $ANTLR start rule__Enumeration__NameAssignment_1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1614:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1618:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1619:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1619:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1620:1: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_13175); 
             after(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Enumeration__NameAssignment_1


    // $ANTLR start rule__Enumeration__LiteralsAssignment_3
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1629:1: rule__Enumeration__LiteralsAssignment_3 : ( ruleEnumerationLiteral ) ;
    public final void rule__Enumeration__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1633:1: ( ( ruleEnumerationLiteral ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1634:1: ( ruleEnumerationLiteral )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1634:1: ( ruleEnumerationLiteral )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1635:1: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__LiteralsAssignment_33206);
            ruleEnumerationLiteral();
            _fsp--;

             after(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0()); 

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
    // $ANTLR end rule__Enumeration__LiteralsAssignment_3


    // $ANTLR start rule__EnumerationLiteral__NameAssignment_0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1644:1: rule__EnumerationLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1648:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1649:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1649:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1650:1: RULE_ID
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_03237); 
             after(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__EnumerationLiteral__NameAssignment_0


    // $ANTLR start rule__EnumerationLiteral__OrdinalAssignment_2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1659:1: rule__EnumerationLiteral__OrdinalAssignment_2 : ( RULE_INT ) ;
    public final void rule__EnumerationLiteral__OrdinalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1663:1: ( ( RULE_INT ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1664:1: ( RULE_INT )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1664:1: ( RULE_INT )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1665:1: RULE_INT
            {
             before(grammarAccess.getEnumerationLiteralAccess().getOrdinalINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumerationLiteral__OrdinalAssignment_23268); 
             after(grammarAccess.getEnumerationLiteralAccess().getOrdinalINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__EnumerationLiteral__OrdinalAssignment_2


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__0_in_ruleProject154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_entryRuleJAVAID300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJAVAID307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group__0_in_ruleJAVAID334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbed_in_entryRuleEmbed420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmbed427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Embed__Group__0_in_ruleEmbed454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__Type__Alternatives670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_rule__Type__Alternatives704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbed_in_rule__Type__Alternatives721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ProjectAssignment_0_in_rule__Model__Group__0755 = new BitSet(new long[]{0x0000000000D20002L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TypesAssignment_1_in_rule__Model__Group__1792 = new BitSet(new long[]{0x0000000000D20002L});
    public static final BitSet FOLLOW_11_in_rule__Project__Group__0832 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Project__Group__1_in_rule__Project__Group__0842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Project__Group__1871 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Project__Group__2_in_rule__Project__Group__1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Project__Group__2910 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Project__Group__3_in_rule__Project__Group__2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Project__Group__3949 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Project__Group__4_in_rule__Project__Group__3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__NameAssignment_4_in_rule__Project__Group__4987 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Project__Group__5_in_rule__Project__Group__4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Project__Group__51025 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Project__Group__6_in_rule__Project__Group__51035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Project__Group__61064 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Project__Group__7_in_rule__Project__Group__61074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__BasePackageAssignment_7_in_rule__Project__Group__71102 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Project__Group__8_in_rule__Project__Group__71111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Project__Group__81140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SimpleType__Group__01194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__01204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__11232 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__2_in_rule__SimpleType__Group__11241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group_2__0_in_rule__SimpleType__Group__21269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SimpleType__Group_2__01311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleType__Group_2__1_in_rule__SimpleType__Group_2__01321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__MappedTypeAssignment_2_1_in_rule__SimpleType__Group_2__11349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JAVAID__NameAssignment_0_in_rule__JAVAID__Group__01387 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group__1_in_rule__JAVAID__Group__01396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group_1__0_in_rule__JAVAID__Group__11424 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_rule__JAVAID__Group_1__01464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JAVAID__Group_1__1_in_rule__JAVAID__Group_1__01474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JAVAID__Group_1__11502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Entity__Group__01540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__11578 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__21615 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Entity__Group__31654 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_4_in_rule__Entity__Group__41692 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Entity__Group__51731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Entity__Group_2__01779 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperEntityAssignment_2_1_in_rule__Entity__Group_2__11817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Embed__Group__01856 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Embed__Group__1_in_rule__Embed__Group__01866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Embed__NameAssignment_1_in_rule__Embed__Group__11894 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_rule__Embed__Group__2_in_rule__Embed__Group__11903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Embed__Group_2__0_in_rule__Embed__Group__21931 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Embed__Group__3_in_rule__Embed__Group__21941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Embed__Group__31970 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__Embed__Group__4_in_rule__Embed__Group__31980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Embed__AttributesAssignment_4_in_rule__Embed__Group__42008 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__Embed__Group__5_in_rule__Embed__Group__42018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Embed__Group__52047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Embed__Group_2__02095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Embed__Group_2__1_in_rule__Embed__Group_2__02105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Embed__SuperEntityAssignment_2_1_in_rule__Embed__Group_2__12133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__02171 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ManyAssignment_1_in_rule__Attribute__Group__12208 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__22246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Enumeration__Group__02287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__02297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__12325 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__12334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Enumeration__Group__22363 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__22373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__LiteralsAssignment_3_in_rule__Enumeration__Group__32401 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__32411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Enumeration__Group__42440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__02485 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__02494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EnumerationLiteral__Group__12523 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__12533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__OrdinalAssignment_2_in_rule__EnumerationLiteral__Group__22561 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__3_in_rule__EnumerationLiteral__Group__22570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EnumerationLiteral__Group__32599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_rule__Model__ProjectAssignment_02642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Model__TypesAssignment_12673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Project__NameAssignment_42704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Project__BasePackageAssignment_72735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_12766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_rule__SimpleType__MappedTypeAssignment_2_12797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JAVAID__NameAssignment_02828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_2_12894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_42929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Embed__NameAssignment_12960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Embed__SuperEntityAssignment_2_12995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Embed__AttributesAssignment_43030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_03065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Attribute__ManyAssignment_13105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_23144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_13175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__LiteralsAssignment_33206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_03237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumerationLiteral__OrdinalAssignment_23268 = new BitSet(new long[]{0x0000000000000002L});

}