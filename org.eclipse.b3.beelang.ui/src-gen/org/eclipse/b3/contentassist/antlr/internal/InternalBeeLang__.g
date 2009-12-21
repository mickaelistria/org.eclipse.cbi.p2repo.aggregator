lexer grammar InternalBeeLang;
@header {
package org.eclipse.b3.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T16 : 'input' ;
T17 : 'output' ;
T18 : 'select-first' ;
T19 : 'select-best' ;
T20 : '=' ;
T21 : '+=' ;
T22 : '-=' ;
T23 : '*=' ;
T24 : '/=' ;
T25 : '%=' ;
T26 : '~=' ;
T27 : '==' ;
T28 : '===' ;
T29 : '!=' ;
T30 : '!==' ;
T31 : '>=' ;
T32 : '<=' ;
T33 : '>' ;
T34 : '<' ;
T35 : 'var' ;
T36 : '+' ;
T37 : '-' ;
T38 : '*' ;
T39 : '/' ;
T40 : '%' ;
T41 : '!' ;
T42 : '++' ;
T43 : '--' ;
T44 : 'properties' ;
T45 : 'unit' ;
T46 : 'true' ;
T47 : 'false' ;
T48 : '[' ;
T49 : '(' ;
T50 : ']' ;
T51 : ')' ;
T52 : 'super' ;
T53 : 'this' ;
T54 : '.' ;
T55 : '@' ;
T56 : '$' ;
T57 : '&' ;
T58 : ':' ;
T59 : '?' ;
T60 : '..' ;
T61 : '**' ;
T62 : 'public' ;
T63 : 'private' ;
T64 : 'parallel' ;
T65 : 'sequential' ;
T66 : 'import' ;
T67 : ';' ;
T68 : 'as' ;
T69 : '{' ;
T70 : '}' ;
T71 : 'version' ;
T72 : 'implements' ;
T73 : ',' ;
T74 : 'default' ;
T75 : 'provides' ;
T76 : 'requires' ;
T77 : 'env' ;
T78 : 'repositories' ;
T79 : 'containers' ;
T80 : 'when' ;
T81 : 'extends' ;
T82 : 'unset' ;
T83 : '#' ;
T84 : 'annotations' ;
T85 : 'with' ;
T86 : 'concern' ;
T87 : 'builder' ;
T88 : '...' ;
T89 : 'repository' ;
T90 : 'container' ;
T91 : 'agent' ;
T92 : 'precondition' ;
T93 : 'postcondition' ;
T94 : 'assert' ;
T95 : 'function' ;
T96 : '=>' ;
T97 : 'cached' ;
T98 : '||' ;
T99 : '&&' ;
T100 : '_' ;
T101 : 'throw' ;
T102 : 'try' ;
T103 : 'endtry' ;
T104 : 'finally' ;
T105 : 'catch' ;
T106 : 'switch' ;
T107 : 'endswitch' ;
T108 : 'case' ;
T109 : 'if' ;
T110 : 'then' ;
T111 : 'endif' ;
T112 : 'else' ;
T113 : 'elseif' ;
T114 : 'new' ;
T115 : 'context' ;
T116 : '|' ;
T117 : 'null' ;
T118 : 'reexport' ;
T119 : 'final' ;
T120 : 'val' ;
T121 : 'instanceof' ;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23994
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23996
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23998
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 24000
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 24002
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 24004
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 24006
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 24008
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 24010
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 24012
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 24014
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 24016
RULE_ANY_OTHER : .;


