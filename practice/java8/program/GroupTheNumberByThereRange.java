package practice.java8.program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given an array of integers (2, 34, 54, 23, 33, 20, 59, 11, 19, 37 ) group the numbers by the range they belong to. The put put should be {0=[2], 50=[54,59], 20=[23,20], 10=[11,19], 30=[34,33,37]}
 */
public class GroupTheNumberByThereRange {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 34, 54, 23, 33, 20, 59, 11, 19, 37);

        Map<Integer, List<Integer>> collect = numbers.stream().collect(Collectors.groupingBy(integer -> integer / 10 * 10));

       System.out.println(collect);
    }
}
