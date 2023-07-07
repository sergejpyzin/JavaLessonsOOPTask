package LessonThree;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Box {
    private int weight;


    public Box(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Вес: %s", weight);
    }
}
