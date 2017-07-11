package io.pello.refactorings.introduceforeignmethod.refactored;

public class PasswordChecker {
	public boolean isWeakPassword (String password) {		
		return password.trim().equals("")
				 || password.length() < 5
				 	|| isPalindrome(password);
	}

	private static boolean isPalindrome(String password) {
		    int i1 = 0;
		    int i2 = password.length() - 1;
		    while (i2 > i1) {
		        if (password.charAt(i1) != password.charAt(i2)) {
		            return false;
		        }
		        ++i1;
		        --i2;
		    }
		    return true;
	}
}
