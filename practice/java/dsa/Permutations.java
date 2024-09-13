package practice.java.dsa;

public class Permutations {
   static long count = 0;
    // Function to swap characters at position i and j in a string
    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void permute(char[] charArray, int l, int r) {

        if (l == r) {
            System.out.println(new String(charArray));
            count++;
        } else {
            for (int i = l; i <= r; i++) {

                swap(charArray, l, i);
                permute(charArray, l + 1, r);
                swap(charArray, l, i);
            }
        }
    }

    // Driver method
    public static void main(String[] args) {
        String str = "jsp";
        char[] charArray = str.toCharArray();
        permute(charArray, 0, charArray.length - 1);
        System.out.println(count);
    }

}
