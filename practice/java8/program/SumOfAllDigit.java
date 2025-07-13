package practice.java8.program;

/**
 * Find sum of all digits of a number in Java 8?
 * int i = 236839
 */
public class SumOfAllDigit {
    public static void main(String[] args) {

        Integer i = 236839;
        int sum = String.valueOf(i)
                .chars()
                .map(Character::getNumericValue)
                .sum();

        System.out.println("Sum of digits: " + sum);

    }
}
