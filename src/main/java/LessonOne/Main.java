package LessonOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Лиза", "Scotland", 1, "grey", 5);
        Animal dog = new Dog("Рик", "Rottweiler", 1, "grey", 10);
        Animal rat = new Rat("Шапокляк", "беспородная", 1, "white", 3);
        Animal hamster = new Hamster("Циклоп", "беспородная", 1, "brown", 1);

        List<Animal> pets = new ArrayList<>();
        pets.add(cat);
        pets.add(dog);
        pets.add(rat);
        pets.add(hamster);

        for (Animal animal : pets) {
            animal.say();
            if (animal.equals(cat)){
                animal.nutrition(6, cat.getRequiredAmountFood());
            } else if (animal.equals(dog)) {
                animal.nutrition(10, animal.getRequiredAmountFood());
            } else if (animal.equals(rat)) {
                animal.nutrition(4, animal.getRequiredAmountFood());
            } else if (animal.equals(hamster)) {
                animal.nutrition(2, animal.getRequiredAmountFood());
            }
            animal.play();
            animal.walk();
            System.out.println("==========================");
        }


    }
}
