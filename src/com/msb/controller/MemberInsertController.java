package com.msb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

import com.msb.service.MemberService;
import com.msb.vo.MemberVO;

public class MemberInsertController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws SerialException, IOException {
		PrintWriter out = resp.getWriter();
		// 1. parameter extraction
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String passwordCheck = req.getParameter("passwordCheck");
		 
        // 2. Validation
		if(!password.equals(passwordCheck)) {
			System.out.println("비밀번호와 비밀번호 확인이 같지 않습니다.");
		}
         
        // 3. VO
		MemberVO member = new MemberVO(id, name, password);
         
        // 4. Service
		MemberService Service = new MemberService();
        Service.insertMember(member);
        
        // 5. Redirection View
        out.print("<script>alert('회원가입 하셨습니다.'); location.href='/views/member/login.jsp'; </script>");
	}

}
