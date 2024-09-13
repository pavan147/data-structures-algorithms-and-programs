package practice.java.dsa;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1
 */
public class DuplicateElementFromArray {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,3};
        System.out.println(duplicates(arr));
    }

    public static ArrayList<Integer> duplicates(int[] arr) {
        TreeMap<Integer, Integer> hashMap = new TreeMap<>();
         ArrayList<Integer> integers = new ArrayList<>();
        for (Integer num : arr) {
            if (hashMap.containsKey(num)) {

                hashMap.put(num, hashMap.get(num) + 1);
            } else {
                hashMap.put(num, 1);
            }
        }

        for (Map.Entry entry : hashMap.entrySet()){
            if((Integer) entry.getValue() > 1 ){
                integers.add((Integer) entry.getKey());
            }
        }
        if(integers.size() == 0){
            integers.add(-1);
        }
        return integers;
    }
}
