package practice.java.dsa;

import java.util.ArrayList;
import java.util.Arrays;

/*
write a code to shift 0’s in an array of integers to the end of the array:       input - 1,4,6,0,2,0,8
output- 1,4,6,2,8,0,0
 */
public class MoveAllZeroToLast {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 0, 2, 0, 8};
        int[] tempArray = new int[array.length];
        int count = 0;
        //checking here how many non zero present
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                tempArray[count] = array[i];
                count++;
            }
        }
      // if we not assign value to arr[position] it will by default zero
        for (int i = 0; i < tempArray.length; i++) {

            System.out.print(tempArray[i] + ", ");
        }

    }
}
