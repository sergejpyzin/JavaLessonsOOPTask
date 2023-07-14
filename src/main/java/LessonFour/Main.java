package LessonFour;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляров класса
        Box<Apple> boxApple = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Apple apple = new Apple(2);
        Orange orange = new Orange(6);
        boxApple.addFruit(apple);
        orangeBox.addFruit(orange);
        boxApple.addFruit(new Apple(3));

        // Вывод списка фруктов в Box
        System.out.println();
        System.out.println("============= Вывод списка фруктов в Box ================");
        System.out.println(boxApple);


        // Вывод общего веса Box
        System.out.println();
        System.out.println("============= Вывод общего веса Box ================");
        System.out.println(boxApple.getBoxWeight());


        // "Пересыпание" фруктов из коробки в коробку
        Box<Apple> newbox = new Box<>();
        boxApple.moveTo(newbox.getFruit());

        // Вывод новой и старой коробки
        System.out.println();
        System.out.println("======= Вывод новой и старой коробки =======");
        System.out.println(newbox);
        System.out.println(boxApple);
    }
}
