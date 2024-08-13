package practice.java8.program;

import java.util.Arrays;
import java.util.Comparator;

public class FindMaxLengthOfWordFromSentanse {

    public static void main(String[] args) {
        String string = "I am interested123455 to grow in my organization";

        String maxLength = Arrays.stream(string.split(" ")).max(Comparator.comparing(String::length)).get();

        System.out.println(maxLength);
    }
}
