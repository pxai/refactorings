package io.pello.refactoring.extractclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void testGetName() {
		Customer customer = new Customer("Eugene Krabs", "33444222H");
		String expected = "Eugene Krabs";
		String actual = customer.getName();
		
		assertEquals("Name is correctly set", actual, expected);
	}

}
