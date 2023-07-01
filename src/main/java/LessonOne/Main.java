package LessonOne;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> pet = new ArrayList<>();
        Animal animalOne = new Cat("Лиза", "Scotland", 1, "grey", 5);
        Animal animalTwo = new Cat("Маня", "Scotland", 9, "grey", 5);
        Animal animalThird = new Dog("Рик", "Rottweiler", 2, "black", 10);
        Animal animalFour = new Dog("Цыган", "Dalmatian ", 1, "white", 10);
        Animal animalFifth = new Rat("Шапокляк", "Ноунэйм", 1, "white", 1);
        Animal animalSix = new Hamster("Ноунэйм", "Ноунэйм", 1, "yellow", 1);

//        pet.add(animalOne);
//        pet.add(animalTwo);
//        pet.add(animalThird);
//        pet.add(animalFour);
//        pet.add(animalFifth);
//        pet.add(animalSix);
//
//        System.out.println(pet);




        System.out.println(animalOne);
        animalOne.play();
        animalOne.say();
        animalOne.nutrition(6, animalOne.getRequiredAmountFood());

    }
}
