package com.greatlearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.VO.ResponseTemplateListVO;
import com.greatlearning.VO.ResponseTemplateVO;
import com.greatlearning.entity.Product;
import com.greatlearning.service.ProductService;

@RestController
@RequestMapping("/Product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping("/insertProduct")
	public String insertProduct(@RequestBody Product product) {
		return productService.insertProduct(product);
	}
	
	@DeleteMapping("/deleteProduct/{productId}")
	public String  deleteProduct(@PathVariable("productId") Integer productId) {
		return productService.deleteProduct(productId);
	}
	  
	@GetMapping("/getAllProduct")  
	public ResponseTemplateListVO getProduct()   
	{  
		return productService.getProduct();   
	}
	  
	@GetMapping("/getProduct/{productId}")  
	public ResponseTemplateVO getProduct(@PathVariable("productId") int productId)   
	{  
		return productService.getProduct(productId);   
	} 
	
	@PutMapping("/updateProduct/{productId}")
	public Product updateProduct(@RequestBody Product product)
	{
		return productService.updateProduct(product);
		
	} 

}



