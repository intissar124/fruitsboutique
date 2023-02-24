package com.shop.fruitsboutique.repository;
import org.springframework.data.repository.CrudRepository;

import com.shop.fruitsboutique.model.Fruits;

public interface FruitsRepository extends CrudRepository<Fruits, Integer> {

}

