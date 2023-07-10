package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.User_dao;
import dto.User_dto;

@WebServlet("/delete")
public class Delete extends HttpServlet
{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	long mob=Long.parseLong(req.getParameter("mob"));
	User_dao dao=new User_dao();
	User_dto dto=dao.find(mob);
	dao.delete(dto);
	resp.getWriter().print("<h1>Data Deleted succesfully</h1>");
	req.setAttribute("list", dao.fetchAll());
	req.getRequestDispatcher("abc.jsp").include(req, resp);
	
	
}
}
