package com.techouts.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techouts.application.model.User;
import com.techouts.application.services.UserService;
@RestController
public class ControllerClass {
	@Autowired
	UserService userService;
	@RequestMapping(value="/User" ,method=RequestMethod.GET) 
	@ResponseBody
	private List<User> getAllUsers()   
	{  
	return userService.getAllUsers();  
	} 
	@RequestMapping(value="/user/{id}",method=RequestMethod.DELETE)  
	@ResponseBody
	private void deleteBook(@PathVariable("id") int id)   
	{  
	userService.delete(id);  
	} 
	//@RequestMapping(value="/post",method=RequestMethod.POST)  
	@PostMapping("/test")
	@ResponseBody
	private int saveBook(@RequestBody User users)   
	{  
	userService.saveOrUpdate(users);  
	return users.getUserid();  
	}  
	@RequestMapping(value="/users/id",method=RequestMethod.PUT) 
	@ResponseBody
	private User update(@PathVariable ("id")int id,@RequestBody User users)   
	{  
	userService.saveOrUpdate(users);  
	return users;  
	}  
	}  
