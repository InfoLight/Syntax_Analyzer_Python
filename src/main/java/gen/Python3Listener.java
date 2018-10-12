package gen;// Generated from C:/Users/InfoLight/IdeaProjects/Syntax_Analyzer_Python/src/main/antlr4\Python3.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Python3Parser}.
 */
public interface Python3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Python3Parser#single_input}.
	 * @param ctx the parse tree
	 */
	void enterSingle_input(Python3Parser.Single_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#single_input}.
	 * @param ctx the parse tree
	 */
	void exitSingle_input(Python3Parser.Single_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(Python3Parser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(Python3Parser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#eval_input}.
	 * @param ctx the parse tree
	 */
	void enterEval_input(Python3Parser.Eval_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#eval_input}.
	 * @param ctx the parse tree
	 */
	void exitEval_input(Python3Parser.Eval_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(Python3Parser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(Python3Parser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(Python3Parser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(Python3Parser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#parameters_definition}.
	 * @param ctx the parse tree
	 */
	void enterParameters_definition(Python3Parser.Parameters_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#parameters_definition}.
	 * @param ctx the parse tree
	 */
	void exitParameters_definition(Python3Parser.Parameters_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Python3Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Python3Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_statement(Python3Parser.Simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_statement(Python3Parser.Simple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#small_statement}.
	 * @param ctx the parse tree
	 */
	void enterSmall_statement(Python3Parser.Small_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#small_statement}.
	 * @param ctx the parse tree
	 */
	void exitSmall_statement(Python3Parser.Small_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(Python3Parser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(Python3Parser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#annassign}.
	 * @param ctx the parse tree
	 */
	void enterAnnassign(Python3Parser.AnnassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#annassign}.
	 * @param ctx the parse tree
	 */
	void exitAnnassign(Python3Parser.AnnassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#conditionlist_star_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionlist_star_expression(Python3Parser.Conditionlist_star_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#conditionlist_star_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionlist_star_expression(Python3Parser.Conditionlist_star_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#composite_assignation}.
	 * @param ctx the parse tree
	 */
	void enterComposite_assignation(Python3Parser.Composite_assignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#composite_assignation}.
	 * @param ctx the parse tree
	 */
	void exitComposite_assignation(Python3Parser.Composite_assignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#del_statement}.
	 * @param ctx the parse tree
	 */
	void enterDel_statement(Python3Parser.Del_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#del_statement}.
	 * @param ctx the parse tree
	 */
	void exitDel_statement(Python3Parser.Del_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#pass_statement}.
	 * @param ctx the parse tree
	 */
	void enterPass_statement(Python3Parser.Pass_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#pass_statement}.
	 * @param ctx the parse tree
	 */
	void exitPass_statement(Python3Parser.Pass_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#flow_statement}.
	 * @param ctx the parse tree
	 */
	void enterFlow_statement(Python3Parser.Flow_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#flow_statement}.
	 * @param ctx the parse tree
	 */
	void exitFlow_statement(Python3Parser.Flow_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(Python3Parser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(Python3Parser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(Python3Parser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(Python3Parser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(Python3Parser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(Python3Parser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaise_statement(Python3Parser.Raise_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaise_statement(Python3Parser.Raise_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#import_statement}.
	 * @param ctx the parse tree
	 */
	void enterImport_statement(Python3Parser.Import_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#import_statement}.
	 * @param ctx the parse tree
	 */
	void exitImport_statement(Python3Parser.Import_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(Python3Parser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(Python3Parser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#import_from}.
	 * @param ctx the parse tree
	 */
	void enterImport_from(Python3Parser.Import_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#import_from}.
	 * @param ctx the parse tree
	 */
	void exitImport_from(Python3Parser.Import_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_name(Python3Parser.Import_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_name(Python3Parser.Import_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_name(Python3Parser.Dotted_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_name(Python3Parser.Dotted_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_names(Python3Parser.Import_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_names(Python3Parser.Import_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_names(Python3Parser.Dotted_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_names(Python3Parser.Dotted_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(Python3Parser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(Python3Parser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#global_statement}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_statement(Python3Parser.Global_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#global_statement}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_statement(Python3Parser.Global_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#nonlocal_statement}.
	 * @param ctx the parse tree
	 */
	void enterNonlocal_statement(Python3Parser.Nonlocal_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#nonlocal_statement}.
	 * @param ctx the parse tree
	 */
	void exitNonlocal_statement(Python3Parser.Nonlocal_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#assert_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssert_statement(Python3Parser.Assert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#assert_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssert_statement(Python3Parser.Assert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(Python3Parser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(Python3Parser.Compound_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(Python3Parser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(Python3Parser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(Python3Parser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(Python3Parser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(Python3Parser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(Python3Parser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#try_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_statement(Python3Parser.Try_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#try_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_statement(Python3Parser.Try_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#with_statement}.
	 * @param ctx the parse tree
	 */
	void enterWith_statement(Python3Parser.With_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#with_statement}.
	 * @param ctx the parse tree
	 */
	void exitWith_statement(Python3Parser.With_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#with_item}.
	 * @param ctx the parse tree
	 */
	void enterWith_item(Python3Parser.With_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#with_item}.
	 * @param ctx the parse tree
	 */
	void exitWith_item(Python3Parser.With_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#except_clause}.
	 * @param ctx the parse tree
	 */
	void enterExcept_clause(Python3Parser.Except_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#except_clause}.
	 * @param ctx the parse tree
	 */
	void exitExcept_clause(Python3Parser.Except_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(Python3Parser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(Python3Parser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(Python3Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(Python3Parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#or_condition}.
	 * @param ctx the parse tree
	 */
	void enterOr_condition(Python3Parser.Or_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#or_condition}.
	 * @param ctx the parse tree
	 */
	void exitOr_condition(Python3Parser.Or_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#and_condition}.
	 * @param ctx the parse tree
	 */
	void enterAnd_condition(Python3Parser.And_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#and_condition}.
	 * @param ctx the parse tree
	 */
	void exitAnd_condition(Python3Parser.And_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#not_condition}.
	 * @param ctx the parse tree
	 */
	void enterNot_condition(Python3Parser.Not_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#not_condition}.
	 * @param ctx the parse tree
	 */
	void exitNot_condition(Python3Parser.Not_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(Python3Parser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(Python3Parser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(Python3Parser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(Python3Parser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#star_expression}.
	 * @param ctx the parse tree
	 */
	void enterStar_expression(Python3Parser.Star_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#star_expression}.
	 * @param ctx the parse tree
	 */
	void exitStar_expression(Python3Parser.Star_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Python3Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Python3Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#xor_expression}.
	 * @param ctx the parse tree
	 */
	void enterXor_expression(Python3Parser.Xor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#xor_expression}.
	 * @param ctx the parse tree
	 */
	void exitXor_expression(Python3Parser.Xor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(Python3Parser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(Python3Parser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(Python3Parser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(Python3Parser.Shift_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#arith_expression}.
	 * @param ctx the parse tree
	 */
	void enterArith_expression(Python3Parser.Arith_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#arith_expression}.
	 * @param ctx the parse tree
	 */
	void exitArith_expression(Python3Parser.Arith_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Python3Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Python3Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(Python3Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(Python3Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(Python3Parser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(Python3Parser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#atom_expression}.
	 * @param ctx the parse tree
	 */
	void enterAtom_expression(Python3Parser.Atom_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#atom_expression}.
	 * @param ctx the parse tree
	 */
	void exitAtom_expression(Python3Parser.Atom_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(Python3Parser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(Python3Parser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#conditionlist_comp}.
	 * @param ctx the parse tree
	 */
	void enterConditionlist_comp(Python3Parser.Conditionlist_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#conditionlist_comp}.
	 * @param ctx the parse tree
	 */
	void exitConditionlist_comp(Python3Parser.Conditionlist_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(Python3Parser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(Python3Parser.TrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptlist(Python3Parser.SubscriptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptlist(Python3Parser.SubscriptlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(Python3Parser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(Python3Parser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#sliceop}.
	 * @param ctx the parse tree
	 */
	void enterSliceop(Python3Parser.SliceopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#sliceop}.
	 * @param ctx the parse tree
	 */
	void exitSliceop(Python3Parser.SliceopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void enterExpressionlist(Python3Parser.ExpressionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void exitExpressionlist(Python3Parser.ExpressionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#conditionlist}.
	 * @param ctx the parse tree
	 */
	void enterConditionlist(Python3Parser.ConditionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#conditionlist}.
	 * @param ctx the parse tree
	 */
	void exitConditionlist(Python3Parser.ConditionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#dictionary_internals}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_internals(Python3Parser.Dictionary_internalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#dictionary_internals}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_internals(Python3Parser.Dictionary_internalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#class_definition}.
	 * @param ctx the parse tree
	 */
	void enterClass_definition(Python3Parser.Class_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#class_definition}.
	 * @param ctx the parse tree
	 */
	void exitClass_definition(Python3Parser.Class_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#arguments_list}.
	 * @param ctx the parse tree
	 */
	void enterArguments_list(Python3Parser.Arguments_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#arguments_list}.
	 * @param ctx the parse tree
	 */
	void exitArguments_list(Python3Parser.Arguments_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(Python3Parser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(Python3Parser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void enterComp_iter(Python3Parser.Comp_iterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void exitComp_iter(Python3Parser.Comp_iterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#comp_for}.
	 * @param ctx the parse tree
	 */
	void enterComp_for(Python3Parser.Comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#comp_for}.
	 * @param ctx the parse tree
	 */
	void exitComp_for(Python3Parser.Comp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#comp_if}.
	 * @param ctx the parse tree
	 */
	void enterComp_if(Python3Parser.Comp_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#comp_if}.
	 * @param ctx the parse tree
	 */
	void exitComp_if(Python3Parser.Comp_ifContext ctx);
}