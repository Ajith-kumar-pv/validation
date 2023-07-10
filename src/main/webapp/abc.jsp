<%@page import="dto.User_dto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<User_dto> list=(List<User_dto>)request.getAttribute("list"); %>
<table border="1">
<tr>
<th>Name</th>
<th>Email</th>
<th>Password</th>
<th>Mobile</th>
<th>Edit</th>
<th>Delete</th>
</tr>

<% for(User_dto dto:list)
	{%>
	<tr>
	<th> <%=dto.getName() %></th>
	<th><%=dto.getEmail() %> </th>
	<th><%=dto.getPassword() %> </th>
	<th><%=dto.getMobile() %> </th>
	<th><a href="edit.jsp?mob=<%=dto.getMobile()%>"> <button>Edit</button></th> </a> 
	<th><a href="delete?mob=<%=dto.getMobile() %>"> <button>Delete</button></th> </a> 
	
	
	</tr>
	<%} %>
	
</table>
<a href="LoginPage.html"><button style="margin-top: 10px">logout</button></a>
<a href="SignupPage.html"><button style="margin-top: 10px">Add</button></a>

</body>
</html>