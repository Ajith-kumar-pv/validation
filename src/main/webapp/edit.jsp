<%@page import="dto.User_dto"%>
<%@page import="dao.User_dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>update the details</h1>
<% long mob=Long.parseLong(request.getParameter("mob"));
User_dao dao=new User_dao();
User_dto dto=dao.find(mob);
%>
<form action=" update" method="post" >
Email :<input type="text"    value="<%=dto.getEmail() %>"      name="email"    placeholder="xyz@gmail.com"><br>
Moblie :<input type="number" style="margin-top: 20px" value="<%=dto.getMobile()%>"  name="mob"      placeholder="Moblie number"><br>
Name :<input type="text" style="margin-top: 20px" value="<%=dto.getName() %>"       name="name"      placeholder="Usar name"><br>
 Password :<input type="password" style="margin-top: 20px" name="pwd"  value="<%=dto.getPassword() %>"  placeholder="Passward"><br>
 <button type="reset" style="margin-top: 20px"> Cancle </button>
 <button style="margin-left: 70px"> Update </button>
 </form>

</body>
</html>