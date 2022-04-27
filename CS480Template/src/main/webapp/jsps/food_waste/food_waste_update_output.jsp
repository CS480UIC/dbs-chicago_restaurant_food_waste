<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete Entity</title>
    
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
  <h1>Update Food Waste</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	Foodwaste ID    :<input type="text" name="food_waste_id" value="${food_waste.food_waste_id }" disabled/>
	<br/>
	
	avg_daily_waste：<input type="text" name="avg_daily_waste" value="${food_waste.avg_daily_waste }" disabled />
	<br/>
	restaurant_id	：<input type="text" name="restaurant_id" value="${food_waste.restaurant_id }" disabled/>
	<br/>
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/FoodWasteServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
				<input type="hidden" name="food_waste_id" value="${food_waste.food_waste_id }"/>
	avg_daily_waste：<input type="text" name="avg_daily_waste" value="${form.avg_daily_waste }"/>
	<span style="color: red; font-weight: 900">${errors.password }</span>
	<br/>
	
	restaurant_id	：<input type="text" name="restaurant_id" value="${form.restaurant_id }"/>
	<span style="color: red; font-weight: 900">${errors.restaurant_id }</span>
	<br/>
	
	
	
	<input type="submit" value="Update Food Waste"/>
</form>

</body>
</html>
