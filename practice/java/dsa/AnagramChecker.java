package practice.java.dsa;

import java.util.Arrays;
//Anagram code
public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean isAnagram = areAnagrams(str1, str2);
        
        if (isAnagram) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove whitespace and convert to lowercase
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        // If lengths are not equal, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Sort the characters of both strings
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
