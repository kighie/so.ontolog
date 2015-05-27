package so.ontolog.formula.ast.expr;

import java.util.List;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.ast.ASTExpr;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.ASTVisitor;

public class ArrayExpr extends ASTExpr {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8219380940499923076L;

	private List<ASTExpr> elements;
	
	public ArrayExpr(ASTToken token, TypeSpec typeSpec, List<ASTExpr> elements) {
		super(token, typeSpec);
		this.elements = elements;
	}

	@Override
	public <C> C accept(ASTVisitor<C> visitor, C context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getText(StringBuilder buffer, int depth) {
		// TODO Auto-generated method stub
		
	}

}
