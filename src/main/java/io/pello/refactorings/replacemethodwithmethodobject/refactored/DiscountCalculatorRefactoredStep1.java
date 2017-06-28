package io.pello.refactorings.replacemethodwithmethodobject.refactored;

import io.pello.refactorings.replacemethodwithmethodobject.Customer;

/**
 * Replace method with method object
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class DiscountCalculatorRefactoredStep1 {
		private double finalPrice;
		private double appliedVat;
		private double price;
	private Customer customer;
	private double discount;

	public DiscountCalculatorRefactoredStep1(double price, Customer customer, double discount) {
		finalPrice = 0;
		appliedVat = 0;
		this.price = price;
		this.customer = customer;
		this.discount = discount;
	}

	public double applyDiscount () {

		switch (customer.getType()) {
			case Customer.NORMAL:
						appliedVat = 1.21f;
						break;
			case Customer.SPECIAL:
						appliedVat = 1.15f;
						break;
			case Customer.VIP:
						appliedVat = 1.04f;
						break;
			default:
						appliedVat = 1.21f;
						break;
	}

		if (price > 50 && customer.isVip()) {
			finalPrice = price * 0.5;
	   } else if (price > 10 && customer.isSpecial()) {
		      finalPrice = price *0.1;
	   } else {
		   finalPrice = price;
	    }

	     return finalPrice * appliedVat - discount;
	   }


}
