package practice.java8.program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given a list of integers, divide into two lists one having even numbers and other having odd numbers.
 */
public class GetEvenAndOddInDiffList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> collect = numbers.stream().collect(Collectors.partitioningBy(integer -> integer % 2 == 0));

        List<Integer> evenNumberList = collect.get(true);
        List<Integer> oDdNumberList = collect.get(false);

        System.out.println(evenNumberList);
        System.out.println(oDdNumberList);
    }
}
