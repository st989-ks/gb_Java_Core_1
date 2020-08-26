package task;

/**
 * Класс с выполненными заданиями,
 * создан для первого урока "Java Core. Базовый уровень".
 *
 * @version   1.0 20.08.2020
 * @author    Станислав Ленчицкий
 */
public class ForLessonOne {
    public static void main(String[] args) {
        System.out.println("Проект создан.");

        /*Задание №2*/
        System.out.println("Задание №2");
        variableTypesPrint();
        System.out.println("\n");

        /*Задание №3*/
        System.out.println("Задание №3");
        System.out.println(expression(5, 6, 25, 2));
        System.out.println("\n");

        /*Задание №4*/
        System.out.println("Задание №4");
        System.out.println(rangeBool(3, 9));
        System.out.println("\n");

        /*Задание №5*/
        System.out.println("Задание №5");
        posOrNegPrint(0);
        System.out.println("\n");

        /*Задание №6*/
        System.out.println("Задание №6");
        System.out.println(negBool(-5));
        System.out.println("\n");

        /*Задание №7*/
        System.out.println("Задание №7");
        helloPrint("Stas");
        System.out.println("\n");

        /*Задание №8*/
        System.out.println("Задание №8");
        leapYearPrint(2048);
        System.out.println("\n");
    }

    static void variableTypesPrint() {
        byte a = 100;                       /*от -128 до 127*/
        short b = 10000;                    /*от -32768 до 32767*/
        int c = 100000000;                  /*от -2147483648 до 2147483647*/
        long d = 100000000000000000L;       /*от -9223372036854775808
                                              до 9223372036854775807*/
        float e = 14.658f;                  /*число с плавающей запятой*/
        double f = 146.5869;                /*число с плавающей запятой двойной точности*/
        char g = 66;                        /*Unicode*/
        boolean k = false;                  /*логический тип данных*/
        System.out.printf("%d\n%d\n%d\n%d\n%f\n%f\n%s\n%s\n",
                a, b, c, d, e, f, g, k);

    }

    static double expression(double a, double b, double c, double d) {

        return (a * (b + (c / d)));
    }

    static boolean rangeBool(int a, int b) {

        /*Метод проверяет что сумма лежит
         *в пределах от 10 до 20(включительно)
         */
        int c = (a + b);
        return (10 <= c && c <= 20);
    }

    static void posOrNegPrint(int a) {

        if (a >= 0) {
            System.out.println("Число положительное.");
        } else {
            System.out.println("Число отрицательное.");
        }
    }

    static boolean negBool(int a) {

        return (a < 0);
    }

    static void helloPrint(String name) {

        System.out.println("«Привет, " + name + "!»");
    }

    static void leapYearPrint(int year) {

        boolean a = (year % 400 == 0) ||
                ((year % 4 == 0) && (year % 100 != 0));
        if (a) {
            System.out.println("Год високосный.");
        } else {
            System.out.println("Год не високосный.");
        }

    }
}
