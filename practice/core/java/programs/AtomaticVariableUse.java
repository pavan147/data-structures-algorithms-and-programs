package practice.core.java.programs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * When multiple thread is operate on same variable that time we get unregular output because :
 *          The operation counter++ is not atomic. It involves three steps:
 *              1.Reading the current value of counter.
 *              2.Incrementing that value.
 *              3.Storing the new value back into counter.
 * If two threads execute counter++ at the same time, they might read the same initial value, increment it, and then write back the same new value, leading to lost increments.
 *
 * so we use it volatile and synchronised check in step 2
 *
 * but Atomic we no need to add volatie and synchronised and we get regular output.
 */
public class AtomaticVariableUse {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Counter counter = new Counter();
        Runnable runnable = () -> {
            for (int i = 0; i < 20000; i++) {
                counter.increment();
            }
        };
        Runnable runnable2 = () -> {
            for (int i = 0; i < 80000; i++) {
                counter.increment();
            }
        };
        executorService.submit(runnable);
        executorService.submit(runnable2);

        executorService.awaitTermination(1, TimeUnit.SECONDS);

        System.out.println(counter.getValue());
        executorService.shutdown();
    }


}

class Counter {
    private Integer counter = 0;

    public Integer getValue() {
        return counter;
    }

    public Integer increment() {
        return counter++;
    }

    //step 2
//    private volatile  Integer counter =0;
//
//    public Integer getValue() {
//        return counter;
//    }
//
//    public synchronized Integer increment() {
//        return counter++;
//    }


//    private AtomicInteger counter = new AtomicInteger(0);
//
//    public Integer getValue() {
//        return counter.get();
//    }
//
//    public synchronized Integer increment() {
//        return counter.getAndIncrement();
//    }
}
