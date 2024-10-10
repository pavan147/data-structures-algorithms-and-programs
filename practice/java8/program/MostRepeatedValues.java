package practice.java8.program;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MostRepeatedValues {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange", "apple", "banana", "apple", "kiwi", "banana"};

        Map<String, Long> collect = Arrays.stream(array)
                .collect(Collectors.groupingBy(String::toString, Collectors.counting()));

        System.out.println(collect);

        Long maxLength = collect.values().stream().max(Long::compare).orElse(0l);

        List<String> collect1 = collect.entrySet()
                .stream()
                .filter(stringLongEntry -> Objects.equals(stringLongEntry.getValue(), maxLength))
                .map(stringLongEntry -> stringLongEntry.getKey())
                .collect(Collectors.toList());

        System.out.println(collect1);


    }
}
