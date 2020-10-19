package com.cts.demo.dao.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cts.demo.model.Stock;


public interface StockJpaDao extends CrudRepository<Person,Integer>{
	
	
	
}
