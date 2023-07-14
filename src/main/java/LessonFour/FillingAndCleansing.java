package LessonFour;

public class FillingAndCleansing <T extends Fruit> {

    public Box filling(Box<T> sourceBox) {
        Box<T> newBox = new Box<>();

        for (T fruit : sourceBox) {
            newBox.addFruit(fruit);
            sourceBox.remove();
        }



        return newBox;
    }


}
