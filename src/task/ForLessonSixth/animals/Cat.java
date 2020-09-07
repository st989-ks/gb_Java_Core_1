package task.ForLessonSixth.animals;

public class Cat extends Animal {

    public Cat(String name) {

        super(name);
        countCat++;
    }

    @Override
    public void run(int dist) {

        int limit = 200;
        if (dist > limit) {
            System.out.printf("Лимит для котов - %dм.\n", limit);
            return;
        }
        System.out.printf("%s пробежал %d м.\n", name, dist);

    }

    @Override
    public void swim(int dist) {

        System.out.println("Коты не плавают");

    }
}
