package practice.core.java.programs;

/**
 * Given an array arr[] where each element represents the max number of steps that can be made forward from that index. The task is to find the minimum number of jumps to reach the end of the array starting from index 0.
 *
 * Examples:
 *
 * Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
 * Output: 3 (1-> 3 -> 9 -> 9)
 * Explanation: Jump from 1st element to 2nd element as there is only 1 step.
 * Now there are three options 5, 8 or 9. If 8 or 9 is chosen then the end node 9 can be reached. So 3 jumps are made.
 *
 * Input:  arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
 * Output: 10
 * Explanation: In every step a jump is needed so the count of jumps is 10.
 */
public class CountOfJumpToReachEnd {

    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 1, 4};
        int jump = 0;
        int jumpTo = 0;
        int end = 0;
        for (int i = 0; i < nums.length - 1; i++) {

            jumpTo = Math.max(nums[i] + i, jumpTo);

            if (i == end) {
                jump++;
                end = jumpTo;
                if (jumpTo >= nums.length) {
                    break;
                }
            }
        }

        System.out.println(jump);
    }
}
