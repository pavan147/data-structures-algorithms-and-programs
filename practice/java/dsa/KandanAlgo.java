package practice.java.dsa;

import java.util.Arrays;
import java.util.HashMap;
//Max Subaray sum
public class KandanAlgo {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int maxSum = maxSubarraySum(arr);

        System.out.println(Arrays.toString(findSubarray(maxSum, arr)));

    }

    // Function to find the sum of contiguous subarray with maximum sum.
    static int maxSubarraySum(int[] arr) {
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int currentSum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                currentSum = currentSum + arr[j];

                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }
    ///Here i am finding subarray which have maximum sum.
    static Integer[] findSubarray(int maxSum, int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int sumOfInteger = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfInteger += arr[i];
            if (sumOfInteger - maxSum == 0) {
                return new Integer[]{0, i};
            }
            if (hashMap.containsKey(sumOfInteger - maxSum)) {
                Integer firstIndex = hashMap.get(sumOfInteger - maxSum);
                return new Integer[]{firstIndex, i};
            }
            hashMap.put(sumOfInteger, i);
        }

        return null;
    }
}


