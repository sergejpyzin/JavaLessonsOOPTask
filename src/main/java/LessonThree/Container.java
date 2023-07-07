package LessonThree;

import java.util.ArrayList;
import java.util.List;

public class Container {
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

    @Override
    public String toString() {
        return "Container{" +
                "containers=" + containers +
                '}';
    }


}
