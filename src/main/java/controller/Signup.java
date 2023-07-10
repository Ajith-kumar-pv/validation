package controller;


import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.User_dao;
import dto.User_dto;

@WebServlet("/save")
public class Signup extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
            User_dto dto=new User_dto();
		
		dto.setEmail(req.getParameter("email"));
		dto.setName(req.getParameter("name"));
		dto.setPassword(req.getParameter("pwd"));
		dto.setMobile(Long.parseLong(req.getParameter("mob")));
		
		User_dao dao=new User_dao();
		dao.save(dto);
		//resp.getWriter().print("<h1>done<h1>");
		req.getRequestDispatcher("LoginPage.html").include(req, resp);
		
		
		
		
		
	}

		
		
	
	

}
