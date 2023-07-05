package LessonTwo;

public class Neutral extends Render {
    private int maxHealthPoint;
    private int currentHealthPoint;

    public Neutral(int maxHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = maxHealthPoint;
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

    @Override
    protected String showLineBar(int maxPoint, int currentPoint) {
        return super.showLineBar(maxPoint, currentPoint);
    }

    @Override
    protected void showIndicator() {
        System.out.println("Текущее количество здоровья " + currentHealthPoint + "; Максимальное количество здоровья " +
                maxHealthPoint + ": " + showLineBar(maxHealthPoint, currentHealthPoint));
    }
}
