package practice.java.dsa;


import java.util.HashMap;


public class FindSubArrayIsEqualToSum {

    public static void main(String[] args) {
        int sum = 6;
        int[] arr = {1, 2, 3, 2, 4};
        HashMap<Integer, Integer> hashMap = new HashMap();

        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum - sum == 0) {
                System.out.println(0 + " " + i);
            }

            if (hashMap.containsKey(currentSum - sum)) {

                System.out.println(hashMap.get(currentSum - sum) +1 + " -" + i);
            }
            hashMap.put(currentSum, i);
        }

    }
}
