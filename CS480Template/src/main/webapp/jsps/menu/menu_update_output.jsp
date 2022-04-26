<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Update Menu</title>
    
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
  <h1>Update Menu</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	Menu ID    :<input type="text" name="menu_id" value="${menu.menu_id }" disabled/>
	<br/>
	
	Restaurant ID：<input type="text" name="restaurant_id" value="${menu.restaurant_id }" disabled />
	<br/>
	
	Menu Item	：<input type="text" name="menu_item" value="${menu.menu_item }" disabled/>
	<br/>
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/MenuServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
		<input type="hidden" name="menu_id" value="${menu.menu_id}"/>
	Restaurant ID：<input type="text" name="restaurant_id" value="${form.restaurant_id  }"/>
	<span style="color: red; font-weight: 900">${errors.restaurant_id }</span>
	<br/>
	Menu Item	：<input type="text" name="menu_item" value="${form.menu_item}"/>
	<span style="color: red; font-weight: 900">${errors.menu_item }</span>
	<br/>
	<input type="submit" value="Update Menu"/>
</form>

</body>
</html>
