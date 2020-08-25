package task;

import java.util.Arrays;

public class ForLessonTwo {
    public static void main(String[] args) {

        /*Задание №1*/
        System.out.println("Задание №1");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(changeZerUn(arr)));

        /*Задание №2*/
        System.out.println("\nЗадание №2");
        System.out.println(Arrays.toString(createArr(8)));

        /*Задание №3*/
        System.out.println("\nЗадание №3");
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(multiplyArr(arr2)));

        /*Задание №4*/
        System.out.println("\nЗадание №4");
        cross(10);

        /*Задание №5*/
        System.out.println("\nЗадание №5");
        minMax(arr2);

        /*Задание №6*/
        System.out.println("\nЗадание №6");
        System.out.println(equivArr(arr));
        System.out.println(equivArr(arr2));
        int[] array = {44, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(equivArr(array));

        /*Задание №7*/
        System.out.println("\nЗадание №7");
        printOffset(array, 44);
//        printOffset(arr, 2);


    }

    public static int[] changeZerUn(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i] == 1 ? 0 : 1;
        }
        return arr;
    }

    public static int[] createArr(int num) {

        int[] arr = new int[num];
        arr[0] = 0;

        for (int i = 1; i < num; i++) {

            arr[i] = arr[i - 1] + 3;
        }
        return arr;
    }

    public static int[] multiplyArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= 6) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }

    static void cross(int a) {

        String[][] arr = new String[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr[i][j] = i == j || (i + j + 1) == a ? "%" : " ";
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

    }

    static void minMax(int[] arr) {
        int min = arr[0];
        int max = arr[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {

            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.printf("В предоставленном массиве: \n" +
                "минимальное число = %d\n" +
                "максимальное число = %d\n", min, max);
    }

    /*Решение для задачи №6
     * */
    static boolean equivArr(int[] arr) {

        int sumOne = arr[0] + arr[1];                   //сумма первых двух элементов массива
        int sumSecond = sumArr(arr) - sumOne;           //сумма остальной части массива (вызов функции суммирования)
        boolean equivArr = false;
        for (int i = 2; i < arr.length - 1; i++) {
            equivArr = sumOne == sumSecond;
            if (equivArr == false) {                    //если суммы не равны
                sumOne = sumOne + arr[i];               //1. мы прибавляем следующий элемент к первому значению
                sumSecond = sumSecond - arr[i];         //2. мы отнимаем следующий элемент из второго значения
            }
        }
        return equivArr;
    }

    /*Метод для суммирования элеменнов массива
     * */
    static int sumArr(int[] arr) {

        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
        }
        return sum;
    }

    /*Решение для задачи №7
     * */
    static void printOffset(int[] arr, int offset) {

        System.out.println(Arrays.toString(arr));
        offset = offset % arr.length;

        if (offset < 0) {                                       // конвертируем n в обратную сторону
            offset = (arr.length + offset);
        }

        for (int j = 0; j < offset; j++) {                      // запуск цикла по n
            int num1 = arr[arr.length - 1];                     // сохраняем последнее число массива
            for (int i = 0; i < arr.length; i++) {              // запуск цикла для перемещения на 1 позицию
                if (arr.length - 1 - i > 0) {
                    arr[arr.length - 1 - i] = arr[arr.length - 2 - i];
                } else {
                    arr[0] = num1;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
