package com.test.hplus.restcontrollers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.hplus.beans.Product;
import com.test.hplus.repository.ProductRepository;

@RestController
public class ProductsRestController {

	@Autowired
	private ProductRepository productRepository;
	
//	
//	@GetMapping("/hplus/rest/products")
//	@ResponseBody
//	public List<Product> getProducts(){
//		List<Product>  products = new ArrayList<>();
//		productRepository.findAll().forEach(product -> products.add(product));
//		return products;
//	}
	
	@GetMapping("/hplus/rest/products")
	public ResponseEntity getProductByRequestParam(@RequestParam("name") String name) {
		List<Product> products = productRepository.searchByName(name);
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	@GetMapping("/hplus/rest/products/{name}")
	public ResponseEntity getProductsByPathVariable(@PathVariable("name") String name) {
		List<Product> products = productRepository.searchByName(name);
		return new ResponseEntity<>(products, HttpStatus.OK);
		
	}
}
