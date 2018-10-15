# Syntax analyzer for Python programming language
## Authors: Dinar Salakhutdinov, Anastasia Kirdysheva

##Compilation and Running
To compile and run our project you should use IntelliJ Idea by Netbrains. To make code work correctly, you should create 
project that is able to use with Maven because we used Maven libraries. All dependencies 
for these libraries are stored in the pom.xml file.

##Testing
We have written several unit tests for our code. These tests were written by JUnit 4 library that is supported by IntelliJ 
Idea, so you should not to switch between tools to run our tests. 

##Libraries
All libraries are contained in the POM.xml file but we can describe it here to inform about these libraries.
We used JUnit4 for testing.
For lexer itself we used antlr4.
And for easily work with JSON onject we used GSON by google.

##Grammar 
#####This grammar is based on the Python full grammar, but it was fully rewritten in order to remove complex items and to be easy for reader to understand tokens. So, now analyzer supports most common language structures, except decorators, items such as '->', etc. 
######You can fin description of the grammar below

single_input: NEWLINE | simple_statement | compound_statement NEWLINE;
file_input: (NEWLINE | statement)* EOF;
eval_input: conditionlist NEWLINE* EOF;
function_definition: 'def' NAME parameters ':' suite;
parameters: '(' (parameters_definition)? ')';
parameters_definition: (NAME ('=' condition)? (',' NAME ('=' condition)?)* (',' ('*' (NAME)? (',' NAME ('=' condition)?)* (',' ('**' NAME (',')?)?)? | '**' NAME (',')?)?)? | '*' (NAME)? (',' NAME ('=' condition)?)* (',' ('**' NAME (',')?)?)? | '**' NAME (',')?);
statement: simple_statement | compound_statement;
simple_statement: small_statement (';' small_statement)* (';')? NEWLINE;
small_statement: (expression_statement | del_statement | pass_statement | flow_statement | import_statement | global_statement | nonlocal_statement | assert_statement);
expression_statement: conditionlist_star_expression (annassign | composite_assignation (conditionlist) | ('=' (conditionlist_star_expression))*);
annassign: ':' condition ('=' condition)?;
conditionlist_star_expression: (condition|star_expression) (',' (condition|star_expression))* (',')?;
composite_assignation: ('+=' | '-=' | '*=' | '@=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' | '**=' | '//=');
del_statement: 'del' expressionlist;
pass_statement: 'pass';
flow_statement: break_statement | continue_statement | return_statement | raise_statement;
break_statement: 'break';
continue_statement: 'continue';
return_statement: 'return' (conditionlist)?;
raise_statement: 'raise' (condition ('from' condition)?)?;
import_statement: import_name | import_from;
import_name: 'import' dotted_as_names;
import_from: ('from' (('.' | '...')* dotted_name | ('.' | '...')+)
              'import' ('*' | '(' import_as_names ')' | import_as_names));
import_as_name: NAME ('as' NAME)?;
dotted_as_name: dotted_name ('as' NAME)?;
import_as_names: import_as_name (',' import_as_name)* (',')?;
dotted_as_names: dotted_as_name (',' dotted_as_name)*;
dotted_name: NAME ('.' NAME)*;
global_statement: 'global' NAME (',' NAME)*;
nonlocal_statement: 'nonlocal' NAME (',' NAME)*;
assert_statement: 'assert' condition (',' condition)?;

compound_statement: if_statement | while_statement | for_statement | try_statement | with_statement | function_definition | class_definition;
if_statement: 'if' condition ':' suite ('elif' condition ':' suite)* ('else' ':' suite)?;
while_statement: 'while' condition ':' suite ('else' ':' suite)?;
for_statement: 'for' expressionlist 'in' conditionlist ':' suite ('else' ':' suite)?;
try_statement: ('try' ':' suite
           ((except_clause ':' suite)+
            ('else' ':' suite)?
            ('finally' ':' suite)? |
           'finally' ':' suite));
with_statement: 'with' with_item (',' with_item)*  ':' suite;
with_item: condition ('as' expression)?;
except_clause: 'except' (condition ('as' NAME)?)?;
suite: simple_statement | NEWLINE INDENT statement+ DEDENT;

condition: or_condition ('if' or_condition 'else' condition)?;
or_condition: and_condition ('or' and_condition)*;
and_condition: not_condition ('and' not_condition)*;
not_condition: 'not' not_condition | comparison;
comparison: expression (comparison_operator expression)*;
comparison_operator: '<'|'>'|'=='|'>='|'<='|'<>'|'!='|'in'|'not' 'in'|'is'|'is' 'not';
star_expression: '*' expression;
expression: xor_expression ('|' xor_expression)*;
xor_expression: and_expression ('^' and_expression)*;
and_expression: shift_expression ('&' shift_expression)*;
shift_expression: arith_expression (('<<'|'>>') arith_expression)*;
arith_expression: term (('+'|'-') term)*;
term: factor (('*'|'@'|'/'|'%'|'//') factor)*;
factor: ('+'|'-'|'~') factor | power;
power: atom_expression ('**' factor)?;
atom_expression: atom trailer*;
atom: ('(' (conditionlist_comp)? ')' | '[' (conditionlist_comp)? ']' | '{' (dictionary_internals)? '}' | NAME | NUMBER | STRING+ | '...' | 'None' | 'True' | 'False');
conditionlist_comp: (condition|star_expression) ( comp_for | (',' (condition|star_expression))* (',')? );
trailer: '(' (arguments_list)? ')' | '[' subscriptlist ']' | '.' NAME;
subscriptlist: subscript (',' subscript)* (',')?;
subscript: condition | (condition)? ':' (condition)? (sliceop)?;
sliceop: ':' (condition)?;
expressionlist: (expression|star_expression) (',' (expression|star_expression))* (',')?;
conditionlist: condition (',' condition)* (',')?;
dictionary_internals: ( ((condition ':' condition | '**' expression)
                   (comp_for | (',' (condition ':' condition | '**' expression))* (',')?)) |
                  ((condition | star_expression)
                   (comp_for | (',' (condition | star_expression))* (',')?)) );
class_definition: 'class' NAME ('(' (arguments_list)? ')')? ':' suite;
arguments_list: argument (',' argument)*  (',')?;
argument: ( condition (comp_for)? |  condition '=' condition | '**' condition | '*' condition );
comp_iter: comp_for | comp_if;
comp_for: 'for' expressionlist 'in' or_condition (comp_iter)?;
comp_if: 'if' or_condition (comp_iter)?;