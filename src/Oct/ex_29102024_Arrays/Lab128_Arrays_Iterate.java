package Oct.ex_29102024_Arrays;

import java.util.Arrays;

public class Lab128_Arrays_Iterate {
    public static void main(String[] args) {
        int[] marks = {51, 25, 65, 46, 90};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println(" - - - - - ");

        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
        Arrays.sort(marks);
        int item_index = Arrays.binarySearch(marks, 90);
        System.out.println(item_index);
    }

}
