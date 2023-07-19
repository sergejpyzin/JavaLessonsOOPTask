package LessonSix.Work3;

public abstract class GreetingForm {

    public String getGreet (String greet) {
        switch (greet) {
            case "formal":
                return "Good evening, sir.";
            case "casual":
                return "Sup bro?";
            case "intimate":
                return "Hello Darling!";
            default:
                return "Hello.";
        }
    }
}
