package org.eclipse.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.services.ClassdefGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalClassdefParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'action'", "'inputs:'", "'outputs:'", "'param'", "':'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=6;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int RULE_DECIMAL=8;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalClassdefParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalClassdefParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalClassdefParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g"; }



     	private ClassdefGrammarAccess grammarAccess;
     	
        public InternalClassdefParser(TokenStream input, ClassdefGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ClassDefinitions";	
       	}
       	
       	@Override
       	protected ClassdefGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleClassDefinitions"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:67:1: entryRuleClassDefinitions returns [EObject current=null] : iv_ruleClassDefinitions= ruleClassDefinitions EOF ;
    public final EObject entryRuleClassDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinitions = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:68:2: (iv_ruleClassDefinitions= ruleClassDefinitions EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:69:2: iv_ruleClassDefinitions= ruleClassDefinitions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassDefinitionsRule()); 
            }
            pushFollow(FOLLOW_ruleClassDefinitions_in_entryRuleClassDefinitions75);
            iv_ruleClassDefinitions=ruleClassDefinitions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassDefinitions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDefinitions85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassDefinitions"


    // $ANTLR start "ruleClassDefinitions"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:76:1: ruleClassDefinitions returns [EObject current=null] : ( (lv_definedClasses_0_0= ruleDummyJavaClass ) )* ;
    public final EObject ruleClassDefinitions() throws RecognitionException {
        EObject current = null;

        EObject lv_definedClasses_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:79:28: ( ( (lv_definedClasses_0_0= ruleDummyJavaClass ) )* )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:80:1: ( (lv_definedClasses_0_0= ruleDummyJavaClass ) )*
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:80:1: ( (lv_definedClasses_0_0= ruleDummyJavaClass ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:81:1: (lv_definedClasses_0_0= ruleDummyJavaClass )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:81:1: (lv_definedClasses_0_0= ruleDummyJavaClass )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:82:3: lv_definedClasses_0_0= ruleDummyJavaClass
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassDefinitionsAccess().getDefinedClassesDummyJavaClassParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDummyJavaClass_in_ruleClassDefinitions130);
            	    lv_definedClasses_0_0=ruleDummyJavaClass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassDefinitionsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"definedClasses",
            	              		lv_definedClasses_0_0, 
            	              		"DummyJavaClass");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleClassDefinitions"


    // $ANTLR start "entryRuleDummyJavaClass"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:106:1: entryRuleDummyJavaClass returns [EObject current=null] : iv_ruleDummyJavaClass= ruleDummyJavaClass EOF ;
    public final EObject entryRuleDummyJavaClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDummyJavaClass = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:107:2: (iv_ruleDummyJavaClass= ruleDummyJavaClass EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:108:2: iv_ruleDummyJavaClass= ruleDummyJavaClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDummyJavaClassRule()); 
            }
            pushFollow(FOLLOW_ruleDummyJavaClass_in_entryRuleDummyJavaClass166);
            iv_ruleDummyJavaClass=ruleDummyJavaClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDummyJavaClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDummyJavaClass176); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDummyJavaClass"


    // $ANTLR start "ruleDummyJavaClass"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:115:1: ruleDummyJavaClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_methods_3_0= ruleDummyJavaClassMethod ) )* ) ;
    public final EObject ruleDummyJavaClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        EObject lv_methods_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:118:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_methods_3_0= ruleDummyJavaClassMethod ) )* ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:119:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_methods_3_0= ruleDummyJavaClassMethod ) )* )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:119:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_methods_3_0= ruleDummyJavaClassMethod ) )* )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:119:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ( (lv_methods_3_0= ruleDummyJavaClassMethod ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleDummyJavaClass213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDummyJavaClassAccess().getClassKeyword_0());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:124:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDummyJavaClass230); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getDummyJavaClassAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDummyJavaClassRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:141:2: ( (lv_description_2_0= RULE_STRING ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:142:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:142:1: (lv_description_2_0= RULE_STRING )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:143:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDummyJavaClass252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_description_2_0, grammarAccess.getDummyJavaClassAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDummyJavaClassRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"description",
                              		lv_description_2_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:159:3: ( (lv_methods_3_0= ruleDummyJavaClassMethod ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:160:1: (lv_methods_3_0= ruleDummyJavaClassMethod )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:160:1: (lv_methods_3_0= ruleDummyJavaClassMethod )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:161:3: lv_methods_3_0= ruleDummyJavaClassMethod
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDummyJavaClassAccess().getMethodsDummyJavaClassMethodParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDummyJavaClassMethod_in_ruleDummyJavaClass279);
            	    lv_methods_3_0=ruleDummyJavaClassMethod();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDummyJavaClassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"methods",
            	              		lv_methods_3_0, 
            	              		"DummyJavaClassMethod");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDummyJavaClass"


    // $ANTLR start "entryRuleDummyJavaClassMethod"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:185:1: entryRuleDummyJavaClassMethod returns [EObject current=null] : iv_ruleDummyJavaClassMethod= ruleDummyJavaClassMethod EOF ;
    public final EObject entryRuleDummyJavaClassMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDummyJavaClassMethod = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:186:2: (iv_ruleDummyJavaClassMethod= ruleDummyJavaClassMethod EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:187:2: iv_ruleDummyJavaClassMethod= ruleDummyJavaClassMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDummyJavaClassMethodRule()); 
            }
            pushFollow(FOLLOW_ruleDummyJavaClassMethod_in_entryRuleDummyJavaClassMethod316);
            iv_ruleDummyJavaClassMethod=ruleDummyJavaClassMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDummyJavaClassMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDummyJavaClassMethod326); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDummyJavaClassMethod"


    // $ANTLR start "ruleDummyJavaClassMethod"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:194:1: ruleDummyJavaClassMethod returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'inputs:' ( (lv_input_4_0= ruleDummyJavaClassMethodParameter ) )+ )? (otherlv_5= 'outputs:' ( (lv_ouput_6_0= ruleDummyJavaClassMethodParameter ) )+ )? ) ;
    public final EObject ruleDummyJavaClassMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_input_4_0 = null;

        EObject lv_ouput_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:197:28: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'inputs:' ( (lv_input_4_0= ruleDummyJavaClassMethodParameter ) )+ )? (otherlv_5= 'outputs:' ( (lv_ouput_6_0= ruleDummyJavaClassMethodParameter ) )+ )? ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:198:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'inputs:' ( (lv_input_4_0= ruleDummyJavaClassMethodParameter ) )+ )? (otherlv_5= 'outputs:' ( (lv_ouput_6_0= ruleDummyJavaClassMethodParameter ) )+ )? )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:198:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'inputs:' ( (lv_input_4_0= ruleDummyJavaClassMethodParameter ) )+ )? (otherlv_5= 'outputs:' ( (lv_ouput_6_0= ruleDummyJavaClassMethodParameter ) )+ )? )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:198:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'inputs:' ( (lv_input_4_0= ruleDummyJavaClassMethodParameter ) )+ )? (otherlv_5= 'outputs:' ( (lv_ouput_6_0= ruleDummyJavaClassMethodParameter ) )+ )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleDummyJavaClassMethod363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDummyJavaClassMethodAccess().getActionKeyword_0());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:202:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:203:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:203:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:204:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDummyJavaClassMethod380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getDummyJavaClassMethodAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDummyJavaClassMethodRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:220:2: ( (lv_description_2_0= RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:221:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:221:1: (lv_description_2_0= RULE_STRING )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:222:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDummyJavaClassMethod402); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_description_2_0, grammarAccess.getDummyJavaClassMethodAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDummyJavaClassMethodRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"description",
                              		lv_description_2_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:238:3: (otherlv_3= 'inputs:' ( (lv_input_4_0= ruleDummyJavaClassMethodParameter ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:238:5: otherlv_3= 'inputs:' ( (lv_input_4_0= ruleDummyJavaClassMethodParameter ) )+
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleDummyJavaClassMethod421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDummyJavaClassMethodAccess().getInputsKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:242:1: ( (lv_input_4_0= ruleDummyJavaClassMethodParameter ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:243:1: (lv_input_4_0= ruleDummyJavaClassMethodParameter )
                    	    {
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:243:1: (lv_input_4_0= ruleDummyJavaClassMethodParameter )
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:244:3: lv_input_4_0= ruleDummyJavaClassMethodParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDummyJavaClassMethodAccess().getInputDummyJavaClassMethodParameterParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDummyJavaClassMethodParameter_in_ruleDummyJavaClassMethod442);
                    	    lv_input_4_0=ruleDummyJavaClassMethodParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDummyJavaClassMethodRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"input",
                    	              		lv_input_4_0, 
                    	              		"DummyJavaClassMethodParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:260:5: (otherlv_5= 'outputs:' ( (lv_ouput_6_0= ruleDummyJavaClassMethodParameter ) )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:260:7: otherlv_5= 'outputs:' ( (lv_ouput_6_0= ruleDummyJavaClassMethodParameter ) )+
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleDummyJavaClassMethod458); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getDummyJavaClassMethodAccess().getOutputsKeyword_4_0());
                          
                    }
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:264:1: ( (lv_ouput_6_0= ruleDummyJavaClassMethodParameter ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:265:1: (lv_ouput_6_0= ruleDummyJavaClassMethodParameter )
                    	    {
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:265:1: (lv_ouput_6_0= ruleDummyJavaClassMethodParameter )
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:266:3: lv_ouput_6_0= ruleDummyJavaClassMethodParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDummyJavaClassMethodAccess().getOuputDummyJavaClassMethodParameterParserRuleCall_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDummyJavaClassMethodParameter_in_ruleDummyJavaClassMethod479);
                    	    lv_ouput_6_0=ruleDummyJavaClassMethodParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDummyJavaClassMethodRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ouput",
                    	              		lv_ouput_6_0, 
                    	              		"DummyJavaClassMethodParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDummyJavaClassMethod"


    // $ANTLR start "entryRuleDummyJavaClassMethodParameter"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:290:1: entryRuleDummyJavaClassMethodParameter returns [EObject current=null] : iv_ruleDummyJavaClassMethodParameter= ruleDummyJavaClassMethodParameter EOF ;
    public final EObject entryRuleDummyJavaClassMethodParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDummyJavaClassMethodParameter = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:291:2: (iv_ruleDummyJavaClassMethodParameter= ruleDummyJavaClassMethodParameter EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:292:2: iv_ruleDummyJavaClassMethodParameter= ruleDummyJavaClassMethodParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDummyJavaClassMethodParameterRule()); 
            }
            pushFollow(FOLLOW_ruleDummyJavaClassMethodParameter_in_entryRuleDummyJavaClassMethodParameter518);
            iv_ruleDummyJavaClassMethodParameter=ruleDummyJavaClassMethodParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDummyJavaClassMethodParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDummyJavaClassMethodParameter528); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDummyJavaClassMethodParameter"


    // $ANTLR start "ruleDummyJavaClassMethodParameter"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:299:1: ruleDummyJavaClassMethodParameter returns [EObject current=null] : (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ( (lv_description_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleDummyJavaClassMethodParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token lv_description_4_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:302:28: ( (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ( (lv_description_4_0= RULE_STRING ) )? ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:303:1: (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ( (lv_description_4_0= RULE_STRING ) )? )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:303:1: (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ( (lv_description_4_0= RULE_STRING ) )? )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:303:3: otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_STRING ) ) ( (lv_description_4_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleDummyJavaClassMethodParameter565); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDummyJavaClassMethodParameterAccess().getParamKeyword_0());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:307:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:308:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:308:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:309:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDummyJavaClassMethodParameter582); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getDummyJavaClassMethodParameterAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDummyJavaClassMethodParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleDummyJavaClassMethodParameter599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDummyJavaClassMethodParameterAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:329:1: ( (lv_type_3_0= RULE_STRING ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:330:1: (lv_type_3_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:330:1: (lv_type_3_0= RULE_STRING )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:331:3: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDummyJavaClassMethodParameter616); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_type_3_0, grammarAccess.getDummyJavaClassMethodParameterAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDummyJavaClassMethodParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:347:2: ( (lv_description_4_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:348:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:348:1: (lv_description_4_0= RULE_STRING )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:349:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDummyJavaClassMethodParameter638); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_description_4_0, grammarAccess.getDummyJavaClassMethodParameterAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDummyJavaClassMethodParameterRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"description",
                              		lv_description_4_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDummyJavaClassMethodParameter"


    // $ANTLR start "entryRuleXExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:373:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:374:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:375:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression680);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression690); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:382:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:385:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:387:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression736);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:403:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:404:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:405:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment770);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment780); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:412:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:415:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:416:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:416:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EOF||(LA11_1>=RULE_ID && LA11_1<=RULE_DECIMAL)||LA11_1==18||(LA11_1>=20 && LA11_1<=50)||(LA11_1>=52 && LA11_1<=77)) ) {
                    alt11=2;
                }
                else if ( (LA11_1==19) ) {
                    alt11=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_DECIMAL)||LA11_0==29||(LA11_0>=36 && LA11_0<=37)||LA11_0==42||LA11_0==48||LA11_0==50||LA11_0==54||(LA11_0>=56 && LA11_0<=57)||(LA11_0>=61 && LA11_0<=63)||LA11_0==66||(LA11_0>=68 && LA11_0<=75)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:416:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:416:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:416:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:416:3: ()
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:417:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:422:2: ( ( ruleValidID ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:423:1: ( ruleValidID )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:423:1: ( ruleValidID )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:424:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment838);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment854);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:445:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:446:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:446:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:447:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment874);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:464:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:464:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:465:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment904);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:473:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==20) ) {
                        int LA10_1 = input.LA(2);

                        if ( (synpred1_InternalClassdef()) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:473:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:473:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:473:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:478:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:478:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:478:7: ()
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:479:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:484:2: ( ( ruleOpMultiAssign ) )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:485:1: ( ruleOpMultiAssign )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:485:1: ( ruleOpMultiAssign )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:486:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment957);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:499:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:500:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:500:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:501:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment980);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:525:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:526:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:527:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1020);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1031); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:534:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:537:28: (kw= '=' )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:539:2: kw= '='
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpSingleAssign1068); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:552:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:553:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:554:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1108);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1119); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:561:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:564:28: (kw= '+=' )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:566:2: kw= '+='
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpMultiAssign1156); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:579:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:580:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:581:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1195);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1205); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:588:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:591:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:592:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:592:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:593:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1252);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:601:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred2_InternalClassdef()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:601:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:601:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:601:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:606:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:606:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:606:7: ()
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:607:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:612:2: ( ( ruleOpOr ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:613:1: ( ruleOpOr )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:613:1: ( ruleOpOr )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:614:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1305);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:627:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:628:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:628:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:629:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1328);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:653:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:654:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:655:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1367);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1378); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:662:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:665:28: (kw= '||' )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:667:2: kw= '||'
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleOpOr1415); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:680:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:681:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:682:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1454);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1464); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:689:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:692:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:693:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:693:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:694:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1511);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:702:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred3_InternalClassdef()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:702:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:702:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:702:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:707:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:707:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:707:7: ()
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:708:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:713:2: ( ( ruleOpAnd ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:714:1: ( ruleOpAnd )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:714:1: ( ruleOpAnd )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:715:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1564);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:728:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:729:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:729:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:730:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1587);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:754:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:755:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:756:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1626);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1637); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:763:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:766:28: (kw= '&&' )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:768:2: kw= '&&'
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleOpAnd1674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:781:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:782:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:783:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1713);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1723); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:790:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:793:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:794:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:794:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:795:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1770);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:803:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred4_InternalClassdef()) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==24) ) {
                    int LA14_3 = input.LA(2);

                    if ( (synpred4_InternalClassdef()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:803:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:803:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:803:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:808:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:808:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:808:7: ()
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:809:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:814:2: ( ( ruleOpEquality ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:815:1: ( ruleOpEquality )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:815:1: ( ruleOpEquality )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:816:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1823);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:829:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:830:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:830:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:831:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1846);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:855:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:856:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:857:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1885);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1896); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:864:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:867:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:868:1: (kw= '==' | kw= '!=' )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:868:1: (kw= '==' | kw= '!=' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            else if ( (LA15_0==24) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:869:2: kw= '=='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpEquality1934); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:876:2: kw= '!='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpEquality1953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:889:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:890:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:891:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1993);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2003); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:898:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:901:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:902:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:902:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:903:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2050);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:911:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop16:
            do {
                int alt16=3;
                switch ( input.LA(1) ) {
                case 28:
                    {
                    int LA16_2 = input.LA(2);

                    if ( (synpred6_InternalClassdef()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (synpred6_InternalClassdef()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA16_4 = input.LA(2);

                    if ( (synpred5_InternalClassdef()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA16_5 = input.LA(2);

                    if ( (synpred6_InternalClassdef()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA16_6 = input.LA(2);

                    if ( (synpred6_InternalClassdef()) ) {
                        alt16=2;
                    }


                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:911:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:911:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:911:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:911:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:911:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:913:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:913:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:913:6: ()
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:914:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXRelationalExpression2086); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:923:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:924:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:924:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:925:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2109);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:942:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:942:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:942:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:942:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:942:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:947:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:947:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:947:7: ()
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:948:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:953:2: ( ( ruleOpCompare ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:954:1: ( ruleOpCompare )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:954:1: ( ruleOpCompare )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:955:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2170);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:968:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:969:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:969:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:970:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2193);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:994:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:995:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:996:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2233);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2244); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1003:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1006:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1007:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1007:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt17=1;
                }
                break;
            case 27:
                {
                alt17=2;
                }
                break;
            case 28:
                {
                alt17=3;
                }
                break;
            case 29:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1008:2: kw= '>='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2282); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1015:2: kw= '<='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2301); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1022:2: kw= '>'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpCompare2320); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1029:2: kw= '<'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpCompare2339); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1042:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1043:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1044:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2379);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2389); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1051:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1054:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1055:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1055:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1056:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2436);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1064:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1064:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1064:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1064:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1069:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1069:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1069:7: ()
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1070:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1075:2: ( ( ruleOpOther ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1076:1: ( ruleOpOther )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1076:1: ( ruleOpOther )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1077:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2489);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1090:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1091:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1091:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1092:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2512);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1116:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1117:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1118:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2551);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2562); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1125:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1128:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1129:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1129:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt21=8;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt21=1;
                }
                break;
            case 31:
                {
                alt21=2;
                }
                break;
            case 32:
                {
                alt21=3;
                }
                break;
            case 28:
                {
                alt21=4;
                }
                break;
            case 29:
                {
                alt21=5;
                }
                break;
            case 33:
                {
                alt21=6;
                }
                break;
            case 34:
                {
                alt21=7;
                }
                break;
            case 35:
                {
                alt21=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1130:2: kw= '->'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2600); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1137:2: kw= '..'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2619); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1144:2: kw= '=>'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2638); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1150:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1150:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1151:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2658); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1156:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==28) ) {
                        int LA19_1 = input.LA(2);

                        if ( (LA19_1==EOF||(LA19_1>=RULE_ID && LA19_1<=RULE_DECIMAL)||LA19_1==29||(LA19_1>=36 && LA19_1<=37)||LA19_1==42||LA19_1==48||LA19_1==50||LA19_1==54||(LA19_1>=56 && LA19_1<=57)||(LA19_1>=61 && LA19_1<=63)||LA19_1==66||(LA19_1>=68 && LA19_1<=75)) ) {
                            alt19=2;
                        }
                        else if ( (LA19_1==28) && (synpred8_InternalClassdef())) {
                            alt19=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1156:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1156:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1156:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1160:5: (kw= '>' kw= '>' )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1161:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2689); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2702); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1174:2: kw= '>'
                            {
                            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2723); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1180:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1180:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1181:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2745); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1186:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==29) ) {
                        int LA20_1 = input.LA(2);

                        if ( (synpred9_InternalClassdef()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1186:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1186:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1186:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1190:5: (kw= '<' kw= '<' )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1191:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2776); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2789); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1204:2: kw= '<'
                            {
                            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2810); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1211:2: kw= '<>'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2831); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1218:2: kw= '?:'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpOther2850); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1225:2: kw= '<=>'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther2869); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_7()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1238:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1239:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1240:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2909);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2919); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1247:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1250:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1251:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1251:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1252:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2966);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1260:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred10_InternalClassdef()) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==37) ) {
                    int LA22_3 = input.LA(2);

                    if ( (synpred10_InternalClassdef()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1260:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1260:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1260:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1265:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1265:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1265:7: ()
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1266:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1271:2: ( ( ruleOpAdd ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1272:1: ( ruleOpAdd )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1272:1: ( ruleOpAdd )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1273:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3019);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1286:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1287:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1287:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1288:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3042);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1312:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1313:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1314:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3081);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3092); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1321:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1324:28: ( (kw= '+' | kw= '-' ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1325:1: (kw= '+' | kw= '-' )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1325:1: (kw= '+' | kw= '-' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            else if ( (LA23_0==37) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1326:2: kw= '+'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpAdd3130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1333:2: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpAdd3149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1346:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1347:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1348:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3189);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3199); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1355:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1358:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1359:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1359:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1360:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3246);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1368:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    int LA24_2 = input.LA(2);

                    if ( (synpred11_InternalClassdef()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA24_3 = input.LA(2);

                    if ( (synpred11_InternalClassdef()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA24_4 = input.LA(2);

                    if ( (synpred11_InternalClassdef()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA24_5 = input.LA(2);

                    if ( (synpred11_InternalClassdef()) ) {
                        alt24=1;
                    }


                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1368:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1368:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1368:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1373:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1373:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1373:7: ()
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1374:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1379:2: ( ( ruleOpMulti ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1380:1: ( ruleOpMulti )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1380:1: ( ruleOpMulti )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1381:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3299);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1394:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1395:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1395:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1396:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3322);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1420:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1421:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1422:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3361);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3372); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1429:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1432:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1433:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1433:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt25=1;
                }
                break;
            case 39:
                {
                alt25=2;
                }
                break;
            case 40:
                {
                alt25=3;
                }
                break;
            case 41:
                {
                alt25=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1434:2: kw= '*'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpMulti3410); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1441:2: kw= '**'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpMulti3429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1448:2: kw= '/'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpMulti3448); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1455:2: kw= '%'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpMulti3467); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1468:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1469:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1470:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3507);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3517); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1477:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1480:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1481:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1481:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=36 && LA26_0<=37)||LA26_0==42) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_DECIMAL)||LA26_0==29||LA26_0==48||LA26_0==50||LA26_0==54||(LA26_0>=56 && LA26_0<=57)||(LA26_0>=61 && LA26_0<=63)||LA26_0==66||(LA26_0>=68 && LA26_0<=75)) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1481:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1481:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1481:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1481:3: ()
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1482:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1487:2: ( ( ruleOpUnary ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1488:1: ( ruleOpUnary )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1488:1: ( ruleOpUnary )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1489:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3575);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1502:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1503:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1503:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1504:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3596);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1522:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3625);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1538:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1539:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1540:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3661);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3672); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1547:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1550:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1551:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1551:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt27=1;
                }
                break;
            case 37:
                {
                alt27=2;
                }
                break;
            case 36:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1552:2: kw= '!'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpUnary3710); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1559:2: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpUnary3729); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1566:2: kw= '+'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpUnary3748); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1579:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1580:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1581:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3788);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3798); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1588:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1591:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1592:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1592:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1593:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3845);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1601:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==43) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred12_InternalClassdef()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1601:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1601:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1601:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1603:5: ( () otherlv_2= 'as' )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1603:6: () otherlv_2= 'as'
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1603:6: ()
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1604:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXCastedExpression3880); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1613:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1614:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1614:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1615:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3903);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1639:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1640:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1641:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3941);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3951); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1648:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1651:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1652:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1652:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1653:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3998);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1661:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop36:
            do {
                int alt36=3;
                switch ( input.LA(1) ) {
                case 44:
                    {
                    int LA36_2 = input.LA(2);

                    if ( (synpred13_InternalClassdef()) ) {
                        alt36=1;
                    }
                    else if ( (synpred14_InternalClassdef()) ) {
                        alt36=2;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA36_3 = input.LA(2);

                    if ( (synpred14_InternalClassdef()) ) {
                        alt36=2;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA36_4 = input.LA(2);

                    if ( (synpred14_InternalClassdef()) ) {
                        alt36=2;
                    }


                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1661:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1661:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1661:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1661:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1661:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1667:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1667:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1667:26: ()
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1668:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4047); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1677:1: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1678:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1678:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1679:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4070);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4086);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1700:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1701:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1701:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1702:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4108);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1719:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1719:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1719:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1719:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1719:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1735:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1735:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1735:8: ()
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1736:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1741:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case 44:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1741:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4194); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1746:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1746:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1747:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1747:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1748:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4218); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1762:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1762:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1763:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1763:1: (lv_spreading_9_0= '*.' )
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1764:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall4255); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1777:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==29) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1777:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,29,FOLLOW_29_in_ruleXMemberFeatureCall4284); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1781:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1782:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1782:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1783:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4305);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1799:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop30:
            	            do {
            	                int alt30=2;
            	                int LA30_0 = input.LA(1);

            	                if ( (LA30_0==47) ) {
            	                    alt30=1;
            	                }


            	                switch (alt30) {
            	            	case 1 :
            	            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1799:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall4318); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1803:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1804:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1804:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1805:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4339);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop30;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall4353); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1825:3: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1826:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1826:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1827:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4378);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1840:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt34=2;
            	    alt34 = dfa34.predict(input);
            	    switch (alt34) {
            	        case 1 :
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1840:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1840:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1840:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1847:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1848:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall4412); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1861:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt33=3;
            	            alt33 = dfa33.predict(input);
            	            switch (alt33) {
            	                case 1 :
            	                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1861:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1861:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1861:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1878:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1879:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4497);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1896:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1896:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1896:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1896:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1897:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1897:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1898:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4525);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1914:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop32:
            	                    do {
            	                        int alt32=2;
            	                        int LA32_0 = input.LA(1);

            	                        if ( (LA32_0==47) ) {
            	                            alt32=1;
            	                        }


            	                        switch (alt32) {
            	                    	case 1 :
            	                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1914:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall4538); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1918:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1919:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1919:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1920:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4559);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop32;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,49,FOLLOW_49_in_ruleXMemberFeatureCall4576); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1940:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt35=2;
            	    alt35 = dfa35.predict(input);
            	    switch (alt35) {
            	        case 1 :
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1940:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1943:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1944:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4611);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1968:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1969:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1970:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4651);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4661); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1977:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1980:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1981:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1981:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt37=13;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1982:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4708);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1992:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4735);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2002:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4762);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2012:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4789);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2022:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4816);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2032:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4843);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2042:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4870);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2052:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4897);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2062:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4924);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2072:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4951);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2082:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4978);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2092:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5005);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2102:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5032);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2118:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2119:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2120:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5067);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5077); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2127:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XNumberLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2130:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2131:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2131:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt38=6;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==50) && (synpred18_InternalClassdef())) {
                alt38=1;
            }
            else if ( ((LA38_0>=69 && LA38_0<=70)) ) {
                alt38=2;
            }
            else if ( ((LA38_0>=RULE_HEX && LA38_0<=RULE_DECIMAL)) ) {
                alt38=3;
            }
            else if ( (LA38_0==71) ) {
                alt38=4;
            }
            else if ( (LA38_0==RULE_STRING) ) {
                alt38=5;
            }
            else if ( (LA38_0==72) ) {
                alt38=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2131:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2131:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2131:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5137);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2144:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5165);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2154:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5192);
                    this_XNumberLiteral_2=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2164:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5219);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2174:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5246);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2184:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5273);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2200:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2201:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2202:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5308);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5318); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2209:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2212:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2213:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2213:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2213:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2213:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2213:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2215:5: ( () otherlv_1= '[' )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2215:6: () otherlv_1= '['
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2215:6: ()
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2216:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXClosure5378); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2225:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2225:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2240:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2240:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2240:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID||LA40_0==32||LA40_0==48) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2240:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2240:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2241:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2241:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2242:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5451);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2258:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==47) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2258:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleXClosure5464); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2262:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2263:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2263:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2264:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5485);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop39;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2280:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2281:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2281:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2282:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,51,FOLLOW_51_in_ruleXClosure5507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_1_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2295:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2296:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2296:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2297:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5544);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,52,FOLLOW_52_in_ruleXClosure5556); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2325:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2326:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2327:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5592);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5602); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2334:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2337:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2338:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2338:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2338:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2338:2: ()
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2339:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2344:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_DECIMAL)||LA43_0==29||(LA43_0>=36 && LA43_0<=37)||LA43_0==42||LA43_0==48||LA43_0==50||LA43_0==54||(LA43_0>=56 && LA43_0<=57)||(LA43_0>=61 && LA43_0<=66)||(LA43_0>=68 && LA43_0<=75)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2344:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2344:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2345:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2345:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2346:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5658);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2362:2: (otherlv_2= ';' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==53) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2362:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleXExpressionInClosure5671); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2374:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2375:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2376:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5711);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5721); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2383:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2386:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2387:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2387:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2387:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2387:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2387:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2403:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2403:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2403:7: ()
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2404:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2409:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==32||LA45_0==48) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2409:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2409:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2410:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2410:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2411:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5829);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2427:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==47) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2427:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXShortClosure5842); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2431:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2432:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2432:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2433:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5863);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2449:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2450:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2450:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2451:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,51,FOLLOW_51_in_ruleXShortClosure5885); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2464:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2465:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2465:1: (lv_expression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2466:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5921);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2490:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2491:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2492:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5957);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5967); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2499:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2502:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2503:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2503:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2503:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleXParenthesizedExpression6004); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6026);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXParenthesizedExpression6037); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2528:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2529:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2530:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6073);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6083); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2537:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2540:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2541:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2541:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2541:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2541:2: ()
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2542:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXIfExpression6129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXIfExpression6141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2555:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2556:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2556:1: (lv_if_3_0= ruleXExpression )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2557:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6162);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXIfExpression6174); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2577:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2578:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2578:1: (lv_then_5_0= ruleXExpression )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2579:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6195);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2595:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==55) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred22_InternalClassdef()) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2595:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2595:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2595:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleXIfExpression6216); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2600:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2601:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2601:1: (lv_else_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2602:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6238);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2626:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2627:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2628:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6276);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6286); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2635:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        AntlrDatatypeRuleToken lv_localVarName_6_0 = null;

        EObject lv_switch_8_0 = null;

        EObject lv_cases_11_0 = null;

        EObject lv_default_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2638:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2639:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2639:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2639:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2639:2: ()
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2640:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6332); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2649:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_DECIMAL)||LA48_0==29||(LA48_0>=36 && LA48_0<=37)||LA48_0==42||LA48_0==50||LA48_0==54||(LA48_0>=56 && LA48_0<=57)||(LA48_0>=61 && LA48_0<=63)||LA48_0==66||(LA48_0>=68 && LA48_0<=75)) ) {
                alt48=1;
            }
            else if ( (LA48_0==48) ) {
                int LA48_2 = input.LA(2);

                if ( (LA48_2==RULE_ID) ) {
                    int LA48_3 = input.LA(3);

                    if ( ((LA48_3>=19 && LA48_3<=41)||(LA48_3>=43 && LA48_3<=46)||(LA48_3>=48 && LA48_3<=50)||LA48_3==67) ) {
                        alt48=1;
                    }
                    else if ( (LA48_3==18) && (synpred24_InternalClassdef())) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA48_2>=RULE_STRING && LA48_2<=RULE_DECIMAL)||LA48_2==29||(LA48_2>=36 && LA48_2<=37)||LA48_2==42||LA48_2==48||LA48_2==50||LA48_2==54||(LA48_2>=56 && LA48_2<=57)||(LA48_2>=61 && LA48_2<=63)||LA48_2==66||(LA48_2>=68 && LA48_2<=75)) ) {
                    alt48=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2649:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2649:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2649:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2649:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_ID) ) {
                        int LA47_1 = input.LA(2);

                        if ( (LA47_1==18) && (synpred23_InternalClassdef())) {
                            alt47=1;
                        }
                    }
                    switch (alt47) {
                        case 1 :
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2649:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2654:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2654:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2654:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2655:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2655:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2656:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6375);
                            lv_localVarName_2_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"localVarName",
                                      		lv_localVarName_2_0, 
                                      		"ValidID");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleXSwitchExpression6387); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2676:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2677:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2677:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2678:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6411);
                    lv_switch_4_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_4_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2695:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2695:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2695:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2695:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2695:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2701:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2701:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression6455); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2705:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2706:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2706:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2707:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6476);
                    lv_localVarName_6_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_6_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleXSwitchExpression6488); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2727:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2728:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2728:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2729:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6511);
                    lv_switch_8_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_8_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression6523); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6537); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2753:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID||LA49_0==18||LA49_0==32||LA49_0==48||LA49_0==60) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2754:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2754:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2755:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6558);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_11_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2771:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==58) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2771:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,58,FOLLOW_58_in_ruleXSwitchExpression6572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleXSwitchExpression6584); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2779:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2780:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2780:1: (lv_default_14_0= ruleXExpression )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2781:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6605);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_14_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,59,FOLLOW_59_in_ruleXSwitchExpression6619); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2809:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2810:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2811:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6655);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6665); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2818:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2821:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2822:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2822:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2822:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2822:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||LA51_0==32||LA51_0==48) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2823:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2823:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2824:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6711);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2840:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==60) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2840:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXCasePart6725); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2844:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2845:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2845:1: (lv_case_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2846:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6746);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleXCasePart6760); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2866:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2867:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2867:1: (lv_then_4_0= ruleXExpression )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2868:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6781);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2892:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2893:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2894:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6817);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6827); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2901:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2904:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2905:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2905:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2905:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2905:2: ()
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2906:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXForLoopExpression6873); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXForLoopExpression6885); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2919:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2920:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2920:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2921:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6906);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleXForLoopExpression6918); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2941:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2942:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2942:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2943:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6939);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,49,FOLLOW_49_in_ruleXForLoopExpression6951); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2963:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2964:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2964:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2965:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6972);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2989:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2990:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2991:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7008);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7018); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2998:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3001:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3002:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3002:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3002:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3002:2: ()
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3003:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXWhileExpression7064); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXWhileExpression7076); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3016:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3017:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3017:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3018:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7097);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXWhileExpression7109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3038:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3039:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3039:1: (lv_body_5_0= ruleXExpression )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3040:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7130);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3064:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3065:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3066:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7166);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7176); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3073:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3076:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3077:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3077:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3077:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3077:2: ()
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3078:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXDoWhileExpression7222); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3087:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3088:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3088:1: (lv_body_2_0= ruleXExpression )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3089:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7243);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,62,FOLLOW_62_in_ruleXDoWhileExpression7255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXDoWhileExpression7267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3113:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3114:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3114:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3115:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7288);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,49,FOLLOW_49_in_ruleXDoWhileExpression7300); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3143:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3144:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3145:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7336);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7346); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3152:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3155:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3156:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3156:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3156:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3156:2: ()
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3157:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXBlockExpression7392); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3166:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_DECIMAL)||LA54_0==29||(LA54_0>=36 && LA54_0<=37)||LA54_0==42||LA54_0==48||LA54_0==50||LA54_0==54||(LA54_0>=56 && LA54_0<=57)||(LA54_0>=61 && LA54_0<=66)||(LA54_0>=68 && LA54_0<=75)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3166:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3166:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3167:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3167:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3168:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7414);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3184:2: (otherlv_3= ';' )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==53) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3184:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleXBlockExpression7427); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_4=(Token)match(input,59,FOLLOW_59_in_ruleXBlockExpression7443); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3200:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3201:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3202:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7479);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7489); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3209:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3212:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3213:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3213:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=64 && LA55_0<=65)) ) {
                alt55=1;
            }
            else if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_DECIMAL)||LA55_0==29||(LA55_0>=36 && LA55_0<=37)||LA55_0==42||LA55_0==48||LA55_0==50||LA55_0==54||(LA55_0>=56 && LA55_0<=57)||(LA55_0>=61 && LA55_0<=63)||LA55_0==66||(LA55_0>=68 && LA55_0<=75)) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3214:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7536);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3224:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7563);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3240:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3241:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3242:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7598);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7608); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3249:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3252:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3253:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3253:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3253:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3253:2: ()
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3254:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3259:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==64) ) {
                alt56=1;
            }
            else if ( (LA56_0==65) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3259:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3259:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3260:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3260:1: (lv_writeable_1_0= 'var' )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3261:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,64,FOLLOW_64_in_ruleXVariableDeclaration7661); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3275:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleXVariableDeclaration7692); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3279:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (synpred25_InternalClassdef()) ) {
                    alt57=1;
                }
                else if ( (true) ) {
                    alt57=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA57_0==48) && (synpred25_InternalClassdef())) {
                alt57=1;
            }
            else if ( (LA57_0==32) && (synpred25_InternalClassdef())) {
                alt57=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3279:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3279:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3279:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3287:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3287:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3287:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3288:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3288:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3289:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7740);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3305:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3306:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3306:1: (lv_name_4_0= ruleValidID )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3307:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7761);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3324:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3324:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3325:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3325:1: (lv_name_5_0= ruleValidID )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3326:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7790);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3342:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==19) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3342:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleXVariableDeclaration7804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3346:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3347:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3347:1: (lv_right_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3348:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7825);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3372:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3373:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3374:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7863);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7873); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3381:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3384:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3385:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3385:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3385:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3385:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==RULE_ID||LA59_1==29||LA59_1==44||LA59_1==50) ) {
                    alt59=1;
                }
            }
            else if ( (LA59_0==32||LA59_0==48) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3386:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3386:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3387:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7919);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3403:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3404:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3404:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3405:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7941);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3429:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3430:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3431:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7977);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7987); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3438:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3441:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3442:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3442:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3442:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3442:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3443:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3443:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3444:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8033);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3460:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3461:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3461:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3462:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8054);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3486:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3487:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3488:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8090);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8100); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3495:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3498:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3499:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3499:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3499:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3499:2: ()
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3500:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3505:2: ( ( ruleStaticQualifier ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==67) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3506:1: ( ruleStaticQualifier )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3506:1: ( ruleStaticQualifier )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3507:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8157);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3520:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==29) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3520:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleXFeatureCall8171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3524:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3525:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3525:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3526:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8192);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3542:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==47) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3542:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXFeatureCall8205); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3546:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3547:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3547:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3548:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8226);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleXFeatureCall8240); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3568:3: ( ( ruleIdOrSuper ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3569:1: ( ruleIdOrSuper )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3569:1: ( ruleIdOrSuper )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3570:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8265);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3583:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3583:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3583:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3583:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3590:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3591:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,48,FOLLOW_48_in_ruleXFeatureCall8299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3604:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt64=3;
                    alt64 = dfa64.predict(input);
                    switch (alt64) {
                        case 1 :
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3604:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3604:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3604:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3621:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3622:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8384);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3639:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3639:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3639:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3639:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3640:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3640:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3641:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8412);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3657:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==47) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3657:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,47,FOLLOW_47_in_ruleXFeatureCall8425); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3661:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3662:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3662:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3663:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8446);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop63;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,49,FOLLOW_49_in_ruleXFeatureCall8463); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3683:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3683:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3686:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3687:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8498);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3711:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3712:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3713:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8536);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8547); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3720:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3723:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3724:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3724:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                alt67=1;
            }
            else if ( (LA67_0==66) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3725:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8594);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3737:2: kw= 'super'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleIdOrSuper8618); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3750:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3751:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3752:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8659);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8670); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3759:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3762:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3763:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3763:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_ID) ) {
                    int LA68_2 = input.LA(2);

                    if ( (LA68_2==67) ) {
                        alt68=1;
                    }


                }


                switch (alt68) {
            	case 1 :
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3764:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8717);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,67,FOLLOW_67_in_ruleStaticQualifier8735); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt68 >= 1 ) break loop68;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(68, input);
                        throw eee;
                }
                cnt68++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3788:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3789:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3790:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8776);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8786); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3797:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3800:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3801:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3801:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3801:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3801:2: ()
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3802:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXConstructorCall8832); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3811:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3812:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3812:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3813:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8855);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3826:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3826:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3826:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3826:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleXConstructorCall8876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3831:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3832:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3832:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3833:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8898);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3849:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==47) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3849:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleXConstructorCall8911); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3853:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3854:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3854:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3855:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8932);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleXConstructorCall8946); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3875:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3875:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3875:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3875:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleXConstructorCall8969); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3880:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt72=3;
                    alt72 = dfa72.predict(input);
                    switch (alt72) {
                        case 1 :
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3880:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3880:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3880:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3897:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3898:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9042);
                            lv_arguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3915:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3915:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3915:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3915:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3916:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3916:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3917:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9070);
                            lv_arguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3933:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( (LA71_0==47) ) {
                                    alt71=1;
                                }


                                switch (alt71) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3933:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,47,FOLLOW_47_in_ruleXConstructorCall9083); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3937:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3938:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3938:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3939:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9104);
                            	    lv_arguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop71;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,49,FOLLOW_49_in_ruleXConstructorCall9121); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3959:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3959:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3962:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3963:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9156);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3987:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3988:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3989:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9193);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9203); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3996:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3999:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4000:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4000:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4000:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4000:2: ()
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4001:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4006:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==69) ) {
                alt75=1;
            }
            else if ( (LA75_0==70) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4006:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXBooleanLiteral9250); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4011:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4011:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4012:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4012:1: (lv_isTrue_2_0= 'true' )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4013:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,70,FOLLOW_70_in_ruleXBooleanLiteral9274); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4034:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4035:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4036:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9324);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9334); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4043:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4046:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4047:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4047:1: ( () otherlv_1= 'null' )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4047:2: () otherlv_1= 'null'
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4047:2: ()
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4048:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXNullLiteral9380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXNumberLiteral"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4065:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4066:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4067:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9416);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9426); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4074:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4077:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4078:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4078:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4078:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4078:2: ()
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4079:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4084:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4085:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4085:1: (lv_value_1_0= ruleNumber )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4086:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9481);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Number");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4110:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4111:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4112:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9517);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9527); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4119:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4122:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4123:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4123:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4123:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4123:2: ()
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4124:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4129:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4130:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4130:1: (lv_value_1_0= RULE_STRING )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4131:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9578); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4155:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4156:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4157:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9619);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9629); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4164:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4167:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4168:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4168:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4168:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4168:2: ()
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4169:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXTypeLiteral9675); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXTypeLiteral9687); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4182:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4183:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4183:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4184:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9710);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXTypeLiteral9722); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4209:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4210:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4211:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9758);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9768); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4218:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4221:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4222:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4222:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4222:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4222:2: ()
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4223:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXThrowExpression9814); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4232:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4233:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4233:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4234:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9835);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4258:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4259:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4260:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9871);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9881); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4267:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4270:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4271:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4271:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4271:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4271:2: ()
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4272:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXReturnExpression9927); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4281:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4281:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4286:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4287:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9958);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4311:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4312:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4313:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9995);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10005); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4320:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4323:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4324:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4324:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4324:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4324:2: ()
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4325:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXTryCatchFinallyExpression10051); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4334:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4335:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4335:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4336:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10072);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4352:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==77) ) {
                alt79=1;
            }
            else if ( (LA79_0==76) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4352:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4352:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4352:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4352:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==77) ) {
                            int LA77_2 = input.LA(2);

                            if ( (synpred34_InternalClassdef()) ) {
                                alt77=1;
                            }


                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4352:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4354:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4355:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10102);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt77 >= 1 ) break loop77;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(77, input);
                                throw eee;
                        }
                        cnt77++;
                    } while (true);

                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4371:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==76) ) {
                        int LA78_1 = input.LA(2);

                        if ( (synpred35_InternalClassdef()) ) {
                            alt78=1;
                        }
                    }
                    switch (alt78) {
                        case 1 :
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4371:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4371:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4371:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,76,FOLLOW_76_in_ruleXTryCatchFinallyExpression10124); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4376:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4377:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4377:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4378:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10146);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4395:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4395:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4395:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,76,FOLLOW_76_in_ruleXTryCatchFinallyExpression10168); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4399:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4400:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4400:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4401:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10189);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4425:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4426:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4427:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10227);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10237); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4434:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4437:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4438:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4438:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4438:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4438:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4438:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleXCatchClause10282); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXCatchClause10295); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4447:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4448:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4448:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4449:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10316);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleXCatchClause10328); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4469:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4470:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4470:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4471:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10349);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4495:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4496:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4497:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10386);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10397); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4504:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4507:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4508:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4508:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4509:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10444);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4519:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==44) ) {
                    int LA80_2 = input.LA(2);

                    if ( (LA80_2==RULE_ID) ) {
                        int LA80_3 = input.LA(3);

                        if ( (synpred37_InternalClassdef()) ) {
                            alt80=1;
                        }


                    }


                }


                switch (alt80) {
            	case 1 :
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4519:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4519:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4519:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,44,FOLLOW_44_in_ruleQualifiedName10472); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10495);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleNumber"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4546:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4550:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4551:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10549);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10560); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4561:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4565:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4566:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4566:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_HEX) ) {
                alt84=1;
            }
            else if ( ((LA84_0>=RULE_INT && LA84_0<=RULE_DECIMAL)) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4566:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10604); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4574:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4574:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4574:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4574:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==RULE_INT) ) {
                        alt81=1;
                    }
                    else if ( (LA81_0==RULE_DECIMAL) ) {
                        alt81=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        throw nvae;
                    }
                    switch (alt81) {
                        case 1 :
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4574:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10632); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4582:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10658); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4589:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==44) ) {
                        int LA83_1 = input.LA(2);

                        if ( ((LA83_1>=RULE_INT && LA83_1<=RULE_DECIMAL)) ) {
                            alt83=1;
                        }
                    }
                    switch (alt83) {
                        case 1 :
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4590:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,44,FOLLOW_44_in_ruleNumber10678); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4595:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt82=2;
                            int LA82_0 = input.LA(1);

                            if ( (LA82_0==RULE_INT) ) {
                                alt82=1;
                            }
                            else if ( (LA82_0==RULE_DECIMAL) ) {
                                alt82=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 82, 0, input);

                                throw nvae;
                            }
                            switch (alt82) {
                                case 1 :
                                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4595:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10694); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4603:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10720); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_DECIMAL_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4621:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4622:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4623:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10773);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10783); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4630:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4633:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4634:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4634:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_ID) ) {
                alt86=1;
            }
            else if ( (LA86_0==32||LA86_0==48) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4634:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4634:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4635:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10831);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4643:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==50) ) {
                            int LA85_2 = input.LA(2);

                            if ( (LA85_2==52) ) {
                                int LA85_3 = input.LA(3);

                                if ( (synpred38_InternalClassdef()) ) {
                                    alt85=1;
                                }


                            }


                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4643:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4646:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4646:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4646:6: ()
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4647:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleJvmTypeReference10869); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleJvmTypeReference10881); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4662:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10913);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4678:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4679:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4680:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10948);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10958); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4687:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4690:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4691:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4691:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4691:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4691:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==48) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4691:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleXFunctionTypeRef10996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4695:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==RULE_ID||LA88_0==32||LA88_0==48) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4695:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4695:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4696:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4696:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4697:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11018);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"paramTypes",
                                      		lv_paramTypes_1_0, 
                                      		"JvmTypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4713:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop87:
                            do {
                                int alt87=2;
                                int LA87_0 = input.LA(1);

                                if ( (LA87_0==47) ) {
                                    alt87=1;
                                }


                                switch (alt87) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4713:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXFunctionTypeRef11031); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4717:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4718:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4718:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4719:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11052);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"paramTypes",
                            	              		lv_paramTypes_3_0, 
                            	              		"JvmTypeReference");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop87;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXFunctionTypeRef11068); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleXFunctionTypeRef11082); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4743:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4744:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4744:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4745:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11103);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4769:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4770:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4771:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11139);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11149); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4778:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4781:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4782:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4782:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4782:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4782:2: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4783:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4783:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4784:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11197);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4797:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt91=2;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4797:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4797:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4797:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleJvmParameterizedTypeReference11218); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4802:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4803:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4803:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4804:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11240);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4820:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==47) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4820:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleJvmParameterizedTypeReference11253); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4824:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4825:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4825:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4826:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11274);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleJvmParameterizedTypeReference11288); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4854:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4855:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4856:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11326);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11336); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4863:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4866:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4867:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4867:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_ID||LA92_0==32||LA92_0==48) ) {
                alt92=1;
            }
            else if ( (LA92_0==78) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4868:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11383);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4878:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11410);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4894:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4895:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4896:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11445);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11455); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4903:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4906:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4907:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4907:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4907:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4907:2: ()
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4908:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleJvmWildcardTypeReference11501); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4917:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt93=3;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==79) ) {
                alt93=1;
            }
            else if ( (LA93_0==66) ) {
                alt93=2;
            }
            switch (alt93) {
                case 1 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4917:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4917:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4918:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4918:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4919:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11523);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4936:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4936:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4937:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4937:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4938:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11550);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4962:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4963:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4964:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11588);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11598); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4971:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4974:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4975:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4975:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4975:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleJvmUpperBound11635); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4979:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4980:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4980:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4981:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11656);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5005:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5006:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5007:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11692);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11702); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5014:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5017:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5018:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5018:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5018:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleJvmUpperBoundAnded11739); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5022:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5023:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5023:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5024:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11760);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5048:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5049:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5050:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11796);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11806); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5057:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5060:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5061:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5061:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5061:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleJvmLowerBound11843); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5065:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5066:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5066:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5067:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11864);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5093:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5094:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5095:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11903);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11914); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5102:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5105:28: (this_ID_0= RULE_ID )
            // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:5106:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11953); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalClassdef
    public final void synpred1_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:473:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:473:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:473:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:473:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:473:5: ()
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:474:1: 
        {
        }

        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:474:2: ( ( ruleOpMultiAssign ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:475:1: ( ruleOpMultiAssign )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:475:1: ( ruleOpMultiAssign )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:476:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalClassdef925);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalClassdef

    // $ANTLR start synpred2_InternalClassdef
    public final void synpred2_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:601:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:601:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:601:4: ( () ( ( ruleOpOr ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:601:5: () ( ( ruleOpOr ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:601:5: ()
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:602:1: 
        {
        }

        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:602:2: ( ( ruleOpOr ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:603:1: ( ruleOpOr )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:603:1: ( ruleOpOr )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:604:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalClassdef1273);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalClassdef

    // $ANTLR start synpred3_InternalClassdef
    public final void synpred3_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:702:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:702:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:702:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:702:5: () ( ( ruleOpAnd ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:702:5: ()
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:703:1: 
        {
        }

        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:703:2: ( ( ruleOpAnd ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:704:1: ( ruleOpAnd )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:704:1: ( ruleOpAnd )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:705:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalClassdef1532);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalClassdef

    // $ANTLR start synpred4_InternalClassdef
    public final void synpred4_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:803:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:803:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:803:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:803:5: () ( ( ruleOpEquality ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:803:5: ()
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:804:1: 
        {
        }

        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:804:2: ( ( ruleOpEquality ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:805:1: ( ruleOpEquality )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:805:1: ( ruleOpEquality )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:806:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalClassdef1791);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalClassdef

    // $ANTLR start synpred5_InternalClassdef
    public final void synpred5_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:911:4: ( ( () 'instanceof' ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:911:5: ( () 'instanceof' )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:911:5: ( () 'instanceof' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:911:6: () 'instanceof'
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:911:6: ()
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:912:1: 
        {
        }

        match(input,25,FOLLOW_25_in_synpred5_InternalClassdef2067); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalClassdef

    // $ANTLR start synpred6_InternalClassdef
    public final void synpred6_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:942:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:942:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:942:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:942:10: () ( ( ruleOpCompare ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:942:10: ()
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:943:1: 
        {
        }

        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:943:2: ( ( ruleOpCompare ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:944:1: ( ruleOpCompare )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:944:1: ( ruleOpCompare )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:945:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalClassdef2138);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalClassdef

    // $ANTLR start synpred7_InternalClassdef
    public final void synpred7_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1064:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1064:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1064:4: ( () ( ( ruleOpOther ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1064:5: () ( ( ruleOpOther ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1064:5: ()
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1065:1: 
        {
        }

        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1065:2: ( ( ruleOpOther ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1066:1: ( ruleOpOther )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1066:1: ( ruleOpOther )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1067:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalClassdef2457);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalClassdef

    // $ANTLR start synpred8_InternalClassdef
    public final void synpred8_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1156:3: ( ( '>' '>' ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1156:4: ( '>' '>' )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1156:4: ( '>' '>' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1157:2: '>' '>'
        {
        match(input,28,FOLLOW_28_in_synpred8_InternalClassdef2673); if (state.failed) return ;
        match(input,28,FOLLOW_28_in_synpred8_InternalClassdef2678); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalClassdef

    // $ANTLR start synpred9_InternalClassdef
    public final void synpred9_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1186:3: ( ( '<' '<' ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1186:4: ( '<' '<' )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1186:4: ( '<' '<' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1187:2: '<' '<'
        {
        match(input,29,FOLLOW_29_in_synpred9_InternalClassdef2760); if (state.failed) return ;
        match(input,29,FOLLOW_29_in_synpred9_InternalClassdef2765); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalClassdef

    // $ANTLR start synpred10_InternalClassdef
    public final void synpred10_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1260:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1260:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1260:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1260:5: () ( ( ruleOpAdd ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1260:5: ()
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1261:1: 
        {
        }

        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1261:2: ( ( ruleOpAdd ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1262:1: ( ruleOpAdd )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1262:1: ( ruleOpAdd )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1263:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalClassdef2987);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalClassdef

    // $ANTLR start synpred11_InternalClassdef
    public final void synpred11_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1368:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1368:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1368:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1368:5: () ( ( ruleOpMulti ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1368:5: ()
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1369:1: 
        {
        }

        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1369:2: ( ( ruleOpMulti ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1370:1: ( ruleOpMulti )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1370:1: ( ruleOpMulti )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1371:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalClassdef3267);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalClassdef

    // $ANTLR start synpred12_InternalClassdef
    public final void synpred12_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1601:3: ( ( () 'as' ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1601:4: ( () 'as' )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1601:4: ( () 'as' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1601:5: () 'as'
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1601:5: ()
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1602:1: 
        {
        }

        match(input,43,FOLLOW_43_in_synpred12_InternalClassdef3861); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalClassdef

    // $ANTLR start synpred13_InternalClassdef
    public final void synpred13_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1661:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1661:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1661:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1661:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1661:6: ()
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1662:1: 
        {
        }

        match(input,44,FOLLOW_44_in_synpred13_InternalClassdef4015); if (state.failed) return ;
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1663:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1664:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1664:1: ( ruleValidID )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1665:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred13_InternalClassdef4024);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalClassdef4030);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalClassdef

    // $ANTLR start synpred14_InternalClassdef
    public final void synpred14_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1719:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1719:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1719:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1719:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1719:10: ()
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1720:1: 
        {
        }

        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1720:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt94=3;
        switch ( input.LA(1) ) {
        case 44:
            {
            alt94=1;
            }
            break;
        case 45:
            {
            alt94=2;
            }
            break;
        case 46:
            {
            alt94=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 94, 0, input);

            throw nvae;
        }

        switch (alt94) {
            case 1 :
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1720:4: '.'
                {
                match(input,44,FOLLOW_44_in_synpred14_InternalClassdef4133); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1722:6: ( ( '?.' ) )
                {
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1722:6: ( ( '?.' ) )
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1723:1: ( '?.' )
                {
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1723:1: ( '?.' )
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1724:2: '?.'
                {
                match(input,45,FOLLOW_45_in_synpred14_InternalClassdef4147); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1729:6: ( ( '*.' ) )
                {
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1729:6: ( ( '*.' ) )
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1730:1: ( '*.' )
                {
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1730:1: ( '*.' )
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1731:2: '*.'
                {
                match(input,46,FOLLOW_46_in_synpred14_InternalClassdef4167); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalClassdef

    // $ANTLR start synpred15_InternalClassdef
    public final void synpred15_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1840:4: ( ( '(' ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1841:1: ( '(' )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1841:1: ( '(' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1842:2: '('
        {
        match(input,48,FOLLOW_48_in_synpred15_InternalClassdef4394); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalClassdef

    // $ANTLR start synpred16_InternalClassdef
    public final void synpred16_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1861:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1861:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1861:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1861:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1861:6: ()
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1862:1: 
        {
        }

        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1862:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==RULE_ID||LA96_0==32||LA96_0==48) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1862:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1862:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1863:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1863:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1864:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalClassdef4446);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1866:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==47) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1866:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,47,FOLLOW_47_in_synpred16_InternalClassdef4453); if (state.failed) return ;
                	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1867:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1868:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1868:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1869:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalClassdef4460);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop95;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1871:6: ( ( '|' ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1872:1: ( '|' )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1872:1: ( '|' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1873:2: '|'
        {
        match(input,51,FOLLOW_51_in_synpred16_InternalClassdef4474); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalClassdef

    // $ANTLR start synpred17_InternalClassdef
    public final void synpred17_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1940:4: ( ( () '[' ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1940:5: ( () '[' )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1940:5: ( () '[' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1940:6: () '['
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1940:6: ()
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:1941:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred17_InternalClassdef4594); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalClassdef

    // $ANTLR start synpred18_InternalClassdef
    public final void synpred18_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2131:3: ( ( () '[' ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2131:4: ( () '[' )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2131:4: ( () '[' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2131:5: () '['
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2131:5: ()
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2132:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred18_InternalClassdef5118); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalClassdef

    // $ANTLR start synpred20_InternalClassdef
    public final void synpred20_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2225:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2225:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2225:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2225:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2225:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt98=2;
        int LA98_0 = input.LA(1);

        if ( (LA98_0==RULE_ID||LA98_0==32||LA98_0==48) ) {
            alt98=1;
        }
        switch (alt98) {
            case 1 :
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2225:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2225:7: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2226:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2226:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2227:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalClassdef5397);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2229:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop97:
                do {
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==47) ) {
                        alt97=1;
                    }


                    switch (alt97) {
                	case 1 :
                	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2229:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,47,FOLLOW_47_in_synpred20_InternalClassdef5404); if (state.failed) return ;
                	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2230:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2231:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2231:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2232:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalClassdef5411);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop97;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2234:6: ( ( '|' ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2235:1: ( '|' )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2235:1: ( '|' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2236:2: '|'
        {
        match(input,51,FOLLOW_51_in_synpred20_InternalClassdef5425); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalClassdef

    // $ANTLR start synpred22_InternalClassdef
    public final void synpred22_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2595:4: ( 'else' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2595:6: 'else'
        {
        match(input,55,FOLLOW_55_in_synpred22_InternalClassdef6208); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalClassdef

    // $ANTLR start synpred23_InternalClassdef
    public final void synpred23_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2649:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2649:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2649:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2649:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2649:6: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2650:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2650:1: ( ruleValidID )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2651:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalClassdef6350);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,18,FOLLOW_18_in_synpred23_InternalClassdef6356); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalClassdef

    // $ANTLR start synpred24_InternalClassdef
    public final void synpred24_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2695:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2695:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2695:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2695:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,48,FOLLOW_48_in_synpred24_InternalClassdef6432); if (state.failed) return ;
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2696:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2697:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2697:1: ( ruleValidID )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:2698:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalClassdef6439);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,18,FOLLOW_18_in_synpred24_InternalClassdef6445); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalClassdef

    // $ANTLR start synpred25_InternalClassdef
    public final void synpred25_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3279:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3279:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3279:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3279:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3279:6: ( ( ruleJvmTypeReference ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3280:1: ( ruleJvmTypeReference )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3280:1: ( ruleJvmTypeReference )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3281:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalClassdef7710);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3283:2: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3284:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3284:1: ( ruleValidID )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3285:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalClassdef7719);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalClassdef

    // $ANTLR start synpred26_InternalClassdef
    public final void synpred26_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3583:4: ( ( '(' ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3584:1: ( '(' )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3584:1: ( '(' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3585:2: '('
        {
        match(input,48,FOLLOW_48_in_synpred26_InternalClassdef8281); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalClassdef

    // $ANTLR start synpred27_InternalClassdef
    public final void synpred27_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3604:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3604:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3604:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3604:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3604:6: ()
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3605:1: 
        {
        }

        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3605:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt102=2;
        int LA102_0 = input.LA(1);

        if ( (LA102_0==RULE_ID||LA102_0==32||LA102_0==48) ) {
            alt102=1;
        }
        switch (alt102) {
            case 1 :
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3605:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3605:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3606:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3606:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3607:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalClassdef8333);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3609:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop101:
                do {
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==47) ) {
                        alt101=1;
                    }


                    switch (alt101) {
                	case 1 :
                	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3609:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,47,FOLLOW_47_in_synpred27_InternalClassdef8340); if (state.failed) return ;
                	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3610:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3611:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3611:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3612:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalClassdef8347);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop101;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3614:6: ( ( '|' ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3615:1: ( '|' )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3615:1: ( '|' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3616:2: '|'
        {
        match(input,51,FOLLOW_51_in_synpred27_InternalClassdef8361); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalClassdef

    // $ANTLR start synpred28_InternalClassdef
    public final void synpred28_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3683:4: ( ( () '[' ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3683:5: ( () '[' )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3683:5: ( () '[' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3683:6: () '['
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3683:6: ()
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3684:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred28_InternalClassdef8481); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalClassdef

    // $ANTLR start synpred29_InternalClassdef
    public final void synpred29_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3826:4: ( '<' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3826:6: '<'
        {
        match(input,29,FOLLOW_29_in_synpred29_InternalClassdef8868); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalClassdef

    // $ANTLR start synpred30_InternalClassdef
    public final void synpred30_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3875:5: ( '(' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3875:7: '('
        {
        match(input,48,FOLLOW_48_in_synpred30_InternalClassdef8961); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalClassdef

    // $ANTLR start synpred31_InternalClassdef
    public final void synpred31_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3880:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3880:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3880:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3880:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3880:6: ()
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3881:1: 
        {
        }

        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3881:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt104=2;
        int LA104_0 = input.LA(1);

        if ( (LA104_0==RULE_ID||LA104_0==32||LA104_0==48) ) {
            alt104=1;
        }
        switch (alt104) {
            case 1 :
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3881:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3881:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3882:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3882:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3883:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalClassdef8991);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3885:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop103:
                do {
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==47) ) {
                        alt103=1;
                    }


                    switch (alt103) {
                	case 1 :
                	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3885:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,47,FOLLOW_47_in_synpred31_InternalClassdef8998); if (state.failed) return ;
                	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3886:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3887:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3887:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3888:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalClassdef9005);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop103;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3890:6: ( ( '|' ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3891:1: ( '|' )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3891:1: ( '|' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3892:2: '|'
        {
        match(input,51,FOLLOW_51_in_synpred31_InternalClassdef9019); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalClassdef

    // $ANTLR start synpred32_InternalClassdef
    public final void synpred32_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3959:4: ( ( () '[' ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3959:5: ( () '[' )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3959:5: ( () '[' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3959:6: () '['
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3959:6: ()
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:3960:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred32_InternalClassdef9139); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalClassdef

    // $ANTLR start synpred33_InternalClassdef
    public final void synpred33_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4281:2: ( ( ruleXExpression ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4282:1: ( ruleXExpression )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4282:1: ( ruleXExpression )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4283:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalClassdef9941);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalClassdef

    // $ANTLR start synpred34_InternalClassdef
    public final void synpred34_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4352:5: ( 'catch' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4352:7: 'catch'
        {
        match(input,77,FOLLOW_77_in_synpred34_InternalClassdef10086); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalClassdef

    // $ANTLR start synpred35_InternalClassdef
    public final void synpred35_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4371:5: ( 'finally' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4371:7: 'finally'
        {
        match(input,76,FOLLOW_76_in_synpred35_InternalClassdef10116); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalClassdef

    // $ANTLR start synpred37_InternalClassdef
    public final void synpred37_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4519:3: ( '.' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4520:2: '.'
        {
        match(input,44,FOLLOW_44_in_synpred37_InternalClassdef10463); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalClassdef

    // $ANTLR start synpred38_InternalClassdef
    public final void synpred38_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4643:2: ( ( () '[' ']' ) )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4643:3: ( () '[' ']' )
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4643:3: ( () '[' ']' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4643:4: () '[' ']'
        {
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4643:4: ()
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4644:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred38_InternalClassdef10846); if (state.failed) return ;
        match(input,52,FOLLOW_52_in_synpred38_InternalClassdef10850); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalClassdef

    // $ANTLR start synpred39_InternalClassdef
    public final void synpred39_InternalClassdef_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4797:4: ( '<' )
        // ../org.eclipse.xtext.classdef/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalClassdef.g:4797:6: '<'
        {
        match(input,29,FOLLOW_29_in_synpred39_InternalClassdef11210); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalClassdef

    // Delegated rules

    public final boolean synpred14_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalClassdef() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalClassdef_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA91 dfa91 = new DFA91(this);
    static final String DFA18_eotS =
        "\13\uffff";
    static final String DFA18_eofS =
        "\1\1\12\uffff";
    static final String DFA18_minS =
        "\1\4\1\uffff\10\0\1\uffff";
    static final String DFA18_maxS =
        "\1\115\1\uffff\10\0\1\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA18_specialS =
        "\2\uffff\1\4\1\3\1\2\1\5\1\7\1\1\1\0\1\6\1\uffff}>";
    static final String[] DFA18_transitionS = {
            "\5\1\11\uffff\1\1\1\uffff\10\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10"+
            "\1\11\17\1\1\uffff\17\1\1\uffff\12\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()* loopback of 1064:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_8 = input.LA(1);

                         
                        int index18_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalClassdef()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_7 = input.LA(1);

                         
                        int index18_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalClassdef()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalClassdef()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_3 = input.LA(1);

                         
                        int index18_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalClassdef()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalClassdef()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_5 = input.LA(1);

                         
                        int index18_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalClassdef()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_9 = input.LA(1);

                         
                        int index18_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalClassdef()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_6 = input.LA(1);

                         
                        int index18_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalClassdef()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\101\uffff";
    static final String DFA34_eofS =
        "\1\2\100\uffff";
    static final String DFA34_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA34_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA34_transitionS = {
            "\5\2\11\uffff\1\2\1\uffff\34\2\1\1\2\2\1\uffff\17\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "1840:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA33_eotS =
        "\36\uffff";
    static final String DFA33_eofS =
        "\36\uffff";
    static final String DFA33_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA33_maxS =
        "\1\113\2\0\33\uffff";
    static final String DFA33_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA33_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1\4\5\24\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\2\5\3\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "1861:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_0 = input.LA(1);

                         
                        int index33_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA33_0==RULE_ID) ) {s = 1;}

                        else if ( (LA33_0==48) ) {s = 2;}

                        else if ( (LA33_0==32) && (synpred16_InternalClassdef())) {s = 3;}

                        else if ( (LA33_0==51) && (synpred16_InternalClassdef())) {s = 4;}

                        else if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_DECIMAL)||LA33_0==29||(LA33_0>=36 && LA33_0<=37)||LA33_0==42||LA33_0==50||LA33_0==54||(LA33_0>=56 && LA33_0<=57)||(LA33_0>=61 && LA33_0<=63)||LA33_0==66||(LA33_0>=68 && LA33_0<=75)) ) {s = 5;}

                        else if ( (LA33_0==49) ) {s = 29;}

                         
                        input.seek(index33_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalClassdef()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalClassdef()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA35_eotS =
        "\101\uffff";
    static final String DFA35_eofS =
        "\1\2\100\uffff";
    static final String DFA35_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA35_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA35_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA35_transitionS = {
            "\5\2\11\uffff\1\2\1\uffff\36\2\1\1\1\uffff\17\2\1\uffff\12"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "1940:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA37_eotS =
        "\16\uffff";
    static final String DFA37_eofS =
        "\16\uffff";
    static final String DFA37_minS =
        "\1\4\15\uffff";
    static final String DFA37_maxS =
        "\1\113\15\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA37_specialS =
        "\16\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\4\4\5\24\uffff\1\4\22\uffff\1\15\1\uffff\1\5\3\uffff\1\6"+
            "\1\uffff\1\3\1\2\3\uffff\1\7\1\10\1\11\2\uffff\1\4\1\uffff\1"+
            "\1\4\5\1\12\1\13\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "1981:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA41_eotS =
        "\40\uffff";
    static final String DFA41_eofS =
        "\40\uffff";
    static final String DFA41_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA41_maxS =
        "\1\113\2\0\35\uffff";
    static final String DFA41_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA41_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\1\4\5\24\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff\2\5\3\uffff"+
            "\6\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "2225:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_0 = input.LA(1);

                         
                        int index41_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA41_0==RULE_ID) ) {s = 1;}

                        else if ( (LA41_0==48) ) {s = 2;}

                        else if ( (LA41_0==32) && (synpred20_InternalClassdef())) {s = 3;}

                        else if ( (LA41_0==51) && (synpred20_InternalClassdef())) {s = 4;}

                        else if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_DECIMAL)||LA41_0==29||(LA41_0>=36 && LA41_0<=37)||LA41_0==42||LA41_0==50||LA41_0==52||LA41_0==54||(LA41_0>=56 && LA41_0<=57)||(LA41_0>=61 && LA41_0<=66)||(LA41_0>=68 && LA41_0<=75)) ) {s = 5;}

                         
                        input.seek(index41_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_1 = input.LA(1);

                         
                        int index41_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalClassdef()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index41_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA41_2 = input.LA(1);

                         
                        int index41_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalClassdef()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index41_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\101\uffff";
    static final String DFA65_eofS =
        "\1\2\100\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA65_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA65_transitionS = {
            "\5\2\11\uffff\1\2\1\uffff\34\2\1\1\2\2\1\uffff\17\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "3583:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\36\uffff";
    static final String DFA64_eofS =
        "\36\uffff";
    static final String DFA64_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA64_maxS =
        "\1\113\2\0\33\uffff";
    static final String DFA64_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA64_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\1\4\5\24\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\2\5\3\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "3604:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_0 = input.LA(1);

                         
                        int index64_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA64_0==RULE_ID) ) {s = 1;}

                        else if ( (LA64_0==48) ) {s = 2;}

                        else if ( (LA64_0==32) && (synpred27_InternalClassdef())) {s = 3;}

                        else if ( (LA64_0==51) && (synpred27_InternalClassdef())) {s = 4;}

                        else if ( ((LA64_0>=RULE_STRING && LA64_0<=RULE_DECIMAL)||LA64_0==29||(LA64_0>=36 && LA64_0<=37)||LA64_0==42||LA64_0==50||LA64_0==54||(LA64_0>=56 && LA64_0<=57)||(LA64_0>=61 && LA64_0<=63)||LA64_0==66||(LA64_0>=68 && LA64_0<=75)) ) {s = 5;}

                        else if ( (LA64_0==49) ) {s = 29;}

                         
                        input.seek(index64_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalClassdef()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalClassdef()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA66_eotS =
        "\101\uffff";
    static final String DFA66_eofS =
        "\1\2\100\uffff";
    static final String DFA66_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA66_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA66_transitionS = {
            "\5\2\11\uffff\1\2\1\uffff\36\2\1\1\1\uffff\17\2\1\uffff\12"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "3683:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA70_eotS =
        "\101\uffff";
    static final String DFA70_eofS =
        "\1\2\100\uffff";
    static final String DFA70_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA70_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA70_transitionS = {
            "\5\2\11\uffff\1\2\1\uffff\11\2\1\1\25\2\1\uffff\17\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "3826:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA73_eotS =
        "\101\uffff";
    static final String DFA73_eofS =
        "\1\2\100\uffff";
    static final String DFA73_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA73_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA73_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA73_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA73_transitionS = {
            "\5\2\11\uffff\1\2\1\uffff\34\2\1\1\2\2\1\uffff\17\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "3875:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA72_eotS =
        "\36\uffff";
    static final String DFA72_eofS =
        "\36\uffff";
    static final String DFA72_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA72_maxS =
        "\1\113\2\0\33\uffff";
    static final String DFA72_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA72_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\1\4\5\24\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\2\5\3\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "3880:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_0 = input.LA(1);

                         
                        int index72_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA72_0==RULE_ID) ) {s = 1;}

                        else if ( (LA72_0==48) ) {s = 2;}

                        else if ( (LA72_0==32) && (synpred31_InternalClassdef())) {s = 3;}

                        else if ( (LA72_0==51) && (synpred31_InternalClassdef())) {s = 4;}

                        else if ( ((LA72_0>=RULE_STRING && LA72_0<=RULE_DECIMAL)||LA72_0==29||(LA72_0>=36 && LA72_0<=37)||LA72_0==42||LA72_0==50||LA72_0==54||(LA72_0>=56 && LA72_0<=57)||(LA72_0>=61 && LA72_0<=63)||LA72_0==66||(LA72_0>=68 && LA72_0<=75)) ) {s = 5;}

                        else if ( (LA72_0==49) ) {s = 29;}

                         
                        input.seek(index72_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalClassdef()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA72_2 = input.LA(1);

                         
                        int index72_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalClassdef()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index72_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA74_eotS =
        "\101\uffff";
    static final String DFA74_eofS =
        "\1\2\100\uffff";
    static final String DFA74_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA74_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA74_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA74_transitionS = {
            "\5\2\11\uffff\1\2\1\uffff\36\2\1\1\1\uffff\17\2\1\uffff\12"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "3959:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_1 = input.LA(1);

                         
                        int index74_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA76_eotS =
        "\101\uffff";
    static final String DFA76_eofS =
        "\1\33\100\uffff";
    static final String DFA76_minS =
        "\1\4\32\0\46\uffff";
    static final String DFA76_maxS =
        "\1\115\32\0\46\uffff";
    static final String DFA76_acceptS =
        "\33\uffff\1\2\44\uffff\1\1";
    static final String DFA76_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\46\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\1\1\21\1\15\1\16\1\17\11\uffff\1\33\1\uffff\11\33\1\10\6"+
            "\33\1\4\1\3\4\33\1\2\5\33\1\32\1\33\1\12\1\uffff\2\33\1\23\1"+
            "\33\1\7\1\6\3\33\1\24\1\25\1\26\2\33\1\11\1\uffff\1\5\1\13\1"+
            "\14\1\20\1\22\1\27\1\30\1\31\2\33",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "4281:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_1 = input.LA(1);

                         
                        int index76_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA76_2 = input.LA(1);

                         
                        int index76_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA76_3 = input.LA(1);

                         
                        int index76_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA76_4 = input.LA(1);

                         
                        int index76_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA76_5 = input.LA(1);

                         
                        int index76_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA76_6 = input.LA(1);

                         
                        int index76_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA76_7 = input.LA(1);

                         
                        int index76_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA76_8 = input.LA(1);

                         
                        int index76_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA76_9 = input.LA(1);

                         
                        int index76_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA76_10 = input.LA(1);

                         
                        int index76_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA76_11 = input.LA(1);

                         
                        int index76_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA76_12 = input.LA(1);

                         
                        int index76_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA76_13 = input.LA(1);

                         
                        int index76_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA76_14 = input.LA(1);

                         
                        int index76_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA76_15 = input.LA(1);

                         
                        int index76_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA76_16 = input.LA(1);

                         
                        int index76_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA76_17 = input.LA(1);

                         
                        int index76_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA76_18 = input.LA(1);

                         
                        int index76_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA76_19 = input.LA(1);

                         
                        int index76_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA76_20 = input.LA(1);

                         
                        int index76_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA76_21 = input.LA(1);

                         
                        int index76_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA76_22 = input.LA(1);

                         
                        int index76_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA76_23 = input.LA(1);

                         
                        int index76_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA76_24 = input.LA(1);

                         
                        int index76_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA76_25 = input.LA(1);

                         
                        int index76_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA76_26 = input.LA(1);

                         
                        int index76_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA91_eotS =
        "\101\uffff";
    static final String DFA91_eofS =
        "\1\2\100\uffff";
    static final String DFA91_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA91_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA91_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA91_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA91_transitionS = {
            "\5\2\11\uffff\1\2\1\uffff\11\2\1\1\25\2\1\uffff\17\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA91_eot = DFA.unpackEncodedString(DFA91_eotS);
    static final short[] DFA91_eof = DFA.unpackEncodedString(DFA91_eofS);
    static final char[] DFA91_min = DFA.unpackEncodedStringToUnsignedChars(DFA91_minS);
    static final char[] DFA91_max = DFA.unpackEncodedStringToUnsignedChars(DFA91_maxS);
    static final short[] DFA91_accept = DFA.unpackEncodedString(DFA91_acceptS);
    static final short[] DFA91_special = DFA.unpackEncodedString(DFA91_specialS);
    static final short[][] DFA91_transition;

    static {
        int numStates = DFA91_transitionS.length;
        DFA91_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA91_transition[i] = DFA.unpackEncodedString(DFA91_transitionS[i]);
        }
    }

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = DFA91_eot;
            this.eof = DFA91_eof;
            this.min = DFA91_min;
            this.max = DFA91_max;
            this.accept = DFA91_accept;
            this.special = DFA91_special;
            this.transition = DFA91_transition;
        }
        public String getDescription() {
            return "4797:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA91_1 = input.LA(1);

                         
                        int index91_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalClassdef()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index91_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 91, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleClassDefinitions_in_entryRuleClassDefinitions75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDefinitions85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDummyJavaClass_in_ruleClassDefinitions130 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleDummyJavaClass_in_entryRuleDummyJavaClass166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDummyJavaClass176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDummyJavaClass213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDummyJavaClass230 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDummyJavaClass252 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleDummyJavaClassMethod_in_ruleDummyJavaClass279 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleDummyJavaClassMethod_in_entryRuleDummyJavaClassMethod316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDummyJavaClassMethod326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDummyJavaClassMethod363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDummyJavaClassMethod380 = new BitSet(new long[]{0x0000000000018022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDummyJavaClassMethod402 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_15_in_ruleDummyJavaClassMethod421 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleDummyJavaClassMethodParameter_in_ruleDummyJavaClassMethod442 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_16_in_ruleDummyJavaClassMethod458 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleDummyJavaClassMethodParameter_in_ruleDummyJavaClassMethod479 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleDummyJavaClassMethodParameter_in_entryRuleDummyJavaClassMethodParameter518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDummyJavaClassMethodParameter528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDummyJavaClassMethodParameter565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDummyJavaClassMethodParameter582 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDummyJavaClassMethodParameter599 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDummyJavaClassMethodParameter616 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDummyJavaClassMethodParameter638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment838 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment854 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment904 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment957 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpSingleAssign1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpMultiAssign1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1252 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1305 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1328 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpOr1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1511 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1564 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1587 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpAnd1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1770 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1823 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1846 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpEquality1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpEquality1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2050 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_25_in_ruleXRelationalExpression2086 = new BitSet(new long[]{0x0001000100000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2109 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2170 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2193 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpCompare2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2436 = new BitSet(new long[]{0x0000000FF0000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2489 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2512 = new BitSet(new long[]{0x0000000FF0000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2658 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2689 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2745 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2776 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpOther2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOther2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2966 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3019 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3042 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpAdd3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpAdd3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3246 = new BitSet(new long[]{0x000003C000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3299 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3322 = new BitSet(new long[]{0x000003C000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpMulti3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpMulti3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpMulti3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpMulti3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3575 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpUnary3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpUnary3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpUnary3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3845 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleXCastedExpression3880 = new BitSet(new long[]{0x0001000100000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3903 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3998 = new BitSet(new long[]{0x0000700000000002L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4047 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4070 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4086 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4108 = new BitSet(new long[]{0x0000700000000002L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4194 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4218 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall4255 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_29_in_ruleXMemberFeatureCall4284 = new BitSet(new long[]{0x0001000100000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4305 = new BitSet(new long[]{0x0000800010000000L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall4318 = new BitSet(new long[]{0x0001000100000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4339 = new BitSet(new long[]{0x0000800010000000L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall4353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4378 = new BitSet(new long[]{0x0005700000000002L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall4412 = new BitSet(new long[]{0xE34F0431200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4497 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4525 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall4538 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4559 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_49_in_ruleXMemberFeatureCall4576 = new BitSet(new long[]{0x0004700000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4611 = new BitSet(new long[]{0x0000700000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXClosure5378 = new BitSet(new long[]{0xE35D0431200001F0L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5451 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXClosure5464 = new BitSet(new long[]{0x0001000100000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5485 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_51_in_ruleXClosure5507 = new BitSet(new long[]{0xE3550430200001F0L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5544 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXClosure5556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5658 = new BitSet(new long[]{0xE3650430200001F2L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_53_in_ruleXExpressionInClosure5671 = new BitSet(new long[]{0xE3450430200001F2L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5829 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXShortClosure5842 = new BitSet(new long[]{0x0001000100000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5863 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_51_in_ruleXShortClosure5885 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXParenthesizedExpression6004 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6026 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXParenthesizedExpression6037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXIfExpression6129 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXIfExpression6141 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6162 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXIfExpression6174 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6195 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXIfExpression6216 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6332 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6375 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXSwitchExpression6387 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6411 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression6455 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6476 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXSwitchExpression6488 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6511 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression6523 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6537 = new BitSet(new long[]{0x1001000100040010L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6558 = new BitSet(new long[]{0x1C01000100040010L});
    public static final BitSet FOLLOW_58_in_ruleXSwitchExpression6572 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXSwitchExpression6584 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6605 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleXSwitchExpression6619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6711 = new BitSet(new long[]{0x1000000000040000L});
    public static final BitSet FOLLOW_60_in_ruleXCasePart6725 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6746 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXCasePart6760 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXForLoopExpression6873 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXForLoopExpression6885 = new BitSet(new long[]{0x0001000100000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6906 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXForLoopExpression6918 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6939 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXForLoopExpression6951 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXWhileExpression7064 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXWhileExpression7076 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7097 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXWhileExpression7109 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXDoWhileExpression7222 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7243 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleXDoWhileExpression7255 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXDoWhileExpression7267 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7288 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXDoWhileExpression7300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXBlockExpression7392 = new BitSet(new long[]{0xEB450430200001F0L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7414 = new BitSet(new long[]{0xEB650430200001F0L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_53_in_ruleXBlockExpression7427 = new BitSet(new long[]{0xEB450430200001F0L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_59_in_ruleXBlockExpression7443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXVariableDeclaration7661 = new BitSet(new long[]{0x0001000100000010L});
    public static final BitSet FOLLOW_65_in_ruleXVariableDeclaration7692 = new BitSet(new long[]{0x0001000100000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7761 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7790 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleXVariableDeclaration7804 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8033 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8157 = new BitSet(new long[]{0x0000000020000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_29_in_ruleXFeatureCall8171 = new BitSet(new long[]{0x0001000100000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8192 = new BitSet(new long[]{0x0000800010000000L});
    public static final BitSet FOLLOW_47_in_ruleXFeatureCall8205 = new BitSet(new long[]{0x0001000100000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8226 = new BitSet(new long[]{0x0000800010000000L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall8240 = new BitSet(new long[]{0x0000000020000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8265 = new BitSet(new long[]{0x0005000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXFeatureCall8299 = new BitSet(new long[]{0xE34F0431200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8384 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8412 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXFeatureCall8425 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8446 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_49_in_ruleXFeatureCall8463 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleIdOrSuper8618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleStaticQualifier8735 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXConstructorCall8832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8855 = new BitSet(new long[]{0x0005000020000002L});
    public static final BitSet FOLLOW_29_in_ruleXConstructorCall8876 = new BitSet(new long[]{0x0001000100000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8898 = new BitSet(new long[]{0x0000800010000000L});
    public static final BitSet FOLLOW_47_in_ruleXConstructorCall8911 = new BitSet(new long[]{0x0001000100000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8932 = new BitSet(new long[]{0x0000800010000000L});
    public static final BitSet FOLLOW_28_in_ruleXConstructorCall8946 = new BitSet(new long[]{0x0005000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXConstructorCall8969 = new BitSet(new long[]{0xE34F0431200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9042 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9070 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXConstructorCall9083 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9104 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_49_in_ruleXConstructorCall9121 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXBooleanLiteral9250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXBooleanLiteral9274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXNullLiteral9380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXTypeLiteral9675 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXTypeLiteral9687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9710 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXTypeLiteral9722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXThrowExpression9814 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXReturnExpression9927 = new BitSet(new long[]{0xE3450430200001F2L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXTryCatchFinallyExpression10051 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10102 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_76_in_ruleXTryCatchFinallyExpression10124 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXTryCatchFinallyExpression10168 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXCatchClause10282 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXCatchClause10295 = new BitSet(new long[]{0x0001000100000010L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10316 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXCatchClause10328 = new BitSet(new long[]{0xE3450430200001F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10444 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleQualifiedName10472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10495 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10632 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10658 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleNumber10678 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10831 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleJvmTypeReference10869 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleJvmTypeReference10881 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXFunctionTypeRef10996 = new BitSet(new long[]{0x0003000100000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11018 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXFunctionTypeRef11031 = new BitSet(new long[]{0x0001000100000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11052 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_49_in_ruleXFunctionTypeRef11068 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleXFunctionTypeRef11082 = new BitSet(new long[]{0x0001000100000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11197 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleJvmParameterizedTypeReference11218 = new BitSet(new long[]{0x0001000100000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11240 = new BitSet(new long[]{0x0000800010000000L});
    public static final BitSet FOLLOW_47_in_ruleJvmParameterizedTypeReference11253 = new BitSet(new long[]{0x0001000100000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11274 = new BitSet(new long[]{0x0000800010000000L});
    public static final BitSet FOLLOW_28_in_ruleJvmParameterizedTypeReference11288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleJvmWildcardTypeReference11501 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008004L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleJvmUpperBound11635 = new BitSet(new long[]{0x0001000100000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleJvmUpperBoundAnded11739 = new BitSet(new long[]{0x0001000100000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleJvmLowerBound11843 = new BitSet(new long[]{0x0001000100000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalClassdef925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalClassdef1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalClassdef1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalClassdef1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred5_InternalClassdef2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalClassdef2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalClassdef2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred8_InternalClassdef2673 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_synpred8_InternalClassdef2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred9_InternalClassdef2760 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_synpred9_InternalClassdef2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalClassdef2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalClassdef3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred12_InternalClassdef3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred13_InternalClassdef4015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred13_InternalClassdef4024 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalClassdef4030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred14_InternalClassdef4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred14_InternalClassdef4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred14_InternalClassdef4167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred15_InternalClassdef4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalClassdef4446 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_47_in_synpred16_InternalClassdef4453 = new BitSet(new long[]{0x0001000100000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalClassdef4460 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_51_in_synpred16_InternalClassdef4474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred17_InternalClassdef4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred18_InternalClassdef5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalClassdef5397 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_47_in_synpred20_InternalClassdef5404 = new BitSet(new long[]{0x0001000100000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalClassdef5411 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_51_in_synpred20_InternalClassdef5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred22_InternalClassdef6208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalClassdef6350 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred23_InternalClassdef6356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred24_InternalClassdef6432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalClassdef6439 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred24_InternalClassdef6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalClassdef7710 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalClassdef7719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred26_InternalClassdef8281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalClassdef8333 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_47_in_synpred27_InternalClassdef8340 = new BitSet(new long[]{0x0001000100000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalClassdef8347 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_51_in_synpred27_InternalClassdef8361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred28_InternalClassdef8481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred29_InternalClassdef8868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred30_InternalClassdef8961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalClassdef8991 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_47_in_synpred31_InternalClassdef8998 = new BitSet(new long[]{0x0001000100000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalClassdef9005 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_51_in_synpred31_InternalClassdef9019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred32_InternalClassdef9139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalClassdef9941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred34_InternalClassdef10086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_synpred35_InternalClassdef10116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred37_InternalClassdef10463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred38_InternalClassdef10846 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred38_InternalClassdef10850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred39_InternalClassdef11210 = new BitSet(new long[]{0x0000000000000002L});

}