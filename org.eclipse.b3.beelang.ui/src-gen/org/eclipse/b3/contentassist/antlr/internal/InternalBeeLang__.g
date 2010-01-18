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
T44 : '_' ;
T45 : 'true' ;
T46 : 'false' ;
T47 : '[' ;
T48 : '(' ;
T49 : ']' ;
T50 : ')' ;
T51 : 'super' ;
T52 : 'this' ;
T53 : '.' ;
T54 : '@' ;
T55 : '$' ;
T56 : '&' ;
T57 : ':' ;
T58 : '?' ;
T59 : 'public' ;
T60 : 'private' ;
T61 : 'parallel' ;
T62 : 'sequential' ;
T63 : 'import' ;
T64 : ';' ;
T65 : 'as' ;
T66 : '{' ;
T67 : '}' ;
T68 : 'version' ;
T69 : 'implements' ;
T70 : ',' ;
T71 : 'default' ;
T72 : 'provides' ;
T73 : 'requires' ;
T74 : 'env' ;
T75 : 'repositories' ;
T76 : 'containers' ;
T77 : 'when' ;
T78 : 'extends' ;
T79 : 'builder' ;
T80 : 'annotations' ;
T81 : 'with' ;
T82 : 'concern' ;
T83 : '#' ;
T84 : 'precondition' ;
T85 : 'postcondition' ;
T86 : 'repository' ;
T87 : 'select-first' ;
T88 : 'select-best' ;
T89 : 'container' ;
T90 : 'agent' ;
T91 : 'function' ;
T92 : '=>' ;
T93 : 'cached' ;
T94 : '||' ;
T95 : '&&' ;
T96 : 'proceed' ;
T97 : 'throw' ;
T98 : 'try' ;
T99 : 'endtry' ;
T100 : 'finally' ;
T101 : 'catch' ;
T102 : 'switch' ;
T103 : 'endswitch' ;
T104 : 'case' ;
T105 : 'if' ;
T106 : 'then' ;
T107 : 'endif' ;
T108 : 'else' ;
T109 : 'elseif' ;
T110 : 'new' ;
T111 : 'context' ;
T112 : '|' ;
T113 : 'null' ;
T114 : 'reexport' ;
T115 : 'final' ;
T116 : 'mutable' ;
T117 : '...' ;
T118 : 'val' ;
T119 : 'instanceof' ;
T120 : '..' ;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 32238
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 32240
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 32242
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 32244
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 32246
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 32248
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 32250
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 32252
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 32254
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 32256
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 32258
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 32260
RULE_ANY_OTHER : .;


