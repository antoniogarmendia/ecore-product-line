package solver.formulas;

import solver.features.IFeatureProvider;
import solver.formulas.cnf.CNFFormula;
import solver.presenceConditions.Operator;

public class OrFormula extends BinaryFormula {
	public OrFormula(BoolFormula l, BoolFormula r) {
		this.left = l;
		this.right = r;
	}

	@Override
	public CNFFormula toCNF() {
		CNFFormula l1 = this.left.toCNF();
		CNFFormula l2 = this.right.toCNF();
		return l1.disjunction(l2);
	}
	
	@Override
	public boolean eval(IFeatureProvider fp) {
		return this.left.eval(fp) || this.right.eval(fp);
	}
	
	public Operator toOperator() {
		return Operator.OR;
	}

}
