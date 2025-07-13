package practice.java8.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
Given a List of Strings  ["as", "123", "32", "2as"], create another Integer list that contains only integers. The output shoul be: List<Integer> iList = [123,32]
 */
public class GetOnlyIntegerAsString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("as", "123", "32", "2as");

        List<String> collect = list.stream().filter(string -> string.matches("[0-9]*")).collect(Collectors.toList());

        System.out.println(collect);
    }
}
