package com.msb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialException;

public class MemberLogoutController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws SerialException, IOException {
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession(false);
		if(session != null) {
			session.invalidate();
			System.out.println("session remove");
			out.print("<script>alert('로그아웃 하셨습니다.'); location.href = '/boardSelectAll.do'; </script>");
		} else {
			System.out.println("session not found");
		}
		out.close();
	}

}
