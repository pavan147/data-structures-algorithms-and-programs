package practice.java.dsa;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 *
 *
 * Example 1:
 *
 * Input: x = 123
 * Output: 321
 * Example 2:
 *
 * Input: x = -123
 * Output: -321
 * Example 3:
 *
 * Input: x = 120
 * Output: 21
 *
 */
public class ReverseInteger {
    public static void main(String[] args) {
        int x = 12345;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        int reverse = 0;
        int digit = 0;

        while (x != 0) {
            digit = x % 10;
            x = x / 10;
            reverse = reverse * 10 + digit;
        }

      return reverse;
    }
}
