package LessonsFive.view;

import LessonsFive.controllers.UserController;
import LessonsFive.models.Student;
import LessonsFive.models.Teacher;

import java.util.List;

public class TeacherView implements UserView{
    private final UserController<Teacher> controller;

    public TeacherView(UserController<Teacher> controller) {
        this.controller = controller;
    }

    public void sendOnConsole() {
        sendOnConsole(SortType.NONE);
    }

    @Override
    public void sendOnConsole(SortType sortType) {
//        List<Student> students = controller.getAll();

        List<Teacher> teachers = switch (sortType) {
            case NONE -> controller.getAll();
            case NAME -> controller.getAllSortByFullName();
            case ID -> controller.getAllSortById();
        };

        if (teachers == null || teachers.size() == 0) {
            System.out.println("Отсутствуют преподаватели для вывода");
            return;
        }

        System.out.println("===================================");
        System.out.println("Для вывода использована " + sortType);
//        for (Student student : students) {
//            System.out.println(student);
//        }
//        students.forEach((student) -> System.out.println(student));
        teachers.forEach(System.out::println);
        System.out.println("===================================");
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupTitle) {
        controller.create(fullName, age, phoneNumber, groupTitle);
    }

    @Override
    public void removeUser(String fullName) {
        int removeCount = controller.remove(fullName);

        if (removeCount == 0) {
            System.out.println("Удаление не получилось.");
        } else {
            System.out.println("Удалено преподавателей: " + removeCount);
        }

    }
    public String teacherGetName(String name){
        List<Teacher> teachers = controller.getName(name);

        return teachers.isEmpty() ? "Не найдено ни одного студента"
                : "Удалось найти следующих студентов: " + teachers;
    }
}
