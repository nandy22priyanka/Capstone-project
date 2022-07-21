package com.greatlearning.entity;

import java.util.Date;

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
@Table(name="Cart")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Cart {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable = false , unique = true)
	private int cartId;
	
	
	@Column(nullable = false)
	private int quantity;
	
	
	@Column(nullable = false)
	private double total;
	
	
	@Column(nullable = false)
	private Date createTime;
	
	
	private Date UpdateTime;
	
	private int userId;
	
	private int productId;
	
	
}
