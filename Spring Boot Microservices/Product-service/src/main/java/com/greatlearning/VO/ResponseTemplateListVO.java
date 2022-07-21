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
public class ResponseTemplateListVO {
	List<Product> products= new ArrayList<>();

	public void setProduct(List<Product> product2) {
		
		 products.addAll(product2);
		 
	}
}
