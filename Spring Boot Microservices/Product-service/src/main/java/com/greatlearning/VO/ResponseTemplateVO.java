 package com.greatlearning.VO;


import java.util.ArrayList;
import java.util.List;

import com.greatlearning.entity.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
	
	private Product product;
	private ProductCategory productCategory;
	private Discount discount;
	
	
	public void setProduct(Product product2) {
		
		this.product=product2;
		
	}
	public void setDiscount(Discount discount2)
	{
		this.discount=discount2;
	}
	public void setProductCategory(ProductCategory productCategory2) {
	
		this.productCategory=productCategory2;
	}
	

}
