package REST.TestRestProj.controllers;

import REST.TestRestProj.entities.Student;
import REST.TestRestProj.entities.Teacher;
import REST.TestRestProj.services.StudentService;
import REST.TestRestProj.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/search")
public class SearchController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;

    @GetMapping(value = "/student")
    public List<Student> getAllStudentsBySearch(@RequestBody Student student){
        return  studentService.getAllStudentsBySearch(student.getName());
    }

    @GetMapping(value = "/teacher")
    public List<Teacher> getAllTeacherBySearch(@RequestBody Teacher teacher){
        return teacherService.getAllTeachersBySearch(teacher.getName());
    }


}
