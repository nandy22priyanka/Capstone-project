package com.greatlearning.VO;

import java.util.ArrayList;
import java.util.List;

import com.greatlearning.entity.Wishlist;

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
	List<Wishlist> wishlists= new ArrayList<>();

	public void setWishlist(List<Wishlist> wishlist) {
		wishlists.addAll(wishlist);
	}

}
