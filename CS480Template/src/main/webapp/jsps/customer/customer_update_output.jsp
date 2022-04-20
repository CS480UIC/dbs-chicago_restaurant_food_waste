<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Update Customer</title>
    
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
  <h1>Update Customer</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	Customer ID    :<input type="text" name="customer_id" value="${entity1.customer_id }" disabled/>
	<br/>
	Email Address：<input type="text" name="email_address" value="${entity1.email_address }" disabled/>
	<br/>
	Name	：<input type="text" name="name" value="${entity1.name }" disabled/>
	<br/>
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/CustomerServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
				<input type="hidden" name="customer_id" value="${entity1.customer_id }"/>
	Email Address：<input type="email_address" name="email_address" value="${form.email_address }"/>
	<span style="color: red; font-weight: 900">${errors.email_address }</span>
	<br/>
	Name	：<input type="text" name="name" value="${form.name }"/>
	<span style="color: red; font-weight: 900">${errors.name }</span>
	<br/>
	<input type="submit" value="Update Customer"/>
</form>

</body>
</html>
