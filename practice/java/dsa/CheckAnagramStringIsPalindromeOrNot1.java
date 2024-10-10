package practice.java.dsa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CheckAnagramStringIsPalindromeOrNot1 {
    public static void main(String[] args) {
       // String str = "geeksogeeks";
        String str = "geeksforgeeks";

        System.out.println(afterRearrange(str));
    }

    public static String afterRearrange(String str) {

        Map<String, Long> charCount = str.chars().mapToObj(value -> (char) value).collect(Collectors.toMap(
                String::valueOf,
                value -> 1L,
                (old, newV) -> old + 1,
                LinkedHashMap::new
        ));
        int countOddChar = 0;
        for (Long count : charCount.values()) {
            if (count % 2 != 0) {
                countOddChar++;
            }
        }
        StringBuilder halfStr = new StringBuilder();
        String middle = "";
        // A palindrome is possible if:
        // - The string length is even and all character counts are even.
        // - The string length is odd and there is exactly one character with an odd count.
        if ((str.length() % 2 == 0 && countOddChar == 0) || (str.length() % 2 != 0 && countOddChar == 1)) {

             //if one char is odd and other are even then that even char is middle char adn other are even
            //creating half to
            for (Map.Entry<String, Long> stringLongEntry : charCount.entrySet()) {
                if (stringLongEntry.getValue() % 2 != 0) {
                    middle = stringLongEntry.getKey();
                }
                for (int i = 0; i < stringLongEntry.getValue() / 2; i++) {

                    halfStr.append(stringLongEntry.getKey());

                }

            }
        }else {
            return "Not Possible";
        }
        //appending half and reverse and then again append.
        return halfStr.toString().concat(middle).concat(halfStr.reverse().toString());
    }
}
