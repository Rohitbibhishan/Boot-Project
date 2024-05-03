package com.example.H2DataBase;

//import lombok.AllArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@AllArgsConstructor
//@Slf4j
public class StudentController {
    private final StudentRepo studentRepo;

    public StudentController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {

        studentRepo.save(student);
        //log.info("Student added successfully");
        return new ResponseEntity<Student>(student,HttpStatus.OK);
        //return ResponseEntity.ok(student);
    }
    //Get Http request
    @GetMapping("/getStudent")
    public ResponseEntity<List<Student>> getStudent(Student student) {
        List<Student> studentList = studentRepo.findAll();
        return new ResponseEntity<List<Student>>(studentList,HttpStatus.OK);
    }

    @GetMapping("students/name/{name}")
    public List<Student> findByName(@PathVariable String name)
    {
        return studentRepo.findByName(name);
    }

    @GetMapping("students/email/{email}")
    public List<Student> findUserByEmail(@PathVariable String email)
    {
        return studentRepo.findUserByEmail(email);
    }
}
