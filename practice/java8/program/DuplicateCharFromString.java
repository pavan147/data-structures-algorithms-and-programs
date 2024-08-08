package practice.java8.program;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharFromString {
    public static void main(String[] args) {
        String input = "pavanmohangawande";

        List<String> stringList = List.of(input.split(""));

        List<String> strings = stringList.stream().collect(Collectors.toMap(key -> key,
                        value -> 1,
                        (oldValue, newValue) -> newValue + 1,
                        LinkedHashMap::new))
                .entrySet()
                .stream()
                .filter(stringStringEntry -> stringStringEntry.getValue() > 1)
                .map(Map.Entry::getKey).toList();

        System.out.println(strings);
    }
}
