package calcOps;

import app.BinaryOperation;

public class Plus extends AbstractOperation implements BinaryOperation {

	@Override
	public float perform(float arg1, float arg2) {
		return arg1 + arg2;
	}
	
	@Override
	public String getName() {
		return "+";
	}
}
