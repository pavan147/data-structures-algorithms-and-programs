package practice.java8.program;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondMostOccurredCharacter {
    public static void main(String[] args) {

        String input = "abbccdddd";

        // Step 1: Compute character frequencies
        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(c -> (char) c) // Convert int to Character
                //.filter(Character::isLetterOrDigit)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Step 2: Sort by frequencies in descending order
         Map.Entry<Character, Long> first = frequencyMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .filter(characterLongEntry -> characterLongEntry.getValue() != 1)
                .skip(1)
                .findFirst().orElse(null);


        System.out.println(first);

    }


}