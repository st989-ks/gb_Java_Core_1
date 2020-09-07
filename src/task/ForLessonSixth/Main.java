package task.ForLessonSixth;

import task.ForLessonSixth.animals.*;

import static task.ForLessonSixth.animals.Animal.*;

public class Main{
    public static void main(String[] args) {

        Animal dog = new Dog("Бобик");
        Animal dog2 = new Dog("Бобик2");
        Animal dog3 = new Dog("Бобик3");
        Animal dog4 = new Dog("Бобик4");
        Animal cat = new Cat("Мурзик");
        Animal cat2 = new Cat("Мурзик2");
        Animal[] animals = {new Dog("Кузя"),
                            new Cat ("Тузик"),
                            };

        cat.run(220);
        dog.run(490);
        cat.swim(200);
        dog.swim(9);
        count();


    }
    public static void count() {

        System.out.printf("Всего животных - %d.\n", count);
        System.out.printf("Всего котов - %d.\n", countCat);
        System.out.printf("Всего собак - %d.\n", countDog);
    }


}
