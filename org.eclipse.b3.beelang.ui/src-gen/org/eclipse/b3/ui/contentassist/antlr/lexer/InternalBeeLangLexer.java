package org.eclipse.b3.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBeeLangLexer extends Lexer {
    public static final int RULE_ID=144;
    public static final int KEYWORD_135=11;
    public static final int KEYWORD_134=10;
    public static final int KEYWORD_137=7;
    public static final int KEYWORD_136=8;
    public static final int RULE_ANY_OTHER=156;
    public static final int KEYWORD_131=12;
    public static final int KEYWORD_130=19;
    public static final int KEYWORD_133=9;
    public static final int KEYWORD_132=13;
    public static final int KEYWORD_56=85;
    public static final int KEYWORD_55=84;
    public static final int KEYWORD_54=83;
    public static final int KEYWORD_53=82;
    public static final int KEYWORD_52=100;
    public static final int KEYWORD_127=16;
    public static final int KEYWORD_51=99;
    public static final int KEYWORD_128=17;
    public static final int RULE_SIMPLE_PATTERN=148;
    public static final int KEYWORD_50=98;
    public static final int KEYWORD_129=18;
    public static final int EOF=-1;
    public static final int KEYWORD_59=88;
    public static final int KEYWORD_58=87;
    public static final int KEYWORD_57=86;
    public static final int KEYWORD_140=4;
    public static final int RULE_HEX=153;
    public static final int KEYWORD_65=77;
    public static final int KEYWORD_64=76;
    public static final int KEYWORD_67=79;
    public static final int KEYWORD_66=78;
    public static final int KEYWORD_61=90;
    public static final int KEYWORD_60=89;
    public static final int KEYWORD_138=5;
    public static final int KEYWORD_63=75;
    public static final int KEYWORD_139=6;
    public static final int KEYWORD_62=91;
    public static final int KEYWORD_69=81;
    public static final int KEYWORD_68=80;
    public static final int RULE_PID=145;
    public static final int KEYWORD_111=33;
    public static final int KEYWORD_110=32;
    public static final int KEYWORD_113=35;
    public static final int KEYWORD_112=34;
    public static final int KEYWORD_115=37;
    public static final int KEYWORD_114=36;
    public static final int KEYWORD_30=105;
    public static final int KEYWORD_105=43;
    public static final int KEYWORD_106=28;
    public static final int KEYWORD_107=29;
    public static final int KEYWORD_108=30;
    public static final int KEYWORD_34=109;
    public static final int KEYWORD_109=31;
    public static final int KEYWORD_33=108;
    public static final int KEYWORD_32=107;
    public static final int KEYWORD_31=106;
    public static final int KEYWORD_38=113;
    public static final int KEYWORD_37=112;
    public static final int KEYWORD_36=111;
    public static final int KEYWORD_35=110;
    public static final int RULE_ML_COMMENT=150;
    public static final int KEYWORD_39=114;
    public static final int RULE_STRING=147;
    public static final int KEYWORD_122=23;
    public static final int KEYWORD_121=22;
    public static final int KEYWORD_120=21;
    public static final int KEYWORD_126=15;
    public static final int KEYWORD_125=14;
    public static final int KEYWORD_124=25;
    public static final int KEYWORD_123=24;
    public static final int KEYWORD_118=27;
    public static final int KEYWORD_119=20;
    public static final int KEYWORD_41=116;
    public static final int KEYWORD_116=38;
    public static final int KEYWORD_40=115;
    public static final int KEYWORD_117=26;
    public static final int KEYWORD_43=118;
    public static final int KEYWORD_42=117;
    public static final int KEYWORD_45=93;
    public static final int KEYWORD_44=92;
    public static final int KEYWORD_47=95;
    public static final int KEYWORD_46=94;
    public static final int KEYWORD_49=97;
    public static final int KEYWORD_48=96;
    public static final int RULE_EXT_INT=155;
    public static final int KEYWORD_97=47;
    public static final int KEYWORD_98=48;
    public static final int KEYWORD_99=49;
    public static final int KEYWORD_93=62;
    public static final int KEYWORD_94=44;
    public static final int KEYWORD_95=45;
    public static final int KEYWORD_96=46;
    public static final int KEYWORD_19=137;
    public static final int KEYWORD_90=59;
    public static final int KEYWORD_17=135;
    public static final int KEYWORD_92=61;
    public static final int KEYWORD_18=136;
    public static final int KEYWORD_91=60;
    public static final int KEYWORD_15=133;
    public static final int KEYWORD_16=134;
    public static final int KEYWORD_13=131;
    public static final int KEYWORD_14=132;
    public static final int KEYWORD_11=129;
    public static final int KEYWORD_12=130;
    public static final int KEYWORD_10=128;
    public static final int KEYWORD_103=41;
    public static final int KEYWORD_104=42;
    public static final int KEYWORD_101=39;
    public static final int KEYWORD_102=40;
    public static final int KEYWORD_100=50;
    public static final int KEYWORD_6=124;
    public static final int KEYWORD_7=125;
    public static final int KEYWORD_8=126;
    public static final int KEYWORD_9=127;
    public static final int KEYWORD_28=103;
    public static final int KEYWORD_29=104;
    public static final int RULE_INT=154;
    public static final int KEYWORD_24=142;
    public static final int KEYWORD_25=143;
    public static final int KEYWORD_26=101;
    public static final int KEYWORD_27=102;
    public static final int KEYWORD_20=138;
    public static final int KEYWORD_21=139;
    public static final int KEYWORD_22=140;
    public static final int KEYWORD_23=141;
    public static final int KEYWORD_79=72;
    public static final int RULE_REGULAR_EXPR=146;
    public static final int KEYWORD_71=64;
    public static final int KEYWORD_72=65;
    public static final int KEYWORD_73=66;
    public static final int KEYWORD_74=67;
    public static final int KEYWORD_75=68;
    public static final int KEYWORD_76=69;
    public static final int KEYWORD_77=70;
    public static final int KEYWORD_78=71;
    public static final int KEYWORD_1=119;
    public static final int KEYWORD_5=123;
    public static final int KEYWORD_4=122;
    public static final int KEYWORD_3=121;
    public static final int KEYWORD_70=63;
    public static final int KEYWORD_2=120;
    public static final int Tokens=157;
    public static final int RULE_SL_COMMENT=151;
    public static final int RULE_DOCUMENTATION=149;
    public static final int KEYWORD_84=53;
    public static final int KEYWORD_85=54;
    public static final int KEYWORD_82=51;
    public static final int KEYWORD_83=52;
    public static final int KEYWORD_88=57;
    public static final int KEYWORD_89=58;
    public static final int KEYWORD_86=55;
    public static final int KEYWORD_87=56;
    public static final int KEYWORD_81=74;
    public static final int KEYWORD_80=73;
    public static final int RULE_WS=152;
    public InternalBeeLangLexer() {;} 
    public InternalBeeLangLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g"; }

    // $ANTLR start KEYWORD_140
    public final void mKEYWORD_140() throws RecognitionException {
        try {
            int _type = KEYWORD_140;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:19:13: ( '@postinputcondition' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:19:15: '@postinputcondition'
            {
            match("@postinputcondition"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_140

    // $ANTLR start KEYWORD_138
    public final void mKEYWORD_138() throws RecognitionException {
        try {
            int _type = KEYWORD_138;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:21:13: ( 'default-properties' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:21:15: 'default-properties'
            {
            match("default-properties"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_138

    // $ANTLR start KEYWORD_139
    public final void mKEYWORD_139() throws RecognitionException {
        try {
            int _type = KEYWORD_139;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:23:13: ( 'postinputcondition' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:23:15: 'postinputcondition'
            {
            match("postinputcondition"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_139

    // $ANTLR start KEYWORD_137
    public final void mKEYWORD_137() throws RecognitionException {
        try {
            int _type = KEYWORD_137;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:25:13: ( 'having-parameters' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:25:15: 'having-parameters'
            {
            match("having-parameters"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_137

    // $ANTLR start KEYWORD_136
    public final void mKEYWORD_136() throws RecognitionException {
        try {
            int _type = KEYWORD_136;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:27:13: ( 'replace-modified' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:27:15: 'replace-modified'
            {
            match("replace-modified"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_136

    // $ANTLR start KEYWORD_133
    public final void mKEYWORD_133() throws RecognitionException {
        try {
            int _type = KEYWORD_133;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:29:13: ( 'builder-context' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:29:15: 'builder-context'
            {
            match("builder-context"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_133

    // $ANTLR start KEYWORD_134
    public final void mKEYWORD_134() throws RecognitionException {
        try {
            int _type = KEYWORD_134;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:31:13: ( 'modify-selected' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:31:15: 'modify-selected'
            {
            match("modify-selected"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_134

    // $ANTLR start KEYWORD_135
    public final void mKEYWORD_135() throws RecognitionException {
        try {
            int _type = KEYWORD_135;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:33:13: ( 'select-builders' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:33:15: 'select-builders'
            {
            match("select-builders"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_135

    // $ANTLR start KEYWORD_131
    public final void mKEYWORD_131() throws RecognitionException {
        try {
            int _type = KEYWORD_131;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:35:13: ( '@postcondition' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:35:15: '@postcondition'
            {
            match("@postcondition"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_131

    // $ANTLR start KEYWORD_132
    public final void mKEYWORD_132() throws RecognitionException {
        try {
            int _type = KEYWORD_132;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:37:13: ( 'merge-modified' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:37:15: 'merge-modified'
            {
            match("merge-modified"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_132

    // $ANTLR start KEYWORD_125
    public final void mKEYWORD_125() throws RecognitionException {
        try {
            int _type = KEYWORD_125;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:39:13: ( '@precondition' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:39:15: '@precondition'
            {
            match("@precondition"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_125

    // $ANTLR start KEYWORD_126
    public final void mKEYWORD_126() throws RecognitionException {
        try {
            int _type = KEYWORD_126;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:41:13: ( 'fail-modified' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:41:15: 'fail-modified'
            {
            match("fail-modified"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_126

    // $ANTLR start KEYWORD_127
    public final void mKEYWORD_127() throws RecognitionException {
        try {
            int _type = KEYWORD_127;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:43:13: ( 'keep-modified' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:43:15: 'keep-modified'
            {
            match("keep-modified"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_127

    // $ANTLR start KEYWORD_128
    public final void mKEYWORD_128() throws RecognitionException {
        try {
            int _type = KEYWORD_128;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:45:13: ( 'postcondition' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:45:15: 'postcondition'
            {
            match("postcondition"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_128

    // $ANTLR start KEYWORD_129
    public final void mKEYWORD_129() throws RecognitionException {
        try {
            int _type = KEYWORD_129;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:47:13: ( 'select-switch' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:47:15: 'select-switch'
            {
            match("select-switch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_129

    // $ANTLR start KEYWORD_130
    public final void mKEYWORD_130() throws RecognitionException {
        try {
            int _type = KEYWORD_130;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:49:13: ( 'update-policy' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:49:15: 'update-policy'
            {
            match("update-policy"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_130

    // $ANTLR start KEYWORD_119
    public final void mKEYWORD_119() throws RecognitionException {
        try {
            int _type = KEYWORD_119;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:51:13: ( 'precondition' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:51:15: 'precondition'
            {
            match("precondition"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_119

    // $ANTLR start KEYWORD_120
    public final void mKEYWORD_120() throws RecognitionException {
        try {
            int _type = KEYWORD_120;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:53:13: ( 'requires-max' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:53:15: 'requires-max'
            {
            match("requires-max"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_120

    // $ANTLR start KEYWORD_121
    public final void mKEYWORD_121() throws RecognitionException {
        try {
            int _type = KEYWORD_121;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:55:13: ( 'requires-min' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:55:15: 'requires-min'
            {
            match("requires-min"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_121

    // $ANTLR start KEYWORD_122
    public final void mKEYWORD_122() throws RecognitionException {
        try {
            int _type = KEYWORD_122;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:57:13: ( 'select-first' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:57:15: 'select-first'
            {
            match("select-first"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_122

    // $ANTLR start KEYWORD_123
    public final void mKEYWORD_123() throws RecognitionException {
        try {
            int _type = KEYWORD_123;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:59:13: ( 'select-units' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:59:15: 'select-units'
            {
            match("select-units"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_123

    // $ANTLR start KEYWORD_124
    public final void mKEYWORD_124() throws RecognitionException {
        try {
            int _type = KEYWORD_124;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:61:13: ( 'unit-context' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:61:15: 'unit-context'
            {
            match("unit-context"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_124

    // $ANTLR start KEYWORD_117
    public final void mKEYWORD_117() throws RecognitionException {
        try {
            int _type = KEYWORD_117;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:63:13: ( 'annotations' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:63:15: 'annotations'
            {
            match("annotations"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_117

    // $ANTLR start KEYWORD_118
    public final void mKEYWORD_118() throws RecognitionException {
        try {
            int _type = KEYWORD_118;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:65:13: ( 'select-best' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:65:15: 'select-best'
            {
            match("select-best"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_118

    // $ANTLR start KEYWORD_106
    public final void mKEYWORD_106() throws RecognitionException {
        try {
            int _type = KEYWORD_106;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:67:13: ( '@callguard' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:67:15: '@callguard'
            {
            match("@callguard"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_106

    // $ANTLR start KEYWORD_107
    public final void mKEYWORD_107() throws RecognitionException {
        try {
            int _type = KEYWORD_107;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:69:13: ( 'capability' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:69:15: 'capability'
            {
            match("capability"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_107

    // $ANTLR start KEYWORD_108
    public final void mKEYWORD_108() throws RecognitionException {
        try {
            int _type = KEYWORD_108;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:71:13: ( 'conditions' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:71:15: 'conditions'
            {
            match("conditions"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_108

    // $ANTLR start KEYWORD_109
    public final void mKEYWORD_109() throws RecognitionException {
        try {
            int _type = KEYWORD_109;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:73:13: ( 'connection' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:73:15: 'connection'
            {
            match("connection"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_109

    // $ANTLR start KEYWORD_110
    public final void mKEYWORD_110() throws RecognitionException {
        try {
            int _type = KEYWORD_110;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:75:13: ( 'implements' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:75:15: 'implements'
            {
            match("implements"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_110

    // $ANTLR start KEYWORD_111
    public final void mKEYWORD_111() throws RecognitionException {
        try {
            int _type = KEYWORD_111;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:77:13: ( 'instanceof' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:77:15: 'instanceof'
            {
            match("instanceof"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_111

    // $ANTLR start KEYWORD_112
    public final void mKEYWORD_112() throws RecognitionException {
        try {
            int _type = KEYWORD_112;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:79:13: ( 'name-space' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:79:15: 'name-space'
            {
            match("name-space"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_112

    // $ANTLR start KEYWORD_113
    public final void mKEYWORD_113() throws RecognitionException {
        try {
            int _type = KEYWORD_113;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:81:13: ( 'properties' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:81:15: 'properties'
            {
            match("properties"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_113

    // $ANTLR start KEYWORD_114
    public final void mKEYWORD_114() throws RecognitionException {
        try {
            int _type = KEYWORD_114;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:83:13: ( 'repository' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:83:15: 'repository'
            {
            match("repository"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_114

    // $ANTLR start KEYWORD_115
    public final void mKEYWORD_115() throws RecognitionException {
        try {
            int _type = KEYWORD_115;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:85:13: ( 'resolution' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:85:15: 'resolution'
            {
            match("resolution"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_115

    // $ANTLR start KEYWORD_116
    public final void mKEYWORD_116() throws RecognitionException {
        try {
            int _type = KEYWORD_116;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:87:13: ( 'sequential' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:87:15: 'sequential'
            {
            match("sequential"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_116

    // $ANTLR start KEYWORD_101
    public final void mKEYWORD_101() throws RecognitionException {
        try {
            int _type = KEYWORD_101;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:89:13: ( 'container' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:89:15: 'container'
            {
            match("container"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_101

    // $ANTLR start KEYWORD_102
    public final void mKEYWORD_102() throws RecognitionException {
        try {
            int _type = KEYWORD_102;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:91:13: ( 'endswitch' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:91:15: 'endswitch'
            {
            match("endswitch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_102

    // $ANTLR start KEYWORD_103
    public final void mKEYWORD_103() throws RecognitionException {
        try {
            int _type = KEYWORD_103;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:93:13: ( 'load-from' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:93:15: 'load-from'
            {
            match("load-from"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_103

    // $ANTLR start KEYWORD_104
    public final void mKEYWORD_104() throws RecognitionException {
        try {
            int _type = KEYWORD_104;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:95:13: ( 'no-update' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:95:15: 'no-update'
            {
            match("no-update"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_104

    // $ANTLR start KEYWORD_105
    public final void mKEYWORD_105() throws RecognitionException {
        try {
            int _type = KEYWORD_105;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:97:13: ( 'timestamp' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:97:15: 'timestamp'
            {
            match("timestamp"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_105

    // $ANTLR start KEYWORD_94
    public final void mKEYWORD_94() throws RecognitionException {
        try {
            int _type = KEYWORD_94;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:99:12: ( 'branches' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:99:14: 'branches'
            {
            match("branches"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_94

    // $ANTLR start KEYWORD_95
    public final void mKEYWORD_95() throws RecognitionException {
        try {
            int _type = KEYWORD_95;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:101:12: ( 'function' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:101:14: 'function'
            {
            match("function"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_95

    // $ANTLR start KEYWORD_96
    public final void mKEYWORD_96() throws RecognitionException {
        try {
            int _type = KEYWORD_96;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:103:12: ( 'parallel' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:103:14: 'parallel'
            {
            match("parallel"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_96

    // $ANTLR start KEYWORD_97
    public final void mKEYWORD_97() throws RecognitionException {
        try {
            int _type = KEYWORD_97;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:105:12: ( 'provides' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:105:14: 'provides'
            {
            match("provides"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_97

    // $ANTLR start KEYWORD_98
    public final void mKEYWORD_98() throws RecognitionException {
        try {
            int _type = KEYWORD_98;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:107:12: ( 'reexport' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:107:14: 'reexport'
            {
            match("reexport"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_98

    // $ANTLR start KEYWORD_99
    public final void mKEYWORD_99() throws RecognitionException {
        try {
            int _type = KEYWORD_99;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:109:12: ( 'requires' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:109:14: 'requires'
            {
            match("requires"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_99

    // $ANTLR start KEYWORD_100
    public final void mKEYWORD_100() throws RecognitionException {
        try {
            int _type = KEYWORD_100;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:111:13: ( 'revision' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:111:15: 'revision'
            {
            match("revision"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_100

    // $ANTLR start KEYWORD_82
    public final void mKEYWORD_82() throws RecognitionException {
        try {
            int _type = KEYWORD_82;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:113:12: ( 'builder' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:113:14: 'builder'
            {
            match("builder"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_82

    // $ANTLR start KEYWORD_83
    public final void mKEYWORD_83() throws RecognitionException {
        try {
            int _type = KEYWORD_83;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:115:12: ( 'concern' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:115:14: 'concern'
            {
            match("concern"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_83

    // $ANTLR start KEYWORD_84
    public final void mKEYWORD_84() throws RecognitionException {
        try {
            int _type = KEYWORD_84;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:117:12: ( 'context' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:117:14: 'context'
            {
            match("context"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_84

    // $ANTLR start KEYWORD_85
    public final void mKEYWORD_85() throws RecognitionException {
        try {
            int _type = KEYWORD_85;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:119:12: ( 'default' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:119:14: 'default'
            {
            match("default"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_85

    // $ANTLR start KEYWORD_86
    public final void mKEYWORD_86() throws RecognitionException {
        try {
            int _type = KEYWORD_86;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:121:12: ( 'exclude' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:121:14: 'exclude'
            {
            match("exclude"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_86

    // $ANTLR start KEYWORD_87
    public final void mKEYWORD_87() throws RecognitionException {
        try {
            int _type = KEYWORD_87;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:123:12: ( 'extends' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:123:14: 'extends'
            {
            match("extends"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_87

    // $ANTLR start KEYWORD_88
    public final void mKEYWORD_88() throws RecognitionException {
        try {
            int _type = KEYWORD_88;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:125:12: ( 'finally' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:125:14: 'finally'
            {
            match("finally"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_88

    // $ANTLR start KEYWORD_89
    public final void mKEYWORD_89() throws RecognitionException {
        try {
            int _type = KEYWORD_89;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:127:12: ( 'include' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:127:14: 'include'
            {
            match("include"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_89

    // $ANTLR start KEYWORD_90
    public final void mKEYWORD_90() throws RecognitionException {
        try {
            int _type = KEYWORD_90;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:129:12: ( 'mutable' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:129:14: 'mutable'
            {
            match("mutable"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_90

    // $ANTLR start KEYWORD_91
    public final void mKEYWORD_91() throws RecognitionException {
        try {
            int _type = KEYWORD_91;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:131:12: ( 'private' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:131:14: 'private'
            {
            match("private"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_91

    // $ANTLR start KEYWORD_92
    public final void mKEYWORD_92() throws RecognitionException {
        try {
            int _type = KEYWORD_92;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:133:12: ( 'proceed' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:133:14: 'proceed'
            {
            match("proceed"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_92

    // $ANTLR start KEYWORD_93
    public final void mKEYWORD_93() throws RecognitionException {
        try {
            int _type = KEYWORD_93;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:135:12: ( 'version' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:135:14: 'version'
            {
            match("version"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_93

    // $ANTLR start KEYWORD_70
    public final void mKEYWORD_70() throws RecognitionException {
        try {
            int _type = KEYWORD_70;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:137:12: ( 'branch' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:137:14: 'branch'
            {
            match("branch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_70

    // $ANTLR start KEYWORD_71
    public final void mKEYWORD_71() throws RecognitionException {
        try {
            int _type = KEYWORD_71;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:139:12: ( 'cached' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:139:14: 'cached'
            {
            match("cached"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_71

    // $ANTLR start KEYWORD_72
    public final void mKEYWORD_72() throws RecognitionException {
        try {
            int _type = KEYWORD_72;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:141:12: ( 'elseif' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:141:14: 'elseif'
            {
            match("elseif"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_72

    // $ANTLR start KEYWORD_73
    public final void mKEYWORD_73() throws RecognitionException {
        try {
            int _type = KEYWORD_73;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:143:12: ( 'endtry' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:143:14: 'endtry'
            {
            match("endtry"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_73

    // $ANTLR start KEYWORD_74
    public final void mKEYWORD_74() throws RecognitionException {
        try {
            int _type = KEYWORD_74;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:145:12: ( 'greedy' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:145:14: 'greedy'
            {
            match("greedy"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_74

    // $ANTLR start KEYWORD_75
    public final void mKEYWORD_75() throws RecognitionException {
        try {
            int _type = KEYWORD_75;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:147:12: ( 'import' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:147:14: 'import'
            {
            match("import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_75

    // $ANTLR start KEYWORD_76
    public final void mKEYWORD_76() throws RecognitionException {
        try {
            int _type = KEYWORD_76;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:149:12: ( 'latest' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:149:14: 'latest'
            {
            match("latest"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_76

    // $ANTLR start KEYWORD_77
    public final void mKEYWORD_77() throws RecognitionException {
        try {
            int _type = KEYWORD_77;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:151:12: ( 'output' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:151:14: 'output'
            {
            match("output"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_77

    // $ANTLR start KEYWORD_78
    public final void mKEYWORD_78() throws RecognitionException {
        try {
            int _type = KEYWORD_78;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:153:12: ( 'public' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:153:14: 'public'
            {
            match("public"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_78

    // $ANTLR start KEYWORD_79
    public final void mKEYWORD_79() throws RecognitionException {
        try {
            int _type = KEYWORD_79;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:155:12: ( 'result' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:155:14: 'result'
            {
            match("result"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_79

    // $ANTLR start KEYWORD_80
    public final void mKEYWORD_80() throws RecognitionException {
        try {
            int _type = KEYWORD_80;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:157:12: ( 'source' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:157:14: 'source'
            {
            match("source"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_80

    // $ANTLR start KEYWORD_81
    public final void mKEYWORD_81() throws RecognitionException {
        try {
            int _type = KEYWORD_81;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:159:12: ( 'switch' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:159:14: 'switch'
            {
            match("switch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_81

    // $ANTLR start KEYWORD_63
    public final void mKEYWORD_63() throws RecognitionException {
        try {
            int _type = KEYWORD_63;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:161:12: ( 'catch' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:161:14: 'catch'
            {
            match("catch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_63

    // $ANTLR start KEYWORD_64
    public final void mKEYWORD_64() throws RecognitionException {
        try {
            int _type = KEYWORD_64;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:163:12: ( 'endif' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:163:14: 'endif'
            {
            match("endif"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_64

    // $ANTLR start KEYWORD_65
    public final void mKEYWORD_65() throws RecognitionException {
        try {
            int _type = KEYWORD_65;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:165:12: ( 'false' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:165:14: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_65

    // $ANTLR start KEYWORD_66
    public final void mKEYWORD_66() throws RecognitionException {
        try {
            int _type = KEYWORD_66;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:167:12: ( 'final' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:167:14: 'final'
            {
            match("final"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_66

    // $ANTLR start KEYWORD_67
    public final void mKEYWORD_67() throws RecognitionException {
        try {
            int _type = KEYWORD_67;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:169:12: ( 'input' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:169:14: 'input'
            {
            match("input"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_67

    // $ANTLR start KEYWORD_68
    public final void mKEYWORD_68() throws RecognitionException {
        try {
            int _type = KEYWORD_68;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:171:12: ( 'super' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:171:14: 'super'
            {
            match("super"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_68

    // $ANTLR start KEYWORD_69
    public final void mKEYWORD_69() throws RecognitionException {
        try {
            int _type = KEYWORD_69;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:173:12: ( 'throw' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:173:14: 'throw'
            {
            match("throw"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_69

    // $ANTLR start KEYWORD_53
    public final void mKEYWORD_53() throws RecognitionException {
        try {
            int _type = KEYWORD_53;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:175:12: ( 'case' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:175:14: 'case'
            {
            match("case"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_53

    // $ANTLR start KEYWORD_54
    public final void mKEYWORD_54() throws RecognitionException {
        try {
            int _type = KEYWORD_54;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:177:12: ( 'else' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:177:14: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_54

    // $ANTLR start KEYWORD_55
    public final void mKEYWORD_55() throws RecognitionException {
        try {
            int _type = KEYWORD_55;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:179:12: ( 'name' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:179:14: 'name'
            {
            match("name"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_55

    // $ANTLR start KEYWORD_56
    public final void mKEYWORD_56() throws RecognitionException {
        try {
            int _type = KEYWORD_56;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:181:12: ( 'null' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:181:14: 'null'
            {
            match("null"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_56

    // $ANTLR start KEYWORD_57
    public final void mKEYWORD_57() throws RecognitionException {
        try {
            int _type = KEYWORD_57;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:183:12: ( 'then' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:183:14: 'then'
            {
            match("then"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_57

    // $ANTLR start KEYWORD_58
    public final void mKEYWORD_58() throws RecognitionException {
        try {
            int _type = KEYWORD_58;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:185:12: ( 'this' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:185:14: 'this'
            {
            match("this"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_58

    // $ANTLR start KEYWORD_59
    public final void mKEYWORD_59() throws RecognitionException {
        try {
            int _type = KEYWORD_59;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:187:12: ( 'true' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:187:14: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_59

    // $ANTLR start KEYWORD_60
    public final void mKEYWORD_60() throws RecognitionException {
        try {
            int _type = KEYWORD_60;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:189:12: ( 'unit' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:189:14: 'unit'
            {
            match("unit"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_60

    // $ANTLR start KEYWORD_61
    public final void mKEYWORD_61() throws RecognitionException {
        try {
            int _type = KEYWORD_61;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:191:12: ( 'when' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:191:14: 'when'
            {
            match("when"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_61

    // $ANTLR start KEYWORD_62
    public final void mKEYWORD_62() throws RecognitionException {
        try {
            int _type = KEYWORD_62;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:193:12: ( 'with' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:193:14: 'with'
            {
            match("with"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_62

    // $ANTLR start KEYWORD_44
    public final void mKEYWORD_44() throws RecognitionException {
        try {
            int _type = KEYWORD_44;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:195:12: ( '!==' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:195:14: '!=='
            {
            match("!=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_44

    // $ANTLR start KEYWORD_45
    public final void mKEYWORD_45() throws RecognitionException {
        try {
            int _type = KEYWORD_45;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:197:12: ( '...' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:197:14: '...'
            {
            match("..."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_45

    // $ANTLR start KEYWORD_46
    public final void mKEYWORD_46() throws RecognitionException {
        try {
            int _type = KEYWORD_46;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:199:12: ( '===' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:199:14: '==='
            {
            match("==="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_46

    // $ANTLR start KEYWORD_47
    public final void mKEYWORD_47() throws RecognitionException {
        try {
            int _type = KEYWORD_47;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:201:12: ( 'env' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:201:14: 'env'
            {
            match("env"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_47

    // $ANTLR start KEYWORD_48
    public final void mKEYWORD_48() throws RecognitionException {
        try {
            int _type = KEYWORD_48;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:203:12: ( 'new' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:203:14: 'new'
            {
            match("new"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_48

    // $ANTLR start KEYWORD_49
    public final void mKEYWORD_49() throws RecognitionException {
        try {
            int _type = KEYWORD_49;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:205:12: ( 'tag' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:205:14: 'tag'
            {
            match("tag"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_49

    // $ANTLR start KEYWORD_50
    public final void mKEYWORD_50() throws RecognitionException {
        try {
            int _type = KEYWORD_50;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:207:12: ( 'try' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:207:14: 'try'
            {
            match("try"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_50

    // $ANTLR start KEYWORD_51
    public final void mKEYWORD_51() throws RecognitionException {
        try {
            int _type = KEYWORD_51;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:209:12: ( 'val' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:209:14: 'val'
            {
            match("val"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_51

    // $ANTLR start KEYWORD_52
    public final void mKEYWORD_52() throws RecognitionException {
        try {
            int _type = KEYWORD_52;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:211:12: ( 'var' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:211:14: 'var'
            {
            match("var"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_52

    // $ANTLR start KEYWORD_26
    public final void mKEYWORD_26() throws RecognitionException {
        try {
            int _type = KEYWORD_26;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:213:12: ( '!=' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:213:14: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_26

    // $ANTLR start KEYWORD_27
    public final void mKEYWORD_27() throws RecognitionException {
        try {
            int _type = KEYWORD_27;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:215:12: ( '%=' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:215:14: '%='
            {
            match("%="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_27

    // $ANTLR start KEYWORD_28
    public final void mKEYWORD_28() throws RecognitionException {
        try {
            int _type = KEYWORD_28;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:217:12: ( '&&' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:217:14: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_28

    // $ANTLR start KEYWORD_29
    public final void mKEYWORD_29() throws RecognitionException {
        try {
            int _type = KEYWORD_29;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:219:12: ( '*=' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:219:14: '*='
            {
            match("*="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_29

    // $ANTLR start KEYWORD_30
    public final void mKEYWORD_30() throws RecognitionException {
        try {
            int _type = KEYWORD_30;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:221:12: ( '++' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:221:14: '++'
            {
            match("++"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_30

    // $ANTLR start KEYWORD_31
    public final void mKEYWORD_31() throws RecognitionException {
        try {
            int _type = KEYWORD_31;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:223:12: ( '+=' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:223:14: '+='
            {
            match("+="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_31

    // $ANTLR start KEYWORD_32
    public final void mKEYWORD_32() throws RecognitionException {
        try {
            int _type = KEYWORD_32;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:225:12: ( '--' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:225:14: '--'
            {
            match("--"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_32

    // $ANTLR start KEYWORD_33
    public final void mKEYWORD_33() throws RecognitionException {
        try {
            int _type = KEYWORD_33;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:227:12: ( '-=' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:227:14: '-='
            {
            match("-="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_33

    // $ANTLR start KEYWORD_34
    public final void mKEYWORD_34() throws RecognitionException {
        try {
            int _type = KEYWORD_34;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:229:12: ( '..' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:229:14: '..'
            {
            match(".."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_34

    // $ANTLR start KEYWORD_35
    public final void mKEYWORD_35() throws RecognitionException {
        try {
            int _type = KEYWORD_35;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:231:12: ( '/=' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:231:14: '/='
            {
            match("/="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_35

    // $ANTLR start KEYWORD_36
    public final void mKEYWORD_36() throws RecognitionException {
        try {
            int _type = KEYWORD_36;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:233:12: ( '<=' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:233:14: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_36

    // $ANTLR start KEYWORD_37
    public final void mKEYWORD_37() throws RecognitionException {
        try {
            int _type = KEYWORD_37;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:235:12: ( '==' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:235:14: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_37

    // $ANTLR start KEYWORD_38
    public final void mKEYWORD_38() throws RecognitionException {
        try {
            int _type = KEYWORD_38;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:237:12: ( '=>' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:237:14: '=>'
            {
            match("=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_38

    // $ANTLR start KEYWORD_39
    public final void mKEYWORD_39() throws RecognitionException {
        try {
            int _type = KEYWORD_39;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:239:12: ( '>=' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:239:14: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_39

    // $ANTLR start KEYWORD_40
    public final void mKEYWORD_40() throws RecognitionException {
        try {
            int _type = KEYWORD_40;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:241:12: ( 'as' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:241:14: 'as'
            {
            match("as"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_40

    // $ANTLR start KEYWORD_41
    public final void mKEYWORD_41() throws RecognitionException {
        try {
            int _type = KEYWORD_41;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:243:12: ( 'if' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:243:14: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_41

    // $ANTLR start KEYWORD_42
    public final void mKEYWORD_42() throws RecognitionException {
        try {
            int _type = KEYWORD_42;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:245:12: ( '||' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:245:14: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_42

    // $ANTLR start KEYWORD_43
    public final void mKEYWORD_43() throws RecognitionException {
        try {
            int _type = KEYWORD_43;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:247:12: ( '~=' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:247:14: '~='
            {
            match("~="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_43

    // $ANTLR start KEYWORD_1
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:249:11: ( '!' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:249:13: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_1

    // $ANTLR start KEYWORD_2
    public final void mKEYWORD_2() throws RecognitionException {
        try {
            int _type = KEYWORD_2;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:251:11: ( '$' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:251:13: '$'
            {
            match('$'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_2

    // $ANTLR start KEYWORD_3
    public final void mKEYWORD_3() throws RecognitionException {
        try {
            int _type = KEYWORD_3;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:253:11: ( '%' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:253:13: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_3

    // $ANTLR start KEYWORD_4
    public final void mKEYWORD_4() throws RecognitionException {
        try {
            int _type = KEYWORD_4;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:255:11: ( '&' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:255:13: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_4

    // $ANTLR start KEYWORD_5
    public final void mKEYWORD_5() throws RecognitionException {
        try {
            int _type = KEYWORD_5;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:257:11: ( '(' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:257:13: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_5

    // $ANTLR start KEYWORD_6
    public final void mKEYWORD_6() throws RecognitionException {
        try {
            int _type = KEYWORD_6;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:259:11: ( ')' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:259:13: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_6

    // $ANTLR start KEYWORD_7
    public final void mKEYWORD_7() throws RecognitionException {
        try {
            int _type = KEYWORD_7;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:261:11: ( '*' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:261:13: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_7

    // $ANTLR start KEYWORD_8
    public final void mKEYWORD_8() throws RecognitionException {
        try {
            int _type = KEYWORD_8;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:263:11: ( '+' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:263:13: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_8

    // $ANTLR start KEYWORD_9
    public final void mKEYWORD_9() throws RecognitionException {
        try {
            int _type = KEYWORD_9;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:265:11: ( ',' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:265:13: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_9

    // $ANTLR start KEYWORD_10
    public final void mKEYWORD_10() throws RecognitionException {
        try {
            int _type = KEYWORD_10;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:267:12: ( '-' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:267:14: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_10

    // $ANTLR start KEYWORD_11
    public final void mKEYWORD_11() throws RecognitionException {
        try {
            int _type = KEYWORD_11;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:269:12: ( '.' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:269:14: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_11

    // $ANTLR start KEYWORD_12
    public final void mKEYWORD_12() throws RecognitionException {
        try {
            int _type = KEYWORD_12;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:271:12: ( '/' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:271:14: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_12

    // $ANTLR start KEYWORD_13
    public final void mKEYWORD_13() throws RecognitionException {
        try {
            int _type = KEYWORD_13;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:273:12: ( ':' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:273:14: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_13

    // $ANTLR start KEYWORD_14
    public final void mKEYWORD_14() throws RecognitionException {
        try {
            int _type = KEYWORD_14;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:275:12: ( ';' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:275:14: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_14

    // $ANTLR start KEYWORD_15
    public final void mKEYWORD_15() throws RecognitionException {
        try {
            int _type = KEYWORD_15;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:277:12: ( '<' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:277:14: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_15

    // $ANTLR start KEYWORD_16
    public final void mKEYWORD_16() throws RecognitionException {
        try {
            int _type = KEYWORD_16;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:279:12: ( '=' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:279:14: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_16

    // $ANTLR start KEYWORD_17
    public final void mKEYWORD_17() throws RecognitionException {
        try {
            int _type = KEYWORD_17;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:281:12: ( '>' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:281:14: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_17

    // $ANTLR start KEYWORD_18
    public final void mKEYWORD_18() throws RecognitionException {
        try {
            int _type = KEYWORD_18;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:283:12: ( '?' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:283:14: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_18

    // $ANTLR start KEYWORD_19
    public final void mKEYWORD_19() throws RecognitionException {
        try {
            int _type = KEYWORD_19;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:285:12: ( '@' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:285:14: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_19

    // $ANTLR start KEYWORD_20
    public final void mKEYWORD_20() throws RecognitionException {
        try {
            int _type = KEYWORD_20;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:287:12: ( '[' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:287:14: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_20

    // $ANTLR start KEYWORD_21
    public final void mKEYWORD_21() throws RecognitionException {
        try {
            int _type = KEYWORD_21;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:289:12: ( ']' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:289:14: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_21

    // $ANTLR start KEYWORD_22
    public final void mKEYWORD_22() throws RecognitionException {
        try {
            int _type = KEYWORD_22;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:291:12: ( '_' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:291:14: '_'
            {
            match('_'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_22

    // $ANTLR start KEYWORD_23
    public final void mKEYWORD_23() throws RecognitionException {
        try {
            int _type = KEYWORD_23;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:293:12: ( '{' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:293:14: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_23

    // $ANTLR start KEYWORD_24
    public final void mKEYWORD_24() throws RecognitionException {
        try {
            int _type = KEYWORD_24;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:295:12: ( '|' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:295:14: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_24

    // $ANTLR start KEYWORD_25
    public final void mKEYWORD_25() throws RecognitionException {
        try {
            int _type = KEYWORD_25;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:297:12: ( '}' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:297:14: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end KEYWORD_25

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:301:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:301:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:301:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:301:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:301:40: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_PID
    public final void mRULE_PID() throws RecognitionException {
        try {
            int _type = RULE_PID;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:303:10: ( '$' RULE_ID ( '.' RULE_ID )* )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:303:12: '$' RULE_ID ( '.' RULE_ID )*
            {
            match('$'); 
            mRULE_ID(); 
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:303:24: ( '.' RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='.') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:303:25: '.' RULE_ID
            	    {
            	    match('.'); 
            	    mRULE_ID(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_PID

    // $ANTLR start RULE_REGULAR_EXPR
    public final void mRULE_REGULAR_EXPR() throws RecognitionException {
        try {
            int _type = RULE_REGULAR_EXPR;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:305:19: ( '~/' ( '\\\\' ~ ( ( '\\t' | '\\r' | '\\n' ) ) | ~ ( ( '\\\\' | '/' | ' ' | '\\t' | '\\r' | '\\n' ) ) )* '/' ( 'u' | 'm' | 'i' | 'c' | 'd' )* )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:305:21: '~/' ( '\\\\' ~ ( ( '\\t' | '\\r' | '\\n' ) ) | ~ ( ( '\\\\' | '/' | ' ' | '\\t' | '\\r' | '\\n' ) ) )* '/' ( 'u' | 'm' | 'i' | 'c' | 'd' )*
            {
            match("~/"); 

            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:305:26: ( '\\\\' ~ ( ( '\\t' | '\\r' | '\\n' ) ) | ~ ( ( '\\\\' | '/' | ' ' | '\\t' | '\\r' | '\\n' ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\\') ) {
                    alt4=1;
                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='\b')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\u001F')||(LA4_0>='!' && LA4_0<='.')||(LA4_0>='0' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:305:27: '\\\\' ~ ( ( '\\t' | '\\r' | '\\n' ) )
            	    {
            	    match('\\'); 
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:305:52: ~ ( ( '\\\\' | '/' | ' ' | '\\t' | '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('/'); 
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:305:91: ( 'u' | 'm' | 'i' | 'c' | 'd' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='c' && LA5_0<='d')||LA5_0=='i'||LA5_0=='m'||LA5_0=='u') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:
            	    {
            	    if ( (input.LA(1)>='c' && input.LA(1)<='d')||input.LA(1)=='i'||input.LA(1)=='m'||input.LA(1)=='u' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_REGULAR_EXPR

    // $ANTLR start RULE_SIMPLE_PATTERN
    public final void mRULE_SIMPLE_PATTERN() throws RecognitionException {
        try {
            int _type = RULE_SIMPLE_PATTERN;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:307:21: ( '~' RULE_STRING )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:307:23: '~' RULE_STRING
            {
            match('~'); 
            mRULE_STRING(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SIMPLE_PATTERN

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:309:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\'' ) )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:309:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\'' )
            {
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:309:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("309:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\'' )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:309:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:309:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:309:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='0'||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u')||input.LA(1)=='x' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:309:74: ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:309:104: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:309:109: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFE')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:309:110: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='0'||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u')||input.LA(1)=='x' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:309:163: ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_DOCUMENTATION
    public final void mRULE_DOCUMENTATION() throws RecognitionException {
        try {
            int _type = RULE_DOCUMENTATION;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:311:20: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:311:22: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:311:28: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFE')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:311:56: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_DOCUMENTATION

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:313:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:313:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFE') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:313:31: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFE')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:313:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:315:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:315:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:315:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:315:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:315:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:315:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:315:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:315:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:317:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:317:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:317:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_HEX
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:319:10: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:319:12: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:319:26: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='F')||(LA15_0>='a' && LA15_0<='f')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_HEX

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:321:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:321:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:321:12: ( '0' .. '9' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:321:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_EXT_INT
    public final void mRULE_EXT_INT() throws RecognitionException {
        try {
            int _type = RULE_EXT_INT;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:323:14: ( RULE_INT ( 'e' | 'E' ) ( '-' | '+' ) RULE_INT )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:323:16: RULE_INT ( 'e' | 'E' ) ( '-' | '+' ) RULE_INT
            {
            mRULE_INT(); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            mRULE_INT(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_EXT_INT

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:325:16: ( . )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:325:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:8: ( KEYWORD_140 | KEYWORD_138 | KEYWORD_139 | KEYWORD_137 | KEYWORD_136 | KEYWORD_133 | KEYWORD_134 | KEYWORD_135 | KEYWORD_131 | KEYWORD_132 | KEYWORD_125 | KEYWORD_126 | KEYWORD_127 | KEYWORD_128 | KEYWORD_129 | KEYWORD_130 | KEYWORD_119 | KEYWORD_120 | KEYWORD_121 | KEYWORD_122 | KEYWORD_123 | KEYWORD_124 | KEYWORD_117 | KEYWORD_118 | KEYWORD_106 | KEYWORD_107 | KEYWORD_108 | KEYWORD_109 | KEYWORD_110 | KEYWORD_111 | KEYWORD_112 | KEYWORD_113 | KEYWORD_114 | KEYWORD_115 | KEYWORD_116 | KEYWORD_101 | KEYWORD_102 | KEYWORD_103 | KEYWORD_104 | KEYWORD_105 | KEYWORD_94 | KEYWORD_95 | KEYWORD_96 | KEYWORD_97 | KEYWORD_98 | KEYWORD_99 | KEYWORD_100 | KEYWORD_82 | KEYWORD_83 | KEYWORD_84 | KEYWORD_85 | KEYWORD_86 | KEYWORD_87 | KEYWORD_88 | KEYWORD_89 | KEYWORD_90 | KEYWORD_91 | KEYWORD_92 | KEYWORD_93 | KEYWORD_70 | KEYWORD_71 | KEYWORD_72 | KEYWORD_73 | KEYWORD_74 | KEYWORD_75 | KEYWORD_76 | KEYWORD_77 | KEYWORD_78 | KEYWORD_79 | KEYWORD_80 | KEYWORD_81 | KEYWORD_63 | KEYWORD_64 | KEYWORD_65 | KEYWORD_66 | KEYWORD_67 | KEYWORD_68 | KEYWORD_69 | KEYWORD_53 | KEYWORD_54 | KEYWORD_55 | KEYWORD_56 | KEYWORD_57 | KEYWORD_58 | KEYWORD_59 | KEYWORD_60 | KEYWORD_61 | KEYWORD_62 | KEYWORD_44 | KEYWORD_45 | KEYWORD_46 | KEYWORD_47 | KEYWORD_48 | KEYWORD_49 | KEYWORD_50 | KEYWORD_51 | KEYWORD_52 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_43 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | RULE_ID | RULE_PID | RULE_REGULAR_EXPR | RULE_SIMPLE_PATTERN | RULE_STRING | RULE_DOCUMENTATION | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_HEX | RULE_INT | RULE_EXT_INT | RULE_ANY_OTHER )
        int alt17=153;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:10: KEYWORD_140
                {
                mKEYWORD_140(); 

                }
                break;
            case 2 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:22: KEYWORD_138
                {
                mKEYWORD_138(); 

                }
                break;
            case 3 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:34: KEYWORD_139
                {
                mKEYWORD_139(); 

                }
                break;
            case 4 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:46: KEYWORD_137
                {
                mKEYWORD_137(); 

                }
                break;
            case 5 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:58: KEYWORD_136
                {
                mKEYWORD_136(); 

                }
                break;
            case 6 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:70: KEYWORD_133
                {
                mKEYWORD_133(); 

                }
                break;
            case 7 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:82: KEYWORD_134
                {
                mKEYWORD_134(); 

                }
                break;
            case 8 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:94: KEYWORD_135
                {
                mKEYWORD_135(); 

                }
                break;
            case 9 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:106: KEYWORD_131
                {
                mKEYWORD_131(); 

                }
                break;
            case 10 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:118: KEYWORD_132
                {
                mKEYWORD_132(); 

                }
                break;
            case 11 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:130: KEYWORD_125
                {
                mKEYWORD_125(); 

                }
                break;
            case 12 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:142: KEYWORD_126
                {
                mKEYWORD_126(); 

                }
                break;
            case 13 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:154: KEYWORD_127
                {
                mKEYWORD_127(); 

                }
                break;
            case 14 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:166: KEYWORD_128
                {
                mKEYWORD_128(); 

                }
                break;
            case 15 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:178: KEYWORD_129
                {
                mKEYWORD_129(); 

                }
                break;
            case 16 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:190: KEYWORD_130
                {
                mKEYWORD_130(); 

                }
                break;
            case 17 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:202: KEYWORD_119
                {
                mKEYWORD_119(); 

                }
                break;
            case 18 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:214: KEYWORD_120
                {
                mKEYWORD_120(); 

                }
                break;
            case 19 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:226: KEYWORD_121
                {
                mKEYWORD_121(); 

                }
                break;
            case 20 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:238: KEYWORD_122
                {
                mKEYWORD_122(); 

                }
                break;
            case 21 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:250: KEYWORD_123
                {
                mKEYWORD_123(); 

                }
                break;
            case 22 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:262: KEYWORD_124
                {
                mKEYWORD_124(); 

                }
                break;
            case 23 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:274: KEYWORD_117
                {
                mKEYWORD_117(); 

                }
                break;
            case 24 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:286: KEYWORD_118
                {
                mKEYWORD_118(); 

                }
                break;
            case 25 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:298: KEYWORD_106
                {
                mKEYWORD_106(); 

                }
                break;
            case 26 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:310: KEYWORD_107
                {
                mKEYWORD_107(); 

                }
                break;
            case 27 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:322: KEYWORD_108
                {
                mKEYWORD_108(); 

                }
                break;
            case 28 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:334: KEYWORD_109
                {
                mKEYWORD_109(); 

                }
                break;
            case 29 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:346: KEYWORD_110
                {
                mKEYWORD_110(); 

                }
                break;
            case 30 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:358: KEYWORD_111
                {
                mKEYWORD_111(); 

                }
                break;
            case 31 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:370: KEYWORD_112
                {
                mKEYWORD_112(); 

                }
                break;
            case 32 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:382: KEYWORD_113
                {
                mKEYWORD_113(); 

                }
                break;
            case 33 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:394: KEYWORD_114
                {
                mKEYWORD_114(); 

                }
                break;
            case 34 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:406: KEYWORD_115
                {
                mKEYWORD_115(); 

                }
                break;
            case 35 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:418: KEYWORD_116
                {
                mKEYWORD_116(); 

                }
                break;
            case 36 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:430: KEYWORD_101
                {
                mKEYWORD_101(); 

                }
                break;
            case 37 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:442: KEYWORD_102
                {
                mKEYWORD_102(); 

                }
                break;
            case 38 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:454: KEYWORD_103
                {
                mKEYWORD_103(); 

                }
                break;
            case 39 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:466: KEYWORD_104
                {
                mKEYWORD_104(); 

                }
                break;
            case 40 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:478: KEYWORD_105
                {
                mKEYWORD_105(); 

                }
                break;
            case 41 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:490: KEYWORD_94
                {
                mKEYWORD_94(); 

                }
                break;
            case 42 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:501: KEYWORD_95
                {
                mKEYWORD_95(); 

                }
                break;
            case 43 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:512: KEYWORD_96
                {
                mKEYWORD_96(); 

                }
                break;
            case 44 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:523: KEYWORD_97
                {
                mKEYWORD_97(); 

                }
                break;
            case 45 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:534: KEYWORD_98
                {
                mKEYWORD_98(); 

                }
                break;
            case 46 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:545: KEYWORD_99
                {
                mKEYWORD_99(); 

                }
                break;
            case 47 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:556: KEYWORD_100
                {
                mKEYWORD_100(); 

                }
                break;
            case 48 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:568: KEYWORD_82
                {
                mKEYWORD_82(); 

                }
                break;
            case 49 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:579: KEYWORD_83
                {
                mKEYWORD_83(); 

                }
                break;
            case 50 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:590: KEYWORD_84
                {
                mKEYWORD_84(); 

                }
                break;
            case 51 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:601: KEYWORD_85
                {
                mKEYWORD_85(); 

                }
                break;
            case 52 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:612: KEYWORD_86
                {
                mKEYWORD_86(); 

                }
                break;
            case 53 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:623: KEYWORD_87
                {
                mKEYWORD_87(); 

                }
                break;
            case 54 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:634: KEYWORD_88
                {
                mKEYWORD_88(); 

                }
                break;
            case 55 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:645: KEYWORD_89
                {
                mKEYWORD_89(); 

                }
                break;
            case 56 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:656: KEYWORD_90
                {
                mKEYWORD_90(); 

                }
                break;
            case 57 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:667: KEYWORD_91
                {
                mKEYWORD_91(); 

                }
                break;
            case 58 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:678: KEYWORD_92
                {
                mKEYWORD_92(); 

                }
                break;
            case 59 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:689: KEYWORD_93
                {
                mKEYWORD_93(); 

                }
                break;
            case 60 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:700: KEYWORD_70
                {
                mKEYWORD_70(); 

                }
                break;
            case 61 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:711: KEYWORD_71
                {
                mKEYWORD_71(); 

                }
                break;
            case 62 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:722: KEYWORD_72
                {
                mKEYWORD_72(); 

                }
                break;
            case 63 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:733: KEYWORD_73
                {
                mKEYWORD_73(); 

                }
                break;
            case 64 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:744: KEYWORD_74
                {
                mKEYWORD_74(); 

                }
                break;
            case 65 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:755: KEYWORD_75
                {
                mKEYWORD_75(); 

                }
                break;
            case 66 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:766: KEYWORD_76
                {
                mKEYWORD_76(); 

                }
                break;
            case 67 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:777: KEYWORD_77
                {
                mKEYWORD_77(); 

                }
                break;
            case 68 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:788: KEYWORD_78
                {
                mKEYWORD_78(); 

                }
                break;
            case 69 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:799: KEYWORD_79
                {
                mKEYWORD_79(); 

                }
                break;
            case 70 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:810: KEYWORD_80
                {
                mKEYWORD_80(); 

                }
                break;
            case 71 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:821: KEYWORD_81
                {
                mKEYWORD_81(); 

                }
                break;
            case 72 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:832: KEYWORD_63
                {
                mKEYWORD_63(); 

                }
                break;
            case 73 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:843: KEYWORD_64
                {
                mKEYWORD_64(); 

                }
                break;
            case 74 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:854: KEYWORD_65
                {
                mKEYWORD_65(); 

                }
                break;
            case 75 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:865: KEYWORD_66
                {
                mKEYWORD_66(); 

                }
                break;
            case 76 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:876: KEYWORD_67
                {
                mKEYWORD_67(); 

                }
                break;
            case 77 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:887: KEYWORD_68
                {
                mKEYWORD_68(); 

                }
                break;
            case 78 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:898: KEYWORD_69
                {
                mKEYWORD_69(); 

                }
                break;
            case 79 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:909: KEYWORD_53
                {
                mKEYWORD_53(); 

                }
                break;
            case 80 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:920: KEYWORD_54
                {
                mKEYWORD_54(); 

                }
                break;
            case 81 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:931: KEYWORD_55
                {
                mKEYWORD_55(); 

                }
                break;
            case 82 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:942: KEYWORD_56
                {
                mKEYWORD_56(); 

                }
                break;
            case 83 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:953: KEYWORD_57
                {
                mKEYWORD_57(); 

                }
                break;
            case 84 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:964: KEYWORD_58
                {
                mKEYWORD_58(); 

                }
                break;
            case 85 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:975: KEYWORD_59
                {
                mKEYWORD_59(); 

                }
                break;
            case 86 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:986: KEYWORD_60
                {
                mKEYWORD_60(); 

                }
                break;
            case 87 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:997: KEYWORD_61
                {
                mKEYWORD_61(); 

                }
                break;
            case 88 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1008: KEYWORD_62
                {
                mKEYWORD_62(); 

                }
                break;
            case 89 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1019: KEYWORD_44
                {
                mKEYWORD_44(); 

                }
                break;
            case 90 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1030: KEYWORD_45
                {
                mKEYWORD_45(); 

                }
                break;
            case 91 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1041: KEYWORD_46
                {
                mKEYWORD_46(); 

                }
                break;
            case 92 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1052: KEYWORD_47
                {
                mKEYWORD_47(); 

                }
                break;
            case 93 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1063: KEYWORD_48
                {
                mKEYWORD_48(); 

                }
                break;
            case 94 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1074: KEYWORD_49
                {
                mKEYWORD_49(); 

                }
                break;
            case 95 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1085: KEYWORD_50
                {
                mKEYWORD_50(); 

                }
                break;
            case 96 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1096: KEYWORD_51
                {
                mKEYWORD_51(); 

                }
                break;
            case 97 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1107: KEYWORD_52
                {
                mKEYWORD_52(); 

                }
                break;
            case 98 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1118: KEYWORD_26
                {
                mKEYWORD_26(); 

                }
                break;
            case 99 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1129: KEYWORD_27
                {
                mKEYWORD_27(); 

                }
                break;
            case 100 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1140: KEYWORD_28
                {
                mKEYWORD_28(); 

                }
                break;
            case 101 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1151: KEYWORD_29
                {
                mKEYWORD_29(); 

                }
                break;
            case 102 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1162: KEYWORD_30
                {
                mKEYWORD_30(); 

                }
                break;
            case 103 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1173: KEYWORD_31
                {
                mKEYWORD_31(); 

                }
                break;
            case 104 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1184: KEYWORD_32
                {
                mKEYWORD_32(); 

                }
                break;
            case 105 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1195: KEYWORD_33
                {
                mKEYWORD_33(); 

                }
                break;
            case 106 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1206: KEYWORD_34
                {
                mKEYWORD_34(); 

                }
                break;
            case 107 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1217: KEYWORD_35
                {
                mKEYWORD_35(); 

                }
                break;
            case 108 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1228: KEYWORD_36
                {
                mKEYWORD_36(); 

                }
                break;
            case 109 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1239: KEYWORD_37
                {
                mKEYWORD_37(); 

                }
                break;
            case 110 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1250: KEYWORD_38
                {
                mKEYWORD_38(); 

                }
                break;
            case 111 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1261: KEYWORD_39
                {
                mKEYWORD_39(); 

                }
                break;
            case 112 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1272: KEYWORD_40
                {
                mKEYWORD_40(); 

                }
                break;
            case 113 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1283: KEYWORD_41
                {
                mKEYWORD_41(); 

                }
                break;
            case 114 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1294: KEYWORD_42
                {
                mKEYWORD_42(); 

                }
                break;
            case 115 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1305: KEYWORD_43
                {
                mKEYWORD_43(); 

                }
                break;
            case 116 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1316: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 117 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1326: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 118 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1336: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 119 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1346: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 120 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1356: KEYWORD_5
                {
                mKEYWORD_5(); 

                }
                break;
            case 121 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1366: KEYWORD_6
                {
                mKEYWORD_6(); 

                }
                break;
            case 122 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1376: KEYWORD_7
                {
                mKEYWORD_7(); 

                }
                break;
            case 123 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1386: KEYWORD_8
                {
                mKEYWORD_8(); 

                }
                break;
            case 124 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1396: KEYWORD_9
                {
                mKEYWORD_9(); 

                }
                break;
            case 125 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1406: KEYWORD_10
                {
                mKEYWORD_10(); 

                }
                break;
            case 126 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1417: KEYWORD_11
                {
                mKEYWORD_11(); 

                }
                break;
            case 127 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1428: KEYWORD_12
                {
                mKEYWORD_12(); 

                }
                break;
            case 128 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1439: KEYWORD_13
                {
                mKEYWORD_13(); 

                }
                break;
            case 129 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1450: KEYWORD_14
                {
                mKEYWORD_14(); 

                }
                break;
            case 130 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1461: KEYWORD_15
                {
                mKEYWORD_15(); 

                }
                break;
            case 131 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1472: KEYWORD_16
                {
                mKEYWORD_16(); 

                }
                break;
            case 132 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1483: KEYWORD_17
                {
                mKEYWORD_17(); 

                }
                break;
            case 133 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1494: KEYWORD_18
                {
                mKEYWORD_18(); 

                }
                break;
            case 134 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1505: KEYWORD_19
                {
                mKEYWORD_19(); 

                }
                break;
            case 135 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1516: KEYWORD_20
                {
                mKEYWORD_20(); 

                }
                break;
            case 136 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1527: KEYWORD_21
                {
                mKEYWORD_21(); 

                }
                break;
            case 137 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1538: KEYWORD_22
                {
                mKEYWORD_22(); 

                }
                break;
            case 138 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1549: KEYWORD_23
                {
                mKEYWORD_23(); 

                }
                break;
            case 139 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1560: KEYWORD_24
                {
                mKEYWORD_24(); 

                }
                break;
            case 140 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1571: KEYWORD_25
                {
                mKEYWORD_25(); 

                }
                break;
            case 141 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1582: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 142 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1590: RULE_PID
                {
                mRULE_PID(); 

                }
                break;
            case 143 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1599: RULE_REGULAR_EXPR
                {
                mRULE_REGULAR_EXPR(); 

                }
                break;
            case 144 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1617: RULE_SIMPLE_PATTERN
                {
                mRULE_SIMPLE_PATTERN(); 

                }
                break;
            case 145 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1637: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 146 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1649: RULE_DOCUMENTATION
                {
                mRULE_DOCUMENTATION(); 

                }
                break;
            case 147 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1668: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 148 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1684: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 149 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1700: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 150 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1708: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 151 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1717: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 152 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1726: RULE_EXT_INT
                {
                mRULE_EXT_INT(); 

                }
                break;
            case 153 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/lexer/InternalBeeLang.g:1:1739: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\72\25\74\1\155\1\157\1\162\1\164\1\166\1\170\1\173\1"+
        "\176\1\u0082\1\u0084\1\u0086\1\u0088\1\67\1\u008c\10\uffff\1\u0096"+
        "\2\uffff\1\67\1\uffff\2\67\1\uffff\2\u009c\4\uffff\1\74\1\uffff"+
        "\25\74\1\u00bf\5\74\1\u00ca\23\74\1\u00e5\1\uffff\1\u00e7\1\uffff"+
        "\1\u00e9\54\uffff\1\u009c\3\uffff\36\74\1\uffff\12\74\1\uffff\1"+
        "\u011d\2\74\1\uffff\1\u0120\6\74\1\u0129\1\74\1\u012b\4\74\1\u0130"+
        "\1\u0131\5\74\11\uffff\41\74\1\u015b\3\74\1\u015f\12\74\1\uffff"+
        "\1\u016c\1\u016d\1\uffff\3\74\1\u0172\4\74\1\uffff\1\u0177\1\uffff"+
        "\1\u0178\1\u0179\2\74\2\uffff\3\74\1\u017f\1\u0180\1\uffff\33\74"+
        "\1\u019e\1\uffff\1\u019f\1\u01a1\1\74\1\uffff\1\74\2\uffff\1\74"+
        "\1\u01a5\1\74\1\uffff\11\74\1\u01b0\1\74\3\uffff\2\74\1\u01b4\1"+
        "\74\1\uffff\2\74\1\uffff\1\74\3\uffff\1\u01b9\4\74\4\uffff\11\74"+
        "\1\u01c7\2\74\1\u01ca\6\74\1\u01d2\1\74\1\uffff\3\74\1\u01d7\1\u01d8"+
        "\2\uffff\1\74\1\uffff\3\74\1\uffff\1\u01dd\7\74\1\u01e5\1\74\1\uffff"+
        "\1\74\1\u01e8\1\74\1\uffff\1\u01ea\2\74\1\u01ed\1\uffff\2\74\1\u01f0"+
        "\1\u01f1\1\u01f3\3\74\1\u01f7\2\74\1\u01fa\1\74\2\uffff\1\74\1\uffff"+
        "\5\74\1\u0203\1\74\2\uffff\1\u0205\1\uffff\1\74\2\uffff\1\u020b"+
        "\1\74\1\uffff\1\74\1\uffff\1\74\1\u020f\2\74\1\u0212\2\74\1\uffff"+
        "\1\u0215\1\74\1\uffff\1\74\1\uffff\1\u0218\1\u0219\1\uffff\1\74"+
        "\1\u021b\4\uffff\2\74\1\u021e\1\uffff\2\74\1\uffff\1\u0221\1\u0223"+
        "\2\74\1\uffff\1\u0226\1\u0227\2\uffff\1\u0228\5\uffff\1\74\1\uffff"+
        "\1\u022c\2\74\1\uffff\2\74\1\uffff\2\74\1\uffff\2\74\2\uffff\1\74"+
        "\1\uffff\2\74\1\uffff\2\74\3\uffff\2\74\5\uffff\1\74\1\uffff\3\74"+
        "\1\u0241\3\74\1\u0245\1\u0246\2\74\1\u0249\1\74\1\uffff\1\u024d"+
        "\1\u024e\1\u024f\1\74\1\u0251\1\u0252\1\uffff\1\u0253\1\u0254\1"+
        "\u0255\2\uffff\2\74\1\uffff\1\74\5\uffff\1\u0259\5\uffff\2\74\1"+
        "\u025c\1\uffff\1\74\1\u025e\1\uffff\1\74\1\uffff\3\74\1\u0263\1"+
        "\uffff";
    static final String DFA17_eofS =
        "\u0264\uffff";
    static final String DFA17_minS =
        "\1\0\1\143\1\145\2\141\1\145\1\162\2\145\1\141\1\145\2\156\1\141"+
        "\1\146\1\141\1\154\3\141\1\162\1\165\1\150\1\75\1\56\2\75\1\46\1"+
        "\75\1\53\1\55\1\52\2\75\1\174\1\42\1\101\10\uffff\1\60\2\uffff\1"+
        "\101\1\uffff\2\0\1\uffff\2\60\1\uffff\1\157\2\uffff\1\146\1\uffff"+
        "\1\163\1\145\1\162\1\142\1\166\1\145\1\151\1\141\1\144\1\162\1\164"+
        "\1\154\1\165\1\151\1\160\1\151\2\156\1\145\1\144\1\151\1\60\1\156"+
        "\1\143\1\156\1\160\1\143\1\60\1\167\1\155\1\154\1\55\1\144\1\163"+
        "\1\143\1\141\1\164\1\165\1\147\1\145\1\155\1\154\1\162\1\145\2\164"+
        "\1\145\1\75\1\uffff\1\56\1\uffff\1\75\20\uffff\1\0\33\uffff\1\60"+
        "\1\uffff\1\163\1\uffff\1\141\1\164\2\143\1\166\1\141\1\154\1\151"+
        "\1\165\1\157\1\154\1\170\1\151\1\154\1\156\1\151\1\147\1\141\1\145"+
        "\1\165\1\162\1\164\1\145\1\154\1\163\1\141\1\143\1\160\1\141\1\164"+
        "\1\uffff\1\157\1\143\1\150\1\145\1\141\1\143\2\154\1\165\1\164\1"+
        "\uffff\1\60\1\145\1\154\1\uffff\1\60\1\151\2\145\1\154\1\144\1\145"+
        "\1\60\1\145\1\60\1\163\1\156\1\157\1\145\2\60\1\163\1\145\1\160"+
        "\1\150\1\156\10\uffff\1\164\1\165\1\143\1\151\2\145\1\157\1\141"+
        "\1\154\1\151\1\156\1\151\2\154\1\163\1\141\1\160\1\163\1\144\1\143"+
        "\1\146\1\145\1\142\1\143\1\145\2\143\1\162\1\55\1\145\1\154\1\164"+
        "\1\55\1\164\1\55\1\164\1\150\1\145\1\60\1\142\1\145\1\151\1\141"+
        "\2\145\1\162\1\165\1\164\1\141\1\uffff\1\55\1\60\1\uffff\1\162\1"+
        "\167\1\146\1\60\1\156\1\165\1\55\1\163\1\uffff\1\60\1\uffff\2\60"+
        "\1\167\1\163\2\uffff\1\151\1\144\1\165\2\60\1\143\1\154\1\156\1"+
        "\157\1\144\1\145\1\162\1\156\1\164\1\154\1\143\1\147\1\162\1\164"+
        "\1\165\1\151\1\143\1\157\1\151\1\145\1\150\1\171\1\55\1\154\1\164"+
        "\1\156\1\145\1\150\1\60\1\uffff\2\60\1\151\1\uffff\1\145\2\uffff"+
        "\1\141\1\60\1\144\1\uffff\1\151\1\162\1\164\1\151\1\170\1\143\1"+
        "\155\1\164\1\144\1\60\1\156\3\uffff\1\171\1\151\1\60\1\146\1\uffff"+
        "\2\144\1\uffff\1\164\3\uffff\1\60\1\164\1\157\1\171\1\164\4\uffff"+
        "\1\164\1\160\1\156\1\145\1\144\1\164\1\144\2\145\1\60\1\55\1\145"+
        "\1\60\2\164\1\145\1\162\1\157\1\162\1\60\1\55\1\uffff\1\145\1\55"+
        "\1\164\2\60\2\uffff\1\171\1\uffff\1\157\1\55\1\164\1\uffff\1\60"+
        "\1\154\1\156\1\151\1\156\2\164\1\145\1\60\1\145\1\uffff\1\143\1"+
        "\60\1\164\1\uffff\1\60\1\163\1\145\1\60\1\uffff\1\141\1\156\2\60"+
        "\1\55\1\165\1\144\1\163\1\60\2\151\1\60\1\154\2\uffff\1\163\1\uffff"+
        "\1\151\1\157\1\55\1\164\1\156\1\55\1\163\2\uffff\1\60\1\142\1\151"+
        "\2\uffff\1\60\1\156\1\uffff\1\151\1\uffff\1\151\1\60\1\157\1\145"+
        "\1\60\1\151\1\156\1\uffff\1\60\1\145\1\uffff\1\143\1\uffff\2\60"+
        "\1\uffff\1\155\1\60\4\uffff\1\164\1\151\1\60\1\uffff\1\145\1\164"+
        "\1\uffff\1\60\1\55\1\157\1\162\1\uffff\2\60\2\uffff\1\60\1\uffff"+
        "\1\145\3\uffff\1\141\1\uffff\1\60\1\157\1\164\1\uffff\1\156\1\162"+
        "\1\uffff\1\157\1\164\1\uffff\1\157\1\150\2\uffff\1\160\1\uffff\1"+
        "\143\1\164\1\uffff\1\163\1\151\1\uffff\1\155\1\uffff\1\156\1\171"+
        "\5\uffff\1\154\1\uffff\1\156\1\171\1\163\1\60\1\156\1\163\1\146"+
        "\2\60\1\157\1\151\1\60\1\157\1\141\3\60\1\163\2\60\1\uffff\3\60"+
        "\2\uffff\1\156\1\157\1\uffff\1\156\5\uffff\1\60\5\uffff\1\144\1"+
        "\156\1\60\1\uffff\1\151\1\60\1\uffff\1\164\1\uffff\1\151\1\157\1"+
        "\156\1\60\1\uffff";
    static final String DFA17_maxS =
        "\1\ufffe\1\160\1\145\1\165\1\141\1\145\2\165\1\167\1\165\1\145\1"+
        "\160\1\163\1\157\1\156\1\165\1\170\1\157\1\162\1\145\1\162\1\165"+
        "\1\151\1\75\1\56\1\76\1\75\1\46\6\75\1\174\1\75\1\172\10\uffff\1"+
        "\172\2\uffff\1\172\1\uffff\2\ufffe\1\uffff\1\170\1\145\1\uffff\1"+
        "\162\2\uffff\1\146\1\uffff\1\163\1\157\1\162\1\142\2\166\1\151\1"+
        "\141\1\144\1\162\1\164\1\161\1\165\1\151\1\160\1\154\2\156\1\145"+
        "\1\144\1\151\1\172\1\156\1\164\1\156\1\160\1\163\1\172\1\167\1\155"+
        "\1\154\1\55\1\166\1\163\1\164\1\141\1\164\1\171\1\147\1\162\1\155"+
        "\2\162\1\145\2\164\1\145\1\75\1\uffff\1\56\1\uffff\1\75\20\uffff"+
        "\1\ufffe\33\uffff\1\145\1\uffff\1\163\1\uffff\1\141\1\164\1\166"+
        "\1\143\1\166\1\141\1\154\1\151\2\165\1\157\1\170\1\151\1\154\1\156"+
        "\1\151\1\147\1\141\1\145\1\165\1\162\1\164\1\145\1\154\1\163\1\141"+
        "\1\143\1\160\1\141\1\164\1\uffff\1\157\1\143\1\150\1\145\1\141\1"+
        "\164\1\157\1\154\1\165\1\164\1\uffff\1\172\1\145\1\154\1\uffff\1"+
        "\172\1\164\2\145\1\154\1\144\1\145\1\172\1\145\1\172\1\163\1\156"+
        "\1\157\1\145\2\172\1\163\1\145\1\160\1\150\1\156\10\uffff\1\164"+
        "\1\165\2\151\2\145\1\157\1\141\1\154\1\151\1\156\1\151\2\154\1\163"+
        "\1\141\1\160\1\163\1\144\1\143\1\146\1\145\1\142\1\143\1\145\2\143"+
        "\1\162\1\55\1\145\1\154\1\164\1\55\1\164\1\172\1\164\1\150\1\145"+
        "\1\172\1\142\1\145\1\151\3\145\1\162\1\165\1\164\1\141\1\uffff\2"+
        "\172\1\uffff\1\162\1\167\1\146\1\172\1\156\1\165\1\55\1\163\1\uffff"+
        "\1\172\1\uffff\2\172\1\167\1\163\2\uffff\1\151\1\144\1\165\2\172"+
        "\1\151\1\154\1\156\1\157\1\144\1\145\1\162\1\156\1\164\1\154\1\143"+
        "\1\147\1\162\1\164\1\165\1\151\1\143\1\157\1\151\1\145\1\150\1\171"+
        "\1\55\1\154\1\164\1\156\1\145\1\150\1\172\1\uffff\2\172\1\151\1"+
        "\uffff\1\145\2\uffff\1\141\1\172\1\144\1\uffff\1\151\1\162\1\164"+
        "\1\151\1\170\1\143\1\155\1\164\1\144\1\172\1\156\3\uffff\1\171\1"+
        "\151\1\172\1\146\1\uffff\2\144\1\uffff\1\164\3\uffff\1\172\1\164"+
        "\1\157\1\171\1\164\4\uffff\1\164\1\160\1\156\1\145\1\144\1\164\1"+
        "\144\2\145\1\172\1\55\1\145\1\172\2\164\1\145\1\162\1\157\1\162"+
        "\1\172\1\55\1\uffff\1\145\1\55\1\164\2\172\2\uffff\1\171\1\uffff"+
        "\1\157\1\55\1\164\1\uffff\1\172\1\154\1\156\1\151\1\156\2\164\1"+
        "\145\1\172\1\145\1\uffff\1\143\1\172\1\164\1\uffff\1\172\1\163\1"+
        "\145\1\172\1\uffff\1\141\1\156\3\172\1\165\1\144\1\163\1\172\2\151"+
        "\1\172\1\154\2\uffff\1\163\1\uffff\1\151\1\157\1\55\1\164\1\156"+
        "\1\172\1\163\2\uffff\1\172\1\165\1\151\2\uffff\1\172\1\156\1\uffff"+
        "\1\151\1\uffff\1\151\1\172\1\157\1\145\1\172\1\151\1\156\1\uffff"+
        "\1\172\1\145\1\uffff\1\143\1\uffff\2\172\1\uffff\1\155\1\172\4\uffff"+
        "\1\164\1\151\1\172\1\uffff\1\145\1\164\1\uffff\2\172\1\157\1\162"+
        "\1\uffff\2\172\2\uffff\1\172\1\uffff\1\165\3\uffff\1\141\1\uffff"+
        "\1\172\1\157\1\164\1\uffff\1\156\1\162\1\uffff\1\157\1\164\1\uffff"+
        "\1\157\1\150\2\uffff\1\160\1\uffff\1\143\1\164\1\uffff\1\163\1\151"+
        "\1\uffff\1\155\1\uffff\1\156\1\171\5\uffff\1\154\1\uffff\1\156\1"+
        "\171\1\163\1\172\1\156\1\163\1\146\2\172\1\157\1\151\1\172\1\157"+
        "\1\151\3\172\1\163\2\172\1\uffff\3\172\2\uffff\1\156\1\157\1\uffff"+
        "\1\156\5\uffff\1\172\5\uffff\1\144\1\156\1\172\1\uffff\1\151\1\172"+
        "\1\uffff\1\164\1\uffff\1\151\1\157\1\156\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\45\uffff\1\170\1\171\1\174\1\u0080\1\u0081\1\u0085\1\u0087\1\u0088"+
        "\1\uffff\1\u008a\1\u008c\1\uffff\1\u008d\2\uffff\1\u0095\2\uffff"+
        "\1\u0099\1\uffff\1\31\1\u0086\1\uffff\1\u008d\60\uffff\1\164\1\uffff"+
        "\1\176\1\uffff\1\156\1\u0083\1\143\1\166\1\144\1\167\1\145\1\172"+
        "\1\147\1\146\1\173\1\150\1\151\1\175\1\153\1\u0094\1\uffff\1\177"+
        "\1\154\1\u0082\1\157\1\u0084\1\162\1\u008b\1\u008f\1\163\1\u0090"+
        "\1\165\1\u008e\1\170\1\171\1\174\1\u0080\1\u0081\1\u0085\1\u0087"+
        "\1\u0088\1\u0089\1\u008a\1\u008c\1\u0091\1\u0095\1\u0096\1\u0097"+
        "\1\uffff\1\u0098\1\uffff\1\13\36\uffff\1\160\12\uffff\1\161\3\uffff"+
        "\1\47\25\uffff\1\131\1\142\1\132\1\152\1\133\1\155\1\u0092\1\u0093"+
        "\61\uffff\1\135\2\uffff\1\134\10\uffff\1\137\1\uffff\1\136\4\uffff"+
        "\1\140\1\141\42\uffff\1\14\3\uffff\1\15\1\uffff\1\26\1\126\3\uffff"+
        "\1\117\13\uffff\1\37\1\121\1\122\4\uffff\1\120\2\uffff\1\46\1\uffff"+
        "\1\125\1\124\1\123\5\uffff\1\130\1\127\1\11\1\1\25\uffff\1\12\5"+
        "\uffff\1\115\1\112\1\uffff\1\113\3\uffff\1\110\12\uffff\1\114\3"+
        "\uffff\1\111\4\uffff\1\116\15\uffff\1\104\1\4\1\uffff\1\105\7\uffff"+
        "\1\74\1\7\3\uffff\1\106\1\107\2\uffff\1\20\1\uffff\1\75\7\uffff"+
        "\1\101\2\uffff\1\77\1\uffff\1\76\2\uffff\1\102\2\uffff\1\100\1\103"+
        "\1\2\1\63\3\uffff\1\72\2\uffff\1\71\4\uffff\1\5\2\uffff\1\6\1\60"+
        "\1\uffff\1\70\1\uffff\1\25\1\17\1\24\1\uffff\1\66\3\uffff\1\61\2"+
        "\uffff\1\62\2\uffff\1\67\2\uffff\1\65\1\64\1\uffff\1\73\2\uffff"+
        "\1\54\2\uffff\1\53\1\uffff\1\56\2\uffff\1\55\1\57\1\51\1\10\1\30"+
        "\1\uffff\1\52\24\uffff\1\44\3\uffff\1\45\1\50\2\uffff\1\40\1\uffff"+
        "\1\22\1\23\1\42\1\41\1\43\1\uffff\1\32\1\33\1\34\1\35\1\36\3\uffff"+
        "\1\27\2\uffff\1\21\1\uffff\1\16\4\uffff\1\3";
    static final String DFA17_specialS =
        "\u0264\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\67\2\64\2\67\1\64\22\67\1\64\1\27\1\62\1\67\1\44\1\32\1"+
            "\33\1\63\1\45\1\46\1\34\1\35\1\47\1\36\1\30\1\37\1\65\11\66"+
            "\1\50\1\51\1\40\1\31\1\41\1\52\1\1\32\61\1\53\1\67\1\54\1\60"+
            "\1\55\1\67\1\14\1\6\1\15\1\2\1\20\1\11\1\24\1\4\1\16\1\61\1"+
            "\12\1\21\1\7\1\17\1\25\1\3\1\61\1\5\1\10\1\22\1\13\1\23\1\26"+
            "\3\61\1\56\1\42\1\57\1\43\uff80\67",
            "\1\71\14\uffff\1\70",
            "\1\73",
            "\1\77\15\uffff\1\75\2\uffff\1\76\2\uffff\1\100",
            "\1\101",
            "\1\102",
            "\1\104\2\uffff\1\103",
            "\1\106\11\uffff\1\105\5\uffff\1\107",
            "\1\110\11\uffff\1\111\5\uffff\1\113\1\uffff\1\112",
            "\1\114\7\uffff\1\115\13\uffff\1\116",
            "\1\117",
            "\1\121\1\uffff\1\120",
            "\1\123\4\uffff\1\122",
            "\1\124\15\uffff\1\125",
            "\1\130\6\uffff\1\126\1\127",
            "\1\132\3\uffff\1\131\11\uffff\1\134\5\uffff\1\133",
            "\1\136\1\uffff\1\135\11\uffff\1\137",
            "\1\141\15\uffff\1\140",
            "\1\143\6\uffff\1\144\1\145\10\uffff\1\142",
            "\1\146\3\uffff\1\147",
            "\1\150",
            "\1\151",
            "\1\153\1\152",
            "\1\154",
            "\1\156",
            "\1\160\1\161",
            "\1\163",
            "\1\165",
            "\1\167",
            "\1\172\21\uffff\1\171",
            "\1\174\17\uffff\1\175",
            "\1\u0081\4\uffff\1\u0080\15\uffff\1\177",
            "\1\u0083",
            "\1\u0085",
            "\1\u0087",
            "\1\u008b\4\uffff\1\u008b\7\uffff\1\u0089\15\uffff\1\u008a",
            "\32\u008d\3\uffff\2\u008d\1\uffff\32\u008d",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\12\u0099\1\uffff\2\u0099\1\uffff\ufff1\u0099",
            "\12\u0099\1\uffff\2\u0099\1\uffff\ufff1\u0099",
            "",
            "\12\u009d\13\uffff\1\u009e\22\uffff\1\u009b\14\uffff\1\u009e"+
            "\22\uffff\1\u009b",
            "\12\u009d\13\uffff\1\u009e\37\uffff\1\u009e",
            "",
            "\1\u009f\2\uffff\1\u00a0",
            "",
            "",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "\1\u00a4\3\uffff\1\u00a5\5\uffff\1\u00a3",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00ac\12\uffff\1\u00ab\1\u00a9\1\uffff\1\u00aa\2\uffff\1"+
            "\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3\4\uffff\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8\2\uffff\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00c0",
            "\1\u00c2\14\uffff\1\u00c4\2\uffff\1\u00c3\1\u00c1",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7\14\uffff\1\u00c8\2\uffff\1\u00c9",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00d0\21\uffff\1\u00cf",
            "\1\u00d1",
            "\1\u00d3\20\uffff\1\u00d2",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d7\3\uffff\1\u00d6",
            "\1\u00d8",
            "\1\u00da\3\uffff\1\u00d9\10\uffff\1\u00db",
            "\1\u00dc",
            "\1\u00dd\5\uffff\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "\1\u00e6",
            "",
            "\1\u00e8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\52\u00eb\1\u00ea\uffd4\u00eb",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u009d\13\uffff\1\u009e\37\uffff\1\u009e",
            "",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00f0\14\uffff\1\u00f1\5\uffff\1\u00ef",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f9\5\uffff\1\u00f8",
            "\1\u00fb\2\uffff\1\u00fa",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114\1\u0115\11\uffff\1\u0117\5\uffff\1\u0116",
            "\1\u0118\2\uffff\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u011e",
            "\1\u011f",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0123\11\uffff\1\u0122\1\u0121",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u012a",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0137",
            "\1\u0138",
            "\1\u013a\5\uffff\1\u0139",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a\2\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163\3\uffff\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "",
            "\1\u016b\2\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\10\74\1\u0171\21\74",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u017a",
            "\1\u017b",
            "",
            "",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0181\5\uffff\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\13\74\1\u01a0\16\74",
            "\1\u01a2",
            "",
            "\1\u01a3",
            "",
            "",
            "\1\u01a4",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01a6",
            "",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01b1",
            "",
            "",
            "",
            "\1\u01b2",
            "\1\u01b3",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01b5",
            "",
            "\1\u01b6",
            "\1\u01b7",
            "",
            "\1\u01b8",
            "",
            "",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "",
            "",
            "",
            "",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01c8",
            "\1\u01c9",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\4\74\1\u01d1\25\74",
            "\1\u01d3",
            "",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "\1\u01d9",
            "",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01e6",
            "",
            "\1\u01e7",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01e9",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01eb",
            "\1\u01ec",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u01ee",
            "\1\u01ef",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01f2\2\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01f8",
            "\1\u01f9",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01fb",
            "",
            "",
            "\1\u01fc",
            "",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202\2\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0204",
            "",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0206\3\uffff\1\u0209\14\uffff\1\u0208\1\uffff\1\u0207",
            "\1\u020a",
            "",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u020c",
            "",
            "\1\u020d",
            "",
            "\1\u020e",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0210",
            "\1\u0211",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0213",
            "\1\u0214",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0216",
            "",
            "\1\u0217",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u021a",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "",
            "",
            "\1\u021c",
            "\1\u021d",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u021f",
            "\1\u0220",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0222\2\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0224",
            "\1\u0225",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u022a\17\uffff\1\u0229",
            "",
            "",
            "",
            "\1\u022b",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u022d",
            "\1\u022e",
            "",
            "\1\u022f",
            "\1\u0230",
            "",
            "\1\u0231",
            "\1\u0232",
            "",
            "\1\u0233",
            "\1\u0234",
            "",
            "",
            "\1\u0235",
            "",
            "\1\u0236",
            "\1\u0237",
            "",
            "\1\u0238",
            "\1\u0239",
            "",
            "\1\u023a",
            "",
            "\1\u023b",
            "\1\u023c",
            "",
            "",
            "",
            "",
            "",
            "\1\u023d",
            "",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0247",
            "\1\u0248",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u024a",
            "\1\u024b\7\uffff\1\u024c",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0250",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "\1\u0256",
            "\1\u0257",
            "",
            "\1\u0258",
            "",
            "",
            "",
            "",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "",
            "",
            "",
            "\1\u025a",
            "\1\u025b",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u025d",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u025f",
            "",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KEYWORD_140 | KEYWORD_138 | KEYWORD_139 | KEYWORD_137 | KEYWORD_136 | KEYWORD_133 | KEYWORD_134 | KEYWORD_135 | KEYWORD_131 | KEYWORD_132 | KEYWORD_125 | KEYWORD_126 | KEYWORD_127 | KEYWORD_128 | KEYWORD_129 | KEYWORD_130 | KEYWORD_119 | KEYWORD_120 | KEYWORD_121 | KEYWORD_122 | KEYWORD_123 | KEYWORD_124 | KEYWORD_117 | KEYWORD_118 | KEYWORD_106 | KEYWORD_107 | KEYWORD_108 | KEYWORD_109 | KEYWORD_110 | KEYWORD_111 | KEYWORD_112 | KEYWORD_113 | KEYWORD_114 | KEYWORD_115 | KEYWORD_116 | KEYWORD_101 | KEYWORD_102 | KEYWORD_103 | KEYWORD_104 | KEYWORD_105 | KEYWORD_94 | KEYWORD_95 | KEYWORD_96 | KEYWORD_97 | KEYWORD_98 | KEYWORD_99 | KEYWORD_100 | KEYWORD_82 | KEYWORD_83 | KEYWORD_84 | KEYWORD_85 | KEYWORD_86 | KEYWORD_87 | KEYWORD_88 | KEYWORD_89 | KEYWORD_90 | KEYWORD_91 | KEYWORD_92 | KEYWORD_93 | KEYWORD_70 | KEYWORD_71 | KEYWORD_72 | KEYWORD_73 | KEYWORD_74 | KEYWORD_75 | KEYWORD_76 | KEYWORD_77 | KEYWORD_78 | KEYWORD_79 | KEYWORD_80 | KEYWORD_81 | KEYWORD_63 | KEYWORD_64 | KEYWORD_65 | KEYWORD_66 | KEYWORD_67 | KEYWORD_68 | KEYWORD_69 | KEYWORD_53 | KEYWORD_54 | KEYWORD_55 | KEYWORD_56 | KEYWORD_57 | KEYWORD_58 | KEYWORD_59 | KEYWORD_60 | KEYWORD_61 | KEYWORD_62 | KEYWORD_44 | KEYWORD_45 | KEYWORD_46 | KEYWORD_47 | KEYWORD_48 | KEYWORD_49 | KEYWORD_50 | KEYWORD_51 | KEYWORD_52 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_43 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | RULE_ID | RULE_PID | RULE_REGULAR_EXPR | RULE_SIMPLE_PATTERN | RULE_STRING | RULE_DOCUMENTATION | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_HEX | RULE_INT | RULE_EXT_INT | RULE_ANY_OTHER );";
        }
    }
 

}