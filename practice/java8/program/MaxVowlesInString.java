package practice.java8.program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given a string, find the words with the maximum number of vowels.
 *
 *        "The quick brown fox jumps right over the little lazy dog."
 *        o/p:{jumps=4, right=4, brown=4, little=4}
 */
public class MaxVowlesInString {

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps right over the little lazy aadogaaaaa";

        Map<String, Integer> collect = Arrays.stream(sentence.split(" "))
                .collect(Collectors.toMap(string -> string, vowles -> vowles.toLowerCase().replaceAll("^*[aeiou]*", "")
                        .length()));
        Integer maxVowles = collect.entrySet().stream().map(stringIntegerEntry -> stringIntegerEntry.getValue())
                .max(Comparator.comparing(integer -> integer)).get();

        Map<String, Integer> result = collect.entrySet().stream().filter(stringIntegerEntry -> stringIntegerEntry.getValue() == maxVowles)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(result);
    }
}
