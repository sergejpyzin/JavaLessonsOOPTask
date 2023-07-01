package LessonOne;

import java.util.List;

public class Cat extends Animal{


    public Cat(String name, String breed, int age, String coloring, int requiredAmountFood) {
        super(name, breed, age, coloring, requiredAmountFood);
    }

    @Override
    public void say() {
        System.out.println("мяу!");
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
    public String toString() {
        return "Кот " +
                "имя = '" + getName() + '\'' +
                ", порода = '" + getBreed() + '\'' +
                ", возраст = " + getAge() +
                ", цвет = '" + getColoring();
    }
}
