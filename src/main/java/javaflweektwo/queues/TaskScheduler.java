package javaflweektwo.queues;

import java.util.LinkedList;
import java.util.Queue;

public class TaskScheduler {
    private Queue<String> queue;

    public TaskScheduler() {
        queue = new LinkedList<>();
    }

    public void addTask(String task) {
        queue.offer(task);
        System.out.println("Task '" + task + "' added to the queue.");
    }

    public void removeCompletedTask() {
        String completedTask = queue.poll();
        if (completedTask != null) {
            System.out.println("Completed task: " + completedTask);
        } else {
            System.out.println("No tasks in the queue.");
        }
    }

    public void displayQueueContents() {
        if (queue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("Current queue contents:");
            for (String task : queue) {
                System.out.println(task);
            }
        }
    }

        public static void main(String[] args) {
            TaskScheduler taskScheduler = new TaskScheduler();

            taskScheduler.addTask("Task 1");
            taskScheduler.addTask("Task 2");
            taskScheduler.addTask("Task 3");

            taskScheduler.displayQueueContents();

            taskScheduler.removeCompletedTask();

            taskScheduler.displayQueueContents();
        }

}
