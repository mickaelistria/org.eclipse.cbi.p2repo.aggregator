lexer grammar InternalBeeLang;
@header {
package org.eclipse.b3.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T16 : 'unit' ;
T17 : '=' ;
T18 : '+=' ;
T19 : '-=' ;
T20 : '*=' ;
T21 : '/=' ;
T22 : '%=' ;
T23 : '~=' ;
T24 : '==' ;
T25 : '===' ;
T26 : '!=' ;
T27 : '!==' ;
T28 : '>=' ;
T29 : '<=' ;
T30 : '>' ;
T31 : '<' ;
T32 : 'var' ;
T33 : '+' ;
T34 : '-' ;
T35 : '*' ;
T36 : '/' ;
T37 : '%' ;
T38 : '!' ;
T39 : '++' ;
T40 : '--' ;
T41 : 'input' ;
T42 : 'output' ;
T43 : 'properties' ;
T44 : 'true' ;
T45 : 'false' ;
T46 : '[' ;
T47 : '(' ;
T48 : ']' ;
T49 : ')' ;
T50 : 'super' ;
T51 : 'this' ;
T52 : '.' ;
T53 : '@' ;
T54 : '$' ;
T55 : '&' ;
T56 : ':' ;
T57 : '?' ;
T58 : 'public' ;
T59 : 'private' ;
T60 : 'parallel' ;
T61 : 'sequential' ;
T62 : 'import' ;
T63 : ';' ;
T64 : 'as' ;
T65 : '{' ;
T66 : '}' ;
T67 : 'version' ;
T68 : 'implements' ;
T69 : ',' ;
T70 : 'default' ;
T71 : 'provides' ;
T72 : 'requires' ;
T73 : 'env' ;
T74 : 'repositories' ;
T75 : 'containers' ;
T76 : 'when' ;
T77 : 'extends' ;
T78 : '#' ;
T79 : 'annotations' ;
T80 : 'with' ;
T81 : 'concern' ;
T82 : 'builder' ;
T83 : 'precondition' ;
T84 : 'postcondition' ;
T85 : 'repository' ;
T86 : 'select-first' ;
T87 : 'select-best' ;
T88 : 'container' ;
T89 : 'agent' ;
T90 : 'function' ;
T91 : '=>' ;
T92 : 'cached' ;
T93 : '||' ;
T94 : '&&' ;
T95 : '_' ;
T96 : 'throw' ;
T97 : 'try' ;
T98 : 'endtry' ;
T99 : 'finally' ;
T100 : 'catch' ;
T101 : 'switch' ;
T102 : 'endswitch' ;
T103 : 'case' ;
T104 : 'if' ;
T105 : 'then' ;
T106 : 'endif' ;
T107 : 'else' ;
T108 : 'elseif' ;
T109 : 'new' ;
T110 : '|' ;
T111 : 'null' ;
T112 : 'reexport' ;
T113 : 'final' ;
T114 : 'mutable' ;
T115 : '...' ;
T116 : 'val' ;
T117 : 'instanceof' ;
T118 : '..' ;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25170
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25172
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25174
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25176
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25178
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25180
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25182
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25184
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25186
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25188
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25190
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25192
RULE_ANY_OTHER : .;


