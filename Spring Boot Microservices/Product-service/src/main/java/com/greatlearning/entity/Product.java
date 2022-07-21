package com.greatlearning.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="product")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable = false , unique = true)
	private int productId;
	
	@Column(nullable = false ,length = 25)
	private String productName;
	
	@Column(nullable = false , length = 100)
	private String productDescription;
	
	@Column(nullable = false )
	private Double productprice;
	
	@Column(nullable = false)
	private int productStock;
	
	@Column(nullable = false)
	private String productImg;
	

    private int productcategoryId;
	
    private int discountId;
	
	
}
