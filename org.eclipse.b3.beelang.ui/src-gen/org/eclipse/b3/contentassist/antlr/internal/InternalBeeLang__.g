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
T77 : 'resolution' ;
T78 : 'containers' ;
T79 : 'when' ;
T80 : 'requires-min' ;
T81 : 'requires-max' ;
T82 : 'min-required' ;
T83 : 'max-required' ;
T84 : 'extends' ;
T85 : 'annotations' ;
T86 : 'with' ;
T87 : 'concern' ;
T88 : '#' ;
T89 : 'precondition' ;
T90 : 'postinputcondition' ;
T91 : 'postcondition' ;
T92 : 'local' ;
T93 : 'remote' ;
T94 : 'branches' ;
T95 : 'repository' ;
T96 : 'select-first' ;
T97 : 'select-best' ;
T98 : 'select-switch' ;
T99 : 'endswitch' ;
T100 : 'case' ;
T101 : 'container' ;
T102 : 'agent' ;
T103 : 'function' ;
T104 : '=>' ;
T105 : 'cached' ;
T106 : '||' ;
T107 : '&&' ;
T108 : 'context' ;
T109 : 'proceed' ;
T110 : '_' ;
T111 : 'throw' ;
T112 : 'try' ;
T113 : 'endtry' ;
T114 : 'finally' ;
T115 : 'catch' ;
T116 : 'switch' ;
T117 : 'if' ;
T118 : 'then' ;
T119 : 'endif' ;
T120 : 'else' ;
T121 : 'elseif' ;
T122 : 'new' ;
T123 : '|' ;
T124 : 'null' ;
T125 : 'reexport' ;
T126 : 'greedy' ;
T127 : 'final' ;
T128 : 'mutable' ;
T129 : '...' ;
T130 : 'val' ;
T131 : 'instanceof' ;
T132 : '..' ;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 39796
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 39798
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 39800
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 39802
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 39804
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 39806
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 39808
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 39810
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 39812
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 39814
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 39816
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 39818
RULE_ANY_OTHER : .;


