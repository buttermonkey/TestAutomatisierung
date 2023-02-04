package org.campus02.rectangle;

public class Rectangle {
	private final int width;
	private final int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * Calculate circumference of the rectangle
	 */
	public int calculateCircumference() {
		return 2*width + 2*height;
	}

	/**
	 * Calculate the area of the rectangle
	 */
	public int calculateArea() {
		return width * height;
	}
}
