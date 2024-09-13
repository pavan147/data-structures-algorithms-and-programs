package practice.java.dsa;

import java.util.Arrays;

/*
https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
    Solution : Cyclic Sort
 */
public class FindMissingValueInArray {
    public static void main(String[] args) {
        int n = 5, arr[] = {1, 2, 4, 5}, index = 1;

        while (index != n - 1) {

            if (index != arr[index - 1]) {
                //sometime value is greater than index so apply the condition
                if (!(arr[index] > n - 2)) {
                    int temp = arr[index - 1];
                    arr[index - 1] = arr[temp - 1];
                    arr[temp - 1] = temp;
                }
            }
            index++;

        }
        //find missing number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                System.out.println(i + 1 + " Missing Number ");
                break;
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
