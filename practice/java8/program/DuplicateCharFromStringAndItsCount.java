package practice.java8.program;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharFromStringAndItsCount {

    public static void main(String[] args) {
        String input = "pavanmohangawande";

        List<String> stringList = List.of(input.split(""));

        Map<String , Long> strings = stringList.stream().collect(Collectors.toMap(key -> key,
                        value -> 1L,
                        (oldValue, newValue) -> newValue + 1L,
                        LinkedHashMap::new))
                .entrySet()
                .stream()
                .filter(stringStringEntry -> stringStringEntry.getValue() > 1)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,        // Key mapper for final map
                        Map.Entry::getValue));

        System.out.println(strings);
    }
}
