package LessonThree;

import lombok.Value;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Value

public class Container implements Iterable<Container>, Iterator<Container>, Comparable<Container>{
    private final List<Box> containers;

    public Container() {
        containers = new ArrayList<>();
    }
    public void addBox(Box box){
        containers.add(box);

    }

    public int containerSize(){
        return containers.size();
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

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Container next() {
        return null;
    }
}
