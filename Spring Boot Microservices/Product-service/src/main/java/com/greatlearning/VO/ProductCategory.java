package com.greatlearning.VO;
 
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

public class ProductCategory {
	
	private int categoryId;
	private String categoryName;
	private String categoryDesc;

}
