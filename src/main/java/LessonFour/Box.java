package LessonFour;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class Box<T extends Fruit> implements Iterator<T>, Iterable<T> {

    private List<T> fruits;
    private int currentPosition;
    private int lastReturn;


    public Box() {
        fruits = new ArrayList<>();
    }


    public List<T> getFruit() {
        return fruits;
    }

    public void setFruit(List<T> fruit) {
        this.fruits = fruit;
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public int getBoxWeight() {
        int boxWeight = 0;
        for (T fruit : fruits) {
            boxWeight += fruit.getWeight();
        }
        return boxWeight;
    }

    public void moveTo(List<T> newFruit) {
        newFruit.addAll(fruits);
        fruits.clear();
    }

    @Override
    public Iterator<T> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < fruits.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("В Box больше нет элементов");
        }
        lastReturn = currentPosition + 1;
        return fruits.get(currentPosition++);
    }

    @Override
    public void remove() {
        if (currentPosition <= 0 || lastReturn == -1) {
            throw new IllegalStateException();
        }
        fruits.remove(--currentPosition);
        lastReturn = -1;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        for (T fruit : fruits) {
            action.accept(fruit);
        }
    }

    @Override
    public String toString() {
        return "Box -> " +
                "fruits = " + fruits;
    }

}
