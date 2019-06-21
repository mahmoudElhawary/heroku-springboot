package com.elhawary.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elhawary.model.Person;

@Repository
public interface PersonRepositry extends JpaRepository<Person, Integer> {
	
	public void deleteById(int id) ;
}
