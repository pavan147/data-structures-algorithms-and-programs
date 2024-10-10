package practice.java.dsa;

import java.util.HashMap;

public class CheckAnagramStringIsPalindromeOrNot {

    public static int isPossible(String S) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (int i = 0; i < S.length(); i++) {
            charCountMap.put(S.charAt(i), charCountMap.getOrDefault(S.charAt(i), 0) + 1);
        }

        int oddCount = 0;

        // Check if the count of each character is even or odd
        for (int count : charCountMap.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        // A palindrome is possible if:
        // - The string length is even and all character counts are even.
        // - The string length is odd and there is exactly one character with an odd count.

        Boolean isPalindrom =
                (S.length() % 2 == 0 && oddCount == 0) || (S.length() % 2 != 0 && oddCount == 1);
        return isPalindrom ? 1 : 0;
    }

    public static void main(String[] args) {
        String S = "geeksogeek";
        int result = isPossible(S);
        System.out.println(result); // Output: true
    }


}
