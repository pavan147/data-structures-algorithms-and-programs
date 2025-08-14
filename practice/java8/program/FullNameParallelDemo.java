package practice.java8.program;

import java.util.concurrent.CompletableFuture;

public class FullNameParallelDemo {

    // Simulated methods that take time to return names
    public static String getFirstName() {
        try {
            Thread.sleep(1000); // Simulating delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "John";
    }

    public static String getMiddleName() {
        try {
            Thread.sleep(2000); // Simulating delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Michael";
    }

    public static String getLastName() {
        try {
            Thread.sleep(1500); // Simulating delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Smith";
    }

    public static void main(String[] args) {
        // Start calling the methods in parallel using CompletableFuture
        CompletableFuture<String> firstNameFuture = CompletableFuture.supplyAsync(FullNameParallelDemo::getFirstName);
        CompletableFuture<String> middleNameFuture = CompletableFuture.supplyAsync(FullNameParallelDemo::getMiddleName);
        CompletableFuture<String> lastNameFuture = CompletableFuture.supplyAsync(FullNameParallelDemo::getLastName);

        // Combine the results of the three futures to create the full name
        CompletableFuture<String> fullNameFuture = firstNameFuture
                .thenCombine(middleNameFuture, (firstName, middleName) -> firstName + " " + middleName)
                .thenCombine(lastNameFuture, (partialName, lastName) -> partialName + " " + lastName);

        // Wait for the result and print the full name
        String fullName = fullNameFuture.join();
        System.out.println("Full Name: " + fullName);
    }
}