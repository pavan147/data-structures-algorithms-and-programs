package practice.core.java.programs;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceScheduleAsyncSendEmail {

    public static void main(String[] args) {

        // Create a ScheduledExecutorService with a single thread
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Define the task to be executed after the delay
        Runnable emailTask = () -> {
            System.out.println("Task Schedule " + LocalDateTime.now());
            sendEmail(); // Call the dummy method
        };
        System.out.println("Before " + LocalDateTime.now());
        // Schedule the task to run after 1 minute (60 seconds)
        scheduler.schedule(emailTask, 1, TimeUnit.MINUTES);
        System.out.println("After " + LocalDateTime.now());
        // Optionally, shut down the scheduler gracefully
        // Note: In a real application, you might want to keep the scheduler running longer
        // and shut it down when the application is about to terminate.
        scheduler.shutdown();
    }

    // Dummy method to represent sending an email
    private static void sendEmail() {
        System.out.println("Sending email...");
        // Simulate email sending process
        // In a real scenario, you would call your email service here
    }
}
