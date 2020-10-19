package com.cts.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.demo.Utility;
import com.cts.demo.model.Stock;
import com.cts.demo.service.PermanentStockService;
import com.cts.demo.service.PermanentStockServiceImpl;

@RestController
public class StockController {
	
	@Autowired
	PermanentPersonService stockService;  //Default It's Type
	
	public StockController() {
				
	}
	
	@GetMapping(value = "/stockList")
	public ResponseEntity<Object> stockList()
	{
		
		return new ResponseEntity<>(stockService.getAllStock(),HttpStatus.OK);
	}
	
	@GetMapping(value = "/getStockById/{id}")
	public ResponseEntity<Object> stockList(@PathVariable("id") Integer id)
	{
		
			Person person=stockService.getStockById(id);
			if(stock!=null) {
				
				return new ResponseEntity<>(stock,HttpStatus.OK);	
			}
			else
			return new ResponseEntity<>("Resord Not Found",HttpStatus.OK);
				
	}
	
	@PostMapping(value = "/addStock")
	public ResponseEntity<Object> addStock(@RequestBody Stock stock)
	{
		
		return new ResponseEntity<>(stockService.addStock(stock),HttpStatus.OK);	
	}
	


}
