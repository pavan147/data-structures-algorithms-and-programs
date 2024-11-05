package practice.java.dsa;

import java.util.Arrays;

public class MoveAllZeroToLast3 {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 3};

        // Call the function to shift zeroes to the end
        shiftZerosToEnd(arr);

        // Output the result
        System.out.println(Arrays.toString(arr));
    }

    public static void shiftZerosToEnd(int[] arr) {
        int nonZeroIndex = 0; // Keeps track of the position to place non-zero elements
        int target = 0;
        for (int i = 0; i < arr.length; i++) {
            // First loop: Move all non-zero elements to the front
            if (arr[i] != target) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }
        // Second loop: Fill the remaining positions with zeros
        while (nonZeroIndex <= arr.length - 1) {

            arr[nonZeroIndex] = target;
            nonZeroIndex++;
        }

    }
}
