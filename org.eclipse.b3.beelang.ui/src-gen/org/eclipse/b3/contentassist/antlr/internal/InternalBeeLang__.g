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
T98 : 'cached' ;
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
T120 : 'val' ;
T121 : 'instanceof' ;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23928
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23930
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23932
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23934
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23936
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23938
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23940
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23942
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23944
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23946
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23948
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 23950
RULE_ANY_OTHER : .;


