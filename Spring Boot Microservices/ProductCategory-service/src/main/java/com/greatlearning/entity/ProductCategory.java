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
@Table(name="ProductCategory")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProductCategory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable = false , unique = true)
	private int categoryId;
	
	@Column(nullable = false , unique = true , length = 25)
	private String categoryName;
	
	@Column(nullable = false , length = 45)
	private String categoryDesc;

}
