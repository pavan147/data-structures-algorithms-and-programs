package practice.dsa.binarysearch;

public class FirstAndLastOccuranceOfNumber {

    public static void main(String[] args) {
        int []arr = {4,5,5,5,6,7,8,9,9,9,10};
        int target = 5; //output : 1 3
        int []ans = {-1,-1};
        ans[0] = searchIndex(arr,target,true);
        ans[1] = searchIndex(arr,target,false);

        System.out.println(ans[0]+"  "+ans[1]);
    }

    public static int searchIndex(int[] arr, int target, boolean calculateFirstOccurance) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {

                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;

                if (calculateFirstOccurance) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
