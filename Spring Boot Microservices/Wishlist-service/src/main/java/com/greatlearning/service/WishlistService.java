package com.greatlearning.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.greatlearning.VO.ResponseTemplateListVO;
import com.greatlearning.dao.WishlistRepo;
import com.greatlearning.entity.Wishlist;

@Service
public class WishlistService {
	
	@Autowired
	private WishlistRepo wishlistRepo;
	
	@Autowired
	private RestTemplate restTemplate;

	public String insertWishlist(Wishlist wishlist) {
		wishlistRepo.save(wishlist);
		return "successfully inserted";
	}
	
	public String deleteWishlist(Integer wishlistId) {
		wishlistRepo.deleteById(wishlistId);
		return "successfully deleted";
		
	}
	
	public ResponseTemplateListVO getWishlist()   
	{ 
		ResponseTemplateListVO vol= new ResponseTemplateListVO();
		List<Wishlist> wishlist= wishlistRepo.findAll();
		
		vol.setWishlist(wishlist);
		return vol;
	}
	
	public Wishlist updateWishlist(Wishlist wishlist)
	{
		return wishlistRepo.save(wishlist);
		
	} 

}
