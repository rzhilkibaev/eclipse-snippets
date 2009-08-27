package org.xtext.example.contentassist.antlr.internal; 

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
import org.xtext.example.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INDENT", "RULE_DEDENT", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'type'", "'entity'", "'extends'", "'property'", "':'", "'[]'"
    };
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_INT=8;
    public static final int EOF=-1;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INDENT=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_DEDENT=5;

        public InternalMyDslParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleModel
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:60:16: ( ruleModel EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:61:1: ruleModel EOF
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:68:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:72:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:73:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:73:1: ( ( rule__Model__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__Model__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:75:2: rule__Model__Group__0
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


    // $ANTLR start entryRuleImport
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:87:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:87:17: ( ruleImport EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:88:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport120);
            ruleImport();
            _fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport127); 

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
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:95:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:99:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:100:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:100:1: ( ( rule__Import__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:101:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( rule__Import__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:102:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport154);
            rule__Import__Group__0();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleType
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:114:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:114:15: ( ruleType EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:115:1: ruleType EOF
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:122:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:126:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:127:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:127:1: ( ( rule__Type__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:128:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:129:1: ( rule__Type__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:129:2: rule__Type__Alternatives
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:141:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:141:21: ( ruleSimpleType EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:142:1: ruleSimpleType EOF
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:149:1: ruleSimpleType : ( ( rule__SimpleType__Group__0 ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:153:2: ( ( ( rule__SimpleType__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:154:1: ( ( rule__SimpleType__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:154:1: ( ( rule__SimpleType__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:155:1: ( rule__SimpleType__Group__0 )
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:156:1: ( rule__SimpleType__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:156:2: rule__SimpleType__Group__0
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


    // $ANTLR start entryRuleEntity
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:168:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:168:17: ( ruleEntity EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:169:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity300);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity307); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:176:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:180:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:181:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:181:1: ( ( rule__Entity__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:182:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:183:1: ( rule__Entity__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:183:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity334);
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


    // $ANTLR start entryRuleProperty
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:195:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:195:19: ( ruleProperty EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:196:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty360);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty367); 

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
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:203:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:207:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:208:1: ( ( rule__Property__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:208:1: ( ( rule__Property__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:209:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:210:1: ( rule__Property__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:210:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty394);
            rule__Property__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProperty


    // $ANTLR start rule__Type__Alternatives
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:222:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:226:1: ( ( ruleSimpleType ) | ( ruleEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("222:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:227:1: ( ruleSimpleType )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:227:1: ( ruleSimpleType )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:228:1: ruleSimpleType
                    {
                     before(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleType_in_rule__Type__Alternatives430);
                    ruleSimpleType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:233:6: ( ruleEntity )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:233:6: ( ruleEntity )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:234:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives447);
                    ruleEntity();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

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


    // $ANTLR start rule__Entity__Alternatives_4
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:244:1: rule__Entity__Alternatives_4 : ( ( ( rule__Entity__PropertiesAssignment_4_0 ) ) | ( ( rule__Entity__ChildrenAssignment_4_1 ) ) );
    public final void rule__Entity__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:248:1: ( ( ( rule__Entity__PropertiesAssignment_4_0 ) ) | ( ( rule__Entity__ChildrenAssignment_4_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("244:1: rule__Entity__Alternatives_4 : ( ( ( rule__Entity__PropertiesAssignment_4_0 ) ) | ( ( rule__Entity__ChildrenAssignment_4_1 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:249:1: ( ( rule__Entity__PropertiesAssignment_4_0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:249:1: ( ( rule__Entity__PropertiesAssignment_4_0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:250:1: ( rule__Entity__PropertiesAssignment_4_0 )
                    {
                     before(grammarAccess.getEntityAccess().getPropertiesAssignment_4_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:251:1: ( rule__Entity__PropertiesAssignment_4_0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:251:2: rule__Entity__PropertiesAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__Entity__PropertiesAssignment_4_0_in_rule__Entity__Alternatives_4479);
                    rule__Entity__PropertiesAssignment_4_0();
                    _fsp--;


                    }

                     after(grammarAccess.getEntityAccess().getPropertiesAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:255:6: ( ( rule__Entity__ChildrenAssignment_4_1 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:255:6: ( ( rule__Entity__ChildrenAssignment_4_1 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:256:1: ( rule__Entity__ChildrenAssignment_4_1 )
                    {
                     before(grammarAccess.getEntityAccess().getChildrenAssignment_4_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:257:1: ( rule__Entity__ChildrenAssignment_4_1 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:257:2: rule__Entity__ChildrenAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__Entity__ChildrenAssignment_4_1_in_rule__Entity__Alternatives_4497);
                    rule__Entity__ChildrenAssignment_4_1();
                    _fsp--;


                    }

                     after(grammarAccess.getEntityAccess().getChildrenAssignment_4_1()); 

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
    // $ANTLR end rule__Entity__Alternatives_4


    // $ANTLR start rule__Model__Group__0
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:268:1: rule__Model__Group__0 : ( ( rule__Model__ImportsAssignment_0 )* ) rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) rule__Model__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:273:1: ( ( rule__Model__ImportsAssignment_0 )* ) rule__Model__Group__1
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:273:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:274:1: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:275:1: ( rule__Model__ImportsAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:275:2: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0532);
            	    rule__Model__ImportsAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0542);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:286:1: rule__Model__Group__1 : ( ( rule__Model__ElementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:290:1: ( ( ( rule__Model__ElementsAssignment_1 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:291:1: ( ( rule__Model__ElementsAssignment_1 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:291:1: ( ( rule__Model__ElementsAssignment_1 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:292:1: ( rule__Model__ElementsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:293:1: ( rule__Model__ElementsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=14 && LA4_0<=15)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:293:2: rule__Model__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ElementsAssignment_1_in_rule__Model__Group__1570);
            	    rule__Model__ElementsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Import__Group__0
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:307:1: rule__Import__Group__0 : ( 'import' ) rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:311:1: ( ( 'import' ) rule__Import__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:312:1: ( 'import' ) rule__Import__Group__1
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:312:1: ( 'import' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:313:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Import__Group__0610); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0620);
            rule__Import__Group__1();
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
    // $ANTLR end rule__Import__Group__0


    // $ANTLR start rule__Import__Group__1
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:327:1: rule__Import__Group__1 : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:331:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:332:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:332:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:333:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:334:1: ( rule__Import__ImportURIAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:334:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1648);
            rule__Import__ImportURIAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__Group__1


    // $ANTLR start rule__SimpleType__Group__0
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:348:1: rule__SimpleType__Group__0 : ( 'type' ) rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:352:1: ( ( 'type' ) rule__SimpleType__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:353:1: ( 'type' ) rule__SimpleType__Group__1
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:353:1: ( 'type' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:354:1: 'type'
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__SimpleType__Group__0687); 
             after(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__0697);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:368:1: rule__SimpleType__Group__1 : ( ( rule__SimpleType__NameAssignment_1 ) ) ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:372:1: ( ( ( rule__SimpleType__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:373:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:373:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:374:1: ( rule__SimpleType__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:375:1: ( rule__SimpleType__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:375:2: rule__SimpleType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1725);
            rule__SimpleType__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Entity__Group__0
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:389:1: rule__Entity__Group__0 : ( 'entity' ) rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:393:1: ( ( 'entity' ) rule__Entity__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:394:1: ( 'entity' ) rule__Entity__Group__1
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:394:1: ( 'entity' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:395:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Entity__Group__0764); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0774);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:409:1: rule__Entity__Group__1 : ( ( rule__Entity__NameAssignment_1 ) ) rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:413:1: ( ( ( rule__Entity__NameAssignment_1 ) ) rule__Entity__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:414:1: ( ( rule__Entity__NameAssignment_1 ) ) rule__Entity__Group__2
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:414:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:415:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:416:1: ( rule__Entity__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:416:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1802);
            rule__Entity__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1811);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:427:1: rule__Entity__Group__2 : ( ( rule__Entity__Group_2__0 )? ) rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:431:1: ( ( ( rule__Entity__Group_2__0 )? ) rule__Entity__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:432:1: ( ( rule__Entity__Group_2__0 )? ) rule__Entity__Group__3
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:432:1: ( ( rule__Entity__Group_2__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:433:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:434:1: ( rule__Entity__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:434:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2839);
                    rule__Entity__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__2849);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:445:1: rule__Entity__Group__3 : ( RULE_INDENT ) rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:449:1: ( ( RULE_INDENT ) rule__Entity__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:450:1: ( RULE_INDENT ) rule__Entity__Group__4
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:450:1: ( RULE_INDENT )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:451:1: RULE_INDENT
            {
             before(grammarAccess.getEntityAccess().getINDENTTerminalRuleCall_3()); 
            match(input,RULE_INDENT,FOLLOW_RULE_INDENT_in_rule__Entity__Group__3877); 
             after(grammarAccess.getEntityAccess().getINDENTTerminalRuleCall_3()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__3885);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:463:1: rule__Entity__Group__4 : ( ( rule__Entity__Alternatives_4 )* ) rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:467:1: ( ( ( rule__Entity__Alternatives_4 )* ) rule__Entity__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( ( rule__Entity__Alternatives_4 )* ) rule__Entity__Group__5
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( ( rule__Entity__Alternatives_4 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:469:1: ( rule__Entity__Alternatives_4 )*
            {
             before(grammarAccess.getEntityAccess().getAlternatives_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:470:1: ( rule__Entity__Alternatives_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15||LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:470:2: rule__Entity__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__Alternatives_4_in_rule__Entity__Group__4913);
            	    rule__Entity__Alternatives_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAlternatives_4()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__4923);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:481:1: rule__Entity__Group__5 : ( RULE_DEDENT ) ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:485:1: ( ( RULE_DEDENT ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:486:1: ( RULE_DEDENT )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:486:1: ( RULE_DEDENT )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:487:1: RULE_DEDENT
            {
             before(grammarAccess.getEntityAccess().getDEDENTTerminalRuleCall_5()); 
            match(input,RULE_DEDENT,FOLLOW_RULE_DEDENT_in_rule__Entity__Group__5951); 
             after(grammarAccess.getEntityAccess().getDEDENTTerminalRuleCall_5()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:510:1: rule__Entity__Group_2__0 : ( 'extends' ) rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:514:1: ( ( 'extends' ) rule__Entity__Group_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:515:1: ( 'extends' ) rule__Entity__Group_2__1
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:515:1: ( 'extends' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:516:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,16,FOLLOW_16_in_rule__Entity__Group_2__0997); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01007);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:530:1: rule__Entity__Group_2__1 : ( ( rule__Entity__ExtendsAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:534:1: ( ( ( rule__Entity__ExtendsAssignment_2_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:535:1: ( ( rule__Entity__ExtendsAssignment_2_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:535:1: ( ( rule__Entity__ExtendsAssignment_2_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:536:1: ( rule__Entity__ExtendsAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getExtendsAssignment_2_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:537:1: ( rule__Entity__ExtendsAssignment_2_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:537:2: rule__Entity__ExtendsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__ExtendsAssignment_2_1_in_rule__Entity__Group_2__11035);
            rule__Entity__ExtendsAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getExtendsAssignment_2_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Property__Group__0
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:551:1: rule__Property__Group__0 : ( 'property' ) rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:555:1: ( ( 'property' ) rule__Property__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:556:1: ( 'property' ) rule__Property__Group__1
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:556:1: ( 'property' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:557:1: 'property'
            {
             before(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Property__Group__01074); 
             after(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__01084);
            rule__Property__Group__1();
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
    // $ANTLR end rule__Property__Group__0


    // $ANTLR start rule__Property__Group__1
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:571:1: rule__Property__Group__1 : ( ( rule__Property__NameAssignment_1 ) ) rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:575:1: ( ( ( rule__Property__NameAssignment_1 ) ) rule__Property__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:576:1: ( ( rule__Property__NameAssignment_1 ) ) rule__Property__Group__2
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:576:1: ( ( rule__Property__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:577:1: ( rule__Property__NameAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:578:1: ( rule__Property__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:578:2: rule__Property__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__11112);
            rule__Property__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__11121);
            rule__Property__Group__2();
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
    // $ANTLR end rule__Property__Group__1


    // $ANTLR start rule__Property__Group__2
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:589:1: rule__Property__Group__2 : ( ':' ) rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:593:1: ( ( ':' ) rule__Property__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:594:1: ( ':' ) rule__Property__Group__3
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:594:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:595:1: ':'
            {
             before(grammarAccess.getPropertyAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Property__Group__21150); 
             after(grammarAccess.getPropertyAccess().getColonKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__3_in_rule__Property__Group__21160);
            rule__Property__Group__3();
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
    // $ANTLR end rule__Property__Group__2


    // $ANTLR start rule__Property__Group__3
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:609:1: rule__Property__Group__3 : ( ( rule__Property__TypeAssignment_3 ) ) rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:613:1: ( ( ( rule__Property__TypeAssignment_3 ) ) rule__Property__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:614:1: ( ( rule__Property__TypeAssignment_3 ) ) rule__Property__Group__4
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:614:1: ( ( rule__Property__TypeAssignment_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:615:1: ( rule__Property__TypeAssignment_3 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:616:1: ( rule__Property__TypeAssignment_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:616:2: rule__Property__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Property__TypeAssignment_3_in_rule__Property__Group__31188);
            rule__Property__TypeAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__4_in_rule__Property__Group__31197);
            rule__Property__Group__4();
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
    // $ANTLR end rule__Property__Group__3


    // $ANTLR start rule__Property__Group__4
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:627:1: rule__Property__Group__4 : ( ( rule__Property__ManyAssignment_4 )? ) ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:631:1: ( ( ( rule__Property__ManyAssignment_4 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:632:1: ( ( rule__Property__ManyAssignment_4 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:632:1: ( ( rule__Property__ManyAssignment_4 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:633:1: ( rule__Property__ManyAssignment_4 )?
            {
             before(grammarAccess.getPropertyAccess().getManyAssignment_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:634:1: ( rule__Property__ManyAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:634:2: rule__Property__ManyAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Property__ManyAssignment_4_in_rule__Property__Group__41225);
                    rule__Property__ManyAssignment_4();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getManyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__4


    // $ANTLR start rule__Model__ImportsAssignment_0
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:654:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:658:1: ( ( ruleImport ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:659:1: ( ruleImport )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:659:1: ( ruleImport )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:660:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_01270);
            ruleImport();
            _fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__ImportsAssignment_0


    // $ANTLR start rule__Model__ElementsAssignment_1
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:669:1: rule__Model__ElementsAssignment_1 : ( ruleType ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:673:1: ( ( ruleType ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:674:1: ( ruleType )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:674:1: ( ruleType )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:675:1: ruleType
            {
             before(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Model__ElementsAssignment_11301);
            ruleType();
            _fsp--;

             after(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__ElementsAssignment_1


    // $ANTLR start rule__Import__ImportURIAssignment_1
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:684:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:688:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:689:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:689:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:690:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_11332); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__ImportURIAssignment_1


    // $ANTLR start rule__SimpleType__NameAssignment_1
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:699:1: rule__SimpleType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:703:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:704:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:704:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:705:1: RULE_ID
            {
             before(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_11363); 
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


    // $ANTLR start rule__Entity__NameAssignment_1
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:714:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:718:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:719:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:719:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:720:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_11394); 
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


    // $ANTLR start rule__Entity__ExtendsAssignment_2_1
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:729:1: rule__Entity__ExtendsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__ExtendsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:733:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:734:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:734:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:735:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:736:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:737:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getExtendsEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__ExtendsAssignment_2_11429); 
             after(grammarAccess.getEntityAccess().getExtendsEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__ExtendsAssignment_2_1


    // $ANTLR start rule__Entity__PropertiesAssignment_4_0
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:748:1: rule__Entity__PropertiesAssignment_4_0 : ( ruleProperty ) ;
    public final void rule__Entity__PropertiesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:752:1: ( ( ruleProperty ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:753:1: ( ruleProperty )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:753:1: ( ruleProperty )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:754:1: ruleProperty
            {
             before(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_4_01464);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__PropertiesAssignment_4_0


    // $ANTLR start rule__Entity__ChildrenAssignment_4_1
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:763:1: rule__Entity__ChildrenAssignment_4_1 : ( ruleEntity ) ;
    public final void rule__Entity__ChildrenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:767:1: ( ( ruleEntity ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:768:1: ( ruleEntity )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:768:1: ( ruleEntity )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:769:1: ruleEntity
            {
             before(grammarAccess.getEntityAccess().getChildrenEntityParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Entity__ChildrenAssignment_4_11495);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityAccess().getChildrenEntityParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__ChildrenAssignment_4_1


    // $ANTLR start rule__Property__NameAssignment_1
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:778:1: rule__Property__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:782:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:783:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:783:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:784:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_11526); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__NameAssignment_1


    // $ANTLR start rule__Property__TypeAssignment_3
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:793:1: rule__Property__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Property__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:797:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:798:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:798:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:799:1: ( RULE_ID )
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_3_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:800:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:801:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__TypeAssignment_31561); 
             after(grammarAccess.getPropertyAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__TypeAssignment_3


    // $ANTLR start rule__Property__ManyAssignment_4
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:812:1: rule__Property__ManyAssignment_4 : ( ( '[]' ) ) ;
    public final void rule__Property__ManyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:816:1: ( ( ( '[]' ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:817:1: ( ( '[]' ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:817:1: ( ( '[]' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:818:1: ( '[]' )
            {
             before(grammarAccess.getPropertyAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:819:1: ( '[]' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g:820:1: '[]'
            {
             before(grammarAccess.getPropertyAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__Property__ManyAssignment_41601); 
             after(grammarAccess.getPropertyAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 

            }

             after(grammarAccess.getPropertyAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__ManyAssignment_4


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__Type__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__PropertiesAssignment_4_0_in_rule__Entity__Alternatives_4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ChildrenAssignment_4_1_in_rule__Entity__Alternatives_4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0532 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_1_in_rule__Model__Group__1570 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_13_in_rule__Import__Group__0610 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SimpleType__Group__0687 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__0697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Entity__Group__0764 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1802 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2839 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INDENT_in_rule__Entity__Group__3877 = new BitSet(new long[]{0x0000000000028020L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Alternatives_4_in_rule__Entity__Group__4913 = new BitSet(new long[]{0x0000000000028020L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__4923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEDENT_in_rule__Entity__Group__5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Entity__Group_2__0997 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ExtendsAssignment_2_1_in_rule__Entity__Group_2__11035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Property__Group__01074 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__01084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__11112 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__11121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Property__Group__21150 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__21160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_3_in_rule__Property__Group__31188 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Property__Group__4_in_rule__Property__Group__31197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__ManyAssignment_4_in_rule__Property__Group__41225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_01270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Model__ElementsAssignment_11301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_11332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_11363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_11394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__ExtendsAssignment_2_11429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_4_01464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Entity__ChildrenAssignment_4_11495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_11526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__TypeAssignment_31561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Property__ManyAssignment_41601 = new BitSet(new long[]{0x0000000000000002L});

}