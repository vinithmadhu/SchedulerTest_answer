package com.sandbox.scheduler;

import com.sandbox.scheduler.model.Category;
import com.sandbox.scheduler.model.Scheduler;
import com.sandbox.scheduler.model.Task;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Task task1 = new Task(0, Category.BLUE, LocalDateTime.now());
		Task task2 = new Task(1, Category.RED, LocalDateTime.now());
		Task task3 = new Task(0, Category.GREEN, LocalDateTime.ofEpochSecond(1614542886, 0, ZoneOffset.UTC));
		Task task4 = new Task(0, Category.GREEN, LocalDateTime.now());
		Task task5 = new Task(5, Category.RED, LocalDateTime.now());
		Task task6 = new Task(0, Category.RED, LocalDateTime.now());

		List<Task> unsorted = Arrays.asList(task1, task2, task3, task4, task5, task6);

		// Uncoment your line after implementing Scheduler.scheduleTask
		// unsorted.forEach(t -> Scheduler.scheduleTask(t));
		List<Task> sorted = Scheduler.scheduleTask(unsorted);

		// Uncoment your line after implementing Scheduler.printSchedule()
		Scheduler.printSchedule(sorted);
	}

}
