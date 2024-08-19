package practice.java8.program;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * Given a numeric array, re arrange the elements to form the highest possible value.
 *
 * input is: int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};
 *
 * output should be: 998764543431
 */
public class RearrangeElementHighestPossibleValue {

    public static void main(String[] args) {
        int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};

        String collect = Arrays.stream(Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(""))
                        .split(""))
                .sorted((o1, o2) -> -Integer.valueOf(o1).compareTo(Integer.valueOf(o2)))
                .collect(Collectors.joining(""));

        System.out.println(collect);
    }
}
