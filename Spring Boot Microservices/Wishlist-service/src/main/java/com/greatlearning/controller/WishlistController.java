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
import com.greatlearning.entity.Wishlist;
import com.greatlearning.service.WishlistService;

@RestController
@RequestMapping("/Wishlist")
public class WishlistController {
	@Autowired
	private WishlistService WishlistService;
	
	@PostMapping("/insertWishlist")
	public String insertWishlist(@RequestBody Wishlist wishlist) {
		return WishlistService.insertWishlist(wishlist);
	}
	
	@DeleteMapping("/deleteWishlist/{wishlistId}")
	public String  deleteWishlist(@PathVariable("wishlistId") Integer wishlistId) {
		return WishlistService.deleteWishlist(wishlistId);
	}
	  
	@GetMapping("/getAllWishlist")  
	public ResponseTemplateListVO getWishlist()   
	{  
		return WishlistService.getWishlist();   
	}
	  
	
	@PutMapping("/updateWishlist/{wishlistId}")
	public Wishlist updateWishlist(@RequestBody Wishlist wishlist)
	{
		return WishlistService.updateWishlist(wishlist);
		
	} 

}



