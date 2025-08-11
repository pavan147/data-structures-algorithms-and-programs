package practice.java.dsa;

public class FactorialExample {
    // Recursive function to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {

            return 1; // Base case: Factorial of 0 or 1 is 1
        }
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        int number = 5; // Number to find the factorial of
        int result = factorial(number); // Call recursive function

        System.out.println("Factorial of " + number + " is: " + result);
    }
}