package REST.TestRestProj.services;

import REST.TestRestProj.entities.Student;
import REST.TestRestProj.entities.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachersBySearch(String name);
    List<Teacher> getAllStudentsSortedByNameAsc();
}
