package REST.TestRestProj.controllers;

import REST.TestRestProj.entities.Student;
import REST.TestRestProj.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping(value = "/{id}")
    public Student getStudent(@PathVariable("id")Long id){
        return studentService.getStudent(id);
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student updStudent){
        Student student = studentService.getStudent(updStudent.getId());
        student.setName(updStudent.getName());
        student.setSurname(updStudent.getSurname());
        student.setCourse(updStudent.getCourse());
        return studentService.addStudent(student);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteStudent(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
    }

//    @GetMapping(value = "/search")
//    public  List<Student> getAllStudentsBySearch(@RequestBody Student student){
//      return  studentService.getAllStudentsBySearch(student.getName());
//    }
//    @GetMapping(value = "/sort")
//    public List<Student> getAllStudentsSortedByNameAsc(){
//        return studentService.getAllStudentsSortedByNameAsc();
//    }

}
