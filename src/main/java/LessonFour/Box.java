package LessonFour;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> boxes;

    public Box(List<T> boxes) {
        this.boxes = boxes;
    }

    public Box(){
        boxes = new ArrayList<>();
    }

    public void addFruit(T t){
        boxes.add(t);
    }
    public int getBoxWeight(){
        int boxWeight = 0;
        for (T t:
             boxes) {
            boxWeight += t.getWeight();
        }
        return boxWeight;
    }
}
