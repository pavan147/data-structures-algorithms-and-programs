package practice.core.java.programs;

/**
 *  I have an array.  Find the next greatest element for each element in a given array.
 *
 *    {15, 10, 16, 20, 8, 9, 7, 50}
 *
 *    OutPut:
 *
 *    15 -16
 *    10 -16
 *    16-20
 *    20-50
 *    8-9
 *    9-50
 *    7-50
 *    50 - Max Integer
 */
public class NextMaxNumberInArray {
    public static void main(String[] args) {
        int[] array = {15, 10, 16, 20, 8, 9, 7, 50};

        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            for (int j = i; j < array.length; j++) {

                if (array[j] > number) {
                    System.out.println(number + " " + array[j]);
                    break;
                }

            }
        }

    }
}
