package com.greatlearning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.greatlearning.VO.Discount;
import com.greatlearning.VO.ProductCategory;
import com.greatlearning.VO.ResponseTemplateListVO;
import com.greatlearning.VO.ResponseTemplateVO;
import com.greatlearning.dao.ProductRepo;
import com.greatlearning.entity.Product;

@Service
public class ProductService {
	
	

	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private RestTemplate restTemplate;

	
	
	public String insertProduct(Product product) {
		productRepo.save(product);
		return "successfully inserted";
	}
	
	public String deleteProduct(Integer productId) {
		productRepo.deleteById(productId);
		return "successfully deleted";
		
	}
	
	public ResponseTemplateListVO getProduct()   
	{ 
		ResponseTemplateListVO vol= new ResponseTemplateListVO();
		List<Product> product= productRepo.findAll();
		
		vol.setProduct(product);
		return vol;
	}
	
	public ResponseTemplateVO getProduct(int productId)   
	{  
		ResponseTemplateVO vo= new ResponseTemplateVO();
		Product product= productRepo.findByproductId(productId);
		Discount discount=restTemplate.getForObject("http://DiscountService/Discount/getDiscount/"+product.getDiscountId(),Discount.class);
		ProductCategory productCategory=restTemplate.getForObject("http://ProductCategoryService/ProductCategory/getproductCategory/"+product.getProductcategoryId(),ProductCategory.class);
		vo.setProduct(product);
		vo.setDiscount(discount);
		vo.setProductCategory(productCategory);
		return vo;
		
	}
	public Product updateProduct(Product product)
	{
		return productRepo.save(product);
		
	} 

}
