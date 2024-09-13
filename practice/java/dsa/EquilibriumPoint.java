package practice.java.dsa;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class EquilibriumPoint {

    public static void main(String[] args) {
        long[] arr = {1 ,2 ,0, 3};       //3
        //1
        System.out.println(equilibriumPoint(arr));
    }

    public static int equilibriumPoint(long arr[]) {

        for (int i = 0; i < arr.length; i++) {
            long leftSum = 0;
            long rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) {
                return i +1;
                // break;
            }

        }
        return -1;
    }
}
