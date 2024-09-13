package practice.java.dsa;

public class PrimeNumberIn {

    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrimeNumber(int num) {

        // Corner case
        if (num <= 1) {
            return false;
        }


        for (int i = 2; i < num/2; i++) {

            if (num % i == 0) {
                return false;
            }

        }

        return true;
    }
}
