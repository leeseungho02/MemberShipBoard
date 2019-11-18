package com.msb.service;

import java.util.List;

import com.msb.dao.BoardDAO;
import com.msb.vo.BoardVO;

public class BoardService {
	BoardDAO dao = new BoardDAO();
	
//	board insert
	public void insertBoard(BoardVO board) { 
		dao.insertBoard(board);
	}
	
//	board selectAll
	public List<BoardVO> selectAllBoard() {
		return dao.selectAllBoard();
	}
	
//	board select
	public BoardVO selectBoard(String idx) {
		return dao.selectBoard(idx);
	}
	
//	board update
	public void updateBoard(BoardVO board) {
		dao.updateBoard(board);
	}
	
//	board delete
	public boolean deletBoard(String idx, String writer) {
		return dao.deleteBoard(idx, writer);
	}
	
//	board view update
	public void updateBoardView(String idx, int view) {
		dao.updateView(idx, view);
	}
}