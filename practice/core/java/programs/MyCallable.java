package practice.core.java.programs;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<Integer> {
    int num;

    // Constructor to initialize the num variable
    MyCallable(int num) {
        this.num = num;
    }

    // Overriding the call() method to compute the sum of integers up to 'num'
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum = sum + i;
        }
        return sum; // Returning the sum
    }
}

class CallableFutureDemo {
    public static void main(String args[]) throws Exception {
        // Array of MyCallable tasks
        MyCallable[] jobs = { 
            new MyCallable(10),
            new MyCallable(20), 
            new MyCallable(30), 
            new MyCallable(40), 
            new MyCallable(50),
            new MyCallable(60)
        };

        // Creating an ExecutorService with a fixed thread pool of size 3
        ExecutorService service = Executors.newFixedThreadPool(3);

        // Loop through the jobs and submit them to the ExecutorService
        for (MyCallable job : jobs) {
            Future<Integer> result = service.submit(job); // Submit job and get a Future object
            System.out.println("Sum for job with num = " + job.num + " is: " + result.get());
        }

        // Shutdown the ExecutorService
        service.shutdown();
    }
}
