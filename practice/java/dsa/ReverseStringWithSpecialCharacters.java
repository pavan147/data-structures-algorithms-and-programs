package practice.java.dsa;

import java.util.Arrays;

public class ReverseStringWithSpecialCharacters {

    public static void main(String[] args) {
        String input = "!pavan@";
        String reverseString = "";

        char[] charArray = input.toCharArray();
        // reverse the sting if found any specialChar then add _
        for (int i = charArray.length - 1; i >= 0; i--) {

            if (Character.toString(charArray[i]).matches(".*[a-zA-Z].*")) {
                reverseString = reverseString + Character.toString(charArray[i]);
            } else {
                reverseString = reverseString + "_";
            }
        }

        char[] charString = reverseString.toCharArray();
        System.out.println(Arrays.toString(charString));
        //now both secondArray have _ on place of specialChar but both array hav same index for _ and special char
        // then same index replace
        //EG array1[_, n, a, v, a, p, _]
        // Arra2   [!, p ,a ,v ,a ,n ,@]
        for (int i = 0; i < charString.length; i++) {

            if (!Character.toString(charString[i]).matches(".*[a-zA-Z].*")) {
                charString[i] = charArray[i];
            }
        }
        System.out.println(Arrays.toString(charString));

    }
}
