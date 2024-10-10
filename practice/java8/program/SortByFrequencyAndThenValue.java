package practice.java8.program;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByFrequencyAndThenValue {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 1, 1, 2, 2, 2, 5, 5, 5, 5, 4, 4, 4);
        //sort by frequency
        List<Integer> sortedByFrequency1 = arr.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue()))
                .flatMap(entry -> Collections.nCopies(entry.getValue().intValue(), entry.getKey()).stream()).
                collect(Collectors.toList());
        System.out.println(sortedByFrequency1);
////////////////////////////////////////////////////////////
        //sort by frequency and then by number value
        List<Integer> sortedByFrequency = arr.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((o1, o2) -> {
                    int freqCompare = o2.getValue().compareTo(o1.getValue()); // Sort by frequency in descending order
                    if (freqCompare == 0) {
                        return -o1.getKey().compareTo(o2.getKey()); // If frequencies are equal, sort by value in ascending order
                    }
                    return freqCompare; // Otherwise, return frequency comparison
                })
                .flatMap(entry -> Collections.nCopies(entry.getValue().intValue(), entry.getKey()).stream())
                .collect(Collectors.toList());


        ////////////////////////////////////////////////////////////////////////////////////////////
        //sort by frequency and then by number value

        List<Integer> collect = arr.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().thenComparing(Map.Entry.comparingByKey()))
                .flatMap(entry -> Collections.nCopies(entry.getValue().intValue(), entry.getKey()).stream())
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
