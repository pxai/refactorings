package io.pello.refactorings.decomposeconditional;

/**
 * Decompose Conditional
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class InvoiceRefactored {
	
	private Customer customer;
	
	public InvoiceRefactored (Customer customer) {
		this.customer = customer;
	}
	
	public float calculatePayment (float price, float discount, float vat) {
		float payment = 0;
		
		if (canApplyDiscount() ) {
		  payment = price * discount * vat;
		} else {
		  payment = price * vat;
		}

		return payment;
	}

	private boolean canApplyDiscount() {
		return customer.getAge() < 18 || customer.getAge() > 65;
	}
}
