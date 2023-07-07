package LessonThree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Container implements Comparable<Container>, Iterator<Box>, Iterable<Box> {
    private final List<Box> containers;
    private int containerWeight;
    private int currentPosition;
    private int lastPosition;

    public Container() {
        containers = new ArrayList<>();
    }

    public void addBoxes(Box box) {
        containers.add(box);
    }

    public int getContainerWeight() {
        containerWeight = 0;
        for (Box box : containers) {
            containerWeight += box.getWeight();
        }
        return containerWeight;
    }

    public static void comparison(Container comparedContainer, Container container) {
        if (comparedContainer.compareTo(container) > 0) {
            System.out.println("Вес контейнера " + comparedContainer +
                    " больше веса контейнера " + container);
        } else if (comparedContainer.compareTo(container) < 0) {
            System.out.println("Вес контейнера " + comparedContainer +
                    " меньше веса контейнера " + container);
        } else {
            System.out.println("Вес контейнера " + comparedContainer +
                    " равен весу контейнера " + container);
        }

    }

    public int numberBoxes(){
        return containers.size();
    }

    @Override
    public String toString() {
        return "Container{" +
                "containers=" + containers +
                '}';
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
        lastPosition = currentPosition + 1;
        return containers.get(currentPosition++);
    }
}
