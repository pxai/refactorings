package io.pello.refactorings.pushdown.refactored;

public class Car extends Vehicle {
	private String trunk;
	private boolean isTrunkOpened;
	private Insurance insurance;
	
	public void start() {
	}

	public boolean isTrunkOpen() {
		return isTrunkOpened;
	}
}
