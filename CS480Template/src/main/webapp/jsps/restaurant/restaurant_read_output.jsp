<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Read Restaurant Output</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <h1>Read Restaurant Output</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	Restaurant ID   :<input type="text" name="username" value="${restaurant.restaurant_id  }" disabled/>
	<br/>
	Name：<input type="text" name="password" value="${restaurant.name}" disabled/>
	<br/>
	Address：<input type="text" name="email" value="${restaurant.address }" disabled/>
	<br/>
	Phone Number：<input type="text" name="email" value="${restaurant.phone_number}" disabled/>
	<br/>
	Founded Date：<input type="text" name="email" value="${restaurant.founded_date}" disabled/>
	<br/>
</form>

<button onclick="window.location.href='<c:url value='/jsps/main.jsp'/>'">Continue</button>
</body>
</html>
