package com.mb.dao;

import java.sql.SQLException;

import com.mb.db.DB;
import com.mb.db.DBQuery;
import com.mb.vo.MemberVO;

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
			closeAll(pstmt, con);
		}
		
	}
	
	public MemberVO selectMember(String id, String password) {
		boolean result = false;
		MemberVO vo = null;
		
		try {
			con = getConnection();
			
			
			pstmt = con.prepareStatement(DBQuery.MEMBER_SELECT);	
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo = new MemberVO(rs.getString("idx"), rs.getString("id"), rs.getString("name"), rs.getString("password"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, con);
		}
		
		return vo;
	}
	
	public void insertMember(MemberVO dto) {
		
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
			closeAll(pstmt, con);
		}
	}
	
	public void updateMember(MemberVO dto) {
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
			closeAll(pstmt, con);
		}
	}
	
	public void deleteMember(String id) {
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
			closeAll(pstmt, con);
		}
	}
	
	public int checkMember(String id) {
		int result = 0;
		try {
			
			con = getConnection();
			pstmt = con.prepareStatement(DBQuery.MEMBER_CHECK);
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(pstmt, con);
		}
		System.out.println(result);
		return result;
	}
	
	public int loginCheck(String id, String password) {
		int result = 0;
		try {
			
			con = getConnection();
			
			result = checkMember(id);
			
			pstmt = con.prepareStatement(DBQuery.MEMBER_LOGIN_CHECK);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(pstmt, con);
		}
		
		return result;
	}
}