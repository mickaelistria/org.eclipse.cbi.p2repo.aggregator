package org.eclipse.b3.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalBeeLangLexer extends Lexer {
    public static final int T29=29;
    public static final int RULE_STRING=4;
    public static final int T70=70;
    public static final int T74=74;
    public static final int T85=85;
    public static final int T20=20;
    public static final int T102=102;
    public static final int T18=18;
    public static final int T114=114;
    public static final int T103=103;
    public static final int T32=32;
    public static final int T17=17;
    public static final int T81=81;
    public static final int T118=118;
    public static final int T16=16;
    public static final int T117=117;
    public static final int T41=41;
    public static final int T24=24;
    public static final int T19=19;
    public static final int T113=113;
    public static final int T62=62;
    public static final int T109=109;
    public static final int T68=68;
    public static final int T73=73;
    public static final int T84=84;
    public static final int T33=33;
    public static final int T78=78;
    public static final int T120=120;
    public static final int T115=115;
    public static final int T42=42;
    public static final int T121=121;
    public static final int T96=96;
    public static final int T71=71;
    public static final int T72=72;
    public static final int T94=94;
    public static final int T76=76;
    public static final int T75=75;
    public static final int RULE_WS=14;
    public static final int RULE_PID=6;
    public static final int T89=89;
    public static final int T67=67;
    public static final int T119=119;
    public static final int T31=31;
    public static final int T60=60;
    public static final int T82=82;
    public static final int T100=100;
    public static final int T49=49;
    public static final int RULE_SL_COMMENT=13;
    public static final int T30=30;
    public static final int T79=79;
    public static final int T36=36;
    public static final int T58=58;
    public static final int T93=93;
    public static final int T35=35;
    public static final int T107=107;
    public static final int RULE_HEX=8;
    public static final int T83=83;
    public static final int T61=61;
    public static final int T45=45;
    public static final int T34=34;
    public static final int T101=101;
    public static final int T64=64;
    public static final int T25=25;
    public static final int T91=91;
    public static final int T105=105;
    public static final int T37=37;
    public static final int T86=86;
    public static final int T116=116;
    public static final int T26=26;
    public static final int RULE_INT=7;
    public static final int T51=51;
    public static final int T111=111;
    public static final int T46=46;
    public static final int T77=77;
    public static final int T38=38;
    public static final int RULE_EXT_INT=9;
    public static final int T106=106;
    public static final int T112=112;
    public static final int T69=69;
    public static final int T39=39;
    public static final int T21=21;
    public static final int T44=44;
    public static final int RULE_ML_COMMENT=12;
    public static final int T55=55;
    public static final int RULE_ID=5;
    public static final int T95=95;
    public static final int T22=22;
    public static final int T50=50;
    public static final int T110=110;
    public static final int T108=108;
    public static final int RULE_REGULAR_EXPR=11;
    public static final int T92=92;
    public static final int T43=43;
    public static final int T28=28;
    public static final int T23=23;
    public static final int T40=40;
    public static final int T66=66;
    public static final int T88=88;
    public static final int T63=63;
    public static final int T57=57;
    public static final int T65=65;
    public static final int T98=98;
    public static final int T56=56;
    public static final int T87=87;
    public static final int T80=80;
    public static final int T59=59;
    public static final int T97=97;
    public static final int T48=48;
    public static final int T54=54;
    public static final int EOF=-1;
    public static final int T104=104;
    public static final int T47=47;
    public static final int Tokens=122;
    public static final int RULE_DOCUMENTATION=10;
    public static final int T53=53;
    public static final int RULE_ANY_OTHER=15;
    public static final int T99=99;
    public static final int T27=27;
    public static final int T52=52;
    public static final int T90=90;
    public InternalBeeLangLexer() {;} 
    public InternalBeeLangLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g"; }

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:10:5: ( 'unit' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:10:7: 'unit'
            {
            match("unit"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:11:5: ( '=' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:11:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:12:5: ( '+=' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:12:7: '+='
            {
            match("+="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:13:5: ( '-=' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:13:7: '-='
            {
            match("-="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:14:5: ( '*=' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:14:7: '*='
            {
            match("*="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:15:5: ( '/=' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:15:7: '/='
            {
            match("/="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:16:5: ( '%=' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:16:7: '%='
            {
            match("%="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:17:5: ( '~=' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:17:7: '~='
            {
            match("~="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:18:5: ( '==' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:18:7: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:19:5: ( '===' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:19:7: '==='
            {
            match("==="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:20:5: ( '!=' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:20:7: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:21:5: ( '!==' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:21:7: '!=='
            {
            match("!=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:22:5: ( '>=' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:22:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:23:5: ( '<=' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:23:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:24:5: ( '>' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:24:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:25:5: ( '<' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:25:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:26:5: ( 'var' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:26:7: 'var'
            {
            match("var"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:27:5: ( '+' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:27:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:28:5: ( '-' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:28:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:29:5: ( '*' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:29:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:30:5: ( '/' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:30:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:31:5: ( '%' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:31:7: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:32:5: ( '!' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:32:7: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33:5: ( '++' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33:7: '++'
            {
            match("++"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:34:5: ( '--' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:34:7: '--'
            {
            match("--"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:35:5: ( 'input' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:35:7: 'input'
            {
            match("input"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:36:5: ( 'output' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:36:7: 'output'
            {
            match("output"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:37:5: ( 'properties' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:37:7: 'properties'
            {
            match("properties"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:38:5: ( '?' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:38:7: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:39:5: ( 'true' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:39:7: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:40:5: ( 'false' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:40:7: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:41:5: ( '[' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:41:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:42:5: ( '(' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:42:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:43:5: ( ']' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:43:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:44:5: ( ')' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:44:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:45:5: ( 'super' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:45:7: 'super'
            {
            match("super"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:46:5: ( 'this' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:46:7: 'this'
            {
            match("this"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:47:5: ( '.' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:47:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:48:5: ( '@' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:48:7: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:49:5: ( '$' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:49:7: '$'
            {
            match('$'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:50:5: ( '&' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:50:7: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:51:5: ( ':' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:51:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:52:5: ( 'public' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:52:7: 'public'
            {
            match("public"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:53:5: ( 'private' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:53:7: 'private'
            {
            match("private"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:54:5: ( 'parallel' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:54:7: 'parallel'
            {
            match("parallel"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:55:5: ( 'sequential' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:55:7: 'sequential'
            {
            match("sequential"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:56:5: ( 'import' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:56:7: 'import'
            {
            match("import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:57:5: ( ';' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:57:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:58:5: ( 'as' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:58:7: 'as'
            {
            match("as"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:59:5: ( '{' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:59:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:60:5: ( '}' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:60:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:61:5: ( 'version' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:61:7: 'version'
            {
            match("version"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:62:5: ( 'implements' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:62:7: 'implements'
            {
            match("implements"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:63:5: ( ',' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:63:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:64:5: ( 'default' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:64:7: 'default'
            {
            match("default"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:65:5: ( 'provides' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:65:7: 'provides'
            {
            match("provides"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:66:5: ( 'requires' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:66:7: 'requires'
            {
            match("requires"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:67:5: ( 'env' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:67:7: 'env'
            {
            match("env"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:68:5: ( 'repositories' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:68:7: 'repositories'
            {
            match("repositories"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:69:5: ( 'containers' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:69:7: 'containers'
            {
            match("containers"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:70:5: ( 'when' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:70:7: 'when'
            {
            match("when"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:71:5: ( 'extends' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:71:7: 'extends'
            {
            match("extends"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:72:5: ( 'builder' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:72:7: 'builder'
            {
            match("builder"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:73:5: ( 'annotations' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:73:7: 'annotations'
            {
            match("annotations"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public final void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:74:5: ( 'with' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:74:7: 'with'
            {
            match("with"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start T81
    public final void mT81() throws RecognitionException {
        try {
            int _type = T81;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:75:5: ( 'concern' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:75:7: 'concern'
            {
            match("concern"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start T82
    public final void mT82() throws RecognitionException {
        try {
            int _type = T82;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:76:5: ( '#' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:76:7: '#'
            {
            match('#'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T82

    // $ANTLR start T83
    public final void mT83() throws RecognitionException {
        try {
            int _type = T83;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:77:5: ( 'precondition' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:77:7: 'precondition'
            {
            match("precondition"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T83

    // $ANTLR start T84
    public final void mT84() throws RecognitionException {
        try {
            int _type = T84;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:78:5: ( 'postinputcondition' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:78:7: 'postinputcondition'
            {
            match("postinputcondition"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T84

    // $ANTLR start T85
    public final void mT85() throws RecognitionException {
        try {
            int _type = T85;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:79:5: ( 'postcondition' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:79:7: 'postcondition'
            {
            match("postcondition"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T85

    // $ANTLR start T86
    public final void mT86() throws RecognitionException {
        try {
            int _type = T86;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:80:5: ( 'repository' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:80:7: 'repository'
            {
            match("repository"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T86

    // $ANTLR start T87
    public final void mT87() throws RecognitionException {
        try {
            int _type = T87;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:81:5: ( 'select-first' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:81:7: 'select-first'
            {
            match("select-first"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T87

    // $ANTLR start T88
    public final void mT88() throws RecognitionException {
        try {
            int _type = T88;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:82:5: ( 'select-best' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:82:7: 'select-best'
            {
            match("select-best"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T88

    // $ANTLR start T89
    public final void mT89() throws RecognitionException {
        try {
            int _type = T89;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:83:5: ( 'container' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:83:7: 'container'
            {
            match("container"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T89

    // $ANTLR start T90
    public final void mT90() throws RecognitionException {
        try {
            int _type = T90;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:84:5: ( 'agent' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:84:7: 'agent'
            {
            match("agent"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T90

    // $ANTLR start T91
    public final void mT91() throws RecognitionException {
        try {
            int _type = T91;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:85:5: ( 'function' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:85:7: 'function'
            {
            match("function"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T91

    // $ANTLR start T92
    public final void mT92() throws RecognitionException {
        try {
            int _type = T92;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:86:5: ( '=>' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:86:7: '=>'
            {
            match("=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T92

    // $ANTLR start T93
    public final void mT93() throws RecognitionException {
        try {
            int _type = T93;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:87:5: ( 'cached' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:87:7: 'cached'
            {
            match("cached"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T93

    // $ANTLR start T94
    public final void mT94() throws RecognitionException {
        try {
            int _type = T94;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:88:5: ( '||' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:88:7: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T94

    // $ANTLR start T95
    public final void mT95() throws RecognitionException {
        try {
            int _type = T95;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:89:5: ( '&&' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:89:7: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T95

    // $ANTLR start T96
    public final void mT96() throws RecognitionException {
        try {
            int _type = T96;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:90:5: ( 'proceed' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:90:7: 'proceed'
            {
            match("proceed"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T96

    // $ANTLR start T97
    public final void mT97() throws RecognitionException {
        try {
            int _type = T97;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:91:5: ( '_' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:91:7: '_'
            {
            match('_'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T97

    // $ANTLR start T98
    public final void mT98() throws RecognitionException {
        try {
            int _type = T98;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:92:5: ( 'throw' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:92:7: 'throw'
            {
            match("throw"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T98

    // $ANTLR start T99
    public final void mT99() throws RecognitionException {
        try {
            int _type = T99;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:93:5: ( 'try' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:93:7: 'try'
            {
            match("try"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T99

    // $ANTLR start T100
    public final void mT100() throws RecognitionException {
        try {
            int _type = T100;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:94:6: ( 'endtry' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:94:8: 'endtry'
            {
            match("endtry"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T100

    // $ANTLR start T101
    public final void mT101() throws RecognitionException {
        try {
            int _type = T101;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:95:6: ( 'finally' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:95:8: 'finally'
            {
            match("finally"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T101

    // $ANTLR start T102
    public final void mT102() throws RecognitionException {
        try {
            int _type = T102;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:96:6: ( 'catch' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:96:8: 'catch'
            {
            match("catch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T102

    // $ANTLR start T103
    public final void mT103() throws RecognitionException {
        try {
            int _type = T103;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:97:6: ( 'switch' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:97:8: 'switch'
            {
            match("switch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T103

    // $ANTLR start T104
    public final void mT104() throws RecognitionException {
        try {
            int _type = T104;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:98:6: ( 'endswitch' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:98:8: 'endswitch'
            {
            match("endswitch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T104

    // $ANTLR start T105
    public final void mT105() throws RecognitionException {
        try {
            int _type = T105;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:99:6: ( 'case' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:99:8: 'case'
            {
            match("case"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T105

    // $ANTLR start T106
    public final void mT106() throws RecognitionException {
        try {
            int _type = T106;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:100:6: ( 'if' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:100:8: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T106

    // $ANTLR start T107
    public final void mT107() throws RecognitionException {
        try {
            int _type = T107;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:101:6: ( 'then' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:101:8: 'then'
            {
            match("then"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T107

    // $ANTLR start T108
    public final void mT108() throws RecognitionException {
        try {
            int _type = T108;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:102:6: ( 'endif' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:102:8: 'endif'
            {
            match("endif"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T108

    // $ANTLR start T109
    public final void mT109() throws RecognitionException {
        try {
            int _type = T109;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:103:6: ( 'else' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:103:8: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T109

    // $ANTLR start T110
    public final void mT110() throws RecognitionException {
        try {
            int _type = T110;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:104:6: ( 'elseif' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:104:8: 'elseif'
            {
            match("elseif"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T110

    // $ANTLR start T111
    public final void mT111() throws RecognitionException {
        try {
            int _type = T111;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:105:6: ( 'new' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:105:8: 'new'
            {
            match("new"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T111

    // $ANTLR start T112
    public final void mT112() throws RecognitionException {
        try {
            int _type = T112;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:106:6: ( 'context' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:106:8: 'context'
            {
            match("context"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T112

    // $ANTLR start T113
    public final void mT113() throws RecognitionException {
        try {
            int _type = T113;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:107:6: ( '|' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:107:8: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T113

    // $ANTLR start T114
    public final void mT114() throws RecognitionException {
        try {
            int _type = T114;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:108:6: ( 'null' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:108:8: 'null'
            {
            match("null"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T114

    // $ANTLR start T115
    public final void mT115() throws RecognitionException {
        try {
            int _type = T115;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:109:6: ( 'reexport' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:109:8: 'reexport'
            {
            match("reexport"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T115

    // $ANTLR start T116
    public final void mT116() throws RecognitionException {
        try {
            int _type = T116;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:110:6: ( 'final' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:110:8: 'final'
            {
            match("final"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T116

    // $ANTLR start T117
    public final void mT117() throws RecognitionException {
        try {
            int _type = T117;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:111:6: ( 'mutable' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:111:8: 'mutable'
            {
            match("mutable"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T117

    // $ANTLR start T118
    public final void mT118() throws RecognitionException {
        try {
            int _type = T118;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:112:6: ( '...' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:112:8: '...'
            {
            match("..."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T118

    // $ANTLR start T119
    public final void mT119() throws RecognitionException {
        try {
            int _type = T119;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:113:6: ( 'val' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:113:8: 'val'
            {
            match("val"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T119

    // $ANTLR start T120
    public final void mT120() throws RecognitionException {
        try {
            int _type = T120;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:114:6: ( 'instanceof' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:114:8: 'instanceof'
            {
            match("instanceof"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T120

    // $ANTLR start T121
    public final void mT121() throws RecognitionException {
        try {
            int _type = T121;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:115:6: ( '..' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:115:8: '..'
            {
            match(".."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T121

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33857:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33857:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33857:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33857:11: '^'
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

            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33857:40: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:
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
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33859:10: ( '$' RULE_ID ( '.' RULE_ID )* )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33859:12: '$' RULE_ID ( '.' RULE_ID )*
            {
            match('$'); 
            mRULE_ID(); 
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33859:24: ( '.' RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='.') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33859:25: '.' RULE_ID
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
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33861:19: ( '~/' ( '\\\\' ~ ( ( '\\t' | '\\r' | '\\n' ) ) | ~ ( ( '\\\\' | '/' | ' ' | '\\t' | '\\r' | '\\n' ) ) )* '/' ( 'u' | 'm' | 'i' | 'c' | 'd' )* )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33861:21: '~/' ( '\\\\' ~ ( ( '\\t' | '\\r' | '\\n' ) ) | ~ ( ( '\\\\' | '/' | ' ' | '\\t' | '\\r' | '\\n' ) ) )* '/' ( 'u' | 'm' | 'i' | 'c' | 'd' )*
            {
            match("~/"); 

            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33861:26: ( '\\\\' ~ ( ( '\\t' | '\\r' | '\\n' ) ) | ~ ( ( '\\\\' | '/' | ' ' | '\\t' | '\\r' | '\\n' ) ) )*
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
            	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33861:27: '\\\\' ~ ( ( '\\t' | '\\r' | '\\n' ) )
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
            	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33861:52: ~ ( ( '\\\\' | '/' | ' ' | '\\t' | '\\r' | '\\n' ) )
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
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33861:91: ( 'u' | 'm' | 'i' | 'c' | 'd' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='c' && LA5_0<='d')||LA5_0=='i'||LA5_0=='m'||LA5_0=='u') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:
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

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33863:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\'' ) )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33863:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\'' )
            {
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33863:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\'' )
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
                    new NoViableAltException("33863:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\'' )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33863:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33863:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )*
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
                    	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33863:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33863:74: ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) )
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
                    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33863:104: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33863:109: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )*
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
                    	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33863:110: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33863:163: ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) )
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
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33865:20: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33865:22: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33865:28: ( options {greedy=false; } : . )*
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
            	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33865:56: .
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
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33867:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33867:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
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

            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33867:31: ( options {greedy=false; } : . )*
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
            	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33867:59: .
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
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33869:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33869:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33869:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33869:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33869:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33869:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33869:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33869:41: '\\r'
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
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33871:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33871:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33871:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:
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
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33873:10: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33873:12: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
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

            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33873:26: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
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
            	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:
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
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33875:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33875:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33875:12: ( '0' .. '9' )+
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
            	    // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33875:13: '0' .. '9'
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
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33877:14: ( RULE_INT ( 'e' | 'E' ) ( '-' | '+' ) RULE_INT )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33877:16: RULE_INT ( 'e' | 'E' ) ( '-' | '+' ) RULE_INT
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
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33879:16: ( . )
            // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:33879:18: .
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
        // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:8: ( T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | T104 | T105 | T106 | T107 | T108 | T109 | T110 | T111 | T112 | T113 | T114 | T115 | T116 | T117 | T118 | T119 | T120 | T121 | RULE_ID | RULE_PID | RULE_REGULAR_EXPR | RULE_STRING | RULE_DOCUMENTATION | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_HEX | RULE_INT | RULE_EXT_INT | RULE_ANY_OTHER )
        int alt17=118;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:10: T16
                {
                mT16(); 

                }
                break;
            case 2 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:14: T17
                {
                mT17(); 

                }
                break;
            case 3 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:18: T18
                {
                mT18(); 

                }
                break;
            case 4 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:22: T19
                {
                mT19(); 

                }
                break;
            case 5 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:26: T20
                {
                mT20(); 

                }
                break;
            case 6 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:30: T21
                {
                mT21(); 

                }
                break;
            case 7 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:34: T22
                {
                mT22(); 

                }
                break;
            case 8 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:38: T23
                {
                mT23(); 

                }
                break;
            case 9 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:42: T24
                {
                mT24(); 

                }
                break;
            case 10 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:46: T25
                {
                mT25(); 

                }
                break;
            case 11 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:50: T26
                {
                mT26(); 

                }
                break;
            case 12 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:54: T27
                {
                mT27(); 

                }
                break;
            case 13 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:58: T28
                {
                mT28(); 

                }
                break;
            case 14 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:62: T29
                {
                mT29(); 

                }
                break;
            case 15 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:66: T30
                {
                mT30(); 

                }
                break;
            case 16 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:70: T31
                {
                mT31(); 

                }
                break;
            case 17 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:74: T32
                {
                mT32(); 

                }
                break;
            case 18 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:78: T33
                {
                mT33(); 

                }
                break;
            case 19 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:82: T34
                {
                mT34(); 

                }
                break;
            case 20 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:86: T35
                {
                mT35(); 

                }
                break;
            case 21 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:90: T36
                {
                mT36(); 

                }
                break;
            case 22 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:94: T37
                {
                mT37(); 

                }
                break;
            case 23 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:98: T38
                {
                mT38(); 

                }
                break;
            case 24 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:102: T39
                {
                mT39(); 

                }
                break;
            case 25 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:106: T40
                {
                mT40(); 

                }
                break;
            case 26 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:110: T41
                {
                mT41(); 

                }
                break;
            case 27 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:114: T42
                {
                mT42(); 

                }
                break;
            case 28 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:118: T43
                {
                mT43(); 

                }
                break;
            case 29 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:122: T44
                {
                mT44(); 

                }
                break;
            case 30 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:126: T45
                {
                mT45(); 

                }
                break;
            case 31 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:130: T46
                {
                mT46(); 

                }
                break;
            case 32 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:134: T47
                {
                mT47(); 

                }
                break;
            case 33 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:138: T48
                {
                mT48(); 

                }
                break;
            case 34 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:142: T49
                {
                mT49(); 

                }
                break;
            case 35 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:146: T50
                {
                mT50(); 

                }
                break;
            case 36 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:150: T51
                {
                mT51(); 

                }
                break;
            case 37 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:154: T52
                {
                mT52(); 

                }
                break;
            case 38 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:158: T53
                {
                mT53(); 

                }
                break;
            case 39 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:162: T54
                {
                mT54(); 

                }
                break;
            case 40 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:166: T55
                {
                mT55(); 

                }
                break;
            case 41 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:170: T56
                {
                mT56(); 

                }
                break;
            case 42 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:174: T57
                {
                mT57(); 

                }
                break;
            case 43 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:178: T58
                {
                mT58(); 

                }
                break;
            case 44 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:182: T59
                {
                mT59(); 

                }
                break;
            case 45 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:186: T60
                {
                mT60(); 

                }
                break;
            case 46 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:190: T61
                {
                mT61(); 

                }
                break;
            case 47 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:194: T62
                {
                mT62(); 

                }
                break;
            case 48 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:198: T63
                {
                mT63(); 

                }
                break;
            case 49 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:202: T64
                {
                mT64(); 

                }
                break;
            case 50 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:206: T65
                {
                mT65(); 

                }
                break;
            case 51 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:210: T66
                {
                mT66(); 

                }
                break;
            case 52 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:214: T67
                {
                mT67(); 

                }
                break;
            case 53 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:218: T68
                {
                mT68(); 

                }
                break;
            case 54 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:222: T69
                {
                mT69(); 

                }
                break;
            case 55 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:226: T70
                {
                mT70(); 

                }
                break;
            case 56 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:230: T71
                {
                mT71(); 

                }
                break;
            case 57 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:234: T72
                {
                mT72(); 

                }
                break;
            case 58 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:238: T73
                {
                mT73(); 

                }
                break;
            case 59 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:242: T74
                {
                mT74(); 

                }
                break;
            case 60 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:246: T75
                {
                mT75(); 

                }
                break;
            case 61 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:250: T76
                {
                mT76(); 

                }
                break;
            case 62 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:254: T77
                {
                mT77(); 

                }
                break;
            case 63 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:258: T78
                {
                mT78(); 

                }
                break;
            case 64 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:262: T79
                {
                mT79(); 

                }
                break;
            case 65 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:266: T80
                {
                mT80(); 

                }
                break;
            case 66 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:270: T81
                {
                mT81(); 

                }
                break;
            case 67 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:274: T82
                {
                mT82(); 

                }
                break;
            case 68 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:278: T83
                {
                mT83(); 

                }
                break;
            case 69 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:282: T84
                {
                mT84(); 

                }
                break;
            case 70 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:286: T85
                {
                mT85(); 

                }
                break;
            case 71 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:290: T86
                {
                mT86(); 

                }
                break;
            case 72 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:294: T87
                {
                mT87(); 

                }
                break;
            case 73 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:298: T88
                {
                mT88(); 

                }
                break;
            case 74 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:302: T89
                {
                mT89(); 

                }
                break;
            case 75 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:306: T90
                {
                mT90(); 

                }
                break;
            case 76 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:310: T91
                {
                mT91(); 

                }
                break;
            case 77 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:314: T92
                {
                mT92(); 

                }
                break;
            case 78 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:318: T93
                {
                mT93(); 

                }
                break;
            case 79 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:322: T94
                {
                mT94(); 

                }
                break;
            case 80 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:326: T95
                {
                mT95(); 

                }
                break;
            case 81 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:330: T96
                {
                mT96(); 

                }
                break;
            case 82 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:334: T97
                {
                mT97(); 

                }
                break;
            case 83 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:338: T98
                {
                mT98(); 

                }
                break;
            case 84 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:342: T99
                {
                mT99(); 

                }
                break;
            case 85 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:346: T100
                {
                mT100(); 

                }
                break;
            case 86 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:351: T101
                {
                mT101(); 

                }
                break;
            case 87 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:356: T102
                {
                mT102(); 

                }
                break;
            case 88 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:361: T103
                {
                mT103(); 

                }
                break;
            case 89 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:366: T104
                {
                mT104(); 

                }
                break;
            case 90 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:371: T105
                {
                mT105(); 

                }
                break;
            case 91 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:376: T106
                {
                mT106(); 

                }
                break;
            case 92 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:381: T107
                {
                mT107(); 

                }
                break;
            case 93 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:386: T108
                {
                mT108(); 

                }
                break;
            case 94 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:391: T109
                {
                mT109(); 

                }
                break;
            case 95 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:396: T110
                {
                mT110(); 

                }
                break;
            case 96 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:401: T111
                {
                mT111(); 

                }
                break;
            case 97 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:406: T112
                {
                mT112(); 

                }
                break;
            case 98 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:411: T113
                {
                mT113(); 

                }
                break;
            case 99 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:416: T114
                {
                mT114(); 

                }
                break;
            case 100 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:421: T115
                {
                mT115(); 

                }
                break;
            case 101 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:426: T116
                {
                mT116(); 

                }
                break;
            case 102 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:431: T117
                {
                mT117(); 

                }
                break;
            case 103 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:436: T118
                {
                mT118(); 

                }
                break;
            case 104 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:441: T119
                {
                mT119(); 

                }
                break;
            case 105 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:446: T120
                {
                mT120(); 

                }
                break;
            case 106 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:451: T121
                {
                mT121(); 

                }
                break;
            case 107 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:456: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 108 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:464: RULE_PID
                {
                mRULE_PID(); 

                }
                break;
            case 109 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:473: RULE_REGULAR_EXPR
                {
                mRULE_REGULAR_EXPR(); 

                }
                break;
            case 110 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:491: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 111 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:503: RULE_DOCUMENTATION
                {
                mRULE_DOCUMENTATION(); 

                }
                break;
            case 112 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:522: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 113 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:538: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 114 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:554: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 115 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:562: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 116 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:571: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 117 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:580: RULE_EXT_INT
                {
                mRULE_EXT_INT(); 

                }
                break;
            case 118 :
                // ../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g:1:593: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\66\1\71\1\74\1\77\1\101\1\105\1\107\1\64\1\113\1\115"+
        "\1\117\4\66\1\uffff\2\66\4\uffff\1\66\1\150\1\uffff\1\153\1\155"+
        "\2\uffff\1\66\3\uffff\6\66\1\uffff\1\u0082\1\u0083\2\66\1\64\1\uffff"+
        "\2\64\1\uffff\2\u008a\1\uffff\1\66\1\uffff\1\u008f\22\uffff\1\u0093"+
        "\5\uffff\3\66\1\u0099\6\66\1\uffff\5\66\4\uffff\3\66\1\u00af\10"+
        "\uffff\1\66\1\u00b1\1\66\3\uffff\12\66\4\uffff\3\66\5\uffff\1\u008a"+
        "\1\66\6\uffff\1\u00c6\1\u00c7\3\66\1\uffff\13\66\1\u00d9\10\66\2"+
        "\uffff\1\66\1\uffff\6\66\1\u00eb\12\66\1\u00f7\1\66\1\u00f9\2\uffff"+
        "\17\66\1\u010a\1\u010b\1\uffff\1\u010c\20\66\1\uffff\1\u011e\3\66"+
        "\1\u0122\2\66\1\u0126\1\u0127\1\66\1\u0129\1\uffff\1\66\1\uffff"+
        "\2\66\1\u012d\14\66\1\u013a\3\uffff\1\66\1\u013d\1\u013e\3\66\1"+
        "\u0142\1\u0143\7\66\1\u014b\1\66\1\uffff\2\66\1\u014f\1\uffff\3"+
        "\66\2\uffff\1\66\1\uffff\3\66\1\uffff\1\u0157\1\66\1\u0159\10\66"+
        "\1\u0162\1\uffff\2\66\2\uffff\2\66\1\u0167\2\uffff\6\66\1\u016e"+
        "\1\uffff\1\u016f\1\66\1\u0171\1\uffff\5\66\1\u0177\1\66\1\uffff"+
        "\1\66\1\uffff\1\u017a\3\66\1\u017e\3\66\1\uffff\1\66\1\u0183\1\uffff"+
        "\1\66\1\uffff\1\66\1\u0188\4\66\2\uffff\1\u018d\1\uffff\1\66\1\u018f"+
        "\1\u0190\1\u0191\1\u0192\1\uffff\2\66\1\uffff\2\66\1\u0197\1\uffff"+
        "\1\u0198\2\66\1\u019b\3\uffff\2\66\1\uffff\1\66\1\u019f\1\u01a0"+
        "\1\66\1\uffff\1\66\4\uffff\4\66\2\uffff\2\66\1\uffff\3\66\2\uffff"+
        "\1\u01ad\1\u01af\1\u01b0\1\u01b1\1\66\1\u01b3\2\66\1\u01b6\1\66"+
        "\1\u01b8\1\66\1\uffff\1\u01ba\3\uffff\1\66\1\uffff\2\66\1\uffff"+
        "\1\u01be\1\uffff\1\66\1\uffff\1\u01c0\2\66\1\uffff\1\u01c3\1\uffff"+
        "\1\u01c4\1\66\2\uffff\4\66\1\u01ca\1\uffff";
    static final String DFA17_eofS =
        "\u01cb\uffff";
    static final String DFA17_minS =
        "\1\0\1\156\1\75\1\53\1\55\1\75\1\52\1\75\1\57\3\75\1\141\1\146\1"+
        "\165\1\141\1\uffff\1\150\1\141\4\uffff\1\145\1\56\1\uffff\1\101"+
        "\1\46\2\uffff\1\147\3\uffff\2\145\1\154\1\141\1\150\1\165\1\uffff"+
        "\1\174\1\60\1\145\1\165\1\101\1\uffff\2\0\1\uffff\2\60\1\uffff\1"+
        "\151\1\uffff\1\75\12\uffff\1\0\7\uffff\1\75\5\uffff\1\154\1\162"+
        "\1\160\1\60\1\160\1\164\1\145\1\162\1\163\1\142\1\uffff\1\145\1"+
        "\165\2\156\1\154\4\uffff\1\154\1\151\1\160\1\56\10\uffff\1\145\1"+
        "\60\1\156\3\uffff\1\146\1\145\1\144\1\163\1\164\1\143\1\156\1\145"+
        "\1\164\1\151\4\uffff\1\154\1\167\1\164\5\uffff\1\60\1\164\6\uffff"+
        "\2\60\1\163\1\164\1\165\1\uffff\1\154\1\160\1\166\2\143\1\141\1"+
        "\164\1\154\1\157\1\163\1\156\1\60\1\145\1\143\1\141\1\163\1\145"+
        "\1\165\1\164\1\145\2\uffff\1\156\1\uffff\1\157\1\141\1\157\1\165"+
        "\1\170\1\151\1\60\2\145\1\150\1\143\1\145\1\143\1\156\1\150\2\154"+
        "\1\60\1\141\1\60\2\uffff\1\151\1\141\1\164\1\162\1\145\1\165\1\141"+
        "\1\157\1\145\1\151\1\145\1\154\1\143\1\151\1\167\2\60\1\uffff\1"+
        "\60\1\164\1\154\1\145\1\143\1\145\1\143\1\162\2\164\1\165\1\163"+
        "\1\151\1\160\1\167\1\162\1\146\1\uffff\1\60\1\156\1\145\1\150\1"+
        "\60\1\141\1\145\2\60\1\144\1\60\1\uffff\1\142\1\uffff\1\157\1\156"+
        "\1\60\1\164\1\155\2\164\1\156\1\162\1\144\1\145\1\154\1\157\1\156"+
        "\1\143\1\60\3\uffff\1\151\2\60\1\164\1\156\1\150\2\60\1\141\1\154"+
        "\1\151\1\162\1\157\1\151\1\171\1\60\1\146\1\uffff\2\144\1\60\1\uffff"+
        "\1\151\1\170\1\162\2\uffff\1\145\1\uffff\1\154\1\156\1\143\1\uffff"+
        "\1\60\1\145\1\60\1\145\1\144\1\164\1\145\1\144\1\145\1\156\1\160"+
        "\1\60\1\uffff\1\157\1\171\2\uffff\1\55\1\164\1\60\2\uffff\3\164"+
        "\1\145\1\162\1\164\1\60\1\uffff\1\60\1\163\1\60\1\uffff\1\156\1"+
        "\164\1\156\1\162\1\145\1\60\1\145\1\uffff\1\156\1\uffff\1\60\2\151"+
        "\1\163\1\60\1\154\1\144\1\165\1\uffff\1\156\1\60\1\142\1\151\1\uffff"+
        "\1\151\1\60\1\157\1\163\1\164\1\143\2\uffff\1\60\1\uffff\1\145\4"+
        "\60\1\uffff\1\157\1\164\1\uffff\1\164\1\145\1\60\1\uffff\1\60\1"+
        "\151\1\164\1\60\3\uffff\1\141\1\157\1\uffff\1\162\2\60\1\150\1\uffff"+
        "\1\162\4\uffff\1\146\1\163\1\151\1\163\2\uffff\1\164\1\143\1\uffff"+
        "\1\154\1\156\1\151\2\uffff\4\60\1\157\1\60\1\151\1\157\1\60\1\163"+
        "\1\60\1\145\1\uffff\1\60\3\uffff\1\156\1\uffff\1\157\1\156\1\uffff"+
        "\1\60\1\uffff\1\163\1\uffff\1\60\1\156\1\144\1\uffff\1\60\1\uffff"+
        "\1\60\1\151\2\uffff\1\164\1\151\1\157\1\156\1\60\1\uffff";
    static final String DFA17_maxS =
        "\1\ufffe\1\156\1\76\11\75\1\145\1\156\2\165\1\uffff\1\162\1\165"+
        "\4\uffff\1\167\1\56\1\uffff\1\172\1\46\2\uffff\1\163\3\uffff\2\145"+
        "\1\170\1\157\1\151\1\165\1\uffff\1\174\1\172\2\165\1\172\1\uffff"+
        "\2\ufffe\1\uffff\1\170\1\145\1\uffff\1\151\1\uffff\1\75\12\uffff"+
        "\1\ufffe\7\uffff\1\75\5\uffff\2\162\1\163\1\172\1\160\1\164\1\157"+
        "\1\162\1\163\1\142\1\uffff\1\162\1\171\2\156\1\154\4\uffff\1\161"+
        "\1\151\1\160\1\56\10\uffff\1\145\1\172\1\156\3\uffff\1\146\1\161"+
        "\1\166\1\163\2\164\1\156\1\145\1\164\1\151\4\uffff\1\154\1\167\1"+
        "\164\5\uffff\1\145\1\164\6\uffff\2\172\1\163\1\164\1\165\1\uffff"+
        "\1\157\1\160\1\166\1\143\1\166\1\141\1\164\1\154\1\157\1\163\1\156"+
        "\1\172\1\145\1\143\1\141\1\163\1\145\1\165\1\164\1\145\2\uffff\1"+
        "\156\1\uffff\1\157\1\141\1\157\1\165\1\170\1\164\1\172\2\145\1\150"+
        "\1\143\1\145\1\164\1\156\1\150\2\154\1\172\1\141\1\172\2\uffff\1"+
        "\151\1\141\1\164\1\162\1\145\1\165\1\141\1\157\1\145\1\151\1\145"+
        "\1\154\2\151\1\167\2\172\1\uffff\1\172\1\164\1\154\1\145\1\143\1"+
        "\145\1\143\1\162\2\164\1\165\1\163\1\151\1\160\1\167\1\162\1\146"+
        "\1\uffff\1\172\1\156\1\145\1\150\1\172\2\145\2\172\1\144\1\172\1"+
        "\uffff\1\142\1\uffff\1\157\1\156\1\172\1\164\1\155\2\164\1\156\1"+
        "\162\1\144\1\145\1\154\1\157\1\156\1\143\1\172\3\uffff\1\151\2\172"+
        "\1\164\1\156\1\150\2\172\1\141\1\154\1\151\1\162\1\157\1\151\1\171"+
        "\1\172\1\146\1\uffff\2\144\1\172\1\uffff\1\151\1\170\1\162\2\uffff"+
        "\1\145\1\uffff\1\154\1\156\1\143\1\uffff\1\172\1\145\1\172\1\145"+
        "\1\144\1\164\1\145\1\144\1\145\1\156\1\160\1\172\1\uffff\1\157\1"+
        "\171\2\uffff\1\55\1\164\1\172\2\uffff\3\164\1\145\1\162\1\164\1"+
        "\172\1\uffff\1\172\1\163\1\172\1\uffff\1\156\1\164\1\156\1\162\1"+
        "\145\1\172\1\145\1\uffff\1\156\1\uffff\1\172\2\151\1\163\1\172\1"+
        "\154\1\144\1\165\1\uffff\1\156\1\172\1\146\1\151\1\uffff\1\151\1"+
        "\172\1\157\1\163\1\164\1\143\2\uffff\1\172\1\uffff\1\145\4\172\1"+
        "\uffff\1\157\1\164\1\uffff\1\164\1\145\1\172\1\uffff\1\172\1\151"+
        "\1\164\1\172\3\uffff\1\141\1\157\1\uffff\1\162\2\172\1\150\1\uffff"+
        "\1\162\4\uffff\1\146\1\163\1\151\1\163\2\uffff\1\164\1\143\1\uffff"+
        "\1\154\1\156\1\171\2\uffff\4\172\1\157\1\172\1\151\1\157\1\172\1"+
        "\163\1\172\1\145\1\uffff\1\172\3\uffff\1\156\1\uffff\1\157\1\156"+
        "\1\uffff\1\172\1\uffff\1\163\1\uffff\1\172\1\156\1\144\1\uffff\1"+
        "\172\1\uffff\1\172\1\151\2\uffff\1\164\1\151\1\157\1\156\1\172\1"+
        "\uffff";
    static final String DFA17_acceptS =
        "\20\uffff\1\35\2\uffff\1\40\1\41\1\42\1\43\2\uffff\1\47\2\uffff"+
        "\1\52\1\60\1\uffff\1\62\1\63\1\66\6\uffff\1\103\5\uffff\1\153\2"+
        "\uffff\1\162\2\uffff\1\166\1\uffff\1\153\1\uffff\1\115\1\2\1\30"+
        "\1\3\1\22\1\31\1\4\1\23\1\5\1\24\1\uffff\1\6\1\161\1\25\1\7\1\26"+
        "\1\10\1\155\1\uffff\1\27\1\15\1\17\1\16\1\20\12\uffff\1\35\5\uffff"+
        "\1\40\1\41\1\42\1\43\4\uffff\1\46\1\47\1\154\1\50\1\120\1\51\1\52"+
        "\1\60\3\uffff\1\62\1\63\1\66\12\uffff\1\103\1\117\1\142\1\122\3"+
        "\uffff\1\156\1\162\1\163\1\164\1\165\2\uffff\1\12\1\11\1\160\1\157"+
        "\1\14\1\13\5\uffff\1\133\24\uffff\1\147\1\152\1\uffff\1\61\24\uffff"+
        "\1\21\1\150\21\uffff\1\124\21\uffff\1\72\13\uffff\1\140\1\uffff"+
        "\1\1\20\uffff\1\45\1\134\1\36\21\uffff\1\136\3\uffff\1\132\3\uffff"+
        "\1\75\1\101\1\uffff\1\143\3\uffff\1\32\14\uffff\1\123\2\uffff\1"+
        "\145\1\37\3\uffff\1\44\1\113\7\uffff\1\135\3\uffff\1\127\7\uffff"+
        "\1\57\1\uffff\1\33\10\uffff\1\53\4\uffff\1\130\6\uffff\1\125\1\137"+
        "\1\uffff\1\116\5\uffff\1\64\2\uffff\1\54\3\uffff\1\121\4\uffff\1"+
        "\126\1\111\1\110\2\uffff\1\67\4\uffff\1\76\1\uffff\1\141\1\102\1"+
        "\77\1\146\4\uffff\1\70\1\55\2\uffff\1\114\3\uffff\1\71\1\144\14"+
        "\uffff\1\131\1\uffff\1\112\1\151\1\65\1\uffff\1\34\2\uffff\1\56"+
        "\1\uffff\1\107\1\uffff\1\74\3\uffff\1\100\1\uffff\1\104\2\uffff"+
        "\1\73\1\106\5\uffff\1\105";
    static final String DFA17_specialS =
        "\u01cb\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\64\2\61\2\64\1\61\22\64\1\61\1\11\1\57\1\50\1\32\1\7\1\33"+
            "\1\60\1\24\1\26\1\5\1\3\1\41\1\4\1\30\1\6\1\62\11\63\1\34\1"+
            "\35\1\13\1\2\1\12\1\20\1\31\32\56\1\23\1\64\1\25\1\55\1\52\1"+
            "\64\1\36\1\47\1\45\1\42\1\44\1\22\2\56\1\15\3\56\1\54\1\53\1"+
            "\16\1\17\1\56\1\43\1\27\1\21\1\1\1\14\1\46\3\56\1\37\1\51\1"+
            "\40\1\10\uff80\64",
            "\1\65",
            "\1\67\1\70",
            "\1\72\21\uffff\1\73",
            "\1\75\17\uffff\1\76",
            "\1\100",
            "\1\102\4\uffff\1\104\15\uffff\1\103",
            "\1\106",
            "\1\111\15\uffff\1\110",
            "\1\112",
            "\1\114",
            "\1\116",
            "\1\120\3\uffff\1\121",
            "\1\123\6\uffff\1\124\1\122",
            "\1\125",
            "\1\127\15\uffff\1\130\2\uffff\1\126\2\uffff\1\131",
            "",
            "\1\133\11\uffff\1\134",
            "\1\137\7\uffff\1\136\13\uffff\1\135",
            "",
            "",
            "",
            "",
            "\1\144\17\uffff\1\146\1\uffff\1\145",
            "\1\147",
            "",
            "\32\152\3\uffff\2\152\1\uffff\32\152",
            "\1\154",
            "",
            "",
            "\1\160\6\uffff\1\162\4\uffff\1\161",
            "",
            "",
            "",
            "\1\166",
            "\1\167",
            "\1\171\1\uffff\1\170\11\uffff\1\172",
            "\1\173\15\uffff\1\174",
            "\1\175\1\176",
            "\1\177",
            "",
            "\1\u0081",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0085\17\uffff\1\u0084",
            "\1\u0086",
            "\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\u0087\1\uffff\2\u0087\1\uffff\ufff1\u0087",
            "\12\u0087\1\uffff\2\u0087\1\uffff\ufff1\u0087",
            "",
            "\12\u008c\13\uffff\1\u008b\22\uffff\1\u0089\14\uffff\1\u008b"+
            "\22\uffff\1\u0089",
            "\12\u008c\13\uffff\1\u008b\37\uffff\1\u008b",
            "",
            "\1\u008d",
            "",
            "\1\u008e",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\52\u0090\1\u0091\uffd4\u0090",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0092",
            "",
            "",
            "",
            "",
            "",
            "\1\u0095\5\uffff\1\u0094",
            "\1\u0096",
            "\1\u0098\2\uffff\1\u0097",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u009a",
            "\1\u009b",
            "\1\u009d\3\uffff\1\u009c\5\uffff\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "\1\u00a4\3\uffff\1\u00a3\10\uffff\1\u00a2",
            "\1\u00a6\3\uffff\1\u00a5",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "",
            "",
            "",
            "\1\u00aa\4\uffff\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b0",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00b2",
            "",
            "",
            "",
            "\1\u00b3",
            "\1\u00b6\12\uffff\1\u00b4\1\u00b5",
            "\1\u00b7\21\uffff\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb\17\uffff\1\u00bd\1\u00bc",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "",
            "",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "",
            "",
            "",
            "",
            "\12\u008c\13\uffff\1\u008b\37\uffff\1\u008b",
            "\1\u00c5",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\1\u00cc\2\uffff\1\u00cb",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d2\14\uffff\1\u00d0\5\uffff\1\u00d1",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "",
            "",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00ea\11\uffff\1\u00e8\1\u00e9",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f2\20\uffff\1\u00f1",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00f8",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u00fa",
            "\1\u00fb",
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
            "\1\u0106\5\uffff\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u011d\21\66",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0123\3\uffff\1\u0124",
            "\1\u0125",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0128",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u012a",
            "",
            "\1\u012b",
            "\1\u012c",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "",
            "\1\u013b",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u013c\16\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u014c",
            "",
            "\1\u014d",
            "\1\u014e",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "",
            "",
            "\1\u0153",
            "",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0158",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0163",
            "\1\u0164",
            "",
            "",
            "\1\u0165",
            "\1\u0166",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0170",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0178",
            "",
            "\1\u0179",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "",
            "\1\u0182",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0184\3\uffff\1\u0185",
            "\1\u0186",
            "",
            "\1\u0187",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u018e",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0193",
            "\1\u0194",
            "",
            "\1\u0195",
            "\1\u0196",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0199",
            "\1\u019a",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "",
            "\1\u019c",
            "\1\u019d",
            "",
            "\1\u019e",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01a1",
            "",
            "\1\u01a2",
            "",
            "",
            "",
            "",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "",
            "",
            "\1\u01a7",
            "\1\u01a8",
            "",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ac\17\uffff\1\u01ab",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\22\66\1\u01ae\7\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01b2",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01b4",
            "\1\u01b5",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01b7",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01b9",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "",
            "\1\u01bb",
            "",
            "\1\u01bc",
            "\1\u01bd",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u01bf",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01c1",
            "\1\u01c2",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01c5",
            "",
            "",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
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
            return "1:1: Tokens : ( T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | T104 | T105 | T106 | T107 | T108 | T109 | T110 | T111 | T112 | T113 | T114 | T115 | T116 | T117 | T118 | T119 | T120 | T121 | RULE_ID | RULE_PID | RULE_REGULAR_EXPR | RULE_STRING | RULE_DOCUMENTATION | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_HEX | RULE_INT | RULE_EXT_INT | RULE_ANY_OTHER );";
        }
    }
 

}