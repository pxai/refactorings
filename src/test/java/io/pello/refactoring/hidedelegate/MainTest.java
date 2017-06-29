package io.pello.refactoring.hidedelegate;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void testRoll() {
		Main main = new Main();
		
		for (int i = 0; i< 100; i++) {
			int roll = main.roll();
			assertTrue("Random numbers within range", roll>0 && roll<7);
		}
	}

}
