lexer grammar InternalBeeLang;
@header {
package org.eclipse.b3.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T16 : 'unit' ;
T17 : 'select-first' ;
T18 : 'select-best' ;
T19 : '=' ;
T20 : '+=' ;
T21 : '-=' ;
T22 : '*=' ;
T23 : '/=' ;
T24 : '%=' ;
T25 : '~=' ;
T26 : '==' ;
T27 : '===' ;
T28 : '!=' ;
T29 : '!==' ;
T30 : '>=' ;
T31 : '<=' ;
T32 : '>' ;
T33 : '<' ;
T34 : 'var' ;
T35 : '+' ;
T36 : '-' ;
T37 : '*' ;
T38 : '/' ;
T39 : '%' ;
T40 : '!' ;
T41 : '++' ;
T42 : '--' ;
T43 : 'input' ;
T44 : 'output' ;
T45 : 'properties' ;
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
T85 : 'precondition' ;
T86 : 'postcondition' ;
T87 : '...' ;
T88 : 'repository' ;
T89 : 'container' ;
T90 : 'agent' ;
T91 : 'function' ;
T92 : '=>' ;
T93 : 'cached' ;
T94 : '||' ;
T95 : '&&' ;
T96 : '_' ;
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
T111 : '|' ;
T112 : 'null' ;
T113 : 'reexport' ;
T114 : 'final' ;
T115 : 'mutable' ;
T116 : 'val' ;
T117 : 'instanceof' ;
T118 : '..' ;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25424
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25426
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25428
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25430
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25432
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25434
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25436
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25438
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25440
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25442
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25444
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 25446
RULE_ANY_OTHER : .;


