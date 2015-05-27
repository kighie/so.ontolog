package so.ontolog.formula.ast.expr;

import java.util.List;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.ast.ASTExpr;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.ASTVisitor;

public class ASTArrayExpr extends ASTExpr {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8219380940499923076L;

	private List<ASTExpr> elements;
	
	public ASTArrayExpr(ASTToken token, TypeSpec typeSpec, List<ASTExpr> elements) {
		super(token, typeSpec);
		this.elements = elements;
	}

	/**
	 * @return the elements
	 */
	public List<ASTExpr> getElements() {
		return elements;
	}
	
	@Override
	public <C> C accept(ASTVisitor<C> visitor, C context) {
		for(ASTExpr e:elements){
			e.accept(visitor, context);
		}
		return visitor.visit(this, context);
	}

	@Override
	public void getText(StringBuilder buffer, int depth) {
		// TODO Auto-generated method stub
		
	}

}
