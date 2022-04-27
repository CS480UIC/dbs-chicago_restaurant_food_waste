<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Supplier Create</title>
    
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
  <h1>Supplier Create</h1>
<form action="<c:url value='/SupplierServletCreate'/>" method="post">
	supplier_id    :<input type="text" name="supplier_id" value="${form.supplier_id }"/>
	<span style="color: red; font-weight: 900">${errors.supplier_id }</span>
	<br/>
	restaurant_id：<input type="text" name="restaurant_id" value="${form.restaurant_id }"/>
	<span style="color: red; font-weight: 900">${errors.restaurant_id }</span>
	<br/>
	address	：<input type="text" name="address" value="${form.address }"/>
	<span style="color: red; font-weight: 900">${errors.address }</span>
	<br/>
	phone_number	：<input type="text" name="phone_number" value="${form.phone_number }"/>
	<span style="color: red; font-weight: 900">${errors.phone_number }</span>
	<br/>
	<input type="submit" value="Create Supplier"/>
</form>
  </body>
</html>
