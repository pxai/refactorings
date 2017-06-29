package io.pello.refactoring.extractclass;

import java.util.Date;

/**
 * Extract class
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class Customer {
	private String name;
	private String dni;
	private String creditCard;
	private Date creditCardDate;
	private int creditCardControlNumber;
	
	

	public Customer(String name, String dni, String creditCard, Date creditCardDate, int creditCardControlNumber) {
		this.name = name;
		this.dni = dni;
		this.creditCard = creditCard;
		this.creditCardDate = creditCardDate;
		this.creditCardControlNumber = creditCardControlNumber;
	}

	public boolean isCardExpired () {
		return creditCardDate.before(new Date());
	}

	public boolean isValid () {
		boolean result = false;
		// Some code here...
		return result;
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

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public Date getCreditCardDate() {
		return creditCardDate;
	}

	public void setCreditCardDate(Date creditCardDate) {
		this.creditCardDate = creditCardDate;
	}

	public int getCreditCardControlNumber() {
		return creditCardControlNumber;
	}

	public void setCreditCardControlNumber(int creditCardControlNumber) {
		this.creditCardControlNumber = creditCardControlNumber;
	}

}
