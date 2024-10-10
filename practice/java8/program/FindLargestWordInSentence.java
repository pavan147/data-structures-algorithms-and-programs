package practice.java8.program;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindLargestWordInSentence {

    public static void main(String[] args) {
        String sentence = "Find the largest word in this sentence using streamsssssssss";

        String reduce = Arrays.stream(sentence.split(" "))
                .reduce( (word1, word2) -> word1.length() >= word2.length() ? word1 : word2).get();

        System.out.println(reduce);


    }
}
