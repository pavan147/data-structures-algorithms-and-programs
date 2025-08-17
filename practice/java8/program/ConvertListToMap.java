package practice.java8.program;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Convert list of string to map where the key will be the length of string and value will be the count of string with same length.
 * e.g.: ab, abc, ag, def, abcd
 * output: {
 * 2: 2 [ab,ag],
 * 3: 2 abc,def,
 * 4: 1 abcd
 * }
 */
public class ConvertListToMap {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "ab", "abc", "abcd");

        Map<Integer, String> collect = list.stream().collect(Collectors.toMap(string -> string.length(),
                value -> value,
                (oldVAlue, newValue) -> oldVAlue));

        System.out.println(collect);
    }


}
