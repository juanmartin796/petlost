package com.martin.petlost.services;

import com.martin.petlost.model.User;

public interface IAplicationUserService {
	public User findByUsername(String username);
	public boolean existsByUsername(String username);
	public void save(User user);
}
