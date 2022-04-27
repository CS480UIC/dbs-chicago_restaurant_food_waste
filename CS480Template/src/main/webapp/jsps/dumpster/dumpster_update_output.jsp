<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Update Dumpster</title>
    
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
  <h1>Update Dumpster</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	dumpster_id    :<input type="text" name="dumpster_id" value="${dumpster.dumpster_id }" disabled/>
	<br/>
	
	restaurant_id：<input type="text" name="restaurant_id" value="${dumpster.restaurant_id }" disabled />
	<br/>
	capacity	：<input type="text" name="capacity" value="${dumpster.capacity }" disabled/>
	<br/>
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/DumpsterServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
				<input type="hidden" name="dumpster_id" value="${dumpster.dumpster_id }"/>
	restaurant_id：<input type="text" name="restaurant_id" value="${form.restaurant_id }"/>
	<span style="color: red; font-weight: 900">${errors.restaurant_id }</span>
	<br/>
	capacity	：<input type="text" name="capacity" value="${form.capacity }"/>
	<span style="color: red; font-weight: 900">${errors.capacity }</span>
	<br/>
	<input type="submit" value="Update Dumpster"/>
</form>

</body>
</html>
