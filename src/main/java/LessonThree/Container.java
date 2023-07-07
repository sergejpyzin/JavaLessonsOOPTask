package LessonThree;

import java.util.ArrayList;
import java.util.List;

public class Container {
    private final List<Box> containers;

    public Container() {
        containers = new ArrayList<>();
    }

    public void addBoxes(Box box) {
        containers.add(box);
    }

    @Override
    public String toString() {
        return "Container{" +
                "containers=" + containers +
                '}';
    }


}
