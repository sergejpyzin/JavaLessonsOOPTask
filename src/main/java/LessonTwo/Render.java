package LessonTwo;

public abstract class Render {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_GREEN = "\u001B[92m";
    public static final String ANSI_DARK_RED = "\u001B[01;38;05;88m";
    public static final String ANSI_LIGHT_GREEN = "\u001B[38;2;0;255;0m";
    public static final String ANSI_LIGHT_YELLOW = "\u001B[01;38;05;222m";
    public static final String ANSI_BRIGHT_RED = "\u001B[91m";
    public static final String ANSI_ORANGE = "\u001B[01;38;05;214m";
    public static final String ANSI_LIGHT_RED = "\u001B[01;38;05;196m";
    public static final String ANSI_HI_DARK_RED = "\u001B[01;38;05;52m";



    protected String showLineBar(int maxPoint, int currentPoint){
        StringBuilder lineBar;
        lineBar = new StringBuilder();
        int lineBarLength = (int) Math.ceil((currentPoint * 1.0) / maxPoint * 10);
        lineBar.append("*".repeat(lineBarLength));
        String colorLine;

        if (currentPoint == maxPoint) {
            colorLine = ANSI_LIGHT_GREEN;
        } else if (lineBarLength > 8) {
            colorLine = ANSI_GREEN;
        } else if (lineBarLength > 6) {
            colorLine = ANSI_LIGHT_YELLOW;
        } else if (lineBarLength > 4) {
            colorLine = ANSI_ORANGE;
        } else if (lineBarLength > 2) {
            colorLine = ANSI_LIGHT_RED;
        } else if (lineBarLength > 1) {
            colorLine = ANSI_DARK_RED;
        } else if (lineBarLength > 0) {
            colorLine = ANSI_HI_DARK_RED;
        } else if (currentPoint > 0) {
            return ANSI_BRIGHT_RED + "[" + ANSI_RESET +
                    ANSI_BLACK + "X" + ANSI_RESET +
                    ANSI_BRIGHT_RED + " ".repeat(10) + "]" + ANSI_RESET;
        } else {
            return ANSI_BLACK + "[" + lineBar + "]" + ANSI_RESET;
        }

        return colorLine + "[" + lineBar + " ".repeat(10 - lineBarLength) + "]" + ANSI_RESET;
    }

    protected abstract void showIndicator();



}
