package LessonTwo;

public class Building extends Render {
    private final int maxHealthPoint;
    private int currentHealthPoint;

    public Building(int maxHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = maxHealthPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    @Override
    public String showLineBar(int maxPoint, int currentPoint) {
        return super.showLineBar(maxPoint, currentPoint);
    }

    @Override
    protected void showIndicator() {
        System.out.println("Здание -> Текущее количество здоровья " + currentHealthPoint + "; Максимальное количество здоровья " +
                maxHealthPoint + ": " + showLineBar(maxHealthPoint, currentHealthPoint));
    }
}
