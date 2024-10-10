package practice.core.java.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Questions on multithreading, run 4 threads, then coagulates results from all thread into single output.
 */
public class RunFourThreadAndCollectResult {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(4);
       List<String> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {

            Callable<String> stringCallable = () -> {
                return "This is thread " + Thread.currentThread().getName();
            };

            list.add(executorService.submit(stringCallable).get());
        }
        executorService.shutdown();
        System.out.println(list);

    }
}
