package practice.java.dsa;

import java.util.HashSet;

public class FindDuplicateElementInArray1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 9, 6, 7, 8, 9, 2}; // Example array
        int start = 0;
        int end = arr.length - 1;


        while (start != end) {

            int number = arr[start];

            for (int i = start + 1; i <= end; i++) {
                if (number == arr[i]) {
                    System.out.println(number);
                }
            }
            // Move pointers inward
            start++;
            //  end--;
        }
    }
}
