package practice.java8.program;

/**
 * Find sum of all digits of a number in Java 8?
 *
 * int i = 236839
 */
public class SumOfAllDigitsFromIntegerNum {
    public static void main(String[] args) {
        Integer i = 236839;
        int sum = i.toString().chars()
                .map(Character::getNumericValue)
                .sum();

        System.out.println(sum);
    }
}
