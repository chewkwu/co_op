package com.co_op.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.co_op.entities.User;
import com.co_op.interfaces.UserInterface;

@Service
public class UserService {

	@Autowired
	UserInterface userInterface;
	
	public User createUser(User user) {
		return userInterface.save(user);
	}
	
	public void removeUser(User user) {
		userInterface.delete(user);
	}
	
	public User findUser(int userID) {
		return userInterface.findById(userID).get();
	}
	
	public List<User> allUsers(){
		List<User> users = new ArrayList<>();
		Iterable<User> allUsers = userInterface.findAll();
		allUsers.forEach(e -> users.add(e));
		return users;
	}
	
	public List<User> findByUsername(String username) {
		return userInterface.findByUsername(username);
	}
	
}
