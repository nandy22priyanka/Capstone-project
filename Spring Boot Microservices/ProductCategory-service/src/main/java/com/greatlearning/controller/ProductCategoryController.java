package com.greatlearning.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.greatlearning.entity.ProductCategory;
import com.greatlearning.service.ProductCategoryService;

@RestController
@RequestMapping("/ProductCategory")
public class ProductCategoryController {
	
	@Autowired
	private ProductCategoryService productCategoryService;
	
	@PostMapping("/insertproductCategory")
	public String insertproductCategory(@RequestBody ProductCategory productCategory) {
		return productCategoryService.insertproductCategory(productCategory);
	}
	
	@DeleteMapping("/deleteproductCategory/{categoryId}")
	public String deleteproductCategory(@PathVariable("categoryId") int categoryId) {
		return productCategoryService.deleteproductCategory(categoryId);
	}
	  
	@GetMapping("/getAllproductCategory")  
	public List<ProductCategory> getproductCategory()   
	{  
		return productCategoryService.getproductCategory();   
	}
	  
	@GetMapping("/getproductCategory/{categoryId}")  
	public Optional<ProductCategory> getproductCategory(@PathVariable("categoryId") int categoryId)   
	{  
	return productCategoryService.getproductCategory(categoryId);   
	} 
	
	@PutMapping("/updateproductCategory/{categoryId}")
	public ProductCategory updateproductCategory(@RequestBody ProductCategory productCategory)
	{
		return productCategoryService.updateproductCategory(productCategory);
		
	} 

}



