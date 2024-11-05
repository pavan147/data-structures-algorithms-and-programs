package practice.java.dsa;

import java.util.HashSet;

/**
 * SECOND PROGRAM FindDuplicateElementInArray1
 */
public class FindDuplicateElementInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 9, 6, 7, 8, 9, 2}; // Example array
        int start = 0;
        int end = arr.length - 1;
        HashSet<Integer> hashSet = new HashSet<>();

        while (start <= end) {
            // Check element at 'start' index
            if (!hashSet.add(arr[start])) {
                System.out.println("Duplicate Element " + arr[start]);
            }

            // Check element at 'end' index, but avoid double checking if start == end
            if (start != end && !hashSet.add(arr[end])) {
                System.out.println("Duplicate Element " + arr[end]);
            }

            // Move pointers inward
            start++;
            end--;
        }
    }

}
