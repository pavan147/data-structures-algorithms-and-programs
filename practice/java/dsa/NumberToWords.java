package practice.java.dsa;

public class NumberToWords {


    private static final String[] belowTwenty = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"
    };

    private static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static void main(String[] args) {
        int number = 99;
        System.out.println(convert(number));
    }

    private static String convert(int num) {
        if (num < 20) {
            return belowTwenty[num];
        } else if (num < 100) {
            return tens[num / 10] + (num % 10 > 0 ? " " + convert(num % 10) : "");
        }
        return "";
    }
}
