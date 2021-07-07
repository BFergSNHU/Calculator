package appTest;

import static org.junit.Assert.*;
import app.BinaryOperation;
import org.junit.Before;
import org.junit.Test;

public class PlusTest extends AbstractOperationTest {

	private BinaryOperation op;
	
	@Before
	public void setup() throws Exception {
		op = new calcOps.Plus();
	}
	
	@Test
	public void testPerform() {
		assertEquals(3.0, op.perform(1.0F, 2.0F), 0.01F);
	}
	
	@Test
	public void testGetName() {
		assertEquals(op.getName(), "+");
	}
}
