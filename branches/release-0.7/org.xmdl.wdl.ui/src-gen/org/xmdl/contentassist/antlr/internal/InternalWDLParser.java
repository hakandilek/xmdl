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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NONE'", "'*'", "'#'", "'project'", "'{'", "'projectName'", "':'", "'basePackage'", "'}'", "'type'", "'is'", "'.'", "'entity'", "'extends'", "'embed'", "'enum'", "'('", "')'"
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


    // $ANTLR start ruleAttributeManyReference
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:326:1: ruleAttributeManyReference : ( ( rule__AttributeManyReference__Alternatives ) ) ;
    public final void ruleAttributeManyReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:330:1: ( ( ( rule__AttributeManyReference__Alternatives ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:331:1: ( ( rule__AttributeManyReference__Alternatives ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:331:1: ( ( rule__AttributeManyReference__Alternatives ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:332:1: ( rule__AttributeManyReference__Alternatives )
            {
             before(grammarAccess.getAttributeManyReferenceAccess().getAlternatives()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:333:1: ( rule__AttributeManyReference__Alternatives )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:333:2: rule__AttributeManyReference__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeManyReference__Alternatives_in_ruleAttributeManyReference671);
            rule__AttributeManyReference__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getAttributeManyReferenceAccess().getAlternatives()); 

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
    // $ANTLR end ruleAttributeManyReference


    // $ANTLR start rule__Type__Alternatives
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:344:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) | ( ruleEnumeration ) | ( ruleEmbed ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:348:1: ( ( ruleSimpleType ) | ( ruleEntity ) | ( ruleEnumeration ) | ( ruleEmbed ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 26:
                {
                alt1=3;
                }
                break;
            case 25:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("344:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) | ( ruleEnumeration ) | ( ruleEmbed ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:349:1: ( ruleSimpleType )
                    {
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:349:1: ( ruleSimpleType )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:350:1: ruleSimpleType
                    {
                     before(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleType_in_rule__Type__Alternatives706);
                    ruleSimpleType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:355:6: ( ruleEntity )
                    {
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:355:6: ( ruleEntity )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:356:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives723);
                    ruleEntity();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:361:6: ( ruleEnumeration )
                    {
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:361:6: ( ruleEnumeration )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:362:1: ruleEnumeration
                    {
                     before(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnumeration_in_rule__Type__Alternatives740);
                    ruleEnumeration();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:367:6: ( ruleEmbed )
                    {
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:367:6: ( ruleEmbed )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:368:1: ruleEmbed
                    {
                     before(grammarAccess.getTypeAccess().getEmbedParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleEmbed_in_rule__Type__Alternatives757);
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


    // $ANTLR start rule__AttributeManyReference__Alternatives
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:378:1: rule__AttributeManyReference__Alternatives : ( ( ( 'NONE' ) ) | ( ( '*' ) ) | ( ( '#' ) ) );
    public final void rule__AttributeManyReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:382:1: ( ( ( 'NONE' ) ) | ( ( '*' ) ) | ( ( '#' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("378:1: rule__AttributeManyReference__Alternatives : ( ( ( 'NONE' ) ) | ( ( '*' ) ) | ( ( '#' ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:383:1: ( ( 'NONE' ) )
                    {
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:383:1: ( ( 'NONE' ) )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:384:1: ( 'NONE' )
                    {
                     before(grammarAccess.getAttributeManyReferenceAccess().getNONEEnumLiteralDeclaration_0()); 
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:385:1: ( 'NONE' )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:385:3: 'NONE'
                    {
                    match(input,11,FOLLOW_11_in_rule__AttributeManyReference__Alternatives790); 

                    }

                     after(grammarAccess.getAttributeManyReferenceAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:390:6: ( ( '*' ) )
                    {
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:390:6: ( ( '*' ) )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:391:1: ( '*' )
                    {
                     before(grammarAccess.getAttributeManyReferenceAccess().getWEAKEnumLiteralDeclaration_1()); 
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:392:1: ( '*' )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:392:3: '*'
                    {
                    match(input,12,FOLLOW_12_in_rule__AttributeManyReference__Alternatives811); 

                    }

                     after(grammarAccess.getAttributeManyReferenceAccess().getWEAKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:397:6: ( ( '#' ) )
                    {
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:397:6: ( ( '#' ) )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:398:1: ( '#' )
                    {
                     before(grammarAccess.getAttributeManyReferenceAccess().getSTRONGEnumLiteralDeclaration_2()); 
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:399:1: ( '#' )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:399:3: '#'
                    {
                    match(input,13,FOLLOW_13_in_rule__AttributeManyReference__Alternatives832); 

                    }

                     after(grammarAccess.getAttributeManyReferenceAccess().getSTRONGEnumLiteralDeclaration_2()); 

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
    // $ANTLR end rule__AttributeManyReference__Alternatives


    // $ANTLR start rule__Model__Group__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:411:1: rule__Model__Group__0 : ( ( rule__Model__ProjectAssignment_0 ) ) rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:415:1: ( ( ( rule__Model__ProjectAssignment_0 ) ) rule__Model__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:416:1: ( ( rule__Model__ProjectAssignment_0 ) ) rule__Model__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:416:1: ( ( rule__Model__ProjectAssignment_0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:417:1: ( rule__Model__ProjectAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getProjectAssignment_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:418:1: ( rule__Model__ProjectAssignment_0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:418:2: rule__Model__ProjectAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__ProjectAssignment_0_in_rule__Model__Group__0869);
            rule__Model__ProjectAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getProjectAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0878);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:429:1: rule__Model__Group__1 : ( ( rule__Model__TypesAssignment_1 )* ) ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:433:1: ( ( ( rule__Model__TypesAssignment_1 )* ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:434:1: ( ( rule__Model__TypesAssignment_1 )* )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:434:1: ( ( rule__Model__TypesAssignment_1 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:435:1: ( rule__Model__TypesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getTypesAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:436:1: ( rule__Model__TypesAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20||LA3_0==23||(LA3_0>=25 && LA3_0<=26)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:436:2: rule__Model__TypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__TypesAssignment_1_in_rule__Model__Group__1906);
            	    rule__Model__TypesAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:450:1: rule__Project__Group__0 : ( 'project' ) rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:454:1: ( ( 'project' ) rule__Project__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:455:1: ( 'project' ) rule__Project__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:455:1: ( 'project' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:456:1: 'project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Project__Group__0946); 
             after(grammarAccess.getProjectAccess().getProjectKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__1_in_rule__Project__Group__0956);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:470:1: rule__Project__Group__1 : ( '{' ) rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:474:1: ( ( '{' ) rule__Project__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:475:1: ( '{' ) rule__Project__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:475:1: ( '{' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:476:1: '{'
            {
             before(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Project__Group__1985); 
             after(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__2_in_rule__Project__Group__1995);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:490:1: rule__Project__Group__2 : ( 'projectName' ) rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:494:1: ( ( 'projectName' ) rule__Project__Group__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:495:1: ( 'projectName' ) rule__Project__Group__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:495:1: ( 'projectName' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:496:1: 'projectName'
            {
             before(grammarAccess.getProjectAccess().getProjectNameKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Project__Group__21024); 
             after(grammarAccess.getProjectAccess().getProjectNameKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__3_in_rule__Project__Group__21034);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:510:1: rule__Project__Group__3 : ( ':' ) rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:514:1: ( ( ':' ) rule__Project__Group__4 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:515:1: ( ':' ) rule__Project__Group__4
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:515:1: ( ':' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:516:1: ':'
            {
             before(grammarAccess.getProjectAccess().getColonKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Project__Group__31063); 
             after(grammarAccess.getProjectAccess().getColonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__4_in_rule__Project__Group__31073);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:530:1: rule__Project__Group__4 : ( ( rule__Project__NameAssignment_4 ) ) rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:534:1: ( ( ( rule__Project__NameAssignment_4 ) ) rule__Project__Group__5 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:535:1: ( ( rule__Project__NameAssignment_4 ) ) rule__Project__Group__5
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:535:1: ( ( rule__Project__NameAssignment_4 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:536:1: ( rule__Project__NameAssignment_4 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_4()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:537:1: ( rule__Project__NameAssignment_4 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:537:2: rule__Project__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__Project__NameAssignment_4_in_rule__Project__Group__41101);
            rule__Project__NameAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getProjectAccess().getNameAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__5_in_rule__Project__Group__41110);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:548:1: rule__Project__Group__5 : ( 'basePackage' ) rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:552:1: ( ( 'basePackage' ) rule__Project__Group__6 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:553:1: ( 'basePackage' ) rule__Project__Group__6
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:553:1: ( 'basePackage' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:554:1: 'basePackage'
            {
             before(grammarAccess.getProjectAccess().getBasePackageKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Project__Group__51139); 
             after(grammarAccess.getProjectAccess().getBasePackageKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__6_in_rule__Project__Group__51149);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:568:1: rule__Project__Group__6 : ( ':' ) rule__Project__Group__7 ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:572:1: ( ( ':' ) rule__Project__Group__7 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:573:1: ( ':' ) rule__Project__Group__7
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:573:1: ( ':' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:574:1: ':'
            {
             before(grammarAccess.getProjectAccess().getColonKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__Project__Group__61178); 
             after(grammarAccess.getProjectAccess().getColonKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__7_in_rule__Project__Group__61188);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:588:1: rule__Project__Group__7 : ( ( rule__Project__BasePackageAssignment_7 ) ) rule__Project__Group__8 ;
    public final void rule__Project__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:592:1: ( ( ( rule__Project__BasePackageAssignment_7 ) ) rule__Project__Group__8 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:593:1: ( ( rule__Project__BasePackageAssignment_7 ) ) rule__Project__Group__8
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:593:1: ( ( rule__Project__BasePackageAssignment_7 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:594:1: ( rule__Project__BasePackageAssignment_7 )
            {
             before(grammarAccess.getProjectAccess().getBasePackageAssignment_7()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:595:1: ( rule__Project__BasePackageAssignment_7 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:595:2: rule__Project__BasePackageAssignment_7
            {
            pushFollow(FOLLOW_rule__Project__BasePackageAssignment_7_in_rule__Project__Group__71216);
            rule__Project__BasePackageAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getProjectAccess().getBasePackageAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__8_in_rule__Project__Group__71225);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:606:1: rule__Project__Group__8 : ( '}' ) ;
    public final void rule__Project__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:610:1: ( ( '}' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:611:1: ( '}' )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:611:1: ( '}' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:612:1: '}'
            {
             before(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_19_in_rule__Project__Group__81254); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:643:1: rule__SimpleType__Group__0 : ( 'type' ) rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:647:1: ( ( 'type' ) rule__SimpleType__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:648:1: ( 'type' ) rule__SimpleType__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:648:1: ( 'type' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:649:1: 'type'
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__SimpleType__Group__01308); 
             after(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__01318);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:663:1: rule__SimpleType__Group__1 : ( ( rule__SimpleType__NameAssignment_1 ) ) rule__SimpleType__Group__2 ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:667:1: ( ( ( rule__SimpleType__NameAssignment_1 ) ) rule__SimpleType__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:668:1: ( ( rule__SimpleType__NameAssignment_1 ) ) rule__SimpleType__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:668:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:669:1: ( rule__SimpleType__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:670:1: ( rule__SimpleType__NameAssignment_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:670:2: rule__SimpleType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__11346);
            rule__SimpleType__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__SimpleType__Group__2_in_rule__SimpleType__Group__11355);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:681:1: rule__SimpleType__Group__2 : ( ( rule__SimpleType__Group_2__0 )? ) ;
    public final void rule__SimpleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:685:1: ( ( ( rule__SimpleType__Group_2__0 )? ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:686:1: ( ( rule__SimpleType__Group_2__0 )? )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:686:1: ( ( rule__SimpleType__Group_2__0 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:687:1: ( rule__SimpleType__Group_2__0 )?
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:688:1: ( rule__SimpleType__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:688:2: rule__SimpleType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SimpleType__Group_2__0_in_rule__SimpleType__Group__21383);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:704:1: rule__SimpleType__Group_2__0 : ( 'is' ) rule__SimpleType__Group_2__1 ;
    public final void rule__SimpleType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:708:1: ( ( 'is' ) rule__SimpleType__Group_2__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:709:1: ( 'is' ) rule__SimpleType__Group_2__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:709:1: ( 'is' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:710:1: 'is'
            {
             before(grammarAccess.getSimpleTypeAccess().getIsKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__SimpleType__Group_2__01425); 
             after(grammarAccess.getSimpleTypeAccess().getIsKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleType__Group_2__1_in_rule__SimpleType__Group_2__01435);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:724:1: rule__SimpleType__Group_2__1 : ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) ) ;
    public final void rule__SimpleType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:728:1: ( ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:729:1: ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:729:1: ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:730:1: ( rule__SimpleType__MappedTypeAssignment_2_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getMappedTypeAssignment_2_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:731:1: ( rule__SimpleType__MappedTypeAssignment_2_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:731:2: rule__SimpleType__MappedTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SimpleType__MappedTypeAssignment_2_1_in_rule__SimpleType__Group_2__11463);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:745:1: rule__JAVAID__Group__0 : ( ( rule__JAVAID__NameAssignment_0 ) ) rule__JAVAID__Group__1 ;
    public final void rule__JAVAID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:749:1: ( ( ( rule__JAVAID__NameAssignment_0 ) ) rule__JAVAID__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:750:1: ( ( rule__JAVAID__NameAssignment_0 ) ) rule__JAVAID__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:750:1: ( ( rule__JAVAID__NameAssignment_0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:751:1: ( rule__JAVAID__NameAssignment_0 )
            {
             before(grammarAccess.getJAVAIDAccess().getNameAssignment_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:752:1: ( rule__JAVAID__NameAssignment_0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:752:2: rule__JAVAID__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__JAVAID__NameAssignment_0_in_rule__JAVAID__Group__01501);
            rule__JAVAID__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getJAVAIDAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__JAVAID__Group__1_in_rule__JAVAID__Group__01510);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:763:1: rule__JAVAID__Group__1 : ( ( rule__JAVAID__Group_1__0 )* ) ;
    public final void rule__JAVAID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:767:1: ( ( ( rule__JAVAID__Group_1__0 )* ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:768:1: ( ( rule__JAVAID__Group_1__0 )* )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:768:1: ( ( rule__JAVAID__Group_1__0 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:769:1: ( rule__JAVAID__Group_1__0 )*
            {
             before(grammarAccess.getJAVAIDAccess().getGroup_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:770:1: ( rule__JAVAID__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:770:2: rule__JAVAID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__JAVAID__Group_1__0_in_rule__JAVAID__Group__11538);
            	    rule__JAVAID__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:784:1: rule__JAVAID__Group_1__0 : ( '.' ) rule__JAVAID__Group_1__1 ;
    public final void rule__JAVAID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:788:1: ( ( '.' ) rule__JAVAID__Group_1__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:789:1: ( '.' ) rule__JAVAID__Group_1__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:789:1: ( '.' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:790:1: '.'
            {
             before(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__JAVAID__Group_1__01578); 
             after(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__JAVAID__Group_1__1_in_rule__JAVAID__Group_1__01588);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:804:1: rule__JAVAID__Group_1__1 : ( RULE_ID ) ;
    public final void rule__JAVAID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:808:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:809:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:809:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:810:1: RULE_ID
            {
             before(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JAVAID__Group_1__11616); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:825:1: rule__Entity__Group__0 : ( 'entity' ) rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:829:1: ( ( 'entity' ) rule__Entity__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:830:1: ( 'entity' ) rule__Entity__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:830:1: ( 'entity' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:831:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Entity__Group__01654); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01664);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:845:1: rule__Entity__Group__1 : ( ( rule__Entity__NameAssignment_1 ) ) rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:849:1: ( ( ( rule__Entity__NameAssignment_1 ) ) rule__Entity__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:850:1: ( ( rule__Entity__NameAssignment_1 ) ) rule__Entity__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:850:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:851:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:852:1: ( rule__Entity__NameAssignment_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:852:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__11692);
            rule__Entity__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11701);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:863:1: rule__Entity__Group__2 : ( ( rule__Entity__Group_2__0 )? ) rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:867:1: ( ( ( rule__Entity__Group_2__0 )? ) rule__Entity__Group__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:868:1: ( ( rule__Entity__Group_2__0 )? ) rule__Entity__Group__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:868:1: ( ( rule__Entity__Group_2__0 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:869:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:870:1: ( rule__Entity__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:870:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__21729);
                    rule__Entity__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21739);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:881:1: rule__Entity__Group__3 : ( '{' ) rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:885:1: ( ( '{' ) rule__Entity__Group__4 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:886:1: ( '{' ) rule__Entity__Group__4
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:886:1: ( '{' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:887:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Entity__Group__31768); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31778);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:901:1: rule__Entity__Group__4 : ( ( rule__Entity__AttributesAssignment_4 )* ) rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:905:1: ( ( ( rule__Entity__AttributesAssignment_4 )* ) rule__Entity__Group__5 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:906:1: ( ( rule__Entity__AttributesAssignment_4 )* ) rule__Entity__Group__5
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:906:1: ( ( rule__Entity__AttributesAssignment_4 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:907:1: ( rule__Entity__AttributesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:908:1: ( rule__Entity__AttributesAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:908:2: rule__Entity__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AttributesAssignment_4_in_rule__Entity__Group__41806);
            	    rule__Entity__AttributesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41816);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:919:1: rule__Entity__Group__5 : ( '}' ) ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:923:1: ( ( '}' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:924:1: ( '}' )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:924:1: ( '}' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:925:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group__51845); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:950:1: rule__Entity__Group_2__0 : ( 'extends' ) rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:954:1: ( ( 'extends' ) rule__Entity__Group_2__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:955:1: ( 'extends' ) rule__Entity__Group_2__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:955:1: ( 'extends' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:956:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Entity__Group_2__01893); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01903);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:970:1: rule__Entity__Group_2__1 : ( ( rule__Entity__SuperEntityAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:974:1: ( ( ( rule__Entity__SuperEntityAssignment_2_1 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:975:1: ( ( rule__Entity__SuperEntityAssignment_2_1 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:975:1: ( ( rule__Entity__SuperEntityAssignment_2_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:976:1: ( rule__Entity__SuperEntityAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityAssignment_2_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:977:1: ( rule__Entity__SuperEntityAssignment_2_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:977:2: rule__Entity__SuperEntityAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperEntityAssignment_2_1_in_rule__Entity__Group_2__11931);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:991:1: rule__Embed__Group__0 : ( 'embed' ) rule__Embed__Group__1 ;
    public final void rule__Embed__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:995:1: ( ( 'embed' ) rule__Embed__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:996:1: ( 'embed' ) rule__Embed__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:996:1: ( 'embed' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:997:1: 'embed'
            {
             before(grammarAccess.getEmbedAccess().getEmbedKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Embed__Group__01970); 
             after(grammarAccess.getEmbedAccess().getEmbedKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Embed__Group__1_in_rule__Embed__Group__01980);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1011:1: rule__Embed__Group__1 : ( ( rule__Embed__NameAssignment_1 ) ) rule__Embed__Group__2 ;
    public final void rule__Embed__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1015:1: ( ( ( rule__Embed__NameAssignment_1 ) ) rule__Embed__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1016:1: ( ( rule__Embed__NameAssignment_1 ) ) rule__Embed__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1016:1: ( ( rule__Embed__NameAssignment_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1017:1: ( rule__Embed__NameAssignment_1 )
            {
             before(grammarAccess.getEmbedAccess().getNameAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1018:1: ( rule__Embed__NameAssignment_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1018:2: rule__Embed__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Embed__NameAssignment_1_in_rule__Embed__Group__12008);
            rule__Embed__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEmbedAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Embed__Group__2_in_rule__Embed__Group__12017);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1029:1: rule__Embed__Group__2 : ( ( rule__Embed__Group_2__0 )? ) rule__Embed__Group__3 ;
    public final void rule__Embed__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1033:1: ( ( ( rule__Embed__Group_2__0 )? ) rule__Embed__Group__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1034:1: ( ( rule__Embed__Group_2__0 )? ) rule__Embed__Group__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1034:1: ( ( rule__Embed__Group_2__0 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1035:1: ( rule__Embed__Group_2__0 )?
            {
             before(grammarAccess.getEmbedAccess().getGroup_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1036:1: ( rule__Embed__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1036:2: rule__Embed__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Embed__Group_2__0_in_rule__Embed__Group__22045);
                    rule__Embed__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmbedAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Embed__Group__3_in_rule__Embed__Group__22055);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1047:1: rule__Embed__Group__3 : ( '{' ) rule__Embed__Group__4 ;
    public final void rule__Embed__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1051:1: ( ( '{' ) rule__Embed__Group__4 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1052:1: ( '{' ) rule__Embed__Group__4
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1052:1: ( '{' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1053:1: '{'
            {
             before(grammarAccess.getEmbedAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Embed__Group__32084); 
             after(grammarAccess.getEmbedAccess().getLeftCurlyBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Embed__Group__4_in_rule__Embed__Group__32094);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1067:1: rule__Embed__Group__4 : ( ( rule__Embed__AttributesAssignment_4 )* ) rule__Embed__Group__5 ;
    public final void rule__Embed__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1071:1: ( ( ( rule__Embed__AttributesAssignment_4 )* ) rule__Embed__Group__5 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1072:1: ( ( rule__Embed__AttributesAssignment_4 )* ) rule__Embed__Group__5
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1072:1: ( ( rule__Embed__AttributesAssignment_4 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1073:1: ( rule__Embed__AttributesAssignment_4 )*
            {
             before(grammarAccess.getEmbedAccess().getAttributesAssignment_4()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1074:1: ( rule__Embed__AttributesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1074:2: rule__Embed__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Embed__AttributesAssignment_4_in_rule__Embed__Group__42122);
            	    rule__Embed__AttributesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEmbedAccess().getAttributesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Embed__Group__5_in_rule__Embed__Group__42132);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1085:1: rule__Embed__Group__5 : ( '}' ) ;
    public final void rule__Embed__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1089:1: ( ( '}' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1090:1: ( '}' )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1090:1: ( '}' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1091:1: '}'
            {
             before(grammarAccess.getEmbedAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Embed__Group__52161); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1116:1: rule__Embed__Group_2__0 : ( 'extends' ) rule__Embed__Group_2__1 ;
    public final void rule__Embed__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1120:1: ( ( 'extends' ) rule__Embed__Group_2__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1121:1: ( 'extends' ) rule__Embed__Group_2__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1121:1: ( 'extends' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1122:1: 'extends'
            {
             before(grammarAccess.getEmbedAccess().getExtendsKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Embed__Group_2__02209); 
             after(grammarAccess.getEmbedAccess().getExtendsKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Embed__Group_2__1_in_rule__Embed__Group_2__02219);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1136:1: rule__Embed__Group_2__1 : ( ( rule__Embed__SuperEntityAssignment_2_1 ) ) ;
    public final void rule__Embed__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1140:1: ( ( ( rule__Embed__SuperEntityAssignment_2_1 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1141:1: ( ( rule__Embed__SuperEntityAssignment_2_1 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1141:1: ( ( rule__Embed__SuperEntityAssignment_2_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1142:1: ( rule__Embed__SuperEntityAssignment_2_1 )
            {
             before(grammarAccess.getEmbedAccess().getSuperEntityAssignment_2_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1143:1: ( rule__Embed__SuperEntityAssignment_2_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1143:2: rule__Embed__SuperEntityAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Embed__SuperEntityAssignment_2_1_in_rule__Embed__Group_2__12247);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1157:1: rule__Attribute__Group__0 : ( ( rule__Attribute__TypeAssignment_0 ) ) rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1161:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) rule__Attribute__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1162:1: ( ( rule__Attribute__TypeAssignment_0 ) ) rule__Attribute__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1162:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1163:1: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1164:1: ( rule__Attribute__TypeAssignment_0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1164:2: rule__Attribute__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__02285);
            rule__Attribute__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02294);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1175:1: rule__Attribute__Group__1 : ( ( rule__Attribute__ManyReferenceAssignment_1 )? ) rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1179:1: ( ( ( rule__Attribute__ManyReferenceAssignment_1 )? ) rule__Attribute__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1180:1: ( ( rule__Attribute__ManyReferenceAssignment_1 )? ) rule__Attribute__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1180:1: ( ( rule__Attribute__ManyReferenceAssignment_1 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1181:1: ( rule__Attribute__ManyReferenceAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getManyReferenceAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1182:1: ( rule__Attribute__ManyReferenceAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=11 && LA10_0<=13)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1182:2: rule__Attribute__ManyReferenceAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__ManyReferenceAssignment_1_in_rule__Attribute__Group__12322);
                    rule__Attribute__ManyReferenceAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getManyReferenceAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12332);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1193:1: rule__Attribute__Group__2 : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1197:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1198:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1198:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1199:1: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1200:1: ( rule__Attribute__NameAssignment_2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1200:2: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__22360);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1216:1: rule__Enumeration__Group__0 : ( 'enum' ) rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1220:1: ( ( 'enum' ) rule__Enumeration__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1221:1: ( 'enum' ) rule__Enumeration__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1221:1: ( 'enum' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1222:1: 'enum'
            {
             before(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Enumeration__Group__02401); 
             after(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__02411);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1236:1: rule__Enumeration__Group__1 : ( ( rule__Enumeration__NameAssignment_1 ) ) rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1240:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) rule__Enumeration__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1241:1: ( ( rule__Enumeration__NameAssignment_1 ) ) rule__Enumeration__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1241:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1242:1: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1243:1: ( rule__Enumeration__NameAssignment_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1243:2: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__12439);
            rule__Enumeration__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__12448);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1254:1: rule__Enumeration__Group__2 : ( '{' ) rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1258:1: ( ( '{' ) rule__Enumeration__Group__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1259:1: ( '{' ) rule__Enumeration__Group__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1259:1: ( '{' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1260:1: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Enumeration__Group__22477); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__22487);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1274:1: rule__Enumeration__Group__3 : ( ( rule__Enumeration__LiteralsAssignment_3 )* ) rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1278:1: ( ( ( rule__Enumeration__LiteralsAssignment_3 )* ) rule__Enumeration__Group__4 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1279:1: ( ( rule__Enumeration__LiteralsAssignment_3 )* ) rule__Enumeration__Group__4
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1279:1: ( ( rule__Enumeration__LiteralsAssignment_3 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1280:1: ( rule__Enumeration__LiteralsAssignment_3 )*
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1281:1: ( rule__Enumeration__LiteralsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1281:2: rule__Enumeration__LiteralsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__LiteralsAssignment_3_in_rule__Enumeration__Group__32515);
            	    rule__Enumeration__LiteralsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__32525);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1292:1: rule__Enumeration__Group__4 : ( '}' ) ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1296:1: ( ( '}' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1297:1: ( '}' )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1297:1: ( '}' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1298:1: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Enumeration__Group__42554); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1321:1: rule__EnumerationLiteral__Group__0 : ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1325:1: ( ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) rule__EnumerationLiteral__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1326:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) rule__EnumerationLiteral__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1326:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1327:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1328:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1328:2: rule__EnumerationLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__02599);
            rule__EnumerationLiteral__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__02608);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1339:1: rule__EnumerationLiteral__Group__1 : ( '(' ) rule__EnumerationLiteral__Group__2 ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1343:1: ( ( '(' ) rule__EnumerationLiteral__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1344:1: ( '(' ) rule__EnumerationLiteral__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1344:1: ( '(' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1345:1: '('
            {
             before(grammarAccess.getEnumerationLiteralAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__EnumerationLiteral__Group__12637); 
             after(grammarAccess.getEnumerationLiteralAccess().getLeftParenthesisKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__12647);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1359:1: rule__EnumerationLiteral__Group__2 : ( ( rule__EnumerationLiteral__OrdinalAssignment_2 ) ) rule__EnumerationLiteral__Group__3 ;
    public final void rule__EnumerationLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1363:1: ( ( ( rule__EnumerationLiteral__OrdinalAssignment_2 ) ) rule__EnumerationLiteral__Group__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1364:1: ( ( rule__EnumerationLiteral__OrdinalAssignment_2 ) ) rule__EnumerationLiteral__Group__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1364:1: ( ( rule__EnumerationLiteral__OrdinalAssignment_2 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1365:1: ( rule__EnumerationLiteral__OrdinalAssignment_2 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getOrdinalAssignment_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1366:1: ( rule__EnumerationLiteral__OrdinalAssignment_2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1366:2: rule__EnumerationLiteral__OrdinalAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__OrdinalAssignment_2_in_rule__EnumerationLiteral__Group__22675);
            rule__EnumerationLiteral__OrdinalAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getOrdinalAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__3_in_rule__EnumerationLiteral__Group__22684);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1377:1: rule__EnumerationLiteral__Group__3 : ( ')' ) ;
    public final void rule__EnumerationLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1381:1: ( ( ')' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1382:1: ( ')' )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1382:1: ( ')' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1383:1: ')'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__EnumerationLiteral__Group__32713); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1404:1: rule__Model__ProjectAssignment_0 : ( ruleProject ) ;
    public final void rule__Model__ProjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1408:1: ( ( ruleProject ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1409:1: ( ruleProject )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1409:1: ( ruleProject )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1410:1: ruleProject
            {
             before(grammarAccess.getModelAccess().getProjectProjectParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleProject_in_rule__Model__ProjectAssignment_02756);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1419:1: rule__Model__TypesAssignment_1 : ( ruleType ) ;
    public final void rule__Model__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1423:1: ( ( ruleType ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1424:1: ( ruleType )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1424:1: ( ruleType )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1425:1: ruleType
            {
             before(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Model__TypesAssignment_12787);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1434:1: rule__Project__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Project__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1438:1: ( ( RULE_STRING ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1439:1: ( RULE_STRING )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1439:1: ( RULE_STRING )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1440:1: RULE_STRING
            {
             before(grammarAccess.getProjectAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Project__NameAssignment_42818); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1449:1: rule__Project__BasePackageAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Project__BasePackageAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1453:1: ( ( RULE_STRING ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1454:1: ( RULE_STRING )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1454:1: ( RULE_STRING )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1455:1: RULE_STRING
            {
             before(grammarAccess.getProjectAccess().getBasePackageSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Project__BasePackageAssignment_72849); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1464:1: rule__SimpleType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1468:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1469:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1469:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1470:1: RULE_ID
            {
             before(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_12880); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1479:1: rule__SimpleType__MappedTypeAssignment_2_1 : ( ruleJAVAID ) ;
    public final void rule__SimpleType__MappedTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1483:1: ( ( ruleJAVAID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1484:1: ( ruleJAVAID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1484:1: ( ruleJAVAID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1485:1: ruleJAVAID
            {
             before(grammarAccess.getSimpleTypeAccess().getMappedTypeJAVAIDParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleJAVAID_in_rule__SimpleType__MappedTypeAssignment_2_12911);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1494:1: rule__JAVAID__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__JAVAID__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1498:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1499:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1499:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1500:1: RULE_ID
            {
             before(grammarAccess.getJAVAIDAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JAVAID__NameAssignment_02942); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1509:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1513:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1514:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1514:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1515:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12973); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1524:1: rule__Entity__SuperEntityAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperEntityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1528:1: ( ( ( RULE_ID ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1529:1: ( ( RULE_ID ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1529:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1530:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_2_1_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1531:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1532:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_2_13008); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1543:1: rule__Entity__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1547:1: ( ( ruleAttribute ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1548:1: ( ruleAttribute )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1548:1: ( ruleAttribute )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1549:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_43043);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1558:1: rule__Embed__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Embed__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1562:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1563:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1563:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1564:1: RULE_ID
            {
             before(grammarAccess.getEmbedAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Embed__NameAssignment_13074); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1573:1: rule__Embed__SuperEntityAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Embed__SuperEntityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1577:1: ( ( ( RULE_ID ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1578:1: ( ( RULE_ID ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1578:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1579:1: ( RULE_ID )
            {
             before(grammarAccess.getEmbedAccess().getSuperEntityEntityCrossReference_2_1_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1580:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1581:1: RULE_ID
            {
             before(grammarAccess.getEmbedAccess().getSuperEntityEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Embed__SuperEntityAssignment_2_13109); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1592:1: rule__Embed__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Embed__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1596:1: ( ( ruleAttribute ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1597:1: ( ruleAttribute )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1597:1: ( ruleAttribute )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1598:1: ruleAttribute
            {
             before(grammarAccess.getEmbedAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Embed__AttributesAssignment_43144);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1607:1: rule__Attribute__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1611:1: ( ( ( RULE_ID ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1612:1: ( ( RULE_ID ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1612:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1613:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1614:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1615:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_03179); 
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


    // $ANTLR start rule__Attribute__ManyReferenceAssignment_1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1626:1: rule__Attribute__ManyReferenceAssignment_1 : ( ruleAttributeManyReference ) ;
    public final void rule__Attribute__ManyReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1630:1: ( ( ruleAttributeManyReference ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1631:1: ( ruleAttributeManyReference )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1631:1: ( ruleAttributeManyReference )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1632:1: ruleAttributeManyReference
            {
             before(grammarAccess.getAttributeAccess().getManyReferenceAttributeManyReferenceEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeManyReference_in_rule__Attribute__ManyReferenceAssignment_13214);
            ruleAttributeManyReference();
            _fsp--;

             after(grammarAccess.getAttributeAccess().getManyReferenceAttributeManyReferenceEnumRuleCall_1_0()); 

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
    // $ANTLR end rule__Attribute__ManyReferenceAssignment_1


    // $ANTLR start rule__Attribute__NameAssignment_2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1641:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1645:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1646:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1646:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1647:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_23245); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1656:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1660:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1661:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1661:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1662:1: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_13276); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1671:1: rule__Enumeration__LiteralsAssignment_3 : ( ruleEnumerationLiteral ) ;
    public final void rule__Enumeration__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1675:1: ( ( ruleEnumerationLiteral ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1676:1: ( ruleEnumerationLiteral )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1676:1: ( ruleEnumerationLiteral )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1677:1: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__LiteralsAssignment_33307);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1686:1: rule__EnumerationLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1690:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1691:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1691:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1692:1: RULE_ID
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_03338); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1701:1: rule__EnumerationLiteral__OrdinalAssignment_2 : ( RULE_INT ) ;
    public final void rule__EnumerationLiteral__OrdinalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1705:1: ( ( RULE_INT ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1706:1: ( RULE_INT )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1706:1: ( RULE_INT )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1707:1: RULE_INT
            {
             before(grammarAccess.getEnumerationLiteralAccess().getOrdinalINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumerationLiteral__OrdinalAssignment_23369); 
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
    public static final BitSet FOLLOW_rule__AttributeManyReference__Alternatives_in_ruleAttributeManyReference671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__Type__Alternatives706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_rule__Type__Alternatives740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbed_in_rule__Type__Alternatives757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__AttributeManyReference__Alternatives790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__AttributeManyReference__Alternatives811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AttributeManyReference__Alternatives832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ProjectAssignment_0_in_rule__Model__Group__0869 = new BitSet(new long[]{0x0000000006900002L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TypesAssignment_1_in_rule__Model__Group__1906 = new BitSet(new long[]{0x0000000006900002L});
    public static final BitSet FOLLOW_14_in_rule__Project__Group__0946 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Project__Group__1_in_rule__Project__Group__0956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Project__Group__1985 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Project__Group__2_in_rule__Project__Group__1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Project__Group__21024 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Project__Group__3_in_rule__Project__Group__21034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Project__Group__31063 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Project__Group__4_in_rule__Project__Group__31073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__NameAssignment_4_in_rule__Project__Group__41101 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Project__Group__5_in_rule__Project__Group__41110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Project__Group__51139 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Project__Group__6_in_rule__Project__Group__51149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Project__Group__61178 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Project__Group__7_in_rule__Project__Group__61188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__BasePackageAssignment_7_in_rule__Project__Group__71216 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Project__Group__8_in_rule__Project__Group__71225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Project__Group__81254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SimpleType__Group__01308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__01318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__11346 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__2_in_rule__SimpleType__Group__11355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group_2__0_in_rule__SimpleType__Group__21383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SimpleType__Group_2__01425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleType__Group_2__1_in_rule__SimpleType__Group_2__01435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__MappedTypeAssignment_2_1_in_rule__SimpleType__Group_2__11463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JAVAID__NameAssignment_0_in_rule__JAVAID__Group__01501 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group__1_in_rule__JAVAID__Group__01510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group_1__0_in_rule__JAVAID__Group__11538 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_rule__JAVAID__Group_1__01578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JAVAID__Group_1__1_in_rule__JAVAID__Group_1__01588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JAVAID__Group_1__11616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Entity__Group__01654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__11692 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__21729 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Entity__Group__31768 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_4_in_rule__Entity__Group__41806 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group__51845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Entity__Group_2__01893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperEntityAssignment_2_1_in_rule__Entity__Group_2__11931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Embed__Group__01970 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Embed__Group__1_in_rule__Embed__Group__01980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Embed__NameAssignment_1_in_rule__Embed__Group__12008 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_rule__Embed__Group__2_in_rule__Embed__Group__12017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Embed__Group_2__0_in_rule__Embed__Group__22045 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Embed__Group__3_in_rule__Embed__Group__22055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Embed__Group__32084 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Embed__Group__4_in_rule__Embed__Group__32094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Embed__AttributesAssignment_4_in_rule__Embed__Group__42122 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Embed__Group__5_in_rule__Embed__Group__42132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Embed__Group__52161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Embed__Group_2__02209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Embed__Group_2__1_in_rule__Embed__Group_2__02219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Embed__SuperEntityAssignment_2_1_in_rule__Embed__Group_2__12247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__02285 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ManyReferenceAssignment_1_in_rule__Attribute__Group__12322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__22360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Enumeration__Group__02401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__02411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__12439 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__12448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Enumeration__Group__22477 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__22487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__LiteralsAssignment_3_in_rule__Enumeration__Group__32515 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__32525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Enumeration__Group__42554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__02599 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__02608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EnumerationLiteral__Group__12637 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__12647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__OrdinalAssignment_2_in_rule__EnumerationLiteral__Group__22675 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__3_in_rule__EnumerationLiteral__Group__22684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EnumerationLiteral__Group__32713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_rule__Model__ProjectAssignment_02756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Model__TypesAssignment_12787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Project__NameAssignment_42818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Project__BasePackageAssignment_72849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_12880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_rule__SimpleType__MappedTypeAssignment_2_12911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JAVAID__NameAssignment_02942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_2_13008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_43043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Embed__NameAssignment_13074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Embed__SuperEntityAssignment_2_13109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Embed__AttributesAssignment_43144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_03179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeManyReference_in_rule__Attribute__ManyReferenceAssignment_13214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_23245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_13276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__LiteralsAssignment_33307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_03338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumerationLiteral__OrdinalAssignment_23369 = new BitSet(new long[]{0x0000000000000002L});

}