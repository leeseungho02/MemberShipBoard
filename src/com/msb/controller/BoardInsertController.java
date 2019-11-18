package com.msb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialException;

import com.msb.service.BoardService;
import com.msb.vo.BoardVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BoardInsertController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws SerialException, IOException {
		PrintWriter out = resp.getWriter();

		// 1. parameter extraction
		int sizeLimit = 10 * 1024 * 1024;
		String savePath = req.getRealPath("file");
		String title = "";
		String content = "";
		String writer = "";
		String fileUrl = "";
		String fileName = "";
		MultipartRequest multi = null;
		try {
			multi = new MultipartRequest(req, savePath, sizeLimit, "UTF-8", new DefaultFileRenamePolicy());
			
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
		BoardVO board = new BoardVO(title, content, writer, fileUrl, fileName);
         
        // 4. Service
		BoardService Service = new BoardService();
		Service.insertBoard(board);
        System.out.println("post insert");
        // 5. Redirection View
        out.print("<script>alert('글 작성하셨습니다.'); location.href='/boardSelectAll.do'; </script>");
        out.close();
	}

}
