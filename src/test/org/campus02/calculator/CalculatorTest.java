package org.campus02.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

	@Test
	void add() {
		assertEquals(4, Calculator.add(2, 2));
		assertEquals(1, Calculator.add(1, 0));
		assertEquals(1, Calculator.add(0, 1));
		assertEquals(2, Calculator.add(1, 1));
		assertEquals(42, Calculator.add(-100, 142));
	}

	@Test
	void subtract() {
		assertEquals(1, Calculator.subtract(1, 0));
		assertEquals(-1, Calculator.subtract(0, 1));
		assertEquals(0, Calculator.subtract(1, 1));
		assertEquals(42, Calculator.subtract(142, 100));
	}

	@Test
	void multiply() {
		assertEquals(0, Calculator.multiply(1, 0));
		assertEquals(0, Calculator.multiply(0, 1));
		assertEquals(1, Calculator.multiply(1, 1));
		assertEquals(42, Calculator.multiply(6, 7));
	}
}