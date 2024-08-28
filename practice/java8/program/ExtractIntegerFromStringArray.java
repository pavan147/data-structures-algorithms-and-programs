package practice.java8.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Q13) Given a List of Strings  ["as", "123", "32", "2as"], create another Integer list that contains only integers. The output shoul be: List<Integer> iList = [123,32]
 */
public class ExtractIntegerFromStringArray {
    public static void main(String[] args) {
        String[] strArray = {"as", "123", "32", "2as" ,"1"};
        List<String> collect = Arrays.stream(strArray).filter(s -> s.matches("[0-9]+")).collect(Collectors.toList());


                System.out.println(collect);

    }

}
