package com.sandbox.scheduler.model;

/**
 * Getter Setter for category
 */

public enum Category {
	RED(1), GREEN(3), BLUE(2);

	private int value;

	public int getValue() {
		return value;
	}

	private Category(int value) {
		this.value = value;
	}
}
