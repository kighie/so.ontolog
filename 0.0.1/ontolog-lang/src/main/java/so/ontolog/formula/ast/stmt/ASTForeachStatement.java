package so.ontolog.formula.ast.stmt;

import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.ASTVisitor;
import so.ontolog.formula.ast.expr.ASTLoopCondition;
import so.ontolog.formula.ast.util.TextUtils;

public class ASTForeachStatement extends AbstractASTBlock {

	private static final long serialVersionUID = 1962363140133665798L;

	private ASTLoopCondition condition;
	
	public ASTForeachStatement(ASTToken position, ASTLoopCondition condition) {
		super(position);
		this.condition = condition;
		addSymbol(condition.getVarDelc());
	}
	
	/**
	 * @return the condition
	 */
	public ASTLoopCondition getCondition() {
		return condition;
	}
	
	@Override
	public <C> C accept(ASTVisitor<C> visitor, C context) {
		condition.accept(visitor, context);
		acceptChildren(visitor, context);
		return visitor.visit(this, context);
	}
	

	@Override
	public void getText(StringBuilder buffer, int depth) {
		buffer.append("\n").append(TextUtils.getIndent(depth));
		buffer.append("foreach(").append(condition).append("){");
		getChildrenText(buffer, depth+1);
		buffer.append(TextUtils.getIndent(depth)).append("}");
	}
	
}
