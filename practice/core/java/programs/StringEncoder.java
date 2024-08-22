package practice.core.java.programs;

/**
 * For a string input the function returns output encoded as follows:
 * <p>
 * "a" -> "a1"
 * "aa" -> "a2"
 * "aabbb" -> "a2b3"
 * "aabbbaa" -> "a2b3a2"
 */
public class StringEncoder {
    public static String encode(String input) {

        StringBuilder result = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                result.append(currentChar).append(count);

                currentChar = input.charAt(i);
                count = 1;
            }
        }

        return result.append(currentChar).append(count).toString();
    }

    public static void main(String[] args) {
        //System.out.println(encode("a"));        //  a1
        //System.out.println(encode("aa"));       //  a2
        //System.out.println(encode("aabbb"));    //  a2b3
        //System.out.println(encode("aabbbaa"));  //  a2b3a2
        //System.out.println(encode("zxxcccvvvvbbbbbnnnnnnmmmmmmm"));  //  a2b3a2
        System.out.println(encode("aab"));  //  a2b3a2
    }
}