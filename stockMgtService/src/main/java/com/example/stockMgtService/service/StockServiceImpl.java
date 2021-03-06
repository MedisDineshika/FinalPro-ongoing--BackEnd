package com.example.stockMgtService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockMgtService.dao.StockRepository;
import com.example.stockMgtService.model.Product;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
    	StockRepository stockRepository;	
	public Product save (Product product) {
		return stockRepository.save(product);
		
	}
	
	@Override
	public List<Product> findAll() {
		return stockRepository.findAll();
	}
}
