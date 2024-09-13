package practice.java.dsa;

/*
https://www.geeksforgeeks.org/problems/second-largest3735/1
Given an array arr, return the second largest distinct element from an array. If the second largest element doesn't exist then return -1.

Examples:

Input: arr = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
Input: arr = [10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist so answer is -1.
 */
public class SecondLargestElement {
    public static void main(String[] args) {
        int [] arr = {10,5,10};
        System.out.println(print2largest(arr));
    }

    public static int print2largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (Integer num : arr){

            if(max < num){
                secondMax =max;
                max = num;
            }else if(num != max && secondMax < num){
                secondMax = num;
            }
        }
       return secondMax;
    }
}
