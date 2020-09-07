package task.ForLessonSixth.animals;

public class Dog extends Animal {

    public Dog(String name) {

        super(name);
        countDog++;
    }

    @Override
    public void run(int dist) {

        int limit = 500;
        if (dist > limit) {
            System.out.printf("Лимит для бега у собак - %dм.\n", limit);
            return;
        }
        System.out.printf("%s пробежал %d м.\n", name, dist);

    }

    @Override
    public void swim(int dist) {

        int limit = 10;
        if (dist > limit) {
            System.out.printf("Собаки могут проплыть не больше %dм.\n", limit);
            return;
        }
        System.out.printf("%s проплыл %d м.\n", name, dist);

    }
}
