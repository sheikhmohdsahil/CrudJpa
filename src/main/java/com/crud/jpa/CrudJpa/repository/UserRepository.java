package com.crud.jpa.CrudJpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.crud.jpa.CrudJpa.model.User;

public interface UserRepository  extends CrudRepository<User, Integer>{

	

}
