package com.greatlearning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.dao.DiscountRepo;
import com.greatlearning.entity.Discount;

@Service
public class DiscountService {
	
	@Autowired
	private DiscountRepo discountRepo;
	
	public String insertdiscount(Discount discount) {
		discountRepo.save(discount);
		return "successfully inserted";
	}
	
	public String deletediscount(Integer discountId) {
		discountRepo.deleteById(discountId);
		return "successfully deleted";
	}
	
	public List<Discount> getdiscount()   
	{  
		return discountRepo.findAll();   
	}
	
	public Optional<Discount> getdiscount(int discountId)   
	{  
		return discountRepo.findById(discountId);   
	} 
	
	public Discount updatediscount(Discount discount)
	{
		return discountRepo.save(discount);
		
	} 

}
