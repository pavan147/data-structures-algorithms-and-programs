package practice.dsa.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 9, 11, 34, 55};
        int target = 11;
        int index = binarySearch(arr, target);
        System.out.println(index + " " + arr[index]);
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
