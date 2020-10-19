package com.cts.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.cts.demo.model.Person;
import com.cts.demo.model.Stock;

public interface StockDao {
	public List<Stock> getAllStock();
	public Stock getStockById(int id);
	public Person addStock(Stock stock);

	
}
