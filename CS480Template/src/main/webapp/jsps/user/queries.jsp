<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="">
    
    <title>body</title>
    
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
    <h1>Choose a Query!</h1>
    <br>
    <a href="<c:url value='/findAll'/>" target="body">Please list all the user in the table</a>&nbsp;&nbsp;
    <br>
    <a href="<c:url value='/HighCustomers'/>" target="body">List all Customers With Customer ID > 2</a>&nbsp;&nbsp;
    <br>
    <a href="<c:url value='/HighDumpsters'/>" target="body">List all Dumpsters with capacity > 50</a>&nbsp;&nbsp;
    <br>
    <a href="<c:url value='/LowMenu'/>" target="body">List all menu items with menu_id less than 75</a>&nbsp;&nbsp;
    <br>
    <a href="<c:url value='/LowTruck'/>" target="body">List all trucks with capacity less than 55</a>&nbsp;&nbsp;
    <br>
    <a href="<c:url value='/AvgTruckCapacity'/>" target="body">Give average truck capacity</a>&nbsp;&nbsp;
    <br>
    <a href="<c:url value='/ConcatCustomers'/>" target="body">Concatenate customer names</a>&nbsp;&nbsp;
    <br>
    <a href="<c:url value='/DateRestaurant'/>" target="body">Date Format founded date for Zeus Restaurant</a>&nbsp;&nbsp;
    <br>
    <a href="<c:url value='/LowFoodWaste'/>" target="body">List food waste entries under id 25</a>&nbsp;&nbsp;
    <br>
    <a href="<c:url value='/ConcatRestaurant'/>" target="body">List restaurant names and dumpster capacities</a>&nbsp;&nbsp;
    <br>
    <a href="<c:url value='/AvgWasteRestaurant'/>" target="body">List restaurant names and average daily waste</a>&nbsp;&nbsp;
    <br>
    <a href="<c:url value='/LowSupplierCountRestaurant'/>" target="body">List restaurant names and founded dates with less than 5 suppliers</a>&nbsp;&nbsp;
    <br>
    <a href="<c:url value='/FoodWasteTruck'/>" target="body">List food waste entries with truck capacity greater than 25</a>&nbsp;&nbsp;
  </body>
</html>
