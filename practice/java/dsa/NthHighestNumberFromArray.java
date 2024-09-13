package practice.java.dsa;

import java.util.Arrays;

public class NthHighestNumberFromArray {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 6, 9, 3};
        //counter loop
        for (int i = 0; i < arr.length; i++) {

            int start = 0;
            int last = arr.length - i - 1;
            int maxIndex = maxElementIndex(start, last, arr);
            swapNumber(maxIndex, last, arr);
            //if we want nth highest salary
            int indexOfNthHighestSalary = 1;
            if (i == indexOfNthHighestSalary) {
                System.out.println(arr[last]);
                //found nth highest salary then break;
                break;
            }

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
