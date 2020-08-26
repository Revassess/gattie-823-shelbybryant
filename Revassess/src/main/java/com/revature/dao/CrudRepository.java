package com.revature.dao;

import java.util.Set;

import com.revature.model.User;

public interface CrudRepository {

	public void save(User user);
	public Set<User> findAll();
	public User findById(int id);
	public boolean update(User user);
	public boolean deleteById(int id);
	
}