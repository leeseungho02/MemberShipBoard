package com.msb.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HashMap<String, Controller> list = null;

	@Override
	public void init(ServletConfig config) throws ServletException {
		list = new HashMap<String, Controller>();
		
//		member
		list.put("/memberLogin.do", new MemberSelectController());
		list.put("/memberInsert.do", new MemberInsertController());
		list.put("/memberLogout.do", new MemberLogoutController());
		
//		board
		list.put("/boardSelectAll.do", new BoardSelectAllController());
		list.put("/boardInsert.do", new BoardInsertController());
		list.put("/boardSelect.do", new BoardSelectController());
		list.put("/boardUpdate.do", new BoardUpdateController());
		list.put("/boardDelete.do", new BoardDeleteController());
	}
	
	 @Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
//		request response Encoding
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
//		url path control
		String url = req.getRequestURI();
		String contextPath = req.getContextPath();
		String path = url.substring(contextPath.length());
	    Controller subController  = list.get(path);
	    try {
			subController.execute(req, resp);
		} catch (SerialException e) {
			e.printStackTrace();
		} 
	}
}
