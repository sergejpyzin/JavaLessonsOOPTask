package LessonThree;



public class Box {
    private int weight;


    public Box(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Ящик весом: %s", weight);
    }
}
