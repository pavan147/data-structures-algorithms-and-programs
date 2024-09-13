package practice.java.dsa;

public class PrintEvenAndOddByTwoThread implements Runnable {
    final Object lock;
    static int count = 1;

    public PrintEvenAndOddByTwoThread(Object lock) {
        this.lock = lock; // Shared lock object
    }

    @Override
    public void run() {


        while (count != 100) {
            if (count % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName() + " " + count);
                    count++;
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            if (count % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName() + " " + count);
                    count++;
                    lock.notify();
                }
            }

        }
    }
}

class Main {
    public static void main(String[] args) {
        Object object = new Object();
        PrintEvenAndOddByTwoThread printEvenAndOddByTwoThread = new PrintEvenAndOddByTwoThread(object);
        PrintEvenAndOddByTwoThread printEvenAndOddByTwoThread2 = new PrintEvenAndOddByTwoThread(object);
        Thread even = new Thread(printEvenAndOddByTwoThread, "even");
        Thread odd = new Thread(printEvenAndOddByTwoThread2, "odd");
        even.start();
        odd.start();
    }
}
