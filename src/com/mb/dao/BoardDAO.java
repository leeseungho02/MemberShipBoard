package com.mb.dao;

import java.sql.SQLException;

import com.mb.db.DB;
import com.mb.model.DBQuery;
import com.mb.vo.MemberVO;

public class BoardDAO extends DB{
	
	public void selectAllBard() {
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
			close(con, pstmt, rs);
		}
		
	}
	
	public boolean selectBoard(MemberVO dto) {
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
//				rs.getString("name")s
//				rs.getString("password")
//				vo = new MemberVO();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		
		return result;
	}
	
	public void insertBoard(MemberVO dto) {
		
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
			close(con, pstmt, rs);
		}
	}
	
	public void updateBoard(MemberVO dto) {
//		update
		boolean result = false;
		
		try {
			
			con = getConnection();
			pstmt = con.prepareStatement(DBQuery.MEMBER_UPDATE);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getIdx());
			
			int n = pstmt.executeUpdate();
			if(n>0) result = true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
	}
	
	public void deleteBoard(String id) {
//		delete
		
		boolean result = false;
		
		try {
			
			con = getConnection();
			pstmt = con.prepareStatement(DBQuery.MEMBER_DELETE);
			pstmt.setString(1, id);
			
			int n = pstmt.executeUpdate();
			if(n>0) result = true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
	}
}
