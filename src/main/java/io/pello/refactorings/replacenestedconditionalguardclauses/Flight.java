package io.pello.refactorings.replacenestedconditionalguardclauses;

import java.util.ArrayList;

/**
 * Remove Conditional with guard clauses
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class Flight {
	
	public float priceForPassenger (Passenger passenger) {
		float price = 0;
		if (passenger.isAChild()) {
			  price = childDiscount();
			} else {
			  if (passenger.isUnemployed()) {
			  price = unemployedDiscount();
			  } else {
			    if (isChristmas()) {
			    price = 0;
			    } else {
			    price = normalPrice();
			    }
			  }
			}
		return price;
	}

	private float unemployedDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}

	private float normalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	private boolean isChristmas() {
		// TODO Auto-generated method stub
		return false;
	}

	private float childDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
