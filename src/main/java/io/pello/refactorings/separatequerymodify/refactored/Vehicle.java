package io.pello.refactorings.separatequerymodify.refactored;

/**
 * Refactored  version
 */
public class Vehicle {
	private int horsePower;
	private String type;

	public Vehicle(int power) {
		setPower(power);
	}

	public void setPower(int power) {
		horsePower = power;
	}

	public String getType() {
		if (horsePower >= 10) {
			return "Truck";
		} else if (horsePower > 5 && horsePower < 10) {
			return "Car";
		} else {
			return "Bike";
		}
	}
}
