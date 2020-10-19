package com.cts.demo.service;

import java.util.List;

import com.cts.demo.model.Stock;

public interface PermanentStockService {
	
	public Iterable<Stock> getAllStock();
	public Stock getStockById(int id);
	public Stock addStock(Stock stock);
	

}
