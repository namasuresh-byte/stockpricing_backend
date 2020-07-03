package com.example.demo.controller;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.demo.model.Stocks;
import com.example.demo.model.StockPrices;
import com.example.demo.repository.StocksRepository;


@RestController
@CrossOrigin(origins = "http://localhost:8080/")
//@CrossOrigin(origins = "http://localhost:8080")


	
public class StocksController {

	@Autowired
	StocksRepository stocksrepository;
	
	   @GetMapping("/stockprices")
	    public List<StockPrices> getStockprices() {
		   
		  // RestTemplate resttemplate = new RestTemplate();
		  // Rate rate = resttemplate.getForObject("http://localhost:7576/stock?id=1", Rate.class);
		   
		    List<Stocks> lstStocks = (List<Stocks>)stocksrepository.findAll();
		    Comparator<Stocks> compareSymbolCreatedDate = Comparator.comparing(Stocks::getStocksymbol).thenComparing(Stocks::getEventtime);
		    List<Stocks> lstStocks4 = lstStocks.stream().sorted(compareSymbolCreatedDate).collect(Collectors.toList());
		    
		    Map<String, List<Stocks>> stockListBySymb2 = lstStocks4.stream().collect(Collectors.groupingBy(Stocks::getStocksymbol));
		    
		    List<StockPrices> lstFinal = new ArrayList();
		    
		    stockListBySymb2.values().stream().forEach(stockSymb -> {
		    int iSize= (stockSymb.size()-1);
		    String strTrend="Up";
		    System.out.println("forEach *****iSize ::::"+iSize);
		    double curPrice = ((Double.valueOf(stockSymb.get(iSize).getAskprice())+Double.valueOf(stockSymb.get(iSize).getBidprice()))/2);
		    
		    if(iSize>0 ) {
		    	double prevPrice = ((Double.valueOf(stockSymb.get(iSize-1).getAskprice())+Double.valueOf(stockSymb.get(iSize-1).getBidprice()))/2);
		    	if(curPrice< prevPrice) {
		    		strTrend="Down";
		    	}
		    }
		     lstFinal.add(new StockPrices(stockSymb.get(iSize).getStocksymbol(),String.valueOf(curPrice),strTrend, stockSymb.get(iSize).getEventtime()));
	    	} );
		    
		    return lstFinal;
	    }
	 
	    @PostMapping("/stockprices")
	    public  void addUser(@RequestBody Stocks stocks) {
	    	 System.out.println("SAVE =userrepository.save()==> "+stocksrepository.toString());
	    	 stocksrepository.save(stocks);
	    }
	  
	
}
