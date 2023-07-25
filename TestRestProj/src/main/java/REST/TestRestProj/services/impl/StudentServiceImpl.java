package REST.TestRestProj.services.impl;

import REST.TestRestProj.entities.Student;
import REST.TestRestProj.repositories.StudentRepository;
import REST.TestRestProj.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(Long id) {
        return studentRepository.findAllById(id);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getAllStudentsBySearch(String name) {
        return studentRepository.findAllByNameContainsIgnoreCase(name);
    }

    @Override
    public List<Student> getAllStudentsSortedByNameAsc() {
        return studentRepository.findAllByOrderByNameAsc();
    }
}
