package practice.dsa.sort;

import java.util.Arrays;

public class BabbleSort {

    public static void main(String[] args) {

        // int[] arr = {4, 7, 1, 6, 9, 3};
        int[] arr = {1, 2, 3, 4, 5, 6};

        boolean isAllElementAreSorted = true;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isAllElementAreSorted = false;
                }
            }
            //IF all element are sorted then there is no swaping so we break the loop
            if (isAllElementAreSorted) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
