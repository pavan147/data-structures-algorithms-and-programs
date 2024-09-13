package practice.java.dsa;

import java.math.BigInteger;

/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 * <p>
 * Increment the large integer by one and return the resulting array of digits.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * Example 2:
 * <p>
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 * Example 3:
 * <p>
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 */
public class PlusOne1 {

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] newArr = plusOne(arr);

        for (Integer integer : newArr) {
            System.out.print(integer + ", ");
        }
    }

    public static int[] plusOne(int[] digits) {
        StringBuilder numberString = new StringBuilder();
        for (Integer integer : digits) {
            numberString.append(integer);
        }
        System.out.println(numberString);
        BigInteger bigInteger = new BigInteger(numberString.toString());
        bigInteger = bigInteger.add(BigInteger.valueOf(1));

        numberString = new StringBuilder(bigInteger.toString());
        int[] newDigits = new int[numberString.length()];
        for (int i = 0; i < newDigits.length; i++) {
            newDigits[i] = Character.getNumericValue(numberString.charAt(i));
        }
        return newDigits;
    }
}
