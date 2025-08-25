package practice.java.dsa;

public class ThirdLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {9, 1, 8, 2, 7, 3, 6, 5, 4};

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (first < arr[i]) {
                third = second;
                second = first;
                first = arr[i];
            }
            if (second < arr[i] && arr[i] != first) {

                third = second;
                second = arr[i];
            }

            if (third < arr[i] && arr[i] != second && arr[i] != first) {
                third = arr[i];
            }
        }
        System.out.println(third);
    }
}
