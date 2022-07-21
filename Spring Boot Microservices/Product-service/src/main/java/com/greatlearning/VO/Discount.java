package com.greatlearning.VO;
import java.util.Date;
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
public class Discount {
	
	private int discountId;
	private String discountName;
	private Float discountPercentage;
	private Date createTime;
	private Date updateTime;

}





