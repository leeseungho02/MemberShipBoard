package com.msb.db;

public interface DBQuery {
//	MEMBER TABLE QUERY
	String MEMBER_SELECT_ALL = "select * from member";
	String MEMBER_SELECT = "select * from member where id = ?";
	String MEMBER_INSERT = "INSERT INTO `member`(`id`, `name`, `password`) VALUES (?, ?, ?)";
	
//	POST TABLE QUERY
	String POST_SELECT_ALL = "select p.*, m.name from post as p join member as m on p.writer = m.id;";
	String POST_SELECT = "select p.*, m.name from post as p join member as m on p.writer = m.id where p.idx = ?";
	String POST_INSERT = "INSERT INTO `post`(`title`, `content`, `writer`, `fileUrl`, `fileName`, `insert_date`, `update_date`) VALUES (?, ?, ?, ?, ?, now(), now())";
	String POST_UPDATE = "update `post` set `title`= ?,`content`= ?, `fileUrl` = ?, `fileName` = ?, `update_date`= now() where idx = ?";
	String POST_DELETE = "DELETE FROM `post` WHERE idx = ? and writer = ?";
	String POST_UPDATE_VIEW = "update post set view = ? + 1 WHERE idx = ?";
}
