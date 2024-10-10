package practice.java.dsa;

import java.util.Arrays;

/**
 * Given an array arr[] and an integer k where k is smaller than the size of the array, the task is to find the kth smallest element in the given array. It is given that all array elements are distinct.
 * <p>
 * Follow up: Don't solve it using the inbuilt sort function.
 * <p>
 * Examples :
 * <p>
 * Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
 * Output:  7
 * Explanation: 3rd smallest element in the given array is 7.
 * Input: arr[] = [2, 3, 1, 20, 15], k = 4
 * Output: 15
 * Explanation: 4th smallest element in the given array is 15.
 * <p>
 * https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1?page=1&sortBy=submissions
 */
public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int i = kthSmallest(arr, k);
        System.out.println(i);
    }

    public static int kthSmallest(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {

            int minNumIndex = minNum(arr, i);

            int temp = arr[i];
            arr[i] = arr[minNumIndex];
            arr[minNumIndex] = temp;

            if (i == k - 1) {
                return arr[i];

            }
        }


        return k;
    }

    public static int minNum(int[] arr, int start) {

        int minElement = start;

        for (int i = start; i < arr.length; i++) {

            if (arr[minElement] > arr[i]) {
                minElement = i;
            }
        }
        return minElement;
    }
}
