lexer grammar InternalBeeLang;
@header {
package org.eclipse.b3.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T16 : 'unit' ;
T17 : 'latest' ;
T18 : 'timestamp' ;
T19 : 'default' ;
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
T44 : 'input' ;
T45 : 'output' ;
T46 : 'source' ;
T47 : 'properties' ;
T48 : 'builder' ;
T49 : 'this' ;
T50 : '?' ;
T51 : 'true' ;
T52 : 'false' ;
T53 : '[' ;
T54 : '(' ;
T55 : ']' ;
T56 : ')' ;
T57 : 'super' ;
T58 : '.' ;
T59 : '@' ;
T60 : '$' ;
T61 : '&' ;
T62 : ':' ;
T63 : 'revision' ;
T64 : 'tag' ;
T65 : 'fail-modified' ;
T66 : 'keep-modified' ;
T67 : 'merge-modified' ;
T68 : 'no-update' ;
T69 : 'replace-modified' ;
T70 : 'public' ;
T71 : 'private' ;
T72 : 'parallel' ;
T73 : 'sequential' ;
T74 : 'repositories' ;
T75 : '{' ;
T76 : '}' ;
T77 : 'import' ;
T78 : ';' ;
T79 : 'as' ;
T80 : 'version' ;
T81 : 'implements' ;
T82 : ',' ;
T83 : 'provides' ;
T84 : 'requires' ;
T85 : 'env' ;
T86 : 'containers' ;
T87 : 'when' ;
T88 : 'requires-min' ;
T89 : 'requires-max' ;
T90 : 'min-required' ;
T91 : 'max-required' ;
T92 : 'extends' ;
T93 : 'annotations' ;
T94 : 'with' ;
T95 : 'concern' ;
T96 : '#' ;
T97 : 'precondition' ;
T98 : 'postinputcondition' ;
T99 : 'postcondition' ;
T100 : 'remote' ;
T101 : 'local' ;
T102 : 'user' ;
T103 : 'password' ;
T104 : 'branches' ;
T105 : 'options' ;
T106 : 'update-policy' ;
T107 : 'include' ;
T108 : 'exclude' ;
T109 : 'repository' ;
T110 : 'resolution' ;
T111 : 'select-first' ;
T112 : 'select-best' ;
T113 : 'select-switch' ;
T114 : 'endswitch' ;
T115 : 'case' ;
T116 : 'container' ;
T117 : 'agent' ;
T118 : 'function' ;
T119 : '=>' ;
T120 : 'cached' ;
T121 : '||' ;
T122 : '&&' ;
T123 : 'context' ;
T124 : 'proceed' ;
T125 : '_' ;
T126 : 'throw' ;
T127 : 'try' ;
T128 : 'endtry' ;
T129 : 'finally' ;
T130 : 'catch' ;
T131 : 'switch' ;
T132 : 'if' ;
T133 : 'then' ;
T134 : 'endif' ;
T135 : 'else' ;
T136 : 'elseif' ;
T137 : 'new' ;
T138 : '|' ;
T139 : 'null' ;
T140 : 'reexport' ;
T141 : 'greedy' ;
T142 : 'final' ;
T143 : 'mutable' ;
T144 : '...' ;
T145 : 'val' ;
T146 : 'instanceof' ;
T147 : '..' ;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55909
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55911
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55913
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55915
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55917
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55919
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55921
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55923
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55925
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55927
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55929
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/ui/contentassist/antlr/internal/InternalBeeLang.g" 55931
RULE_ANY_OTHER : .;


