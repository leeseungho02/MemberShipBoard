package com.msb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.msb.db.DB;
import com.msb.db.DBQuery;
import com.msb.vo.BoardVO;
import com.msb.vo.BoardVO;

public class BoardDAO extends DB {
	
//	board selectAll
	public List<BoardVO> selectAllBoard() {
		List<BoardVO> list = new ArrayList<BoardVO>();
		try {
			
			con = getConnection();
			pstmt = con.prepareStatement(DBQuery.POST_SELECT_ALL);			
			rs = pstmt.executeQuery();
			list = makeArray(rs);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	
//	board select array
	private List<BoardVO> makeArray(ResultSet rs)  {
		List<BoardVO> list = new ArrayList<BoardVO>();
		try {
			while(rs.next()) {
				BoardVO dto = new BoardVO(
					rs.getString("idx"),
					rs.getString("title"),
					rs.getString("content"),
					rs.getString("writer"),
					rs.getString("fileUrl"),
					rs.getString("fileName"),
					rs.getString("insert_date"),
					rs.getString("update_date"),
					rs.getString("name"),
					rs.getInt("view")
				);
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
//	board select
	public BoardVO selectBoard(String id) {		
		List<BoardVO> list = new ArrayList<BoardVO>();
		
		try {
			
			con = getConnection();
			pstmt = con.prepareStatement(DBQuery.POST_SELECT);
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
	
//	board insert
	public void insertBoard(BoardVO vo) {
		try {
			
			con = getConnection();
			pstmt = con.prepareStatement(DBQuery.POST_INSERT);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setString(3, vo.getWriter());
			pstmt.setString(4, vo.getFileUrl());
			pstmt.setString(5, vo.getFileName());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, con);
		}
		
	}
	
//	board update
	public void updateBoard(BoardVO vo){
		try{
			con = getConnection();
			pstmt = con.prepareStatement(DBQuery.POST_UPDATE);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setString(3, vo.getFileUrl());
			pstmt.setString(4, vo.getFileName());
			pstmt.setString(5, vo.getIdx());
			
			int r = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			closeAll(pstmt, con);
		}
	}
	
//	board delete
	public boolean deleteBoard(String idx, String writer){
		boolean result = false;
		try{
			
			con = getConnection();
			pstmt = con.prepareStatement(DBQuery.POST_DELETE);
			pstmt.setString(1, idx);
			pstmt.setString(2, writer);
			
			int cnt = pstmt.executeUpdate();
            if(cnt > 0){
                result = true;
            }
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			closeAll(pstmt, con);
		}
		return result;
	}
	
//	board view update
	public void updateView(String idx, int view) {		
		try{
			con = getConnection();
			pstmt = con.prepareStatement(DBQuery.POST_UPDATE_VIEW);
			pstmt.setInt(1, view);
			pstmt.setString(2, idx);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			closeAll(pstmt, con);
		}
	}
}