package com.sandbox.scheduler.model;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Scheduler {
    public static List<Task> scheduleTask(List<Task> unsorted) {
        Comparator<Task> compareByPriority = Comparator.comparing(Task::getUrgency).thenComparing(Task::getCategory)
                .thenComparing(Task::getTimestamp);

        List<Task> sorted = unsorted.stream().sorted(compareByPriority).collect(Collectors.toList());
        return sorted; 
    }

	public static void printSchedule(List<Task> sorted) {
        sorted.forEach(t -> System.out.println(System.lineSeparator() + t));
        //System.out.println(sorted);
	}

}
