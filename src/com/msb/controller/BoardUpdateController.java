package com.msb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialException;

import com.msb.service.BoardService;
import com.msb.vo.BoardVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BoardUpdateController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws SerialException, IOException {
		PrintWriter out = resp.getWriter();
		BoardService Service = new BoardService();
		
		if(req.getMethod().contentEquals("GET")) {
			System.out.println("post update get");
			HttpSession session = req.getSession(false);
			
			// 1. parameter extraction
			String idx = req.getParameter("idx");
			String writer = (String) session.getAttribute("member");
			
	        // 2. Validation
			
	        // 2. Validation
			if(writer == null) {
//				not member
				out.print("<script>alert('로그인 후 사용가능합니다.'); location.href='/views/member/login.jsp'; </script>");
				return;
			}			
	          
	        // 4. Service
			BoardVO board = Service.selectBoard(idx);
			
			if(!board.getWriter().equals(writer)) {
//				authority none
				out.print("<script>alert('해당 작성자가 아니면 수정하실 수 없습니다.'); history.back(); </script>");
				return;
			}
			
	        // 5. Redirection View
	        req.setAttribute("board", board);
	        
			try {
				req.getRequestDispatcher("/views/board/modify.jsp").forward(req, resp);
			} catch (ServletException e) {
				e.printStackTrace();
			}
		}
		
		if(req.getMethod().contentEquals("POST")) {
			int sizeLimit = 10 * 1024 * 1024;
			String savePath = req.getRealPath("file");
			String idx = "";
			String title = "";
			String content = "";
			String writer = "";
			String fileUrl = "";
			String fileName = "";
			MultipartRequest multi = null;
			try {
				multi = new MultipartRequest(req, savePath, sizeLimit, "UTF-8", new DefaultFileRenamePolicy());
				
				idx = multi.getParameter("idx");
				title = multi.getParameter("title");
				content = multi.getParameter("content");
				writer = multi.getParameter("writer");
				
				Enumeration files = multi.getFileNames();
				String file = (String)files.nextElement();
				
				fileUrl = multi.getFilesystemName(file);
				fileName = multi.getOriginalFileName(file);
				
			} catch(Exception e) {
				e.printStackTrace();
			}
	        // 3. VO
			BoardVO board = new BoardVO(idx, title, content, writer, fileUrl, fileName);
	        // 4. Service
			System.out.println("post update post");
			
			Service.updateBoard(board);
			
			out.print("<script>alert('해당 글을 수정하셨습니다.'); location.href='/boardSelect.do?idx="+idx+"'; </script>");
		}
		
		out.close();
	}

}
