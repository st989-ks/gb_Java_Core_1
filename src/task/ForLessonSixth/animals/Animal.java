package task.ForLessonSixth.animals;

public abstract class Animal {

    protected String name;
    public static int count;
    public static int countCat;
    public static int countDog;

    public Animal(String name) {

        this.name = name;
        count++;
    }

    public void swim(int dist) {

        System.out.printf("%s проплыл %d м.\n", name, dist);
    }

    public void run(int dist) {

        System.out.printf("%s пробежал %d м.\n", name, dist);
    }




}
