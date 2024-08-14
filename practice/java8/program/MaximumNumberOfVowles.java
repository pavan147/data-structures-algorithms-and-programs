package practice.java8.program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaximumNumberOfVowles {
    public static void main(String[] args) {


        String sentance = "The quick brown fox jumps right over the little lazy dog.";

        Integer string = Arrays.stream(sentance.split(" "))
                .mapToInt(MaximumNumberOfVowles::getVowlesCount).max().getAsInt();

        List<String> collect = Arrays.stream(sentance.split(" ")).filter(s -> getVowlesCount(s).equals(string)).collect(Collectors.toList());

        System.out.println(collect);
    }

    private static Integer getVowlesCount(String word) {


        return (int) word.toLowerCase().chars().filter(value -> "aeiou".indexOf(value) != -1).count();
    }
}
