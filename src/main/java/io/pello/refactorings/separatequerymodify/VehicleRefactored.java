package io.pello.refactorings.separatequerymodify;

public class VehicleRefactored {
	private int horsePower;
	private String type;

	public VehicleRefactored(int power) {
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
