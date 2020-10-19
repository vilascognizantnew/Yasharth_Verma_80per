package com.cts.demo;

import com.cts.demo.service.PermanentStockService;
import com.cts.demo.service.PermanentStockServiceImpl;

public class Utility {
	
	
	public static PermanentStockService getPermanentStockService()
	{
		
		return new PermanentStockServiceImpl();
	}

}
