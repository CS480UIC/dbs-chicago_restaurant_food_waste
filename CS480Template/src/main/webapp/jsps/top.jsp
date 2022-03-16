<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>top</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
	body {
		background: #0ecc41; 
	}
	a {
		text-transform:none;
		text-decoration:none;
	} 
	a:hover {
		text-decoration:underline;
	}
</style>
  </head>
  
  <body>
<h1 style="text-align: center;">Chicago Restaurant Food Waste</h1>
<div style="font-size: 10pt;">
	<c:choose>
		<c:when test="${empty sessionScope.session_user }">
			<a href="<c:url value='/jsps/user/login.jsp'/>" target="_parent">Login</a> |&nbsp; 
			<a href="<c:url value='/jsps/user/regist.jsp'/>" target="_parent">Register</a> |&nbsp; 
	
		</c:when>
		<c:otherwise>
			Hello：${sessionScope.session_user.username };
			<a href="<c:url value='/jsps/user/queries.jsp'/>" target="body">Query Result</a> |&nbsp;&nbsp;
			<a href="<c:url value='/UserServletLogout'/>" target="_parent">Logout</a> |&nbsp; 
			<a href="<c:url value='/jsps/entity1/menu.jsp'/>" target="body">CRUD entity 1</a> |&nbsp;&nbsp;
			<a href="<c:url value='/jsps/restaurant/menu.jsp'/>" target="body">CRUD Restaurant</a> |&nbsp;&nbsp;
			<a href="<c:url value='/jsps/customer/menu.jsp'/>" target="body">CRUD Customer</a> |&nbsp;&nbsp;
			<a href="<c:url value='/jsps/supplier/menu.jsp'/>" target="body">CRUD Supplier</a> |&nbsp;&nbsp;
			<a href="<c:url value='/jsps/garbage_truck/menu.jsp'/>" target="body">CRUD Garbage Truck</a> |&nbsp;&nbsp;
			<a href="<c:url value='/jsps/menu/menu.jsp'/>" target="body">CRUD Menu</a> |&nbsp;&nbsp;
			<a href="<c:url value='/jsps/dumpster/menu.jsp'/>" target="body">CRUD Dumpster</a> |&nbsp;&nbsp;
		</c:otherwise>
	</c:choose>

</div>
  </body>
</html>

