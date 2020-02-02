package com.abc.hublearning.web.controller;

import com.abc.hublearning.web.dto.StudentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/students")
@RestController
public class StudentController {

    @GetMapping
    public ResponseEntity<Object> getStudents(){
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable Long id){

        //Student student = studentService.getById();
        //return ResponseEntity.ok(student);
        return null;
    }

    @PostMapping
    public ResponseEntity<Object> createStudent(@RequestBody StudentDto studentDto){
        return null;
    }

    @PutMapping("{/id}")
    public ResponseEntity<Object> updateStudent(@RequestBody StudentDto studentDto, @PathVariable long id){
        //Optional<Student> studentOptional = studentService.findById(id);
//        if (!studentOptional.isPresent()) {
//            return ResponseEntity.notFound().build();
//        }
//        studentDto.setId(id);
//        studentService.save(studentDto);

        return null;
    }

    @DeleteMapping
    public ResponseEntity<Boolean> deleteStudentById(@RequestBody StudentDto studentDto){
        return null;
    }





}
