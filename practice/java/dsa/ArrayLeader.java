package practice.java.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
 */
public class ArrayLeader {
    public static void main(String[] args) {
        int[] arr = {30, 10, 10, 5};

        System.out.println(leaders(0, arr));
    }

    static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(arr[arr.length - 1]);
        int leader = arr[arr.length -1];
        for (int i = arr.length - 2; i >= 0; i --) {

            if (leader <= arr[i]) {
                leader = arr[i];
                integers.add(arr[i]);
            }
        }

        Collections.reverse(integers);
        return integers;
    }


}
