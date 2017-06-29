package io.pello.refactoring.substitutealgorithm;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTest {

	@Test
	public void testApplyVAT() {
		Order order = new Order();
		float expected = 1.04f;
		float actual = order.applyVAT(1);
		
		assertEquals("Gets correct vat", expected, actual, 0.01f);
	}

}
