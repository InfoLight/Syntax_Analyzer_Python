import gen.Python3Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class AstPrinter {

    private boolean ignoringWrappers = true;

    public void setIgnoringWrappers(boolean ignoringWrappers) {
        this.ignoringWrappers = ignoringWrappers;
    }

    public void print(RuleContext ruleContext) {
        explore(ruleContext, 0);
    }

    private void explore(RuleContext ruleContext, int indentation) {
        boolean toBeIgnored = ignoringWrappers
                && ruleContext.getChildCount() == 1 && ruleContext.getChild(0) instanceof ParserRuleContext;
        if (!toBeIgnored) {
            String ruleName = Python3Parser.ruleNames[ruleContext.getRuleIndex()];
            for (int i = 0; i < indentation; i++) {
                System.out.print("  ");
            }
            System.out.println(ruleName + "  :  ");
        }
        for (int i = 0; i < ruleContext.getChildCount(); i++) {
            ParseTree element = ruleContext.getChild(i);
            if (element instanceof RuleContext) {
                explore((RuleContext) element, indentation + (toBeIgnored ? 0 : 1));
            }
        }
    }

}
