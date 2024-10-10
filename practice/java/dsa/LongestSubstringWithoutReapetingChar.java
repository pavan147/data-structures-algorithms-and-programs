package practice.java.dsa;

public class LongestSubstringWithoutReapetingChar {
    public static void main(String[] args) {
        String s = "aldshflasghdfasgfkhgasdfasdgvfyweofyewyrtyefgv";

        System.out.println(longestSubstrDistinctChars(s));
    }

    static int longestSubstrDistinctChars(String S) {
        String longestSubstringWithoutRep = "";
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j < S.length(); j++) {

                if (!longestSubstringWithoutRep.contains(String.valueOf(S.charAt(j)))) {
                    longestSubstringWithoutRep = longestSubstringWithoutRep.concat(String.valueOf(S.charAt(j)));
                    count++;
                    if(maxCount < count){
                        maxCount =count;
                    }
                } else {
                    longestSubstringWithoutRep = "";

                    count = 0;
                    break;
                }
            }
        }
        return maxCount;
    }
}
