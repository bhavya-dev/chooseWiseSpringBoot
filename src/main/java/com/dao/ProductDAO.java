package com.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.Product;

@Service
public class ProductDAO {
	
	 @Autowired
	 ProductRepository productRepository;
	
	 public void purchase(List<Product> items) {
	 productRepository.saveAll(items);
	}
	public List<Product> getAllProducts() {
		List<Product> products=productRepository.findAll();
		return products;
	}
	
	public void deleteRequest(Product item) {
        productRepository.delete(item);
    }

}
