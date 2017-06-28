package io.pello.refactoring.parametrizemethod;

public class InvoiceRefactored {
	private float subtotal;
	private Customer customer;

	public InvoiceRefactored(float subtotal, Customer customer) {
		this.subtotal = subtotal;
		this.customer = customer;
	}

	public float charge() {

		if (customer.getAge() < 18) {
			return charge(0.5f);
		} else if (customer.payInCash()) {
			return charge(0.8f);
		} else {
			return charge();
		}
	}

	public float charge (float discount) {
		  return subtotal * discount;
		}


}
