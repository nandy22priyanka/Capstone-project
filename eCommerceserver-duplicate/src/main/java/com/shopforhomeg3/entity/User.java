package com.shopforhomeg3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false , unique = true)
	private Long userId;
	
	@Column(nullable = false , unique = true , length = 25)
	private String userName;
	
	@Column(nullable = false , length = 20)
	private String password;
	
	@Column(nullable = false , length = 25)
	private String name;
	
	@Column(nullable = false , unique = true , length = 30)
	private String email;
	
	@Column(nullable = false , unique = true , length = 10)
	private String phone;
	
	@Column(nullable = false , length = 50)
	private String address;

	@Column(nullable = false , length = 10)
	private String userRole;
		
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Long userId, String userName, String password, String name, String email, String phone, String address, String userRole ) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.userRole=userRole;
	}



	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", name=" + name
				+ ", email=" + email + ", phone=" + phone + ", address=" + address + ", userRole=" + userRole + "]";
	}


	
	
	
	
	
}
