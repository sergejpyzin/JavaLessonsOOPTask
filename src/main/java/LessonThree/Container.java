package LessonThree;

import java.util.*;

public class Container implements Comparable<Container>, Iterator<Box>, Iterable<Box> {
    private final List<Box> containers;
    private int currentPosition;


    public Container() {
        containers = new ArrayList<>();
    }

    public void addBoxes(Box box) {
        containers.add(box);
    }

    public int getContainerWeight() {
        int containerWeight = 0;
        for (Box box : containers) {
            containerWeight += box.getWeight();
        }
        return containerWeight;
    }

    //Метод проверки контейнеров по весу. Сделать не статикой не получилось
    public static void comparisonWeightBoxes(Container comparedContainer, Container container) {
        if (comparedContainer.compareTo(container) > 0) {
            System.out.println("Первый контейнер имеет больший вес");
        } else if (comparedContainer.compareTo(container) < 0) {
            System.out.println("Первый контейнер имеет меньший вес");
        } else {
            System.out.println("Вес обоих контейнеров одинаковый.");
        }

    }

    // Метод проверки контейнеров по количеству ящиков. Сделать не статикой не получилось
    public static void comparisonNumberBoxes(Container comparedContainer, Container container) {
        ContainerCountComparator containerCountComparator = new ContainerCountComparator();
        if (containerCountComparator.compare(comparedContainer, container) > 0) {
            System.out.println("Первый контейнер имеет большее число ящиков");
        } else if (containerCountComparator.compare(comparedContainer, container) < 0) {
            System.out.println("Первый контейнер имеет меньшее число ящиков");
        } else {
            System.out.println("Контейнеры имеют одинаковое число ящиков");
        }
    }

    public int numberBoxes() {
        return containers.size();
    }


    @Override
    public String toString() {
        return "В состав контейнера общим весом " + getContainerWeight() + " входят " + containers;
    }

    @Override
    public int compareTo(Container o) {
        return this.getContainerWeight() - o.getContainerWeight();
    }

    @Override
    public Iterator<Box> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < containers.size();
    }

    @Override
    public Box next() {
        if (!hasNext()) {
            throw new NoSuchElementException("В Container больше нет элементов");
        }
        return containers.get(currentPosition++);
    }
}
