package task.ForLessonSeven;

import task.ForLessonSixth.animals.Dog;

public class Main {
    public static void main(String[] args) {

        Cat[] cat = {new Cat("Bars", 10),
                new Cat("Mursic", 15),
                new Cat("Кузя", 70),
                new Cat("Тузик", 9),
        };
        Plate plate = new Plate(100);

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
        }

        plate.infoFood();

        System.out.println();

        for (int i = 0; i < cat.length; i++) {
            cat[i].isSaturation();
        }




    }
}
