package com.greatlearning.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.entity.Product;


@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

	Product findByproductId(int productId);


}



