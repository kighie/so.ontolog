package so.ontolog.formula.ast.stmt;

import so.ontolog.formula.ast.ASTBlock;
import so.ontolog.formula.ast.ASTExpr;
import so.ontolog.formula.ast.ASTToken;

public class ASTForeachStatement extends ASTBlock {

	private static final long serialVersionUID = 1962363140133665798L;

	private ASTExpr condition;
	
	public ASTForeachStatement(ASTToken position, ASTExpr condition) {
		super(position);
		this.condition = condition;
	}

}
