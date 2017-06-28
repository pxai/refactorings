package io.pello.refactorings.consolidateconditional;

import java.util.Date;

/**
 * Decompose Conditional
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class InvoiceRefactored {
	
	private Customer customer;
	private int year;
	
	public InvoiceRefactored (Customer customer, int year) {
		this.customer = customer;
		this.year = year;
	}
	
	public float calculateTotal (float subtotal, float vat) {
		if (isUselessToCharge(subtotal)) { 
			return 0;
		} else { 
			return subtotal * vat;	
		}
	}

	private boolean isUselessToCharge(float subtotal) {
		return  (customer.getAge() < 18)  ||
				(new Date().getYear() > year)  ||
				(subtotal < 0.5f );
	}
	
}
