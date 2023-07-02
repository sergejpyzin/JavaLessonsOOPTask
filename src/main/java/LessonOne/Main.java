package LessonOne;

import java.util.ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
       /*
       Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
        Нужно создать несколько классов животных:
        1. Пес (Собака)
        2. Кот (Кошка)
        3. ... придумать еще парочку

        Каждое животное имеет: (поля)
                1. Имя (кличка)
        2. Возраст
        3. ... придумать еще какие-то параметры

        Каждое животное может: (методы)
                1. Подавать голос
        2. Питаться (съедает какое-то количество еды, переданное в метод)
        3. Двигаться
        4. ... все, что сумеете придумать

        Нужно выделить базовый тип с общими атрибутами, инкапсулировать то, что является внутренним, внурь класса.
                Создать массив с животными и в цикле заставить их поесть (какое-то количество еды) и заставить подать голос.

        Придумать свою структуру с наследованием по аналогии с животными и банковскими счетами.
        */
        // Создаем экземпляры класса Animal
        Animal cat = new Cat("Лиза", "Scotland", 1, "grey", 5);
        Animal dog = new Dog("Рик", "Rottweiler", 1, "grey", 10);
        Animal rat = new Rat("Шапокляк", "беспородная", 1, "white", 3);
        Animal hamster = new Hamster("Циклоп", "беспородная", 1, "brown", 1);

        List<Animal> pets = new ArrayList<>(); // Создаем список питомцев
        pets.add(cat);
        pets.add(dog);
        pets.add(rat);
        pets.add(hamster);

        // Выполняем

        try{
            for (Animal animal : pets) {
                Thread.sleep(3000);
                animal.say();
                Thread.sleep(500);
                if (animal.equals(cat)) {
                    animal.nutrition(4, cat.getRequiredAmountFood());
                } else if (animal.equals(dog)) {
                    animal.nutrition(10, animal.getRequiredAmountFood());
                } else if (animal.equals(rat)) {
                    animal.nutrition(4, animal.getRequiredAmountFood());
                } else if (animal.equals(hamster)) {
                    animal.nutrition(2, animal.getRequiredAmountFood());
                }
                Thread.sleep(500);
                animal.play();
                Thread.sleep(500);
                animal.walk();
                Thread.sleep(500);
                animal.sleep();
                System.out.println("==========================");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
