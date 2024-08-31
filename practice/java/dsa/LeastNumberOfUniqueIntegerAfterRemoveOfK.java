package practice.java.dsa;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
explain me this problem : Given an array of integers arr and an integer k. Find the least number of unique integers after removing exactly k elements.
Example 1:
Input: arr = [5,5,4], k = 1
Output: 1
Explanation: Remove the single 4, only 5 is left.
Example 2:
Input: arr = [4,3,1,1,3,3,2], k = 3
Output: 2
Explanation: Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left.
 */
public class LeastNumberOfUniqueIntegerAfterRemoveOfK {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {4,3,1,1,3,3,2};
        System.out.println(findLeastNumOfUniqueInts(arr, k));
    }

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (Integer integer : arr) {
            hashMap.merge(integer, 1, (oldValue, newVAlue) -> oldValue + 1);
        }
      List<Integer> frequency = new ArrayList<>(hashMap.values());
        Collections.sort(frequency);
       int countOfUnique = frequency.size();

        for (Integer fre : frequency){
            if( k > fre){
                k -= fre;
                countOfUnique --;
            }
        }
        return countOfUnique ;
    }
}
