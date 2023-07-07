package LessonThree;

import java.util.Comparator;

public class ContainerCountComparator implements Comparator<Container> {
    @Override
    public int compare(Container o1, Container o2) {
        return Integer.compare(o1.numberBoxes(), o2.numberBoxes());
    }
}
