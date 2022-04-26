<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Update Restaurant</title>
    
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
  <h1>Update Restaurant</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	Restaurant ID   :<input type="text" name="restaurant_id" value="${restaurant.restaurant_id  }" disabled/>
	<br/>
	
	Name：<input type="text" name="name" value="${restaurant.name}" disabled/>
	<br/>
	Address：<input type="text" name="address" value="${restaurant.address }" disabled/>
	<br/>
	Phone Number：<input type="text" name="phone_number" value="${restaurant.phone_number}" disabled/>
	<br/>
	Founded Date：<input type="text" name="founded_date" value="${restaurant.founded_date}" disabled/>
	<br/>
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/RestaurantServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
		<input type="hidden" name="restaurant_id" value="${restaurant.restaurant_id }"/>
	Name：<input type="text" name="name" value="${form.name }"/>
	<span style="color: red; font-weight: 900">${errors.name}</span>
	<br/>
	Address：<input type="text" name="address" value="${form.address }"/>
	<span style="color: red; font-weight: 900">${errors.address}</span>
	<br/>
	Phone Number：<input type="text" name="phone_number" value="${form.phone_number }"/>
	<span style="color: red; font-weight: 900">${errors.phone_number }</span>
	<br/>
	Founded Date：<input type="text" name="founded_date" value="${form.founded_date }"/>
	<span style="color: red; font-weight: 900">${errors.founded_date}</span>
	<br/>
	<input type="submit" value="Update Restaurant"/>
</form>

</body>
</html>
