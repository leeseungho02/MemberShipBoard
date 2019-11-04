package com.mb.model;

public interface DBQuery {
	
//	MEMBER TABLE QUERY
	String MEMBER_SELECT_ALL = "select * from members where id != 'admin'";
	String MEMBER_SELECT = "select * from members where id = ? and password = ?";
	String MEMBER_INSERT = "insert into members (id, name, password) values (?, ?, ?)";
	String MEMBER_UPDATE = "";
	String MEMBER_DELETE = "";
	
//	BOARD TABLE QUERY

}