package so.ontolog.formula.ast.stmt;

import so.ontolog.formula.ast.ASTBlock;
import so.ontolog.formula.ast.ASTExpr;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.ASTVisitor;
import so.ontolog.formula.ast.util.TextUtils;

public class ASTWhileStatement extends ASTBlock {
	
	private static final long serialVersionUID = 1264595194524814473L;
	
	private ASTExpr condition;
	
	public ASTWhileStatement(ASTToken position, ASTExpr condition) {
		super(position);
		this.condition = condition;
	}
	
	/**
	 * @return the condition
	 */
	public ASTExpr getCondition() {
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
