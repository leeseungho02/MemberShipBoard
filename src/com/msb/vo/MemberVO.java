package com.msb.vo;

public class MemberVO {
	private String idx;					// MemberVO idx
	private String id;					// MemberVO id
	private String name;				// MemberVO name
	private String password;			// MemberVO password
	
//	MemberVO Constructor
	public MemberVO() {
		super();
	}
	
//	Login Information MemberVO Constructor
	public MemberVO(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	
//	Login Information MemberVO Constructor
	public MemberVO(String id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
//	Login Information MemberVO Constructor
	public MemberVO(String idx, String id, String name, String password) {
		super();
		this.idx = idx;
		this.id = id;
		this.name = name;
		this.password = password;
	}

	/**
	 * MemberVO getter setter
	*/
	
	public String getIdx() {
		return idx;
	}

	public void setIdx(String idx) {
		this.idx = idx;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}