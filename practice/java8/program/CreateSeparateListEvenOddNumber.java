package practice.java8.program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
Given a list of integers, divide into two lists one having even numbers and other having odd numbers.


Solutions:

 List<List<Integer>> lists = intList.stream()
        .collect(Collectors.groupingBy(key->key%2==0,Collectors.toList()))
        .entrySet().stream().map(e->e.getValue()).collect(Collectors.toList());
        System.out.println(lists);

2. intList.stream()
                .collect(Collectors.partitioningBy(integerValue->integerValue%2==0))
                .entrySet().stream().map(mapValue->mapValue.getValue()).collect(Collectors.toList());

3. Map<Boolean, List<Integer>> partitions = ints.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));
        List<Integer> evens = partitions.get(true);
        List<Integer> odds = partitions.get(false);
The entryset logic in solution 1 and 2 is to process the map. and also please know the difference between partitionBy and groupBy and when to use.


 */
public class CreateSeparateListEvenOddNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 34, 54, 23, 33, 20, 59, 11, 19, 3);

        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(integer -> integer % 2 == 0));

        System.out.println(collect);
    }
}
