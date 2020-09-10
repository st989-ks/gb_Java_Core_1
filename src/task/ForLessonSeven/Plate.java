package task.ForLessonSeven;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }
    public void infoFood(){
        System.out.println(getFood()+" more food left!");
    }

    public void decreaseFood(int amount) {
        boolean a = (this.food - amount) < 0;
        if (!a){
            this.food -= amount;
        }
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
