package io.pello.refactorings.consolidateduplicateconditional;

import java.util.Date;

/**
 * Decompose Conditional
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class InvoiceRefactored {
	
	private Customer customer;
	private float price;
	private int qty;
	

	public InvoiceRefactored (Customer customer, float price, int qty) {
		this.customer = customer;
		this.price = price;
		this.qty = qty;
	}
	

	public float calculateTotal (float vat, float discount) {
		float subtotal = 0;
		if (customer.isVip()) {
			subtotal = (price * qty) - discount;
		} else {
			subtotal = (price * qty);
		}
		return subtotal * (1 + (vat/100));
	}
	
}
