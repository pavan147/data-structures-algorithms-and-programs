package practice.java.dsa;

import java.util.Arrays;

public class ShiftAll_X_toLast {
    public static void main(String[] args) {
       // int[] arr = {1, 0, 2, 0, 4, 3};
        int[] arr = {0, 0, 0, 1, 0, 0};
        int length = arr.length - 1;
        int shiftNumber = 0;
        for (int i = 0; i < length; i++) {
              // if we found 0
            if (arr[i] == shiftNumber) {
                int temp = arr[i];

                while (length > i) {
                    //if 0  is not equal to arr[length]
                    //then swap
                    if (shiftNumber != arr[length] ) {
                        arr[i] = arr[length];
                        arr[length] = temp;
                        System.out.println(Arrays.toString(arr));
                        break;
                    } else {
                        //else check length -1 index
                        length--;
                    }
                }
            }


        }

        System.out.println(Arrays.toString(arr));
    }


}

