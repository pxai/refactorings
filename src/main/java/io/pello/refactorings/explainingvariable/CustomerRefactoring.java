package io.pello.refactorings.explainingvariable;

/**
 * Introduce explaining variable refactoring playground
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
class CustomerRefactoring {
	private String name;
	private int age;
	private float salary;
	
	public CustomerRefactoring(String name, int age, float salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


	public float applyDiscount (float totalAmount) {
		boolean isWorkingAge = (age > 17 && age < 66);
		boolean isLowSalary = (salary - (salary * 0.2f)) < 1000f;
		boolean isLittleAmount = totalAmount * 0.5 < 100;
		
		 if (isWorkingAge && isLowSalary && isLittleAmount) {
				return totalAmount * 0.9f;
			 } else {
				return totalAmount;
			 }
		}

}
