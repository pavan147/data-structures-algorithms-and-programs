package practice.java.dsa;

import java.util.HashMap;

/**
 * Find the pair of array elements which sum are equals to target.
 * Note: same element should not be added
 * input = {5, 2, 11, 2, -1, 3};
 * target = 10;
 * expected output = [11,-1]
 */
public class SumOfNumberEqualToTarget {

    public static void main(String[] args) {
        int[] arr = {5, 2, 11, 2, -1, 3 , 4};
        int target = 10;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (Integer num : arr){
            int sum =   target - num;

            if(hashMap.containsKey(sum)){

                System.out.println("addition :"+  sum +" " + num);
            }
            hashMap.put(num,num);
        }

    }
}
