package com.shop.fruitsboutique.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.shop.fruitsboutique.model.Fruits;
import com.shop.fruitsboutique.repository.FruitsRepository;

@Service 
public class FruitsService {

	@Autowired  
	FruitsRepository fruitRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  
	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Fruits> getAllFruits()   
	{  
		List<Fruits> fruits = new ArrayList<Fruits>();  
		fruitRepository.findAll().forEach(fruit1 -> fruits.add(fruit1));  
		return fruits;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Fruits getFruitssById(int id)   
	{  
		return fruitRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Fruits fruits)   
	{  
		fruitRepository.save(fruits);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		fruitRepository.deleteById(id);  
	} 

	//updating a record  
	public void update(Fruits fruits, int id)   
	{  
		fruitRepository.save( fruits);  
	}  


}
