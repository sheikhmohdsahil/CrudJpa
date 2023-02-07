package com.hb.crud.hibernateCrud.controller;

import java.security.PublicKey;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hb.crud.hibernateCrud.model.Student;
import com.hb.crud.hibernateCrud.service.StudentService;

@RestController
@RequestMapping("/studentDetails")
public class StudentController {

	@Autowired
	private StudentService service;

	@PostMapping("/saveStudent")
	public ResponseEntity<String> saveStudent(@RequestBody Student student){
		Integer id = service.saveStudent(student);
		return new ResponseEntity<String>("student with '"+id+"' has been saved",HttpStatus.OK);
		
	}		
	
	@GetMapping("/studentList")
	public ResponseEntity<List<Student>> getAllStudentDetails(){
		List<Student> list=service.getAllStudents();
		
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}
		@GetMapping("/name")
		public ResponseEntity<String> ss(@RequestParam String name){
			service.getByUserName(name);
			return new ResponseEntity<String>(HttpStatus.OK);

		
	}
		@GetMapping("/getStudentById/{sno}")
		public ResponseEntity<Student> getStudentById(@PathVariable("sno") Integer sno){
			Student std = service.getStudentById(sno);
			
			return new ResponseEntity<Student>(std,HttpStatus.OK);
		}
		
		@PutMapping("/updateStudent/{sno}")
		public ResponseEntity<String> updatesStudent(@PathVariable("sno") Integer sno, @RequestBody Student student ){
			Student stdFromDb=service.getStudentById(sno);
			stdFromDb.setStdName(student.getStdName());
			stdFromDb.setStdClass(student.getStdClass());
			stdFromDb.setSchoolNmae(student.getSchoolNmae());
			Integer id=service.saveStudent(stdFromDb);
			return new ResponseEntity<String>("student with '"+id+"' has  been updated",HttpStatus.OK);
			
		}
		
		@DeleteMapping("deleteStudent/{sno}")
		public ResponseEntity<String> deleteStudent(@PathVariable("sno") Integer sno){
			
			service.deleteStudent(sno);
			return new ResponseEntity<String>("student with '"+sno+"' has been deleted ",HttpStatus.OK);
		}
}

















