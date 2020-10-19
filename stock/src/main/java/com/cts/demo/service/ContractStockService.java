package com.cts.demo.service;

import java.util.List;

import com.cts.demo.model.Stock;

public interface ContractStockService {
	
	public List<Stock> getAllStock();
	public Stock getStockById(int id);

}
