package practice.core.java.programs;

/**
 * Given a string find all substrings that are palindromes including single character. For instance:
 */
public class PalindromOfSubString {
    public static void main(String[] args) {
        String string = "altktlalt";
        String reversString = "";
        for (int i = 0; i < string.length(); i++) {
            for (int j = i; j < string.length(); j++) {
                String subString = string.substring(i, j + 1);

                if (isStringIsPalindromOrNot(subString)) {
                    System.out.println(subString);
                }
            }

        }
    }

    private static Boolean isStringIsPalindromOrNot(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        return reverse.equals(s) && s.length() > 1;
    }
}
