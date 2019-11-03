package com.mb.dao;

import java.sql.SQLException;

import com.mb.db.DB;
import com.mb.vo.MemberVO;

public class MemberDAO extends DB {
	
	public void selectAllMember() {
//		selectAll();
	}
	
	public void selectMember() {
//		select()
	}
	
	public boolean insertMember(MemberVO dto) {
//		insert(dto);
		
		boolean result = false;
		
		try {
			
			con = getConnection();
			String sql = "insert into members (id, name, password) values (?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getPassword());
			
			int n = pstmt.executeUpdate();
			if(n>0) result = true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if(pstmt!=null) pstmt.close();} catch(SQLException e) { }
			try { if(rs!=null) rs.close();} catch(SQLException e) { }
			try { if(con!=null) con.close();} catch(SQLException e) { }
		}
		
		return result;
	}
	
	public void updateMember() {
//		update
	}
	
	public void deleteMember() {
//		delete
	}
	
}