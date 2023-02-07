package com.hb.crud.hibernateCrud.service;

import java.util.List;
import java.util.Optional;

import com.hb.crud.hibernateCrud.model.Student;

public interface StudentService {

	public Integer saveStudent(Student student);
	
	public List<Student> getAllStudents();
	
	public Student getStudentById(Integer sno);
	
	public void deleteStudent(Integer sno);
	
	public Optional<Student> getByUserName(String name);
	
	
}
