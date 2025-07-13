package practice.java.dsa;

import java.util.Arrays;
import java.util.concurrent.Executors;

/**
 * Given a numeric array, re-arrange the elements to form the highest possible value.
 * input is: int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};
 * output should be: 998764543431
 */
public class RearrangeArrayWithHighestPossiableValue {

    public static void main(String[] args) {
        int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};
        String strNum = "";
        for (int num : arr) {
            strNum = strNum + String.valueOf(num);
        }
        int digitArray[] = new int[strNum.length()];

        char str[] = strNum.toCharArray();

        for (int i = 0; i < str.length; i++) {
            digitArray[i] = Character.getNumericValue(str[i]);
        }


        for (int i = 0; i < digitArray.length; i++) {
            for (int j = 1; j < digitArray.length; j++) {


                if (digitArray[j] > digitArray[j - 1]) {
                    int temp = digitArray[j];
                    digitArray[j] = digitArray[j - 1];
                    digitArray[j - 1] = temp;
                }
            }
        }

        StringBuffer stringBuffer = new StringBuffer();
        for (int num : digitArray) {
            stringBuffer.append(num);
        }
        Executors.newSingleThreadExecutor();
        System.out.println(stringBuffer);
    }
}
