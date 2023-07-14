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

public class Main {

    private static StudentRepository studentRepository;
    private static StudentService studentService;
    private static StudentController studentController;
    private static TeacherRepository teacherRepository;
    private static TeacherService teacherService;
    private static TeacherController teacherController;

    public static void main(String[] args) {
        StudentView view = getStudentController();
        GroupView groupView = getGroupView();
        TeacherView teacherView = getTeacherController();
//        -------------------------------------------------------------------------

        view.create("Ivan Morozov", 18, "02", "11Б");
        view.create("Ivan Morozov", 18, "02", "11Б");
        view.create("Petr Vorobev", 19, "03", "10А");
        view.create("Sidor Sidorov", 20, "112", "10А");
        view.create("Elena Ivanova", 19, "911", "10А");
        view.create("Anna Morozova", 17, "01", "11A");
        teacherView.create("Inna Fedorova",27, "333", "11A");
        teacherView.sendOnConsole(SortType.ID);

        groupView.printAllFromGroup("11A");
        view.sendOnConsole();
        view.sendOnConsole(SortType.NAME);
        view.sendOnConsole(SortType.ID);

        view.removeUser("Ivan Morozov");

        view.sendOnConsole();

    }

    private static StudentView getStudentController() {
        studentRepository = new StudentRepository();
        studentService = new StudentService(studentRepository);
        studentController = new StudentController(studentService);
        return new StudentView(studentController);
    }

    private static TeacherView getTeacherController(){
        teacherRepository = new TeacherRepository();
        teacherService = new TeacherService(teacherRepository);
        teacherController = new TeacherController(teacherService);
        return new TeacherView(teacherController);
    }

    private static GroupView getGroupView() {
        GroupService groupService = new GroupService(studentService,/*, teacherService*/teacherService);
        GroupController groupController = new GroupController(groupService);
        return new GroupView(groupController);
    }


}
