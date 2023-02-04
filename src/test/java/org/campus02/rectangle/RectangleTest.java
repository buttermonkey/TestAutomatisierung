package org.campus02.rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
	final Rectangle rectangle = new Rectangle(2, 4);

	@Test
	void calculateCircumference() {
		assertEquals(12, rectangle.calculateCircumference());
	}

	@Test
	void calculateArea() {
		assertEquals(8, rectangle.calculateArea());
	}
}