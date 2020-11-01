package com.co_op.interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.co_op.entities.User;

@Component
public interface UserInterface extends CrudRepository<User,Integer>{

	public List<User> findByUsername(String username);
	
}
