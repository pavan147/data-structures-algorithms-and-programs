package practice.java.dsa;

import java.util.HashSet;

/*
 Find pair whose sum is 10 in 1,3,5,6,7,8,9.2?
 */
public class SumOfElementIs10 {
    public static void main(String[] args) {
        int[] array = {1,3,5,6,7,8,9,2};
        HashSet hashSet = new HashSet();
        for(Integer integer : array){
            int difference = 10 - integer;

            if(hashSet.contains(difference)){
                int sum = integer+difference;
                System.out.println("Pair "+integer +" "+difference+" ="+sum);
            }
            hashSet.add(integer);
        }
    }
}
