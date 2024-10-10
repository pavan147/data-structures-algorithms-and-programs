package practice.java.dsa;

/**
 * Given integer number as input to the function should return the string equivalent to it.
 * <p>
 * for example if Input : 52 then Output = "Fifty Two".
 */
public class NumberToWordString {

    // Arrays for word equivalents of numbers
    private static final String[] belowTwenty = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };


    private static final String[] thousands = {
            "", "Thousand", "Million", "Billion"
    };

    public static String converter(Integer number) {

        if (number == 0) {
            return "Zero";
        } else if (number > 0 && number < 20) {
            return belowTwenty[number];
        } else if (number >= 20 && number < 100) {

            Integer tenthPlaceInteger = number / 10;
            String tenthPlaceString = tens[tenthPlaceInteger]; //tenth place string
            Integer onethPlaceInteger = number % 10 == 0 ? 0 : number % 10;
            String oneThPlaceString = belowTwenty[onethPlaceInteger];
            return tenthPlaceString + " " + oneThPlaceString;
        } else if (number >= 100 && number < 1000) {
            Integer hundredPlaceInt = number / 100;
            String hundredPlaceStr = belowTwenty[hundredPlaceInt] + " Hundred ";
            String tenthPlaceStr = number % 100 == 0 ? "" : converter(number % 100);
            return hundredPlaceStr + tenthPlaceStr;
        } else if (number >= 1000 && number < 10000) {
            Integer thousadPlaceInt = number / 1000;
            String thousadPlaceStr = belowTwenty[thousadPlaceInt] + " Thousand";
            String hundredPlaceStr = number % 1000 == 0 ? "" : converter(number % 1000);
            return thousadPlaceStr + " " + hundredPlaceStr;
        }
        return "";
    }

    public static void main(String[] args) {
        String converter = converter(5555);
        System.out.println(converter);
    }
}
