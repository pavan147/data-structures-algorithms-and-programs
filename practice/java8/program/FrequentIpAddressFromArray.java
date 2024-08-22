package practice.java8.program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 1. Find the most frequent IP address from the logs (string array)
 */
public class FrequentIpAddressFromArray {
    public static void main(String[] args) {
        String[] logs = {
                "192.168.1.1", "192.168.1.2", "192.168.1.1",
                "192.168.1.3", "192.168.1.1", "192.168.1.2",
                "192.168.1.2", "192.168.1.1", "192.168.1.4"
        };

        String collect = Arrays.stream(logs).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().max(Comparator.comparingLong(Map.Entry::getValue))
                .stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.joining());

        System.out.println(collect);
    }
}
