package LessonsFive.controllers;

import LessonsFive.models.Student;
import LessonsFive.models.Teacher;
import LessonsFive.services.UserService;

import java.util.List;

public class TeacherController implements UserController<Teacher>{

    private final UserService<Teacher> userService;

    public TeacherController(UserService<Teacher> teacherUserService) {
        this.userService = teacherUserService;
    }
    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupTitle) {
        userService.create(fullName, age, phoneNumber, groupTitle);
    }

    //@GetMethod("/teacher")
    @Override
    public List<Teacher> getAll() {
        return userService.getAll();
    }

    //@DeleteMethod("/teacher")
    @Override
    public int remove(String fullName) {
        return userService.remove(fullName);
    }

    @Override
    public List<Teacher> getAllSortByFullName() {
        return userService.getAllSortByFullName();
    }

    @Override
    public List<Teacher> getAllSortById() {
        return userService.getAllSortById();

    }

    @Override
    public List<Teacher> getName(String name) {
        return userService.getUserName(name);
    }
}
