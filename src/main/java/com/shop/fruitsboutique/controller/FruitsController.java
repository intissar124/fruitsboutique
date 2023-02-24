package com.shop.fruitsboutique.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;//rest ??

import com.shop.fruitsboutique.model.Fruits;
import com.shop.fruitsboutique.service.FruitsService;

//mark class as Controller  


@RestController 
@CrossOrigin(origins = "*")//accepter tous les requete eli jaya mn frond
//@RequestMapping("/api")
public class FruitsController {

	//autowire the BooksService class  
	@Autowired  
	FruitsService fruitService;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/fruit")//localhost/4200/ specfie le path yemchy ya3mel excution hadhya 
	
	private List<Fruits> getAllfruits()   
	{  
		return fruitService.getAllFruits();  
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/fruit/{id}")  
	private Fruits getFruits(@PathVariable("id") int id)   
	{  
		return fruitService.getFruitssById(id)
;  
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/fruit/{id}")  
	private void deleteFruits(@PathVariable("id") int id)   
	{  
		fruitService.delete(id)
;  
	} 

	@PostMapping("/fruit")  
	private int saveFruits(@RequestBody Fruits fruit)   
	{  
		fruitService.saveOrUpdate(fruit);  
		return fruit.getId();
				 // 
	} 

	//creating put mapping that updates the book detail
	//@CrossOrigin(origins = "*")
	@PutMapping("/fruit")  
	private Fruits update(@RequestBody Fruits fruit)   
	{  
		fruitService.saveOrUpdate(fruit);  
		return fruit;  
	}  
}

