package practice.java8.program;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfOccurrenceCharInString {
    public static void main(String[] args) {
        String input = "abcabcabc";
        //o/p : {a=3, b=3, c=3}

        Map<Character, Long> map = input.chars().mapToObj(value -> (char) value).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);
    }
}
