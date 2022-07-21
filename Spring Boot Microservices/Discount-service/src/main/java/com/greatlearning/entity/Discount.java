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
@Table(name="discount")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Discount {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable = false , unique = true)
	private int discountId;
	
	@Column(nullable = false, unique=true, length = 25)
	private String discountName;
	
	@Column(nullable = false)
	private Float discountPercentage;
	
	
	@Column(nullable = false)
	private Date createTime;
	

	private Date updateTime;
	
}
