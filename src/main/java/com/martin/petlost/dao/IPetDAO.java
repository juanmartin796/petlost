package com.martin.petlost.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martin.petlost.model.Pet;

public interface IPetDAO extends JpaRepository<Pet, Integer>{

}
