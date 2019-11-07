package com.mb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mb.dao.MemberDAO;
import com.mb.vo.MemberVO;

/**
 * Servlet implementation class MemberJoinServlet
 */
@WebServlet("/member/join")
public class MemberJoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberJoinServlet() {
        super();
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
//		MemberVO member = new MemberVO();
//		member.setId(id);
//		member.setName(name);
//		member.setPassword(password);
//		
//		MemberDAO dao = new MemberDAO();
//		int result = dao.checkMember(id);
		System.out.println(id+ " "+ name + " " +  password);
		
//		if(result == 1) {
//			PrintWriter out = response.getWriter();
//			out.print("<script>alert('이미 존재하는 아이디 입니다.');</script>");
//		} else {
////		dao.insertMember(member);
//		}
	}

}
