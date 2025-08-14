package practice.java8.program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FindSumOfAllEvenNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> collect = list.stream().filter(integer -> integer % 2 == 0).map(integer -> integer * integer)
                .collect(Collectors.toList());

        System.out.println(collect);

        HashMap<Integer, Integer> collect1 = list.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toMap(integer -> integer,
                integer1 -> integer1 * integer1, (oldVAlue, newVAlue) -> oldVAlue,
                HashMap::new));

        System.out.println(collect1);
    }
}
