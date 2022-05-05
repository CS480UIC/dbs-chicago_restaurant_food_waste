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
  <h1>Update Garbage Truck</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	truck_id    :<input type="text" name="truck_id" value="${garbage_truck.truck_id }" disabled/>
	<br/>
	
	restaurant_id：<input type="text" name="restaurant_id" value="${garbage_truck.restaurant_id }" disabled />
	<br/>
	truck_capacity	：<input type="text" name="truck_capacity" value="${garbage_truck.truck_capacity }" disabled/>
	<br/>
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/GarbageTruckServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
				<input type="hidden" name="truck_id" value="${garbage_truck.truck_id }"/>
	restaurant_id：<input type="text" name="restaurant_id" value="${form.restaurant_id }"/>
	<span style="color: red; font-weight: 900">${errors.password }</span>
	<br/>
	truck_capacity	：<input type="text" name="truck_capacity" value="${form.truck_capacity }"/>
	<span style="color: red; font-weight: 900">${errors.truck_capacity }</span>
	<br/>
	<input type="submit" value="Update Garbage Truck"/>
</form>

</body>
</html>
