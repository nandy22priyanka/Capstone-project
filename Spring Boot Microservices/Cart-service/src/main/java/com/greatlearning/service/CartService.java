package com.greatlearning.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.greatlearning.VO.ResponseTemplateListVO;
import com.greatlearning.dao.CartRepo;
import com.greatlearning.entity.Cart;

@Service
public class CartService {
	
	@Autowired
	private CartRepo cartRepo;
	
	@Autowired
	private RestTemplate restTemplate;

	public String insertCart(Cart Cart) {
		cartRepo.save(Cart);
		return "successfully inserted";
	}
	
	public String deleteCart(Integer cartId) {
		cartRepo.deleteById(cartId);
		return "successfully deleted";
		
	}
	
	public ResponseTemplateListVO getCart()   
	{ 
		ResponseTemplateListVO vol= new ResponseTemplateListVO();
		List<Cart> cart= cartRepo.findAll();
		
		vol.setCart(cart);
		return vol;
	}
	
	public Cart updateCart(Cart cart)
	{
		return cartRepo.save(cart);
		
	} 

}
