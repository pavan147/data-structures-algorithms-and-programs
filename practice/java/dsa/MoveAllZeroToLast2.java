package practice.java.dsa;

public class MoveAllZeroToLast2 {

    public static void main(String[] args) {
        int[] array = {1,2,0,3,4,0,5,6,7,};
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
                //all element is shifted then last element is also shifted
                //ex. 1,2,0,3,4,0,5,6,7    at index we found 0 we keep this number in temp
                //then we will shift all element to front so arry will become
                //after shift : [1, 2, 3, 4, 0, 5, 6, 7, 7]
                //then last index replace with 0;
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
