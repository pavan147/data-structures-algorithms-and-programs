package practice.java.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * <p>
 * Notice that the solution set must not contain duplicate triplets.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 * Example 2:
 * <p>
 * Input: nums = [0,1,1]
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 * Example 3:
 * <p>
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * Explanation: The only possible triplet sums up to 0.
 */
public class Sum3isZero {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> listList = new ArrayList<>();
        Arrays.sort(nums);
        //-4,-1,-1,0,1,2
        for (int i = 0; i < nums.length; i++) {
            List<Integer> subArray = new ArrayList<>();
            int left = i + 1;
            int right = nums.length - 1;
            int sum = 0;
            //addition opposite sign
            int twoSum = -nums[i];

            //then we are checking twoSum is equal to the two number mean right , left, nums[i] will be 0 addition
            while (left < right) {
                sum = nums[left] + nums[right];
                if (sum < twoSum) {
                    left++;
                } else if (sum > twoSum) {
                    right--;
                } else {
                    subArray.add(nums[left]);
                    subArray.add(nums[right]);
                    subArray.add(nums[i]);
                    listList.add(subArray);

                    break;
                }
            }
        }
        System.out.println(listList);
        return listList;
    }
}
