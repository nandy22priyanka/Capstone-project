package com.greatlearning.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.entity.Cart;


@Repository
public interface CartRepo extends JpaRepository<Cart,Integer> {

	Cart findBycartId(int cartId);


}



