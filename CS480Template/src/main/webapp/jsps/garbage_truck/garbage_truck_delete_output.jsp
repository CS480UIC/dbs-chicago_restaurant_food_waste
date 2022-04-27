<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete Garbage Truck</title>
    
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
  <h1>Delete Garbage Truck</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/GarbageTruckServletDelete'/>" method="post">
	<input type="hidden" name="method" value="delete"/>
		<input type="hidden" name="truck_id" value="${garbage_truck.truck_id }"/>
	truck_id    :<input type="text" name="truck_id" value="${garbage_truck.truck_id }" disabled/>
	<br/>
	
	restaurant_id：<input type="text" name="restaurant_id" value="${garbage_truck.restaurant_id }" disabled/>
	<br/>
	truck_capacity	：<input type="text" name="truck_capacity" value="${garbage_truck.truck_capacity }" disabled/>
	<br/>
	<input type="submit" value="Delete Garbage Truck"/>
</form>

</body>
</html>
