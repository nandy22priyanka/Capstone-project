package com.greatlearning.entity;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Wishlist")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Wishlist {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable = false , unique = true)
	private int wishlistId;
	
	@Column(nullable = false)
	private Date createTime;
	
	private int UserId;
	
	private int ProductId;
}
	