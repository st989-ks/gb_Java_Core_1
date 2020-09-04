package task;

import java.util.Random;
import java.util.Scanner;

public class ForLessonFourth {
    static final int SIZE = 5;
    static final int DOT_TO_WIN = 4;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;
    static char[][] clone;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Вы победили! Поздравляем!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Компьютер победил.");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
        }

    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.printf("%c ", map[i][j]);
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("input X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));

        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int y, int x) {
        if (y < 0 || x < 0 || y >= SIZE || x >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static void aiTurn() {
        int x = -1;
        int y = -1;
        boolean win = false;

        for (int i = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE; j++) {

                if (isCellValid(i, j)) {
                    map[i][j] = DOT_X;
                    if (checkWin(DOT_X)) {
                        x = j;
                        y = i;
                        win = true;
                    }
                    map[i][j] = DOT_EMPTY;

                }
            }
        }
        if (!win) {

            do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            } while (!isCellValid(y, x));
        }

        map[y][x] = DOT_O;
    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
    /*Проверка с учетов смещения
     * */
    public static boolean checkWin(char dot) {

        for (int column = 0; column < SIZE - DOT_TO_WIN + 1; column++) {
            for (int row = 0; row < SIZE - DOT_TO_WIN + 1; row++) {
                if (checkD(dot, column, row) || checkCR(dot, column, row)) {
                    return true;
                }
            }
        }
        return false;

    }
    /*Проверка по диагоналям
    * */
    public static boolean checkD(char dot, int c, int r) {

        boolean leftD = true;
        boolean rightD = true;
        for (int i = 0; i < DOT_TO_WIN; i++) {

            leftD &= (map[i + c][i + r] == dot);
            rightD &= (map[DOT_TO_WIN - i - 1 + c][i + r] == dot);
        }

        return leftD || rightD;
    }
    /*Проверка по горизонтали и вертикали
     * */
    public static boolean checkCR(char dot, int c, int r) {

        boolean column;
        boolean row;
        for (int i = c; i < DOT_TO_WIN + c; i++) {
            column = true;
            row = true;

            for (int j = r; j < DOT_TO_WIN + r; j++) {

                column &= (map[i][j] == dot);
                row &= (map[j][i] == dot);
            }

            if (column || row) {

                return true;
            }
        }

        return false;
    }
}
