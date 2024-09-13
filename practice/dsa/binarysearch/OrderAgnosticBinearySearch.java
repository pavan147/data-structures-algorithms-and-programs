package practice.dsa.binarysearch;

/**
 * if you don't know the order of array then you can find element by this method.
 * Given a sorted array arr and an integer k, find the position(0-based indexing) at which k is present in the array using binary search.
 *
 * Examples:
 *
 * Input: k = 4, arr= [1, 2, 3, 4, 5]
 * Output: 3
 * Explanation: 4 appears at index 3.
 * Input: k = 445, arr= [11, 22, 33, 44, 55]
 * Output: -1
 * Explanation: 445 is not present.
 * Expected Time Complexity: O(logn)
 * Expected Space Complexity: O(logn)
 * https://www.geeksforgeeks.org/problems/binary-search-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
 */
public class OrderAgnosticBinearySearch {

    public static void main(String[] args) {
     int arr[] = {1, 28 ,36 ,44 ,48, 64, 78, 78};
     int target = 1;

        System.out.println(orderAgnosticBinearySearch(arr, target));
    }

    public static int orderAgnosticBinearySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {

                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                //5,4,3,2,1
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }


        return -1;
    }
}
