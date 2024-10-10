package practice.java8.program;

import java.util.HashMap;

public class ShortestSubarrayWithSumK {

    public static void main(String[] args) {
        int sum = 19;
        int[] arr = {77, 19, 35, 10, -14};

        System.out.println(shortestSubarray(arr, sum));
    }

    public static int shortestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int sum = 0;
        int minSubArray = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum - k == 0) {

                int range = i + 1;
                if (minSubArray > range) {
                    minSubArray = range;
                }
            }

            if (hashMap.containsKey(sum - k)) {

                int startIndex = hashMap.get(sum - k) + 1;
                int range = i - startIndex;
                if (minSubArray > range) {
                    minSubArray = range;
                }
            }
            hashMap.put(sum, i);
        }

        return minSubArray == Integer.MAX_VALUE ? -1 : minSubArray;
    }
}
