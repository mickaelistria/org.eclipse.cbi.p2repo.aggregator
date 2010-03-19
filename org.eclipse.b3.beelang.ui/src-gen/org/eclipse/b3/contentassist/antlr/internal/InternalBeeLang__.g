lexer grammar InternalBeeLang;
@header {
package org.eclipse.b3.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T16 : 'unit' ;
T17 : 'default' ;
T18 : '=' ;
T19 : '+=' ;
T20 : '-=' ;
T21 : '*=' ;
T22 : '/=' ;
T23 : '%=' ;
T24 : '~=' ;
T25 : '==' ;
T26 : '===' ;
T27 : '!=' ;
T28 : '!==' ;
T29 : '>=' ;
T30 : '<=' ;
T31 : '>' ;
T32 : '<' ;
T33 : 'var' ;
T34 : '+' ;
T35 : '-' ;
T36 : '*' ;
T37 : '/' ;
T38 : '%' ;
T39 : '!' ;
T40 : '++' ;
T41 : '--' ;
T42 : 'input' ;
T43 : 'output' ;
T44 : 'source' ;
T45 : 'properties' ;
T46 : 'builder' ;
T47 : '?' ;
T48 : 'true' ;
T49 : 'false' ;
T50 : '[' ;
T51 : '(' ;
T52 : ']' ;
T53 : ')' ;
T54 : 'super' ;
T55 : 'this' ;
T56 : '.' ;
T57 : '@' ;
T58 : '$' ;
T59 : '&' ;
T60 : ':' ;
T61 : 'public' ;
T62 : 'private' ;
T63 : 'parallel' ;
T64 : 'sequential' ;
T65 : 'repositories' ;
T66 : '{' ;
T67 : '}' ;
T68 : 'import' ;
T69 : ';' ;
T70 : 'as' ;
T71 : 'version' ;
T72 : 'implements' ;
T73 : ',' ;
T74 : 'provides' ;
T75 : 'requires' ;
T76 : 'env' ;
T77 : 'containers' ;
T78 : 'when' ;
T79 : 'extends' ;
T80 : 'annotations' ;
T81 : 'with' ;
T82 : 'concern' ;
T83 : '#' ;
T84 : 'precondition' ;
T85 : 'postinputcondition' ;
T86 : 'postcondition' ;
T87 : 'repository' ;
T88 : 'select-first' ;
T89 : 'select-best' ;
T90 : 'select-switch' ;
T91 : 'endswitch' ;
T92 : 'case' ;
T93 : 'container' ;
T94 : 'agent' ;
T95 : 'function' ;
T96 : '=>' ;
T97 : 'cached' ;
T98 : '||' ;
T99 : '&&' ;
T100 : 'context' ;
T101 : 'proceed' ;
T102 : '_' ;
T103 : 'throw' ;
T104 : 'try' ;
T105 : 'endtry' ;
T106 : 'finally' ;
T107 : 'catch' ;
T108 : 'switch' ;
T109 : 'if' ;
T110 : 'then' ;
T111 : 'endif' ;
T112 : 'else' ;
T113 : 'elseif' ;
T114 : 'new' ;
T115 : '|' ;
T116 : 'null' ;
T117 : 'reexport' ;
T118 : 'final' ;
T119 : 'mutable' ;
T120 : '...' ;
T121 : 'val' ;
T122 : 'instanceof' ;
T123 : '..' ;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38277
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38279
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38281
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38283
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38285
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38287
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38289
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38291
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38293
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38295
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38297
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38299
RULE_ANY_OTHER : .;


