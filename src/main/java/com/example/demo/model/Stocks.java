package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stockpricing")

public class Stocks {

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStocksymbol() {
		return stocksymbol;
	}
	public void setStocksymbol(String stocksymbol) {
		this.stocksymbol = stocksymbol;
	}
	public String getBidprice() {
		return (bidprice==""?"0" :bidprice);
	}
	public void setBidprice(String bidprice) {
		this.bidprice = bidprice;
	}
	public String getAskprice() {
		//return askprice;
		return (askprice==""?"0" :askprice);
	}
	public void setAskprice(String askprice) {
		this.askprice = askprice;
	}
	public String getEventtime() {
		return eventtime;
	}
	public void setEventtime(String eventtime) {
		this.eventtime = eventtime;
	}
	@Id
	private String  id         ;
	@Override
	public String toString() {
		return "Stocks [id=" + id + ", stocksymbol=" + stocksymbol + ", bidprice=" + bidprice + ", askprice=" + askprice
				+ ", eventtime=" + eventtime + "]";
	}
	private String  stocksymbol;
	private String  bidprice   ;
	private String  askprice   ;
	private String  eventtime  ;

	
}
