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
T60 : 'public' ;
T61 : 'private' ;
T62 : 'parallel' ;
T63 : 'sequential' ;
T64 : 'import' ;
T65 : ';' ;
T66 : 'as' ;
T67 : '{' ;
T68 : '}' ;
T69 : 'version' ;
T70 : 'implements' ;
T71 : ',' ;
T72 : 'default' ;
T73 : 'provides' ;
T74 : 'requires' ;
T75 : 'env' ;
T76 : 'repositories' ;
T77 : 'containers' ;
T78 : 'when' ;
T79 : 'extends' ;
T80 : '#' ;
T81 : 'annotations' ;
T82 : 'with' ;
T83 : 'concern' ;
T84 : 'builder' ;
T85 : '...' ;
T86 : 'repository' ;
T87 : 'container' ;
T88 : 'agent' ;
T89 : 'precondition' ;
T90 : 'postcondition' ;
T91 : 'assert' ;
T92 : 'function' ;
T93 : '=>' ;
T94 : 'cached' ;
T95 : '||' ;
T96 : '&&' ;
T97 : '_' ;
T98 : 'throw' ;
T99 : 'try' ;
T100 : 'endtry' ;
T101 : 'finally' ;
T102 : 'catch' ;
T103 : 'switch' ;
T104 : 'endswitch' ;
T105 : 'case' ;
T106 : 'if' ;
T107 : 'then' ;
T108 : 'endif' ;
T109 : 'else' ;
T110 : 'elseif' ;
T111 : 'new' ;
T112 : 'context' ;
T113 : '|' ;
T114 : 'null' ;
T115 : 'reexport' ;
T116 : 'final' ;
T117 : 'mutable' ;
T118 : 'val' ;
T119 : 'instanceof' ;
T120 : '..' ;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25178
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25180
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25182
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25184
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25186
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25188
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25190
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25192
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25194
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25196
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25198
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25200
RULE_ANY_OTHER : .;


