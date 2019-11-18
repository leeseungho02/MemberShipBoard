package com.msb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB {
	protected Connection con = null;
	protected PreparedStatement pstmt = null;
	protected ResultSet rs = null;
	
//	DB Connection
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
	
//	DB Maintenance
	protected void closeAll(PreparedStatement ps, Connection conn) {
		try {
			if(ps!=null) {
				ps.close();
			}
			if(conn !=null) {
				conn.close();
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
//	DB Maintenance	
	protected void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) {		
		try {
			if(rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeAll(ps, conn);
	}
}
