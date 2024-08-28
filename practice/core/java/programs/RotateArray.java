package practice.core.java.programs;

/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
public class RotateArray {
    public static void main(String[] args) {
        int rotate = 100;
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] rotateArray = new int[array.length];
        int arrayPositionAfterRotate = rotate % array.length;
        int count = 0;
        for (int i = arrayPositionAfterRotate; i < array.length; i++) {
            rotateArray[i] = array[count];
            count++;
        }
        for (int i = 0; i <= arrayPositionAfterRotate - 1; i++) {
            rotateArray[i] = array[count];
            count++;
        }

        for (Integer integer : rotateArray) {
            System.out.print(integer + ", ");
        }
    }
}
