package com.market.wm.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
public class User implements Serializable {
	
	private static final long	serialVersionUID	= 1L;
	private String				emailId;
	private String				name;
	private String				password;
	private String				role;
	
	public User() {
	}
	
	public User(String emailId, String name, String role, String password) {
		this.emailId = emailId;
		this.name = name;
		this.role = role;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	@XmlElement
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getPassword() {
		return password;
	}
	
	@XmlElement
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}
	
	@XmlElement
	public void setRole(String role) {
		this.role = role;
	}
	
}
