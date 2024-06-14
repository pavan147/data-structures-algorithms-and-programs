package practice.dsa.binarysearch;

public class NextGretestChar {

    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        char target = 'd'; //output e 
        char nextGretest = nextGretestChar(charArray, target);

        System.out.println(nextGretest);
    }

    public static char nextGretestChar(char[] charArray, char target) {
        int start = 0;
        int end = charArray.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > charArray[mid]) {

                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (target == charArray[start]) {
            return charArray[start + 1];
        }
        //celling
        return charArray[start];
    }
}
