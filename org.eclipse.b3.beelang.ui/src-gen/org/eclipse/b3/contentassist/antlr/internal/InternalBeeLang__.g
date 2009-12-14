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
T27 : '~=' ;
T28 : '==' ;
T29 : '===' ;
T30 : '!=' ;
T31 : '!==' ;
T32 : '>=' ;
T33 : '<=' ;
T34 : '>' ;
T35 : '<' ;
T36 : 'var' ;
T37 : '+' ;
T38 : '-' ;
T39 : '*' ;
T40 : '/' ;
T41 : '%' ;
T42 : '!' ;
T43 : '~' ;
T44 : '++' ;
T45 : '--' ;
T46 : 'properties' ;
T47 : 'unit' ;
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
T61 : '?' ;
T62 : '..' ;
T63 : '**' ;
T64 : 'public' ;
T65 : 'private' ;
T66 : 'parallel' ;
T67 : 'sequential' ;
T68 : 'import' ;
T69 : ';' ;
T70 : 'as' ;
T71 : '{' ;
T72 : '}' ;
T73 : 'version' ;
T74 : 'implements' ;
T75 : ',' ;
T76 : 'default' ;
T77 : 'provides' ;
T78 : 'requires' ;
T79 : 'env' ;
T80 : 'repositories' ;
T81 : 'containers' ;
T82 : 'when' ;
T83 : 'extends' ;
T84 : 'unset' ;
T85 : '#' ;
T86 : 'annotations' ;
T87 : 'with' ;
T88 : 'concern' ;
T89 : 'builder' ;
T90 : '...' ;
T91 : 'repository' ;
T92 : 'container' ;
T93 : 'agent' ;
T94 : 'precondition' ;
T95 : 'postcondition' ;
T96 : 'assert' ;
T97 : 'function' ;
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
T117 : 'reexport' ;
T118 : 'final' ;
T119 : 'cached' ;
T120 : 'instanceof' ;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23008
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23010
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23012
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23014
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23016
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23018
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23020
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23022
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23024
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23026
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23028
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23030
RULE_ANY_OTHER : .;


