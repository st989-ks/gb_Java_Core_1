package task.ForLessonSeven;

public class Cat {
    private String name;
    private int hunger;
    private boolean saturation;

    public Cat(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;
        this.saturation = false;
    }

    public void eat(Plate plate) {
        System.out.println("Cat " + name + " eat...");
        int a = plate.getFood();
        plate.decreaseFood(this.hunger);
        if (a > plate.getFood()) {
            saturation = true;
            System.out.println(name + " eat till full!:)");
        } else {
            System.out.println(name + " remained hungry!:( Where's the food?");
        }

    }

    public String getName() {
        return name;
    }

    public void isSaturation() {
        if (saturation){
            System.out.println(name + " is full");
        }else {
            System.out.println(name + " is hungry");
        }
    }
}
