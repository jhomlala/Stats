<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
	<script src="http://code.highcharts.com/highcharts.js"></script>
	<link href='http://fonts.googleapis.com/css?family=Anonymous+Pro' rel='stylesheet' type='text/css'>
    <link href="${pageContext.request.contextPath}/resources/style.css" rel="stylesheet" >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Euro Truck Simulator 2 Multiplayer Stats</title>
</head>



<body>




	<center>
	<img src="${pageContext.request.contextPath}/resources/logohd.png" width="350px" height="200px" />
	<br><h1>ETS2 MP Stats</h1></center>
    <div class="main">
		<c:if test="${player.getId()<0}">
		
			Sorry there is no user with this ID.
		</c:if>
		<c:if test="${player.getId()>0 }">
   
		
		Name: ${player.getName() }<br>
		ID : ${player.getId() }<br>
		Member since : ${player.getJoinDate() }<br>
		Steam profile: <a href="http://steamcommunity.com/profiles/${player.getSteamID64() }" >Profile</a><br>
		Role: ${player.getGroupName() }
		</c:if>
	</div>
	
	
	
	
	
		<div class="stats">
		
	<br> v.0.1 Copyright 2014 Jakub Homlala.
	</div>
	
	
	<script src="${pageContext.request.contextPath}/resources/js/highcharts.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/modules/exporting.js"></script>
</body>
</html>