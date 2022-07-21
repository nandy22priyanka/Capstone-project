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
import com.greatlearning.entity.Sales;
import com.greatlearning.service.SalesService;

@RestController
@RequestMapping("/Sales")
public class SalesController {
	@Autowired
	private SalesService salesService;
	
	@PostMapping("/insertSales")
	public String insertSales(@RequestBody Sales sales) {
		return salesService.insertSales(sales);
	}
	
	@DeleteMapping("/deleteSales/{salesId}")
	public String  deleteSales(@PathVariable("salesId") Integer salesId) {
		return salesService.deleteSales(salesId);
	}
	  
	@GetMapping("/getAllSales")  
	public ResponseTemplateListVO getSales()   
	{  
		return salesService.getSales();   
	}
	  
	
	@PutMapping("/updateSales/{salesId}")
	public Sales updateSales(@RequestBody Sales sales)
	{
		return salesService.updateSales(sales);
		
	} 

}



