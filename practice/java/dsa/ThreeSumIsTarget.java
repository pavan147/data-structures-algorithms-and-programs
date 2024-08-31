package practice.java.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Addition of there combination is equal to target
 */
public class ThreeSumIsTarget {

    public static void main(String[] args) {
        //we need sorted array in this case
        int[] arr = {0,1, 2, 2,2,3, 4, 5, 6};
        int target = 6;
        List<List<Integer>> listList = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right --;
                } else {
                    listList.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    right --;
                    left++;
                }
            }

        }
        System.out.println(listList);
    }
}
