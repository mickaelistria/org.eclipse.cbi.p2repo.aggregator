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
T42 : '~' ;
T43 : '++' ;
T44 : '--' ;
T45 : 'properties' ;
T46 : 'unit' ;
T47 : 'true' ;
T48 : 'false' ;
T49 : '[' ;
T50 : '(' ;
T51 : ']' ;
T52 : ')' ;
T53 : 'super' ;
T54 : 'this' ;
T55 : '.' ;
T56 : '@' ;
T57 : '$' ;
T58 : '&' ;
T59 : ':' ;
T60 : '?' ;
T61 : '..' ;
T62 : '**' ;
T63 : 'public' ;
T64 : 'private' ;
T65 : 'parallel' ;
T66 : 'sequential' ;
T67 : 'import' ;
T68 : ';' ;
T69 : 'as' ;
T70 : '{' ;
T71 : '}' ;
T72 : 'version' ;
T73 : 'implements' ;
T74 : ',' ;
T75 : 'default' ;
T76 : 'provides' ;
T77 : 'requires' ;
T78 : 'env' ;
T79 : 'repositories' ;
T80 : 'containers' ;
T81 : 'when' ;
T82 : 'extends' ;
T83 : 'unset' ;
T84 : '#' ;
T85 : 'annotations' ;
T86 : 'with' ;
T87 : 'concern' ;
T88 : 'builder' ;
T89 : '...' ;
T90 : 'repository' ;
T91 : 'container' ;
T92 : 'agent' ;
T93 : 'precondition' ;
T94 : 'postcondition' ;
T95 : 'assert' ;
T96 : 'function' ;
T97 : '=>' ;
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
T120 : 'val' ;
T121 : 'instanceof' ;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23843
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23845
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23847
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23849
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23851
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23853
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23855
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23857
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23859
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23861
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23863
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23865
RULE_ANY_OTHER : .;


