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
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		MemberDAO dao = new MemberDAO();
		
		int result = dao.loginCheck(id, password);
		if(result == 1) {
//			로그인성공
			request.setAttribute("member", dao.loginCheck(id, password));
			request.getRequestDispatcher("board.jsp").forward(request, response);
			System.out.println("로그인성공");
		} else if(result == 0){
//			비밀번호틀림
			System.out.println("비밀번호 틀림");
		} else {
//			아이디 다름
			System.out.println("아이디가 존재하지않음");
		}
	}

}
