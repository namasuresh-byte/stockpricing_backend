package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Stocks;


public interface StocksRepository extends JpaRepository<Stocks, Integer>{

	@Query("select s from Stocks s where s.id = ?1")
	List<Stocks> findStockRatings(int id);
}
