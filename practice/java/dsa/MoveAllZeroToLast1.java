package practice.java.dsa;

import java.util.ArrayList;

/*
write a code to shift 0’s in an array of integers to the end of the array:       input - 1,4,6,0,2,0,8
output- 1,4,6,2,8,0,0
 */
public class MoveAllZeroToLast1 {
    public static void main(String[] args) {

        int[] array = {1, 4, 6, 0, 2, 0, 8};
        ArrayList<Integer> zeroIndexList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            //get all 0 value index
            if (array[i] == 0) {
                zeroIndexList.add(i);
            }
        }
        int incrementList = 0;
        for (int i = array.length - zeroIndexList.size(); i < array.length; i++) {
            //if value is not zero
            if (array[i] != 0) {
                // replace all non zero element with zero
                //here we are shifting non-zero value to zero that we calculate in list zeroIndexList
                int temp = array[i];
                array[i] = array[zeroIndexList.get(incrementList)];
                array[zeroIndexList.get(incrementList)] = temp;

                incrementList++;
            }


        }
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + ", ");
        }
    }
}
