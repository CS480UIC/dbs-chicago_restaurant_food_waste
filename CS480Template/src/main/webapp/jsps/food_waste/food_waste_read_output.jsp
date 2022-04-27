<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Read Entity Output</title>
    
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
  <h1>Read Food Waste Output</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	food_waste_id    :<input type="text" name="food_waste_id" value="${food_waste.food_waste_id }" disabled/>
	<br/>
	restaurant_id：<input type="text" name="restaurant_id" value="${food_waste.restaurant_id }" disabled/>
	<br/>
	avg_daily_waste	：<input type="text" name="avg_daily_waste" value="${food_waste.avg_daily_waste }" disabled/>
	<br/>
</form>

<button onclick="window.location.href='<c:url value='/jsps/main.jsp'/>'">Continue</button>
</body>
</html>
