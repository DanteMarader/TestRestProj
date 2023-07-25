package REST.TestRestProj.services.impl;

import REST.TestRestProj.entities.Teacher;
import REST.TestRestProj.repositories.TeacherRepository;
import REST.TestRestProj.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;
    @Override
    public List<Teacher> getAllTeachersBySearch(String name) {
        return teacherRepository.findAllByNameContainsIgnoreCase(name);
    }

    @Override
    public List<Teacher> getAllStudentsSortedByNameAsc() {
        return teacherRepository.findAllByOrderByNameAsc();
    }
}
