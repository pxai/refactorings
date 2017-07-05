package io.pello.refactorings.removeparameterassignment.refactored;

/**
 * Refactored version
 */
public class Student {
	public float evaluateTerm(float homeworkMark, float examMark, float attitude) {
		float finalMark = 0;
		if (examMark < 5) {
			finalMark = 1;
		} else {
			finalMark = examMark;
		}

		if (homeworkMark < 4) {
			finalMark = finalMark + 1;
		} else {
			finalMark = finalMark + homeworkMark;
		}
		return (finalMark) / 2 + attitude;
	}
}
