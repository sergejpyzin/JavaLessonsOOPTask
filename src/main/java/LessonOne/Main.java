package LessonOne;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animalOne = new Cat("Лиза", "Scotland", 1, "grey", 5);
        Animal animalTwo = new Cat("Маня", "Scotland", 9, "grey", 5);
        System.out.println(animalOne);
        animalOne.play();
        animalOne.say();
        animalOne.nutrition(6, animalOne.getRequiredAmountFood());

    }
}
