package io.pello.refactoring.substitutealgorithm;

public class OrderRefactored {
	public float applyVAT (int vatType) {
		float result[] = {-1, 1.04f, 1.18f, 1.21f};

		if (vatType > 0 && vatType < result.length) {
			return result[vatType];
		}
		return -1;
	}


}
