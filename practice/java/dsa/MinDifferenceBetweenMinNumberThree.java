package practice.java.dsa;

import java.util.Arrays;

/**
 * Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3
 * Output: Minimum Difference is 2
 * Explanation:
 * We have seven packets of chocolates and we need to pick three packets for 3 students
 * If we pick 2, 3 and 4, we get the minimum difference between maximum and minimum packet sizes.
 * Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5
 * Output: Minimum Difference is 6
 * Input : arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50} , m = 7
 * Output: Minimum Difference is 10
 */
public class MinDifferenceBetweenMinNumberThree {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        Arrays.sort(arr);
        int m = 5;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (i + m - 1 <= arr.length - 1) {
                int firstVAlue = arr[i];
                int lastValue = arr[i + m - 1];

                min = Math.min(min, lastValue - firstVAlue);
            }
        }

        System.out.println(min);

    }
}
