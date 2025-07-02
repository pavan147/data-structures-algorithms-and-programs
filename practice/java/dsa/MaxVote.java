package practice.java.dsa;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxVote {
    // grouping count
    //max vote
    //alphabetically
    // winner
    public static void main(String[] args) {
        String votes[] = {"john", "johnny", "jackie", "johnny", "john", "jackie", "jamie", "jamie", "john", "johnny", "jamie", "johnny", "john"};

//        Optional<Map.Entry<String, Long>> first = Stream.of(votes).collect(Collectors.groupingBy(s -> s, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .sorted(
//                       Comparator.comparingLong((Map.Entry<String,Long>integerEntry) -> integerEntry.getValue()).reversed()
//                                .thenComparing(integerEntry -> integerEntry.getKey())
//                ).findFirst();


        Optional<Map.Entry<String, Long>> first = Stream.of(votes).collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(
                       Comparator.comparing((Map.Entry<String,Long> entry) ->entry.getValue()).reversed().thenComparing(stringLongEntry -> stringLongEntry.getKey())
                ).findFirst();



        System.out.println(first.get().getKey());

    }
}
