package com.greatlearning.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.greatlearning.VO.ResponseTemplateListVO;
import com.greatlearning.dao.SalesRepo;
import com.greatlearning.entity.Sales;

@Service
public class SalesService {
	
	@Autowired
	private SalesRepo salesRepo;
	
	@Autowired
	private RestTemplate restTemplate;

	public String insertSales(Sales sales) {
		salesRepo.save(sales);
		return "successfully inserted";
	}
	
	public String deleteSales(Integer salesId) {
		salesRepo.deleteById(salesId);
		return "successfully deleted";
		
	}
	
	public ResponseTemplateListVO getSales()   
	{ 
		ResponseTemplateListVO vol= new ResponseTemplateListVO();
		List<Sales> sales= salesRepo.findAll();
		
		vol.setSales(sales);
		return vol;
	}
	
	public Sales updateSales(Sales sales)
	{
		return salesRepo.save(sales);
		
	} 

}
