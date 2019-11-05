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
	
	protected void closeAll(PreparedStatement ps, Connection conn) {
		if(ps!=null)
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if(conn !=null)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	protected void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) {
		if(rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		closeAll(ps, conn);
	}
}