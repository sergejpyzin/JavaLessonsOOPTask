package LessonOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public abstract class Animal {
    private String name;
    private String breed;
    private int age;
    private String coloring;
    private boolean male;

    @Override
    public String toString() {
        return "Animal = " +
                "name = '" + name + '\'' +
                ", breed = '" + breed + '\'' +
                ", age = " + age +
                ", coloring = '" + coloring + '\'' +
                ", male = " + male;
    }

    public abstract void say();
    public abstract void walk();
    public abstract void nutrition();
    public abstract void play();



}
