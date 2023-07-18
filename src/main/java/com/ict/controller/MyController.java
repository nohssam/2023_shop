package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.model.AddCartCommand;
import com.ict.model.AdminCommand;
import com.ict.model.CartDeleteCommand;
import com.ict.model.Command;
import com.ict.model.ContentCommand;
import com.ict.model.EditCountCommand;
import com.ict.model.JoinCommand;
import com.ict.model.ListCommand;
import com.ict.model.LogInCommand;
import com.ict.model.LogInOKCommand;
import com.ict.model.LogOutCommand;
import com.ict.model.ProductAddCommand;
import com.ict.model.ShowCartCommand;

@WebServlet("/MyController")
public class MyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String cmd = request.getParameter("cmd");
		Command comm = null;
		switch (cmd) {
			case "login": comm = new LogInCommand(); break;
			case "loginok": comm = new LogInOKCommand(); break;
			case "join": comm = new JoinCommand(); break;
			case "list": comm = new ListCommand(); break;
			case "content": comm = new ContentCommand(); break;
			case "logout": comm = new LogOutCommand(); break;
			case "addcart": comm = new AddCartCommand(); break;
			case "showcart": comm = new ShowCartCommand(); break;
			case "editcount": comm = new EditCountCommand(); break;
			case "cartdelete": comm = new CartDeleteCommand(); break;
			case "admin": comm = new AdminCommand(); break;
			case "productAdd": comm = new ProductAddCommand(); break;
		}
		String path = comm.exec(request, response);
		request.getRequestDispatcher(path).forward(request, response);
	}
}












