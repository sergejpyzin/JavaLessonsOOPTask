package LessonsFive;

import LessonsFive.controllers.GroupController;
import LessonsFive.controllers.StudentController;
import LessonsFive.controllers.TeacherController;
import LessonsFive.repositories.StudentRepository;
import LessonsFive.repositories.TeacherRepository;
import LessonsFive.services.GroupService;
import LessonsFive.services.StudentService;
import LessonsFive.services.TeacherService;
import LessonsFive.view.GroupView;
import LessonsFive.view.SortType;
import LessonsFive.view.StudentView;
import LessonsFive.view.TeacherView;


import java.util.Scanner;

public class UniversityApp {
    private static StudentService studentService;
    private static TeacherService teacherService;

    public static void appButton() {
        UniversityApp.programRun();
    }


    private static void programRun() {
        StudentView studentView = getStudentController();
        TeacherView teacherView = getTeacherController();
        GroupView groupView = getGroupView();

        while (true) {
            System.out.println("""
                    Добро пожаловать в базу данных нашего университета.
                    Команды для взаимодействия:
                    1. Добавить нового студента;
                    2. Добавить нового преподавателя;
                    3. Вывести список студентов;
                    4. Вывести список преподавателей;
                    5. Вывести список преподавателей и студентов группы;
                    6. Показать информацию по студенту;
                    7. Показать информацию по преподавателю;
                    8. Удалить студента из базы данных;
                    9. Удалить преподавателя из базы данных;
                    0. Выход из программы.
                    """);

            switch (requestStringFromUser("Введите номер команды: ")) {
                case "1" -> {
                    studentView.create(requestStringFromUser("Введите полное имя студента"),
                            requestIntegerFromUser("Введите возраст студента"),
                            requestStringFromUser("Введите телефонный номер студента"),
                            requestStringFromUser("Введите номер группы студента"));
                    System.out.println("Новый студент добавлен");
                }
                case "2" -> {
                    teacherView.create(requestStringFromUser("Введите полное имя преподавателя"),
                            requestIntegerFromUser("Введите возраст преподавателя"),
                            requestStringFromUser("Введите телефонный номер преподавателя"),
                            requestStringFromUser("Введите номер группы преподавателя"));
                    System.out.println("Новый преподаватель добавлен");
                }
                case "3" -> {
                    switch (requestStringFromUser("""
                            Выберете формат сортировки списка студентов:\s
                            1. Сортировать студентов по умолчанию;
                            2. Сортировать студентов по имени;
                            3. Сортировать студентов по id;
                            """)) {
                        case "1" -> studentView.sendOnConsole(SortType.NONE);
                        case "2" -> studentView.sendOnConsole(SortType.NAME);
                        case "3" -> studentView.sendOnConsole(SortType.ID);
                    }
                }
                case "4" -> {
                    switch (requestStringFromUser("""
                            Выберете формат сортировки списка преподавателей:\s
                            1. Сортировать преподавателей по умолчанию;
                            2. Сортировать преподавателей по имени;
                            3. Сортировать преподавателей по id;
                            """)) {
                        case "1" -> teacherView.sendOnConsole(SortType.NONE);
                        case "2" -> teacherView.sendOnConsole(SortType.NAME);
                        case "3" -> teacherView.sendOnConsole(SortType.ID);
                    }
                }
                case "5" -> groupView.printAllFromGroup(requestStringFromUser("Введите номер группы: "));
                case "6" -> System.out.println(studentView.studentGetName(requestStringFromUser("Введите полное имя студента:")));
                case "7" -> System.out.println(teacherView.teacherGetName(requestStringFromUser("Введите полное имя преподавателя:")));
                case "8" -> studentView.removeUser(requestStringFromUser("Введите полное имя студента для удаления: "));
                case "9" -> teacherView.removeUser(requestStringFromUser("Введите полное имя преподавателя для удаления: "));
                case "0" -> {
                    System.out.println("Спасибо за пользование нашей программой. До свидания.");
                    System.exit(0);
                }
                default -> System.out.println("Неверный ввод");
            }
        }
    }

    private static StudentView getStudentController() {
        StudentRepository studentRepository = new StudentRepository();
        studentService = new StudentService(studentRepository);
        StudentController studentController = new StudentController(studentService);
        return new StudentView(studentController);
    }

    private static TeacherView getTeacherController() {
        TeacherRepository teacherRepository = new TeacherRepository();
        teacherService = new TeacherService(teacherRepository);
        TeacherController teacherController = new TeacherController(teacherService);
        return new TeacherView(teacherController);
    }

    private static GroupView getGroupView() {
        GroupService groupService = new GroupService(studentService, teacherService);
        GroupController groupController = new GroupController(groupService);
        return new GroupView(groupController);
    }

    private static String requestStringFromUser(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.next().replace("_", " ");
    }

    private static int requestIntegerFromUser(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int userAnswer;
        while (true) {
            try {
                userAnswer = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }
        }
        return userAnswer;
    }
}
