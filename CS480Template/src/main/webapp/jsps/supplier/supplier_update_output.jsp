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
  <h1>Update Supplier</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	Supplier ID    :<input type="text" name="supplier_id" value="${supplier.supplier_id }" disabled/>
	<br/>
	
	restaurant ID：<input type="text" name="restaurant_id" value="${supplier.restaurant_id }" disabled />
	<br/>
	address	：<input type="text" name="address" value="${supplier.address }" disabled/>
	<br/>
	phone_number	：<input type="text" name="phone_number" value="${supplier.phone_number }" disabled/>
	<br/>
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/SupplierServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
				<input type="hidden" name="supplier_id" value="${supplier.supplier_id }"/>
	restaurant_id：<input type="text" name="restaurant_id" value="${form.restaurant_id }"/>
	<span style="color: red; font-weight: 900">${errors.restaurant_id }</span>
	<br/>
	
	address	：<input type="text" name="address" value="${form.address }"/>
	<span style="color: red; font-weight: 900">${errors.address }</span>
	<br/>
	phone_number	：<input type="text" name="phone_number" value="${form.phone_number }"/>
	<span style="color: red; font-weight: 900">${errors.phone_number }</span>
	<br/>
	<input type="submit" value="Update Supplier"/>
</form>

</body>
</html>
