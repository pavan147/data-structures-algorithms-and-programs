package practice.dsa.sort;

import java.util.Arrays;

/**
 * Given Array continus and we know the range 1 to N
 * then check index + 1 is equal to value is equal
 * if equal then increment
 * else swap
 */
public class CyclicSort {
    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 1, 2};
        int n = 5; //Given
        int index = 1;

        while (index != n) {

            if (index != arr[index - 1]) {

                int temp = arr[index - 1];
                arr[index - 1] = arr[temp - 1];
                arr[temp - 1] = temp;
            } else {
                index++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
