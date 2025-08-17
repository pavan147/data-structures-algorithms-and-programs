package practice.java8.program;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

/**
 * coding question find the First Non-Repeating Character
 */
public class FindFirstNonRepeatingChar {

    public static void main(String[] args) {
        String s = "AAnishn";

        String collect = s.chars().mapToObj(value -> String.valueOf((char)value))
                .collect(Collectors.toMap(string -> string,
                        o -> 1L,
                        (oldv, newv) -> oldv +1,
                        LinkedHashMap::new))
                .entrySet()
                .stream().filter(stringLongEntry -> stringLongEntry.getValue() == 1)
                .map(stringLongEntry -> stringLongEntry.getKey())
                .collect(Collectors.joining(""));

        System.out.println(collect);
    }
}
