package practice.java8.program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramList {

    public static void main(String[] args) {
        String[] strArray = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String, List<String>> collect = Arrays.stream(strArray).collect(Collectors.groupingBy(AnagramList::sortString));

        System.out.println(collect);
    }
    public static String sortString(String str){

        return str.chars().mapToObj(value -> (char)value).sorted().map(character -> String.valueOf(character)).collect(Collectors.joining(""));
    }

}
