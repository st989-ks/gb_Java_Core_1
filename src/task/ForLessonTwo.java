package task;

import java.util.Arrays;

public class ForLessonTwo {
    public static void main(String[] args) {

        /*Задание №1*/
        System.out.println("Задание №1");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(changeZerUn(arr)));
    }

    public static int[] changeZerUn(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

           arr[i] = arr[i] == 1 ? 0 : 1;
        }
        return arr;
    }

}
