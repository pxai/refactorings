package io.pello.refactorings.introduceforeignmethod;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PasswordCheckerTest {
	private PasswordChecker passwordChecker;
	
	@Before
	public void setUp () {
		passwordChecker = new PasswordChecker();
	}
	
	@Test
	public void testIsEmptyStringWeakPassword() {
		assertTrue("Empty String is weak password",passwordChecker.isWeakPassword(""));
	}
	
	@Test
	public void testIsStringWithSpacesWeakPassword() {
		assertTrue("String with spaces is weak password",passwordChecker.isWeakPassword("         "));
	}
	
	@Test
	public void testIsShortStringWeakPassword() {
		assertTrue("Short String is weak password",passwordChecker.isWeakPassword("fff"));
	}

}
