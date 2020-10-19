package com.cts.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.demo.dao.StockDao;
import com.cts.demo.dao.StockDaoImpl;
import com.cts.demo.dao.jpa.StockJpaDao;
import com.cts.demo.model.Stock;


@Service(value = "stockService")
public class PermanentStockServiceImpl implements PermanentStockService{

	@Autowired
	StockDao stockDao;
	
	@Autowired
	StockJpaDao stockJpaDao;
	
	@Override
	public Iterable<Stock> getAllStock() {
		// TODO Auto-generated method stub
		
		
		return stockJpaDao.findAll();
	}

	@Override
	public Stock getStockById(int id) {
		// TODO Auto-generated method stub
		return stockJpaDao.findById(id).get();
	}

	@Override
	public Stock addStock(Stock stock) {
		// TODO Auto-generated method stub
		
		return stockJpaDao.save(stock);
	}

	@Override
	public Stock updateStock(Stock stock) {
		// TODO Auto-generated method stub
		return stockJpaDao.save(stock);
	}

}
