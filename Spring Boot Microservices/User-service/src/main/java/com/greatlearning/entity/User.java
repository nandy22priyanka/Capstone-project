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
@Table(name="user")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable = false , unique = true)
	private int userId;
	
	@Column(nullable = false , unique = true , length = 25)
	private String userName;
	
	@Column(nullable = false , length = 20)
	private String password;
	
	@Column(nullable = false , unique = true , length = 30)
	private String email;
	
	@Column(nullable = false , unique = true , length = 10)
	private String phone;
	
	@Column(nullable = false , length = 50)
	private String address;

	@Column(nullable = false , length = 10)
	private String userRole;
	
	
}
