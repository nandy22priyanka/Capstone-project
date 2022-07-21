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

import com.greatlearning.entity.Discount;
import com.greatlearning.service.DiscountService;

@RestController
@RequestMapping("/Discount")
public class DiscountController {
	@Autowired
	private DiscountService discountService;
	
	@PostMapping("/insertdiscount")
	public String insertdiscount(@RequestBody Discount discount) {
		return discountService.insertdiscount(discount);
	}
	
	@DeleteMapping("/deleteDiscount/{discountId}")
	public String deletediscount(@PathVariable("discountId") Integer discountId) {
		return	discountService.deletediscount(discountId);
	
	}
	  
	@GetMapping("/getAllDiscount")  
	public List<Discount> getdiscount()   
	{  
		return discountService.getdiscount();   
	}
	  
	@GetMapping("/getDiscount/{discountId}")  
	private Optional<Discount> getdiscount(@PathVariable("discountId") int discountId)   
	{  
	return discountService.getdiscount(discountId);   
	} 
	
	@PutMapping("/updateDiscount/{discountId}")
	public Discount updatediscount(@RequestBody Discount discount)
	{
		return discountService.updatediscount(discount);
		
	} 

}



