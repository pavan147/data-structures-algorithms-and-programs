package practice.java8.program;

import java.util.List;

public class SumOfSquares {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4); // Immutable list in Java 9+
        
        // Use Streams API to calculate the sum of squares of even numbers
        int sumOfSquares = numbers.stream()
                .filter(n -> n % 2 == 0)   // Filter even numbers
                .map(n -> n * n)          // Square each even number
                .reduce(0,(integer, integer2) -> integer + integer2); // Sum them together
        
        System.out.println("Sum of squares of even numbers: " + sumOfSquares);
    }
}