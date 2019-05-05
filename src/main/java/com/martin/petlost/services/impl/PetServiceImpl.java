package com.martin.petlost.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martin.petlost.dao.IPetDAO;
import com.martin.petlost.services.IPetService;

@Service
public class PetServiceImpl implements IPetService{
	@Autowired
	private IPetDAO petDAO;

	public PetServiceImpl(IPetDAO petDAO) {
		super();
		this.petDAO = petDAO;
	}

	@Override
	public IPetDAO getPetDao() {
		return petDAO;
	}
	
}
