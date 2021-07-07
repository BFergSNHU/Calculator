package calcOps;

import app.UnaryOperation;

public class Square extends AbstractOperation implements UnaryOperation {

	@Override
	public String getName() {
		return "^2";
	}
	
	@Override
	public float perform(float arg1) {
		return arg1 * arg1;
	}
}
