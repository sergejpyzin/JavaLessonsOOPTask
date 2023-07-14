package LessonsFive.repositories;

import LessonsFive.models.Student;
import LessonsFive.models.User;

import java.util.List;

public interface UserRepository <T extends User> {
    void create(T user);

    List<T> getAll();

    int remove(String fullName);

    List<Student> getAllByGroupTitle(String groupTitle);
}
