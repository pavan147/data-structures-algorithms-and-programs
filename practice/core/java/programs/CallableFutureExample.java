package practice.core.java.programs;

import java.util.concurrent.*;
// Callable and Future example
public class CallableFutureExample {
    public static void main(String[] args) {
        // Create a thread pool
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create a Callable task
        Callable<String> task = () -> {
            System.out.println("Task is running...");
            Thread.sleep(2000); // Simulate a long computation
            return "Task Completed!";
        };

        // Submit task to ExecutorService
        Future<String> future = executor.submit(task);

        // Do other work in the main thread
        System.out.println("Main thread doing other work...");

        try {
            // Retrieve the result of the task
            String result = future.get(); // Blocks until the task is done
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown the executor
        executor.shutdown();
    }
}