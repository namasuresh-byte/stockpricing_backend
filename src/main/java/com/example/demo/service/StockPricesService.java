/**
 * @author Suresh Nama
 * suresh.nama@gmail.com
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.model.StockPrices;

public interface StockPricesService {
	
	   StockPrices save(StockPrices stockPrices);

	   StockPrices findById(int id);

	    List<StockPrices> getStockprices();

	    //DetailResponse findDetailResponse(int id);
}
