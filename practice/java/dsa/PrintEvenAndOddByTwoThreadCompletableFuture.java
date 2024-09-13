package practice.java.dsa;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class PrintEvenAndOddByTwoThreadCompletableFuture {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        IntStream.rangeClosed(0, 10).forEach(num -> {
            CompletableFuture<Integer> evenComplFutur = CompletableFuture.completedFuture(num);
            evenComplFutur.thenApplyAsync(integer -> {
                if (integer % 2 == 0) {
                    System.out.println(integer + " " + Thread.currentThread().getName());
                }
                return num;
            }, executorService);
            evenComplFutur.join();

            CompletableFuture<Integer> oddComplFutur = CompletableFuture.completedFuture(num);
            evenComplFutur.thenApplyAsync(integer -> {
                if (integer % 2 != 0) {
                    System.out.println(integer + " " + Thread.currentThread().getName());
                }
                return num;
            }, executorService);

            oddComplFutur.join();
        });
        executorService.shutdown();
    }
}
