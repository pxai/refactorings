package io.pello.refactorings.introduceforeignmethod;

public class PasswordChecker {
	public boolean isWeakPassword (String password) {
		boolean isWeak = false;
		if (password.length() == 0) {
			isWeak = true;
		} else if (password.trim().equals("")) {
			isWeak = true;
		} else if (password.length() < 5) {
			isWeak = true;
		}
		
		return isWeak;
	}
}
