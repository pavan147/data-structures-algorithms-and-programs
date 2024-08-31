package practice.java.dsa;

import java.util.*;

public class FourSumIsTarget {
    public static void main(String[] args) {
        //we need sorted array in this case
        int[] arr = {1, 1, 2, 3,};
        int target = 7;
        List<List<Integer>> listList = new ArrayList<>();
        HashSet<String> hashSet = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int left = i + 1;
                int right = arr.length - 1;
                while (left < right) {

                    int sum = arr[i] + arr[left] + arr[right] + arr[j];

                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        List list = Arrays.asList(arr[i], arr[j], arr[left], arr[right]);
                        Collections.sort(list);
                        String unique = "" + list.get(0) + list.get(1) + list.get(2) + list.get(3);

                        if (!hashSet.contains(unique)) {

                            listList.add(list);
                        }
                        hashSet.add(unique);
                        right--;
                        left++;
                    }
                }

            }

        }
        System.out.println(listList);
    }
}
