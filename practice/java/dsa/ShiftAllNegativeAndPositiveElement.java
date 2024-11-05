package practice.java.dsa;

import java.util.Arrays;

/**
 * /**
 *  * This method shifts all negative numbers in the array to the left and positive numbers to the right.
 *  * It runs in O(N) time complexity using the two-pointer technique.
 *  *
 *  * Iteration Example (arr = {1, -2, 3, -4, -1, 5, 6, -7}):
 *  *
 *  * Initial array: {1, -2, 3, -4, -1, 5, 6, -7}
 *  * 1. i=0, left=0: No swap, array remains the same.
 *  * 2. i=1, left=0: Swap -2 and 1, array = {-2, 1, 3, -4, -1, 5, 6, -7}, left increments.
 *  * 3. i=2, left=1: No swap, array remains the same.
 *  * 4. i=3, left=1: Swap -4 and 1, array = {-2, -4, 3, 1, -1, 5, 6, -7}, left increments.
 *  * 5. i=4, left=2: Swap -1 and 3, array = {-2, -4, -1, 1, 3, 5, 6, -7}, left increments.
 *  * 6. i=5, left=3: No swap, array remains the same.
 *  * 7. i=6, left=3: No swap, array remains the same.
 *  * 8. i=7, left=3: Swap -7 and 1, array = {-2, -4, -1, -7, 3, 5, 6, 1}, left increments.
 *  * Final array: {-2, -4, -1, -7, 3, 5, 6, 1}
 *  */
//Best Solution and easy.
public class ShiftAllNegativeAndPositiveElement {

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -1, 5, 6, -7};
        int leftPointer = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                int temp = arr[leftPointer];
                arr[leftPointer] = arr[i];
                arr[i] = temp;
                leftPointer++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
