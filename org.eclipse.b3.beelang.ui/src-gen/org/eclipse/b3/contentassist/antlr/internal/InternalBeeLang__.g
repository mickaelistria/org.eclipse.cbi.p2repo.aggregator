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
T47 : 'this' ;
T48 : '?' ;
T49 : 'true' ;
T50 : 'false' ;
T51 : '[' ;
T52 : '(' ;
T53 : ']' ;
T54 : ')' ;
T55 : 'super' ;
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
T79 : 'requires-min' ;
T80 : 'requires-max' ;
T81 : 'min-required' ;
T82 : 'max-required' ;
T83 : 'extends' ;
T84 : 'annotations' ;
T85 : 'with' ;
T86 : 'concern' ;
T87 : '#' ;
T88 : 'precondition' ;
T89 : 'postinputcondition' ;
T90 : 'postcondition' ;
T91 : 'repository' ;
T92 : 'select-first' ;
T93 : 'select-best' ;
T94 : 'select-switch' ;
T95 : 'endswitch' ;
T96 : 'case' ;
T97 : 'container' ;
T98 : 'agent' ;
T99 : 'function' ;
T100 : '=>' ;
T101 : 'cached' ;
T102 : '||' ;
T103 : '&&' ;
T104 : 'context' ;
T105 : 'proceed' ;
T106 : '_' ;
T107 : 'throw' ;
T108 : 'try' ;
T109 : 'endtry' ;
T110 : 'finally' ;
T111 : 'catch' ;
T112 : 'switch' ;
T113 : 'if' ;
T114 : 'then' ;
T115 : 'endif' ;
T116 : 'else' ;
T117 : 'elseif' ;
T118 : 'new' ;
T119 : '|' ;
T120 : 'null' ;
T121 : 'reexport' ;
T122 : 'greedy' ;
T123 : 'final' ;
T124 : 'mutable' ;
T125 : '...' ;
T126 : 'val' ;
T127 : 'instanceof' ;
T128 : '..' ;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38946
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38948
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38950
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38952
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38954
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38956
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38958
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38960
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38962
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38964
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38966
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38968
RULE_ANY_OTHER : .;


