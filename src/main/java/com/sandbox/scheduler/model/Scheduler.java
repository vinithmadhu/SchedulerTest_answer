package com.sandbox.scheduler.model;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Sort based on Uregency and then by Category and then by Oldest entry first
 * and then print them in new line
 */

public class Scheduler {
    public static List<Task> scheduleTask(List<Task> unsorted) {

        // Sort first based on Uregency and then by Category and then by Oldest entry
        // first
        Comparator<Task> compareByPriority = Comparator.comparing(Task::getUrgency).thenComparing(Task::getCategory)
                .thenComparing(Task::getTimestamp);
        List<Task> sorted = unsorted.stream().sorted(compareByPriority).collect(Collectors.toList());
        return sorted;
    }

    public static void printSchedule(List<Task> sorted) {
        // print each task after sorting with new line
        sorted.forEach(t -> System.out.println(System.lineSeparator() + t));
    }

}
