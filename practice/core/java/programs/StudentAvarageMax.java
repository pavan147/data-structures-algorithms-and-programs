package practice.core.java.programs;

public class StudentAvarageMax {
    public static void main(String[] args) {
        String[][] file = {{"Shrikanth", "20", "30", "10"},
                {"Ram", "100", "50", "10"} ,{"Namdev", "100", "100", "100"}};
        String name = "";
        Integer maxMark = 0;
        for (int col = 0; col < file.length; col++) {

            Integer avgMark = (Integer.parseInt(file[col][1]) + Integer.parseInt(file[col][2]) + Integer.parseInt(file[col][3])) / 3;

            if (maxMark < avgMark) {
                maxMark = avgMark;
                name = file[col][0];
            }
        }

        System.out.println(name + "  " + maxMark);
    }
}
