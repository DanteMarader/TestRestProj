package REST.TestRestProj.controllers;

import REST.TestRestProj.entities.Student;
import REST.TestRestProj.entities.Teacher;
import REST.TestRestProj.services.StudentService;
import REST.TestRestProj.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sort")
public class SortController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;

    @GetMapping(value = "/student")
    public List<Student> getAllStudentsSortedByNameAsc(){
        return studentService.getAllStudentsSortedByNameAsc();
    }
    @GetMapping(value = "/teacher")
    public List<Teacher> getAllTeacherSortedByName(){
        return  teacherService.getAllStudentsSortedByNameAsc();
    }
}
