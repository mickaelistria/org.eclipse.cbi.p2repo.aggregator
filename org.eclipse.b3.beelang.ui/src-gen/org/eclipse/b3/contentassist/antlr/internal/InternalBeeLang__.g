lexer grammar InternalBeeLang;
@header {
package org.eclipse.b3.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T16 : 'input' ;
T17 : 'output' ;
T18 : '~~~~~' ;
T19 : 'select-first' ;
T20 : 'select-best' ;
T21 : '=' ;
T22 : '+=' ;
T23 : '-=' ;
T24 : '*=' ;
T25 : '/=' ;
T26 : '%=' ;
T27 : '&=' ;
T28 : '^=' ;
T29 : '|=' ;
T30 : '<<=' ;
T31 : '>>=' ;
T32 : '>>>=' ;
T33 : '~=' ;
T34 : '==' ;
T35 : '===' ;
T36 : '!=' ;
T37 : '!==' ;
T38 : '>=' ;
T39 : '<=' ;
T40 : '>' ;
T41 : '<' ;
T42 : 'var' ;
T43 : '&' ;
T44 : '^' ;
T45 : '|' ;
T46 : '<<' ;
T47 : '>>' ;
T48 : '>>>' ;
T49 : '+' ;
T50 : '-' ;
T51 : '*' ;
T52 : '/' ;
T53 : '%' ;
T54 : '!' ;
T55 : '~' ;
T56 : '++' ;
T57 : '--' ;
T58 : 'properties' ;
T59 : 'unit' ;
T60 : 'true' ;
T61 : 'false' ;
T62 : '[' ;
T63 : '(' ;
T64 : ']' ;
T65 : ')' ;
T66 : 'super' ;
T67 : 'this' ;
T68 : '.' ;
T69 : '@' ;
T70 : '$' ;
T71 : ':' ;
T72 : '?' ;
T73 : '..' ;
T74 : '**' ;
T75 : 'public' ;
T76 : 'private' ;
T77 : 'parallel' ;
T78 : 'sequential' ;
T79 : 'import' ;
T80 : ';' ;
T81 : 'as' ;
T82 : '{' ;
T83 : '}' ;
T84 : 'version' ;
T85 : 'implements' ;
T86 : ',' ;
T87 : 'default' ;
T88 : 'provides' ;
T89 : 'requires' ;
T90 : 'env' ;
T91 : 'repositories' ;
T92 : 'containers' ;
T93 : 'when' ;
T94 : 'extends' ;
T95 : 'unset' ;
T96 : '#' ;
T97 : 'annotations' ;
T98 : 'with' ;
T99 : 'concern' ;
T100 : 'builder' ;
T101 : '...' ;
T102 : 'repository' ;
T103 : 'container' ;
T104 : 'agent' ;
T105 : 'precondition' ;
T106 : 'postcondition' ;
T107 : 'assert' ;
T108 : 'function' ;
T109 : '||' ;
T110 : '&&' ;
T111 : '_' ;
T112 : 'throw' ;
T113 : 'try' ;
T114 : 'endtry' ;
T115 : 'finally' ;
T116 : 'catch' ;
T117 : 'switch' ;
T118 : 'endswitch' ;
T119 : 'case' ;
T120 : 'if' ;
T121 : 'then' ;
T122 : 'endif' ;
T123 : 'else' ;
T124 : 'elseif' ;
T125 : 'new' ;
T126 : 'context' ;
T127 : 'reexport' ;
T128 : 'final' ;
T129 : 'cached' ;
T130 : 'instanceof' ;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22805
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22807
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22809
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22811
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22813
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22815
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22817
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22819
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22821
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22823
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22825
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22827
RULE_ANY_OTHER : .;


