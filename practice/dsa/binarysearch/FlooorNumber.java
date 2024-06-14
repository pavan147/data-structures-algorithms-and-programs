package practice.dsa.binarysearch;

public class FlooorNumber {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 9, 11, 34, 55};
        int target = 10;
        int index = floorNumber(arr, target);
        System.out.println(index + "-->" + arr[index]);
    }

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
