package com.crud.jpa.CrudJpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.jpa.CrudJpa.model.User;
import com.crud.jpa.CrudJpa.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public List<User> saveUsers(List<User> users) {
		return  (List<User>) userRepository.saveAll(users);
	}
	
	public User fetchUserById(int id) {
		return userRepository.findById(id).orElse(null);
	}
	public List<User> fetchUsers() {
		return (List<User>) userRepository.findAll();
	}
	
	public User updateUser(User user) {
		User olduser=userRepository.findById(user.getId()).orElse(null);
		if(olduser!=null) {
			olduser.setName(user.getName());
			olduser.setAddress(user.getAddress());
			return userRepository.save(user);
		}
		return userRepository.save(new User());
	}
	public String deleteById(int id) {
		userRepository.deleteById(id);
		return "User Deleted";
	}

	
}