package practice.java.dsa;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Given an unsorted array arr of size n that contains only non negative integers, find a sub-array (continuous elements) that has sum equal to s. You mainly need to return the left and right indexes(1-based indexing) of that subarray.
 * <p>
 * In case of multiple subarrays, return the subarray indexes which come first on moving from left to right. If no such subarray exists return an array consisting of element -1.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [1,2,3,7,5], n = 5, s = 12
 * Output: 2 4
 * Explanation: The sum of elements from 2nd to 4th position is 12.
 * Input: arr[] = [1,2,3,4,5,6,7,8,9,10], n = 10, s = 15,
 * Output: 1 5
 * Explanation: The sum of elements from 1st to 5th position is 15.
 * Input: arr[] = [7,2,1], n = 3, s = 2
 * Output: 2 2
 * Explanation: The sum of elements from 2nd to 2nd position is 2.
 * Input: arr[] = [5,3,4], n = 3, s = 2
 * Output: -1
 * Explanation: There is no subarray with sum 2
 */
public class IndexOfSubArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int s = 12;
        System.out.println(subarraySum(arr, 0, s));
    }

    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> subarray = new ArrayList<>();
        HashMap<Integer, Integer> hashSet = new HashMap<>();

        int sumOfElem = 0;

        for (int i = 0; i < arr.length; i++) {

            sumOfElem = sumOfElem + arr[i];

            if (sumOfElem == s) {
                subarray.add(1);
                subarray.add(i + 1);
                return subarray;
            }

            if (hashSet.containsKey(sumOfElem - s)) {
                subarray.add(hashSet.get(sumOfElem - s) + 2);
                subarray.add(i + 1);
                return subarray;
            }
            hashSet.put(sumOfElem, i);
        }
        subarray.add(-1);
        return subarray;
    }
}
