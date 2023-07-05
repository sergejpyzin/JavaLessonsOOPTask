package LessonTwo;

public class Hero extends Render{
    private int maxHealthPoint;
    private int currentHealthPoint;
    private int maxManaPoint;
    private int currentManaPoint;

    public Hero(int maxHealthPoint, int maxManaPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = maxHealthPoint;
        this.maxManaPoint = maxManaPoint;
        this.currentManaPoint = maxManaPoint;
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

    public int getMaxManaPoint() {
        return maxManaPoint;
    }

    public void setMaxManaPoint(int maxManaPoint) {
        this.maxManaPoint = maxManaPoint;
    }

    public int getCurrentManaPoint() {
        return currentManaPoint;
    }

    public void setCurrentManaPoint(int currentManaPoint) {
        this.currentManaPoint = currentManaPoint;
    }

    @Override
    protected void showIndicator() {
        System.out.println("Текущее количество здоровья " + currentHealthPoint + "; Максимальное количество здоровья " +
                maxHealthPoint + ": " + showLineBar(maxHealthPoint, currentHealthPoint));
        System.out.println("Текущее количество маны " + currentManaPoint + "; Максимальное количество маны " +
                maxManaPoint + ": " + showLineBar(maxManaPoint, currentManaPoint));
    }

    @Override
    protected String showLineBar(int maxPoint, int currentPoint) {
        return super.showLineBar(maxPoint, currentPoint);
    }
}
