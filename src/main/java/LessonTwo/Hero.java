package LessonTwo;

public class Hero extends Render {
    private final int maxHealthPoint;
    private int currentHealthPoint;
    private final int maxManaPoint;
    private int currentManaPoint;

    public Hero(int maxHealthPoint, int maxManaPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = maxHealthPoint;
        this.maxManaPoint = maxManaPoint;
        this.currentManaPoint = maxManaPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    public void setCurrentManaPoint(int currentManaPoint) {
        this.currentManaPoint = currentManaPoint;
    }

    @Override
    protected void showIndicator() {
        System.out.println("Герой -> Текущее количество здоровья " + currentHealthPoint + "; Максимальное количество здоровья " +
                maxHealthPoint + ": " + showLineBar(maxHealthPoint, currentHealthPoint));
        System.out.println("Герой -> Текущее количество маны " + currentManaPoint + "; Максимальное количество маны " +
                maxManaPoint + ": " + showLineBar(maxManaPoint, currentManaPoint));
    }

    @Override
    protected String showLineBar(int maxPoint, int currentPoint) {
        return super.showLineBar(maxPoint, currentPoint);
    }
}
