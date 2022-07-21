package com.greatlearning.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.dao.ProductCategoryRepo;
import com.greatlearning.entity.ProductCategory;

@Service
public class ProductCategoryService {
	
	@Autowired
	private ProductCategoryRepo productCategoryRepo;
	
	public String insertproductCategory(ProductCategory productCategory) {
		productCategoryRepo.save(productCategory);
		return "successfully inserted";
		}
	
	public String deleteproductCategory(int categoryId) {
		productCategoryRepo.deleteById(categoryId);
		return "successfully deleted";
		}
	
	public List<ProductCategory> getproductCategory()   
	{  
		return productCategoryRepo.findAll();   
	}
	
	public Optional<ProductCategory> getproductCategory(int categoryId)   
	{  
		return productCategoryRepo.findById(categoryId);   
	} 
	
	public ProductCategory updateproductCategory(ProductCategory productCategory)
	{
		return productCategoryRepo.save(productCategory);
		
	} 

}
