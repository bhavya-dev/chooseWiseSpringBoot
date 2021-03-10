package com.ts;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ProductDAO;
import com.model.Product;


@RestController
public class ProductController {
    @Autowired
	ProductDAO productDao;
    
    
	@RequestMapping("/getAllProducts")
	public List<Product> getAllProducts() {
		List<Product> products = productDao.getAllProducts();
        System.out.println("productgeting"+products);

		return products;
	}

		
	@PostMapping("/purchase")
    public void purchase(@RequestBody List<Product> items) {
	        System.out.println("productcontroller"+items);
			productDao.purchase(items);
     
		}
	
	@PostMapping("/deleteReq")			
	public void delete(@RequestBody Product item){
		System.out.println(item);
		productDao.deleteRequest(item);
	}




}
