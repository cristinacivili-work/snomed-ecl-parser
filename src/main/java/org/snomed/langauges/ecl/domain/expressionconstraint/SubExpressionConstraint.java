package org.snomed.langauges.ecl.domain.expressionconstraint;

import org.snomed.langauges.ecl.domain.refinement.Operator;

public class SubExpressionConstraint implements ExpressionConstraint {

	protected final Operator operator;
	protected String conceptId;
	protected boolean wildcard;
	protected ExpressionConstraint nestedExpressionConstraint;

	public SubExpressionConstraint(Operator operator) {
		this.operator = operator;
	}

	public void setConceptId(String conceptId) {
		this.conceptId = conceptId;
	}

	public void setWildcard(boolean wildcard) {
		this.wildcard = wildcard;
	}

	public void setNestedExpressionConstraint(ExpressionConstraint nestedExpressionConstraint) {
		this.nestedExpressionConstraint = nestedExpressionConstraint;
	}

	public Operator getOperator() {
		return operator;
	}

	public String getConceptId() {
		return conceptId;
	}

	public boolean isWildcard() {
		return wildcard;
	}

	public ExpressionConstraint getNestedExpressionConstraint() {
		return nestedExpressionConstraint;
	}

	@Override
	public String toString() {
		return "SubExpressionConstraint{" +
				"operator=" + operator +
				", conceptId='" + conceptId + '\'' +
				", wildcard=" + wildcard +
				", nestedExpressionConstraint=" + nestedExpressionConstraint +
				'}';
	}
}
