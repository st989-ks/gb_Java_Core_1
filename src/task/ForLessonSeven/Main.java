package task.ForLessonSeven;

public class Main {
    public static void main(String[] args) {

        Cat[] cat = {new Cat("Bars", 10),
                new Cat("Mursic", 15),
                };
        Plate plate = new Plate(100);

        cat[0].eat(plate);
        cat[1].eat(plate);

        System.out.println(plate.getFood());


    }
}
