package io.pello.refactorings.avoidtemporaryvariables;

/**
 * Avoid using temporary variable refactoring playground
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class InvoiceRefactored {
	
	public float totalPrice (float price, float vat, float discount) {
		float temp = 0;
		float appliedVat = (vat * 100) / price;		
		System.out.println("Applied vat: " + appliedVat);
		
		float priceWithVat = price + appliedVat;
		System.out.println("Total: " + priceWithVat);
		
		return priceWithVat - discount;
	}

	
	/*
	 * Another Step
	public float totalPrice (float price, float vat, float discount) {
		return price + appliedVat(price, vat) - discount;
	}

	private float appliedVat (float price, float vat) {
		return (vat * price) / 100;
	}*/
	

}
