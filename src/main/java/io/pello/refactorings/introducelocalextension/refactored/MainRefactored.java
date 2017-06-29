package io.pello.refactorings.introducelocalextension.refactored;

/**
 * Introduce Local Extension
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class MainRefactored {
	private CoolConversor conversor = new CoolConversor();
	
	public double convert (double amount) {
		return conversor.euro2Dollar(amount);
	}

}
