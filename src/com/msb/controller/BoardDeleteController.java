package com.msb.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialException;

import com.msb.service.BoardService;
import com.msb.vo.BoardVO;

public class BoardDeleteController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws SerialException, IOException {
		PrintWriter out = resp.getWriter();
		
		// 1. parameter extraction
		String idx = req.getParameter("idx");
		HttpSession session = req.getSession(false);
		String writer = (String) session.getAttribute("member");
		
        // 2. Validation
		if(writer == null) {
//			not member
			out.print("<script>alert('로그인 후 사용가능합니다.'); location.href='/views/member/login.jsp'; </script>");
		}
          
        // 4. Service
		BoardService Service = new BoardService();
		BoardVO board = Service.selectBoard(idx);
		String url = board.getFileUrl();
		String uploadName = req.getRealPath("file") + "/" + url;
		File uploadFile = new File(uploadName);
		
		if(Service.deletBoard(idx, writer)) {
//			post delete
			if(uploadFile.exists() && uploadFile.isFile()) {
				uploadFile.delete();
			}
			out.print("<script>alert('해당 글을 삭제하셨습니다.'); location.href='/boardSelectAll.do'; </script>");
		} else {
//			authority none
			out.print("<script>alert('해당 작성자가 아니면 삭제하실 수 없습니다.'); history.back(); </script>");
		}
		
        // 5. Redirection View
		
	}

}
