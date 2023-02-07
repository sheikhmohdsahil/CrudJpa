package com.hb.crud.hibernateCrud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.hb.crud.hibernateCrud.model.Student;

public interface StudentRepository  extends CrudRepository<Student,Integer>{
	
	@Query("SELECT o FROM Student o where o.stdName = :name")
	public Optional<Student> getByUserName(String name);
	

}
