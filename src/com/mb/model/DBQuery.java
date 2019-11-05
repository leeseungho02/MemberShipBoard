package com.mb.model;

public interface DBQuery {
	
//	MEMBERS TABLE QUERY
	String MEMBER_SELECT_ALL = "select * from members where id != 'admin'";
	String MEMBER_SELECT = "select * from members where idx = ?";
	String MEMBER_INSERT = "insert into members (id, name, password) values (?, ?, ?)";
	String MEMBER_UPDATE = "UPDATE `members` SET `name`= ?,`password`= ? WHERE idx = ?";
	String MEMBER_DELETE = "delete from members where idx = ?";
	
	String MEMBER_CHECK = "select * from msembers where id = ?";
	String MEMBER_LOGIN_CHECK = "select * from members where id = ? and password = ?";
	
//	BOARDS TABLE QUERY
	String BOARD_SELECT_ALL = "select * from boards";
	String BOARD_SELECT = "select * from boards where idx = ?";
	String BOARD_INSERT = "";
	String BOARD_UPDATE = "";
	String BOARD_DELETE = "delete from boards where idx = ?";
	
//	POST TABLE QUERY
	String POST_SELECT_ALL = "select * from post where idx = ? and bid = ?";
	String POST_SELECT = "select * from post where idx = ?";
	String POST_INSERT = "";
	String POST_UPDATE = "";
	String POST_DELETE = "delete from post where idx = ?";
	
//	COMMENTS TABLE QUERY
	
	
//	FILES TABLE QUERY
	
	
}