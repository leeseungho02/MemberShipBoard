package com.mb.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mb.vo.MemberVO;
import com.mb.dao.MemberDAO;
import com.mb.filter.EncodingFilter;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/member/login")
public class MemberLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberLoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberVO member = new MemberVO();
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		member.setId(id);
		member.setPassword(password);
		
		MemberDAO dao = new MemberDAO();
		dao.selectMember(member);
		int result = dao.checkMember(id);
		if(result == 1) {
			dao.insertMember(member);
		} else if(result == 0){
			
		} else {
			
		}
		
		request.setAttribute("member", member);
		request.getRequestDispatcher("board.jsp").forward(request, response);
	}

}
