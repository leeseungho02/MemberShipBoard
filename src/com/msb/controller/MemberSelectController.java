package com.msb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialException;

import com.msb.service.MemberService;
import com.msb.vo.MemberVO;

public class MemberSelectController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws SerialException, IOException {
		
		PrintWriter out = resp.getWriter();
		// 1. parameter extraction
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		 
        // 2. Validation
         
        // 3. VO
		MemberVO member = new MemberVO(id, password);
         
        // 4. Service
		MemberService Service = new MemberService();
        int result = Service.loginCheck(member);
		
        // 5. Redirection View
        if(result == 1) {
			HttpSession session = req.getSession();
			session.setAttribute("member", member.getId());
			Service.selectMember(member.getId());
			System.out.println("로그인 성공");
			out.print("<script>alert('로그인 하셨습니다.'); location.href='/boardSelectAll.do'; </script>");
			
		} else if (result == 0) {
			out.print("<script>alert('비밀번호 틀리셨습니다.'); history.back(); </script>");
			System.out.println("비밀번호 틀림");
		} else {
			out.print("<script>alert('존재하지 않은 아이디 입니다.'); history.back(); </script>");
			System.out.println("아이디없음");
		}
	}

}
