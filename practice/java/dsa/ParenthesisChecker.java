package practice.java.dsa;

import java.util.HashMap;
import java.util.Stack;

/**
 * Given an expression string x. Examine whether the pairs and the orders of {,},(,),[,] are correct in exp.
 * For example, the function should return 'true' for exp = [()]{}{[()()]()} and 'false' for exp = [(]).
 * <p>
 * Note: The drive code prints "balanced" if function return true, otherwise it prints "not balanced".
 * <p>
 * Example 1:
 * <p>
 * Input:
 * {([])}
 * Output:
 * true
 * Explanation:
 * { ( [ ] ) }. Same colored brackets can form
 * balanced pairs, with 0 number of
 * unbalanced bracket.
 * Example 2:
 * <p>
 * Input:
 * ()
 * Output:
 * true
 * Explanation:
 * (). Same bracket can form balanced pairs,
 * and here only 1 type of bracket is
 * present and in balanced way.
 * Example 3:
 * <p>
 * Input:
 * ([]
 * Output:
 * false
 * Explanation:
 * ([]. Here square bracket is balanced but
 * the small bracket is not balanced and
 * Hence , the output will be unbalanced.
 */
public class ParenthesisChecker {

    public static void main(String[] args) {

        String parths = "{()}";
        System.out.println(ispar(parths));

        /**
         * Opening brackets added in stack and when we found closing bracket then removing from stack and
         * at last we need stack empty
         * empty mean balance else not balance.
         */

    }

    //Function to check if brackets are balanced or not.
    static boolean ispar(String x) {
        Stack<Character> stack = new Stack<>();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("}", "{");
        hashMap.put("]", "[");
        hashMap.put(")", "(");
        boolean flag = false;

        for (int i = 0; i < x.length(); i++) {
            //checking opening bracket is present found in ith position
            String openingBracketIthPosition = String.valueOf(x.charAt(i));

            if (hashMap.containsValue(openingBracketIthPosition)) {
                stack.push(x.charAt(i));
                //case 1:it comes in else mean ith position  is non-opening bracket
                //case 2 :
            } else if (!stack.isEmpty()) {
                //
                String closingBracket = String.valueOf(stack.pop());
                String openingBracket = hashMap.get(String.valueOf(x.charAt(i)));

                flag = openingBracket.equals(closingBracket);
                if (!flag) {
                    return false;
                }
            } else {
                return false;
            }

        }
        //sometime flag is true input =((   but stack have elements.
        return flag && stack.isEmpty();
    }
}
