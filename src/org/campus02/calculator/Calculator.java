package org.campus02.calculator;

public class Calculator {
	/**
	 * Build the sum of two numbers
	 * @param lhs first number
	 * @param rhs second number
	 * @return
	 */
	public static int add(int lhs, int rhs) {
		int result = lhs + rhs;
		return result;
	}

	/**
	 * Subtract rhs from lhs
	 * @param lhs
	 * @param rhs
	 * @return
	 */
	public static int subtract(int lhs, int rhs) {
		int result = lhs - rhs;
		return result;
	}

	/**
	 * Multiply two numbers
	 * @param lhs factor
	 * @param rhs factor
	 * @return
	 */
	public static int multiply(int lhs, int rhs) {
		int result = lhs * rhs;
		return result;
	}
}
