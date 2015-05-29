package so.ontolog.formula.ast.expr;

import java.util.List;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.ast.ASTExpr;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.ASTVisitor;

public class ASTArrayExpr extends AbstractASTExpr {

	private static final long serialVersionUID = 8219380940499923076L;

	private List<ASTExpr> elements;
	private ASTExpr from;
	private ASTExpr to;
	
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
	
	
	public ASTExpr getFrom() {
		return from;
	}

	public void setFrom(ASTExpr from) {
		this.from = from;
	}

	public ASTExpr getTo() {
		return to;
	}

	public void setTo(ASTExpr to) {
		this.to = to;
	}

	@Override
	public <C> C accept(ASTVisitor<C> visitor, C context) {
		if( elements != null){
			for(ASTExpr e:elements){
				e.accept(visitor, context);
			}
		}
		
		from.accept(visitor, context);
		to.accept(visitor, context);
		
		return visitor.visit(this, context);
	}

	@Override
	public void getText(StringBuilder buffer, int depth) {
		// TODO Auto-generated method stub
		
	}

}
