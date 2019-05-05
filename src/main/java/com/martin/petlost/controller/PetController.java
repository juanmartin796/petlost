package com.martin.petlost.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martin.petlost.model.Pet;
import com.martin.petlost.services.IPetService;

@RestController
@RequestMapping(value="pet")
public class PetController {
	@Autowired
	private IPetService petService;
	
	
	@GetMapping(value="/")
	public List<Pet> getAllPets(){
		return petService.getPetDao().findAll();
	}

}
