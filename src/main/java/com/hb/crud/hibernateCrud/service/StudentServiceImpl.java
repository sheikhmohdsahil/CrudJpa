package com.hb.crud.hibernateCrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hb.crud.hibernateCrud.model.Student;
import com.hb.crud.hibernateCrud.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	private StudentRepository repository;
	
	
	@Override
	public Integer saveStudent(Student student) {
		
		return repository.save(student).getSno();
	}

	
	@Override
	public List<Student> getAllStudents() {
		
		return (List<Student>)repository.findAll();
	}

	@Override
	public Student getStudentById(Integer sno) {
		
		return repository.findById(sno).get();
	}

	@Override
	public void deleteStudent(Integer sno) {
       repository.deleteById(sno);		
	}


	@Override
	public Optional<Student> getByUserName(String name) {
		return repository.getByUserName(name);
	}

}
