package com.example.demo.model;


public class StockPrices {


	public String getStocksymbol() {
		return stocksymbol;
	}
	public void setStocksymbol(String stocksymbol) {
		this.stocksymbol = stocksymbol;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getTrend() {
		return trend;
	}
	public void setTrend(String trend) {
		this.trend = trend;
	}
	public String getEventtime() {
		return eventtime;
	}
	public void setEventtime(String eventtime) {
		this.eventtime = eventtime;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stocksymbol == null) ? 0 : stocksymbol.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StockPrices other = (StockPrices) obj;
		if (stocksymbol == null) {
			if (other.stocksymbol != null)
				return false;
		} else if (!stocksymbol.equals(other.stocksymbol))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "StockPrices [stocksymbol=" + stocksymbol + ", price=" + price + ", trend=" + trend + ", eventtime="
				+ eventtime + "]";
	}
	public StockPrices(String stocksymbol, String price, String trend, String eventtime) {
		super();
		this.stocksymbol = stocksymbol;
		this.price = price;
		this.trend = trend;
		this.eventtime = eventtime;
	}
	private String  stocksymbol;
	private String  price   ;
	private String  trend   ;
	private String  eventtime  ;

	
}
