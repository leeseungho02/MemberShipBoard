package com.mb.dao;

import java.sql.SQLException;

import com.mb.db.DB;
import com.mb.model.DBQuery;
import com.mb.vo.MemberVO;

import model.BoardVO;

public class MemberDAO extends DB {
	
	public void selectAllMember() {
//		selectAll();
		boolean result = false;
		
		try {
			
			con = getConnection();
			pstmt = con.prepareStatement(DBQuery.MEMBER_SELECT_ALL);
			
			int n = pstmt.executeUpdate();
			if(n>0) result = true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if(pstmt!=null) pstmt.close();} catch(SQLException e) { }
			try { if(rs!=null) rs.close();} catch(SQLException e) { }
			try { if(con!=null) con.close();} catch(SQLException e) { }
		}
		
	}
	
	public boolean selectMember(MemberVO dto) {
		boolean result = false;
		MemberVO vo = null;
		
		try {
			
			con = getConnection();
			
			pstmt = con.prepareStatement(DBQuery.MEMBER_SELECT);	
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPassword());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
//				rs.getString("idx)
//				rs.getString("id")
//				rs.getString("name")
//				rs.getString("password")
//				vo = new MemberVO();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if(pstmt!=null) pstmt.close();} catch(SQLException e) { }
			try { if(rs!=null) rs.close();} catch(SQLException e) { }
			try { if(con!=null) con.close();} catch(SQLException e) { }
		}
		
		return result;
	}
	
	public boolean insertMember(MemberVO dto) {
		
		boolean result = false;
		
		try {
			
			con = getConnection();
			
			pstmt = con.prepareStatement(DBQuery.MEMBER_INSERT);
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
	
	public void updateMember(MemberVO dto) {
//		update
		boolean result = false;
		
		try {
			
			con = getConnection();
			String sql = "UPDATE `members` SET `name`= ?,`password`= ? WHERE idx = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getId());
			
			int n = pstmt.executeUpdate();
			if(n>0) result = true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if(pstmt!=null) pstmt.close();} catch(SQLException e) { }
			try { if(rs!=null) rs.close();} catch(SQLException e) { }
			try { if(con!=null) con.close();} catch(SQLException e) { }
		}
	}
	
	public void deleteMember(String idx) {
//		delete
		
		boolean result = false;
		
		try {
			
			con = getConnection();
			String sql = "delete from members where idx = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, idx);
			
			int n = pstmt.executeUpdate();
			if(n>0) result = true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if(pstmt!=null) pstmt.close();} catch(SQLException e) { }
			try { if(rs!=null) rs.close();} catch(SQLException e) { }
			try { if(con!=null) con.close();} catch(SQLException e) { }
		}
	}
	
}