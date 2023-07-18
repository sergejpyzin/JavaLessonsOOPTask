package LessonsFive.models;

public class Student extends User{
    public Student(String fullName, Integer age, String phoneNumber, String groupTitle) {
        super( fullName, age, phoneNumber, groupTitle);
    }

    @Override
    public String toString() {
        return String.format("Студент имеет следующие свойства: id: %s, Имя %s, age %s, Тел. номер %s, Группа %s",
                getId(),
                getFullName(), getAge(), getPhoneNumber(), getGroupTitle());
    }
}
