package LessonOne;

public class Hamster extends Animal {
    public Hamster(String name, String breed, int age, String coloring, int requiredAmountFood) {
        super(name, breed, age, coloring, requiredAmountFood);
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public String toString() {
        return "Хомяк -> " +
                "кличка - " + getName() +
                ", порода - " + getBreed() +
                ", возраст - " + getAge() +
                ", цвет - " + getColoring();
    }

    @Override
    public void say() {
        System.out.println("Пи - пи - пи");
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void nutrition(int foodPortion, int requiredAmountFood) {
        super.nutrition(foodPortion, requiredAmountFood);
    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    protected boolean canEqual(Object other) {
        return super.canEqual(other);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getBreed() {
        return super.getBreed();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getColoring() {
        return super.getColoring();
    }

    @Override
    public int getRequiredAmountFood() {
        return super.getRequiredAmountFood();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setBreed(String breed) {
        super.setBreed(breed);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setColoring(String coloring) {
        super.setColoring(coloring);
    }

    @Override
    public void setRequiredAmountFood(int requiredAmountFood) {
        super.setRequiredAmountFood(requiredAmountFood);
    }
}
