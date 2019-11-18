package com.msb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.msb.db.DB;
import com.msb.db.DBQuery;
import com.msb.vo.MemberVO;

public class MemberDAO extends DB {
	
//	member selectAll
	public List<MemberVO> selectMembers() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
			
			con = getConnection();
			pstmt = con.prepareStatement(DBQuery.MEMBER_SELECT_ALL);			
			rs = pstmt.executeQuery();
			list = makeArray(rs);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	
//	member select array
	private List<MemberVO> makeArray(ResultSet rs) throws SQLException {
		List<MemberVO> list = new ArrayList<MemberVO>();
		while(rs.next()) {
			MemberVO dto = new MemberVO(
				rs.getString("idx"),
				rs.getString("id"),
				rs.getString("name"),
				rs.getString("password")
			);
			list.add(dto);
		}
		return list;
	}
	
//	member select
	public MemberVO selectMember(String id) {		
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		try {
			
			con = getConnection();
			pstmt = con.prepareStatement(DBQuery.MEMBER_SELECT);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			list = makeArray(rs);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, con);
		}
		return list.get(0);
	}
	
//	member insert
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
			closeAll(rs, pstmt, con);
		}
		return result;
		
	}
	
//	member id check
	public boolean idAvailableChk(String id) {
		boolean result = false;
		
		try {
			
			con = getConnection();
			pstmt = con.prepareStatement(DBQuery.MEMBER_SELECT);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			if(!rs.next()) result = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, con);
		}
		return result;
	}
	
//	member login Validation
	public int loginCheck(String id, String pass) {
		int result = -1;
		// -1: not found  0: pwd error  1: success
		
		try {
			
			con = getConnection();
			pstmt = con.prepareStatement(DBQuery.MEMBER_SELECT);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				String dbPass = rs.getString("password");
				if (dbPass.equals(pass)) {
					result = 1;
				} else {
					result = 0;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, con);
		}
		return result;
	}
}