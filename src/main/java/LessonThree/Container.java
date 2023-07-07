package LessonThree;

import lombok.Value;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Value

public class Container implements Iterable<Container>, Comparable<Container>{
    private final List<Box> containers;
    private int containerWeight;

    public Container(int containerWeight) {
        containers = new ArrayList<>();
        this.containerWeight = 0;
    }
    public void addBox(Box box){
        containers.add(box);
    }

    public int getContainerWeight(Box box){
        return containerWeight += box.getWeight();
    }

    @Override
    public Iterator<Container> iterator() {
        return new C;
    }

    @Override
    public int compareTo(Container o) {
        return (containerWeight - o.containerWeight);
    }
}
