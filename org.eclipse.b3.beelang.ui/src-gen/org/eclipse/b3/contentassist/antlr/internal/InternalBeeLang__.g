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
T98 : '=>' ;
T99 : '||' ;
T100 : '&&' ;
T101 : '_' ;
T102 : 'throw' ;
T103 : 'try' ;
T104 : 'endtry' ;
T105 : 'finally' ;
T106 : 'catch' ;
T107 : 'switch' ;
T108 : 'endswitch' ;
T109 : 'case' ;
T110 : 'if' ;
T111 : 'then' ;
T112 : 'endif' ;
T113 : 'else' ;
T114 : 'elseif' ;
T115 : 'new' ;
T116 : 'context' ;
T117 : '|' ;
T118 : 'reexport' ;
T119 : 'final' ;
T120 : 'cached' ;
T121 : 'val' ;
T122 : 'instanceof' ;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23719
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23721
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23723
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23725
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23727
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23729
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23731
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23733
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23735
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23737
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23739
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23741
RULE_ANY_OTHER : .;


