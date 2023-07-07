package LessonThree;

public class Main {
   /*
    Создать класс Контейнер - Container.
    В контейнере могут быть ящики (класс Box).

    У каждого ящика есть вес.
    У каждого контейнера есть метод "получить вес" - это сумма всех весов ящиков, которые находятся в контейнере.

    Класс Контейнер должен быть Comparable. Сравнивать он должен по весам контейнера (чем меньше вес, тем меньше контейнер).
    Класс ContainerCountComparator - Comparator, который сравнивает контейнеры по количеству ящиков (чем меньше ящиков, тем меньше контейнер).
    Класс контейнер должен быть Iterable - итерирование должно происходить по ящикам внутри контейнера.
    */

    public static void main(String[] args) {
        Container container = new Container();
        container.addBoxes(new Box(600));
        container.addBoxes(new Box(200));
        container.addBoxes(new Box(100));
        container.addBoxes(new Box(400));

        Container container2 = new Container();
        container2.addBoxes(new Box(200));
        container2.addBoxes(new Box(200));
        container2.addBoxes(new Box(300));
        container2.addBoxes(new Box(400));

        for (Box box : container) {
            System.out.println(box);
        }

        while (container2.hasNext()){
            System.out.println(container2.next() + " ");
        }

    }
}
