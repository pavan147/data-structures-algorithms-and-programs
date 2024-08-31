package practice.java.dsa;

import java.util.HashSet;

/**
 *
 */
public class LongestSubstringWithoutReaptingChar {
    public static void main(String[] args) {
        //String str = "dvdf";
        String str = "anviaj";
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        String substring = "";
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!substring.contains(String.valueOf(s.charAt(i)))) {
                substring = substring.concat(String.valueOf(s.charAt(i)));
            } else {

                if (length < substring.length()) {
                    length = substring.length();
                    substring ="";
                    i = i-2;
                }

            }


        }
        return Math.max(length,substring.length());
    }
}
