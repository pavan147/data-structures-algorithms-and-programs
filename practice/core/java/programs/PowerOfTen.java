package practice.core.java.programs;

/**
 * In Multiple of 10
 */
public class PowerOfTen {

    public static boolean isPowerOfTen(int n) {
        if (n <= 0) {
            return false;
        }


        while (n % 10 == 0) {
            n /= 10;
        }
        return n == 1;
    }

    public static void main(String[] args) {

        System.out.println(PowerOfTen.isPowerOfTen(10));
        System.out.println(PowerOfTen.isPowerOfTen(100));
        System.out.println(PowerOfTen.isPowerOfTen(1000));
        System.out.println(PowerOfTen.isPowerOfTen(9));
        System.out.println(PowerOfTen.isPowerOfTen(45));
        System.out.println(PowerOfTen.isPowerOfTen(0));
        System.out.println(PowerOfTen.isPowerOfTen(-1));
    }
}