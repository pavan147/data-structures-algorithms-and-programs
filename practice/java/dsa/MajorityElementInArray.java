package practice.java.dsa;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * Given an array arr. Find the majority element in the array. If no majority exists, return -1.
 * <p>
 * A majority element in an array of size n is an element that appears strictly more than n/2 times in the array.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [3, 1, 3, 3, 2]
 * Output: 3
 * Explanation: Since, 3 is present more than n/2 times, so it is the majority element.
 * Input: arr[] = [7]
 * Output: 7
 * Explanation: Since, 7 is single element and present more than n/2 times, so it is the majority element.
 * Input: arr[] = [2, 13]
 * Output: -1
 * Explanation: Since, no element is present more than n/2 times, so there is no majority element.
 */
public class MajorityElementInArray {

    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 3, 2};
        System.out.println(majorityElement(arr, 0));
    }

     static int majorityElement(int a[], int size) {
         Integer throsholdSize = a.length /2;
          Integer integer = Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                  .entrySet()
                  .stream().filter(integerLongEntry -> integerLongEntry.getValue() >= throsholdSize)
                  .map(integerLongEntry -> integerLongEntry.getKey())
                  .findFirst().orElse(-1);

          return integer;
    }

}
