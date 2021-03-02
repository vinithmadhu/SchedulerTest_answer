package com.sandbox.scheduler.model;

import java.time.LocalDateTime;

/**
 * Getter setter for TASK
 */

public class Task {

	public int urgency = -1;
	public Category category;
	public LocalDateTime timeStamp = LocalDateTime.now();

	public Task(int urgency, Category category, LocalDateTime timeStamp) {
		this.urgency = urgency;
		this.category = category;
		this.timeStamp = timeStamp;
	}

	public String toString() {
		return "[TASK] URGENCY: " + urgency + " CATEGORY: " + category + " TIMESTAMP: " + timeStamp;
	}

	public int getUrgency() {
		return this.urgency;
	}

	public Category getCategory() {
		return this.category;
	}

	public LocalDateTime getTimestamp() {
		return this.timeStamp;
	}

}
