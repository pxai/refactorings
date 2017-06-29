package io.pello.refactoring.extractclass.refactored;

import java.util.Date;

/**
 * Extract class
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class CustomerRefactored {
	private String name;
	private String dni;
	private CreditCard creditCard;


	public CustomerRefactored(String name, String dni) {
		this.name = name;
		this.dni = dni;

	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	
}
