package escenariosCalidad.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import escenariosCalidad.services.XtextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXtextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Test'", "'{'", "'arquitecturas'", "','", "'}'", "'Arquitectura'", "'escenarios'", "'artefactos'", "'Escenario'", "'id'", "'fuente'", "'estimulo'", "'medida'", "'Artefacto'", "'url'", "'Fuente'", "'Estimulo'", "'artefacto'", "'MedidaRespuesta'", "'metrica'", "'valorEsperado'", "'unidad'", "'operador'", "'-'", "'.'", "'E'", "'e'", "'latency'", "'throughput'", "'errorPercentage'", "'responseCode'", "'segundos'", "'ms'", "'request'", "'GT'", "'LT'", "'GTE'", "'LTE'"
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
    public String getGrammarFileName() { return "../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g"; }



     	private XtextGrammarAccess grammarAccess;
     	
        public InternalXtextParser(TokenStream input, XtextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Test";	
       	}
       	
       	@Override
       	protected XtextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTest"
    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:68:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:69:2: (iv_ruleTest= ruleTest EOF )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:70:2: iv_ruleTest= ruleTest EOF
            {
             newCompositeNode(grammarAccess.getTestRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTest_in_entryRuleTest75);
            iv_ruleTest=ruleTest();

            state._fsp--;

             current =iv_ruleTest; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTest85); 

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
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:77:1: ruleTest returns [EObject current=null] : ( () otherlv_1= 'Test' otherlv_2= '{' (otherlv_3= 'arquitecturas' otherlv_4= '{' ( (lv_arquitecturas_5_0= ruleArquitectura ) ) (otherlv_6= ',' ( (lv_arquitecturas_7_0= ruleArquitectura ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_arquitecturas_5_0 = null;

        EObject lv_arquitecturas_7_0 = null;


         enterRule(); 
            
        try {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:80:28: ( ( () otherlv_1= 'Test' otherlv_2= '{' (otherlv_3= 'arquitecturas' otherlv_4= '{' ( (lv_arquitecturas_5_0= ruleArquitectura ) ) (otherlv_6= ',' ( (lv_arquitecturas_7_0= ruleArquitectura ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:81:1: ( () otherlv_1= 'Test' otherlv_2= '{' (otherlv_3= 'arquitecturas' otherlv_4= '{' ( (lv_arquitecturas_5_0= ruleArquitectura ) ) (otherlv_6= ',' ( (lv_arquitecturas_7_0= ruleArquitectura ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:81:1: ( () otherlv_1= 'Test' otherlv_2= '{' (otherlv_3= 'arquitecturas' otherlv_4= '{' ( (lv_arquitecturas_5_0= ruleArquitectura ) ) (otherlv_6= ',' ( (lv_arquitecturas_7_0= ruleArquitectura ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:81:2: () otherlv_1= 'Test' otherlv_2= '{' (otherlv_3= 'arquitecturas' otherlv_4= '{' ( (lv_arquitecturas_5_0= ruleArquitectura ) ) (otherlv_6= ',' ( (lv_arquitecturas_7_0= ruleArquitectura ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:81:2: ()
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTestAccess().getTestAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleTest131); 

                	newLeafNode(otherlv_1, grammarAccess.getTestAccess().getTestKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTest143); 

                	newLeafNode(otherlv_2, grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_2());
                
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:95:1: (otherlv_3= 'arquitecturas' otherlv_4= '{' ( (lv_arquitecturas_5_0= ruleArquitectura ) ) (otherlv_6= ',' ( (lv_arquitecturas_7_0= ruleArquitectura ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:95:3: otherlv_3= 'arquitecturas' otherlv_4= '{' ( (lv_arquitecturas_5_0= ruleArquitectura ) ) (otherlv_6= ',' ( (lv_arquitecturas_7_0= ruleArquitectura ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTest156); 

                        	newLeafNode(otherlv_3, grammarAccess.getTestAccess().getArquitecturasKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTest168); 

                        	newLeafNode(otherlv_4, grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:103:1: ( (lv_arquitecturas_5_0= ruleArquitectura ) )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:104:1: (lv_arquitecturas_5_0= ruleArquitectura )
                    {
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:104:1: (lv_arquitecturas_5_0= ruleArquitectura )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:105:3: lv_arquitecturas_5_0= ruleArquitectura
                    {
                     
                    	        newCompositeNode(grammarAccess.getTestAccess().getArquitecturasArquitecturaParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleArquitectura_in_ruleTest189);
                    lv_arquitecturas_5_0=ruleArquitectura();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTestRule());
                    	        }
                           		add(
                           			current, 
                           			"arquitecturas",
                            		lv_arquitecturas_5_0, 
                            		"Arquitectura");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:121:2: (otherlv_6= ',' ( (lv_arquitecturas_7_0= ruleArquitectura ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:121:4: otherlv_6= ',' ( (lv_arquitecturas_7_0= ruleArquitectura ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTest202); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getTestAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:125:1: ( (lv_arquitecturas_7_0= ruleArquitectura ) )
                    	    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:126:1: (lv_arquitecturas_7_0= ruleArquitectura )
                    	    {
                    	    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:126:1: (lv_arquitecturas_7_0= ruleArquitectura )
                    	    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:127:3: lv_arquitecturas_7_0= ruleArquitectura
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTestAccess().getArquitecturasArquitecturaParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleArquitectura_in_ruleTest223);
                    	    lv_arquitecturas_7_0=ruleArquitectura();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTestRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"arquitecturas",
                    	            		lv_arquitecturas_7_0, 
                    	            		"Arquitectura");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTest237); 

                        	newLeafNode(otherlv_8, grammarAccess.getTestAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTest251); 

                	newLeafNode(otherlv_9, grammarAccess.getTestAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleArquitectura"
    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:159:1: entryRuleArquitectura returns [EObject current=null] : iv_ruleArquitectura= ruleArquitectura EOF ;
    public final EObject entryRuleArquitectura() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArquitectura = null;


        try {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:160:2: (iv_ruleArquitectura= ruleArquitectura EOF )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:161:2: iv_ruleArquitectura= ruleArquitectura EOF
            {
             newCompositeNode(grammarAccess.getArquitecturaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArquitectura_in_entryRuleArquitectura287);
            iv_ruleArquitectura=ruleArquitectura();

            state._fsp--;

             current =iv_ruleArquitectura; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArquitectura297); 

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
    // $ANTLR end "entryRuleArquitectura"


    // $ANTLR start "ruleArquitectura"
    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:168:1: ruleArquitectura returns [EObject current=null] : ( () otherlv_1= 'Arquitectura' otherlv_2= '{' (otherlv_3= 'escenarios' otherlv_4= '{' ( (lv_escenarios_5_0= ruleEscenario ) ) (otherlv_6= ',' ( (lv_escenarios_7_0= ruleEscenario ) ) )* otherlv_8= '}' )? (otherlv_9= 'artefactos' otherlv_10= '{' ( (lv_artefactos_11_0= ruleArtefacto ) ) (otherlv_12= ',' ( (lv_artefactos_13_0= ruleArtefacto ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleArquitectura() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_escenarios_5_0 = null;

        EObject lv_escenarios_7_0 = null;

        EObject lv_artefactos_11_0 = null;

        EObject lv_artefactos_13_0 = null;


         enterRule(); 
            
        try {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:171:28: ( ( () otherlv_1= 'Arquitectura' otherlv_2= '{' (otherlv_3= 'escenarios' otherlv_4= '{' ( (lv_escenarios_5_0= ruleEscenario ) ) (otherlv_6= ',' ( (lv_escenarios_7_0= ruleEscenario ) ) )* otherlv_8= '}' )? (otherlv_9= 'artefactos' otherlv_10= '{' ( (lv_artefactos_11_0= ruleArtefacto ) ) (otherlv_12= ',' ( (lv_artefactos_13_0= ruleArtefacto ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:172:1: ( () otherlv_1= 'Arquitectura' otherlv_2= '{' (otherlv_3= 'escenarios' otherlv_4= '{' ( (lv_escenarios_5_0= ruleEscenario ) ) (otherlv_6= ',' ( (lv_escenarios_7_0= ruleEscenario ) ) )* otherlv_8= '}' )? (otherlv_9= 'artefactos' otherlv_10= '{' ( (lv_artefactos_11_0= ruleArtefacto ) ) (otherlv_12= ',' ( (lv_artefactos_13_0= ruleArtefacto ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:172:1: ( () otherlv_1= 'Arquitectura' otherlv_2= '{' (otherlv_3= 'escenarios' otherlv_4= '{' ( (lv_escenarios_5_0= ruleEscenario ) ) (otherlv_6= ',' ( (lv_escenarios_7_0= ruleEscenario ) ) )* otherlv_8= '}' )? (otherlv_9= 'artefactos' otherlv_10= '{' ( (lv_artefactos_11_0= ruleArtefacto ) ) (otherlv_12= ',' ( (lv_artefactos_13_0= ruleArtefacto ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:172:2: () otherlv_1= 'Arquitectura' otherlv_2= '{' (otherlv_3= 'escenarios' otherlv_4= '{' ( (lv_escenarios_5_0= ruleEscenario ) ) (otherlv_6= ',' ( (lv_escenarios_7_0= ruleEscenario ) ) )* otherlv_8= '}' )? (otherlv_9= 'artefactos' otherlv_10= '{' ( (lv_artefactos_11_0= ruleArtefacto ) ) (otherlv_12= ',' ( (lv_artefactos_13_0= ruleArtefacto ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:172:2: ()
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:173:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArquitecturaAccess().getArquitecturaAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleArquitectura343); 

                	newLeafNode(otherlv_1, grammarAccess.getArquitecturaAccess().getArquitecturaKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleArquitectura355); 

                	newLeafNode(otherlv_2, grammarAccess.getArquitecturaAccess().getLeftCurlyBracketKeyword_2());
                
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:186:1: (otherlv_3= 'escenarios' otherlv_4= '{' ( (lv_escenarios_5_0= ruleEscenario ) ) (otherlv_6= ',' ( (lv_escenarios_7_0= ruleEscenario ) ) )* otherlv_8= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:186:3: otherlv_3= 'escenarios' otherlv_4= '{' ( (lv_escenarios_5_0= ruleEscenario ) ) (otherlv_6= ',' ( (lv_escenarios_7_0= ruleEscenario ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleArquitectura368); 

                        	newLeafNode(otherlv_3, grammarAccess.getArquitecturaAccess().getEscenariosKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleArquitectura380); 

                        	newLeafNode(otherlv_4, grammarAccess.getArquitecturaAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:194:1: ( (lv_escenarios_5_0= ruleEscenario ) )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:195:1: (lv_escenarios_5_0= ruleEscenario )
                    {
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:195:1: (lv_escenarios_5_0= ruleEscenario )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:196:3: lv_escenarios_5_0= ruleEscenario
                    {
                     
                    	        newCompositeNode(grammarAccess.getArquitecturaAccess().getEscenariosEscenarioParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEscenario_in_ruleArquitectura401);
                    lv_escenarios_5_0=ruleEscenario();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArquitecturaRule());
                    	        }
                           		add(
                           			current, 
                           			"escenarios",
                            		lv_escenarios_5_0, 
                            		"Escenario");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:212:2: (otherlv_6= ',' ( (lv_escenarios_7_0= ruleEscenario ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:212:4: otherlv_6= ',' ( (lv_escenarios_7_0= ruleEscenario ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleArquitectura414); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getArquitecturaAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:216:1: ( (lv_escenarios_7_0= ruleEscenario ) )
                    	    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:217:1: (lv_escenarios_7_0= ruleEscenario )
                    	    {
                    	    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:217:1: (lv_escenarios_7_0= ruleEscenario )
                    	    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:218:3: lv_escenarios_7_0= ruleEscenario
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getArquitecturaAccess().getEscenariosEscenarioParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEscenario_in_ruleArquitectura435);
                    	    lv_escenarios_7_0=ruleEscenario();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getArquitecturaRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"escenarios",
                    	            		lv_escenarios_7_0, 
                    	            		"Escenario");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleArquitectura449); 

                        	newLeafNode(otherlv_8, grammarAccess.getArquitecturaAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:238:3: (otherlv_9= 'artefactos' otherlv_10= '{' ( (lv_artefactos_11_0= ruleArtefacto ) ) (otherlv_12= ',' ( (lv_artefactos_13_0= ruleArtefacto ) ) )* otherlv_14= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:238:5: otherlv_9= 'artefactos' otherlv_10= '{' ( (lv_artefactos_11_0= ruleArtefacto ) ) (otherlv_12= ',' ( (lv_artefactos_13_0= ruleArtefacto ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleArquitectura464); 

                        	newLeafNode(otherlv_9, grammarAccess.getArquitecturaAccess().getArtefactosKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleArquitectura476); 

                        	newLeafNode(otherlv_10, grammarAccess.getArquitecturaAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:246:1: ( (lv_artefactos_11_0= ruleArtefacto ) )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:247:1: (lv_artefactos_11_0= ruleArtefacto )
                    {
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:247:1: (lv_artefactos_11_0= ruleArtefacto )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:248:3: lv_artefactos_11_0= ruleArtefacto
                    {
                     
                    	        newCompositeNode(grammarAccess.getArquitecturaAccess().getArtefactosArtefactoParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleArtefacto_in_ruleArquitectura497);
                    lv_artefactos_11_0=ruleArtefacto();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArquitecturaRule());
                    	        }
                           		add(
                           			current, 
                           			"artefactos",
                            		lv_artefactos_11_0, 
                            		"Artefacto");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:264:2: (otherlv_12= ',' ( (lv_artefactos_13_0= ruleArtefacto ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:264:4: otherlv_12= ',' ( (lv_artefactos_13_0= ruleArtefacto ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleArquitectura510); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getArquitecturaAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:268:1: ( (lv_artefactos_13_0= ruleArtefacto ) )
                    	    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:269:1: (lv_artefactos_13_0= ruleArtefacto )
                    	    {
                    	    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:269:1: (lv_artefactos_13_0= ruleArtefacto )
                    	    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:270:3: lv_artefactos_13_0= ruleArtefacto
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getArquitecturaAccess().getArtefactosArtefactoParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleArtefacto_in_ruleArquitectura531);
                    	    lv_artefactos_13_0=ruleArtefacto();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getArquitecturaRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"artefactos",
                    	            		lv_artefactos_13_0, 
                    	            		"Artefacto");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleArquitectura545); 

                        	newLeafNode(otherlv_14, grammarAccess.getArquitecturaAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleArquitectura559); 

                	newLeafNode(otherlv_15, grammarAccess.getArquitecturaAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArquitectura"


    // $ANTLR start "entryRuleEscenario"
    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:302:1: entryRuleEscenario returns [EObject current=null] : iv_ruleEscenario= ruleEscenario EOF ;
    public final EObject entryRuleEscenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscenario = null;


        try {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:303:2: (iv_ruleEscenario= ruleEscenario EOF )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:304:2: iv_ruleEscenario= ruleEscenario EOF
            {
             newCompositeNode(grammarAccess.getEscenarioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEscenario_in_entryRuleEscenario595);
            iv_ruleEscenario=ruleEscenario();

            state._fsp--;

             current =iv_ruleEscenario; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEscenario605); 

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
    // $ANTLR end "entryRuleEscenario"


    // $ANTLR start "ruleEscenario"
    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:311:1: ruleEscenario returns [EObject current=null] : (otherlv_0= 'Escenario' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'fuente' ( (lv_fuente_5_0= ruleFuente ) ) otherlv_6= 'estimulo' ( (lv_estimulo_7_0= ruleEstimulo ) ) otherlv_8= 'medida' ( (lv_medida_9_0= ruleMedidaRespuesta ) ) otherlv_10= '}' ) ;
    public final EObject ruleEscenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        EObject lv_fuente_5_0 = null;

        EObject lv_estimulo_7_0 = null;

        EObject lv_medida_9_0 = null;


         enterRule(); 
            
        try {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:314:28: ( (otherlv_0= 'Escenario' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'fuente' ( (lv_fuente_5_0= ruleFuente ) ) otherlv_6= 'estimulo' ( (lv_estimulo_7_0= ruleEstimulo ) ) otherlv_8= 'medida' ( (lv_medida_9_0= ruleMedidaRespuesta ) ) otherlv_10= '}' ) )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:315:1: (otherlv_0= 'Escenario' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'fuente' ( (lv_fuente_5_0= ruleFuente ) ) otherlv_6= 'estimulo' ( (lv_estimulo_7_0= ruleEstimulo ) ) otherlv_8= 'medida' ( (lv_medida_9_0= ruleMedidaRespuesta ) ) otherlv_10= '}' )
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:315:1: (otherlv_0= 'Escenario' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'fuente' ( (lv_fuente_5_0= ruleFuente ) ) otherlv_6= 'estimulo' ( (lv_estimulo_7_0= ruleEstimulo ) ) otherlv_8= 'medida' ( (lv_medida_9_0= ruleMedidaRespuesta ) ) otherlv_10= '}' )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:315:3: otherlv_0= 'Escenario' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'fuente' ( (lv_fuente_5_0= ruleFuente ) ) otherlv_6= 'estimulo' ( (lv_estimulo_7_0= ruleEstimulo ) ) otherlv_8= 'medida' ( (lv_medida_9_0= ruleMedidaRespuesta ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEscenario642); 

                	newLeafNode(otherlv_0, grammarAccess.getEscenarioAccess().getEscenarioKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEscenario654); 

                	newLeafNode(otherlv_1, grammarAccess.getEscenarioAccess().getLeftCurlyBracketKeyword_1());
                
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:323:1: (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:323:3: otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEscenario667); 

                        	newLeafNode(otherlv_2, grammarAccess.getEscenarioAccess().getIdKeyword_2_0());
                        
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:327:1: ( (lv_id_3_0= ruleEString ) )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:328:1: (lv_id_3_0= ruleEString )
                    {
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:328:1: (lv_id_3_0= ruleEString )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:329:3: lv_id_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEscenarioAccess().getIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEscenario688);
                    lv_id_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEscenarioRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEscenario702); 

                	newLeafNode(otherlv_4, grammarAccess.getEscenarioAccess().getFuenteKeyword_3());
                
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:349:1: ( (lv_fuente_5_0= ruleFuente ) )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:350:1: (lv_fuente_5_0= ruleFuente )
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:350:1: (lv_fuente_5_0= ruleFuente )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:351:3: lv_fuente_5_0= ruleFuente
            {
             
            	        newCompositeNode(grammarAccess.getEscenarioAccess().getFuenteFuenteParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFuente_in_ruleEscenario723);
            lv_fuente_5_0=ruleFuente();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEscenarioRule());
            	        }
                   		set(
                   			current, 
                   			"fuente",
                    		lv_fuente_5_0, 
                    		"Fuente");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEscenario735); 

                	newLeafNode(otherlv_6, grammarAccess.getEscenarioAccess().getEstimuloKeyword_5());
                
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:371:1: ( (lv_estimulo_7_0= ruleEstimulo ) )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:372:1: (lv_estimulo_7_0= ruleEstimulo )
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:372:1: (lv_estimulo_7_0= ruleEstimulo )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:373:3: lv_estimulo_7_0= ruleEstimulo
            {
             
            	        newCompositeNode(grammarAccess.getEscenarioAccess().getEstimuloEstimuloParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEstimulo_in_ruleEscenario756);
            lv_estimulo_7_0=ruleEstimulo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEscenarioRule());
            	        }
                   		set(
                   			current, 
                   			"estimulo",
                    		lv_estimulo_7_0, 
                    		"Estimulo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEscenario768); 

                	newLeafNode(otherlv_8, grammarAccess.getEscenarioAccess().getMedidaKeyword_7());
                
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:393:1: ( (lv_medida_9_0= ruleMedidaRespuesta ) )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:394:1: (lv_medida_9_0= ruleMedidaRespuesta )
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:394:1: (lv_medida_9_0= ruleMedidaRespuesta )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:395:3: lv_medida_9_0= ruleMedidaRespuesta
            {
             
            	        newCompositeNode(grammarAccess.getEscenarioAccess().getMedidaMedidaRespuestaParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMedidaRespuesta_in_ruleEscenario789);
            lv_medida_9_0=ruleMedidaRespuesta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEscenarioRule());
            	        }
                   		set(
                   			current, 
                   			"medida",
                    		lv_medida_9_0, 
                    		"MedidaRespuesta");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEscenario801); 

                	newLeafNode(otherlv_10, grammarAccess.getEscenarioAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEscenario"


    // $ANTLR start "entryRuleArtefacto"
    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:423:1: entryRuleArtefacto returns [EObject current=null] : iv_ruleArtefacto= ruleArtefacto EOF ;
    public final EObject entryRuleArtefacto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtefacto = null;


        try {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:424:2: (iv_ruleArtefacto= ruleArtefacto EOF )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:425:2: iv_ruleArtefacto= ruleArtefacto EOF
            {
             newCompositeNode(grammarAccess.getArtefactoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArtefacto_in_entryRuleArtefacto837);
            iv_ruleArtefacto=ruleArtefacto();

            state._fsp--;

             current =iv_ruleArtefacto; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArtefacto847); 

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
    // $ANTLR end "entryRuleArtefacto"


    // $ANTLR start "ruleArtefacto"
    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:432:1: ruleArtefacto returns [EObject current=null] : ( () otherlv_1= 'Artefacto' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleArtefacto() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_url_4_0 = null;


         enterRule(); 
            
        try {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:435:28: ( ( () otherlv_1= 'Artefacto' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:436:1: ( () otherlv_1= 'Artefacto' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:436:1: ( () otherlv_1= 'Artefacto' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:436:2: () otherlv_1= 'Artefacto' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:436:2: ()
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:437:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArtefactoAccess().getArtefactoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleArtefacto893); 

                	newLeafNode(otherlv_1, grammarAccess.getArtefactoAccess().getArtefactoKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleArtefacto905); 

                	newLeafNode(otherlv_2, grammarAccess.getArtefactoAccess().getLeftCurlyBracketKeyword_2());
                
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:450:1: (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:450:3: otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleArtefacto918); 

                        	newLeafNode(otherlv_3, grammarAccess.getArtefactoAccess().getUrlKeyword_3_0());
                        
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:454:1: ( (lv_url_4_0= ruleEString ) )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:455:1: (lv_url_4_0= ruleEString )
                    {
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:455:1: (lv_url_4_0= ruleEString )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:456:3: lv_url_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getArtefactoAccess().getUrlEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArtefacto939);
                    lv_url_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArtefactoRule());
                    	        }
                           		set(
                           			current, 
                           			"url",
                            		lv_url_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleArtefacto953); 

                	newLeafNode(otherlv_5, grammarAccess.getArtefactoAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArtefacto"


    // $ANTLR start "entryRuleEString"
    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:484:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:485:2: (iv_ruleEString= ruleEString EOF )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:486:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString990);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1001); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:493:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:496:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:497:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:497:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:497:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1041); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:505:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1067); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFuente"
    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:520:1: entryRuleFuente returns [EObject current=null] : iv_ruleFuente= ruleFuente EOF ;
    public final EObject entryRuleFuente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuente = null;


        try {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:521:2: (iv_ruleFuente= ruleFuente EOF )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:522:2: iv_ruleFuente= ruleFuente EOF
            {
             newCompositeNode(grammarAccess.getFuenteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuente_in_entryRuleFuente1112);
            iv_ruleFuente=ruleFuente();

            state._fsp--;

             current =iv_ruleFuente; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuente1122); 

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
    // $ANTLR end "entryRuleFuente"


    // $ANTLR start "ruleFuente"
    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:529:1: ruleFuente returns [EObject current=null] : ( () otherlv_1= 'Fuente' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleFuente() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:532:28: ( ( () otherlv_1= 'Fuente' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:533:1: ( () otherlv_1= 'Fuente' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:533:1: ( () otherlv_1= 'Fuente' ( (lv_name_2_0= ruleEString ) ) )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:533:2: () otherlv_1= 'Fuente' ( (lv_name_2_0= ruleEString ) )
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:533:2: ()
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:534:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFuenteAccess().getFuenteAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleFuente1168); 

                	newLeafNode(otherlv_1, grammarAccess.getFuenteAccess().getFuenteKeyword_1());
                
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:543:1: ( (lv_name_2_0= ruleEString ) )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:544:1: (lv_name_2_0= ruleEString )
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:544:1: (lv_name_2_0= ruleEString )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:545:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFuenteAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFuente1189);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuenteRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuente"


    // $ANTLR start "entryRuleEstimulo"
    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:569:1: entryRuleEstimulo returns [EObject current=null] : iv_ruleEstimulo= ruleEstimulo EOF ;
    public final EObject entryRuleEstimulo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEstimulo = null;


        try {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:570:2: (iv_ruleEstimulo= ruleEstimulo EOF )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:571:2: iv_ruleEstimulo= ruleEstimulo EOF
            {
             newCompositeNode(grammarAccess.getEstimuloRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEstimulo_in_entryRuleEstimulo1225);
            iv_ruleEstimulo=ruleEstimulo();

            state._fsp--;

             current =iv_ruleEstimulo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEstimulo1235); 

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
    // $ANTLR end "entryRuleEstimulo"


    // $ANTLR start "ruleEstimulo"
    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:578:1: ruleEstimulo returns [EObject current=null] : (otherlv_0= 'Estimulo' otherlv_1= '{' otherlv_2= 'artefacto' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleEstimulo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:581:28: ( (otherlv_0= 'Estimulo' otherlv_1= '{' otherlv_2= 'artefacto' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:582:1: (otherlv_0= 'Estimulo' otherlv_1= '{' otherlv_2= 'artefacto' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:582:1: (otherlv_0= 'Estimulo' otherlv_1= '{' otherlv_2= 'artefacto' ( ( ruleEString ) ) otherlv_4= '}' )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:582:3: otherlv_0= 'Estimulo' otherlv_1= '{' otherlv_2= 'artefacto' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEstimulo1272); 

                	newLeafNode(otherlv_0, grammarAccess.getEstimuloAccess().getEstimuloKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEstimulo1284); 

                	newLeafNode(otherlv_1, grammarAccess.getEstimuloAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEstimulo1296); 

                	newLeafNode(otherlv_2, grammarAccess.getEstimuloAccess().getArtefactoKeyword_2());
                
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:594:1: ( ( ruleEString ) )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:595:1: ( ruleEString )
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:595:1: ( ruleEString )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:596:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEstimuloRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEstimuloAccess().getArtefactoArtefactoCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEstimulo1319);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEstimulo1331); 

                	newLeafNode(otherlv_4, grammarAccess.getEstimuloAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEstimulo"


    // $ANTLR start "entryRuleMedidaRespuesta"
    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:621:1: entryRuleMedidaRespuesta returns [EObject current=null] : iv_ruleMedidaRespuesta= ruleMedidaRespuesta EOF ;
    public final EObject entryRuleMedidaRespuesta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMedidaRespuesta = null;


        try {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:622:2: (iv_ruleMedidaRespuesta= ruleMedidaRespuesta EOF )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:623:2: iv_ruleMedidaRespuesta= ruleMedidaRespuesta EOF
            {
             newCompositeNode(grammarAccess.getMedidaRespuestaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMedidaRespuesta_in_entryRuleMedidaRespuesta1367);
            iv_ruleMedidaRespuesta=ruleMedidaRespuesta();

            state._fsp--;

             current =iv_ruleMedidaRespuesta; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMedidaRespuesta1377); 

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
    // $ANTLR end "entryRuleMedidaRespuesta"


    // $ANTLR start "ruleMedidaRespuesta"
    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:630:1: ruleMedidaRespuesta returns [EObject current=null] : ( () otherlv_1= 'MedidaRespuesta' otherlv_2= '{' (otherlv_3= 'metrica' ( (lv_metrica_4_0= ruleMetrica ) ) )? (otherlv_5= 'valorEsperado' ( (lv_valorEsperado_6_0= ruleEDouble ) ) )? (otherlv_7= 'unidad' ( (lv_unidad_8_0= ruleUnidad ) ) )? (otherlv_9= 'operador' ( (lv_operador_10_0= ruleOperador ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleMedidaRespuesta() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_metrica_4_0 = null;

        AntlrDatatypeRuleToken lv_valorEsperado_6_0 = null;

        Enumerator lv_unidad_8_0 = null;

        Enumerator lv_operador_10_0 = null;


         enterRule(); 
            
        try {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:633:28: ( ( () otherlv_1= 'MedidaRespuesta' otherlv_2= '{' (otherlv_3= 'metrica' ( (lv_metrica_4_0= ruleMetrica ) ) )? (otherlv_5= 'valorEsperado' ( (lv_valorEsperado_6_0= ruleEDouble ) ) )? (otherlv_7= 'unidad' ( (lv_unidad_8_0= ruleUnidad ) ) )? (otherlv_9= 'operador' ( (lv_operador_10_0= ruleOperador ) ) )? otherlv_11= '}' ) )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:634:1: ( () otherlv_1= 'MedidaRespuesta' otherlv_2= '{' (otherlv_3= 'metrica' ( (lv_metrica_4_0= ruleMetrica ) ) )? (otherlv_5= 'valorEsperado' ( (lv_valorEsperado_6_0= ruleEDouble ) ) )? (otherlv_7= 'unidad' ( (lv_unidad_8_0= ruleUnidad ) ) )? (otherlv_9= 'operador' ( (lv_operador_10_0= ruleOperador ) ) )? otherlv_11= '}' )
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:634:1: ( () otherlv_1= 'MedidaRespuesta' otherlv_2= '{' (otherlv_3= 'metrica' ( (lv_metrica_4_0= ruleMetrica ) ) )? (otherlv_5= 'valorEsperado' ( (lv_valorEsperado_6_0= ruleEDouble ) ) )? (otherlv_7= 'unidad' ( (lv_unidad_8_0= ruleUnidad ) ) )? (otherlv_9= 'operador' ( (lv_operador_10_0= ruleOperador ) ) )? otherlv_11= '}' )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:634:2: () otherlv_1= 'MedidaRespuesta' otherlv_2= '{' (otherlv_3= 'metrica' ( (lv_metrica_4_0= ruleMetrica ) ) )? (otherlv_5= 'valorEsperado' ( (lv_valorEsperado_6_0= ruleEDouble ) ) )? (otherlv_7= 'unidad' ( (lv_unidad_8_0= ruleUnidad ) ) )? (otherlv_9= 'operador' ( (lv_operador_10_0= ruleOperador ) ) )? otherlv_11= '}'
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:634:2: ()
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:635:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMedidaRespuestaAccess().getMedidaRespuestaAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMedidaRespuesta1423); 

                	newLeafNode(otherlv_1, grammarAccess.getMedidaRespuestaAccess().getMedidaRespuestaKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMedidaRespuesta1435); 

                	newLeafNode(otherlv_2, grammarAccess.getMedidaRespuestaAccess().getLeftCurlyBracketKeyword_2());
                
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:648:1: (otherlv_3= 'metrica' ( (lv_metrica_4_0= ruleMetrica ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:648:3: otherlv_3= 'metrica' ( (lv_metrica_4_0= ruleMetrica ) )
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMedidaRespuesta1448); 

                        	newLeafNode(otherlv_3, grammarAccess.getMedidaRespuestaAccess().getMetricaKeyword_3_0());
                        
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:652:1: ( (lv_metrica_4_0= ruleMetrica ) )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:653:1: (lv_metrica_4_0= ruleMetrica )
                    {
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:653:1: (lv_metrica_4_0= ruleMetrica )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:654:3: lv_metrica_4_0= ruleMetrica
                    {
                     
                    	        newCompositeNode(grammarAccess.getMedidaRespuestaAccess().getMetricaMetricaEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMetrica_in_ruleMedidaRespuesta1469);
                    lv_metrica_4_0=ruleMetrica();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMedidaRespuestaRule());
                    	        }
                           		set(
                           			current, 
                           			"metrica",
                            		lv_metrica_4_0, 
                            		"Metrica");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:670:4: (otherlv_5= 'valorEsperado' ( (lv_valorEsperado_6_0= ruleEDouble ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:670:6: otherlv_5= 'valorEsperado' ( (lv_valorEsperado_6_0= ruleEDouble ) )
                    {
                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMedidaRespuesta1484); 

                        	newLeafNode(otherlv_5, grammarAccess.getMedidaRespuestaAccess().getValorEsperadoKeyword_4_0());
                        
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:674:1: ( (lv_valorEsperado_6_0= ruleEDouble ) )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:675:1: (lv_valorEsperado_6_0= ruleEDouble )
                    {
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:675:1: (lv_valorEsperado_6_0= ruleEDouble )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:676:3: lv_valorEsperado_6_0= ruleEDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getMedidaRespuestaAccess().getValorEsperadoEDoubleParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleMedidaRespuesta1505);
                    lv_valorEsperado_6_0=ruleEDouble();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMedidaRespuestaRule());
                    	        }
                           		set(
                           			current, 
                           			"valorEsperado",
                            		lv_valorEsperado_6_0, 
                            		"EDouble");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:692:4: (otherlv_7= 'unidad' ( (lv_unidad_8_0= ruleUnidad ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:692:6: otherlv_7= 'unidad' ( (lv_unidad_8_0= ruleUnidad ) )
                    {
                    otherlv_7=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMedidaRespuesta1520); 

                        	newLeafNode(otherlv_7, grammarAccess.getMedidaRespuestaAccess().getUnidadKeyword_5_0());
                        
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:696:1: ( (lv_unidad_8_0= ruleUnidad ) )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:697:1: (lv_unidad_8_0= ruleUnidad )
                    {
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:697:1: (lv_unidad_8_0= ruleUnidad )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:698:3: lv_unidad_8_0= ruleUnidad
                    {
                     
                    	        newCompositeNode(grammarAccess.getMedidaRespuestaAccess().getUnidadUnidadEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUnidad_in_ruleMedidaRespuesta1541);
                    lv_unidad_8_0=ruleUnidad();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMedidaRespuestaRule());
                    	        }
                           		set(
                           			current, 
                           			"unidad",
                            		lv_unidad_8_0, 
                            		"Unidad");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:714:4: (otherlv_9= 'operador' ( (lv_operador_10_0= ruleOperador ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:714:6: otherlv_9= 'operador' ( (lv_operador_10_0= ruleOperador ) )
                    {
                    otherlv_9=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMedidaRespuesta1556); 

                        	newLeafNode(otherlv_9, grammarAccess.getMedidaRespuestaAccess().getOperadorKeyword_6_0());
                        
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:718:1: ( (lv_operador_10_0= ruleOperador ) )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:719:1: (lv_operador_10_0= ruleOperador )
                    {
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:719:1: (lv_operador_10_0= ruleOperador )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:720:3: lv_operador_10_0= ruleOperador
                    {
                     
                    	        newCompositeNode(grammarAccess.getMedidaRespuestaAccess().getOperadorOperadorEnumRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperador_in_ruleMedidaRespuesta1577);
                    lv_operador_10_0=ruleOperador();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMedidaRespuestaRule());
                    	        }
                           		set(
                           			current, 
                           			"operador",
                            		lv_operador_10_0, 
                            		"Operador");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMedidaRespuesta1591); 

                	newLeafNode(otherlv_11, grammarAccess.getMedidaRespuestaAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMedidaRespuesta"


    // $ANTLR start "entryRuleEDouble"
    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:748:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:749:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:750:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble1628);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble1639); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:757:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:760:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:761:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:761:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:761:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:761:2: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:762:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEDouble1678); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:767:3: (this_INT_1= RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:767:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble1696); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEDouble1716); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble1731); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
                
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:787:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=36 && LA18_0<=37)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:787:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:787:2: (kw= 'E' | kw= 'e' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==36) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==37) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:788:2: kw= 'E'
                            {
                            kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEDouble1751); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:795:2: kw= 'e'
                            {
                            kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEDouble1770); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:800:2: (kw= '-' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==34) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:801:2: kw= '-'
                            {
                            kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEDouble1785); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble1802); 

                    		current.merge(this_INT_7);
                        
                     
                        newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "ruleMetrica"
    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:821:1: ruleMetrica returns [Enumerator current=null] : ( (enumLiteral_0= 'latency' ) | (enumLiteral_1= 'throughput' ) | (enumLiteral_2= 'errorPercentage' ) | (enumLiteral_3= 'responseCode' ) ) ;
    public final Enumerator ruleMetrica() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:823:28: ( ( (enumLiteral_0= 'latency' ) | (enumLiteral_1= 'throughput' ) | (enumLiteral_2= 'errorPercentage' ) | (enumLiteral_3= 'responseCode' ) ) )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:824:1: ( (enumLiteral_0= 'latency' ) | (enumLiteral_1= 'throughput' ) | (enumLiteral_2= 'errorPercentage' ) | (enumLiteral_3= 'responseCode' ) )
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:824:1: ( (enumLiteral_0= 'latency' ) | (enumLiteral_1= 'throughput' ) | (enumLiteral_2= 'errorPercentage' ) | (enumLiteral_3= 'responseCode' ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt19=1;
                }
                break;
            case 39:
                {
                alt19=2;
                }
                break;
            case 40:
                {
                alt19=3;
                }
                break;
            case 41:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:824:2: (enumLiteral_0= 'latency' )
                    {
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:824:2: (enumLiteral_0= 'latency' )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:824:4: enumLiteral_0= 'latency'
                    {
                    enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleMetrica1863); 

                            current = grammarAccess.getMetricaAccess().getLatencyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMetricaAccess().getLatencyEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:830:6: (enumLiteral_1= 'throughput' )
                    {
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:830:6: (enumLiteral_1= 'throughput' )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:830:8: enumLiteral_1= 'throughput'
                    {
                    enumLiteral_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMetrica1880); 

                            current = grammarAccess.getMetricaAccess().getThroughputEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMetricaAccess().getThroughputEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:836:6: (enumLiteral_2= 'errorPercentage' )
                    {
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:836:6: (enumLiteral_2= 'errorPercentage' )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:836:8: enumLiteral_2= 'errorPercentage'
                    {
                    enumLiteral_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleMetrica1897); 

                            current = grammarAccess.getMetricaAccess().getErrorPercentageEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMetricaAccess().getErrorPercentageEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:842:6: (enumLiteral_3= 'responseCode' )
                    {
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:842:6: (enumLiteral_3= 'responseCode' )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:842:8: enumLiteral_3= 'responseCode'
                    {
                    enumLiteral_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleMetrica1914); 

                            current = grammarAccess.getMetricaAccess().getResponseCodeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMetricaAccess().getResponseCodeEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetrica"


    // $ANTLR start "ruleUnidad"
    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:852:1: ruleUnidad returns [Enumerator current=null] : ( (enumLiteral_0= 'segundos' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'request' ) ) ;
    public final Enumerator ruleUnidad() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:854:28: ( ( (enumLiteral_0= 'segundos' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'request' ) ) )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:855:1: ( (enumLiteral_0= 'segundos' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'request' ) )
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:855:1: ( (enumLiteral_0= 'segundos' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'request' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt20=1;
                }
                break;
            case 43:
                {
                alt20=2;
                }
                break;
            case 44:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:855:2: (enumLiteral_0= 'segundos' )
                    {
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:855:2: (enumLiteral_0= 'segundos' )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:855:4: enumLiteral_0= 'segundos'
                    {
                    enumLiteral_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleUnidad1959); 

                            current = grammarAccess.getUnidadAccess().getSegundosEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUnidadAccess().getSegundosEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:861:6: (enumLiteral_1= 'ms' )
                    {
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:861:6: (enumLiteral_1= 'ms' )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:861:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleUnidad1976); 

                            current = grammarAccess.getUnidadAccess().getMsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getUnidadAccess().getMsEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:867:6: (enumLiteral_2= 'request' )
                    {
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:867:6: (enumLiteral_2= 'request' )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:867:8: enumLiteral_2= 'request'
                    {
                    enumLiteral_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleUnidad1993); 

                            current = grammarAccess.getUnidadAccess().getRequestEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getUnidadAccess().getRequestEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnidad"


    // $ANTLR start "ruleOperador"
    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:877:1: ruleOperador returns [Enumerator current=null] : ( (enumLiteral_0= 'GT' ) | (enumLiteral_1= 'LT' ) | (enumLiteral_2= 'GTE' ) | (enumLiteral_3= 'LTE' ) | (enumLiteral_4= 'E' ) ) ;
    public final Enumerator ruleOperador() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:879:28: ( ( (enumLiteral_0= 'GT' ) | (enumLiteral_1= 'LT' ) | (enumLiteral_2= 'GTE' ) | (enumLiteral_3= 'LTE' ) | (enumLiteral_4= 'E' ) ) )
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:880:1: ( (enumLiteral_0= 'GT' ) | (enumLiteral_1= 'LT' ) | (enumLiteral_2= 'GTE' ) | (enumLiteral_3= 'LTE' ) | (enumLiteral_4= 'E' ) )
            {
            // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:880:1: ( (enumLiteral_0= 'GT' ) | (enumLiteral_1= 'LT' ) | (enumLiteral_2= 'GTE' ) | (enumLiteral_3= 'LTE' ) | (enumLiteral_4= 'E' ) )
            int alt21=5;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt21=1;
                }
                break;
            case 46:
                {
                alt21=2;
                }
                break;
            case 47:
                {
                alt21=3;
                }
                break;
            case 48:
                {
                alt21=4;
                }
                break;
            case 36:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:880:2: (enumLiteral_0= 'GT' )
                    {
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:880:2: (enumLiteral_0= 'GT' )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:880:4: enumLiteral_0= 'GT'
                    {
                    enumLiteral_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleOperador2038); 

                            current = grammarAccess.getOperadorAccess().getGTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperadorAccess().getGTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:886:6: (enumLiteral_1= 'LT' )
                    {
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:886:6: (enumLiteral_1= 'LT' )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:886:8: enumLiteral_1= 'LT'
                    {
                    enumLiteral_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleOperador2055); 

                            current = grammarAccess.getOperadorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOperadorAccess().getLTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:892:6: (enumLiteral_2= 'GTE' )
                    {
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:892:6: (enumLiteral_2= 'GTE' )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:892:8: enumLiteral_2= 'GTE'
                    {
                    enumLiteral_2=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleOperador2072); 

                            current = grammarAccess.getOperadorAccess().getGTEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOperadorAccess().getGTEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:898:6: (enumLiteral_3= 'LTE' )
                    {
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:898:6: (enumLiteral_3= 'LTE' )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:898:8: enumLiteral_3= 'LTE'
                    {
                    enumLiteral_3=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleOperador2089); 

                            current = grammarAccess.getOperadorAccess().getLTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getOperadorAccess().getLTEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:904:6: (enumLiteral_4= 'E' )
                    {
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:904:6: (enumLiteral_4= 'E' )
                    // ../escenariosCalidadXtext/src-gen/escenariosCalidad/parser/antlr/internal/InternalXtext.g:904:8: enumLiteral_4= 'E'
                    {
                    enumLiteral_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOperador2106); 

                            current = grammarAccess.getOperadorAccess().getEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getOperadorAccess().getEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperador"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleTest_in_entryRuleTest75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTest85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleTest131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTest143 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_13_in_ruleTest156 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTest168 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleArquitectura_in_ruleTest189 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleTest202 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleArquitectura_in_ruleTest223 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleTest237 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTest251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArquitectura_in_entryRuleArquitectura287 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArquitectura297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleArquitectura343 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleArquitectura355 = new BitSet(new long[]{0x0000000000068000L});
        public static final BitSet FOLLOW_17_in_ruleArquitectura368 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleArquitectura380 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleEscenario_in_ruleArquitectura401 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleArquitectura414 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleEscenario_in_ruleArquitectura435 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleArquitectura449 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_18_in_ruleArquitectura464 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleArquitectura476 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleArtefacto_in_ruleArquitectura497 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleArquitectura510 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleArtefacto_in_ruleArquitectura531 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleArquitectura545 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleArquitectura559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscenario_in_entryRuleEscenario595 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEscenario605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleEscenario642 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEscenario654 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_20_in_ruleEscenario667 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEscenario688 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleEscenario702 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleFuente_in_ruleEscenario723 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleEscenario735 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleEstimulo_in_ruleEscenario756 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleEscenario768 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleMedidaRespuesta_in_ruleEscenario789 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleEscenario801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtefacto_in_entryRuleArtefacto837 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArtefacto847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleArtefacto893 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleArtefacto905 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_25_in_ruleArtefacto918 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArtefacto939 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleArtefacto953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString990 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuente_in_entryRuleFuente1112 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuente1122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleFuente1168 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFuente1189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEstimulo_in_entryRuleEstimulo1225 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEstimulo1235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleEstimulo1272 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEstimulo1284 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleEstimulo1296 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEstimulo1319 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleEstimulo1331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMedidaRespuesta_in_entryRuleMedidaRespuesta1367 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMedidaRespuesta1377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleMedidaRespuesta1423 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMedidaRespuesta1435 = new BitSet(new long[]{0x00000003C0008000L});
        public static final BitSet FOLLOW_30_in_ruleMedidaRespuesta1448 = new BitSet(new long[]{0x000003C000000000L});
        public static final BitSet FOLLOW_ruleMetrica_in_ruleMedidaRespuesta1469 = new BitSet(new long[]{0x0000000380008000L});
        public static final BitSet FOLLOW_31_in_ruleMedidaRespuesta1484 = new BitSet(new long[]{0x0000000C00000040L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleMedidaRespuesta1505 = new BitSet(new long[]{0x0000000300008000L});
        public static final BitSet FOLLOW_32_in_ruleMedidaRespuesta1520 = new BitSet(new long[]{0x00001C0000000000L});
        public static final BitSet FOLLOW_ruleUnidad_in_ruleMedidaRespuesta1541 = new BitSet(new long[]{0x0000000200008000L});
        public static final BitSet FOLLOW_33_in_ruleMedidaRespuesta1556 = new BitSet(new long[]{0x0001E01000000000L});
        public static final BitSet FOLLOW_ruleOperador_in_ruleMedidaRespuesta1577 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMedidaRespuesta1591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble1628 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble1639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEDouble1678 = new BitSet(new long[]{0x0000000800000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble1696 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleEDouble1716 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble1731 = new BitSet(new long[]{0x0000003000000002L});
        public static final BitSet FOLLOW_36_in_ruleEDouble1751 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_37_in_ruleEDouble1770 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_34_in_ruleEDouble1785 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble1802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleMetrica1863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleMetrica1880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleMetrica1897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleMetrica1914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleUnidad1959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleUnidad1976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleUnidad1993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleOperador2038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleOperador2055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleOperador2072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleOperador2089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleOperador2106 = new BitSet(new long[]{0x0000000000000002L});
    }


}