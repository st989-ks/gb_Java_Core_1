package task.ForLessonSeven;

public class Cat {
    private String name;
    private int hunger;

    public Cat(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;
    }

    public void eat(Plate plate) {
        System.out.println("Cat " + name + " eat...");
        plate.decreaseFood(10);
    }


    public String getName() {
        return name;
    }


}
