package io.pello.refactoring.parametrizemethod;

public class Customer {
	private int age;
	private boolean payInCash;
	
	public Customer(int age, boolean payInCash) {
		this.age = age;
		this.payInCash = payInCash;
	}

	public boolean payInCash() {
		return payInCash;
	}

	public int getAge() {
		return age;
	}
	
}
