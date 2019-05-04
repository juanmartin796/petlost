package com.martin.petlost.services.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martin.petlost.dao.IAplicationUserDao;
import com.martin.petlost.model.User;
import com.martin.petlost.services.IAplicationUserService;

@Service
@Transactional
public class AplicationUserService implements IAplicationUserService {
	@Autowired
	IAplicationUserDao aplicationUserDao;
	
	@Override
	public User findByUsername(String username) {
		//User aplicationUser = aplicationUserDao.findById((long) 1).get();
		User user = aplicationUserDao.findByUsername(username);
		return user;
	}

	@Override
	public void save(User user) {
		aplicationUserDao.save(user);
	}

	@Override
	public boolean existsByUsername(String username) {
		return aplicationUserDao.existsByUsername(username);
	}

}
