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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NONE'", "'*'", "'#'", "'+'", "'-'", "'project'", "'{'", "'projectName'", "':'", "'basePackage'", "'}'", "'type'", "'is'", "'.'", "'entity'", "'extends'", "'embed'", "'enum'", "'('", "')'", "'query'", "'<'", "'>'", "'with'", "','", "'-max'", "'-offset'", "'-order'", "'='"
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


    // $ANTLR start entryRuleQuery
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:325:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:325:16: ( ruleQuery EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:326:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery660);
            ruleQuery();
            _fsp--;

             after(grammarAccess.getQueryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery667); 

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
    // $ANTLR end entryRuleQuery


    // $ANTLR start ruleQuery
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:333:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:337:2: ( ( ( rule__Query__Group__0 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:338:1: ( ( rule__Query__Group__0 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:338:1: ( ( rule__Query__Group__0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:339:1: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:340:1: ( rule__Query__Group__0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:340:2: rule__Query__Group__0
            {
            pushFollow(FOLLOW_rule__Query__Group__0_in_ruleQuery694);
            rule__Query__Group__0();
            _fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup()); 

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
    // $ANTLR end ruleQuery


    // $ANTLR start entryRuleQueryParameter
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:352:1: entryRuleQueryParameter : ruleQueryParameter EOF ;
    public final void entryRuleQueryParameter() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:352:25: ( ruleQueryParameter EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:353:1: ruleQueryParameter EOF
            {
             before(grammarAccess.getQueryParameterRule()); 
            pushFollow(FOLLOW_ruleQueryParameter_in_entryRuleQueryParameter720);
            ruleQueryParameter();
            _fsp--;

             after(grammarAccess.getQueryParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryParameter727); 

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
    // $ANTLR end entryRuleQueryParameter


    // $ANTLR start ruleQueryParameter
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:360:1: ruleQueryParameter : ( ( rule__QueryParameter__Group__0 ) ) ;
    public final void ruleQueryParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:364:2: ( ( ( rule__QueryParameter__Group__0 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:365:1: ( ( rule__QueryParameter__Group__0 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:365:1: ( ( rule__QueryParameter__Group__0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:366:1: ( rule__QueryParameter__Group__0 )
            {
             before(grammarAccess.getQueryParameterAccess().getGroup()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:367:1: ( rule__QueryParameter__Group__0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:367:2: rule__QueryParameter__Group__0
            {
            pushFollow(FOLLOW_rule__QueryParameter__Group__0_in_ruleQueryParameter754);
            rule__QueryParameter__Group__0();
            _fsp--;


            }

             after(grammarAccess.getQueryParameterAccess().getGroup()); 

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
    // $ANTLR end ruleQueryParameter


    // $ANTLR start entryRuleQueryFilter
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:379:1: entryRuleQueryFilter : ruleQueryFilter EOF ;
    public final void entryRuleQueryFilter() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:379:22: ( ruleQueryFilter EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:380:1: ruleQueryFilter EOF
            {
             before(grammarAccess.getQueryFilterRule()); 
            pushFollow(FOLLOW_ruleQueryFilter_in_entryRuleQueryFilter780);
            ruleQueryFilter();
            _fsp--;

             after(grammarAccess.getQueryFilterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryFilter787); 

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
    // $ANTLR end entryRuleQueryFilter


    // $ANTLR start ruleQueryFilter
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:387:1: ruleQueryFilter : ( ( rule__QueryFilter__Group__0 ) ) ;
    public final void ruleQueryFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:391:2: ( ( ( rule__QueryFilter__Group__0 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:392:1: ( ( rule__QueryFilter__Group__0 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:392:1: ( ( rule__QueryFilter__Group__0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:393:1: ( rule__QueryFilter__Group__0 )
            {
             before(grammarAccess.getQueryFilterAccess().getGroup()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:394:1: ( rule__QueryFilter__Group__0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:394:2: rule__QueryFilter__Group__0
            {
            pushFollow(FOLLOW_rule__QueryFilter__Group__0_in_ruleQueryFilter814);
            rule__QueryFilter__Group__0();
            _fsp--;


            }

             after(grammarAccess.getQueryFilterAccess().getGroup()); 

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
    // $ANTLR end ruleQueryFilter


    // $ANTLR start entryRuleQueryOrder
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:406:1: entryRuleQueryOrder : ruleQueryOrder EOF ;
    public final void entryRuleQueryOrder() throws RecognitionException {
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:406:21: ( ruleQueryOrder EOF )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:407:1: ruleQueryOrder EOF
            {
             before(grammarAccess.getQueryOrderRule()); 
            pushFollow(FOLLOW_ruleQueryOrder_in_entryRuleQueryOrder840);
            ruleQueryOrder();
            _fsp--;

             after(grammarAccess.getQueryOrderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryOrder847); 

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
    // $ANTLR end entryRuleQueryOrder


    // $ANTLR start ruleQueryOrder
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:414:1: ruleQueryOrder : ( ( rule__QueryOrder__Group__0 ) ) ;
    public final void ruleQueryOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:418:2: ( ( ( rule__QueryOrder__Group__0 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:419:1: ( ( rule__QueryOrder__Group__0 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:419:1: ( ( rule__QueryOrder__Group__0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:420:1: ( rule__QueryOrder__Group__0 )
            {
             before(grammarAccess.getQueryOrderAccess().getGroup()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:421:1: ( rule__QueryOrder__Group__0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:421:2: rule__QueryOrder__Group__0
            {
            pushFollow(FOLLOW_rule__QueryOrder__Group__0_in_ruleQueryOrder874);
            rule__QueryOrder__Group__0();
            _fsp--;


            }

             after(grammarAccess.getQueryOrderAccess().getGroup()); 

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
    // $ANTLR end ruleQueryOrder


    // $ANTLR start ruleAttributeManyReference
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:434:1: ruleAttributeManyReference : ( ( rule__AttributeManyReference__Alternatives ) ) ;
    public final void ruleAttributeManyReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:438:1: ( ( ( rule__AttributeManyReference__Alternatives ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:439:1: ( ( rule__AttributeManyReference__Alternatives ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:439:1: ( ( rule__AttributeManyReference__Alternatives ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:440:1: ( rule__AttributeManyReference__Alternatives )
            {
             before(grammarAccess.getAttributeManyReferenceAccess().getAlternatives()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:441:1: ( rule__AttributeManyReference__Alternatives )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:441:2: rule__AttributeManyReference__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeManyReference__Alternatives_in_ruleAttributeManyReference911);
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


    // $ANTLR start ruleQueryOrderType
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:453:1: ruleQueryOrderType : ( ( rule__QueryOrderType__Alternatives ) ) ;
    public final void ruleQueryOrderType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:457:1: ( ( ( rule__QueryOrderType__Alternatives ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:458:1: ( ( rule__QueryOrderType__Alternatives ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:458:1: ( ( rule__QueryOrderType__Alternatives ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:459:1: ( rule__QueryOrderType__Alternatives )
            {
             before(grammarAccess.getQueryOrderTypeAccess().getAlternatives()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:460:1: ( rule__QueryOrderType__Alternatives )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:460:2: rule__QueryOrderType__Alternatives
            {
            pushFollow(FOLLOW_rule__QueryOrderType__Alternatives_in_ruleQueryOrderType947);
            rule__QueryOrderType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getQueryOrderTypeAccess().getAlternatives()); 

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
    // $ANTLR end ruleQueryOrderType


    // $ANTLR start rule__Type__Alternatives
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:471:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) | ( ruleEnumeration ) | ( ruleEmbed ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:475:1: ( ( ruleSimpleType ) | ( ruleEntity ) | ( ruleEnumeration ) | ( ruleEmbed ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            case 27:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("471:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) | ( ruleEnumeration ) | ( ruleEmbed ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:476:1: ( ruleSimpleType )
                    {
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:476:1: ( ruleSimpleType )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:477:1: ruleSimpleType
                    {
                     before(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleType_in_rule__Type__Alternatives982);
                    ruleSimpleType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:482:6: ( ruleEntity )
                    {
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:482:6: ( ruleEntity )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:483:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives999);
                    ruleEntity();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:488:6: ( ruleEnumeration )
                    {
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:488:6: ( ruleEnumeration )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:489:1: ruleEnumeration
                    {
                     before(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnumeration_in_rule__Type__Alternatives1016);
                    ruleEnumeration();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:494:6: ( ruleEmbed )
                    {
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:494:6: ( ruleEmbed )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:495:1: ruleEmbed
                    {
                     before(grammarAccess.getTypeAccess().getEmbedParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleEmbed_in_rule__Type__Alternatives1033);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:505:1: rule__AttributeManyReference__Alternatives : ( ( ( 'NONE' ) ) | ( ( '*' ) ) | ( ( '#' ) ) );
    public final void rule__AttributeManyReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:509:1: ( ( ( 'NONE' ) ) | ( ( '*' ) ) | ( ( '#' ) ) )
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
                    new NoViableAltException("505:1: rule__AttributeManyReference__Alternatives : ( ( ( 'NONE' ) ) | ( ( '*' ) ) | ( ( '#' ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:510:1: ( ( 'NONE' ) )
                    {
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:510:1: ( ( 'NONE' ) )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:511:1: ( 'NONE' )
                    {
                     before(grammarAccess.getAttributeManyReferenceAccess().getNONEEnumLiteralDeclaration_0()); 
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:512:1: ( 'NONE' )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:512:3: 'NONE'
                    {
                    match(input,11,FOLLOW_11_in_rule__AttributeManyReference__Alternatives1066); 

                    }

                     after(grammarAccess.getAttributeManyReferenceAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:517:6: ( ( '*' ) )
                    {
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:517:6: ( ( '*' ) )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:518:1: ( '*' )
                    {
                     before(grammarAccess.getAttributeManyReferenceAccess().getWEAKEnumLiteralDeclaration_1()); 
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:519:1: ( '*' )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:519:3: '*'
                    {
                    match(input,12,FOLLOW_12_in_rule__AttributeManyReference__Alternatives1087); 

                    }

                     after(grammarAccess.getAttributeManyReferenceAccess().getWEAKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:524:6: ( ( '#' ) )
                    {
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:524:6: ( ( '#' ) )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:525:1: ( '#' )
                    {
                     before(grammarAccess.getAttributeManyReferenceAccess().getSTRONGEnumLiteralDeclaration_2()); 
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:526:1: ( '#' )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:526:3: '#'
                    {
                    match(input,13,FOLLOW_13_in_rule__AttributeManyReference__Alternatives1108); 

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


    // $ANTLR start rule__QueryOrderType__Alternatives
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:536:1: rule__QueryOrderType__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__QueryOrderType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:540:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("536:1: rule__QueryOrderType__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:541:1: ( ( '+' ) )
                    {
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:541:1: ( ( '+' ) )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:542:1: ( '+' )
                    {
                     before(grammarAccess.getQueryOrderTypeAccess().getASCEnumLiteralDeclaration_0()); 
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:543:1: ( '+' )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:543:3: '+'
                    {
                    match(input,14,FOLLOW_14_in_rule__QueryOrderType__Alternatives1144); 

                    }

                     after(grammarAccess.getQueryOrderTypeAccess().getASCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:548:6: ( ( '-' ) )
                    {
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:548:6: ( ( '-' ) )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:549:1: ( '-' )
                    {
                     before(grammarAccess.getQueryOrderTypeAccess().getDESCEnumLiteralDeclaration_1()); 
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:550:1: ( '-' )
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:550:3: '-'
                    {
                    match(input,15,FOLLOW_15_in_rule__QueryOrderType__Alternatives1165); 

                    }

                     after(grammarAccess.getQueryOrderTypeAccess().getDESCEnumLiteralDeclaration_1()); 

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
    // $ANTLR end rule__QueryOrderType__Alternatives


    // $ANTLR start rule__Model__Group__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:562:1: rule__Model__Group__0 : ( ( rule__Model__ProjectAssignment_0 ) ) rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:566:1: ( ( ( rule__Model__ProjectAssignment_0 ) ) rule__Model__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:567:1: ( ( rule__Model__ProjectAssignment_0 ) ) rule__Model__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:567:1: ( ( rule__Model__ProjectAssignment_0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:568:1: ( rule__Model__ProjectAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getProjectAssignment_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:569:1: ( rule__Model__ProjectAssignment_0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:569:2: rule__Model__ProjectAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__ProjectAssignment_0_in_rule__Model__Group__01202);
            rule__Model__ProjectAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getProjectAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01211);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:580:1: rule__Model__Group__1 : ( ( rule__Model__TypesAssignment_1 )* ) rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:584:1: ( ( ( rule__Model__TypesAssignment_1 )* ) rule__Model__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:585:1: ( ( rule__Model__TypesAssignment_1 )* ) rule__Model__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:585:1: ( ( rule__Model__TypesAssignment_1 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:586:1: ( rule__Model__TypesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getTypesAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:587:1: ( rule__Model__TypesAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22||LA4_0==25||(LA4_0>=27 && LA4_0<=28)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:587:2: rule__Model__TypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__TypesAssignment_1_in_rule__Model__Group__11239);
            	    rule__Model__TypesAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTypesAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11249);
            rule__Model__Group__2();
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
    // $ANTLR end rule__Model__Group__1


    // $ANTLR start rule__Model__Group__2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:598:1: rule__Model__Group__2 : ( ( rule__Model__QueriesAssignment_2 )* ) ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:602:1: ( ( ( rule__Model__QueriesAssignment_2 )* ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:603:1: ( ( rule__Model__QueriesAssignment_2 )* )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:603:1: ( ( rule__Model__QueriesAssignment_2 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:604:1: ( rule__Model__QueriesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getQueriesAssignment_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:605:1: ( rule__Model__QueriesAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==31) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:605:2: rule__Model__QueriesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__QueriesAssignment_2_in_rule__Model__Group__21277);
            	    rule__Model__QueriesAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getQueriesAssignment_2()); 

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
    // $ANTLR end rule__Model__Group__2


    // $ANTLR start rule__Project__Group__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:621:1: rule__Project__Group__0 : ( 'project' ) rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:625:1: ( ( 'project' ) rule__Project__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:626:1: ( 'project' ) rule__Project__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:626:1: ( 'project' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:627:1: 'project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Project__Group__01319); 
             after(grammarAccess.getProjectAccess().getProjectKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__1_in_rule__Project__Group__01329);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:641:1: rule__Project__Group__1 : ( '{' ) rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:645:1: ( ( '{' ) rule__Project__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:646:1: ( '{' ) rule__Project__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:646:1: ( '{' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:647:1: '{'
            {
             before(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Project__Group__11358); 
             after(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__2_in_rule__Project__Group__11368);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:661:1: rule__Project__Group__2 : ( 'projectName' ) rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:665:1: ( ( 'projectName' ) rule__Project__Group__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:666:1: ( 'projectName' ) rule__Project__Group__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:666:1: ( 'projectName' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:667:1: 'projectName'
            {
             before(grammarAccess.getProjectAccess().getProjectNameKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Project__Group__21397); 
             after(grammarAccess.getProjectAccess().getProjectNameKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__3_in_rule__Project__Group__21407);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:681:1: rule__Project__Group__3 : ( ':' ) rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:685:1: ( ( ':' ) rule__Project__Group__4 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:686:1: ( ':' ) rule__Project__Group__4
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:686:1: ( ':' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:687:1: ':'
            {
             before(grammarAccess.getProjectAccess().getColonKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__Project__Group__31436); 
             after(grammarAccess.getProjectAccess().getColonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__4_in_rule__Project__Group__31446);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:701:1: rule__Project__Group__4 : ( ( rule__Project__NameAssignment_4 ) ) rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:705:1: ( ( ( rule__Project__NameAssignment_4 ) ) rule__Project__Group__5 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:706:1: ( ( rule__Project__NameAssignment_4 ) ) rule__Project__Group__5
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:706:1: ( ( rule__Project__NameAssignment_4 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:707:1: ( rule__Project__NameAssignment_4 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_4()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:708:1: ( rule__Project__NameAssignment_4 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:708:2: rule__Project__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__Project__NameAssignment_4_in_rule__Project__Group__41474);
            rule__Project__NameAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getProjectAccess().getNameAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__5_in_rule__Project__Group__41483);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:719:1: rule__Project__Group__5 : ( 'basePackage' ) rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:723:1: ( ( 'basePackage' ) rule__Project__Group__6 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:724:1: ( 'basePackage' ) rule__Project__Group__6
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:724:1: ( 'basePackage' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:725:1: 'basePackage'
            {
             before(grammarAccess.getProjectAccess().getBasePackageKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__Project__Group__51512); 
             after(grammarAccess.getProjectAccess().getBasePackageKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__6_in_rule__Project__Group__51522);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:739:1: rule__Project__Group__6 : ( ':' ) rule__Project__Group__7 ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:743:1: ( ( ':' ) rule__Project__Group__7 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:744:1: ( ':' ) rule__Project__Group__7
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:744:1: ( ':' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:745:1: ':'
            {
             before(grammarAccess.getProjectAccess().getColonKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__Project__Group__61551); 
             after(grammarAccess.getProjectAccess().getColonKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__7_in_rule__Project__Group__61561);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:759:1: rule__Project__Group__7 : ( ( rule__Project__BasePackageAssignment_7 ) ) rule__Project__Group__8 ;
    public final void rule__Project__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:763:1: ( ( ( rule__Project__BasePackageAssignment_7 ) ) rule__Project__Group__8 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:764:1: ( ( rule__Project__BasePackageAssignment_7 ) ) rule__Project__Group__8
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:764:1: ( ( rule__Project__BasePackageAssignment_7 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:765:1: ( rule__Project__BasePackageAssignment_7 )
            {
             before(grammarAccess.getProjectAccess().getBasePackageAssignment_7()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:766:1: ( rule__Project__BasePackageAssignment_7 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:766:2: rule__Project__BasePackageAssignment_7
            {
            pushFollow(FOLLOW_rule__Project__BasePackageAssignment_7_in_rule__Project__Group__71589);
            rule__Project__BasePackageAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getProjectAccess().getBasePackageAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__Project__Group__8_in_rule__Project__Group__71598);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:777:1: rule__Project__Group__8 : ( '}' ) ;
    public final void rule__Project__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:781:1: ( ( '}' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:782:1: ( '}' )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:782:1: ( '}' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:783:1: '}'
            {
             before(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__Project__Group__81627); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:814:1: rule__SimpleType__Group__0 : ( 'type' ) rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:818:1: ( ( 'type' ) rule__SimpleType__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:819:1: ( 'type' ) rule__SimpleType__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:819:1: ( 'type' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:820:1: 'type'
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__SimpleType__Group__01681); 
             after(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__01691);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:834:1: rule__SimpleType__Group__1 : ( ( rule__SimpleType__NameAssignment_1 ) ) rule__SimpleType__Group__2 ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:838:1: ( ( ( rule__SimpleType__NameAssignment_1 ) ) rule__SimpleType__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:839:1: ( ( rule__SimpleType__NameAssignment_1 ) ) rule__SimpleType__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:839:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:840:1: ( rule__SimpleType__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:841:1: ( rule__SimpleType__NameAssignment_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:841:2: rule__SimpleType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__11719);
            rule__SimpleType__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__SimpleType__Group__2_in_rule__SimpleType__Group__11728);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:852:1: rule__SimpleType__Group__2 : ( ( rule__SimpleType__Group_2__0 )? ) ;
    public final void rule__SimpleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:856:1: ( ( ( rule__SimpleType__Group_2__0 )? ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:857:1: ( ( rule__SimpleType__Group_2__0 )? )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:857:1: ( ( rule__SimpleType__Group_2__0 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:858:1: ( rule__SimpleType__Group_2__0 )?
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:859:1: ( rule__SimpleType__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:859:2: rule__SimpleType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SimpleType__Group_2__0_in_rule__SimpleType__Group__21756);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:875:1: rule__SimpleType__Group_2__0 : ( 'is' ) rule__SimpleType__Group_2__1 ;
    public final void rule__SimpleType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:879:1: ( ( 'is' ) rule__SimpleType__Group_2__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:880:1: ( 'is' ) rule__SimpleType__Group_2__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:880:1: ( 'is' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:881:1: 'is'
            {
             before(grammarAccess.getSimpleTypeAccess().getIsKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__SimpleType__Group_2__01798); 
             after(grammarAccess.getSimpleTypeAccess().getIsKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleType__Group_2__1_in_rule__SimpleType__Group_2__01808);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:895:1: rule__SimpleType__Group_2__1 : ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) ) ;
    public final void rule__SimpleType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:899:1: ( ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:900:1: ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:900:1: ( ( rule__SimpleType__MappedTypeAssignment_2_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:901:1: ( rule__SimpleType__MappedTypeAssignment_2_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getMappedTypeAssignment_2_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:902:1: ( rule__SimpleType__MappedTypeAssignment_2_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:902:2: rule__SimpleType__MappedTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SimpleType__MappedTypeAssignment_2_1_in_rule__SimpleType__Group_2__11836);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:916:1: rule__JAVAID__Group__0 : ( ( rule__JAVAID__NameAssignment_0 ) ) rule__JAVAID__Group__1 ;
    public final void rule__JAVAID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:920:1: ( ( ( rule__JAVAID__NameAssignment_0 ) ) rule__JAVAID__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:921:1: ( ( rule__JAVAID__NameAssignment_0 ) ) rule__JAVAID__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:921:1: ( ( rule__JAVAID__NameAssignment_0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:922:1: ( rule__JAVAID__NameAssignment_0 )
            {
             before(grammarAccess.getJAVAIDAccess().getNameAssignment_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:923:1: ( rule__JAVAID__NameAssignment_0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:923:2: rule__JAVAID__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__JAVAID__NameAssignment_0_in_rule__JAVAID__Group__01874);
            rule__JAVAID__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getJAVAIDAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__JAVAID__Group__1_in_rule__JAVAID__Group__01883);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:934:1: rule__JAVAID__Group__1 : ( ( rule__JAVAID__Group_1__0 )* ) ;
    public final void rule__JAVAID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:938:1: ( ( ( rule__JAVAID__Group_1__0 )* ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:939:1: ( ( rule__JAVAID__Group_1__0 )* )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:939:1: ( ( rule__JAVAID__Group_1__0 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:940:1: ( rule__JAVAID__Group_1__0 )*
            {
             before(grammarAccess.getJAVAIDAccess().getGroup_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:941:1: ( rule__JAVAID__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:941:2: rule__JAVAID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__JAVAID__Group_1__0_in_rule__JAVAID__Group__11911);
            	    rule__JAVAID__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:955:1: rule__JAVAID__Group_1__0 : ( '.' ) rule__JAVAID__Group_1__1 ;
    public final void rule__JAVAID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:959:1: ( ( '.' ) rule__JAVAID__Group_1__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:960:1: ( '.' ) rule__JAVAID__Group_1__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:960:1: ( '.' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:961:1: '.'
            {
             before(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__JAVAID__Group_1__01951); 
             after(grammarAccess.getJAVAIDAccess().getFullStopKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__JAVAID__Group_1__1_in_rule__JAVAID__Group_1__01961);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:975:1: rule__JAVAID__Group_1__1 : ( RULE_ID ) ;
    public final void rule__JAVAID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:979:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:980:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:980:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:981:1: RULE_ID
            {
             before(grammarAccess.getJAVAIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JAVAID__Group_1__11989); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:996:1: rule__Entity__Group__0 : ( 'entity' ) rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1000:1: ( ( 'entity' ) rule__Entity__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1001:1: ( 'entity' ) rule__Entity__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1001:1: ( 'entity' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1002:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Entity__Group__02027); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__02037);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1016:1: rule__Entity__Group__1 : ( ( rule__Entity__NameAssignment_1 ) ) rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1020:1: ( ( ( rule__Entity__NameAssignment_1 ) ) rule__Entity__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1021:1: ( ( rule__Entity__NameAssignment_1 ) ) rule__Entity__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1021:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1022:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1023:1: ( rule__Entity__NameAssignment_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1023:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__12065);
            rule__Entity__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__12074);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1034:1: rule__Entity__Group__2 : ( ( rule__Entity__Group_2__0 )? ) rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1038:1: ( ( ( rule__Entity__Group_2__0 )? ) rule__Entity__Group__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1039:1: ( ( rule__Entity__Group_2__0 )? ) rule__Entity__Group__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1039:1: ( ( rule__Entity__Group_2__0 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1040:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1041:1: ( rule__Entity__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1041:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__22102);
                    rule__Entity__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__22112);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1052:1: rule__Entity__Group__3 : ( '{' ) rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1056:1: ( ( '{' ) rule__Entity__Group__4 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1057:1: ( '{' ) rule__Entity__Group__4
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1057:1: ( '{' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1058:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Entity__Group__32141); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__32151);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1072:1: rule__Entity__Group__4 : ( ( rule__Entity__AttributesAssignment_4 )* ) rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1076:1: ( ( ( rule__Entity__AttributesAssignment_4 )* ) rule__Entity__Group__5 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1077:1: ( ( rule__Entity__AttributesAssignment_4 )* ) rule__Entity__Group__5
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1077:1: ( ( rule__Entity__AttributesAssignment_4 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1078:1: ( rule__Entity__AttributesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1079:1: ( rule__Entity__AttributesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1079:2: rule__Entity__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AttributesAssignment_4_in_rule__Entity__Group__42179);
            	    rule__Entity__AttributesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__42189);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1090:1: rule__Entity__Group__5 : ( '}' ) ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1094:1: ( ( '}' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1095:1: ( '}' )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1095:1: ( '}' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1096:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Entity__Group__52218); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1121:1: rule__Entity__Group_2__0 : ( 'extends' ) rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1125:1: ( ( 'extends' ) rule__Entity__Group_2__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1126:1: ( 'extends' ) rule__Entity__Group_2__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1126:1: ( 'extends' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1127:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Entity__Group_2__02266); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__02276);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1141:1: rule__Entity__Group_2__1 : ( ( rule__Entity__SuperEntityAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1145:1: ( ( ( rule__Entity__SuperEntityAssignment_2_1 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1146:1: ( ( rule__Entity__SuperEntityAssignment_2_1 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1146:1: ( ( rule__Entity__SuperEntityAssignment_2_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1147:1: ( rule__Entity__SuperEntityAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityAssignment_2_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1148:1: ( rule__Entity__SuperEntityAssignment_2_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1148:2: rule__Entity__SuperEntityAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperEntityAssignment_2_1_in_rule__Entity__Group_2__12304);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1162:1: rule__Embed__Group__0 : ( 'embed' ) rule__Embed__Group__1 ;
    public final void rule__Embed__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1166:1: ( ( 'embed' ) rule__Embed__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1167:1: ( 'embed' ) rule__Embed__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1167:1: ( 'embed' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1168:1: 'embed'
            {
             before(grammarAccess.getEmbedAccess().getEmbedKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Embed__Group__02343); 
             after(grammarAccess.getEmbedAccess().getEmbedKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Embed__Group__1_in_rule__Embed__Group__02353);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1182:1: rule__Embed__Group__1 : ( ( rule__Embed__NameAssignment_1 ) ) rule__Embed__Group__2 ;
    public final void rule__Embed__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1186:1: ( ( ( rule__Embed__NameAssignment_1 ) ) rule__Embed__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1187:1: ( ( rule__Embed__NameAssignment_1 ) ) rule__Embed__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1187:1: ( ( rule__Embed__NameAssignment_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1188:1: ( rule__Embed__NameAssignment_1 )
            {
             before(grammarAccess.getEmbedAccess().getNameAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1189:1: ( rule__Embed__NameAssignment_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1189:2: rule__Embed__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Embed__NameAssignment_1_in_rule__Embed__Group__12381);
            rule__Embed__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEmbedAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Embed__Group__2_in_rule__Embed__Group__12390);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1200:1: rule__Embed__Group__2 : ( ( rule__Embed__Group_2__0 )? ) rule__Embed__Group__3 ;
    public final void rule__Embed__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1204:1: ( ( ( rule__Embed__Group_2__0 )? ) rule__Embed__Group__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1205:1: ( ( rule__Embed__Group_2__0 )? ) rule__Embed__Group__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1205:1: ( ( rule__Embed__Group_2__0 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1206:1: ( rule__Embed__Group_2__0 )?
            {
             before(grammarAccess.getEmbedAccess().getGroup_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1207:1: ( rule__Embed__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1207:2: rule__Embed__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Embed__Group_2__0_in_rule__Embed__Group__22418);
                    rule__Embed__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmbedAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Embed__Group__3_in_rule__Embed__Group__22428);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1218:1: rule__Embed__Group__3 : ( '{' ) rule__Embed__Group__4 ;
    public final void rule__Embed__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1222:1: ( ( '{' ) rule__Embed__Group__4 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1223:1: ( '{' ) rule__Embed__Group__4
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1223:1: ( '{' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1224:1: '{'
            {
             before(grammarAccess.getEmbedAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Embed__Group__32457); 
             after(grammarAccess.getEmbedAccess().getLeftCurlyBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Embed__Group__4_in_rule__Embed__Group__32467);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1238:1: rule__Embed__Group__4 : ( ( rule__Embed__AttributesAssignment_4 )* ) rule__Embed__Group__5 ;
    public final void rule__Embed__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1242:1: ( ( ( rule__Embed__AttributesAssignment_4 )* ) rule__Embed__Group__5 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1243:1: ( ( rule__Embed__AttributesAssignment_4 )* ) rule__Embed__Group__5
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1243:1: ( ( rule__Embed__AttributesAssignment_4 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1244:1: ( rule__Embed__AttributesAssignment_4 )*
            {
             before(grammarAccess.getEmbedAccess().getAttributesAssignment_4()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1245:1: ( rule__Embed__AttributesAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1245:2: rule__Embed__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Embed__AttributesAssignment_4_in_rule__Embed__Group__42495);
            	    rule__Embed__AttributesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEmbedAccess().getAttributesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Embed__Group__5_in_rule__Embed__Group__42505);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1256:1: rule__Embed__Group__5 : ( '}' ) ;
    public final void rule__Embed__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1260:1: ( ( '}' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1261:1: ( '}' )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1261:1: ( '}' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1262:1: '}'
            {
             before(grammarAccess.getEmbedAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Embed__Group__52534); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1287:1: rule__Embed__Group_2__0 : ( 'extends' ) rule__Embed__Group_2__1 ;
    public final void rule__Embed__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1291:1: ( ( 'extends' ) rule__Embed__Group_2__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1292:1: ( 'extends' ) rule__Embed__Group_2__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1292:1: ( 'extends' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1293:1: 'extends'
            {
             before(grammarAccess.getEmbedAccess().getExtendsKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Embed__Group_2__02582); 
             after(grammarAccess.getEmbedAccess().getExtendsKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Embed__Group_2__1_in_rule__Embed__Group_2__02592);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1307:1: rule__Embed__Group_2__1 : ( ( rule__Embed__SuperEntityAssignment_2_1 ) ) ;
    public final void rule__Embed__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1311:1: ( ( ( rule__Embed__SuperEntityAssignment_2_1 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1312:1: ( ( rule__Embed__SuperEntityAssignment_2_1 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1312:1: ( ( rule__Embed__SuperEntityAssignment_2_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1313:1: ( rule__Embed__SuperEntityAssignment_2_1 )
            {
             before(grammarAccess.getEmbedAccess().getSuperEntityAssignment_2_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1314:1: ( rule__Embed__SuperEntityAssignment_2_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1314:2: rule__Embed__SuperEntityAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Embed__SuperEntityAssignment_2_1_in_rule__Embed__Group_2__12620);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1328:1: rule__Attribute__Group__0 : ( ( rule__Attribute__TypeAssignment_0 ) ) rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1332:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) rule__Attribute__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1333:1: ( ( rule__Attribute__TypeAssignment_0 ) ) rule__Attribute__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1333:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1334:1: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1335:1: ( rule__Attribute__TypeAssignment_0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1335:2: rule__Attribute__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__02658);
            rule__Attribute__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02667);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1346:1: rule__Attribute__Group__1 : ( ( rule__Attribute__ManyReferenceAssignment_1 )? ) rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1350:1: ( ( ( rule__Attribute__ManyReferenceAssignment_1 )? ) rule__Attribute__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1351:1: ( ( rule__Attribute__ManyReferenceAssignment_1 )? ) rule__Attribute__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1351:1: ( ( rule__Attribute__ManyReferenceAssignment_1 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1352:1: ( rule__Attribute__ManyReferenceAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getManyReferenceAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1353:1: ( rule__Attribute__ManyReferenceAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=11 && LA12_0<=13)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1353:2: rule__Attribute__ManyReferenceAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__ManyReferenceAssignment_1_in_rule__Attribute__Group__12695);
                    rule__Attribute__ManyReferenceAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getManyReferenceAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12705);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1364:1: rule__Attribute__Group__2 : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1368:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1369:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1369:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1370:1: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1371:1: ( rule__Attribute__NameAssignment_2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1371:2: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__22733);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1387:1: rule__Enumeration__Group__0 : ( 'enum' ) rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1391:1: ( ( 'enum' ) rule__Enumeration__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1392:1: ( 'enum' ) rule__Enumeration__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1392:1: ( 'enum' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1393:1: 'enum'
            {
             before(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Enumeration__Group__02774); 
             after(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__02784);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1407:1: rule__Enumeration__Group__1 : ( ( rule__Enumeration__NameAssignment_1 ) ) rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1411:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) rule__Enumeration__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1412:1: ( ( rule__Enumeration__NameAssignment_1 ) ) rule__Enumeration__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1412:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1413:1: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1414:1: ( rule__Enumeration__NameAssignment_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1414:2: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__12812);
            rule__Enumeration__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__12821);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1425:1: rule__Enumeration__Group__2 : ( '{' ) rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1429:1: ( ( '{' ) rule__Enumeration__Group__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1430:1: ( '{' ) rule__Enumeration__Group__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1430:1: ( '{' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1431:1: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Enumeration__Group__22850); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__22860);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1445:1: rule__Enumeration__Group__3 : ( ( rule__Enumeration__LiteralsAssignment_3 )* ) rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1449:1: ( ( ( rule__Enumeration__LiteralsAssignment_3 )* ) rule__Enumeration__Group__4 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1450:1: ( ( rule__Enumeration__LiteralsAssignment_3 )* ) rule__Enumeration__Group__4
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1450:1: ( ( rule__Enumeration__LiteralsAssignment_3 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1451:1: ( rule__Enumeration__LiteralsAssignment_3 )*
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1452:1: ( rule__Enumeration__LiteralsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1452:2: rule__Enumeration__LiteralsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__LiteralsAssignment_3_in_rule__Enumeration__Group__32888);
            	    rule__Enumeration__LiteralsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__32898);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1463:1: rule__Enumeration__Group__4 : ( '}' ) ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1467:1: ( ( '}' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1468:1: ( '}' )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1468:1: ( '}' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1469:1: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Enumeration__Group__42927); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1492:1: rule__EnumerationLiteral__Group__0 : ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1496:1: ( ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) rule__EnumerationLiteral__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1497:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) rule__EnumerationLiteral__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1497:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1498:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1499:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1499:2: rule__EnumerationLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__02972);
            rule__EnumerationLiteral__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__02981);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1510:1: rule__EnumerationLiteral__Group__1 : ( '(' ) rule__EnumerationLiteral__Group__2 ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1514:1: ( ( '(' ) rule__EnumerationLiteral__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1515:1: ( '(' ) rule__EnumerationLiteral__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1515:1: ( '(' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1516:1: '('
            {
             before(grammarAccess.getEnumerationLiteralAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__EnumerationLiteral__Group__13010); 
             after(grammarAccess.getEnumerationLiteralAccess().getLeftParenthesisKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__13020);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1530:1: rule__EnumerationLiteral__Group__2 : ( ( rule__EnumerationLiteral__OrdinalAssignment_2 ) ) rule__EnumerationLiteral__Group__3 ;
    public final void rule__EnumerationLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1534:1: ( ( ( rule__EnumerationLiteral__OrdinalAssignment_2 ) ) rule__EnumerationLiteral__Group__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1535:1: ( ( rule__EnumerationLiteral__OrdinalAssignment_2 ) ) rule__EnumerationLiteral__Group__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1535:1: ( ( rule__EnumerationLiteral__OrdinalAssignment_2 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1536:1: ( rule__EnumerationLiteral__OrdinalAssignment_2 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getOrdinalAssignment_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1537:1: ( rule__EnumerationLiteral__OrdinalAssignment_2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1537:2: rule__EnumerationLiteral__OrdinalAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__OrdinalAssignment_2_in_rule__EnumerationLiteral__Group__23048);
            rule__EnumerationLiteral__OrdinalAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getOrdinalAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__3_in_rule__EnumerationLiteral__Group__23057);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1548:1: rule__EnumerationLiteral__Group__3 : ( ')' ) ;
    public final void rule__EnumerationLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1552:1: ( ( ')' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1553:1: ( ')' )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1553:1: ( ')' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1554:1: ')'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getRightParenthesisKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__EnumerationLiteral__Group__33086); 
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


    // $ANTLR start rule__Query__Group__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1575:1: rule__Query__Group__0 : ( 'query' ) rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1579:1: ( ( 'query' ) rule__Query__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1580:1: ( 'query' ) rule__Query__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1580:1: ( 'query' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1581:1: 'query'
            {
             before(grammarAccess.getQueryAccess().getQueryKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Query__Group__03130); 
             after(grammarAccess.getQueryAccess().getQueryKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Query__Group__1_in_rule__Query__Group__03140);
            rule__Query__Group__1();
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
    // $ANTLR end rule__Query__Group__0


    // $ANTLR start rule__Query__Group__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1595:1: rule__Query__Group__1 : ( ( rule__Query__NameAssignment_1 ) ) rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1599:1: ( ( ( rule__Query__NameAssignment_1 ) ) rule__Query__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1600:1: ( ( rule__Query__NameAssignment_1 ) ) rule__Query__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1600:1: ( ( rule__Query__NameAssignment_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1601:1: ( rule__Query__NameAssignment_1 )
            {
             before(grammarAccess.getQueryAccess().getNameAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1602:1: ( rule__Query__NameAssignment_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1602:2: rule__Query__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Query__NameAssignment_1_in_rule__Query__Group__13168);
            rule__Query__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getQueryAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Query__Group__2_in_rule__Query__Group__13177);
            rule__Query__Group__2();
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
    // $ANTLR end rule__Query__Group__1


    // $ANTLR start rule__Query__Group__2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1613:1: rule__Query__Group__2 : ( '<' ) rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1617:1: ( ( '<' ) rule__Query__Group__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1618:1: ( '<' ) rule__Query__Group__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1618:1: ( '<' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1619:1: '<'
            {
             before(grammarAccess.getQueryAccess().getLessThanSignKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Query__Group__23206); 
             after(grammarAccess.getQueryAccess().getLessThanSignKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Query__Group__3_in_rule__Query__Group__23216);
            rule__Query__Group__3();
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
    // $ANTLR end rule__Query__Group__2


    // $ANTLR start rule__Query__Group__3
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1633:1: rule__Query__Group__3 : ( ( rule__Query__EntitiesAssignment_3 ) ) rule__Query__Group__4 ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1637:1: ( ( ( rule__Query__EntitiesAssignment_3 ) ) rule__Query__Group__4 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1638:1: ( ( rule__Query__EntitiesAssignment_3 ) ) rule__Query__Group__4
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1638:1: ( ( rule__Query__EntitiesAssignment_3 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1639:1: ( rule__Query__EntitiesAssignment_3 )
            {
             before(grammarAccess.getQueryAccess().getEntitiesAssignment_3()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1640:1: ( rule__Query__EntitiesAssignment_3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1640:2: rule__Query__EntitiesAssignment_3
            {
            pushFollow(FOLLOW_rule__Query__EntitiesAssignment_3_in_rule__Query__Group__33244);
            rule__Query__EntitiesAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getQueryAccess().getEntitiesAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Query__Group__4_in_rule__Query__Group__33253);
            rule__Query__Group__4();
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
    // $ANTLR end rule__Query__Group__3


    // $ANTLR start rule__Query__Group__4
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1651:1: rule__Query__Group__4 : ( ( rule__Query__Group_4__0 )* ) rule__Query__Group__5 ;
    public final void rule__Query__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1655:1: ( ( ( rule__Query__Group_4__0 )* ) rule__Query__Group__5 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1656:1: ( ( rule__Query__Group_4__0 )* ) rule__Query__Group__5
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1656:1: ( ( rule__Query__Group_4__0 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1657:1: ( rule__Query__Group_4__0 )*
            {
             before(grammarAccess.getQueryAccess().getGroup_4()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1658:1: ( rule__Query__Group_4__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==35) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1658:2: rule__Query__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Query__Group_4__0_in_rule__Query__Group__43281);
            	    rule__Query__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getQueryAccess().getGroup_4()); 

            }

            pushFollow(FOLLOW_rule__Query__Group__5_in_rule__Query__Group__43291);
            rule__Query__Group__5();
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
    // $ANTLR end rule__Query__Group__4


    // $ANTLR start rule__Query__Group__5
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1669:1: rule__Query__Group__5 : ( '>' ) rule__Query__Group__6 ;
    public final void rule__Query__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1673:1: ( ( '>' ) rule__Query__Group__6 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1674:1: ( '>' ) rule__Query__Group__6
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1674:1: ( '>' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1675:1: '>'
            {
             before(grammarAccess.getQueryAccess().getGreaterThanSignKeyword_5()); 
            match(input,33,FOLLOW_33_in_rule__Query__Group__53320); 
             after(grammarAccess.getQueryAccess().getGreaterThanSignKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__Query__Group__6_in_rule__Query__Group__53330);
            rule__Query__Group__6();
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
    // $ANTLR end rule__Query__Group__5


    // $ANTLR start rule__Query__Group__6
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1689:1: rule__Query__Group__6 : ( 'with' ) rule__Query__Group__7 ;
    public final void rule__Query__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1693:1: ( ( 'with' ) rule__Query__Group__7 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1694:1: ( 'with' ) rule__Query__Group__7
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1694:1: ( 'with' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1695:1: 'with'
            {
             before(grammarAccess.getQueryAccess().getWithKeyword_6()); 
            match(input,34,FOLLOW_34_in_rule__Query__Group__63359); 
             after(grammarAccess.getQueryAccess().getWithKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__Query__Group__7_in_rule__Query__Group__63369);
            rule__Query__Group__7();
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
    // $ANTLR end rule__Query__Group__6


    // $ANTLR start rule__Query__Group__7
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1709:1: rule__Query__Group__7 : ( '(' ) rule__Query__Group__8 ;
    public final void rule__Query__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1713:1: ( ( '(' ) rule__Query__Group__8 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1714:1: ( '(' ) rule__Query__Group__8
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1714:1: ( '(' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1715:1: '('
            {
             before(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_7()); 
            match(input,29,FOLLOW_29_in_rule__Query__Group__73398); 
             after(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_7()); 

            }

            pushFollow(FOLLOW_rule__Query__Group__8_in_rule__Query__Group__73408);
            rule__Query__Group__8();
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
    // $ANTLR end rule__Query__Group__7


    // $ANTLR start rule__Query__Group__8
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1729:1: rule__Query__Group__8 : ( ( rule__Query__ParametersAssignment_8 )? ) rule__Query__Group__9 ;
    public final void rule__Query__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1733:1: ( ( ( rule__Query__ParametersAssignment_8 )? ) rule__Query__Group__9 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1734:1: ( ( rule__Query__ParametersAssignment_8 )? ) rule__Query__Group__9
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1734:1: ( ( rule__Query__ParametersAssignment_8 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1735:1: ( rule__Query__ParametersAssignment_8 )?
            {
             before(grammarAccess.getQueryAccess().getParametersAssignment_8()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1736:1: ( rule__Query__ParametersAssignment_8 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1736:2: rule__Query__ParametersAssignment_8
                    {
                    pushFollow(FOLLOW_rule__Query__ParametersAssignment_8_in_rule__Query__Group__83436);
                    rule__Query__ParametersAssignment_8();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryAccess().getParametersAssignment_8()); 

            }

            pushFollow(FOLLOW_rule__Query__Group__9_in_rule__Query__Group__83446);
            rule__Query__Group__9();
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
    // $ANTLR end rule__Query__Group__8


    // $ANTLR start rule__Query__Group__9
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1747:1: rule__Query__Group__9 : ( ( rule__Query__Group_9__0 )* ) rule__Query__Group__10 ;
    public final void rule__Query__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1751:1: ( ( ( rule__Query__Group_9__0 )* ) rule__Query__Group__10 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1752:1: ( ( rule__Query__Group_9__0 )* ) rule__Query__Group__10
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1752:1: ( ( rule__Query__Group_9__0 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1753:1: ( rule__Query__Group_9__0 )*
            {
             before(grammarAccess.getQueryAccess().getGroup_9()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1754:1: ( rule__Query__Group_9__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==35) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1754:2: rule__Query__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__Query__Group_9__0_in_rule__Query__Group__93474);
            	    rule__Query__Group_9__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getQueryAccess().getGroup_9()); 

            }

            pushFollow(FOLLOW_rule__Query__Group__10_in_rule__Query__Group__93484);
            rule__Query__Group__10();
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
    // $ANTLR end rule__Query__Group__9


    // $ANTLR start rule__Query__Group__10
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1765:1: rule__Query__Group__10 : ( ')' ) rule__Query__Group__11 ;
    public final void rule__Query__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1769:1: ( ( ')' ) rule__Query__Group__11 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1770:1: ( ')' ) rule__Query__Group__11
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1770:1: ( ')' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1771:1: ')'
            {
             before(grammarAccess.getQueryAccess().getRightParenthesisKeyword_10()); 
            match(input,30,FOLLOW_30_in_rule__Query__Group__103513); 
             after(grammarAccess.getQueryAccess().getRightParenthesisKeyword_10()); 

            }

            pushFollow(FOLLOW_rule__Query__Group__11_in_rule__Query__Group__103523);
            rule__Query__Group__11();
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
    // $ANTLR end rule__Query__Group__10


    // $ANTLR start rule__Query__Group__11
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1785:1: rule__Query__Group__11 : ( '{' ) rule__Query__Group__12 ;
    public final void rule__Query__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1789:1: ( ( '{' ) rule__Query__Group__12 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1790:1: ( '{' ) rule__Query__Group__12
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1790:1: ( '{' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1791:1: '{'
            {
             before(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,17,FOLLOW_17_in_rule__Query__Group__113552); 
             after(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_11()); 

            }

            pushFollow(FOLLOW_rule__Query__Group__12_in_rule__Query__Group__113562);
            rule__Query__Group__12();
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
    // $ANTLR end rule__Query__Group__11


    // $ANTLR start rule__Query__Group__12
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1805:1: rule__Query__Group__12 : ( ( rule__Query__FiltersAssignment_12 )* ) rule__Query__Group__13 ;
    public final void rule__Query__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1809:1: ( ( ( rule__Query__FiltersAssignment_12 )* ) rule__Query__Group__13 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1810:1: ( ( rule__Query__FiltersAssignment_12 )* ) rule__Query__Group__13
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1810:1: ( ( rule__Query__FiltersAssignment_12 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1811:1: ( rule__Query__FiltersAssignment_12 )*
            {
             before(grammarAccess.getQueryAccess().getFiltersAssignment_12()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1812:1: ( rule__Query__FiltersAssignment_12 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==24) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1812:2: rule__Query__FiltersAssignment_12
            	    {
            	    pushFollow(FOLLOW_rule__Query__FiltersAssignment_12_in_rule__Query__Group__123590);
            	    rule__Query__FiltersAssignment_12();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getQueryAccess().getFiltersAssignment_12()); 

            }

            pushFollow(FOLLOW_rule__Query__Group__13_in_rule__Query__Group__123600);
            rule__Query__Group__13();
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
    // $ANTLR end rule__Query__Group__12


    // $ANTLR start rule__Query__Group__13
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1823:1: rule__Query__Group__13 : ( ( rule__Query__Group_13__0 )? ) rule__Query__Group__14 ;
    public final void rule__Query__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1827:1: ( ( ( rule__Query__Group_13__0 )? ) rule__Query__Group__14 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1828:1: ( ( rule__Query__Group_13__0 )? ) rule__Query__Group__14
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1828:1: ( ( rule__Query__Group_13__0 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1829:1: ( rule__Query__Group_13__0 )?
            {
             before(grammarAccess.getQueryAccess().getGroup_13()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1830:1: ( rule__Query__Group_13__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1830:2: rule__Query__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__Query__Group_13__0_in_rule__Query__Group__133628);
                    rule__Query__Group_13__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryAccess().getGroup_13()); 

            }

            pushFollow(FOLLOW_rule__Query__Group__14_in_rule__Query__Group__133638);
            rule__Query__Group__14();
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
    // $ANTLR end rule__Query__Group__13


    // $ANTLR start rule__Query__Group__14
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1841:1: rule__Query__Group__14 : ( ( rule__Query__Group_14__0 )? ) rule__Query__Group__15 ;
    public final void rule__Query__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1845:1: ( ( ( rule__Query__Group_14__0 )? ) rule__Query__Group__15 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1846:1: ( ( rule__Query__Group_14__0 )? ) rule__Query__Group__15
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1846:1: ( ( rule__Query__Group_14__0 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1847:1: ( rule__Query__Group_14__0 )?
            {
             before(grammarAccess.getQueryAccess().getGroup_14()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1848:1: ( rule__Query__Group_14__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1848:2: rule__Query__Group_14__0
                    {
                    pushFollow(FOLLOW_rule__Query__Group_14__0_in_rule__Query__Group__143666);
                    rule__Query__Group_14__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryAccess().getGroup_14()); 

            }

            pushFollow(FOLLOW_rule__Query__Group__15_in_rule__Query__Group__143676);
            rule__Query__Group__15();
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
    // $ANTLR end rule__Query__Group__14


    // $ANTLR start rule__Query__Group__15
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1859:1: rule__Query__Group__15 : ( ( rule__Query__Group_15__0 )? ) rule__Query__Group__16 ;
    public final void rule__Query__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1863:1: ( ( ( rule__Query__Group_15__0 )? ) rule__Query__Group__16 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1864:1: ( ( rule__Query__Group_15__0 )? ) rule__Query__Group__16
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1864:1: ( ( rule__Query__Group_15__0 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1865:1: ( rule__Query__Group_15__0 )?
            {
             before(grammarAccess.getQueryAccess().getGroup_15()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1866:1: ( rule__Query__Group_15__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1866:2: rule__Query__Group_15__0
                    {
                    pushFollow(FOLLOW_rule__Query__Group_15__0_in_rule__Query__Group__153704);
                    rule__Query__Group_15__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryAccess().getGroup_15()); 

            }

            pushFollow(FOLLOW_rule__Query__Group__16_in_rule__Query__Group__153714);
            rule__Query__Group__16();
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
    // $ANTLR end rule__Query__Group__15


    // $ANTLR start rule__Query__Group__16
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1877:1: rule__Query__Group__16 : ( '}' ) ;
    public final void rule__Query__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1881:1: ( ( '}' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1882:1: ( '}' )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1882:1: ( '}' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1883:1: '}'
            {
             before(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_16()); 
            match(input,21,FOLLOW_21_in_rule__Query__Group__163743); 
             after(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_16()); 

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
    // $ANTLR end rule__Query__Group__16


    // $ANTLR start rule__Query__Group_4__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1930:1: rule__Query__Group_4__0 : ( ',' ) rule__Query__Group_4__1 ;
    public final void rule__Query__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1934:1: ( ( ',' ) rule__Query__Group_4__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1935:1: ( ',' ) rule__Query__Group_4__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1935:1: ( ',' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1936:1: ','
            {
             before(grammarAccess.getQueryAccess().getCommaKeyword_4_0()); 
            match(input,35,FOLLOW_35_in_rule__Query__Group_4__03813); 
             after(grammarAccess.getQueryAccess().getCommaKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__Query__Group_4__1_in_rule__Query__Group_4__03823);
            rule__Query__Group_4__1();
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
    // $ANTLR end rule__Query__Group_4__0


    // $ANTLR start rule__Query__Group_4__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1950:1: rule__Query__Group_4__1 : ( ( rule__Query__EntitiesAssignment_4_1 ) ) ;
    public final void rule__Query__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1954:1: ( ( ( rule__Query__EntitiesAssignment_4_1 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1955:1: ( ( rule__Query__EntitiesAssignment_4_1 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1955:1: ( ( rule__Query__EntitiesAssignment_4_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1956:1: ( rule__Query__EntitiesAssignment_4_1 )
            {
             before(grammarAccess.getQueryAccess().getEntitiesAssignment_4_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1957:1: ( rule__Query__EntitiesAssignment_4_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1957:2: rule__Query__EntitiesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Query__EntitiesAssignment_4_1_in_rule__Query__Group_4__13851);
            rule__Query__EntitiesAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getQueryAccess().getEntitiesAssignment_4_1()); 

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
    // $ANTLR end rule__Query__Group_4__1


    // $ANTLR start rule__Query__Group_9__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1971:1: rule__Query__Group_9__0 : ( ',' ) rule__Query__Group_9__1 ;
    public final void rule__Query__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1975:1: ( ( ',' ) rule__Query__Group_9__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1976:1: ( ',' ) rule__Query__Group_9__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1976:1: ( ',' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1977:1: ','
            {
             before(grammarAccess.getQueryAccess().getCommaKeyword_9_0()); 
            match(input,35,FOLLOW_35_in_rule__Query__Group_9__03890); 
             after(grammarAccess.getQueryAccess().getCommaKeyword_9_0()); 

            }

            pushFollow(FOLLOW_rule__Query__Group_9__1_in_rule__Query__Group_9__03900);
            rule__Query__Group_9__1();
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
    // $ANTLR end rule__Query__Group_9__0


    // $ANTLR start rule__Query__Group_9__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1991:1: rule__Query__Group_9__1 : ( ( rule__Query__ParametersAssignment_9_1 ) ) ;
    public final void rule__Query__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1995:1: ( ( ( rule__Query__ParametersAssignment_9_1 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1996:1: ( ( rule__Query__ParametersAssignment_9_1 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1996:1: ( ( rule__Query__ParametersAssignment_9_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1997:1: ( rule__Query__ParametersAssignment_9_1 )
            {
             before(grammarAccess.getQueryAccess().getParametersAssignment_9_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1998:1: ( rule__Query__ParametersAssignment_9_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:1998:2: rule__Query__ParametersAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Query__ParametersAssignment_9_1_in_rule__Query__Group_9__13928);
            rule__Query__ParametersAssignment_9_1();
            _fsp--;


            }

             after(grammarAccess.getQueryAccess().getParametersAssignment_9_1()); 

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
    // $ANTLR end rule__Query__Group_9__1


    // $ANTLR start rule__Query__Group_13__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2012:1: rule__Query__Group_13__0 : ( '-max' ) rule__Query__Group_13__1 ;
    public final void rule__Query__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2016:1: ( ( '-max' ) rule__Query__Group_13__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2017:1: ( '-max' ) rule__Query__Group_13__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2017:1: ( '-max' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2018:1: '-max'
            {
             before(grammarAccess.getQueryAccess().getMaxKeyword_13_0()); 
            match(input,36,FOLLOW_36_in_rule__Query__Group_13__03967); 
             after(grammarAccess.getQueryAccess().getMaxKeyword_13_0()); 

            }

            pushFollow(FOLLOW_rule__Query__Group_13__1_in_rule__Query__Group_13__03977);
            rule__Query__Group_13__1();
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
    // $ANTLR end rule__Query__Group_13__0


    // $ANTLR start rule__Query__Group_13__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2032:1: rule__Query__Group_13__1 : ( '(' ) rule__Query__Group_13__2 ;
    public final void rule__Query__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2036:1: ( ( '(' ) rule__Query__Group_13__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2037:1: ( '(' ) rule__Query__Group_13__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2037:1: ( '(' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2038:1: '('
            {
             before(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_13_1()); 
            match(input,29,FOLLOW_29_in_rule__Query__Group_13__14006); 
             after(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_13_1()); 

            }

            pushFollow(FOLLOW_rule__Query__Group_13__2_in_rule__Query__Group_13__14016);
            rule__Query__Group_13__2();
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
    // $ANTLR end rule__Query__Group_13__1


    // $ANTLR start rule__Query__Group_13__2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2052:1: rule__Query__Group_13__2 : ( ( rule__Query__MaxAssignment_13_2 ) ) rule__Query__Group_13__3 ;
    public final void rule__Query__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2056:1: ( ( ( rule__Query__MaxAssignment_13_2 ) ) rule__Query__Group_13__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2057:1: ( ( rule__Query__MaxAssignment_13_2 ) ) rule__Query__Group_13__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2057:1: ( ( rule__Query__MaxAssignment_13_2 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2058:1: ( rule__Query__MaxAssignment_13_2 )
            {
             before(grammarAccess.getQueryAccess().getMaxAssignment_13_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2059:1: ( rule__Query__MaxAssignment_13_2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2059:2: rule__Query__MaxAssignment_13_2
            {
            pushFollow(FOLLOW_rule__Query__MaxAssignment_13_2_in_rule__Query__Group_13__24044);
            rule__Query__MaxAssignment_13_2();
            _fsp--;


            }

             after(grammarAccess.getQueryAccess().getMaxAssignment_13_2()); 

            }

            pushFollow(FOLLOW_rule__Query__Group_13__3_in_rule__Query__Group_13__24053);
            rule__Query__Group_13__3();
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
    // $ANTLR end rule__Query__Group_13__2


    // $ANTLR start rule__Query__Group_13__3
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2070:1: rule__Query__Group_13__3 : ( ')' ) ;
    public final void rule__Query__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2074:1: ( ( ')' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2075:1: ( ')' )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2075:1: ( ')' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2076:1: ')'
            {
             before(grammarAccess.getQueryAccess().getRightParenthesisKeyword_13_3()); 
            match(input,30,FOLLOW_30_in_rule__Query__Group_13__34082); 
             after(grammarAccess.getQueryAccess().getRightParenthesisKeyword_13_3()); 

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
    // $ANTLR end rule__Query__Group_13__3


    // $ANTLR start rule__Query__Group_14__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2097:1: rule__Query__Group_14__0 : ( '-offset' ) rule__Query__Group_14__1 ;
    public final void rule__Query__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2101:1: ( ( '-offset' ) rule__Query__Group_14__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2102:1: ( '-offset' ) rule__Query__Group_14__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2102:1: ( '-offset' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2103:1: '-offset'
            {
             before(grammarAccess.getQueryAccess().getOffsetKeyword_14_0()); 
            match(input,37,FOLLOW_37_in_rule__Query__Group_14__04126); 
             after(grammarAccess.getQueryAccess().getOffsetKeyword_14_0()); 

            }

            pushFollow(FOLLOW_rule__Query__Group_14__1_in_rule__Query__Group_14__04136);
            rule__Query__Group_14__1();
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
    // $ANTLR end rule__Query__Group_14__0


    // $ANTLR start rule__Query__Group_14__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2117:1: rule__Query__Group_14__1 : ( '(' ) rule__Query__Group_14__2 ;
    public final void rule__Query__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2121:1: ( ( '(' ) rule__Query__Group_14__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2122:1: ( '(' ) rule__Query__Group_14__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2122:1: ( '(' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2123:1: '('
            {
             before(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_14_1()); 
            match(input,29,FOLLOW_29_in_rule__Query__Group_14__14165); 
             after(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_14_1()); 

            }

            pushFollow(FOLLOW_rule__Query__Group_14__2_in_rule__Query__Group_14__14175);
            rule__Query__Group_14__2();
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
    // $ANTLR end rule__Query__Group_14__1


    // $ANTLR start rule__Query__Group_14__2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2137:1: rule__Query__Group_14__2 : ( ( rule__Query__OffsetAssignment_14_2 ) ) rule__Query__Group_14__3 ;
    public final void rule__Query__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2141:1: ( ( ( rule__Query__OffsetAssignment_14_2 ) ) rule__Query__Group_14__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2142:1: ( ( rule__Query__OffsetAssignment_14_2 ) ) rule__Query__Group_14__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2142:1: ( ( rule__Query__OffsetAssignment_14_2 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2143:1: ( rule__Query__OffsetAssignment_14_2 )
            {
             before(grammarAccess.getQueryAccess().getOffsetAssignment_14_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2144:1: ( rule__Query__OffsetAssignment_14_2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2144:2: rule__Query__OffsetAssignment_14_2
            {
            pushFollow(FOLLOW_rule__Query__OffsetAssignment_14_2_in_rule__Query__Group_14__24203);
            rule__Query__OffsetAssignment_14_2();
            _fsp--;


            }

             after(grammarAccess.getQueryAccess().getOffsetAssignment_14_2()); 

            }

            pushFollow(FOLLOW_rule__Query__Group_14__3_in_rule__Query__Group_14__24212);
            rule__Query__Group_14__3();
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
    // $ANTLR end rule__Query__Group_14__2


    // $ANTLR start rule__Query__Group_14__3
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2155:1: rule__Query__Group_14__3 : ( ')' ) ;
    public final void rule__Query__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2159:1: ( ( ')' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2160:1: ( ')' )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2160:1: ( ')' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2161:1: ')'
            {
             before(grammarAccess.getQueryAccess().getRightParenthesisKeyword_14_3()); 
            match(input,30,FOLLOW_30_in_rule__Query__Group_14__34241); 
             after(grammarAccess.getQueryAccess().getRightParenthesisKeyword_14_3()); 

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
    // $ANTLR end rule__Query__Group_14__3


    // $ANTLR start rule__Query__Group_15__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2182:1: rule__Query__Group_15__0 : ( '-order' ) rule__Query__Group_15__1 ;
    public final void rule__Query__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2186:1: ( ( '-order' ) rule__Query__Group_15__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2187:1: ( '-order' ) rule__Query__Group_15__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2187:1: ( '-order' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2188:1: '-order'
            {
             before(grammarAccess.getQueryAccess().getOrderKeyword_15_0()); 
            match(input,38,FOLLOW_38_in_rule__Query__Group_15__04285); 
             after(grammarAccess.getQueryAccess().getOrderKeyword_15_0()); 

            }

            pushFollow(FOLLOW_rule__Query__Group_15__1_in_rule__Query__Group_15__04295);
            rule__Query__Group_15__1();
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
    // $ANTLR end rule__Query__Group_15__0


    // $ANTLR start rule__Query__Group_15__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2202:1: rule__Query__Group_15__1 : ( '(' ) rule__Query__Group_15__2 ;
    public final void rule__Query__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2206:1: ( ( '(' ) rule__Query__Group_15__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2207:1: ( '(' ) rule__Query__Group_15__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2207:1: ( '(' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2208:1: '('
            {
             before(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_15_1()); 
            match(input,29,FOLLOW_29_in_rule__Query__Group_15__14324); 
             after(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_15_1()); 

            }

            pushFollow(FOLLOW_rule__Query__Group_15__2_in_rule__Query__Group_15__14334);
            rule__Query__Group_15__2();
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
    // $ANTLR end rule__Query__Group_15__1


    // $ANTLR start rule__Query__Group_15__2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2222:1: rule__Query__Group_15__2 : ( ( rule__Query__OrdersAssignment_15_2 )? ) rule__Query__Group_15__3 ;
    public final void rule__Query__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2226:1: ( ( ( rule__Query__OrdersAssignment_15_2 )? ) rule__Query__Group_15__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2227:1: ( ( rule__Query__OrdersAssignment_15_2 )? ) rule__Query__Group_15__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2227:1: ( ( rule__Query__OrdersAssignment_15_2 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2228:1: ( rule__Query__OrdersAssignment_15_2 )?
            {
             before(grammarAccess.getQueryAccess().getOrdersAssignment_15_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2229:1: ( rule__Query__OrdersAssignment_15_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2229:2: rule__Query__OrdersAssignment_15_2
                    {
                    pushFollow(FOLLOW_rule__Query__OrdersAssignment_15_2_in_rule__Query__Group_15__24362);
                    rule__Query__OrdersAssignment_15_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryAccess().getOrdersAssignment_15_2()); 

            }

            pushFollow(FOLLOW_rule__Query__Group_15__3_in_rule__Query__Group_15__24372);
            rule__Query__Group_15__3();
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
    // $ANTLR end rule__Query__Group_15__2


    // $ANTLR start rule__Query__Group_15__3
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2240:1: rule__Query__Group_15__3 : ( ( rule__Query__Group_15_3__0 )* ) rule__Query__Group_15__4 ;
    public final void rule__Query__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2244:1: ( ( ( rule__Query__Group_15_3__0 )* ) rule__Query__Group_15__4 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2245:1: ( ( rule__Query__Group_15_3__0 )* ) rule__Query__Group_15__4
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2245:1: ( ( rule__Query__Group_15_3__0 )* )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2246:1: ( rule__Query__Group_15_3__0 )*
            {
             before(grammarAccess.getQueryAccess().getGroup_15_3()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2247:1: ( rule__Query__Group_15_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==35) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2247:2: rule__Query__Group_15_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Query__Group_15_3__0_in_rule__Query__Group_15__34400);
            	    rule__Query__Group_15_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getQueryAccess().getGroup_15_3()); 

            }

            pushFollow(FOLLOW_rule__Query__Group_15__4_in_rule__Query__Group_15__34410);
            rule__Query__Group_15__4();
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
    // $ANTLR end rule__Query__Group_15__3


    // $ANTLR start rule__Query__Group_15__4
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2258:1: rule__Query__Group_15__4 : ( ')' ) ;
    public final void rule__Query__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2262:1: ( ( ')' ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2263:1: ( ')' )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2263:1: ( ')' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2264:1: ')'
            {
             before(grammarAccess.getQueryAccess().getRightParenthesisKeyword_15_4()); 
            match(input,30,FOLLOW_30_in_rule__Query__Group_15__44439); 
             after(grammarAccess.getQueryAccess().getRightParenthesisKeyword_15_4()); 

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
    // $ANTLR end rule__Query__Group_15__4


    // $ANTLR start rule__Query__Group_15_3__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2287:1: rule__Query__Group_15_3__0 : ( ',' ) rule__Query__Group_15_3__1 ;
    public final void rule__Query__Group_15_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2291:1: ( ( ',' ) rule__Query__Group_15_3__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2292:1: ( ',' ) rule__Query__Group_15_3__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2292:1: ( ',' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2293:1: ','
            {
             before(grammarAccess.getQueryAccess().getCommaKeyword_15_3_0()); 
            match(input,35,FOLLOW_35_in_rule__Query__Group_15_3__04485); 
             after(grammarAccess.getQueryAccess().getCommaKeyword_15_3_0()); 

            }

            pushFollow(FOLLOW_rule__Query__Group_15_3__1_in_rule__Query__Group_15_3__04495);
            rule__Query__Group_15_3__1();
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
    // $ANTLR end rule__Query__Group_15_3__0


    // $ANTLR start rule__Query__Group_15_3__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2307:1: rule__Query__Group_15_3__1 : ( ( rule__Query__OrdersAssignment_15_3_1 ) ) ;
    public final void rule__Query__Group_15_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2311:1: ( ( ( rule__Query__OrdersAssignment_15_3_1 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2312:1: ( ( rule__Query__OrdersAssignment_15_3_1 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2312:1: ( ( rule__Query__OrdersAssignment_15_3_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2313:1: ( rule__Query__OrdersAssignment_15_3_1 )
            {
             before(grammarAccess.getQueryAccess().getOrdersAssignment_15_3_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2314:1: ( rule__Query__OrdersAssignment_15_3_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2314:2: rule__Query__OrdersAssignment_15_3_1
            {
            pushFollow(FOLLOW_rule__Query__OrdersAssignment_15_3_1_in_rule__Query__Group_15_3__14523);
            rule__Query__OrdersAssignment_15_3_1();
            _fsp--;


            }

             after(grammarAccess.getQueryAccess().getOrdersAssignment_15_3_1()); 

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
    // $ANTLR end rule__Query__Group_15_3__1


    // $ANTLR start rule__QueryParameter__Group__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2328:1: rule__QueryParameter__Group__0 : ( ( rule__QueryParameter__TypeAssignment_0 ) ) rule__QueryParameter__Group__1 ;
    public final void rule__QueryParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2332:1: ( ( ( rule__QueryParameter__TypeAssignment_0 ) ) rule__QueryParameter__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2333:1: ( ( rule__QueryParameter__TypeAssignment_0 ) ) rule__QueryParameter__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2333:1: ( ( rule__QueryParameter__TypeAssignment_0 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2334:1: ( rule__QueryParameter__TypeAssignment_0 )
            {
             before(grammarAccess.getQueryParameterAccess().getTypeAssignment_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2335:1: ( rule__QueryParameter__TypeAssignment_0 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2335:2: rule__QueryParameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__QueryParameter__TypeAssignment_0_in_rule__QueryParameter__Group__04561);
            rule__QueryParameter__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getQueryParameterAccess().getTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__QueryParameter__Group__1_in_rule__QueryParameter__Group__04570);
            rule__QueryParameter__Group__1();
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
    // $ANTLR end rule__QueryParameter__Group__0


    // $ANTLR start rule__QueryParameter__Group__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2346:1: rule__QueryParameter__Group__1 : ( ( rule__QueryParameter__NameAssignment_1 ) ) ;
    public final void rule__QueryParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2350:1: ( ( ( rule__QueryParameter__NameAssignment_1 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2351:1: ( ( rule__QueryParameter__NameAssignment_1 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2351:1: ( ( rule__QueryParameter__NameAssignment_1 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2352:1: ( rule__QueryParameter__NameAssignment_1 )
            {
             before(grammarAccess.getQueryParameterAccess().getNameAssignment_1()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2353:1: ( rule__QueryParameter__NameAssignment_1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2353:2: rule__QueryParameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__QueryParameter__NameAssignment_1_in_rule__QueryParameter__Group__14598);
            rule__QueryParameter__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getQueryParameterAccess().getNameAssignment_1()); 

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
    // $ANTLR end rule__QueryParameter__Group__1


    // $ANTLR start rule__QueryFilter__Group__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2367:1: rule__QueryFilter__Group__0 : ( ( rule__QueryFilter__EntityAssignment_0 )? ) rule__QueryFilter__Group__1 ;
    public final void rule__QueryFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2371:1: ( ( ( rule__QueryFilter__EntityAssignment_0 )? ) rule__QueryFilter__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2372:1: ( ( rule__QueryFilter__EntityAssignment_0 )? ) rule__QueryFilter__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2372:1: ( ( rule__QueryFilter__EntityAssignment_0 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2373:1: ( rule__QueryFilter__EntityAssignment_0 )?
            {
             before(grammarAccess.getQueryFilterAccess().getEntityAssignment_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2374:1: ( rule__QueryFilter__EntityAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2374:2: rule__QueryFilter__EntityAssignment_0
                    {
                    pushFollow(FOLLOW_rule__QueryFilter__EntityAssignment_0_in_rule__QueryFilter__Group__04636);
                    rule__QueryFilter__EntityAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryFilterAccess().getEntityAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__QueryFilter__Group__1_in_rule__QueryFilter__Group__04646);
            rule__QueryFilter__Group__1();
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
    // $ANTLR end rule__QueryFilter__Group__0


    // $ANTLR start rule__QueryFilter__Group__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2385:1: rule__QueryFilter__Group__1 : ( '.' ) rule__QueryFilter__Group__2 ;
    public final void rule__QueryFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2389:1: ( ( '.' ) rule__QueryFilter__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2390:1: ( '.' ) rule__QueryFilter__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2390:1: ( '.' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2391:1: '.'
            {
             before(grammarAccess.getQueryFilterAccess().getFullStopKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__QueryFilter__Group__14675); 
             after(grammarAccess.getQueryFilterAccess().getFullStopKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__QueryFilter__Group__2_in_rule__QueryFilter__Group__14685);
            rule__QueryFilter__Group__2();
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
    // $ANTLR end rule__QueryFilter__Group__1


    // $ANTLR start rule__QueryFilter__Group__2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2405:1: rule__QueryFilter__Group__2 : ( ( rule__QueryFilter__AttributeAssignment_2 ) ) rule__QueryFilter__Group__3 ;
    public final void rule__QueryFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2409:1: ( ( ( rule__QueryFilter__AttributeAssignment_2 ) ) rule__QueryFilter__Group__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2410:1: ( ( rule__QueryFilter__AttributeAssignment_2 ) ) rule__QueryFilter__Group__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2410:1: ( ( rule__QueryFilter__AttributeAssignment_2 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2411:1: ( rule__QueryFilter__AttributeAssignment_2 )
            {
             before(grammarAccess.getQueryFilterAccess().getAttributeAssignment_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2412:1: ( rule__QueryFilter__AttributeAssignment_2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2412:2: rule__QueryFilter__AttributeAssignment_2
            {
            pushFollow(FOLLOW_rule__QueryFilter__AttributeAssignment_2_in_rule__QueryFilter__Group__24713);
            rule__QueryFilter__AttributeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getQueryFilterAccess().getAttributeAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__QueryFilter__Group__3_in_rule__QueryFilter__Group__24722);
            rule__QueryFilter__Group__3();
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
    // $ANTLR end rule__QueryFilter__Group__2


    // $ANTLR start rule__QueryFilter__Group__3
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2423:1: rule__QueryFilter__Group__3 : ( '=' ) rule__QueryFilter__Group__4 ;
    public final void rule__QueryFilter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2427:1: ( ( '=' ) rule__QueryFilter__Group__4 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2428:1: ( '=' ) rule__QueryFilter__Group__4
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2428:1: ( '=' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2429:1: '='
            {
             before(grammarAccess.getQueryFilterAccess().getEqualsSignKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__QueryFilter__Group__34751); 
             after(grammarAccess.getQueryFilterAccess().getEqualsSignKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__QueryFilter__Group__4_in_rule__QueryFilter__Group__34761);
            rule__QueryFilter__Group__4();
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
    // $ANTLR end rule__QueryFilter__Group__3


    // $ANTLR start rule__QueryFilter__Group__4
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2443:1: rule__QueryFilter__Group__4 : ( ( rule__QueryFilter__ValueAssignment_4 ) ) ;
    public final void rule__QueryFilter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2447:1: ( ( ( rule__QueryFilter__ValueAssignment_4 ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2448:1: ( ( rule__QueryFilter__ValueAssignment_4 ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2448:1: ( ( rule__QueryFilter__ValueAssignment_4 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2449:1: ( rule__QueryFilter__ValueAssignment_4 )
            {
             before(grammarAccess.getQueryFilterAccess().getValueAssignment_4()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2450:1: ( rule__QueryFilter__ValueAssignment_4 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2450:2: rule__QueryFilter__ValueAssignment_4
            {
            pushFollow(FOLLOW_rule__QueryFilter__ValueAssignment_4_in_rule__QueryFilter__Group__44789);
            rule__QueryFilter__ValueAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getQueryFilterAccess().getValueAssignment_4()); 

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
    // $ANTLR end rule__QueryFilter__Group__4


    // $ANTLR start rule__QueryOrder__Group__0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2470:1: rule__QueryOrder__Group__0 : ( ( rule__QueryOrder__EntityAssignment_0 )? ) rule__QueryOrder__Group__1 ;
    public final void rule__QueryOrder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2474:1: ( ( ( rule__QueryOrder__EntityAssignment_0 )? ) rule__QueryOrder__Group__1 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2475:1: ( ( rule__QueryOrder__EntityAssignment_0 )? ) rule__QueryOrder__Group__1
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2475:1: ( ( rule__QueryOrder__EntityAssignment_0 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2476:1: ( rule__QueryOrder__EntityAssignment_0 )?
            {
             before(grammarAccess.getQueryOrderAccess().getEntityAssignment_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2477:1: ( rule__QueryOrder__EntityAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2477:2: rule__QueryOrder__EntityAssignment_0
                    {
                    pushFollow(FOLLOW_rule__QueryOrder__EntityAssignment_0_in_rule__QueryOrder__Group__04833);
                    rule__QueryOrder__EntityAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryOrderAccess().getEntityAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__QueryOrder__Group__1_in_rule__QueryOrder__Group__04843);
            rule__QueryOrder__Group__1();
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
    // $ANTLR end rule__QueryOrder__Group__0


    // $ANTLR start rule__QueryOrder__Group__1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2488:1: rule__QueryOrder__Group__1 : ( '.' ) rule__QueryOrder__Group__2 ;
    public final void rule__QueryOrder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2492:1: ( ( '.' ) rule__QueryOrder__Group__2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2493:1: ( '.' ) rule__QueryOrder__Group__2
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2493:1: ( '.' )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2494:1: '.'
            {
             before(grammarAccess.getQueryOrderAccess().getFullStopKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__QueryOrder__Group__14872); 
             after(grammarAccess.getQueryOrderAccess().getFullStopKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__QueryOrder__Group__2_in_rule__QueryOrder__Group__14882);
            rule__QueryOrder__Group__2();
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
    // $ANTLR end rule__QueryOrder__Group__1


    // $ANTLR start rule__QueryOrder__Group__2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2508:1: rule__QueryOrder__Group__2 : ( ( rule__QueryOrder__AttributeAssignment_2 ) ) rule__QueryOrder__Group__3 ;
    public final void rule__QueryOrder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2512:1: ( ( ( rule__QueryOrder__AttributeAssignment_2 ) ) rule__QueryOrder__Group__3 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2513:1: ( ( rule__QueryOrder__AttributeAssignment_2 ) ) rule__QueryOrder__Group__3
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2513:1: ( ( rule__QueryOrder__AttributeAssignment_2 ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2514:1: ( rule__QueryOrder__AttributeAssignment_2 )
            {
             before(grammarAccess.getQueryOrderAccess().getAttributeAssignment_2()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2515:1: ( rule__QueryOrder__AttributeAssignment_2 )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2515:2: rule__QueryOrder__AttributeAssignment_2
            {
            pushFollow(FOLLOW_rule__QueryOrder__AttributeAssignment_2_in_rule__QueryOrder__Group__24910);
            rule__QueryOrder__AttributeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getQueryOrderAccess().getAttributeAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__QueryOrder__Group__3_in_rule__QueryOrder__Group__24919);
            rule__QueryOrder__Group__3();
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
    // $ANTLR end rule__QueryOrder__Group__2


    // $ANTLR start rule__QueryOrder__Group__3
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2526:1: rule__QueryOrder__Group__3 : ( ( rule__QueryOrder__TypeAssignment_3 )? ) ;
    public final void rule__QueryOrder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2530:1: ( ( ( rule__QueryOrder__TypeAssignment_3 )? ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2531:1: ( ( rule__QueryOrder__TypeAssignment_3 )? )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2531:1: ( ( rule__QueryOrder__TypeAssignment_3 )? )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2532:1: ( rule__QueryOrder__TypeAssignment_3 )?
            {
             before(grammarAccess.getQueryOrderAccess().getTypeAssignment_3()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2533:1: ( rule__QueryOrder__TypeAssignment_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=14 && LA25_0<=15)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2533:2: rule__QueryOrder__TypeAssignment_3
                    {
                    pushFollow(FOLLOW_rule__QueryOrder__TypeAssignment_3_in_rule__QueryOrder__Group__34947);
                    rule__QueryOrder__TypeAssignment_3();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryOrderAccess().getTypeAssignment_3()); 

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
    // $ANTLR end rule__QueryOrder__Group__3


    // $ANTLR start rule__Model__ProjectAssignment_0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2551:1: rule__Model__ProjectAssignment_0 : ( ruleProject ) ;
    public final void rule__Model__ProjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2555:1: ( ( ruleProject ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2556:1: ( ruleProject )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2556:1: ( ruleProject )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2557:1: ruleProject
            {
             before(grammarAccess.getModelAccess().getProjectProjectParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleProject_in_rule__Model__ProjectAssignment_04990);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2566:1: rule__Model__TypesAssignment_1 : ( ruleType ) ;
    public final void rule__Model__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2570:1: ( ( ruleType ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2571:1: ( ruleType )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2571:1: ( ruleType )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2572:1: ruleType
            {
             before(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Model__TypesAssignment_15021);
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


    // $ANTLR start rule__Model__QueriesAssignment_2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2581:1: rule__Model__QueriesAssignment_2 : ( ruleQuery ) ;
    public final void rule__Model__QueriesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2585:1: ( ( ruleQuery ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2586:1: ( ruleQuery )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2586:1: ( ruleQuery )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2587:1: ruleQuery
            {
             before(grammarAccess.getModelAccess().getQueriesQueryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQuery_in_rule__Model__QueriesAssignment_25052);
            ruleQuery();
            _fsp--;

             after(grammarAccess.getModelAccess().getQueriesQueryParserRuleCall_2_0()); 

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
    // $ANTLR end rule__Model__QueriesAssignment_2


    // $ANTLR start rule__Project__NameAssignment_4
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2596:1: rule__Project__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Project__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2600:1: ( ( RULE_STRING ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2601:1: ( RULE_STRING )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2601:1: ( RULE_STRING )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2602:1: RULE_STRING
            {
             before(grammarAccess.getProjectAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Project__NameAssignment_45083); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2611:1: rule__Project__BasePackageAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Project__BasePackageAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2615:1: ( ( RULE_STRING ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2616:1: ( RULE_STRING )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2616:1: ( RULE_STRING )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2617:1: RULE_STRING
            {
             before(grammarAccess.getProjectAccess().getBasePackageSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Project__BasePackageAssignment_75114); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2626:1: rule__SimpleType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2630:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2631:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2631:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2632:1: RULE_ID
            {
             before(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_15145); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2641:1: rule__SimpleType__MappedTypeAssignment_2_1 : ( ruleJAVAID ) ;
    public final void rule__SimpleType__MappedTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2645:1: ( ( ruleJAVAID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2646:1: ( ruleJAVAID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2646:1: ( ruleJAVAID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2647:1: ruleJAVAID
            {
             before(grammarAccess.getSimpleTypeAccess().getMappedTypeJAVAIDParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleJAVAID_in_rule__SimpleType__MappedTypeAssignment_2_15176);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2656:1: rule__JAVAID__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__JAVAID__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2660:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2661:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2661:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2662:1: RULE_ID
            {
             before(grammarAccess.getJAVAIDAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JAVAID__NameAssignment_05207); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2671:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2675:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2676:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2676:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2677:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_15238); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2686:1: rule__Entity__SuperEntityAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperEntityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2690:1: ( ( ( RULE_ID ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2691:1: ( ( RULE_ID ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2691:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2692:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_2_1_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2693:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2694:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_2_15273); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2705:1: rule__Entity__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2709:1: ( ( ruleAttribute ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2710:1: ( ruleAttribute )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2710:1: ( ruleAttribute )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2711:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_45308);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2720:1: rule__Embed__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Embed__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2724:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2725:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2725:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2726:1: RULE_ID
            {
             before(grammarAccess.getEmbedAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Embed__NameAssignment_15339); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2735:1: rule__Embed__SuperEntityAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Embed__SuperEntityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2739:1: ( ( ( RULE_ID ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2740:1: ( ( RULE_ID ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2740:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2741:1: ( RULE_ID )
            {
             before(grammarAccess.getEmbedAccess().getSuperEntityEntityCrossReference_2_1_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2742:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2743:1: RULE_ID
            {
             before(grammarAccess.getEmbedAccess().getSuperEntityEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Embed__SuperEntityAssignment_2_15374); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2754:1: rule__Embed__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Embed__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2758:1: ( ( ruleAttribute ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2759:1: ( ruleAttribute )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2759:1: ( ruleAttribute )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2760:1: ruleAttribute
            {
             before(grammarAccess.getEmbedAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Embed__AttributesAssignment_45409);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2769:1: rule__Attribute__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2773:1: ( ( ( RULE_ID ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2774:1: ( ( RULE_ID ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2774:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2775:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_0_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2776:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2777:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_05444); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2788:1: rule__Attribute__ManyReferenceAssignment_1 : ( ruleAttributeManyReference ) ;
    public final void rule__Attribute__ManyReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2792:1: ( ( ruleAttributeManyReference ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2793:1: ( ruleAttributeManyReference )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2793:1: ( ruleAttributeManyReference )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2794:1: ruleAttributeManyReference
            {
             before(grammarAccess.getAttributeAccess().getManyReferenceAttributeManyReferenceEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeManyReference_in_rule__Attribute__ManyReferenceAssignment_15479);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2803:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2807:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2808:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2808:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2809:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_25510); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2818:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2822:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2823:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2823:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2824:1: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_15541); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2833:1: rule__Enumeration__LiteralsAssignment_3 : ( ruleEnumerationLiteral ) ;
    public final void rule__Enumeration__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2837:1: ( ( ruleEnumerationLiteral ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2838:1: ( ruleEnumerationLiteral )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2838:1: ( ruleEnumerationLiteral )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2839:1: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__LiteralsAssignment_35572);
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2848:1: rule__EnumerationLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2852:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2853:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2853:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2854:1: RULE_ID
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_05603); 
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
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2863:1: rule__EnumerationLiteral__OrdinalAssignment_2 : ( RULE_INT ) ;
    public final void rule__EnumerationLiteral__OrdinalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2867:1: ( ( RULE_INT ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2868:1: ( RULE_INT )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2868:1: ( RULE_INT )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2869:1: RULE_INT
            {
             before(grammarAccess.getEnumerationLiteralAccess().getOrdinalINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumerationLiteral__OrdinalAssignment_25634); 
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


    // $ANTLR start rule__Query__NameAssignment_1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2878:1: rule__Query__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Query__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2882:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2883:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2883:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2884:1: RULE_ID
            {
             before(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Query__NameAssignment_15665); 
             after(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Query__NameAssignment_1


    // $ANTLR start rule__Query__EntitiesAssignment_3
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2893:1: rule__Query__EntitiesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Query__EntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2897:1: ( ( ( RULE_ID ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2898:1: ( ( RULE_ID ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2898:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2899:1: ( RULE_ID )
            {
             before(grammarAccess.getQueryAccess().getEntitiesEntityCrossReference_3_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2900:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2901:1: RULE_ID
            {
             before(grammarAccess.getQueryAccess().getEntitiesEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Query__EntitiesAssignment_35700); 
             after(grammarAccess.getQueryAccess().getEntitiesEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getQueryAccess().getEntitiesEntityCrossReference_3_0()); 

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
    // $ANTLR end rule__Query__EntitiesAssignment_3


    // $ANTLR start rule__Query__EntitiesAssignment_4_1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2912:1: rule__Query__EntitiesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Query__EntitiesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2916:1: ( ( ( RULE_ID ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2917:1: ( ( RULE_ID ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2917:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2918:1: ( RULE_ID )
            {
             before(grammarAccess.getQueryAccess().getEntitiesEntityCrossReference_4_1_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2919:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2920:1: RULE_ID
            {
             before(grammarAccess.getQueryAccess().getEntitiesEntityIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Query__EntitiesAssignment_4_15739); 
             after(grammarAccess.getQueryAccess().getEntitiesEntityIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getQueryAccess().getEntitiesEntityCrossReference_4_1_0()); 

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
    // $ANTLR end rule__Query__EntitiesAssignment_4_1


    // $ANTLR start rule__Query__ParametersAssignment_8
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2931:1: rule__Query__ParametersAssignment_8 : ( ruleQueryParameter ) ;
    public final void rule__Query__ParametersAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2935:1: ( ( ruleQueryParameter ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2936:1: ( ruleQueryParameter )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2936:1: ( ruleQueryParameter )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2937:1: ruleQueryParameter
            {
             before(grammarAccess.getQueryAccess().getParametersQueryParameterParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleQueryParameter_in_rule__Query__ParametersAssignment_85774);
            ruleQueryParameter();
            _fsp--;

             after(grammarAccess.getQueryAccess().getParametersQueryParameterParserRuleCall_8_0()); 

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
    // $ANTLR end rule__Query__ParametersAssignment_8


    // $ANTLR start rule__Query__ParametersAssignment_9_1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2946:1: rule__Query__ParametersAssignment_9_1 : ( ruleQueryParameter ) ;
    public final void rule__Query__ParametersAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2950:1: ( ( ruleQueryParameter ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2951:1: ( ruleQueryParameter )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2951:1: ( ruleQueryParameter )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2952:1: ruleQueryParameter
            {
             before(grammarAccess.getQueryAccess().getParametersQueryParameterParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_ruleQueryParameter_in_rule__Query__ParametersAssignment_9_15805);
            ruleQueryParameter();
            _fsp--;

             after(grammarAccess.getQueryAccess().getParametersQueryParameterParserRuleCall_9_1_0()); 

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
    // $ANTLR end rule__Query__ParametersAssignment_9_1


    // $ANTLR start rule__Query__FiltersAssignment_12
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2961:1: rule__Query__FiltersAssignment_12 : ( ruleQueryFilter ) ;
    public final void rule__Query__FiltersAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2965:1: ( ( ruleQueryFilter ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2966:1: ( ruleQueryFilter )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2966:1: ( ruleQueryFilter )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2967:1: ruleQueryFilter
            {
             before(grammarAccess.getQueryAccess().getFiltersQueryFilterParserRuleCall_12_0()); 
            pushFollow(FOLLOW_ruleQueryFilter_in_rule__Query__FiltersAssignment_125836);
            ruleQueryFilter();
            _fsp--;

             after(grammarAccess.getQueryAccess().getFiltersQueryFilterParserRuleCall_12_0()); 

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
    // $ANTLR end rule__Query__FiltersAssignment_12


    // $ANTLR start rule__Query__MaxAssignment_13_2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2976:1: rule__Query__MaxAssignment_13_2 : ( RULE_INT ) ;
    public final void rule__Query__MaxAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2980:1: ( ( RULE_INT ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2981:1: ( RULE_INT )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2981:1: ( RULE_INT )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2982:1: RULE_INT
            {
             before(grammarAccess.getQueryAccess().getMaxINTTerminalRuleCall_13_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Query__MaxAssignment_13_25867); 
             after(grammarAccess.getQueryAccess().getMaxINTTerminalRuleCall_13_2_0()); 

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
    // $ANTLR end rule__Query__MaxAssignment_13_2


    // $ANTLR start rule__Query__OffsetAssignment_14_2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2991:1: rule__Query__OffsetAssignment_14_2 : ( RULE_INT ) ;
    public final void rule__Query__OffsetAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2995:1: ( ( RULE_INT ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2996:1: ( RULE_INT )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2996:1: ( RULE_INT )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:2997:1: RULE_INT
            {
             before(grammarAccess.getQueryAccess().getOffsetINTTerminalRuleCall_14_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Query__OffsetAssignment_14_25898); 
             after(grammarAccess.getQueryAccess().getOffsetINTTerminalRuleCall_14_2_0()); 

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
    // $ANTLR end rule__Query__OffsetAssignment_14_2


    // $ANTLR start rule__Query__OrdersAssignment_15_2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3006:1: rule__Query__OrdersAssignment_15_2 : ( ruleQueryOrder ) ;
    public final void rule__Query__OrdersAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3010:1: ( ( ruleQueryOrder ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3011:1: ( ruleQueryOrder )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3011:1: ( ruleQueryOrder )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3012:1: ruleQueryOrder
            {
             before(grammarAccess.getQueryAccess().getOrdersQueryOrderParserRuleCall_15_2_0()); 
            pushFollow(FOLLOW_ruleQueryOrder_in_rule__Query__OrdersAssignment_15_25929);
            ruleQueryOrder();
            _fsp--;

             after(grammarAccess.getQueryAccess().getOrdersQueryOrderParserRuleCall_15_2_0()); 

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
    // $ANTLR end rule__Query__OrdersAssignment_15_2


    // $ANTLR start rule__Query__OrdersAssignment_15_3_1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3021:1: rule__Query__OrdersAssignment_15_3_1 : ( ruleQueryOrder ) ;
    public final void rule__Query__OrdersAssignment_15_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3025:1: ( ( ruleQueryOrder ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3026:1: ( ruleQueryOrder )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3026:1: ( ruleQueryOrder )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3027:1: ruleQueryOrder
            {
             before(grammarAccess.getQueryAccess().getOrdersQueryOrderParserRuleCall_15_3_1_0()); 
            pushFollow(FOLLOW_ruleQueryOrder_in_rule__Query__OrdersAssignment_15_3_15960);
            ruleQueryOrder();
            _fsp--;

             after(grammarAccess.getQueryAccess().getOrdersQueryOrderParserRuleCall_15_3_1_0()); 

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
    // $ANTLR end rule__Query__OrdersAssignment_15_3_1


    // $ANTLR start rule__QueryParameter__TypeAssignment_0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3036:1: rule__QueryParameter__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__QueryParameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3040:1: ( ( ( RULE_ID ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3041:1: ( ( RULE_ID ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3041:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3042:1: ( RULE_ID )
            {
             before(grammarAccess.getQueryParameterAccess().getTypeTypeCrossReference_0_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3043:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3044:1: RULE_ID
            {
             before(grammarAccess.getQueryParameterAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QueryParameter__TypeAssignment_05995); 
             after(grammarAccess.getQueryParameterAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getQueryParameterAccess().getTypeTypeCrossReference_0_0()); 

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
    // $ANTLR end rule__QueryParameter__TypeAssignment_0


    // $ANTLR start rule__QueryParameter__NameAssignment_1
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3055:1: rule__QueryParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__QueryParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3059:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3060:1: ( RULE_ID )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3060:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3061:1: RULE_ID
            {
             before(grammarAccess.getQueryParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QueryParameter__NameAssignment_16030); 
             after(grammarAccess.getQueryParameterAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__QueryParameter__NameAssignment_1


    // $ANTLR start rule__QueryFilter__EntityAssignment_0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3070:1: rule__QueryFilter__EntityAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__QueryFilter__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3074:1: ( ( ( RULE_ID ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3075:1: ( ( RULE_ID ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3075:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3076:1: ( RULE_ID )
            {
             before(grammarAccess.getQueryFilterAccess().getEntityEntityCrossReference_0_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3077:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3078:1: RULE_ID
            {
             before(grammarAccess.getQueryFilterAccess().getEntityEntityIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QueryFilter__EntityAssignment_06065); 
             after(grammarAccess.getQueryFilterAccess().getEntityEntityIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getQueryFilterAccess().getEntityEntityCrossReference_0_0()); 

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
    // $ANTLR end rule__QueryFilter__EntityAssignment_0


    // $ANTLR start rule__QueryFilter__AttributeAssignment_2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3089:1: rule__QueryFilter__AttributeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__QueryFilter__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3093:1: ( ( ( RULE_ID ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3094:1: ( ( RULE_ID ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3094:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3095:1: ( RULE_ID )
            {
             before(grammarAccess.getQueryFilterAccess().getAttributeAttributeCrossReference_2_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3096:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3097:1: RULE_ID
            {
             before(grammarAccess.getQueryFilterAccess().getAttributeAttributeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QueryFilter__AttributeAssignment_26104); 
             after(grammarAccess.getQueryFilterAccess().getAttributeAttributeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getQueryFilterAccess().getAttributeAttributeCrossReference_2_0()); 

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
    // $ANTLR end rule__QueryFilter__AttributeAssignment_2


    // $ANTLR start rule__QueryFilter__ValueAssignment_4
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3108:1: rule__QueryFilter__ValueAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__QueryFilter__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3112:1: ( ( ( RULE_ID ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3113:1: ( ( RULE_ID ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3113:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3114:1: ( RULE_ID )
            {
             before(grammarAccess.getQueryFilterAccess().getValueQueryParameterCrossReference_4_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3115:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3116:1: RULE_ID
            {
             before(grammarAccess.getQueryFilterAccess().getValueQueryParameterIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QueryFilter__ValueAssignment_46143); 
             after(grammarAccess.getQueryFilterAccess().getValueQueryParameterIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getQueryFilterAccess().getValueQueryParameterCrossReference_4_0()); 

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
    // $ANTLR end rule__QueryFilter__ValueAssignment_4


    // $ANTLR start rule__QueryOrder__EntityAssignment_0
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3127:1: rule__QueryOrder__EntityAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__QueryOrder__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3131:1: ( ( ( RULE_ID ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3132:1: ( ( RULE_ID ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3132:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3133:1: ( RULE_ID )
            {
             before(grammarAccess.getQueryOrderAccess().getEntityEntityCrossReference_0_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3134:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3135:1: RULE_ID
            {
             before(grammarAccess.getQueryOrderAccess().getEntityEntityIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QueryOrder__EntityAssignment_06182); 
             after(grammarAccess.getQueryOrderAccess().getEntityEntityIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getQueryOrderAccess().getEntityEntityCrossReference_0_0()); 

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
    // $ANTLR end rule__QueryOrder__EntityAssignment_0


    // $ANTLR start rule__QueryOrder__AttributeAssignment_2
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3146:1: rule__QueryOrder__AttributeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__QueryOrder__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3150:1: ( ( ( RULE_ID ) ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3151:1: ( ( RULE_ID ) )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3151:1: ( ( RULE_ID ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3152:1: ( RULE_ID )
            {
             before(grammarAccess.getQueryOrderAccess().getAttributeAttributeCrossReference_2_0()); 
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3153:1: ( RULE_ID )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3154:1: RULE_ID
            {
             before(grammarAccess.getQueryOrderAccess().getAttributeAttributeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QueryOrder__AttributeAssignment_26221); 
             after(grammarAccess.getQueryOrderAccess().getAttributeAttributeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getQueryOrderAccess().getAttributeAttributeCrossReference_2_0()); 

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
    // $ANTLR end rule__QueryOrder__AttributeAssignment_2


    // $ANTLR start rule__QueryOrder__TypeAssignment_3
    // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3165:1: rule__QueryOrder__TypeAssignment_3 : ( ruleQueryOrderType ) ;
    public final void rule__QueryOrder__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3169:1: ( ( ruleQueryOrderType ) )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3170:1: ( ruleQueryOrderType )
            {
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3170:1: ( ruleQueryOrderType )
            // ../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g:3171:1: ruleQueryOrderType
            {
             before(grammarAccess.getQueryOrderAccess().getTypeQueryOrderTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQueryOrderType_in_rule__QueryOrder__TypeAssignment_36256);
            ruleQueryOrderType();
            _fsp--;

             after(grammarAccess.getQueryOrderAccess().getTypeQueryOrderTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end rule__QueryOrder__TypeAssignment_3


 

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
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0_in_ruleQuery694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryParameter_in_entryRuleQueryParameter720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryParameter727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryParameter__Group__0_in_ruleQueryParameter754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryFilter_in_entryRuleQueryFilter780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryFilter787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryFilter__Group__0_in_ruleQueryFilter814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryOrder_in_entryRuleQueryOrder840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryOrder847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryOrder__Group__0_in_ruleQueryOrder874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeManyReference__Alternatives_in_ruleAttributeManyReference911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryOrderType__Alternatives_in_ruleQueryOrderType947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__Type__Alternatives982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_rule__Type__Alternatives1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmbed_in_rule__Type__Alternatives1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__AttributeManyReference__Alternatives1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__AttributeManyReference__Alternatives1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AttributeManyReference__Alternatives1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__QueryOrderType__Alternatives1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__QueryOrderType__Alternatives1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ProjectAssignment_0_in_rule__Model__Group__01202 = new BitSet(new long[]{0x000000009A400002L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TypesAssignment_1_in_rule__Model__Group__11239 = new BitSet(new long[]{0x000000009A400002L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__QueriesAssignment_2_in_rule__Model__Group__21277 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_16_in_rule__Project__Group__01319 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Project__Group__1_in_rule__Project__Group__01329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Project__Group__11358 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Project__Group__2_in_rule__Project__Group__11368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Project__Group__21397 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Project__Group__3_in_rule__Project__Group__21407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Project__Group__31436 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Project__Group__4_in_rule__Project__Group__31446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__NameAssignment_4_in_rule__Project__Group__41474 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Project__Group__5_in_rule__Project__Group__41483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Project__Group__51512 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Project__Group__6_in_rule__Project__Group__51522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Project__Group__61551 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Project__Group__7_in_rule__Project__Group__61561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__BasePackageAssignment_7_in_rule__Project__Group__71589 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Project__Group__8_in_rule__Project__Group__71598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Project__Group__81627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SimpleType__Group__01681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__01691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__11719 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__2_in_rule__SimpleType__Group__11728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group_2__0_in_rule__SimpleType__Group__21756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SimpleType__Group_2__01798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleType__Group_2__1_in_rule__SimpleType__Group_2__01808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__MappedTypeAssignment_2_1_in_rule__SimpleType__Group_2__11836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JAVAID__NameAssignment_0_in_rule__JAVAID__Group__01874 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group__1_in_rule__JAVAID__Group__01883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JAVAID__Group_1__0_in_rule__JAVAID__Group__11911 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_rule__JAVAID__Group_1__01951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JAVAID__Group_1__1_in_rule__JAVAID__Group_1__01961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JAVAID__Group_1__11989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Entity__Group__02027 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__02037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__12065 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__12074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__22102 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__22112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Entity__Group__32141 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__32151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_4_in_rule__Entity__Group__42179 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__42189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Entity__Group__52218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Entity__Group_2__02266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__02276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperEntityAssignment_2_1_in_rule__Entity__Group_2__12304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Embed__Group__02343 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Embed__Group__1_in_rule__Embed__Group__02353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Embed__NameAssignment_1_in_rule__Embed__Group__12381 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__Embed__Group__2_in_rule__Embed__Group__12390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Embed__Group_2__0_in_rule__Embed__Group__22418 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Embed__Group__3_in_rule__Embed__Group__22428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Embed__Group__32457 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__Embed__Group__4_in_rule__Embed__Group__32467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Embed__AttributesAssignment_4_in_rule__Embed__Group__42495 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__Embed__Group__5_in_rule__Embed__Group__42505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Embed__Group__52534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Embed__Group_2__02582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Embed__Group_2__1_in_rule__Embed__Group_2__02592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Embed__SuperEntityAssignment_2_1_in_rule__Embed__Group_2__12620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__02658 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ManyReferenceAssignment_1_in_rule__Attribute__Group__12695 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__22733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Enumeration__Group__02774 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__02784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__12812 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__12821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Enumeration__Group__22850 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__22860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__LiteralsAssignment_3_in_rule__Enumeration__Group__32888 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__32898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Enumeration__Group__42927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__02972 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__02981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EnumerationLiteral__Group__13010 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__13020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__OrdinalAssignment_2_in_rule__EnumerationLiteral__Group__23048 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__3_in_rule__EnumerationLiteral__Group__23057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EnumerationLiteral__Group__33086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Query__Group__03130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Query__Group__1_in_rule__Query__Group__03140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__NameAssignment_1_in_rule__Query__Group__13168 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Query__Group__2_in_rule__Query__Group__13177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Query__Group__23206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Query__Group__3_in_rule__Query__Group__23216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__EntitiesAssignment_3_in_rule__Query__Group__33244 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_rule__Query__Group__4_in_rule__Query__Group__33253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_4__0_in_rule__Query__Group__43281 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_rule__Query__Group__5_in_rule__Query__Group__43291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Query__Group__53320 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Query__Group__6_in_rule__Query__Group__53330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Query__Group__63359 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Query__Group__7_in_rule__Query__Group__63369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Query__Group__73398 = new BitSet(new long[]{0x0000000840000010L});
    public static final BitSet FOLLOW_rule__Query__Group__8_in_rule__Query__Group__73408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ParametersAssignment_8_in_rule__Query__Group__83436 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_rule__Query__Group__9_in_rule__Query__Group__83446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_9__0_in_rule__Query__Group__93474 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_rule__Query__Group__10_in_rule__Query__Group__93484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Query__Group__103513 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Query__Group__11_in_rule__Query__Group__103523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Query__Group__113552 = new BitSet(new long[]{0x0000007001200010L});
    public static final BitSet FOLLOW_rule__Query__Group__12_in_rule__Query__Group__113562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__FiltersAssignment_12_in_rule__Query__Group__123590 = new BitSet(new long[]{0x0000007001200010L});
    public static final BitSet FOLLOW_rule__Query__Group__13_in_rule__Query__Group__123600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_13__0_in_rule__Query__Group__133628 = new BitSet(new long[]{0x0000006000200000L});
    public static final BitSet FOLLOW_rule__Query__Group__14_in_rule__Query__Group__133638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_14__0_in_rule__Query__Group__143666 = new BitSet(new long[]{0x0000004000200000L});
    public static final BitSet FOLLOW_rule__Query__Group__15_in_rule__Query__Group__143676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_15__0_in_rule__Query__Group__153704 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Query__Group__16_in_rule__Query__Group__153714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Query__Group__163743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Query__Group_4__03813 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Query__Group_4__1_in_rule__Query__Group_4__03823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__EntitiesAssignment_4_1_in_rule__Query__Group_4__13851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Query__Group_9__03890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Query__Group_9__1_in_rule__Query__Group_9__03900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ParametersAssignment_9_1_in_rule__Query__Group_9__13928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Query__Group_13__03967 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Query__Group_13__1_in_rule__Query__Group_13__03977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Query__Group_13__14006 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Query__Group_13__2_in_rule__Query__Group_13__14016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__MaxAssignment_13_2_in_rule__Query__Group_13__24044 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Query__Group_13__3_in_rule__Query__Group_13__24053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Query__Group_13__34082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Query__Group_14__04126 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Query__Group_14__1_in_rule__Query__Group_14__04136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Query__Group_14__14165 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Query__Group_14__2_in_rule__Query__Group_14__14175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__OffsetAssignment_14_2_in_rule__Query__Group_14__24203 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Query__Group_14__3_in_rule__Query__Group_14__24212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Query__Group_14__34241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Query__Group_15__04285 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Query__Group_15__1_in_rule__Query__Group_15__04295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Query__Group_15__14324 = new BitSet(new long[]{0x0000000841000010L});
    public static final BitSet FOLLOW_rule__Query__Group_15__2_in_rule__Query__Group_15__14334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__OrdersAssignment_15_2_in_rule__Query__Group_15__24362 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_rule__Query__Group_15__3_in_rule__Query__Group_15__24372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_15_3__0_in_rule__Query__Group_15__34400 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_rule__Query__Group_15__4_in_rule__Query__Group_15__34410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Query__Group_15__44439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Query__Group_15_3__04485 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Query__Group_15_3__1_in_rule__Query__Group_15_3__04495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__OrdersAssignment_15_3_1_in_rule__Query__Group_15_3__14523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryParameter__TypeAssignment_0_in_rule__QueryParameter__Group__04561 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QueryParameter__Group__1_in_rule__QueryParameter__Group__04570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryParameter__NameAssignment_1_in_rule__QueryParameter__Group__14598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryFilter__EntityAssignment_0_in_rule__QueryFilter__Group__04636 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__QueryFilter__Group__1_in_rule__QueryFilter__Group__04646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__QueryFilter__Group__14675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QueryFilter__Group__2_in_rule__QueryFilter__Group__14685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryFilter__AttributeAssignment_2_in_rule__QueryFilter__Group__24713 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__QueryFilter__Group__3_in_rule__QueryFilter__Group__24722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__QueryFilter__Group__34751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QueryFilter__Group__4_in_rule__QueryFilter__Group__34761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryFilter__ValueAssignment_4_in_rule__QueryFilter__Group__44789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryOrder__EntityAssignment_0_in_rule__QueryOrder__Group__04833 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__QueryOrder__Group__1_in_rule__QueryOrder__Group__04843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__QueryOrder__Group__14872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QueryOrder__Group__2_in_rule__QueryOrder__Group__14882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryOrder__AttributeAssignment_2_in_rule__QueryOrder__Group__24910 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__QueryOrder__Group__3_in_rule__QueryOrder__Group__24919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryOrder__TypeAssignment_3_in_rule__QueryOrder__Group__34947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_rule__Model__ProjectAssignment_04990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Model__TypesAssignment_15021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_rule__Model__QueriesAssignment_25052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Project__NameAssignment_45083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Project__BasePackageAssignment_75114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_15145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJAVAID_in_rule__SimpleType__MappedTypeAssignment_2_15176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JAVAID__NameAssignment_05207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_15238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_2_15273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_45308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Embed__NameAssignment_15339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Embed__SuperEntityAssignment_2_15374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Embed__AttributesAssignment_45409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_05444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeManyReference_in_rule__Attribute__ManyReferenceAssignment_15479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_25510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_15541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__LiteralsAssignment_35572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_05603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumerationLiteral__OrdinalAssignment_25634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Query__NameAssignment_15665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Query__EntitiesAssignment_35700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Query__EntitiesAssignment_4_15739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryParameter_in_rule__Query__ParametersAssignment_85774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryParameter_in_rule__Query__ParametersAssignment_9_15805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryFilter_in_rule__Query__FiltersAssignment_125836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Query__MaxAssignment_13_25867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Query__OffsetAssignment_14_25898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryOrder_in_rule__Query__OrdersAssignment_15_25929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryOrder_in_rule__Query__OrdersAssignment_15_3_15960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QueryParameter__TypeAssignment_05995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QueryParameter__NameAssignment_16030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QueryFilter__EntityAssignment_06065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QueryFilter__AttributeAssignment_26104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QueryFilter__ValueAssignment_46143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QueryOrder__EntityAssignment_06182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QueryOrder__AttributeAssignment_26221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryOrderType_in_rule__QueryOrder__TypeAssignment_36256 = new BitSet(new long[]{0x0000000000000002L});

}