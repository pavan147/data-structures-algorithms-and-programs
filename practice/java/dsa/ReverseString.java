package practice.java.dsa;

public class ReverseString {

    public static void main(String[] args) {
        String str = "pavan";
        char[] charArray = str.toCharArray();
       //here we will swap half first string to second half.
        for (int i = 0; i < str.length() / 2; i++) {

            char temp = charArray[i];
            charArray[i] = charArray[str.length() - 1 - i];
            charArray[str.length() - 1 - i] = temp;
        }

        str = new String(charArray);
        System.out.println(str);
    }
}
