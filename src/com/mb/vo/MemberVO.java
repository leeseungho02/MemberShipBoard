package com.mb.vo;

public class MemberVO {
	private String id;					// MemberVO id
	private String name;				// MemberVO name
	private String password;			// MemberVO password
	
	/**
	 * MemberVO getId()
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * MemberVO setId()
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * MemberVO getName()
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * MemberVO setName()
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * MemberVO getPassword()
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * MemberVO getPassword()
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}