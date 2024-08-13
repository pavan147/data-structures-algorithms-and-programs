package practice.java8.program;

import java.util.Arrays;
import java.util.Comparator;

public class FindMaxLengthOfWordFromSentanse {

    public static void main(String[] args) {
        String string = "I am interested123455 to grow in my organization";

        String maxLength = Arrays.asList(string.split(" ")).stream().max(Comparator.comparing(s -> s.length())).get();

        System.out.println(maxLength);
    }
}
