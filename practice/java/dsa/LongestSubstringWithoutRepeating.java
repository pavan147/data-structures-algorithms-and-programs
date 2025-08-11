package practice.java.dsa;

import java.util.Arrays;
import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
// Example test cases
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // Output: 3 (substring "abc")
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // Output: 1 (substring "b")
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // Output: 3 (substring "wke")
        System.out.println(lengthOfLongestSubstring(""));         // Output: 0 (empty string)
        System.out.println(lengthOfLongestSubstring("au"));       // Output: 2 (substring "au")
    }

    public static int lengthOfLongestSubstring(String s) {
        // Edge case: if the string is empty, return 0
        if (s == null || s.isEmpty()) {
            return 0;
        }

        // Initialize pointers and variables
        int start = 0; // Pointer for the start of the sliding window
        int end = 0;   // Pointer for the end of the sliding window
        int maxLen = 0; // Variable to track the maximum substring length
        HashSet<Character> hashSet = new HashSet<>(); // Use HashSet to track unique characters

        // Traverse the string using the `end` pointer
        while (end < s.length()) {
            char currentChar = s.charAt(end); // Character at the `end` pointer

            // If the character is NOT in the HashSet
            if (!hashSet.contains(currentChar)) {
                hashSet.add(currentChar); // Add the character to the HashSet
                maxLen = Math.max(maxLen, end - start + 1); // Update the maximum length
                end++; // Expand the window by moving the `end` pointer
            } else {
                // If the character IS in the HashSet (duplicate found)
                hashSet.remove(s.charAt(start)); // Remove the character at the `start` pointer
                start++; // Shrink the window by moving the `start` pointer
            }
        }

        return maxLen; // Return the maximum length of the substring
    }
}
