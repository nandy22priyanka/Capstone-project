package com.greatlearning.VO;

import java.util.ArrayList;
import java.util.List;

import com.greatlearning.entity.Cart;

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
	List<Cart> carts= new ArrayList<>();

	public void setCart(List<Cart> cart) {
		carts.addAll(cart);
	}

}
