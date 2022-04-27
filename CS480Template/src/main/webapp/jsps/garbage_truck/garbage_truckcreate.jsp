<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Garbage Truck Create</title>
    
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
  <h1>Garbage Truck Create</h1>
<form action="<c:url value='/GarbageTruckServletCreate'/>" method="post">
	truck_id    :<input type="text" name="truck_id" value="${form.truck_id }"/>
	<span style="color: red; font-weight: 900">${errors.truck_id }</span>
	<br/>
	restaurant_id：<input type="password" name="restaurant_id" value="${form.restaurant_id }"/>
	<span style="color: red; font-weight: 900">${errors.restaurant_id }</span>
	<br/>
	truck_capacity	：<input type="text" name="truck_capacity" value="${form.truck_capacity }"/>
	<span style="color: red; font-weight: 900">${errors.truck_capacity }</span>
	<br/>
	<input type="submit" value="Create Garbage Truck"/>
</form>
  </body>
</html>
