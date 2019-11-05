package com.mb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB {
	protected Connection con = null;
	protected PreparedStatement pstmt = null;
	protected ResultSet rs = null;
	
	protected Connection getConnection() {
		con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/kxZVbpXtwG","kxZVbpXtwG","QgmMNophnL");
		} catch (ClassNotFoundException e) {
			System.out.println("driver not found");
		} catch (SQLException e) {
			System.out.println("DB connection failed");
		}
		return con;
	}
	
	protected void selectAll() {
		
	}
	
	protected void insert(Object VO) {
		
	}
	
	protected void update() {
		
	}
	
	protected void delete() {
		
	}
	
	protected static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			close(con, pstmt);
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected static void close(Connection con, PreparedStatement pstmt) {
		try {
			con.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}