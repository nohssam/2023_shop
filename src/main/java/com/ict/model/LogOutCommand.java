package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogOutCommand implements Command{
@Override
public String exec(HttpServletRequest request, HttpServletResponse response) {
	// 세션 초기화   
	request.getSession().invalidate();
	// 세션의 속성만 지우는 방법
	// request.getSession().removeAttribute("");
	return "MyController?cmd=list";
}
}
