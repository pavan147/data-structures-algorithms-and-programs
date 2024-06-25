package practice.dsa.binarysearch;

/**
 * Find peak element from mountain array or max element from array
 * [0,1,0] o/p : 1
 * [1,2,3,4,5,6,7,6,4,3,1] o/p : 7
 */
public class FindPeakNumberFromMountainArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 6, 4, 3, 1};

        int index = findMaxElement(arr);

        System.out.println("Index :" + index + " " + arr[index]);
    }

    static int findMaxElement(int arr[]) {
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
}
