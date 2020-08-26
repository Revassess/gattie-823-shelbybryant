package com.revature.dao;

import java.util.Set;

import com.revature.model.User;

public class UserRepository implements CrudRepository{


	public User findUserByUsername(String username) {
		return null;
	}
	
	public User findUserByCredentials(String username, String pw) {
		return null;
	}

	@Override
	public void save(User user) {
		
		
	}

	@Override
	public Set<User> findAll() {
		
		return null;
	}

	@Override
	public User findById(int id) {
		
		return null;
	}

	@Override
	public boolean update(User user) {
		
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		
		return false;
	}
	


	
}