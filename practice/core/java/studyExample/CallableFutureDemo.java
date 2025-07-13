package practice.core.java.studyExample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<Integer> { // Specify Integer as return type
    int num;

    MyCallable(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception { // Return Integer instead of Object
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum = sum + i;
        }
        return sum;
    }
}

public class CallableFutureDemo {
    public static void main(String[] args) throws Exception {
        // Array of Callable tasks
        MyCallable[] jobs = {
            new MyCallable(10),
            new MyCallable(20),
            new MyCallable(30),
            new MyCallable(40),
            new MyCallable(50),
            new MyCallable(60)
        };

        // Create a thread pool with a fixed size of 3
        ExecutorService service = Executors.newFixedThreadPool(3);

        try {
            for (MyCallable job : jobs) {
                // Submit each task to the ExecutorService
                Future<Integer> future = service.submit(job);

                // Get the result of the task
                System.out.println("Sum of numbers up to " + job.num + " is: " + future.get()); // Future blocks until task is complete
            }
        } finally {
            // Shut down the ExecutorService
            service.shutdown();
        }
    }
}