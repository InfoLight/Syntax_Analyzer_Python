package gen;// Generated from C:/Users/InfoLight/IdeaProjects/Syntax_Analyzer_Python/src/main/antlr4\Python3.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Python3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Python3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Python3Parser#single_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_input(Python3Parser.Single_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(Python3Parser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#eval_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_input(Python3Parser.Eval_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(Python3Parser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(Python3Parser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#parameters_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_definition(Python3Parser.Parameters_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Python3Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_statement(Python3Parser.Simple_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#small_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall_statement(Python3Parser.Small_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#expression_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(Python3Parser.Expression_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#annassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnassign(Python3Parser.AnnassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#conditionlist_star_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionlist_star_expression(Python3Parser.Conditionlist_star_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#composite_assignation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposite_assignation(Python3Parser.Composite_assignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#del_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDel_statement(Python3Parser.Del_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#pass_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_statement(Python3Parser.Pass_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#flow_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_statement(Python3Parser.Flow_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(Python3Parser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(Python3Parser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(Python3Parser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#raise_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_statement(Python3Parser.Raise_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#import_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_statement(Python3Parser.Import_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#import_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_name(Python3Parser.Import_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#import_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from(Python3Parser.Import_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#import_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_name(Python3Parser.Import_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#dotted_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_name(Python3Parser.Dotted_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#import_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_names(Python3Parser.Import_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#dotted_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_names(Python3Parser.Dotted_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_name(Python3Parser.Dotted_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#global_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_statement(Python3Parser.Global_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#nonlocal_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocal_statement(Python3Parser.Nonlocal_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#assert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssert_statement(Python3Parser.Assert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(Python3Parser.Compound_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(Python3Parser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(Python3Parser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(Python3Parser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#try_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_statement(Python3Parser.Try_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#with_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_statement(Python3Parser.With_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#with_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_item(Python3Parser.With_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#except_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_clause(Python3Parser.Except_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(Python3Parser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(Python3Parser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#or_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_condition(Python3Parser.Or_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#and_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_condition(Python3Parser.And_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#not_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_condition(Python3Parser.Not_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(Python3Parser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#comparison_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operator(Python3Parser.Comparison_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#star_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar_expression(Python3Parser.Star_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Python3Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#xor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_expression(Python3Parser.Xor_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(Python3Parser.And_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expression(Python3Parser.Shift_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#arith_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_expression(Python3Parser.Arith_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(Python3Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(Python3Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(Python3Parser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#atom_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_expression(Python3Parser.Atom_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(Python3Parser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#conditionlist_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionlist_comp(Python3Parser.Conditionlist_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailer(Python3Parser.TrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#subscriptlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptlist(Python3Parser.SubscriptlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(Python3Parser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#sliceop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceop(Python3Parser.SliceopContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#expressionlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionlist(Python3Parser.ExpressionlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#conditionlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionlist(Python3Parser.ConditionlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#dictionary_internals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_internals(Python3Parser.Dictionary_internalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#class_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_definition(Python3Parser.Class_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#arguments_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments_list(Python3Parser.Arguments_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(Python3Parser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#comp_iter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_iter(Python3Parser.Comp_iterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#comp_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_for(Python3Parser.Comp_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#comp_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_if(Python3Parser.Comp_ifContext ctx);
}