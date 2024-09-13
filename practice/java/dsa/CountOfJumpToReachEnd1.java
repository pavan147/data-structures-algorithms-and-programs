package practice.java.dsa;

/**
 * https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
 */
public class CountOfJumpToReachEnd1 {
    public static void main(String[] args) {
       int arr[] = {2, 1 ,0 ,3, 5 ,1 ,2};
        System.out.println(minJumps(arr));
    }

    static int minJumps(int[] arr) {
        int jumpTo = 0;
        int countJump = 0;
        int end = 0;
        if(arr[0] == 0){
            return -1;
        }
        for(int i = 0; i < arr.length -1; i++) {

            jumpTo = Math.max(jumpTo ,arr[i] + i);
              if(jumpTo <= i){
                  return -1;
              }
            if(i == end){
                countJump ++;
                end = jumpTo;

                if(end >= arr.length -1){
                    break;
                }
            }
        }
        if(jumpTo < arr.length -1){
            return -1;
        }
        return countJump ;
    }
}
