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
T110 : 'context' ;
T111 : '|' ;
T112 : 'null' ;
T113 : 'reexport' ;
T114 : 'final' ;
T115 : 'mutable' ;
T116 : '...' ;
T117 : 'val' ;
T118 : 'instanceof' ;
T119 : '..' ;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 31349
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 31351
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 31353
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 31355
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 31357
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 31359
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 31361
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 31363
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 31365
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 31367
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 31369
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 31371
RULE_ANY_OTHER : .;


