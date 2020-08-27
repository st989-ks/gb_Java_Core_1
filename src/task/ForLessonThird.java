package task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ForLessonThird {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        /*Задание №1*/
        System.out.println("Задание №1");
        guessTheNumber(9, 3);

        /*Задание №2*/
        System.out.println("Задание №2");
        guessTheWord();
    }

    /*Метод с игрой "угадай число" к заданию №1*/
    static void guessTheNumber(int end, int attempts) {

        System.out.print("Игра \"Угадай число\".\n");
        int a;

        do {

            System.out.printf("Введи число от 0 до %d.\n" +
                    "Количество попыток: %d.\n", end, attempts);
            int guess = random.nextInt(end + 1);
            checkGuess(guess, attempts);                                    // Запускаем саму игру
            System.out.print("Повторим?\nВведите \"0\" если нет, " +
                    "\"1\" если да\n");
            a = sc.nextInt();
        } while (a == 1);
        System.out.print("До встречи!\n");
    }

    /*Метод для игры "угадай число".
     *Запрашивает число у пользователя и запускает проверку
     * */
    static void checkGuess(int guess, int attempts) {

        for (int i = 0; i < attempts; i++) {

            int num = sc.nextInt();
            String check = checkNumber(guess, num);

            if (num != guess && i < attempts - 1) {

                System.out.printf("Не угадал! Попробуй еще раз.\n" +
                        "Загадай число %s.\n" +
                        "Количество попыток: %d.\n", check, (attempts - i - 1));
            } else if (num != guess) {

                System.out.printf("Не угадал! правильный ответ: %d.\n", guess);
            } else {

                System.out.print("Угадал! Возьми на полке пирожок =)\n");
                return;
            }
        }

    }

    /*Метод для игры "угадай число".
     *Сличение числа с эталонным.
     * */
    static String checkNumber(int guess, int num) {

        if (guess < num) {
            return "меньше";
        } else {
            return "больше";
        }
    }

    /*Метод с игрой "угадай слово" к заданию №2
     * */
    static void guessTheWord() {

        System.out.print("Игра \"Угадай слово\".\n");
        String word = theWord();                                               //вызываем рандомное слово
        String userWord = null;
        System.out.printf("Итак, слово загадано.\n" +
                "Попытайтесь угадать, первая буква \"%s\"\n", word.charAt(0));

        while (!word.equals(userWord)) {

            userWord = sc.next();
            if (!word.equals(userWord)) {
                System.out.printf("Неверно! " +
                        "Продолжайте угадывать.\n" +
                        "Подсказка: \"%s\"\n", comparisonWord(word, userWord));//вызываем метод для сравнения(выдает подсказку)
            }

        }
        System.out.print("Все верно.\nУдачи!\n");


    }

    /*Метод для игры "угадай слово".
     *Сличает слова и выдает подсказку
     * */
    static String comparisonWord(String word, String userWord) {

        char[] wordToArray = word.toCharArray();
        char[] userToArray = userWord.toCharArray();
        String[] answer = {"#", "#", "#", "#", "#",
                "#", "#", "#", "#", "#", "#", "#", "#", "#", "#",};
        String answer2 = "";
        int lengthA = Math.min(wordToArray.length, userToArray.length);

        for (int i = 0; i < lengthA; i++) {

            if (wordToArray[i] == Character.toLowerCase(userToArray[i])) {//на всякий случай переводим буквы в строчные
                answer[i] = Character.toString(wordToArray[i]);
            }
        }
        for (String s : answer) {                                         // Собираем слово из массива
            answer2 += s;
        }
        return answer2;
    }

    /*Метод для игры "угадай слово".
     *Выдает случайное слово
     * */
    static String theWord() {
        String[] words = {"apple", "orange", "lemon", "banana",
                "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple",
                "pumpkin", "potato"};

        return words[random.nextInt(words.length)];
    }
}
