package LessonOne;

public class Main {
    public static void main(String[] args) {

        Animal animalOne = new Cat("Лиза", "Scotland", 1, "grey", 5);
        Animal animalTwo = new Cat("Маня", "Scotland", 9, "grey", 5);
        Animal animalThird = new Dog("Рик", "Rottweiler", 2, "black", 10);
        Animal animalFour = new Dog("Цыган", "Dalmatian ", 1, "white", 10);
        Animal animalFifth = new Rat("Шапокляк", "Ноунэйм", 1, "white", 1);
        Animal animalSix = new Hamster("Ноунэйм", "Ноунэйм", 1, "yellow", 1);

        System.out.println(animalOne);
        System.out.println(animalTwo);
        System.out.println(animalThird);
        System.out.println(animalFour);
        System.out.println(animalFifth);
        System.out.println(animalSix);
        animalOne.play();
        animalOne.say();
        animalTwo.say();
        animalThird.say();
        animalFour.say();
        animalFifth.say();
        animalSix.say();
        animalOne.nutrition(6, animalOne.getRequiredAmountFood());

    }
}
