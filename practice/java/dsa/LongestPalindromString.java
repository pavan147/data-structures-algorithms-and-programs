package practice.java.dsa;

import practice.design.pattern.builder.Product;

/**
 * Given a string s, return the longest
 * palindromic
 * <p>
 * substring
 * in s.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 * <p>
 * Input: s = "cbbd"
 * Output: "bb"
 */
public class LongestPalindromString {
    public static void main(String[] args) {
        String s = "bb";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        String subString = "";
        int maxLength = 0;
        String palindromString = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                subString = s.substring(i, j + 1);

                if (subString.equals(new StringBuilder(subString).reverse().toString())) {

                    if (subString.length() > maxLength) {
                        maxLength = subString.length();
                        palindromString = subString;
                    }
                }


            }
        }
        return palindromString;
    }
}
