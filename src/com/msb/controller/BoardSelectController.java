package com.msb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

import com.msb.service.BoardService;
import com.msb.vo.BoardVO;

public class BoardSelectController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws SerialException, IOException {
		// 1. parameter extraction
		String idx = req.getParameter("idx");
		
        // 2. Service
		BoardService Service = new BoardService();
		BoardVO board = Service.selectBoard(idx);
		
        // 3. Redirection View
        req.setAttribute("board", board);
        Service.updateBoardView(idx, board.getView());
        
		try {
			req.getRequestDispatcher("/views/board/view.jsp").forward(req, resp);
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}

}
