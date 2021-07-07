package calcOps;

import app.Operation;
import app.Operations;

public abstract class AbstractOperation implements Operation {

	AbstractOperation() {
		Operations.INSTANCE.register(this);
	}
}
