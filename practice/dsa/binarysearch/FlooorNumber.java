package practice.dsa.binarysearch;

/**
 * Given a sorted array arr[] of size n without duplicates, and given a value x. Floor of x is defined as the largest element k in arr[] such that k is smaller than or equal to x. Find the index of k(0-based indexing).
 *
 * Examples
 *
 * Input: n = 7, x = 0 arr[] = {1,2,8,10,11,12,19}
 * Output: -1
 * Explanation: No element less than 0 is found. So output is "-1".
 * Input: n = 7, x = 5 arr[] = {1,2,8,10,11,12,19}
 * Output: 1
 * Explanation: Largest Number less than 5 is 2 (i.e k = 2), whose index is 1(0-based indexing).
 * Your Task:
 * The task is to complete the function findFloor() which returns an integer denoting the index value of K or return -1 if there isn't any such number.
 *
 * https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
 */
public class FlooorNumber {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 9, 11, 34, 55};
        int target = 10;
        int index = floorNumber(arr, target);
        System.out.println(index + "-->" + arr[index]);
    }

    /**
     *
     * @param arr
     * @param target
     * @return
     *
     * when it says floor in that case we have to return end because alt last
     *   end start   end ,will become less than start that violated the condition.
     *   mean our element is end.
     *
     *   in normal bineary search when our element found that time end mid and start look like
     *
     *   start---mid---end
     *   here mid is our answer.
     *
     *   similar suppose target is not found mean it is lies Start (target) end but that element is not present
     *   so next step will be
     *   end --- start and while loop break so our element is end.
     */
    public static int floorNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {

                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        //celling
        return end;
    }
}
