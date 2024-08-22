package practice.core.java.programs;

/**
 * Write a program or function that takes two integers as input, performs the division, and returns the result as a string. If the result has repeating decimals, enclose the repeating part within brackets in the string representation.
 * input -  1 , 3
 * 1/3 = 0.33333 => 0.(3)
 * 1 / 2= 0.5
 * 1/0=-1
 */
public class IncloseRepatitaveCharInString {
    public static void main(String[] args) {
        divede(1d, 3d);
    }

    public static String divede(Double a, Double b) {
        Double dividend = a / b;
        String[] devidentString = dividend.toString().split("\\.");
        String afterDecimal = devidentString[1];

        String firstCharStr = String.valueOf(afterDecimal.charAt(0));
        Boolean isAllCharIsRepatative = afterDecimal.chars().mapToObj(value -> (char) value).allMatch(character -> character.equals(afterDecimal.charAt(0)));
        if (isAllCharIsRepatative) {
            System.out.println(devidentString[0] + ".(" + firstCharStr + ")");
        } else {
            System.out.println(dividend);
        }


        return null;
    }
}
