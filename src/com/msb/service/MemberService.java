package com.msb.service;

import com.msb.dao.MemberDAO;
import com.msb.vo.MemberVO;

public class MemberService {
	MemberDAO dao = new MemberDAO();
	
//	user join and join Validation
	public String insertMember(MemberVO member) {
		String msg = "";
		
		if(dao.idAvailableChk(member.getId())) {
			dao.insertMember(member);
			msg = "회원가입 하셨습니다.";
		} else {
			msg = "이미 존재하는 아이디 입니다.";
		}
		return msg;
	}
	
//	user login
	public void selectMember(String id) {
		dao.selectMember(id);
	}
	
//	user login Validation
	public int loginCheck(MemberVO member) {
		return dao.loginCheck(member.getId(), member.getPassword());
	}
}