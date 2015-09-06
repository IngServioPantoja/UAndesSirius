package escenariosCalidad.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import escenariosCalidad.services.XtextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXtextParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'latency'", "'throughput'", "'errorPercentage'", "'responseCode'", "'segundos'", "'ms'", "'request'", "'GT'", "'LT'", "'GTE'", "'LTE'", "'Test'", "'{'", "'}'", "'arquitecturas'", "','", "'Arquitectura'", "'escenarios'", "'artefactos'", "'Escenario'", "'fuente'", "'estimulo'", "'medida'", "'id'", "'Artefacto'", "'url'", "'Fuente'", "'Estimulo'", "'artefacto'", "'MedidaRespuesta'", "'metrica'", "'valorEsperado'", "'unidad'", "'operador'", "'-'", "'.'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalXtextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXtextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXtextParser.tokenNames; }
    public String getGrammarFileName() { return "../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g"; }


     
     	private XtextGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(XtextGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleTest"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:60:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:61:1: ( ruleTest EOF )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:62:1: ruleTest EOF
            {
             before(grammarAccess.getTestRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTest_in_entryRuleTest61);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getTestRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTest68); 

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
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:69:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:73:2: ( ( ( rule__Test__Group__0 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:74:1: ( ( rule__Test__Group__0 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:74:1: ( ( rule__Test__Group__0 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:75:1: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:76:1: ( rule__Test__Group__0 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:76:2: rule__Test__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Test__Group__0_in_ruleTest94);
            rule__Test__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getGroup()); 

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
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleArquitectura"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:88:1: entryRuleArquitectura : ruleArquitectura EOF ;
    public final void entryRuleArquitectura() throws RecognitionException {
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:89:1: ( ruleArquitectura EOF )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:90:1: ruleArquitectura EOF
            {
             before(grammarAccess.getArquitecturaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArquitectura_in_entryRuleArquitectura121);
            ruleArquitectura();

            state._fsp--;

             after(grammarAccess.getArquitecturaRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArquitectura128); 

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
    // $ANTLR end "entryRuleArquitectura"


    // $ANTLR start "ruleArquitectura"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:97:1: ruleArquitectura : ( ( rule__Arquitectura__Group__0 ) ) ;
    public final void ruleArquitectura() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:101:2: ( ( ( rule__Arquitectura__Group__0 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:102:1: ( ( rule__Arquitectura__Group__0 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:102:1: ( ( rule__Arquitectura__Group__0 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:103:1: ( rule__Arquitectura__Group__0 )
            {
             before(grammarAccess.getArquitecturaAccess().getGroup()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:104:1: ( rule__Arquitectura__Group__0 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:104:2: rule__Arquitectura__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group__0_in_ruleArquitectura154);
            rule__Arquitectura__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArquitecturaAccess().getGroup()); 

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
    // $ANTLR end "ruleArquitectura"


    // $ANTLR start "entryRuleEscenario"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:116:1: entryRuleEscenario : ruleEscenario EOF ;
    public final void entryRuleEscenario() throws RecognitionException {
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:117:1: ( ruleEscenario EOF )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:118:1: ruleEscenario EOF
            {
             before(grammarAccess.getEscenarioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEscenario_in_entryRuleEscenario181);
            ruleEscenario();

            state._fsp--;

             after(grammarAccess.getEscenarioRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEscenario188); 

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
    // $ANTLR end "entryRuleEscenario"


    // $ANTLR start "ruleEscenario"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:125:1: ruleEscenario : ( ( rule__Escenario__Group__0 ) ) ;
    public final void ruleEscenario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:129:2: ( ( ( rule__Escenario__Group__0 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:130:1: ( ( rule__Escenario__Group__0 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:130:1: ( ( rule__Escenario__Group__0 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:131:1: ( rule__Escenario__Group__0 )
            {
             before(grammarAccess.getEscenarioAccess().getGroup()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:132:1: ( rule__Escenario__Group__0 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:132:2: rule__Escenario__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group__0_in_ruleEscenario214);
            rule__Escenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEscenarioAccess().getGroup()); 

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
    // $ANTLR end "ruleEscenario"


    // $ANTLR start "entryRuleArtefacto"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:144:1: entryRuleArtefacto : ruleArtefacto EOF ;
    public final void entryRuleArtefacto() throws RecognitionException {
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:145:1: ( ruleArtefacto EOF )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:146:1: ruleArtefacto EOF
            {
             before(grammarAccess.getArtefactoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArtefacto_in_entryRuleArtefacto241);
            ruleArtefacto();

            state._fsp--;

             after(grammarAccess.getArtefactoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArtefacto248); 

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
    // $ANTLR end "entryRuleArtefacto"


    // $ANTLR start "ruleArtefacto"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:153:1: ruleArtefacto : ( ( rule__Artefacto__Group__0 ) ) ;
    public final void ruleArtefacto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:157:2: ( ( ( rule__Artefacto__Group__0 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:158:1: ( ( rule__Artefacto__Group__0 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:158:1: ( ( rule__Artefacto__Group__0 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:159:1: ( rule__Artefacto__Group__0 )
            {
             before(grammarAccess.getArtefactoAccess().getGroup()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:160:1: ( rule__Artefacto__Group__0 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:160:2: rule__Artefacto__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artefacto__Group__0_in_ruleArtefacto274);
            rule__Artefacto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArtefactoAccess().getGroup()); 

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
    // $ANTLR end "ruleArtefacto"


    // $ANTLR start "entryRuleEString"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:172:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:173:1: ( ruleEString EOF )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:174:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString301);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString308); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:181:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:185:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:186:1: ( ( rule__EString__Alternatives ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:186:1: ( ( rule__EString__Alternatives ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:187:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:188:1: ( rule__EString__Alternatives )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:188:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString334);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFuente"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:200:1: entryRuleFuente : ruleFuente EOF ;
    public final void entryRuleFuente() throws RecognitionException {
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:201:1: ( ruleFuente EOF )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:202:1: ruleFuente EOF
            {
             before(grammarAccess.getFuenteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuente_in_entryRuleFuente361);
            ruleFuente();

            state._fsp--;

             after(grammarAccess.getFuenteRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuente368); 

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
    // $ANTLR end "entryRuleFuente"


    // $ANTLR start "ruleFuente"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:209:1: ruleFuente : ( ( rule__Fuente__Group__0 ) ) ;
    public final void ruleFuente() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:213:2: ( ( ( rule__Fuente__Group__0 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:214:1: ( ( rule__Fuente__Group__0 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:214:1: ( ( rule__Fuente__Group__0 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:215:1: ( rule__Fuente__Group__0 )
            {
             before(grammarAccess.getFuenteAccess().getGroup()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:216:1: ( rule__Fuente__Group__0 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:216:2: rule__Fuente__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuente__Group__0_in_ruleFuente394);
            rule__Fuente__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuenteAccess().getGroup()); 

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
    // $ANTLR end "ruleFuente"


    // $ANTLR start "entryRuleEstimulo"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:228:1: entryRuleEstimulo : ruleEstimulo EOF ;
    public final void entryRuleEstimulo() throws RecognitionException {
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:229:1: ( ruleEstimulo EOF )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:230:1: ruleEstimulo EOF
            {
             before(grammarAccess.getEstimuloRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEstimulo_in_entryRuleEstimulo421);
            ruleEstimulo();

            state._fsp--;

             after(grammarAccess.getEstimuloRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEstimulo428); 

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
    // $ANTLR end "entryRuleEstimulo"


    // $ANTLR start "ruleEstimulo"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:237:1: ruleEstimulo : ( ( rule__Estimulo__Group__0 ) ) ;
    public final void ruleEstimulo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:241:2: ( ( ( rule__Estimulo__Group__0 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:242:1: ( ( rule__Estimulo__Group__0 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:242:1: ( ( rule__Estimulo__Group__0 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:243:1: ( rule__Estimulo__Group__0 )
            {
             before(grammarAccess.getEstimuloAccess().getGroup()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:244:1: ( rule__Estimulo__Group__0 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:244:2: rule__Estimulo__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Estimulo__Group__0_in_ruleEstimulo454);
            rule__Estimulo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEstimuloAccess().getGroup()); 

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
    // $ANTLR end "ruleEstimulo"


    // $ANTLR start "entryRuleMedidaRespuesta"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:256:1: entryRuleMedidaRespuesta : ruleMedidaRespuesta EOF ;
    public final void entryRuleMedidaRespuesta() throws RecognitionException {
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:257:1: ( ruleMedidaRespuesta EOF )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:258:1: ruleMedidaRespuesta EOF
            {
             before(grammarAccess.getMedidaRespuestaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMedidaRespuesta_in_entryRuleMedidaRespuesta481);
            ruleMedidaRespuesta();

            state._fsp--;

             after(grammarAccess.getMedidaRespuestaRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMedidaRespuesta488); 

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
    // $ANTLR end "entryRuleMedidaRespuesta"


    // $ANTLR start "ruleMedidaRespuesta"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:265:1: ruleMedidaRespuesta : ( ( rule__MedidaRespuesta__Group__0 ) ) ;
    public final void ruleMedidaRespuesta() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:269:2: ( ( ( rule__MedidaRespuesta__Group__0 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:270:1: ( ( rule__MedidaRespuesta__Group__0 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:270:1: ( ( rule__MedidaRespuesta__Group__0 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:271:1: ( rule__MedidaRespuesta__Group__0 )
            {
             before(grammarAccess.getMedidaRespuestaAccess().getGroup()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:272:1: ( rule__MedidaRespuesta__Group__0 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:272:2: rule__MedidaRespuesta__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group__0_in_ruleMedidaRespuesta514);
            rule__MedidaRespuesta__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMedidaRespuestaAccess().getGroup()); 

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
    // $ANTLR end "ruleMedidaRespuesta"


    // $ANTLR start "entryRuleEDouble"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:284:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:285:1: ( ruleEDouble EOF )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:286:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble541);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble548); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:293:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:297:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:298:1: ( ( rule__EDouble__Group__0 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:298:1: ( ( rule__EDouble__Group__0 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:299:1: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:300:1: ( rule__EDouble__Group__0 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:300:2: rule__EDouble__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0_in_ruleEDouble574);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "ruleMetrica"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:313:1: ruleMetrica : ( ( rule__Metrica__Alternatives ) ) ;
    public final void ruleMetrica() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:317:1: ( ( ( rule__Metrica__Alternatives ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:318:1: ( ( rule__Metrica__Alternatives ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:318:1: ( ( rule__Metrica__Alternatives ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:319:1: ( rule__Metrica__Alternatives )
            {
             before(grammarAccess.getMetricaAccess().getAlternatives()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:320:1: ( rule__Metrica__Alternatives )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:320:2: rule__Metrica__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Metrica__Alternatives_in_ruleMetrica611);
            rule__Metrica__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMetricaAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMetrica"


    // $ANTLR start "ruleUnidad"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:332:1: ruleUnidad : ( ( rule__Unidad__Alternatives ) ) ;
    public final void ruleUnidad() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:336:1: ( ( ( rule__Unidad__Alternatives ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:337:1: ( ( rule__Unidad__Alternatives ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:337:1: ( ( rule__Unidad__Alternatives ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:338:1: ( rule__Unidad__Alternatives )
            {
             before(grammarAccess.getUnidadAccess().getAlternatives()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:339:1: ( rule__Unidad__Alternatives )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:339:2: rule__Unidad__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Unidad__Alternatives_in_ruleUnidad647);
            rule__Unidad__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnidadAccess().getAlternatives()); 

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
    // $ANTLR end "ruleUnidad"


    // $ANTLR start "ruleOperador"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:351:1: ruleOperador : ( ( rule__Operador__Alternatives ) ) ;
    public final void ruleOperador() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:355:1: ( ( ( rule__Operador__Alternatives ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:356:1: ( ( rule__Operador__Alternatives ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:356:1: ( ( rule__Operador__Alternatives ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:357:1: ( rule__Operador__Alternatives )
            {
             before(grammarAccess.getOperadorAccess().getAlternatives()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:358:1: ( rule__Operador__Alternatives )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:358:2: rule__Operador__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operador__Alternatives_in_ruleOperador683);
            rule__Operador__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperadorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperador"


    // $ANTLR start "rule__EString__Alternatives"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:369:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:373:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:374:1: ( RULE_STRING )
                    {
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:374:1: ( RULE_STRING )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:375:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives718); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:380:6: ( RULE_ID )
                    {
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:380:6: ( RULE_ID )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:381:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives735); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:391:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:395:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:396:1: ( 'E' )
                    {
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:396:1: ( 'E' )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:397:1: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EDouble__Alternatives_4_0768); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:404:6: ( 'e' )
                    {
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:404:6: ( 'e' )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:405:1: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EDouble__Alternatives_4_0788); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__Metrica__Alternatives"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:417:1: rule__Metrica__Alternatives : ( ( ( 'latency' ) ) | ( ( 'throughput' ) ) | ( ( 'errorPercentage' ) ) | ( ( 'responseCode' ) ) );
    public final void rule__Metrica__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:421:1: ( ( ( 'latency' ) ) | ( ( 'throughput' ) ) | ( ( 'errorPercentage' ) ) | ( ( 'responseCode' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:422:1: ( ( 'latency' ) )
                    {
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:422:1: ( ( 'latency' ) )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:423:1: ( 'latency' )
                    {
                     before(grammarAccess.getMetricaAccess().getLatencyEnumLiteralDeclaration_0()); 
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:424:1: ( 'latency' )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:424:3: 'latency'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Metrica__Alternatives823); 

                    }

                     after(grammarAccess.getMetricaAccess().getLatencyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:429:6: ( ( 'throughput' ) )
                    {
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:429:6: ( ( 'throughput' ) )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:430:1: ( 'throughput' )
                    {
                     before(grammarAccess.getMetricaAccess().getThroughputEnumLiteralDeclaration_1()); 
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:431:1: ( 'throughput' )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:431:3: 'throughput'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__Metrica__Alternatives844); 

                    }

                     after(grammarAccess.getMetricaAccess().getThroughputEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:436:6: ( ( 'errorPercentage' ) )
                    {
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:436:6: ( ( 'errorPercentage' ) )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:437:1: ( 'errorPercentage' )
                    {
                     before(grammarAccess.getMetricaAccess().getErrorPercentageEnumLiteralDeclaration_2()); 
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:438:1: ( 'errorPercentage' )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:438:3: 'errorPercentage'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__Metrica__Alternatives865); 

                    }

                     after(grammarAccess.getMetricaAccess().getErrorPercentageEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:443:6: ( ( 'responseCode' ) )
                    {
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:443:6: ( ( 'responseCode' ) )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:444:1: ( 'responseCode' )
                    {
                     before(grammarAccess.getMetricaAccess().getResponseCodeEnumLiteralDeclaration_3()); 
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:445:1: ( 'responseCode' )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:445:3: 'responseCode'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__Metrica__Alternatives886); 

                    }

                     after(grammarAccess.getMetricaAccess().getResponseCodeEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Metrica__Alternatives"


    // $ANTLR start "rule__Unidad__Alternatives"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:455:1: rule__Unidad__Alternatives : ( ( ( 'segundos' ) ) | ( ( 'ms' ) ) | ( ( 'request' ) ) );
    public final void rule__Unidad__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:459:1: ( ( ( 'segundos' ) ) | ( ( 'ms' ) ) | ( ( 'request' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:460:1: ( ( 'segundos' ) )
                    {
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:460:1: ( ( 'segundos' ) )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:461:1: ( 'segundos' )
                    {
                     before(grammarAccess.getUnidadAccess().getSegundosEnumLiteralDeclaration_0()); 
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:462:1: ( 'segundos' )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:462:3: 'segundos'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__Unidad__Alternatives922); 

                    }

                     after(grammarAccess.getUnidadAccess().getSegundosEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:467:6: ( ( 'ms' ) )
                    {
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:467:6: ( ( 'ms' ) )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:468:1: ( 'ms' )
                    {
                     before(grammarAccess.getUnidadAccess().getMsEnumLiteralDeclaration_1()); 
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:469:1: ( 'ms' )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:469:3: 'ms'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__Unidad__Alternatives943); 

                    }

                     after(grammarAccess.getUnidadAccess().getMsEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:474:6: ( ( 'request' ) )
                    {
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:474:6: ( ( 'request' ) )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:475:1: ( 'request' )
                    {
                     before(grammarAccess.getUnidadAccess().getRequestEnumLiteralDeclaration_2()); 
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:476:1: ( 'request' )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:476:3: 'request'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__Unidad__Alternatives964); 

                    }

                     after(grammarAccess.getUnidadAccess().getRequestEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Unidad__Alternatives"


    // $ANTLR start "rule__Operador__Alternatives"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:486:1: rule__Operador__Alternatives : ( ( ( 'GT' ) ) | ( ( 'LT' ) ) | ( ( 'GTE' ) ) | ( ( 'LTE' ) ) | ( ( 'E' ) ) );
    public final void rule__Operador__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:490:1: ( ( ( 'GT' ) ) | ( ( 'LT' ) ) | ( ( 'GTE' ) ) | ( ( 'LTE' ) ) | ( ( 'E' ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            case 23:
                {
                alt5=4;
                }
                break;
            case 11:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:491:1: ( ( 'GT' ) )
                    {
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:491:1: ( ( 'GT' ) )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:492:1: ( 'GT' )
                    {
                     before(grammarAccess.getOperadorAccess().getGTEnumLiteralDeclaration_0()); 
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:493:1: ( 'GT' )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:493:3: 'GT'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__Operador__Alternatives1000); 

                    }

                     after(grammarAccess.getOperadorAccess().getGTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:498:6: ( ( 'LT' ) )
                    {
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:498:6: ( ( 'LT' ) )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:499:1: ( 'LT' )
                    {
                     before(grammarAccess.getOperadorAccess().getLTEnumLiteralDeclaration_1()); 
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:500:1: ( 'LT' )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:500:3: 'LT'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__Operador__Alternatives1021); 

                    }

                     after(grammarAccess.getOperadorAccess().getLTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:505:6: ( ( 'GTE' ) )
                    {
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:505:6: ( ( 'GTE' ) )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:506:1: ( 'GTE' )
                    {
                     before(grammarAccess.getOperadorAccess().getGTEEnumLiteralDeclaration_2()); 
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:507:1: ( 'GTE' )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:507:3: 'GTE'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__Operador__Alternatives1042); 

                    }

                     after(grammarAccess.getOperadorAccess().getGTEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:512:6: ( ( 'LTE' ) )
                    {
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:512:6: ( ( 'LTE' ) )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:513:1: ( 'LTE' )
                    {
                     before(grammarAccess.getOperadorAccess().getLTEEnumLiteralDeclaration_3()); 
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:514:1: ( 'LTE' )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:514:3: 'LTE'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__Operador__Alternatives1063); 

                    }

                     after(grammarAccess.getOperadorAccess().getLTEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:519:6: ( ( 'E' ) )
                    {
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:519:6: ( ( 'E' ) )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:520:1: ( 'E' )
                    {
                     before(grammarAccess.getOperadorAccess().getEEnumLiteralDeclaration_4()); 
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:521:1: ( 'E' )
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:521:3: 'E'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__Operador__Alternatives1084); 

                    }

                     after(grammarAccess.getOperadorAccess().getEEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__Operador__Alternatives"


    // $ANTLR start "rule__Test__Group__0"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:533:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:537:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:538:2: rule__Test__Group__0__Impl rule__Test__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Test__Group__0__Impl_in_rule__Test__Group__01117);
            rule__Test__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Test__Group__1_in_rule__Test__Group__01120);
            rule__Test__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0"


    // $ANTLR start "rule__Test__Group__0__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:545:1: rule__Test__Group__0__Impl : ( () ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:549:1: ( ( () ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:550:1: ( () )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:550:1: ( () )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:551:1: ()
            {
             before(grammarAccess.getTestAccess().getTestAction_0()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:552:1: ()
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:554:1: 
            {
            }

             after(grammarAccess.getTestAccess().getTestAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0__Impl"


    // $ANTLR start "rule__Test__Group__1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:564:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:568:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:569:2: rule__Test__Group__1__Impl rule__Test__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Test__Group__1__Impl_in_rule__Test__Group__11178);
            rule__Test__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Test__Group__2_in_rule__Test__Group__11181);
            rule__Test__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1"


    // $ANTLR start "rule__Test__Group__1__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:576:1: rule__Test__Group__1__Impl : ( 'Test' ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:580:1: ( ( 'Test' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:581:1: ( 'Test' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:581:1: ( 'Test' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:582:1: 'Test'
            {
             before(grammarAccess.getTestAccess().getTestKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Test__Group__1__Impl1209); 
             after(grammarAccess.getTestAccess().getTestKeyword_1()); 

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
    // $ANTLR end "rule__Test__Group__1__Impl"


    // $ANTLR start "rule__Test__Group__2"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:595:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:599:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:600:2: rule__Test__Group__2__Impl rule__Test__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Test__Group__2__Impl_in_rule__Test__Group__21240);
            rule__Test__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Test__Group__3_in_rule__Test__Group__21243);
            rule__Test__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2"


    // $ANTLR start "rule__Test__Group__2__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:607:1: rule__Test__Group__2__Impl : ( '{' ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:611:1: ( ( '{' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:612:1: ( '{' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:612:1: ( '{' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:613:1: '{'
            {
             before(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Test__Group__2__Impl1271); 
             after(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Test__Group__2__Impl"


    // $ANTLR start "rule__Test__Group__3"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:626:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:630:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:631:2: rule__Test__Group__3__Impl rule__Test__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Test__Group__3__Impl_in_rule__Test__Group__31302);
            rule__Test__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Test__Group__4_in_rule__Test__Group__31305);
            rule__Test__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3"


    // $ANTLR start "rule__Test__Group__3__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:638:1: rule__Test__Group__3__Impl : ( ( rule__Test__Group_3__0 )? ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:642:1: ( ( ( rule__Test__Group_3__0 )? ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:643:1: ( ( rule__Test__Group_3__0 )? )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:643:1: ( ( rule__Test__Group_3__0 )? )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:644:1: ( rule__Test__Group_3__0 )?
            {
             before(grammarAccess.getTestAccess().getGroup_3()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:645:1: ( rule__Test__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:645:2: rule__Test__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Test__Group_3__0_in_rule__Test__Group__3__Impl1332);
                    rule__Test__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTestAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Test__Group__3__Impl"


    // $ANTLR start "rule__Test__Group__4"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:655:1: rule__Test__Group__4 : rule__Test__Group__4__Impl ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:659:1: ( rule__Test__Group__4__Impl )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:660:2: rule__Test__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Test__Group__4__Impl_in_rule__Test__Group__41363);
            rule__Test__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4"


    // $ANTLR start "rule__Test__Group__4__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:666:1: rule__Test__Group__4__Impl : ( '}' ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:670:1: ( ( '}' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:671:1: ( '}' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:671:1: ( '}' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:672:1: '}'
            {
             before(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Test__Group__4__Impl1391); 
             after(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Test__Group__4__Impl"


    // $ANTLR start "rule__Test__Group_3__0"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:695:1: rule__Test__Group_3__0 : rule__Test__Group_3__0__Impl rule__Test__Group_3__1 ;
    public final void rule__Test__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:699:1: ( rule__Test__Group_3__0__Impl rule__Test__Group_3__1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:700:2: rule__Test__Group_3__0__Impl rule__Test__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Test__Group_3__0__Impl_in_rule__Test__Group_3__01432);
            rule__Test__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Test__Group_3__1_in_rule__Test__Group_3__01435);
            rule__Test__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_3__0"


    // $ANTLR start "rule__Test__Group_3__0__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:707:1: rule__Test__Group_3__0__Impl : ( 'arquitecturas' ) ;
    public final void rule__Test__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:711:1: ( ( 'arquitecturas' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:712:1: ( 'arquitecturas' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:712:1: ( 'arquitecturas' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:713:1: 'arquitecturas'
            {
             before(grammarAccess.getTestAccess().getArquitecturasKeyword_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Test__Group_3__0__Impl1463); 
             after(grammarAccess.getTestAccess().getArquitecturasKeyword_3_0()); 

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
    // $ANTLR end "rule__Test__Group_3__0__Impl"


    // $ANTLR start "rule__Test__Group_3__1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:726:1: rule__Test__Group_3__1 : rule__Test__Group_3__1__Impl rule__Test__Group_3__2 ;
    public final void rule__Test__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:730:1: ( rule__Test__Group_3__1__Impl rule__Test__Group_3__2 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:731:2: rule__Test__Group_3__1__Impl rule__Test__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Test__Group_3__1__Impl_in_rule__Test__Group_3__11494);
            rule__Test__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Test__Group_3__2_in_rule__Test__Group_3__11497);
            rule__Test__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_3__1"


    // $ANTLR start "rule__Test__Group_3__1__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:738:1: rule__Test__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Test__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:742:1: ( ( '{' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:743:1: ( '{' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:743:1: ( '{' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:744:1: '{'
            {
             before(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Test__Group_3__1__Impl1525); 
             after(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__Test__Group_3__1__Impl"


    // $ANTLR start "rule__Test__Group_3__2"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:757:1: rule__Test__Group_3__2 : rule__Test__Group_3__2__Impl rule__Test__Group_3__3 ;
    public final void rule__Test__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:761:1: ( rule__Test__Group_3__2__Impl rule__Test__Group_3__3 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:762:2: rule__Test__Group_3__2__Impl rule__Test__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Test__Group_3__2__Impl_in_rule__Test__Group_3__21556);
            rule__Test__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Test__Group_3__3_in_rule__Test__Group_3__21559);
            rule__Test__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_3__2"


    // $ANTLR start "rule__Test__Group_3__2__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:769:1: rule__Test__Group_3__2__Impl : ( ( rule__Test__ArquitecturasAssignment_3_2 ) ) ;
    public final void rule__Test__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:773:1: ( ( ( rule__Test__ArquitecturasAssignment_3_2 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:774:1: ( ( rule__Test__ArquitecturasAssignment_3_2 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:774:1: ( ( rule__Test__ArquitecturasAssignment_3_2 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:775:1: ( rule__Test__ArquitecturasAssignment_3_2 )
            {
             before(grammarAccess.getTestAccess().getArquitecturasAssignment_3_2()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:776:1: ( rule__Test__ArquitecturasAssignment_3_2 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:776:2: rule__Test__ArquitecturasAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Test__ArquitecturasAssignment_3_2_in_rule__Test__Group_3__2__Impl1586);
            rule__Test__ArquitecturasAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getArquitecturasAssignment_3_2()); 

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
    // $ANTLR end "rule__Test__Group_3__2__Impl"


    // $ANTLR start "rule__Test__Group_3__3"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:786:1: rule__Test__Group_3__3 : rule__Test__Group_3__3__Impl rule__Test__Group_3__4 ;
    public final void rule__Test__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:790:1: ( rule__Test__Group_3__3__Impl rule__Test__Group_3__4 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:791:2: rule__Test__Group_3__3__Impl rule__Test__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Test__Group_3__3__Impl_in_rule__Test__Group_3__31616);
            rule__Test__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Test__Group_3__4_in_rule__Test__Group_3__31619);
            rule__Test__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_3__3"


    // $ANTLR start "rule__Test__Group_3__3__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:798:1: rule__Test__Group_3__3__Impl : ( ( rule__Test__Group_3_3__0 )* ) ;
    public final void rule__Test__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:802:1: ( ( ( rule__Test__Group_3_3__0 )* ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:803:1: ( ( rule__Test__Group_3_3__0 )* )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:803:1: ( ( rule__Test__Group_3_3__0 )* )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:804:1: ( rule__Test__Group_3_3__0 )*
            {
             before(grammarAccess.getTestAccess().getGroup_3_3()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:805:1: ( rule__Test__Group_3_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:805:2: rule__Test__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Test__Group_3_3__0_in_rule__Test__Group_3__3__Impl1646);
            	    rule__Test__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__Test__Group_3__3__Impl"


    // $ANTLR start "rule__Test__Group_3__4"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:815:1: rule__Test__Group_3__4 : rule__Test__Group_3__4__Impl ;
    public final void rule__Test__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:819:1: ( rule__Test__Group_3__4__Impl )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:820:2: rule__Test__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Test__Group_3__4__Impl_in_rule__Test__Group_3__41677);
            rule__Test__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_3__4"


    // $ANTLR start "rule__Test__Group_3__4__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:826:1: rule__Test__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Test__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:830:1: ( ( '}' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:831:1: ( '}' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:831:1: ( '}' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:832:1: '}'
            {
             before(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Test__Group_3__4__Impl1705); 
             after(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__Test__Group_3__4__Impl"


    // $ANTLR start "rule__Test__Group_3_3__0"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:855:1: rule__Test__Group_3_3__0 : rule__Test__Group_3_3__0__Impl rule__Test__Group_3_3__1 ;
    public final void rule__Test__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:859:1: ( rule__Test__Group_3_3__0__Impl rule__Test__Group_3_3__1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:860:2: rule__Test__Group_3_3__0__Impl rule__Test__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Test__Group_3_3__0__Impl_in_rule__Test__Group_3_3__01746);
            rule__Test__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Test__Group_3_3__1_in_rule__Test__Group_3_3__01749);
            rule__Test__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_3_3__0"


    // $ANTLR start "rule__Test__Group_3_3__0__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:867:1: rule__Test__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Test__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:871:1: ( ( ',' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:872:1: ( ',' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:872:1: ( ',' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:873:1: ','
            {
             before(grammarAccess.getTestAccess().getCommaKeyword_3_3_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Test__Group_3_3__0__Impl1777); 
             after(grammarAccess.getTestAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__Test__Group_3_3__0__Impl"


    // $ANTLR start "rule__Test__Group_3_3__1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:886:1: rule__Test__Group_3_3__1 : rule__Test__Group_3_3__1__Impl ;
    public final void rule__Test__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:890:1: ( rule__Test__Group_3_3__1__Impl )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:891:2: rule__Test__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Test__Group_3_3__1__Impl_in_rule__Test__Group_3_3__11808);
            rule__Test__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_3_3__1"


    // $ANTLR start "rule__Test__Group_3_3__1__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:897:1: rule__Test__Group_3_3__1__Impl : ( ( rule__Test__ArquitecturasAssignment_3_3_1 ) ) ;
    public final void rule__Test__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:901:1: ( ( ( rule__Test__ArquitecturasAssignment_3_3_1 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:902:1: ( ( rule__Test__ArquitecturasAssignment_3_3_1 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:902:1: ( ( rule__Test__ArquitecturasAssignment_3_3_1 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:903:1: ( rule__Test__ArquitecturasAssignment_3_3_1 )
            {
             before(grammarAccess.getTestAccess().getArquitecturasAssignment_3_3_1()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:904:1: ( rule__Test__ArquitecturasAssignment_3_3_1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:904:2: rule__Test__ArquitecturasAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Test__ArquitecturasAssignment_3_3_1_in_rule__Test__Group_3_3__1__Impl1835);
            rule__Test__ArquitecturasAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getArquitecturasAssignment_3_3_1()); 

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
    // $ANTLR end "rule__Test__Group_3_3__1__Impl"


    // $ANTLR start "rule__Arquitectura__Group__0"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:918:1: rule__Arquitectura__Group__0 : rule__Arquitectura__Group__0__Impl rule__Arquitectura__Group__1 ;
    public final void rule__Arquitectura__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:922:1: ( rule__Arquitectura__Group__0__Impl rule__Arquitectura__Group__1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:923:2: rule__Arquitectura__Group__0__Impl rule__Arquitectura__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group__0__Impl_in_rule__Arquitectura__Group__01869);
            rule__Arquitectura__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group__1_in_rule__Arquitectura__Group__01872);
            rule__Arquitectura__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arquitectura__Group__0"


    // $ANTLR start "rule__Arquitectura__Group__0__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:930:1: rule__Arquitectura__Group__0__Impl : ( () ) ;
    public final void rule__Arquitectura__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:934:1: ( ( () ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:935:1: ( () )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:935:1: ( () )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:936:1: ()
            {
             before(grammarAccess.getArquitecturaAccess().getArquitecturaAction_0()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:937:1: ()
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:939:1: 
            {
            }

             after(grammarAccess.getArquitecturaAccess().getArquitecturaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arquitectura__Group__0__Impl"


    // $ANTLR start "rule__Arquitectura__Group__1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:949:1: rule__Arquitectura__Group__1 : rule__Arquitectura__Group__1__Impl rule__Arquitectura__Group__2 ;
    public final void rule__Arquitectura__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:953:1: ( rule__Arquitectura__Group__1__Impl rule__Arquitectura__Group__2 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:954:2: rule__Arquitectura__Group__1__Impl rule__Arquitectura__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group__1__Impl_in_rule__Arquitectura__Group__11930);
            rule__Arquitectura__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group__2_in_rule__Arquitectura__Group__11933);
            rule__Arquitectura__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arquitectura__Group__1"


    // $ANTLR start "rule__Arquitectura__Group__1__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:961:1: rule__Arquitectura__Group__1__Impl : ( 'Arquitectura' ) ;
    public final void rule__Arquitectura__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:965:1: ( ( 'Arquitectura' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:966:1: ( 'Arquitectura' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:966:1: ( 'Arquitectura' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:967:1: 'Arquitectura'
            {
             before(grammarAccess.getArquitecturaAccess().getArquitecturaKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Arquitectura__Group__1__Impl1961); 
             after(grammarAccess.getArquitecturaAccess().getArquitecturaKeyword_1()); 

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
    // $ANTLR end "rule__Arquitectura__Group__1__Impl"


    // $ANTLR start "rule__Arquitectura__Group__2"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:980:1: rule__Arquitectura__Group__2 : rule__Arquitectura__Group__2__Impl rule__Arquitectura__Group__3 ;
    public final void rule__Arquitectura__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:984:1: ( rule__Arquitectura__Group__2__Impl rule__Arquitectura__Group__3 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:985:2: rule__Arquitectura__Group__2__Impl rule__Arquitectura__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group__2__Impl_in_rule__Arquitectura__Group__21992);
            rule__Arquitectura__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group__3_in_rule__Arquitectura__Group__21995);
            rule__Arquitectura__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arquitectura__Group__2"


    // $ANTLR start "rule__Arquitectura__Group__2__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:992:1: rule__Arquitectura__Group__2__Impl : ( '{' ) ;
    public final void rule__Arquitectura__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:996:1: ( ( '{' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:997:1: ( '{' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:997:1: ( '{' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:998:1: '{'
            {
             before(grammarAccess.getArquitecturaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Arquitectura__Group__2__Impl2023); 
             after(grammarAccess.getArquitecturaAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Arquitectura__Group__2__Impl"


    // $ANTLR start "rule__Arquitectura__Group__3"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1011:1: rule__Arquitectura__Group__3 : rule__Arquitectura__Group__3__Impl rule__Arquitectura__Group__4 ;
    public final void rule__Arquitectura__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1015:1: ( rule__Arquitectura__Group__3__Impl rule__Arquitectura__Group__4 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1016:2: rule__Arquitectura__Group__3__Impl rule__Arquitectura__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group__3__Impl_in_rule__Arquitectura__Group__32054);
            rule__Arquitectura__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group__4_in_rule__Arquitectura__Group__32057);
            rule__Arquitectura__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arquitectura__Group__3"


    // $ANTLR start "rule__Arquitectura__Group__3__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1023:1: rule__Arquitectura__Group__3__Impl : ( ( rule__Arquitectura__Group_3__0 )? ) ;
    public final void rule__Arquitectura__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1027:1: ( ( ( rule__Arquitectura__Group_3__0 )? ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1028:1: ( ( rule__Arquitectura__Group_3__0 )? )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1028:1: ( ( rule__Arquitectura__Group_3__0 )? )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1029:1: ( rule__Arquitectura__Group_3__0 )?
            {
             before(grammarAccess.getArquitecturaAccess().getGroup_3()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1030:1: ( rule__Arquitectura__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1030:2: rule__Arquitectura__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_3__0_in_rule__Arquitectura__Group__3__Impl2084);
                    rule__Arquitectura__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArquitecturaAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Arquitectura__Group__3__Impl"


    // $ANTLR start "rule__Arquitectura__Group__4"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1040:1: rule__Arquitectura__Group__4 : rule__Arquitectura__Group__4__Impl rule__Arquitectura__Group__5 ;
    public final void rule__Arquitectura__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1044:1: ( rule__Arquitectura__Group__4__Impl rule__Arquitectura__Group__5 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1045:2: rule__Arquitectura__Group__4__Impl rule__Arquitectura__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group__4__Impl_in_rule__Arquitectura__Group__42115);
            rule__Arquitectura__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group__5_in_rule__Arquitectura__Group__42118);
            rule__Arquitectura__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arquitectura__Group__4"


    // $ANTLR start "rule__Arquitectura__Group__4__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1052:1: rule__Arquitectura__Group__4__Impl : ( ( rule__Arquitectura__Group_4__0 )? ) ;
    public final void rule__Arquitectura__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1056:1: ( ( ( rule__Arquitectura__Group_4__0 )? ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1057:1: ( ( rule__Arquitectura__Group_4__0 )? )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1057:1: ( ( rule__Arquitectura__Group_4__0 )? )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1058:1: ( rule__Arquitectura__Group_4__0 )?
            {
             before(grammarAccess.getArquitecturaAccess().getGroup_4()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1059:1: ( rule__Arquitectura__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1059:2: rule__Arquitectura__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_4__0_in_rule__Arquitectura__Group__4__Impl2145);
                    rule__Arquitectura__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArquitecturaAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Arquitectura__Group__4__Impl"


    // $ANTLR start "rule__Arquitectura__Group__5"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1069:1: rule__Arquitectura__Group__5 : rule__Arquitectura__Group__5__Impl ;
    public final void rule__Arquitectura__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1073:1: ( rule__Arquitectura__Group__5__Impl )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1074:2: rule__Arquitectura__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group__5__Impl_in_rule__Arquitectura__Group__52176);
            rule__Arquitectura__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arquitectura__Group__5"


    // $ANTLR start "rule__Arquitectura__Group__5__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1080:1: rule__Arquitectura__Group__5__Impl : ( '}' ) ;
    public final void rule__Arquitectura__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1084:1: ( ( '}' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1085:1: ( '}' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1085:1: ( '}' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1086:1: '}'
            {
             before(grammarAccess.getArquitecturaAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Arquitectura__Group__5__Impl2204); 
             after(grammarAccess.getArquitecturaAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Arquitectura__Group__5__Impl"


    // $ANTLR start "rule__Arquitectura__Group_3__0"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1111:1: rule__Arquitectura__Group_3__0 : rule__Arquitectura__Group_3__0__Impl rule__Arquitectura__Group_3__1 ;
    public final void rule__Arquitectura__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1115:1: ( rule__Arquitectura__Group_3__0__Impl rule__Arquitectura__Group_3__1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1116:2: rule__Arquitectura__Group_3__0__Impl rule__Arquitectura__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_3__0__Impl_in_rule__Arquitectura__Group_3__02247);
            rule__Arquitectura__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_3__1_in_rule__Arquitectura__Group_3__02250);
            rule__Arquitectura__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arquitectura__Group_3__0"


    // $ANTLR start "rule__Arquitectura__Group_3__0__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1123:1: rule__Arquitectura__Group_3__0__Impl : ( 'escenarios' ) ;
    public final void rule__Arquitectura__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1127:1: ( ( 'escenarios' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1128:1: ( 'escenarios' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1128:1: ( 'escenarios' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1129:1: 'escenarios'
            {
             before(grammarAccess.getArquitecturaAccess().getEscenariosKeyword_3_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Arquitectura__Group_3__0__Impl2278); 
             after(grammarAccess.getArquitecturaAccess().getEscenariosKeyword_3_0()); 

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
    // $ANTLR end "rule__Arquitectura__Group_3__0__Impl"


    // $ANTLR start "rule__Arquitectura__Group_3__1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1142:1: rule__Arquitectura__Group_3__1 : rule__Arquitectura__Group_3__1__Impl rule__Arquitectura__Group_3__2 ;
    public final void rule__Arquitectura__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1146:1: ( rule__Arquitectura__Group_3__1__Impl rule__Arquitectura__Group_3__2 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1147:2: rule__Arquitectura__Group_3__1__Impl rule__Arquitectura__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_3__1__Impl_in_rule__Arquitectura__Group_3__12309);
            rule__Arquitectura__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_3__2_in_rule__Arquitectura__Group_3__12312);
            rule__Arquitectura__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arquitectura__Group_3__1"


    // $ANTLR start "rule__Arquitectura__Group_3__1__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1154:1: rule__Arquitectura__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Arquitectura__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1158:1: ( ( '{' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1159:1: ( '{' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1159:1: ( '{' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1160:1: '{'
            {
             before(grammarAccess.getArquitecturaAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Arquitectura__Group_3__1__Impl2340); 
             after(grammarAccess.getArquitecturaAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__Arquitectura__Group_3__1__Impl"


    // $ANTLR start "rule__Arquitectura__Group_3__2"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1173:1: rule__Arquitectura__Group_3__2 : rule__Arquitectura__Group_3__2__Impl rule__Arquitectura__Group_3__3 ;
    public final void rule__Arquitectura__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1177:1: ( rule__Arquitectura__Group_3__2__Impl rule__Arquitectura__Group_3__3 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1178:2: rule__Arquitectura__Group_3__2__Impl rule__Arquitectura__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_3__2__Impl_in_rule__Arquitectura__Group_3__22371);
            rule__Arquitectura__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_3__3_in_rule__Arquitectura__Group_3__22374);
            rule__Arquitectura__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arquitectura__Group_3__2"


    // $ANTLR start "rule__Arquitectura__Group_3__2__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1185:1: rule__Arquitectura__Group_3__2__Impl : ( ( rule__Arquitectura__EscenariosAssignment_3_2 ) ) ;
    public final void rule__Arquitectura__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1189:1: ( ( ( rule__Arquitectura__EscenariosAssignment_3_2 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1190:1: ( ( rule__Arquitectura__EscenariosAssignment_3_2 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1190:1: ( ( rule__Arquitectura__EscenariosAssignment_3_2 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1191:1: ( rule__Arquitectura__EscenariosAssignment_3_2 )
            {
             before(grammarAccess.getArquitecturaAccess().getEscenariosAssignment_3_2()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1192:1: ( rule__Arquitectura__EscenariosAssignment_3_2 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1192:2: rule__Arquitectura__EscenariosAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__EscenariosAssignment_3_2_in_rule__Arquitectura__Group_3__2__Impl2401);
            rule__Arquitectura__EscenariosAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getArquitecturaAccess().getEscenariosAssignment_3_2()); 

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
    // $ANTLR end "rule__Arquitectura__Group_3__2__Impl"


    // $ANTLR start "rule__Arquitectura__Group_3__3"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1202:1: rule__Arquitectura__Group_3__3 : rule__Arquitectura__Group_3__3__Impl rule__Arquitectura__Group_3__4 ;
    public final void rule__Arquitectura__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1206:1: ( rule__Arquitectura__Group_3__3__Impl rule__Arquitectura__Group_3__4 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1207:2: rule__Arquitectura__Group_3__3__Impl rule__Arquitectura__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_3__3__Impl_in_rule__Arquitectura__Group_3__32431);
            rule__Arquitectura__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_3__4_in_rule__Arquitectura__Group_3__32434);
            rule__Arquitectura__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arquitectura__Group_3__3"


    // $ANTLR start "rule__Arquitectura__Group_3__3__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1214:1: rule__Arquitectura__Group_3__3__Impl : ( ( rule__Arquitectura__Group_3_3__0 )* ) ;
    public final void rule__Arquitectura__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1218:1: ( ( ( rule__Arquitectura__Group_3_3__0 )* ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1219:1: ( ( rule__Arquitectura__Group_3_3__0 )* )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1219:1: ( ( rule__Arquitectura__Group_3_3__0 )* )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1220:1: ( rule__Arquitectura__Group_3_3__0 )*
            {
             before(grammarAccess.getArquitecturaAccess().getGroup_3_3()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1221:1: ( rule__Arquitectura__Group_3_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1221:2: rule__Arquitectura__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_3_3__0_in_rule__Arquitectura__Group_3__3__Impl2461);
            	    rule__Arquitectura__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getArquitecturaAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__Arquitectura__Group_3__3__Impl"


    // $ANTLR start "rule__Arquitectura__Group_3__4"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1231:1: rule__Arquitectura__Group_3__4 : rule__Arquitectura__Group_3__4__Impl ;
    public final void rule__Arquitectura__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1235:1: ( rule__Arquitectura__Group_3__4__Impl )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1236:2: rule__Arquitectura__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_3__4__Impl_in_rule__Arquitectura__Group_3__42492);
            rule__Arquitectura__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arquitectura__Group_3__4"


    // $ANTLR start "rule__Arquitectura__Group_3__4__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1242:1: rule__Arquitectura__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Arquitectura__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1246:1: ( ( '}' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1247:1: ( '}' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1247:1: ( '}' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1248:1: '}'
            {
             before(grammarAccess.getArquitecturaAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Arquitectura__Group_3__4__Impl2520); 
             after(grammarAccess.getArquitecturaAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__Arquitectura__Group_3__4__Impl"


    // $ANTLR start "rule__Arquitectura__Group_3_3__0"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1271:1: rule__Arquitectura__Group_3_3__0 : rule__Arquitectura__Group_3_3__0__Impl rule__Arquitectura__Group_3_3__1 ;
    public final void rule__Arquitectura__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1275:1: ( rule__Arquitectura__Group_3_3__0__Impl rule__Arquitectura__Group_3_3__1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1276:2: rule__Arquitectura__Group_3_3__0__Impl rule__Arquitectura__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_3_3__0__Impl_in_rule__Arquitectura__Group_3_3__02561);
            rule__Arquitectura__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_3_3__1_in_rule__Arquitectura__Group_3_3__02564);
            rule__Arquitectura__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arquitectura__Group_3_3__0"


    // $ANTLR start "rule__Arquitectura__Group_3_3__0__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1283:1: rule__Arquitectura__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Arquitectura__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1287:1: ( ( ',' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1288:1: ( ',' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1288:1: ( ',' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1289:1: ','
            {
             before(grammarAccess.getArquitecturaAccess().getCommaKeyword_3_3_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Arquitectura__Group_3_3__0__Impl2592); 
             after(grammarAccess.getArquitecturaAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__Arquitectura__Group_3_3__0__Impl"


    // $ANTLR start "rule__Arquitectura__Group_3_3__1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1302:1: rule__Arquitectura__Group_3_3__1 : rule__Arquitectura__Group_3_3__1__Impl ;
    public final void rule__Arquitectura__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1306:1: ( rule__Arquitectura__Group_3_3__1__Impl )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1307:2: rule__Arquitectura__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_3_3__1__Impl_in_rule__Arquitectura__Group_3_3__12623);
            rule__Arquitectura__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arquitectura__Group_3_3__1"


    // $ANTLR start "rule__Arquitectura__Group_3_3__1__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1313:1: rule__Arquitectura__Group_3_3__1__Impl : ( ( rule__Arquitectura__EscenariosAssignment_3_3_1 ) ) ;
    public final void rule__Arquitectura__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1317:1: ( ( ( rule__Arquitectura__EscenariosAssignment_3_3_1 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1318:1: ( ( rule__Arquitectura__EscenariosAssignment_3_3_1 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1318:1: ( ( rule__Arquitectura__EscenariosAssignment_3_3_1 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1319:1: ( rule__Arquitectura__EscenariosAssignment_3_3_1 )
            {
             before(grammarAccess.getArquitecturaAccess().getEscenariosAssignment_3_3_1()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1320:1: ( rule__Arquitectura__EscenariosAssignment_3_3_1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1320:2: rule__Arquitectura__EscenariosAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__EscenariosAssignment_3_3_1_in_rule__Arquitectura__Group_3_3__1__Impl2650);
            rule__Arquitectura__EscenariosAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getArquitecturaAccess().getEscenariosAssignment_3_3_1()); 

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
    // $ANTLR end "rule__Arquitectura__Group_3_3__1__Impl"


    // $ANTLR start "rule__Arquitectura__Group_4__0"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1334:1: rule__Arquitectura__Group_4__0 : rule__Arquitectura__Group_4__0__Impl rule__Arquitectura__Group_4__1 ;
    public final void rule__Arquitectura__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1338:1: ( rule__Arquitectura__Group_4__0__Impl rule__Arquitectura__Group_4__1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1339:2: rule__Arquitectura__Group_4__0__Impl rule__Arquitectura__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_4__0__Impl_in_rule__Arquitectura__Group_4__02684);
            rule__Arquitectura__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_4__1_in_rule__Arquitectura__Group_4__02687);
            rule__Arquitectura__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arquitectura__Group_4__0"


    // $ANTLR start "rule__Arquitectura__Group_4__0__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1346:1: rule__Arquitectura__Group_4__0__Impl : ( 'artefactos' ) ;
    public final void rule__Arquitectura__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1350:1: ( ( 'artefactos' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1351:1: ( 'artefactos' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1351:1: ( 'artefactos' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1352:1: 'artefactos'
            {
             before(grammarAccess.getArquitecturaAccess().getArtefactosKeyword_4_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Arquitectura__Group_4__0__Impl2715); 
             after(grammarAccess.getArquitecturaAccess().getArtefactosKeyword_4_0()); 

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
    // $ANTLR end "rule__Arquitectura__Group_4__0__Impl"


    // $ANTLR start "rule__Arquitectura__Group_4__1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1365:1: rule__Arquitectura__Group_4__1 : rule__Arquitectura__Group_4__1__Impl rule__Arquitectura__Group_4__2 ;
    public final void rule__Arquitectura__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1369:1: ( rule__Arquitectura__Group_4__1__Impl rule__Arquitectura__Group_4__2 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1370:2: rule__Arquitectura__Group_4__1__Impl rule__Arquitectura__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_4__1__Impl_in_rule__Arquitectura__Group_4__12746);
            rule__Arquitectura__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_4__2_in_rule__Arquitectura__Group_4__12749);
            rule__Arquitectura__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arquitectura__Group_4__1"


    // $ANTLR start "rule__Arquitectura__Group_4__1__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1377:1: rule__Arquitectura__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Arquitectura__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1381:1: ( ( '{' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1382:1: ( '{' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1382:1: ( '{' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1383:1: '{'
            {
             before(grammarAccess.getArquitecturaAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Arquitectura__Group_4__1__Impl2777); 
             after(grammarAccess.getArquitecturaAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Arquitectura__Group_4__1__Impl"


    // $ANTLR start "rule__Arquitectura__Group_4__2"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1396:1: rule__Arquitectura__Group_4__2 : rule__Arquitectura__Group_4__2__Impl rule__Arquitectura__Group_4__3 ;
    public final void rule__Arquitectura__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1400:1: ( rule__Arquitectura__Group_4__2__Impl rule__Arquitectura__Group_4__3 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1401:2: rule__Arquitectura__Group_4__2__Impl rule__Arquitectura__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_4__2__Impl_in_rule__Arquitectura__Group_4__22808);
            rule__Arquitectura__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_4__3_in_rule__Arquitectura__Group_4__22811);
            rule__Arquitectura__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arquitectura__Group_4__2"


    // $ANTLR start "rule__Arquitectura__Group_4__2__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1408:1: rule__Arquitectura__Group_4__2__Impl : ( ( rule__Arquitectura__ArtefactosAssignment_4_2 ) ) ;
    public final void rule__Arquitectura__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1412:1: ( ( ( rule__Arquitectura__ArtefactosAssignment_4_2 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1413:1: ( ( rule__Arquitectura__ArtefactosAssignment_4_2 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1413:1: ( ( rule__Arquitectura__ArtefactosAssignment_4_2 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1414:1: ( rule__Arquitectura__ArtefactosAssignment_4_2 )
            {
             before(grammarAccess.getArquitecturaAccess().getArtefactosAssignment_4_2()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1415:1: ( rule__Arquitectura__ArtefactosAssignment_4_2 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1415:2: rule__Arquitectura__ArtefactosAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__ArtefactosAssignment_4_2_in_rule__Arquitectura__Group_4__2__Impl2838);
            rule__Arquitectura__ArtefactosAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getArquitecturaAccess().getArtefactosAssignment_4_2()); 

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
    // $ANTLR end "rule__Arquitectura__Group_4__2__Impl"


    // $ANTLR start "rule__Arquitectura__Group_4__3"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1425:1: rule__Arquitectura__Group_4__3 : rule__Arquitectura__Group_4__3__Impl rule__Arquitectura__Group_4__4 ;
    public final void rule__Arquitectura__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1429:1: ( rule__Arquitectura__Group_4__3__Impl rule__Arquitectura__Group_4__4 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1430:2: rule__Arquitectura__Group_4__3__Impl rule__Arquitectura__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_4__3__Impl_in_rule__Arquitectura__Group_4__32868);
            rule__Arquitectura__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_4__4_in_rule__Arquitectura__Group_4__32871);
            rule__Arquitectura__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arquitectura__Group_4__3"


    // $ANTLR start "rule__Arquitectura__Group_4__3__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1437:1: rule__Arquitectura__Group_4__3__Impl : ( ( rule__Arquitectura__Group_4_3__0 )* ) ;
    public final void rule__Arquitectura__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1441:1: ( ( ( rule__Arquitectura__Group_4_3__0 )* ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1442:1: ( ( rule__Arquitectura__Group_4_3__0 )* )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1442:1: ( ( rule__Arquitectura__Group_4_3__0 )* )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1443:1: ( rule__Arquitectura__Group_4_3__0 )*
            {
             before(grammarAccess.getArquitecturaAccess().getGroup_4_3()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1444:1: ( rule__Arquitectura__Group_4_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1444:2: rule__Arquitectura__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_4_3__0_in_rule__Arquitectura__Group_4__3__Impl2898);
            	    rule__Arquitectura__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getArquitecturaAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Arquitectura__Group_4__3__Impl"


    // $ANTLR start "rule__Arquitectura__Group_4__4"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1454:1: rule__Arquitectura__Group_4__4 : rule__Arquitectura__Group_4__4__Impl ;
    public final void rule__Arquitectura__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1458:1: ( rule__Arquitectura__Group_4__4__Impl )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1459:2: rule__Arquitectura__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_4__4__Impl_in_rule__Arquitectura__Group_4__42929);
            rule__Arquitectura__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arquitectura__Group_4__4"


    // $ANTLR start "rule__Arquitectura__Group_4__4__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1465:1: rule__Arquitectura__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Arquitectura__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1469:1: ( ( '}' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1470:1: ( '}' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1470:1: ( '}' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1471:1: '}'
            {
             before(grammarAccess.getArquitecturaAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Arquitectura__Group_4__4__Impl2957); 
             after(grammarAccess.getArquitecturaAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Arquitectura__Group_4__4__Impl"


    // $ANTLR start "rule__Arquitectura__Group_4_3__0"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1494:1: rule__Arquitectura__Group_4_3__0 : rule__Arquitectura__Group_4_3__0__Impl rule__Arquitectura__Group_4_3__1 ;
    public final void rule__Arquitectura__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1498:1: ( rule__Arquitectura__Group_4_3__0__Impl rule__Arquitectura__Group_4_3__1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1499:2: rule__Arquitectura__Group_4_3__0__Impl rule__Arquitectura__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_4_3__0__Impl_in_rule__Arquitectura__Group_4_3__02998);
            rule__Arquitectura__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_4_3__1_in_rule__Arquitectura__Group_4_3__03001);
            rule__Arquitectura__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arquitectura__Group_4_3__0"


    // $ANTLR start "rule__Arquitectura__Group_4_3__0__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1506:1: rule__Arquitectura__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Arquitectura__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1510:1: ( ( ',' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1511:1: ( ',' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1511:1: ( ',' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1512:1: ','
            {
             before(grammarAccess.getArquitecturaAccess().getCommaKeyword_4_3_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Arquitectura__Group_4_3__0__Impl3029); 
             after(grammarAccess.getArquitecturaAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Arquitectura__Group_4_3__0__Impl"


    // $ANTLR start "rule__Arquitectura__Group_4_3__1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1525:1: rule__Arquitectura__Group_4_3__1 : rule__Arquitectura__Group_4_3__1__Impl ;
    public final void rule__Arquitectura__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1529:1: ( rule__Arquitectura__Group_4_3__1__Impl )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1530:2: rule__Arquitectura__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Group_4_3__1__Impl_in_rule__Arquitectura__Group_4_3__13060);
            rule__Arquitectura__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arquitectura__Group_4_3__1"


    // $ANTLR start "rule__Arquitectura__Group_4_3__1__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1536:1: rule__Arquitectura__Group_4_3__1__Impl : ( ( rule__Arquitectura__ArtefactosAssignment_4_3_1 ) ) ;
    public final void rule__Arquitectura__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1540:1: ( ( ( rule__Arquitectura__ArtefactosAssignment_4_3_1 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1541:1: ( ( rule__Arquitectura__ArtefactosAssignment_4_3_1 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1541:1: ( ( rule__Arquitectura__ArtefactosAssignment_4_3_1 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1542:1: ( rule__Arquitectura__ArtefactosAssignment_4_3_1 )
            {
             before(grammarAccess.getArquitecturaAccess().getArtefactosAssignment_4_3_1()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1543:1: ( rule__Arquitectura__ArtefactosAssignment_4_3_1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1543:2: rule__Arquitectura__ArtefactosAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__ArtefactosAssignment_4_3_1_in_rule__Arquitectura__Group_4_3__1__Impl3087);
            rule__Arquitectura__ArtefactosAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getArquitecturaAccess().getArtefactosAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Arquitectura__Group_4_3__1__Impl"


    // $ANTLR start "rule__Escenario__Group__0"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1557:1: rule__Escenario__Group__0 : rule__Escenario__Group__0__Impl rule__Escenario__Group__1 ;
    public final void rule__Escenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1561:1: ( rule__Escenario__Group__0__Impl rule__Escenario__Group__1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1562:2: rule__Escenario__Group__0__Impl rule__Escenario__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group__0__Impl_in_rule__Escenario__Group__03121);
            rule__Escenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group__1_in_rule__Escenario__Group__03124);
            rule__Escenario__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escenario__Group__0"


    // $ANTLR start "rule__Escenario__Group__0__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1569:1: rule__Escenario__Group__0__Impl : ( 'Escenario' ) ;
    public final void rule__Escenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1573:1: ( ( 'Escenario' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1574:1: ( 'Escenario' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1574:1: ( 'Escenario' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1575:1: 'Escenario'
            {
             before(grammarAccess.getEscenarioAccess().getEscenarioKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Escenario__Group__0__Impl3152); 
             after(grammarAccess.getEscenarioAccess().getEscenarioKeyword_0()); 

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
    // $ANTLR end "rule__Escenario__Group__0__Impl"


    // $ANTLR start "rule__Escenario__Group__1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1588:1: rule__Escenario__Group__1 : rule__Escenario__Group__1__Impl rule__Escenario__Group__2 ;
    public final void rule__Escenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1592:1: ( rule__Escenario__Group__1__Impl rule__Escenario__Group__2 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1593:2: rule__Escenario__Group__1__Impl rule__Escenario__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group__1__Impl_in_rule__Escenario__Group__13183);
            rule__Escenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group__2_in_rule__Escenario__Group__13186);
            rule__Escenario__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escenario__Group__1"


    // $ANTLR start "rule__Escenario__Group__1__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1600:1: rule__Escenario__Group__1__Impl : ( '{' ) ;
    public final void rule__Escenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1604:1: ( ( '{' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1605:1: ( '{' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1605:1: ( '{' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1606:1: '{'
            {
             before(grammarAccess.getEscenarioAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Escenario__Group__1__Impl3214); 
             after(grammarAccess.getEscenarioAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Escenario__Group__1__Impl"


    // $ANTLR start "rule__Escenario__Group__2"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1619:1: rule__Escenario__Group__2 : rule__Escenario__Group__2__Impl rule__Escenario__Group__3 ;
    public final void rule__Escenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1623:1: ( rule__Escenario__Group__2__Impl rule__Escenario__Group__3 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1624:2: rule__Escenario__Group__2__Impl rule__Escenario__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group__2__Impl_in_rule__Escenario__Group__23245);
            rule__Escenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group__3_in_rule__Escenario__Group__23248);
            rule__Escenario__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escenario__Group__2"


    // $ANTLR start "rule__Escenario__Group__2__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1631:1: rule__Escenario__Group__2__Impl : ( ( rule__Escenario__Group_2__0 )? ) ;
    public final void rule__Escenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1635:1: ( ( ( rule__Escenario__Group_2__0 )? ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1636:1: ( ( rule__Escenario__Group_2__0 )? )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1636:1: ( ( rule__Escenario__Group_2__0 )? )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1637:1: ( rule__Escenario__Group_2__0 )?
            {
             before(grammarAccess.getEscenarioAccess().getGroup_2()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1638:1: ( rule__Escenario__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1638:2: rule__Escenario__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group_2__0_in_rule__Escenario__Group__2__Impl3275);
                    rule__Escenario__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEscenarioAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Escenario__Group__2__Impl"


    // $ANTLR start "rule__Escenario__Group__3"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1648:1: rule__Escenario__Group__3 : rule__Escenario__Group__3__Impl rule__Escenario__Group__4 ;
    public final void rule__Escenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1652:1: ( rule__Escenario__Group__3__Impl rule__Escenario__Group__4 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1653:2: rule__Escenario__Group__3__Impl rule__Escenario__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group__3__Impl_in_rule__Escenario__Group__33306);
            rule__Escenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group__4_in_rule__Escenario__Group__33309);
            rule__Escenario__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escenario__Group__3"


    // $ANTLR start "rule__Escenario__Group__3__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1660:1: rule__Escenario__Group__3__Impl : ( 'fuente' ) ;
    public final void rule__Escenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1664:1: ( ( 'fuente' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1665:1: ( 'fuente' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1665:1: ( 'fuente' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1666:1: 'fuente'
            {
             before(grammarAccess.getEscenarioAccess().getFuenteKeyword_3()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Escenario__Group__3__Impl3337); 
             after(grammarAccess.getEscenarioAccess().getFuenteKeyword_3()); 

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
    // $ANTLR end "rule__Escenario__Group__3__Impl"


    // $ANTLR start "rule__Escenario__Group__4"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1679:1: rule__Escenario__Group__4 : rule__Escenario__Group__4__Impl rule__Escenario__Group__5 ;
    public final void rule__Escenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1683:1: ( rule__Escenario__Group__4__Impl rule__Escenario__Group__5 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1684:2: rule__Escenario__Group__4__Impl rule__Escenario__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group__4__Impl_in_rule__Escenario__Group__43368);
            rule__Escenario__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group__5_in_rule__Escenario__Group__43371);
            rule__Escenario__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escenario__Group__4"


    // $ANTLR start "rule__Escenario__Group__4__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1691:1: rule__Escenario__Group__4__Impl : ( ( rule__Escenario__FuenteAssignment_4 ) ) ;
    public final void rule__Escenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1695:1: ( ( ( rule__Escenario__FuenteAssignment_4 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1696:1: ( ( rule__Escenario__FuenteAssignment_4 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1696:1: ( ( rule__Escenario__FuenteAssignment_4 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1697:1: ( rule__Escenario__FuenteAssignment_4 )
            {
             before(grammarAccess.getEscenarioAccess().getFuenteAssignment_4()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1698:1: ( rule__Escenario__FuenteAssignment_4 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1698:2: rule__Escenario__FuenteAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escenario__FuenteAssignment_4_in_rule__Escenario__Group__4__Impl3398);
            rule__Escenario__FuenteAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEscenarioAccess().getFuenteAssignment_4()); 

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
    // $ANTLR end "rule__Escenario__Group__4__Impl"


    // $ANTLR start "rule__Escenario__Group__5"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1708:1: rule__Escenario__Group__5 : rule__Escenario__Group__5__Impl rule__Escenario__Group__6 ;
    public final void rule__Escenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1712:1: ( rule__Escenario__Group__5__Impl rule__Escenario__Group__6 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1713:2: rule__Escenario__Group__5__Impl rule__Escenario__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group__5__Impl_in_rule__Escenario__Group__53428);
            rule__Escenario__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group__6_in_rule__Escenario__Group__53431);
            rule__Escenario__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escenario__Group__5"


    // $ANTLR start "rule__Escenario__Group__5__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1720:1: rule__Escenario__Group__5__Impl : ( 'estimulo' ) ;
    public final void rule__Escenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1724:1: ( ( 'estimulo' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1725:1: ( 'estimulo' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1725:1: ( 'estimulo' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1726:1: 'estimulo'
            {
             before(grammarAccess.getEscenarioAccess().getEstimuloKeyword_5()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Escenario__Group__5__Impl3459); 
             after(grammarAccess.getEscenarioAccess().getEstimuloKeyword_5()); 

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
    // $ANTLR end "rule__Escenario__Group__5__Impl"


    // $ANTLR start "rule__Escenario__Group__6"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1739:1: rule__Escenario__Group__6 : rule__Escenario__Group__6__Impl rule__Escenario__Group__7 ;
    public final void rule__Escenario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1743:1: ( rule__Escenario__Group__6__Impl rule__Escenario__Group__7 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1744:2: rule__Escenario__Group__6__Impl rule__Escenario__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group__6__Impl_in_rule__Escenario__Group__63490);
            rule__Escenario__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group__7_in_rule__Escenario__Group__63493);
            rule__Escenario__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escenario__Group__6"


    // $ANTLR start "rule__Escenario__Group__6__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1751:1: rule__Escenario__Group__6__Impl : ( ( rule__Escenario__EstimuloAssignment_6 ) ) ;
    public final void rule__Escenario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1755:1: ( ( ( rule__Escenario__EstimuloAssignment_6 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1756:1: ( ( rule__Escenario__EstimuloAssignment_6 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1756:1: ( ( rule__Escenario__EstimuloAssignment_6 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1757:1: ( rule__Escenario__EstimuloAssignment_6 )
            {
             before(grammarAccess.getEscenarioAccess().getEstimuloAssignment_6()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1758:1: ( rule__Escenario__EstimuloAssignment_6 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1758:2: rule__Escenario__EstimuloAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escenario__EstimuloAssignment_6_in_rule__Escenario__Group__6__Impl3520);
            rule__Escenario__EstimuloAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEscenarioAccess().getEstimuloAssignment_6()); 

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
    // $ANTLR end "rule__Escenario__Group__6__Impl"


    // $ANTLR start "rule__Escenario__Group__7"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1768:1: rule__Escenario__Group__7 : rule__Escenario__Group__7__Impl rule__Escenario__Group__8 ;
    public final void rule__Escenario__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1772:1: ( rule__Escenario__Group__7__Impl rule__Escenario__Group__8 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1773:2: rule__Escenario__Group__7__Impl rule__Escenario__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group__7__Impl_in_rule__Escenario__Group__73550);
            rule__Escenario__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group__8_in_rule__Escenario__Group__73553);
            rule__Escenario__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escenario__Group__7"


    // $ANTLR start "rule__Escenario__Group__7__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1780:1: rule__Escenario__Group__7__Impl : ( 'medida' ) ;
    public final void rule__Escenario__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1784:1: ( ( 'medida' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1785:1: ( 'medida' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1785:1: ( 'medida' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1786:1: 'medida'
            {
             before(grammarAccess.getEscenarioAccess().getMedidaKeyword_7()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Escenario__Group__7__Impl3581); 
             after(grammarAccess.getEscenarioAccess().getMedidaKeyword_7()); 

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
    // $ANTLR end "rule__Escenario__Group__7__Impl"


    // $ANTLR start "rule__Escenario__Group__8"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1799:1: rule__Escenario__Group__8 : rule__Escenario__Group__8__Impl rule__Escenario__Group__9 ;
    public final void rule__Escenario__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1803:1: ( rule__Escenario__Group__8__Impl rule__Escenario__Group__9 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1804:2: rule__Escenario__Group__8__Impl rule__Escenario__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group__8__Impl_in_rule__Escenario__Group__83612);
            rule__Escenario__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group__9_in_rule__Escenario__Group__83615);
            rule__Escenario__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escenario__Group__8"


    // $ANTLR start "rule__Escenario__Group__8__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1811:1: rule__Escenario__Group__8__Impl : ( ( rule__Escenario__MedidaAssignment_8 ) ) ;
    public final void rule__Escenario__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1815:1: ( ( ( rule__Escenario__MedidaAssignment_8 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1816:1: ( ( rule__Escenario__MedidaAssignment_8 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1816:1: ( ( rule__Escenario__MedidaAssignment_8 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1817:1: ( rule__Escenario__MedidaAssignment_8 )
            {
             before(grammarAccess.getEscenarioAccess().getMedidaAssignment_8()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1818:1: ( rule__Escenario__MedidaAssignment_8 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1818:2: rule__Escenario__MedidaAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escenario__MedidaAssignment_8_in_rule__Escenario__Group__8__Impl3642);
            rule__Escenario__MedidaAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getEscenarioAccess().getMedidaAssignment_8()); 

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
    // $ANTLR end "rule__Escenario__Group__8__Impl"


    // $ANTLR start "rule__Escenario__Group__9"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1828:1: rule__Escenario__Group__9 : rule__Escenario__Group__9__Impl ;
    public final void rule__Escenario__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1832:1: ( rule__Escenario__Group__9__Impl )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1833:2: rule__Escenario__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group__9__Impl_in_rule__Escenario__Group__93672);
            rule__Escenario__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escenario__Group__9"


    // $ANTLR start "rule__Escenario__Group__9__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1839:1: rule__Escenario__Group__9__Impl : ( '}' ) ;
    public final void rule__Escenario__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1843:1: ( ( '}' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1844:1: ( '}' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1844:1: ( '}' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1845:1: '}'
            {
             before(grammarAccess.getEscenarioAccess().getRightCurlyBracketKeyword_9()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Escenario__Group__9__Impl3700); 
             after(grammarAccess.getEscenarioAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Escenario__Group__9__Impl"


    // $ANTLR start "rule__Escenario__Group_2__0"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1878:1: rule__Escenario__Group_2__0 : rule__Escenario__Group_2__0__Impl rule__Escenario__Group_2__1 ;
    public final void rule__Escenario__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1882:1: ( rule__Escenario__Group_2__0__Impl rule__Escenario__Group_2__1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1883:2: rule__Escenario__Group_2__0__Impl rule__Escenario__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group_2__0__Impl_in_rule__Escenario__Group_2__03751);
            rule__Escenario__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group_2__1_in_rule__Escenario__Group_2__03754);
            rule__Escenario__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escenario__Group_2__0"


    // $ANTLR start "rule__Escenario__Group_2__0__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1890:1: rule__Escenario__Group_2__0__Impl : ( 'id' ) ;
    public final void rule__Escenario__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1894:1: ( ( 'id' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1895:1: ( 'id' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1895:1: ( 'id' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1896:1: 'id'
            {
             before(grammarAccess.getEscenarioAccess().getIdKeyword_2_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Escenario__Group_2__0__Impl3782); 
             after(grammarAccess.getEscenarioAccess().getIdKeyword_2_0()); 

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
    // $ANTLR end "rule__Escenario__Group_2__0__Impl"


    // $ANTLR start "rule__Escenario__Group_2__1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1909:1: rule__Escenario__Group_2__1 : rule__Escenario__Group_2__1__Impl ;
    public final void rule__Escenario__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1913:1: ( rule__Escenario__Group_2__1__Impl )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1914:2: rule__Escenario__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escenario__Group_2__1__Impl_in_rule__Escenario__Group_2__13813);
            rule__Escenario__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escenario__Group_2__1"


    // $ANTLR start "rule__Escenario__Group_2__1__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1920:1: rule__Escenario__Group_2__1__Impl : ( ( rule__Escenario__IdAssignment_2_1 ) ) ;
    public final void rule__Escenario__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1924:1: ( ( ( rule__Escenario__IdAssignment_2_1 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1925:1: ( ( rule__Escenario__IdAssignment_2_1 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1925:1: ( ( rule__Escenario__IdAssignment_2_1 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1926:1: ( rule__Escenario__IdAssignment_2_1 )
            {
             before(grammarAccess.getEscenarioAccess().getIdAssignment_2_1()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1927:1: ( rule__Escenario__IdAssignment_2_1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1927:2: rule__Escenario__IdAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Escenario__IdAssignment_2_1_in_rule__Escenario__Group_2__1__Impl3840);
            rule__Escenario__IdAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEscenarioAccess().getIdAssignment_2_1()); 

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
    // $ANTLR end "rule__Escenario__Group_2__1__Impl"


    // $ANTLR start "rule__Artefacto__Group__0"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1941:1: rule__Artefacto__Group__0 : rule__Artefacto__Group__0__Impl rule__Artefacto__Group__1 ;
    public final void rule__Artefacto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1945:1: ( rule__Artefacto__Group__0__Impl rule__Artefacto__Group__1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1946:2: rule__Artefacto__Group__0__Impl rule__Artefacto__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artefacto__Group__0__Impl_in_rule__Artefacto__Group__03874);
            rule__Artefacto__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artefacto__Group__1_in_rule__Artefacto__Group__03877);
            rule__Artefacto__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artefacto__Group__0"


    // $ANTLR start "rule__Artefacto__Group__0__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1953:1: rule__Artefacto__Group__0__Impl : ( () ) ;
    public final void rule__Artefacto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1957:1: ( ( () ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1958:1: ( () )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1958:1: ( () )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1959:1: ()
            {
             before(grammarAccess.getArtefactoAccess().getArtefactoAction_0()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1960:1: ()
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1962:1: 
            {
            }

             after(grammarAccess.getArtefactoAccess().getArtefactoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artefacto__Group__0__Impl"


    // $ANTLR start "rule__Artefacto__Group__1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1972:1: rule__Artefacto__Group__1 : rule__Artefacto__Group__1__Impl rule__Artefacto__Group__2 ;
    public final void rule__Artefacto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1976:1: ( rule__Artefacto__Group__1__Impl rule__Artefacto__Group__2 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1977:2: rule__Artefacto__Group__1__Impl rule__Artefacto__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artefacto__Group__1__Impl_in_rule__Artefacto__Group__13935);
            rule__Artefacto__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artefacto__Group__2_in_rule__Artefacto__Group__13938);
            rule__Artefacto__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artefacto__Group__1"


    // $ANTLR start "rule__Artefacto__Group__1__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1984:1: rule__Artefacto__Group__1__Impl : ( 'Artefacto' ) ;
    public final void rule__Artefacto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1988:1: ( ( 'Artefacto' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1989:1: ( 'Artefacto' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1989:1: ( 'Artefacto' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:1990:1: 'Artefacto'
            {
             before(grammarAccess.getArtefactoAccess().getArtefactoKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Artefacto__Group__1__Impl3966); 
             after(grammarAccess.getArtefactoAccess().getArtefactoKeyword_1()); 

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
    // $ANTLR end "rule__Artefacto__Group__1__Impl"


    // $ANTLR start "rule__Artefacto__Group__2"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2003:1: rule__Artefacto__Group__2 : rule__Artefacto__Group__2__Impl rule__Artefacto__Group__3 ;
    public final void rule__Artefacto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2007:1: ( rule__Artefacto__Group__2__Impl rule__Artefacto__Group__3 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2008:2: rule__Artefacto__Group__2__Impl rule__Artefacto__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artefacto__Group__2__Impl_in_rule__Artefacto__Group__23997);
            rule__Artefacto__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artefacto__Group__3_in_rule__Artefacto__Group__24000);
            rule__Artefacto__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artefacto__Group__2"


    // $ANTLR start "rule__Artefacto__Group__2__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2015:1: rule__Artefacto__Group__2__Impl : ( '{' ) ;
    public final void rule__Artefacto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2019:1: ( ( '{' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2020:1: ( '{' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2020:1: ( '{' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2021:1: '{'
            {
             before(grammarAccess.getArtefactoAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Artefacto__Group__2__Impl4028); 
             after(grammarAccess.getArtefactoAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Artefacto__Group__2__Impl"


    // $ANTLR start "rule__Artefacto__Group__3"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2034:1: rule__Artefacto__Group__3 : rule__Artefacto__Group__3__Impl rule__Artefacto__Group__4 ;
    public final void rule__Artefacto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2038:1: ( rule__Artefacto__Group__3__Impl rule__Artefacto__Group__4 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2039:2: rule__Artefacto__Group__3__Impl rule__Artefacto__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artefacto__Group__3__Impl_in_rule__Artefacto__Group__34059);
            rule__Artefacto__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artefacto__Group__4_in_rule__Artefacto__Group__34062);
            rule__Artefacto__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artefacto__Group__3"


    // $ANTLR start "rule__Artefacto__Group__3__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2046:1: rule__Artefacto__Group__3__Impl : ( ( rule__Artefacto__Group_3__0 )? ) ;
    public final void rule__Artefacto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2050:1: ( ( ( rule__Artefacto__Group_3__0 )? ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2051:1: ( ( rule__Artefacto__Group_3__0 )? )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2051:1: ( ( rule__Artefacto__Group_3__0 )? )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2052:1: ( rule__Artefacto__Group_3__0 )?
            {
             before(grammarAccess.getArtefactoAccess().getGroup_3()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2053:1: ( rule__Artefacto__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==38) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2053:2: rule__Artefacto__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Artefacto__Group_3__0_in_rule__Artefacto__Group__3__Impl4089);
                    rule__Artefacto__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArtefactoAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Artefacto__Group__3__Impl"


    // $ANTLR start "rule__Artefacto__Group__4"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2063:1: rule__Artefacto__Group__4 : rule__Artefacto__Group__4__Impl ;
    public final void rule__Artefacto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2067:1: ( rule__Artefacto__Group__4__Impl )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2068:2: rule__Artefacto__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artefacto__Group__4__Impl_in_rule__Artefacto__Group__44120);
            rule__Artefacto__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artefacto__Group__4"


    // $ANTLR start "rule__Artefacto__Group__4__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2074:1: rule__Artefacto__Group__4__Impl : ( '}' ) ;
    public final void rule__Artefacto__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2078:1: ( ( '}' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2079:1: ( '}' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2079:1: ( '}' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2080:1: '}'
            {
             before(grammarAccess.getArtefactoAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Artefacto__Group__4__Impl4148); 
             after(grammarAccess.getArtefactoAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Artefacto__Group__4__Impl"


    // $ANTLR start "rule__Artefacto__Group_3__0"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2103:1: rule__Artefacto__Group_3__0 : rule__Artefacto__Group_3__0__Impl rule__Artefacto__Group_3__1 ;
    public final void rule__Artefacto__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2107:1: ( rule__Artefacto__Group_3__0__Impl rule__Artefacto__Group_3__1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2108:2: rule__Artefacto__Group_3__0__Impl rule__Artefacto__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artefacto__Group_3__0__Impl_in_rule__Artefacto__Group_3__04189);
            rule__Artefacto__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artefacto__Group_3__1_in_rule__Artefacto__Group_3__04192);
            rule__Artefacto__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artefacto__Group_3__0"


    // $ANTLR start "rule__Artefacto__Group_3__0__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2115:1: rule__Artefacto__Group_3__0__Impl : ( 'url' ) ;
    public final void rule__Artefacto__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2119:1: ( ( 'url' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2120:1: ( 'url' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2120:1: ( 'url' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2121:1: 'url'
            {
             before(grammarAccess.getArtefactoAccess().getUrlKeyword_3_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Artefacto__Group_3__0__Impl4220); 
             after(grammarAccess.getArtefactoAccess().getUrlKeyword_3_0()); 

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
    // $ANTLR end "rule__Artefacto__Group_3__0__Impl"


    // $ANTLR start "rule__Artefacto__Group_3__1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2134:1: rule__Artefacto__Group_3__1 : rule__Artefacto__Group_3__1__Impl ;
    public final void rule__Artefacto__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2138:1: ( rule__Artefacto__Group_3__1__Impl )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2139:2: rule__Artefacto__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artefacto__Group_3__1__Impl_in_rule__Artefacto__Group_3__14251);
            rule__Artefacto__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artefacto__Group_3__1"


    // $ANTLR start "rule__Artefacto__Group_3__1__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2145:1: rule__Artefacto__Group_3__1__Impl : ( ( rule__Artefacto__UrlAssignment_3_1 ) ) ;
    public final void rule__Artefacto__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2149:1: ( ( ( rule__Artefacto__UrlAssignment_3_1 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2150:1: ( ( rule__Artefacto__UrlAssignment_3_1 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2150:1: ( ( rule__Artefacto__UrlAssignment_3_1 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2151:1: ( rule__Artefacto__UrlAssignment_3_1 )
            {
             before(grammarAccess.getArtefactoAccess().getUrlAssignment_3_1()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2152:1: ( rule__Artefacto__UrlAssignment_3_1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2152:2: rule__Artefacto__UrlAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artefacto__UrlAssignment_3_1_in_rule__Artefacto__Group_3__1__Impl4278);
            rule__Artefacto__UrlAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getArtefactoAccess().getUrlAssignment_3_1()); 

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
    // $ANTLR end "rule__Artefacto__Group_3__1__Impl"


    // $ANTLR start "rule__Fuente__Group__0"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2166:1: rule__Fuente__Group__0 : rule__Fuente__Group__0__Impl rule__Fuente__Group__1 ;
    public final void rule__Fuente__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2170:1: ( rule__Fuente__Group__0__Impl rule__Fuente__Group__1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2171:2: rule__Fuente__Group__0__Impl rule__Fuente__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuente__Group__0__Impl_in_rule__Fuente__Group__04312);
            rule__Fuente__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fuente__Group__1_in_rule__Fuente__Group__04315);
            rule__Fuente__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuente__Group__0"


    // $ANTLR start "rule__Fuente__Group__0__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2178:1: rule__Fuente__Group__0__Impl : ( () ) ;
    public final void rule__Fuente__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2182:1: ( ( () ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2183:1: ( () )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2183:1: ( () )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2184:1: ()
            {
             before(grammarAccess.getFuenteAccess().getFuenteAction_0()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2185:1: ()
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2187:1: 
            {
            }

             after(grammarAccess.getFuenteAccess().getFuenteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuente__Group__0__Impl"


    // $ANTLR start "rule__Fuente__Group__1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2197:1: rule__Fuente__Group__1 : rule__Fuente__Group__1__Impl rule__Fuente__Group__2 ;
    public final void rule__Fuente__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2201:1: ( rule__Fuente__Group__1__Impl rule__Fuente__Group__2 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2202:2: rule__Fuente__Group__1__Impl rule__Fuente__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuente__Group__1__Impl_in_rule__Fuente__Group__14373);
            rule__Fuente__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fuente__Group__2_in_rule__Fuente__Group__14376);
            rule__Fuente__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuente__Group__1"


    // $ANTLR start "rule__Fuente__Group__1__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2209:1: rule__Fuente__Group__1__Impl : ( 'Fuente' ) ;
    public final void rule__Fuente__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2213:1: ( ( 'Fuente' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2214:1: ( 'Fuente' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2214:1: ( 'Fuente' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2215:1: 'Fuente'
            {
             before(grammarAccess.getFuenteAccess().getFuenteKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Fuente__Group__1__Impl4404); 
             after(grammarAccess.getFuenteAccess().getFuenteKeyword_1()); 

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
    // $ANTLR end "rule__Fuente__Group__1__Impl"


    // $ANTLR start "rule__Fuente__Group__2"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2228:1: rule__Fuente__Group__2 : rule__Fuente__Group__2__Impl ;
    public final void rule__Fuente__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2232:1: ( rule__Fuente__Group__2__Impl )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2233:2: rule__Fuente__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuente__Group__2__Impl_in_rule__Fuente__Group__24435);
            rule__Fuente__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuente__Group__2"


    // $ANTLR start "rule__Fuente__Group__2__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2239:1: rule__Fuente__Group__2__Impl : ( ( rule__Fuente__NameAssignment_2 ) ) ;
    public final void rule__Fuente__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2243:1: ( ( ( rule__Fuente__NameAssignment_2 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2244:1: ( ( rule__Fuente__NameAssignment_2 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2244:1: ( ( rule__Fuente__NameAssignment_2 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2245:1: ( rule__Fuente__NameAssignment_2 )
            {
             before(grammarAccess.getFuenteAccess().getNameAssignment_2()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2246:1: ( rule__Fuente__NameAssignment_2 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2246:2: rule__Fuente__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuente__NameAssignment_2_in_rule__Fuente__Group__2__Impl4462);
            rule__Fuente__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFuenteAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Fuente__Group__2__Impl"


    // $ANTLR start "rule__Estimulo__Group__0"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2262:1: rule__Estimulo__Group__0 : rule__Estimulo__Group__0__Impl rule__Estimulo__Group__1 ;
    public final void rule__Estimulo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2266:1: ( rule__Estimulo__Group__0__Impl rule__Estimulo__Group__1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2267:2: rule__Estimulo__Group__0__Impl rule__Estimulo__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Estimulo__Group__0__Impl_in_rule__Estimulo__Group__04498);
            rule__Estimulo__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Estimulo__Group__1_in_rule__Estimulo__Group__04501);
            rule__Estimulo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estimulo__Group__0"


    // $ANTLR start "rule__Estimulo__Group__0__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2274:1: rule__Estimulo__Group__0__Impl : ( 'Estimulo' ) ;
    public final void rule__Estimulo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2278:1: ( ( 'Estimulo' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2279:1: ( 'Estimulo' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2279:1: ( 'Estimulo' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2280:1: 'Estimulo'
            {
             before(grammarAccess.getEstimuloAccess().getEstimuloKeyword_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Estimulo__Group__0__Impl4529); 
             after(grammarAccess.getEstimuloAccess().getEstimuloKeyword_0()); 

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
    // $ANTLR end "rule__Estimulo__Group__0__Impl"


    // $ANTLR start "rule__Estimulo__Group__1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2293:1: rule__Estimulo__Group__1 : rule__Estimulo__Group__1__Impl rule__Estimulo__Group__2 ;
    public final void rule__Estimulo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2297:1: ( rule__Estimulo__Group__1__Impl rule__Estimulo__Group__2 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2298:2: rule__Estimulo__Group__1__Impl rule__Estimulo__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Estimulo__Group__1__Impl_in_rule__Estimulo__Group__14560);
            rule__Estimulo__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Estimulo__Group__2_in_rule__Estimulo__Group__14563);
            rule__Estimulo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estimulo__Group__1"


    // $ANTLR start "rule__Estimulo__Group__1__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2305:1: rule__Estimulo__Group__1__Impl : ( '{' ) ;
    public final void rule__Estimulo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2309:1: ( ( '{' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2310:1: ( '{' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2310:1: ( '{' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2311:1: '{'
            {
             before(grammarAccess.getEstimuloAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Estimulo__Group__1__Impl4591); 
             after(grammarAccess.getEstimuloAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Estimulo__Group__1__Impl"


    // $ANTLR start "rule__Estimulo__Group__2"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2324:1: rule__Estimulo__Group__2 : rule__Estimulo__Group__2__Impl rule__Estimulo__Group__3 ;
    public final void rule__Estimulo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2328:1: ( rule__Estimulo__Group__2__Impl rule__Estimulo__Group__3 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2329:2: rule__Estimulo__Group__2__Impl rule__Estimulo__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Estimulo__Group__2__Impl_in_rule__Estimulo__Group__24622);
            rule__Estimulo__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Estimulo__Group__3_in_rule__Estimulo__Group__24625);
            rule__Estimulo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estimulo__Group__2"


    // $ANTLR start "rule__Estimulo__Group__2__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2336:1: rule__Estimulo__Group__2__Impl : ( 'artefacto' ) ;
    public final void rule__Estimulo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2340:1: ( ( 'artefacto' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2341:1: ( 'artefacto' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2341:1: ( 'artefacto' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2342:1: 'artefacto'
            {
             before(grammarAccess.getEstimuloAccess().getArtefactoKeyword_2()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Estimulo__Group__2__Impl4653); 
             after(grammarAccess.getEstimuloAccess().getArtefactoKeyword_2()); 

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
    // $ANTLR end "rule__Estimulo__Group__2__Impl"


    // $ANTLR start "rule__Estimulo__Group__3"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2355:1: rule__Estimulo__Group__3 : rule__Estimulo__Group__3__Impl rule__Estimulo__Group__4 ;
    public final void rule__Estimulo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2359:1: ( rule__Estimulo__Group__3__Impl rule__Estimulo__Group__4 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2360:2: rule__Estimulo__Group__3__Impl rule__Estimulo__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Estimulo__Group__3__Impl_in_rule__Estimulo__Group__34684);
            rule__Estimulo__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Estimulo__Group__4_in_rule__Estimulo__Group__34687);
            rule__Estimulo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estimulo__Group__3"


    // $ANTLR start "rule__Estimulo__Group__3__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2367:1: rule__Estimulo__Group__3__Impl : ( ( rule__Estimulo__ArtefactoAssignment_3 ) ) ;
    public final void rule__Estimulo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2371:1: ( ( ( rule__Estimulo__ArtefactoAssignment_3 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2372:1: ( ( rule__Estimulo__ArtefactoAssignment_3 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2372:1: ( ( rule__Estimulo__ArtefactoAssignment_3 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2373:1: ( rule__Estimulo__ArtefactoAssignment_3 )
            {
             before(grammarAccess.getEstimuloAccess().getArtefactoAssignment_3()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2374:1: ( rule__Estimulo__ArtefactoAssignment_3 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2374:2: rule__Estimulo__ArtefactoAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Estimulo__ArtefactoAssignment_3_in_rule__Estimulo__Group__3__Impl4714);
            rule__Estimulo__ArtefactoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEstimuloAccess().getArtefactoAssignment_3()); 

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
    // $ANTLR end "rule__Estimulo__Group__3__Impl"


    // $ANTLR start "rule__Estimulo__Group__4"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2384:1: rule__Estimulo__Group__4 : rule__Estimulo__Group__4__Impl ;
    public final void rule__Estimulo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2388:1: ( rule__Estimulo__Group__4__Impl )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2389:2: rule__Estimulo__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Estimulo__Group__4__Impl_in_rule__Estimulo__Group__44744);
            rule__Estimulo__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estimulo__Group__4"


    // $ANTLR start "rule__Estimulo__Group__4__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2395:1: rule__Estimulo__Group__4__Impl : ( '}' ) ;
    public final void rule__Estimulo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2399:1: ( ( '}' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2400:1: ( '}' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2400:1: ( '}' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2401:1: '}'
            {
             before(grammarAccess.getEstimuloAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Estimulo__Group__4__Impl4772); 
             after(grammarAccess.getEstimuloAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Estimulo__Group__4__Impl"


    // $ANTLR start "rule__MedidaRespuesta__Group__0"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2424:1: rule__MedidaRespuesta__Group__0 : rule__MedidaRespuesta__Group__0__Impl rule__MedidaRespuesta__Group__1 ;
    public final void rule__MedidaRespuesta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2428:1: ( rule__MedidaRespuesta__Group__0__Impl rule__MedidaRespuesta__Group__1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2429:2: rule__MedidaRespuesta__Group__0__Impl rule__MedidaRespuesta__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group__0__Impl_in_rule__MedidaRespuesta__Group__04813);
            rule__MedidaRespuesta__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group__1_in_rule__MedidaRespuesta__Group__04816);
            rule__MedidaRespuesta__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MedidaRespuesta__Group__0"


    // $ANTLR start "rule__MedidaRespuesta__Group__0__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2436:1: rule__MedidaRespuesta__Group__0__Impl : ( () ) ;
    public final void rule__MedidaRespuesta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2440:1: ( ( () ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2441:1: ( () )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2441:1: ( () )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2442:1: ()
            {
             before(grammarAccess.getMedidaRespuestaAccess().getMedidaRespuestaAction_0()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2443:1: ()
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2445:1: 
            {
            }

             after(grammarAccess.getMedidaRespuestaAccess().getMedidaRespuestaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MedidaRespuesta__Group__0__Impl"


    // $ANTLR start "rule__MedidaRespuesta__Group__1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2455:1: rule__MedidaRespuesta__Group__1 : rule__MedidaRespuesta__Group__1__Impl rule__MedidaRespuesta__Group__2 ;
    public final void rule__MedidaRespuesta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2459:1: ( rule__MedidaRespuesta__Group__1__Impl rule__MedidaRespuesta__Group__2 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2460:2: rule__MedidaRespuesta__Group__1__Impl rule__MedidaRespuesta__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group__1__Impl_in_rule__MedidaRespuesta__Group__14874);
            rule__MedidaRespuesta__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group__2_in_rule__MedidaRespuesta__Group__14877);
            rule__MedidaRespuesta__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MedidaRespuesta__Group__1"


    // $ANTLR start "rule__MedidaRespuesta__Group__1__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2467:1: rule__MedidaRespuesta__Group__1__Impl : ( 'MedidaRespuesta' ) ;
    public final void rule__MedidaRespuesta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2471:1: ( ( 'MedidaRespuesta' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2472:1: ( 'MedidaRespuesta' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2472:1: ( 'MedidaRespuesta' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2473:1: 'MedidaRespuesta'
            {
             before(grammarAccess.getMedidaRespuestaAccess().getMedidaRespuestaKeyword_1()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__MedidaRespuesta__Group__1__Impl4905); 
             after(grammarAccess.getMedidaRespuestaAccess().getMedidaRespuestaKeyword_1()); 

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
    // $ANTLR end "rule__MedidaRespuesta__Group__1__Impl"


    // $ANTLR start "rule__MedidaRespuesta__Group__2"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2486:1: rule__MedidaRespuesta__Group__2 : rule__MedidaRespuesta__Group__2__Impl rule__MedidaRespuesta__Group__3 ;
    public final void rule__MedidaRespuesta__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2490:1: ( rule__MedidaRespuesta__Group__2__Impl rule__MedidaRespuesta__Group__3 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2491:2: rule__MedidaRespuesta__Group__2__Impl rule__MedidaRespuesta__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group__2__Impl_in_rule__MedidaRespuesta__Group__24936);
            rule__MedidaRespuesta__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group__3_in_rule__MedidaRespuesta__Group__24939);
            rule__MedidaRespuesta__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MedidaRespuesta__Group__2"


    // $ANTLR start "rule__MedidaRespuesta__Group__2__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2498:1: rule__MedidaRespuesta__Group__2__Impl : ( '{' ) ;
    public final void rule__MedidaRespuesta__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2502:1: ( ( '{' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2503:1: ( '{' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2503:1: ( '{' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2504:1: '{'
            {
             before(grammarAccess.getMedidaRespuestaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MedidaRespuesta__Group__2__Impl4967); 
             after(grammarAccess.getMedidaRespuestaAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__MedidaRespuesta__Group__2__Impl"


    // $ANTLR start "rule__MedidaRespuesta__Group__3"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2517:1: rule__MedidaRespuesta__Group__3 : rule__MedidaRespuesta__Group__3__Impl rule__MedidaRespuesta__Group__4 ;
    public final void rule__MedidaRespuesta__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2521:1: ( rule__MedidaRespuesta__Group__3__Impl rule__MedidaRespuesta__Group__4 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2522:2: rule__MedidaRespuesta__Group__3__Impl rule__MedidaRespuesta__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group__3__Impl_in_rule__MedidaRespuesta__Group__34998);
            rule__MedidaRespuesta__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group__4_in_rule__MedidaRespuesta__Group__35001);
            rule__MedidaRespuesta__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MedidaRespuesta__Group__3"


    // $ANTLR start "rule__MedidaRespuesta__Group__3__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2529:1: rule__MedidaRespuesta__Group__3__Impl : ( ( rule__MedidaRespuesta__Group_3__0 )? ) ;
    public final void rule__MedidaRespuesta__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2533:1: ( ( ( rule__MedidaRespuesta__Group_3__0 )? ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2534:1: ( ( rule__MedidaRespuesta__Group_3__0 )? )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2534:1: ( ( rule__MedidaRespuesta__Group_3__0 )? )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2535:1: ( rule__MedidaRespuesta__Group_3__0 )?
            {
             before(grammarAccess.getMedidaRespuestaAccess().getGroup_3()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2536:1: ( rule__MedidaRespuesta__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2536:2: rule__MedidaRespuesta__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group_3__0_in_rule__MedidaRespuesta__Group__3__Impl5028);
                    rule__MedidaRespuesta__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMedidaRespuestaAccess().getGroup_3()); 

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
    // $ANTLR end "rule__MedidaRespuesta__Group__3__Impl"


    // $ANTLR start "rule__MedidaRespuesta__Group__4"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2546:1: rule__MedidaRespuesta__Group__4 : rule__MedidaRespuesta__Group__4__Impl rule__MedidaRespuesta__Group__5 ;
    public final void rule__MedidaRespuesta__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2550:1: ( rule__MedidaRespuesta__Group__4__Impl rule__MedidaRespuesta__Group__5 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2551:2: rule__MedidaRespuesta__Group__4__Impl rule__MedidaRespuesta__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group__4__Impl_in_rule__MedidaRespuesta__Group__45059);
            rule__MedidaRespuesta__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group__5_in_rule__MedidaRespuesta__Group__45062);
            rule__MedidaRespuesta__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MedidaRespuesta__Group__4"


    // $ANTLR start "rule__MedidaRespuesta__Group__4__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2558:1: rule__MedidaRespuesta__Group__4__Impl : ( ( rule__MedidaRespuesta__Group_4__0 )? ) ;
    public final void rule__MedidaRespuesta__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2562:1: ( ( ( rule__MedidaRespuesta__Group_4__0 )? ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2563:1: ( ( rule__MedidaRespuesta__Group_4__0 )? )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2563:1: ( ( rule__MedidaRespuesta__Group_4__0 )? )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2564:1: ( rule__MedidaRespuesta__Group_4__0 )?
            {
             before(grammarAccess.getMedidaRespuestaAccess().getGroup_4()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2565:1: ( rule__MedidaRespuesta__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==44) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2565:2: rule__MedidaRespuesta__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group_4__0_in_rule__MedidaRespuesta__Group__4__Impl5089);
                    rule__MedidaRespuesta__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMedidaRespuestaAccess().getGroup_4()); 

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
    // $ANTLR end "rule__MedidaRespuesta__Group__4__Impl"


    // $ANTLR start "rule__MedidaRespuesta__Group__5"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2575:1: rule__MedidaRespuesta__Group__5 : rule__MedidaRespuesta__Group__5__Impl rule__MedidaRespuesta__Group__6 ;
    public final void rule__MedidaRespuesta__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2579:1: ( rule__MedidaRespuesta__Group__5__Impl rule__MedidaRespuesta__Group__6 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2580:2: rule__MedidaRespuesta__Group__5__Impl rule__MedidaRespuesta__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group__5__Impl_in_rule__MedidaRespuesta__Group__55120);
            rule__MedidaRespuesta__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group__6_in_rule__MedidaRespuesta__Group__55123);
            rule__MedidaRespuesta__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MedidaRespuesta__Group__5"


    // $ANTLR start "rule__MedidaRespuesta__Group__5__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2587:1: rule__MedidaRespuesta__Group__5__Impl : ( ( rule__MedidaRespuesta__Group_5__0 )? ) ;
    public final void rule__MedidaRespuesta__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2591:1: ( ( ( rule__MedidaRespuesta__Group_5__0 )? ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2592:1: ( ( rule__MedidaRespuesta__Group_5__0 )? )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2592:1: ( ( rule__MedidaRespuesta__Group_5__0 )? )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2593:1: ( rule__MedidaRespuesta__Group_5__0 )?
            {
             before(grammarAccess.getMedidaRespuestaAccess().getGroup_5()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2594:1: ( rule__MedidaRespuesta__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==45) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2594:2: rule__MedidaRespuesta__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group_5__0_in_rule__MedidaRespuesta__Group__5__Impl5150);
                    rule__MedidaRespuesta__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMedidaRespuestaAccess().getGroup_5()); 

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
    // $ANTLR end "rule__MedidaRespuesta__Group__5__Impl"


    // $ANTLR start "rule__MedidaRespuesta__Group__6"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2604:1: rule__MedidaRespuesta__Group__6 : rule__MedidaRespuesta__Group__6__Impl rule__MedidaRespuesta__Group__7 ;
    public final void rule__MedidaRespuesta__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2608:1: ( rule__MedidaRespuesta__Group__6__Impl rule__MedidaRespuesta__Group__7 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2609:2: rule__MedidaRespuesta__Group__6__Impl rule__MedidaRespuesta__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group__6__Impl_in_rule__MedidaRespuesta__Group__65181);
            rule__MedidaRespuesta__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group__7_in_rule__MedidaRespuesta__Group__65184);
            rule__MedidaRespuesta__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MedidaRespuesta__Group__6"


    // $ANTLR start "rule__MedidaRespuesta__Group__6__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2616:1: rule__MedidaRespuesta__Group__6__Impl : ( ( rule__MedidaRespuesta__Group_6__0 )? ) ;
    public final void rule__MedidaRespuesta__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2620:1: ( ( ( rule__MedidaRespuesta__Group_6__0 )? ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2621:1: ( ( rule__MedidaRespuesta__Group_6__0 )? )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2621:1: ( ( rule__MedidaRespuesta__Group_6__0 )? )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2622:1: ( rule__MedidaRespuesta__Group_6__0 )?
            {
             before(grammarAccess.getMedidaRespuestaAccess().getGroup_6()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2623:1: ( rule__MedidaRespuesta__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==46) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2623:2: rule__MedidaRespuesta__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group_6__0_in_rule__MedidaRespuesta__Group__6__Impl5211);
                    rule__MedidaRespuesta__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMedidaRespuestaAccess().getGroup_6()); 

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
    // $ANTLR end "rule__MedidaRespuesta__Group__6__Impl"


    // $ANTLR start "rule__MedidaRespuesta__Group__7"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2633:1: rule__MedidaRespuesta__Group__7 : rule__MedidaRespuesta__Group__7__Impl ;
    public final void rule__MedidaRespuesta__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2637:1: ( rule__MedidaRespuesta__Group__7__Impl )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2638:2: rule__MedidaRespuesta__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group__7__Impl_in_rule__MedidaRespuesta__Group__75242);
            rule__MedidaRespuesta__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MedidaRespuesta__Group__7"


    // $ANTLR start "rule__MedidaRespuesta__Group__7__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2644:1: rule__MedidaRespuesta__Group__7__Impl : ( '}' ) ;
    public final void rule__MedidaRespuesta__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2648:1: ( ( '}' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2649:1: ( '}' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2649:1: ( '}' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2650:1: '}'
            {
             before(grammarAccess.getMedidaRespuestaAccess().getRightCurlyBracketKeyword_7()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MedidaRespuesta__Group__7__Impl5270); 
             after(grammarAccess.getMedidaRespuestaAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__MedidaRespuesta__Group__7__Impl"


    // $ANTLR start "rule__MedidaRespuesta__Group_3__0"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2679:1: rule__MedidaRespuesta__Group_3__0 : rule__MedidaRespuesta__Group_3__0__Impl rule__MedidaRespuesta__Group_3__1 ;
    public final void rule__MedidaRespuesta__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2683:1: ( rule__MedidaRespuesta__Group_3__0__Impl rule__MedidaRespuesta__Group_3__1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2684:2: rule__MedidaRespuesta__Group_3__0__Impl rule__MedidaRespuesta__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group_3__0__Impl_in_rule__MedidaRespuesta__Group_3__05317);
            rule__MedidaRespuesta__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group_3__1_in_rule__MedidaRespuesta__Group_3__05320);
            rule__MedidaRespuesta__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MedidaRespuesta__Group_3__0"


    // $ANTLR start "rule__MedidaRespuesta__Group_3__0__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2691:1: rule__MedidaRespuesta__Group_3__0__Impl : ( 'metrica' ) ;
    public final void rule__MedidaRespuesta__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2695:1: ( ( 'metrica' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2696:1: ( 'metrica' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2696:1: ( 'metrica' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2697:1: 'metrica'
            {
             before(grammarAccess.getMedidaRespuestaAccess().getMetricaKeyword_3_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__MedidaRespuesta__Group_3__0__Impl5348); 
             after(grammarAccess.getMedidaRespuestaAccess().getMetricaKeyword_3_0()); 

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
    // $ANTLR end "rule__MedidaRespuesta__Group_3__0__Impl"


    // $ANTLR start "rule__MedidaRespuesta__Group_3__1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2710:1: rule__MedidaRespuesta__Group_3__1 : rule__MedidaRespuesta__Group_3__1__Impl ;
    public final void rule__MedidaRespuesta__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2714:1: ( rule__MedidaRespuesta__Group_3__1__Impl )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2715:2: rule__MedidaRespuesta__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group_3__1__Impl_in_rule__MedidaRespuesta__Group_3__15379);
            rule__MedidaRespuesta__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MedidaRespuesta__Group_3__1"


    // $ANTLR start "rule__MedidaRespuesta__Group_3__1__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2721:1: rule__MedidaRespuesta__Group_3__1__Impl : ( ( rule__MedidaRespuesta__MetricaAssignment_3_1 ) ) ;
    public final void rule__MedidaRespuesta__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2725:1: ( ( ( rule__MedidaRespuesta__MetricaAssignment_3_1 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2726:1: ( ( rule__MedidaRespuesta__MetricaAssignment_3_1 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2726:1: ( ( rule__MedidaRespuesta__MetricaAssignment_3_1 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2727:1: ( rule__MedidaRespuesta__MetricaAssignment_3_1 )
            {
             before(grammarAccess.getMedidaRespuestaAccess().getMetricaAssignment_3_1()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2728:1: ( rule__MedidaRespuesta__MetricaAssignment_3_1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2728:2: rule__MedidaRespuesta__MetricaAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__MetricaAssignment_3_1_in_rule__MedidaRespuesta__Group_3__1__Impl5406);
            rule__MedidaRespuesta__MetricaAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMedidaRespuestaAccess().getMetricaAssignment_3_1()); 

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
    // $ANTLR end "rule__MedidaRespuesta__Group_3__1__Impl"


    // $ANTLR start "rule__MedidaRespuesta__Group_4__0"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2742:1: rule__MedidaRespuesta__Group_4__0 : rule__MedidaRespuesta__Group_4__0__Impl rule__MedidaRespuesta__Group_4__1 ;
    public final void rule__MedidaRespuesta__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2746:1: ( rule__MedidaRespuesta__Group_4__0__Impl rule__MedidaRespuesta__Group_4__1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2747:2: rule__MedidaRespuesta__Group_4__0__Impl rule__MedidaRespuesta__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group_4__0__Impl_in_rule__MedidaRespuesta__Group_4__05440);
            rule__MedidaRespuesta__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group_4__1_in_rule__MedidaRespuesta__Group_4__05443);
            rule__MedidaRespuesta__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MedidaRespuesta__Group_4__0"


    // $ANTLR start "rule__MedidaRespuesta__Group_4__0__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2754:1: rule__MedidaRespuesta__Group_4__0__Impl : ( 'valorEsperado' ) ;
    public final void rule__MedidaRespuesta__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2758:1: ( ( 'valorEsperado' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2759:1: ( 'valorEsperado' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2759:1: ( 'valorEsperado' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2760:1: 'valorEsperado'
            {
             before(grammarAccess.getMedidaRespuestaAccess().getValorEsperadoKeyword_4_0()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__MedidaRespuesta__Group_4__0__Impl5471); 
             after(grammarAccess.getMedidaRespuestaAccess().getValorEsperadoKeyword_4_0()); 

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
    // $ANTLR end "rule__MedidaRespuesta__Group_4__0__Impl"


    // $ANTLR start "rule__MedidaRespuesta__Group_4__1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2773:1: rule__MedidaRespuesta__Group_4__1 : rule__MedidaRespuesta__Group_4__1__Impl ;
    public final void rule__MedidaRespuesta__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2777:1: ( rule__MedidaRespuesta__Group_4__1__Impl )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2778:2: rule__MedidaRespuesta__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group_4__1__Impl_in_rule__MedidaRespuesta__Group_4__15502);
            rule__MedidaRespuesta__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MedidaRespuesta__Group_4__1"


    // $ANTLR start "rule__MedidaRespuesta__Group_4__1__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2784:1: rule__MedidaRespuesta__Group_4__1__Impl : ( ( rule__MedidaRespuesta__ValorEsperadoAssignment_4_1 ) ) ;
    public final void rule__MedidaRespuesta__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2788:1: ( ( ( rule__MedidaRespuesta__ValorEsperadoAssignment_4_1 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2789:1: ( ( rule__MedidaRespuesta__ValorEsperadoAssignment_4_1 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2789:1: ( ( rule__MedidaRespuesta__ValorEsperadoAssignment_4_1 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2790:1: ( rule__MedidaRespuesta__ValorEsperadoAssignment_4_1 )
            {
             before(grammarAccess.getMedidaRespuestaAccess().getValorEsperadoAssignment_4_1()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2791:1: ( rule__MedidaRespuesta__ValorEsperadoAssignment_4_1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2791:2: rule__MedidaRespuesta__ValorEsperadoAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__ValorEsperadoAssignment_4_1_in_rule__MedidaRespuesta__Group_4__1__Impl5529);
            rule__MedidaRespuesta__ValorEsperadoAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMedidaRespuestaAccess().getValorEsperadoAssignment_4_1()); 

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
    // $ANTLR end "rule__MedidaRespuesta__Group_4__1__Impl"


    // $ANTLR start "rule__MedidaRespuesta__Group_5__0"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2805:1: rule__MedidaRespuesta__Group_5__0 : rule__MedidaRespuesta__Group_5__0__Impl rule__MedidaRespuesta__Group_5__1 ;
    public final void rule__MedidaRespuesta__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2809:1: ( rule__MedidaRespuesta__Group_5__0__Impl rule__MedidaRespuesta__Group_5__1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2810:2: rule__MedidaRespuesta__Group_5__0__Impl rule__MedidaRespuesta__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group_5__0__Impl_in_rule__MedidaRespuesta__Group_5__05563);
            rule__MedidaRespuesta__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group_5__1_in_rule__MedidaRespuesta__Group_5__05566);
            rule__MedidaRespuesta__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MedidaRespuesta__Group_5__0"


    // $ANTLR start "rule__MedidaRespuesta__Group_5__0__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2817:1: rule__MedidaRespuesta__Group_5__0__Impl : ( 'unidad' ) ;
    public final void rule__MedidaRespuesta__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2821:1: ( ( 'unidad' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2822:1: ( 'unidad' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2822:1: ( 'unidad' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2823:1: 'unidad'
            {
             before(grammarAccess.getMedidaRespuestaAccess().getUnidadKeyword_5_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__MedidaRespuesta__Group_5__0__Impl5594); 
             after(grammarAccess.getMedidaRespuestaAccess().getUnidadKeyword_5_0()); 

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
    // $ANTLR end "rule__MedidaRespuesta__Group_5__0__Impl"


    // $ANTLR start "rule__MedidaRespuesta__Group_5__1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2836:1: rule__MedidaRespuesta__Group_5__1 : rule__MedidaRespuesta__Group_5__1__Impl ;
    public final void rule__MedidaRespuesta__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2840:1: ( rule__MedidaRespuesta__Group_5__1__Impl )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2841:2: rule__MedidaRespuesta__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group_5__1__Impl_in_rule__MedidaRespuesta__Group_5__15625);
            rule__MedidaRespuesta__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MedidaRespuesta__Group_5__1"


    // $ANTLR start "rule__MedidaRespuesta__Group_5__1__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2847:1: rule__MedidaRespuesta__Group_5__1__Impl : ( ( rule__MedidaRespuesta__UnidadAssignment_5_1 ) ) ;
    public final void rule__MedidaRespuesta__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2851:1: ( ( ( rule__MedidaRespuesta__UnidadAssignment_5_1 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2852:1: ( ( rule__MedidaRespuesta__UnidadAssignment_5_1 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2852:1: ( ( rule__MedidaRespuesta__UnidadAssignment_5_1 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2853:1: ( rule__MedidaRespuesta__UnidadAssignment_5_1 )
            {
             before(grammarAccess.getMedidaRespuestaAccess().getUnidadAssignment_5_1()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2854:1: ( rule__MedidaRespuesta__UnidadAssignment_5_1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2854:2: rule__MedidaRespuesta__UnidadAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__UnidadAssignment_5_1_in_rule__MedidaRespuesta__Group_5__1__Impl5652);
            rule__MedidaRespuesta__UnidadAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMedidaRespuestaAccess().getUnidadAssignment_5_1()); 

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
    // $ANTLR end "rule__MedidaRespuesta__Group_5__1__Impl"


    // $ANTLR start "rule__MedidaRespuesta__Group_6__0"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2868:1: rule__MedidaRespuesta__Group_6__0 : rule__MedidaRespuesta__Group_6__0__Impl rule__MedidaRespuesta__Group_6__1 ;
    public final void rule__MedidaRespuesta__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2872:1: ( rule__MedidaRespuesta__Group_6__0__Impl rule__MedidaRespuesta__Group_6__1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2873:2: rule__MedidaRespuesta__Group_6__0__Impl rule__MedidaRespuesta__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group_6__0__Impl_in_rule__MedidaRespuesta__Group_6__05686);
            rule__MedidaRespuesta__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group_6__1_in_rule__MedidaRespuesta__Group_6__05689);
            rule__MedidaRespuesta__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MedidaRespuesta__Group_6__0"


    // $ANTLR start "rule__MedidaRespuesta__Group_6__0__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2880:1: rule__MedidaRespuesta__Group_6__0__Impl : ( 'operador' ) ;
    public final void rule__MedidaRespuesta__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2884:1: ( ( 'operador' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2885:1: ( 'operador' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2885:1: ( 'operador' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2886:1: 'operador'
            {
             before(grammarAccess.getMedidaRespuestaAccess().getOperadorKeyword_6_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__MedidaRespuesta__Group_6__0__Impl5717); 
             after(grammarAccess.getMedidaRespuestaAccess().getOperadorKeyword_6_0()); 

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
    // $ANTLR end "rule__MedidaRespuesta__Group_6__0__Impl"


    // $ANTLR start "rule__MedidaRespuesta__Group_6__1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2899:1: rule__MedidaRespuesta__Group_6__1 : rule__MedidaRespuesta__Group_6__1__Impl ;
    public final void rule__MedidaRespuesta__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2903:1: ( rule__MedidaRespuesta__Group_6__1__Impl )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2904:2: rule__MedidaRespuesta__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__Group_6__1__Impl_in_rule__MedidaRespuesta__Group_6__15748);
            rule__MedidaRespuesta__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MedidaRespuesta__Group_6__1"


    // $ANTLR start "rule__MedidaRespuesta__Group_6__1__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2910:1: rule__MedidaRespuesta__Group_6__1__Impl : ( ( rule__MedidaRespuesta__OperadorAssignment_6_1 ) ) ;
    public final void rule__MedidaRespuesta__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2914:1: ( ( ( rule__MedidaRespuesta__OperadorAssignment_6_1 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2915:1: ( ( rule__MedidaRespuesta__OperadorAssignment_6_1 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2915:1: ( ( rule__MedidaRespuesta__OperadorAssignment_6_1 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2916:1: ( rule__MedidaRespuesta__OperadorAssignment_6_1 )
            {
             before(grammarAccess.getMedidaRespuestaAccess().getOperadorAssignment_6_1()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2917:1: ( rule__MedidaRespuesta__OperadorAssignment_6_1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2917:2: rule__MedidaRespuesta__OperadorAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MedidaRespuesta__OperadorAssignment_6_1_in_rule__MedidaRespuesta__Group_6__1__Impl5775);
            rule__MedidaRespuesta__OperadorAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMedidaRespuestaAccess().getOperadorAssignment_6_1()); 

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
    // $ANTLR end "rule__MedidaRespuesta__Group_6__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2931:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2935:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2936:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__05809);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__05812);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2943:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2947:1: ( ( ( '-' )? ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2948:1: ( ( '-' )? )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2948:1: ( ( '-' )? )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2949:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2950:1: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==47) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2951:2: '-'
                    {
                    match(input,47,FollowSets000.FOLLOW_47_in_rule__EDouble__Group__0__Impl5841); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2962:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2966:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2967:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__15874);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__15877);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2974:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2978:1: ( ( ( RULE_INT )? ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2979:1: ( ( RULE_INT )? )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2979:1: ( ( RULE_INT )? )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2980:1: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2981:1: ( RULE_INT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2981:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl5905); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2991:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2995:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:2996:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__25936);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__25939);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3003:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3007:1: ( ( '.' ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3008:1: ( '.' )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3008:1: ( '.' )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3009:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__EDouble__Group__2__Impl5967); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3022:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3026:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3027:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__35998);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__36001);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3034:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3038:1: ( ( RULE_INT ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3039:1: ( RULE_INT )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3039:1: ( RULE_INT )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3040:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl6028); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3051:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3055:1: ( rule__EDouble__Group__4__Impl )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3056:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__46057);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3062:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3066:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3067:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3067:1: ( ( rule__EDouble__Group_4__0 )? )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3068:1: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3069:1: ( rule__EDouble__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=11 && LA20_0<=12)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3069:2: rule__EDouble__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl6084);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3089:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3093:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3094:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__06125);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__06128);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3101:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3105:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3106:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3106:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3107:1: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3108:1: ( rule__EDouble__Alternatives_4_0 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3108:2: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl6155);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3118:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3122:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3123:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__16185);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__16188);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3130:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3134:1: ( ( ( '-' )? ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3135:1: ( ( '-' )? )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3135:1: ( ( '-' )? )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3136:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3137:1: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3138:2: '-'
                    {
                    match(input,47,FollowSets000.FOLLOW_47_in_rule__EDouble__Group_4__1__Impl6217); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

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
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3149:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3153:1: ( rule__EDouble__Group_4__2__Impl )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3154:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__26250);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3160:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3164:1: ( ( RULE_INT ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3165:1: ( RULE_INT )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3165:1: ( RULE_INT )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3166:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl6277); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

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
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__Test__ArquitecturasAssignment_3_2"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3184:1: rule__Test__ArquitecturasAssignment_3_2 : ( ruleArquitectura ) ;
    public final void rule__Test__ArquitecturasAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3188:1: ( ( ruleArquitectura ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3189:1: ( ruleArquitectura )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3189:1: ( ruleArquitectura )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3190:1: ruleArquitectura
            {
             before(grammarAccess.getTestAccess().getArquitecturasArquitecturaParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleArquitectura_in_rule__Test__ArquitecturasAssignment_3_26317);
            ruleArquitectura();

            state._fsp--;

             after(grammarAccess.getTestAccess().getArquitecturasArquitecturaParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Test__ArquitecturasAssignment_3_2"


    // $ANTLR start "rule__Test__ArquitecturasAssignment_3_3_1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3199:1: rule__Test__ArquitecturasAssignment_3_3_1 : ( ruleArquitectura ) ;
    public final void rule__Test__ArquitecturasAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3203:1: ( ( ruleArquitectura ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3204:1: ( ruleArquitectura )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3204:1: ( ruleArquitectura )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3205:1: ruleArquitectura
            {
             before(grammarAccess.getTestAccess().getArquitecturasArquitecturaParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleArquitectura_in_rule__Test__ArquitecturasAssignment_3_3_16348);
            ruleArquitectura();

            state._fsp--;

             after(grammarAccess.getTestAccess().getArquitecturasArquitecturaParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__Test__ArquitecturasAssignment_3_3_1"


    // $ANTLR start "rule__Arquitectura__EscenariosAssignment_3_2"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3214:1: rule__Arquitectura__EscenariosAssignment_3_2 : ( ruleEscenario ) ;
    public final void rule__Arquitectura__EscenariosAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3218:1: ( ( ruleEscenario ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3219:1: ( ruleEscenario )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3219:1: ( ruleEscenario )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3220:1: ruleEscenario
            {
             before(grammarAccess.getArquitecturaAccess().getEscenariosEscenarioParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEscenario_in_rule__Arquitectura__EscenariosAssignment_3_26379);
            ruleEscenario();

            state._fsp--;

             after(grammarAccess.getArquitecturaAccess().getEscenariosEscenarioParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Arquitectura__EscenariosAssignment_3_2"


    // $ANTLR start "rule__Arquitectura__EscenariosAssignment_3_3_1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3229:1: rule__Arquitectura__EscenariosAssignment_3_3_1 : ( ruleEscenario ) ;
    public final void rule__Arquitectura__EscenariosAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3233:1: ( ( ruleEscenario ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3234:1: ( ruleEscenario )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3234:1: ( ruleEscenario )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3235:1: ruleEscenario
            {
             before(grammarAccess.getArquitecturaAccess().getEscenariosEscenarioParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEscenario_in_rule__Arquitectura__EscenariosAssignment_3_3_16410);
            ruleEscenario();

            state._fsp--;

             after(grammarAccess.getArquitecturaAccess().getEscenariosEscenarioParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__Arquitectura__EscenariosAssignment_3_3_1"


    // $ANTLR start "rule__Arquitectura__ArtefactosAssignment_4_2"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3244:1: rule__Arquitectura__ArtefactosAssignment_4_2 : ( ruleArtefacto ) ;
    public final void rule__Arquitectura__ArtefactosAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3248:1: ( ( ruleArtefacto ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3249:1: ( ruleArtefacto )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3249:1: ( ruleArtefacto )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3250:1: ruleArtefacto
            {
             before(grammarAccess.getArquitecturaAccess().getArtefactosArtefactoParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleArtefacto_in_rule__Arquitectura__ArtefactosAssignment_4_26441);
            ruleArtefacto();

            state._fsp--;

             after(grammarAccess.getArquitecturaAccess().getArtefactosArtefactoParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Arquitectura__ArtefactosAssignment_4_2"


    // $ANTLR start "rule__Arquitectura__ArtefactosAssignment_4_3_1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3259:1: rule__Arquitectura__ArtefactosAssignment_4_3_1 : ( ruleArtefacto ) ;
    public final void rule__Arquitectura__ArtefactosAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3263:1: ( ( ruleArtefacto ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3264:1: ( ruleArtefacto )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3264:1: ( ruleArtefacto )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3265:1: ruleArtefacto
            {
             before(grammarAccess.getArquitecturaAccess().getArtefactosArtefactoParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleArtefacto_in_rule__Arquitectura__ArtefactosAssignment_4_3_16472);
            ruleArtefacto();

            state._fsp--;

             after(grammarAccess.getArquitecturaAccess().getArtefactosArtefactoParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Arquitectura__ArtefactosAssignment_4_3_1"


    // $ANTLR start "rule__Escenario__IdAssignment_2_1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3274:1: rule__Escenario__IdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Escenario__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3278:1: ( ( ruleEString ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3279:1: ( ruleEString )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3279:1: ( ruleEString )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3280:1: ruleEString
            {
             before(grammarAccess.getEscenarioAccess().getIdEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Escenario__IdAssignment_2_16503);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEscenarioAccess().getIdEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Escenario__IdAssignment_2_1"


    // $ANTLR start "rule__Escenario__FuenteAssignment_4"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3289:1: rule__Escenario__FuenteAssignment_4 : ( ruleFuente ) ;
    public final void rule__Escenario__FuenteAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3293:1: ( ( ruleFuente ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3294:1: ( ruleFuente )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3294:1: ( ruleFuente )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3295:1: ruleFuente
            {
             before(grammarAccess.getEscenarioAccess().getFuenteFuenteParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuente_in_rule__Escenario__FuenteAssignment_46534);
            ruleFuente();

            state._fsp--;

             after(grammarAccess.getEscenarioAccess().getFuenteFuenteParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Escenario__FuenteAssignment_4"


    // $ANTLR start "rule__Escenario__EstimuloAssignment_6"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3304:1: rule__Escenario__EstimuloAssignment_6 : ( ruleEstimulo ) ;
    public final void rule__Escenario__EstimuloAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3308:1: ( ( ruleEstimulo ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3309:1: ( ruleEstimulo )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3309:1: ( ruleEstimulo )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3310:1: ruleEstimulo
            {
             before(grammarAccess.getEscenarioAccess().getEstimuloEstimuloParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEstimulo_in_rule__Escenario__EstimuloAssignment_66565);
            ruleEstimulo();

            state._fsp--;

             after(grammarAccess.getEscenarioAccess().getEstimuloEstimuloParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Escenario__EstimuloAssignment_6"


    // $ANTLR start "rule__Escenario__MedidaAssignment_8"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3319:1: rule__Escenario__MedidaAssignment_8 : ( ruleMedidaRespuesta ) ;
    public final void rule__Escenario__MedidaAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3323:1: ( ( ruleMedidaRespuesta ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3324:1: ( ruleMedidaRespuesta )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3324:1: ( ruleMedidaRespuesta )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3325:1: ruleMedidaRespuesta
            {
             before(grammarAccess.getEscenarioAccess().getMedidaMedidaRespuestaParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMedidaRespuesta_in_rule__Escenario__MedidaAssignment_86596);
            ruleMedidaRespuesta();

            state._fsp--;

             after(grammarAccess.getEscenarioAccess().getMedidaMedidaRespuestaParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Escenario__MedidaAssignment_8"


    // $ANTLR start "rule__Artefacto__UrlAssignment_3_1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3334:1: rule__Artefacto__UrlAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Artefacto__UrlAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3338:1: ( ( ruleEString ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3339:1: ( ruleEString )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3339:1: ( ruleEString )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3340:1: ruleEString
            {
             before(grammarAccess.getArtefactoAccess().getUrlEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Artefacto__UrlAssignment_3_16627);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArtefactoAccess().getUrlEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Artefacto__UrlAssignment_3_1"


    // $ANTLR start "rule__Fuente__NameAssignment_2"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3349:1: rule__Fuente__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Fuente__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3353:1: ( ( ruleEString ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3354:1: ( ruleEString )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3354:1: ( ruleEString )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3355:1: ruleEString
            {
             before(grammarAccess.getFuenteAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Fuente__NameAssignment_26658);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFuenteAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Fuente__NameAssignment_2"


    // $ANTLR start "rule__Estimulo__ArtefactoAssignment_3"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3364:1: rule__Estimulo__ArtefactoAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Estimulo__ArtefactoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3368:1: ( ( ( ruleEString ) ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3369:1: ( ( ruleEString ) )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3369:1: ( ( ruleEString ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3370:1: ( ruleEString )
            {
             before(grammarAccess.getEstimuloAccess().getArtefactoArtefactoCrossReference_3_0()); 
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3371:1: ( ruleEString )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3372:1: ruleEString
            {
             before(grammarAccess.getEstimuloAccess().getArtefactoArtefactoEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Estimulo__ArtefactoAssignment_36693);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEstimuloAccess().getArtefactoArtefactoEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getEstimuloAccess().getArtefactoArtefactoCrossReference_3_0()); 

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
    // $ANTLR end "rule__Estimulo__ArtefactoAssignment_3"


    // $ANTLR start "rule__MedidaRespuesta__MetricaAssignment_3_1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3383:1: rule__MedidaRespuesta__MetricaAssignment_3_1 : ( ruleMetrica ) ;
    public final void rule__MedidaRespuesta__MetricaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3387:1: ( ( ruleMetrica ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3388:1: ( ruleMetrica )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3388:1: ( ruleMetrica )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3389:1: ruleMetrica
            {
             before(grammarAccess.getMedidaRespuestaAccess().getMetricaMetricaEnumRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMetrica_in_rule__MedidaRespuesta__MetricaAssignment_3_16728);
            ruleMetrica();

            state._fsp--;

             after(grammarAccess.getMedidaRespuestaAccess().getMetricaMetricaEnumRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__MedidaRespuesta__MetricaAssignment_3_1"


    // $ANTLR start "rule__MedidaRespuesta__ValorEsperadoAssignment_4_1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3398:1: rule__MedidaRespuesta__ValorEsperadoAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__MedidaRespuesta__ValorEsperadoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3402:1: ( ( ruleEDouble ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3403:1: ( ruleEDouble )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3403:1: ( ruleEDouble )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3404:1: ruleEDouble
            {
             before(grammarAccess.getMedidaRespuestaAccess().getValorEsperadoEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__MedidaRespuesta__ValorEsperadoAssignment_4_16759);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getMedidaRespuestaAccess().getValorEsperadoEDoubleParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__MedidaRespuesta__ValorEsperadoAssignment_4_1"


    // $ANTLR start "rule__MedidaRespuesta__UnidadAssignment_5_1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3413:1: rule__MedidaRespuesta__UnidadAssignment_5_1 : ( ruleUnidad ) ;
    public final void rule__MedidaRespuesta__UnidadAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3417:1: ( ( ruleUnidad ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3418:1: ( ruleUnidad )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3418:1: ( ruleUnidad )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3419:1: ruleUnidad
            {
             before(grammarAccess.getMedidaRespuestaAccess().getUnidadUnidadEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnidad_in_rule__MedidaRespuesta__UnidadAssignment_5_16790);
            ruleUnidad();

            state._fsp--;

             after(grammarAccess.getMedidaRespuestaAccess().getUnidadUnidadEnumRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__MedidaRespuesta__UnidadAssignment_5_1"


    // $ANTLR start "rule__MedidaRespuesta__OperadorAssignment_6_1"
    // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3428:1: rule__MedidaRespuesta__OperadorAssignment_6_1 : ( ruleOperador ) ;
    public final void rule__MedidaRespuesta__OperadorAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3432:1: ( ( ruleOperador ) )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3433:1: ( ruleOperador )
            {
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3433:1: ( ruleOperador )
            // ../escenariosCalidadXtext.ui/src-gen/escenariosCalidad/ui/contentassist/antlr/internal/InternalXtext.g:3434:1: ruleOperador
            {
             before(grammarAccess.getMedidaRespuestaAccess().getOperadorOperadorEnumRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperador_in_rule__MedidaRespuesta__OperadorAssignment_6_16821);
            ruleOperador();

            state._fsp--;

             after(grammarAccess.getMedidaRespuestaAccess().getOperadorOperadorEnumRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__MedidaRespuesta__OperadorAssignment_6_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleTest_in_entryRuleTest61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTest68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Test__Group__0_in_ruleTest94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArquitectura_in_entryRuleArquitectura121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArquitectura128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group__0_in_ruleArquitectura154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscenario_in_entryRuleEscenario181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEscenario188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escenario__Group__0_in_ruleEscenario214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtefacto_in_entryRuleArtefacto241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArtefacto248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artefacto__Group__0_in_ruleArtefacto274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuente_in_entryRuleFuente361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuente368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuente__Group__0_in_ruleFuente394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEstimulo_in_entryRuleEstimulo421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEstimulo428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Estimulo__Group__0_in_ruleEstimulo454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMedidaRespuesta_in_entryRuleMedidaRespuesta481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMedidaRespuesta488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group__0_in_ruleMedidaRespuesta514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0_in_ruleEDouble574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Metrica__Alternatives_in_ruleMetrica611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Unidad__Alternatives_in_ruleUnidad647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operador__Alternatives_in_ruleOperador683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EDouble__Alternatives_4_0768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDouble__Alternatives_4_0788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Metrica__Alternatives823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Metrica__Alternatives844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Metrica__Alternatives865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Metrica__Alternatives886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Unidad__Alternatives922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Unidad__Alternatives943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Unidad__Alternatives964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Operador__Alternatives1000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Operador__Alternatives1021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Operador__Alternatives1042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Operador__Alternatives1063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Operador__Alternatives1084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Test__Group__0__Impl_in_rule__Test__Group__01117 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Test__Group__1_in_rule__Test__Group__01120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Test__Group__1__Impl_in_rule__Test__Group__11178 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Test__Group__2_in_rule__Test__Group__11181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Test__Group__1__Impl1209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Test__Group__2__Impl_in_rule__Test__Group__21240 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__Test__Group__3_in_rule__Test__Group__21243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Test__Group__2__Impl1271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Test__Group__3__Impl_in_rule__Test__Group__31302 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__Test__Group__4_in_rule__Test__Group__31305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Test__Group_3__0_in_rule__Test__Group__3__Impl1332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Test__Group__4__Impl_in_rule__Test__Group__41363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Test__Group__4__Impl1391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Test__Group_3__0__Impl_in_rule__Test__Group_3__01432 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Test__Group_3__1_in_rule__Test__Group_3__01435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Test__Group_3__0__Impl1463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Test__Group_3__1__Impl_in_rule__Test__Group_3__11494 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Test__Group_3__2_in_rule__Test__Group_3__11497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Test__Group_3__1__Impl1525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Test__Group_3__2__Impl_in_rule__Test__Group_3__21556 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__Test__Group_3__3_in_rule__Test__Group_3__21559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Test__ArquitecturasAssignment_3_2_in_rule__Test__Group_3__2__Impl1586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Test__Group_3__3__Impl_in_rule__Test__Group_3__31616 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__Test__Group_3__4_in_rule__Test__Group_3__31619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Test__Group_3_3__0_in_rule__Test__Group_3__3__Impl1646 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__Test__Group_3__4__Impl_in_rule__Test__Group_3__41677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Test__Group_3__4__Impl1705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Test__Group_3_3__0__Impl_in_rule__Test__Group_3_3__01746 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Test__Group_3_3__1_in_rule__Test__Group_3_3__01749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Test__Group_3_3__0__Impl1777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Test__Group_3_3__1__Impl_in_rule__Test__Group_3_3__11808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Test__ArquitecturasAssignment_3_3_1_in_rule__Test__Group_3_3__1__Impl1835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group__0__Impl_in_rule__Arquitectura__Group__01869 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group__1_in_rule__Arquitectura__Group__01872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group__1__Impl_in_rule__Arquitectura__Group__11930 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group__2_in_rule__Arquitectura__Group__11933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Arquitectura__Group__1__Impl1961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group__2__Impl_in_rule__Arquitectura__Group__21992 = new BitSet(new long[]{0x00000000C4000000L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group__3_in_rule__Arquitectura__Group__21995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Arquitectura__Group__2__Impl2023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group__3__Impl_in_rule__Arquitectura__Group__32054 = new BitSet(new long[]{0x00000000C4000000L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group__4_in_rule__Arquitectura__Group__32057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_3__0_in_rule__Arquitectura__Group__3__Impl2084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group__4__Impl_in_rule__Arquitectura__Group__42115 = new BitSet(new long[]{0x00000000C4000000L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group__5_in_rule__Arquitectura__Group__42118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_4__0_in_rule__Arquitectura__Group__4__Impl2145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group__5__Impl_in_rule__Arquitectura__Group__52176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Arquitectura__Group__5__Impl2204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_3__0__Impl_in_rule__Arquitectura__Group_3__02247 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_3__1_in_rule__Arquitectura__Group_3__02250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Arquitectura__Group_3__0__Impl2278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_3__1__Impl_in_rule__Arquitectura__Group_3__12309 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_3__2_in_rule__Arquitectura__Group_3__12312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Arquitectura__Group_3__1__Impl2340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_3__2__Impl_in_rule__Arquitectura__Group_3__22371 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_3__3_in_rule__Arquitectura__Group_3__22374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__EscenariosAssignment_3_2_in_rule__Arquitectura__Group_3__2__Impl2401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_3__3__Impl_in_rule__Arquitectura__Group_3__32431 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_3__4_in_rule__Arquitectura__Group_3__32434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_3_3__0_in_rule__Arquitectura__Group_3__3__Impl2461 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_3__4__Impl_in_rule__Arquitectura__Group_3__42492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Arquitectura__Group_3__4__Impl2520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_3_3__0__Impl_in_rule__Arquitectura__Group_3_3__02561 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_3_3__1_in_rule__Arquitectura__Group_3_3__02564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Arquitectura__Group_3_3__0__Impl2592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_3_3__1__Impl_in_rule__Arquitectura__Group_3_3__12623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__EscenariosAssignment_3_3_1_in_rule__Arquitectura__Group_3_3__1__Impl2650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_4__0__Impl_in_rule__Arquitectura__Group_4__02684 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_4__1_in_rule__Arquitectura__Group_4__02687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Arquitectura__Group_4__0__Impl2715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_4__1__Impl_in_rule__Arquitectura__Group_4__12746 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_4__2_in_rule__Arquitectura__Group_4__12749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Arquitectura__Group_4__1__Impl2777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_4__2__Impl_in_rule__Arquitectura__Group_4__22808 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_4__3_in_rule__Arquitectura__Group_4__22811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__ArtefactosAssignment_4_2_in_rule__Arquitectura__Group_4__2__Impl2838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_4__3__Impl_in_rule__Arquitectura__Group_4__32868 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_4__4_in_rule__Arquitectura__Group_4__32871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_4_3__0_in_rule__Arquitectura__Group_4__3__Impl2898 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_4__4__Impl_in_rule__Arquitectura__Group_4__42929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Arquitectura__Group_4__4__Impl2957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_4_3__0__Impl_in_rule__Arquitectura__Group_4_3__02998 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_4_3__1_in_rule__Arquitectura__Group_4_3__03001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Arquitectura__Group_4_3__0__Impl3029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Group_4_3__1__Impl_in_rule__Arquitectura__Group_4_3__13060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__ArtefactosAssignment_4_3_1_in_rule__Arquitectura__Group_4_3__1__Impl3087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escenario__Group__0__Impl_in_rule__Escenario__Group__03121 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Escenario__Group__1_in_rule__Escenario__Group__03124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Escenario__Group__0__Impl3152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escenario__Group__1__Impl_in_rule__Escenario__Group__13183 = new BitSet(new long[]{0x0000001200000000L});
        public static final BitSet FOLLOW_rule__Escenario__Group__2_in_rule__Escenario__Group__13186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Escenario__Group__1__Impl3214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escenario__Group__2__Impl_in_rule__Escenario__Group__23245 = new BitSet(new long[]{0x0000001200000000L});
        public static final BitSet FOLLOW_rule__Escenario__Group__3_in_rule__Escenario__Group__23248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escenario__Group_2__0_in_rule__Escenario__Group__2__Impl3275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escenario__Group__3__Impl_in_rule__Escenario__Group__33306 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Escenario__Group__4_in_rule__Escenario__Group__33309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Escenario__Group__3__Impl3337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escenario__Group__4__Impl_in_rule__Escenario__Group__43368 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Escenario__Group__5_in_rule__Escenario__Group__43371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escenario__FuenteAssignment_4_in_rule__Escenario__Group__4__Impl3398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escenario__Group__5__Impl_in_rule__Escenario__Group__53428 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Escenario__Group__6_in_rule__Escenario__Group__53431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Escenario__Group__5__Impl3459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escenario__Group__6__Impl_in_rule__Escenario__Group__63490 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__Escenario__Group__7_in_rule__Escenario__Group__63493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escenario__EstimuloAssignment_6_in_rule__Escenario__Group__6__Impl3520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escenario__Group__7__Impl_in_rule__Escenario__Group__73550 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Escenario__Group__8_in_rule__Escenario__Group__73553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Escenario__Group__7__Impl3581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escenario__Group__8__Impl_in_rule__Escenario__Group__83612 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Escenario__Group__9_in_rule__Escenario__Group__83615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escenario__MedidaAssignment_8_in_rule__Escenario__Group__8__Impl3642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escenario__Group__9__Impl_in_rule__Escenario__Group__93672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Escenario__Group__9__Impl3700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escenario__Group_2__0__Impl_in_rule__Escenario__Group_2__03751 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Escenario__Group_2__1_in_rule__Escenario__Group_2__03754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Escenario__Group_2__0__Impl3782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escenario__Group_2__1__Impl_in_rule__Escenario__Group_2__13813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Escenario__IdAssignment_2_1_in_rule__Escenario__Group_2__1__Impl3840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artefacto__Group__0__Impl_in_rule__Artefacto__Group__03874 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Artefacto__Group__1_in_rule__Artefacto__Group__03877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artefacto__Group__1__Impl_in_rule__Artefacto__Group__13935 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Artefacto__Group__2_in_rule__Artefacto__Group__13938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Artefacto__Group__1__Impl3966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artefacto__Group__2__Impl_in_rule__Artefacto__Group__23997 = new BitSet(new long[]{0x0000004004000000L});
        public static final BitSet FOLLOW_rule__Artefacto__Group__3_in_rule__Artefacto__Group__24000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Artefacto__Group__2__Impl4028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artefacto__Group__3__Impl_in_rule__Artefacto__Group__34059 = new BitSet(new long[]{0x0000004004000000L});
        public static final BitSet FOLLOW_rule__Artefacto__Group__4_in_rule__Artefacto__Group__34062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artefacto__Group_3__0_in_rule__Artefacto__Group__3__Impl4089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artefacto__Group__4__Impl_in_rule__Artefacto__Group__44120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Artefacto__Group__4__Impl4148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artefacto__Group_3__0__Impl_in_rule__Artefacto__Group_3__04189 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Artefacto__Group_3__1_in_rule__Artefacto__Group_3__04192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Artefacto__Group_3__0__Impl4220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artefacto__Group_3__1__Impl_in_rule__Artefacto__Group_3__14251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artefacto__UrlAssignment_3_1_in_rule__Artefacto__Group_3__1__Impl4278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuente__Group__0__Impl_in_rule__Fuente__Group__04312 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Fuente__Group__1_in_rule__Fuente__Group__04315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuente__Group__1__Impl_in_rule__Fuente__Group__14373 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Fuente__Group__2_in_rule__Fuente__Group__14376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Fuente__Group__1__Impl4404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuente__Group__2__Impl_in_rule__Fuente__Group__24435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuente__NameAssignment_2_in_rule__Fuente__Group__2__Impl4462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Estimulo__Group__0__Impl_in_rule__Estimulo__Group__04498 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Estimulo__Group__1_in_rule__Estimulo__Group__04501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Estimulo__Group__0__Impl4529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Estimulo__Group__1__Impl_in_rule__Estimulo__Group__14560 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Estimulo__Group__2_in_rule__Estimulo__Group__14563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Estimulo__Group__1__Impl4591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Estimulo__Group__2__Impl_in_rule__Estimulo__Group__24622 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Estimulo__Group__3_in_rule__Estimulo__Group__24625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Estimulo__Group__2__Impl4653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Estimulo__Group__3__Impl_in_rule__Estimulo__Group__34684 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Estimulo__Group__4_in_rule__Estimulo__Group__34687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Estimulo__ArtefactoAssignment_3_in_rule__Estimulo__Group__3__Impl4714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Estimulo__Group__4__Impl_in_rule__Estimulo__Group__44744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Estimulo__Group__4__Impl4772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group__0__Impl_in_rule__MedidaRespuesta__Group__04813 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group__1_in_rule__MedidaRespuesta__Group__04816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group__1__Impl_in_rule__MedidaRespuesta__Group__14874 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group__2_in_rule__MedidaRespuesta__Group__14877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__MedidaRespuesta__Group__1__Impl4905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group__2__Impl_in_rule__MedidaRespuesta__Group__24936 = new BitSet(new long[]{0x0000780004000000L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group__3_in_rule__MedidaRespuesta__Group__24939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MedidaRespuesta__Group__2__Impl4967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group__3__Impl_in_rule__MedidaRespuesta__Group__34998 = new BitSet(new long[]{0x0000780004000000L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group__4_in_rule__MedidaRespuesta__Group__35001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group_3__0_in_rule__MedidaRespuesta__Group__3__Impl5028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group__4__Impl_in_rule__MedidaRespuesta__Group__45059 = new BitSet(new long[]{0x0000780004000000L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group__5_in_rule__MedidaRespuesta__Group__45062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group_4__0_in_rule__MedidaRespuesta__Group__4__Impl5089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group__5__Impl_in_rule__MedidaRespuesta__Group__55120 = new BitSet(new long[]{0x0000780004000000L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group__6_in_rule__MedidaRespuesta__Group__55123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group_5__0_in_rule__MedidaRespuesta__Group__5__Impl5150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group__6__Impl_in_rule__MedidaRespuesta__Group__65181 = new BitSet(new long[]{0x0000780004000000L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group__7_in_rule__MedidaRespuesta__Group__65184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group_6__0_in_rule__MedidaRespuesta__Group__6__Impl5211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group__7__Impl_in_rule__MedidaRespuesta__Group__75242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MedidaRespuesta__Group__7__Impl5270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group_3__0__Impl_in_rule__MedidaRespuesta__Group_3__05317 = new BitSet(new long[]{0x000000000001E000L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group_3__1_in_rule__MedidaRespuesta__Group_3__05320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__MedidaRespuesta__Group_3__0__Impl5348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group_3__1__Impl_in_rule__MedidaRespuesta__Group_3__15379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__MetricaAssignment_3_1_in_rule__MedidaRespuesta__Group_3__1__Impl5406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group_4__0__Impl_in_rule__MedidaRespuesta__Group_4__05440 = new BitSet(new long[]{0x0001800000000040L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group_4__1_in_rule__MedidaRespuesta__Group_4__05443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__MedidaRespuesta__Group_4__0__Impl5471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group_4__1__Impl_in_rule__MedidaRespuesta__Group_4__15502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__ValorEsperadoAssignment_4_1_in_rule__MedidaRespuesta__Group_4__1__Impl5529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group_5__0__Impl_in_rule__MedidaRespuesta__Group_5__05563 = new BitSet(new long[]{0x00000000000E0000L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group_5__1_in_rule__MedidaRespuesta__Group_5__05566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__MedidaRespuesta__Group_5__0__Impl5594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group_5__1__Impl_in_rule__MedidaRespuesta__Group_5__15625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__UnidadAssignment_5_1_in_rule__MedidaRespuesta__Group_5__1__Impl5652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group_6__0__Impl_in_rule__MedidaRespuesta__Group_6__05686 = new BitSet(new long[]{0x0000000000F00800L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group_6__1_in_rule__MedidaRespuesta__Group_6__05689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__MedidaRespuesta__Group_6__0__Impl5717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__Group_6__1__Impl_in_rule__MedidaRespuesta__Group_6__15748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MedidaRespuesta__OperadorAssignment_6_1_in_rule__MedidaRespuesta__Group_6__1__Impl5775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__05809 = new BitSet(new long[]{0x0001800000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__05812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__EDouble__Group__0__Impl5841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__15874 = new BitSet(new long[]{0x0001800000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__15877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl5905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__25936 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__25939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__EDouble__Group__2__Impl5967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__35998 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__36001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl6028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__46057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl6084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__06125 = new BitSet(new long[]{0x0000800000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__06128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl6155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__16185 = new BitSet(new long[]{0x0000800000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__16188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__EDouble__Group_4__1__Impl6217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__26250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl6277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArquitectura_in_rule__Test__ArquitecturasAssignment_3_26317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArquitectura_in_rule__Test__ArquitecturasAssignment_3_3_16348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscenario_in_rule__Arquitectura__EscenariosAssignment_3_26379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscenario_in_rule__Arquitectura__EscenariosAssignment_3_3_16410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtefacto_in_rule__Arquitectura__ArtefactosAssignment_4_26441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtefacto_in_rule__Arquitectura__ArtefactosAssignment_4_3_16472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Escenario__IdAssignment_2_16503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuente_in_rule__Escenario__FuenteAssignment_46534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEstimulo_in_rule__Escenario__EstimuloAssignment_66565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMedidaRespuesta_in_rule__Escenario__MedidaAssignment_86596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Artefacto__UrlAssignment_3_16627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Fuente__NameAssignment_26658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Estimulo__ArtefactoAssignment_36693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetrica_in_rule__MedidaRespuesta__MetricaAssignment_3_16728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__MedidaRespuesta__ValorEsperadoAssignment_4_16759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnidad_in_rule__MedidaRespuesta__UnidadAssignment_5_16790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperador_in_rule__MedidaRespuesta__OperadorAssignment_6_16821 = new BitSet(new long[]{0x0000000000000002L});
    }


}