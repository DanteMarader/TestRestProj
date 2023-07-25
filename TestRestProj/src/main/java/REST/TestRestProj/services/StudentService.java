package REST.TestRestProj.services;

import REST.TestRestProj.entities.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);
    List<Student> getAllStudents();
    Student getStudent(Long id);
    void deleteStudent(Long id);
    List<Student> getAllStudentsBySearch(String name);
    List<Student> getAllStudentsSortedByNameAsc();
}
