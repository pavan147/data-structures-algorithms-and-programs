package practice.java8.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1. Transform a List of integers to square each even element and skip all the odd numbers from output
 * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
 * Output = 4, 16, 36, 64
 * Using java-8
 */
public class TransformToSquareSkipEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> collect = numbers.stream()
                .filter(integer -> integer % 2 == 0)
                .map(integer -> integer * integer)
                .toList();
        System.out.println(collect);


    }
}
