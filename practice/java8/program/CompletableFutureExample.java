package practice.java8.program;

import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) throws InterruptedException {
        // Record the start time
        long startTime = System.nanoTime();

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                return name();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                return middleName();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
            try {
                return sirName();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        // Wait for all futures to complete
        CompletableFuture<Void> allFutures = CompletableFuture.allOf(future, future2, future3);
        // Process results after all futures complete
        allFutures.thenRun(() -> {
            try {
                // Retrieve results from each future
                String result1 = future.get();  //name
                String result2 = future2.get(); //middle
                String result3 = future3.get();  //surname

                // Process the results
                fullName(result1, result2, result3);

            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }).join(); // Optional: Wait for the final processing to complete


        // Record the end time
        long endTime = System.nanoTime();
        // Calculate the duration
        long durationInNano = endTime - startTime;

        System.out.println("Total time for Completable future " + durationInNano);
        // Record the start time
        long startTime1 = System.nanoTime();
        // Retrieve results from each future
        String result11 = name();
        String result21 = middleName();
        String result31 = sirName();


        // Process the results
        fullName(result11, result21, result31);

        // Record the end time
        long endTime1 = System.nanoTime();
        // Calculate the duration
        long durationInNano1 = endTime1 - startTime1;

        System.out.println("Total time for Normal call " + durationInNano1);
    }

    public static String name() throws InterruptedException {
        Thread.sleep(2000);
        return "Pavan";
    }

    public static String middleName() throws InterruptedException {
        Thread.sleep(2000);
        return "Mohan";
    }

    public static String sirName() throws InterruptedException {
        Thread.sleep(2000);
        return "Gawande";
    }

    public static String fullName(String name, String middleName, String sirName) {
        return name + " " + middleName + " " + sirName;
    }
}
