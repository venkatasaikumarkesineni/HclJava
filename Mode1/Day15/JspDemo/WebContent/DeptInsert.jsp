<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.jsp.DaoConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="DeptInsert.jsp">
     <center>
     Department No:
     <input type="text" name="deptno"/>
     Department Name :
     <input type="text" name="dname"/>
     Location:
     <input type="text" name="loc"/>
     <input type="submit" value="Insert"/>
     </center>
</form>
<%
    if(request.getParameter("deptno")!=null){
    	
    	Connection con=DaoConnection.getConnection();
    	String cmd="insert into dept values(?,?,?)";
    	PreparedStatement pst=con.prepareStatement(cmd);
    	int deptno=Integer.parseInt(request.getParameter("deptno"));
    	String dname=request.getParameter("dname");
    	String loc=request.getParameter("loc");
    	pst.setInt(1,deptno);
    	pst.setString(2,dname);
    	pst.setString(3,loc);
    	out.println("**recoed inserted**");
    	
    	
    	
    }
%>

</body>
</html>