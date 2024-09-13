package practice.dsa.binarysearch;

public class BinarySearchInfiniteArray {
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 9, 11, 14, 16, 19, 21, 26, 27, 29, 30, 31, 32, 42, 54, 65, 87, 90,100,111,112,113,114,115,116,117,118,119,220,221};
        int target = 221;

        System.out.println(arr[findEndAndReturnAnswer(arr, target)]);
    }

    static int findEndAndReturnAnswer(int arr[], int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            // double the box value
            // end = previous end + sizeofbox*2
          end = end + (end - start +1) *2;
          start = newStart;

        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int arr[], int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
