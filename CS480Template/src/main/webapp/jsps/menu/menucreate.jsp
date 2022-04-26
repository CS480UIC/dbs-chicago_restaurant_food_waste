<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Create Menu</title>
    
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
  <h1>Create Menu</h1>
<form action="<c:url value='/MenuServletCreate'/>" method="post">
	Menu ID ：<input type="text" name="menu_id" value="${form.menu_id }"/>
	<span style="color: red; font-weight: 900">${errors.menu_id}</span>
	<br/>
	Restaurant ID :<input type="text" name="restaurant_id" value="${form.restaurant_id }"/>
	<span style="color: red; font-weight: 900">${errors.restaurant_id }</span>
	<br/>
	Menu Item ：<input type="text" name="menu_item" value="${form.menu_item}"/>
	<span style="color: red; font-weight: 900">${errors.menu_item }</span>
	<br/>
	<input type="submit" value="Create Menu"/>
</form>
  </body>
</html>
