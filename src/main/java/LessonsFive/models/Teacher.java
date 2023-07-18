package LessonsFive.models;

public class Teacher extends User {
    public Teacher(String fullName, Integer age, String phoneNumber, String groupTitle) {
        super(fullName, age, phoneNumber, groupTitle);
    }

    @Override
    public String toString() {
        return String.format("Преподаватель имеет следующие свойства: id: %s, Имя %s, age %s, Тел. номер %s, Группа %s",
                getId(),
                getFullName(), getAge(), getPhoneNumber(), getGroupTitle());
    }
}
