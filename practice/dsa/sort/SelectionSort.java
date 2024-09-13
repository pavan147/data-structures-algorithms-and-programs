package practice.dsa.sort;

import java.util.Arrays;

/**
 * Step1 : max element
 * Step2 : max element swap kiya last index
 * Step3 : last index decrement by 1;
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 6, 9, 3};
        //counter loop
        for (int i = 0; i < arr.length; i++) {

            int start = 0;
            int last = arr.length - i - 1;
            int maxIndex = maxElementIndex(start, last, arr);
            swapNumber(maxIndex, last, arr);
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void swapNumber(int maxIndex, int last, int[] arr) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }

    static int maxElementIndex(int start, int last, int[] arr) {
        int maxElementIndex = start;

        for (int i = 0; i <= last; i++) {
            if (arr[maxElementIndex] < arr[i]) {
                maxElementIndex = i;
            }
        }


        return maxElementIndex;
    }
}
