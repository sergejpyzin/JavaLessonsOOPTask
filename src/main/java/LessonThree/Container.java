package LessonThree;

import java.util.ArrayList;
import java.util.List;

public class Container implements Comparable<Container>{
    private final List<Box> containers;
    private int containerWeight;

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

    public static void comparison (Container comparedContainer, Container container){
        if (comparedContainer.compareTo(container) > 0){
            System.out.println("Вес контейнера " + comparedContainer +
                    " больше веса контейнера " + container);
        } else if (comparedContainer.compareTo(container) < 0) {
            System.out.println("Вес контейнера " + comparedContainer +
                    " меньше веса контейнера " + container);
        }else {
            System.out.println("Вес контейнера " + comparedContainer +
                    " равен весу контейнера " + container);
        }

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
}
