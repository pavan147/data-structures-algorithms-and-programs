package practice.java.dsa;

public class MoveAllZeroToLast2 {

    public static void main(String[] args) {
        int[] array = {1,2,0,3,4,0,5,6,0,7,0};
        int lastIndexOfZero = array.length - 1;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {
                int temp = array[i];
                 boolean isNumberShifted = false;
                 //we are shifting all number to front..which is non zero
                for (int j = i; j < lastIndexOfZero; j++) {

                    array[j] = array[j + 1];
                    isNumberShifted = true;
                }
               if(isNumberShifted){
                   array[lastIndexOfZero] = temp;
                   lastIndexOfZero--;
               }


            }
        }

        for (Integer integer : array) {
            System.out.print(integer + ", ");
        }
    }
}
