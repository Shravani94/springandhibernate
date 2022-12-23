package com.techouts.application.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techouts.application.model.User;
import com.techouts.application.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	public List<User> getAllUsers()   
	{  
	List<User> user = new ArrayList<User>();  
	userRepository.findAll().forEach(users -> user.add(users));  
	return user;  
	}  
	public User getUsersById(int id)   
	{  
	return userRepository.findById(id).get();  
	}  
	public void saveOrUpdate(User user)   
	{  
	userRepository.save(user);  
	} 
	public void delete(int id)   
	{  
	userRepository.deleteById(id);  
	}  
	public void update(User users, int id)   
	{  
	userRepository.save(users);  
	}  


}
