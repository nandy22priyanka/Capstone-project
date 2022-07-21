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
import com.greatlearning.entity.Cart;
import com.greatlearning.service.CartService;

@RestController
@RequestMapping("/Cart")
public class CartController {
	@Autowired
	private CartService cartService;
	
	@PostMapping("/insertCart")
	public String insertCart(@RequestBody Cart cart) {
		return cartService.insertCart(cart);
	}
	
	@DeleteMapping("/deleteCart/{cartId}")
	public String  deleteCart(@PathVariable("cartId") Integer cartId) {
		return cartService.deleteCart(cartId);
	}
	  
	@GetMapping("/getAllCart")  
	public ResponseTemplateListVO getCart()   
	{  
		return cartService.getCart();   
	}
	  
	
	@PutMapping("/updateCart/{cartId}")
	public Cart updateCart(@RequestBody Cart cart)
	{
		return cartService.updateCart(cart);
		
	} 

}



