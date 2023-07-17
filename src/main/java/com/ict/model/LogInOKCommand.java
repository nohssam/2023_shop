package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.DAO;
import com.ict.db.MemberVO;

public class LogInOKCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String m_id = request.getParameter("m_id");
		String m_pw = request.getParameter("m_pw");
		MemberVO mvo = new MemberVO();
		mvo.setM_id(m_id);
		mvo.setM_pw(m_pw);
		MemberVO m_vo = DAO.getLogIn(mvo);
		if(m_vo != null) {
			// 관리자와 일반회원 분류
			// 로그인 정보는 세션에 넣어서 관리
			request.getSession().setAttribute("m_vo", m_vo);
			request.getSession().setAttribute("login", "ok");
			
			if(m_vo.getM_id().equals("admin") && m_vo.getM_pw().equals("admin")) {
				request.getSession().setAttribute("admin", "ok");
				return "MyController?cmd=admin";
			}
		}else {
			return "MyController?cmd=login";
		}
		
		return "MyController?cmd=list";
	}
}














