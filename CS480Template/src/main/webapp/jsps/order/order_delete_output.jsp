<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete an Order</title>
    
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
  <h1>Delete an Order</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/OrderServletDelete'/>" method="post">
	<input type="hidden" name="method" value="delete"/>
		<input type="hidden" name="order_id" value="${entity1.order_id }"/>
	Order ID    :<input type="text" name="order_id" value="${entity1.order_id }" disabled/>
	<br/>
	Customer ID：<input type="text" name="customer_id" value="${entity1.customer_id }" disabled/>
	<br/>
	Restaurant ID	：<input type="text" name="restaurant_id" value="${entity1.restaurant_id }" disabled/>
	<br/>
	<input type="submit" value="Delete Order"/>
</form>

</body>
</html>
