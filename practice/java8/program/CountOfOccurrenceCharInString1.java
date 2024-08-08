package practice.java8.program;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfOccurrenceCharInString1 {

    public static void main(String[] args) {
        String input = "abcabcabc";
        //o/p : {a=3, b=3, c=3}

        Map<String, Long> map =   Arrays.asList(input.split("")).stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.println(map);
    }
}
