package practice.core.java.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
// Callable and future example
class FactorialTask implements Callable<Long> {
    private int number;

    public FactorialTask(int number) {
        this.number = number;
    }

    @Override
    public Long call() throws Exception {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
            Thread.sleep(100); // Simulate some delay
        }

        System.out.println("Factorial of " + number + " calculated.");
        return factorial;
    }
}

public class MultipleCallableExample {
    public static void main(String[] args) {
        // Thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // List of tasks
        List<Callable<Long>> tasks = new ArrayList<>();
        tasks.add(new FactorialTask(5));
        tasks.add(new FactorialTask(4));
        tasks.add(new FactorialTask(3));

        try {
            // Submit multiple tasks
            List<Future<Long>> results = executor.invokeAll(tasks);

            // Retrieve results
            for (Future<Long> result : results) {
                System.out.println("Factorial Result: " + result.get());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Shut down the executor
            executor.shutdown();
        }
    }
}