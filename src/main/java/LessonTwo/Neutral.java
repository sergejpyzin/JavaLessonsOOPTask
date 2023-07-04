package LessonTwo;

public class Neutral {
    private int maxHealthPoint;
    private int currentHealthPoint;

    public Neutral(int maxHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
    }

    public int getMaxHealthPoint() {
        return maxHealthPoint;
    }

    public void setMaxHealthPoint(int maxHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
    }

    public int getCurrentHealthPoint() {
        return currentHealthPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }
}
