package com.cts.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.cts.demo.model.Stock;

@Repository(value = "stockDao")
public class StockDaoImpl implements StockDao{

	List<Stock> StockList=new ArrayList<Stock>();
	public StockDaoImpl() {
		stockList.add(new Stock(101, "ACC", 2900 ,7687));
		stockList.add(new Stock(102, "D-mart", 400 , 6574));
		stockList.add(new Stock(103, "GAIL", 657 , 8765));
		stockList.add(new Stock(104, "ONGC", 25 , 7659));
		stockList.add(new Stock(105 ,"BPL" , 34 , 8765));
		
	}
	public List<Stock> getAllStock()
	
	{
			
		return stockList;
	}
	@Override
	public Stock getStockById(int id) {
		
		for(Stock stock:stockList) {
			if(stock.getId()==id) {
				
				return stock;	
			}
		}
		
		return null;
	}
	@Override
	public Stock addStock(Stock stock) {
		stockList.add(stock);
		return stock;
	}


}
