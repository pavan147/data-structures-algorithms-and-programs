package practice.dsa.binarysearch;

/**
 * int arr[] = {1, 2, 3, 4, 5, 3, 2, 1};
 *         int target = 3;
 *         o/p : index 2
 */
public class SearchElementInFirstHalfOfMountainArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 3, 2, 1};
        int target = 3; //o/p : index 2

        int maxElementIndex = searchMaxElement(arr);
        int index = binarySearch(arr, maxElementIndex, target);
        System.out.println(index);
    }


    static int searchMaxElement(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static int binarySearch(int arr[], int end, int target) {
        int start = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                end = mid + 1;
            } else if (target < arr[mid]) {
                start = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
