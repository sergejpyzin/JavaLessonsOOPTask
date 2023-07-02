package LessonOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor

public abstract class Animal {
    private String name;
    private String breed;
    private int age;
    private String coloring;
    private int requiredAmountFood;



    @Override
    public String toString() {
        return "Animal = " +
                "name = '" + name + '\'' +
                ", breed = '" + breed + '\'' +
                ", age = " + age +
                ", coloring = '" + coloring;
    }

    public abstract void say();

    public void walk() {
        System.out.println("Питомец " + getName() + " гуляет.");
    }

    public void nutrition(int foodPortion, int requiredAmountFood){
        if (foodPortion > 0) {
            if (foodPortion < requiredAmountFood) {
                System.out.println("Мало! :( Надо увеличить порцию.");
            }
            try {
                for (int i = foodPortion; i > 0; i--) {
                    System.out.println("Питомец " + getName() + " кушает.");
                    Thread.sleep(500);
                }
            } catch (InterruptedException ie)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("Питомец " + getName() + " поел.");
        } else{
            System.out.println("Дайте еды питомцу");
        }

    }

    public void play() {
        System.out.println("Питомец " + getName() + " играет.");
    }
    public void sleep(){
        System.out.println("Питомец " + getName() + " спит");
    }


}
