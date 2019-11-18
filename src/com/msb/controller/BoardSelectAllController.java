package com.msb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

import com.msb.service.BoardService;

public class BoardSelectAllController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws SerialException, IOException {
		String url = "/views/board/board.jsp";
		
		BoardService service = new BoardService();
		
		req.setAttribute("boardList", service.selectAllBoard());
		
		try {
			req.getRequestDispatcher(url).forward(req, resp);
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}

}
