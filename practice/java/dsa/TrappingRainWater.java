package practice.java.dsa;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
 * Example 2:
 * <p>
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 *
 * Note : check Image TrappingRainWater.png
 */
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] numArray = {3, 1, 2, 4, 0, 1, 3, 2};
       // int[] numArray = {4, 2, 0, 3, 2, 5};
        int length = numArray.length;
        int totalWaterRetail = 0;

        // Initialize leftArray and rightArray
        int[] leftArray = new int[length];
        int[] rightArray = new int[length];

        // Fill leftArray with the max values from the left
        leftArray[0] = numArray[0];
        for (int i = 1; i < length; i++) {
            leftArray[i] = Math.max(leftArray[i - 1], numArray[i]);
        }

        rightArray[length - 1] = numArray[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            rightArray[i] = Math.max(rightArray[i + 1], numArray[i]);
        }

        for (int i = 0; i < length; i++) {
            int min = Math.min(leftArray[i], rightArray[i]);
            int waterRetainOnBlock = min - numArray[i];
            totalWaterRetail += waterRetainOnBlock;

        }

        for (int i = 0; i < length; i++) {
            System.out.println(rightArray[i]+", ");
        }

        System.out.println("Total Water Retail :" + totalWaterRetail);

    }
}
