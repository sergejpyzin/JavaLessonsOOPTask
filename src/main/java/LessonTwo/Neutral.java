package LessonTwo;

public class Neutral extends Render {
    private final int maxHealthPoint;
    private int currentHealthPoint;

    public Neutral(int maxHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = maxHealthPoint;
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
        System.out.println("Нейтральный персонаж -> Текущее количество здоровья " + currentHealthPoint + "; Максимальное количество здоровья " +
                maxHealthPoint + ": " + showLineBar(maxHealthPoint, currentHealthPoint));
    }
}
