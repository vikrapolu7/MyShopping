<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
	<c:when test="${mode=='MODE_PRODUCT'}">
	<form method="post" action="/productsubmit">
		<input type="file" name="productimage" placeholder="browser file" value="${product.productimage}">
		<input type="text" name="productname" placeholder="product name" value="${product.productname}">
		<input type="submit" >
	</form>
	</c:when>	
</c:choose>
	
</body>
</html>