<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/mainpage.css">
<style type="text/css">
.card{
	border: 1px solid black;
	
}
.td{
	padding: 10px;
	margin-left: 50px;
}</style>
</head>
<body>

	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<!-- Brand/logo -->

		<c:choose>
			<c:when test="${mode=='MODE_MAIN' }">
				<a class="navbar-brand" href="#"> <!-- <img
					src="./images/profile.jpg" class="rounded-circle pull-right"
					alt="logo" style="height: 50px; width: 50px;"> -->
					<span class="glyphicon glyphicon-user
" aria-hidden="true"></span>
					<p>Hello <span>${vuser.firstName}</span></p>
				</a>
	</nav>
	<br>
	<br>
	<div class="container-fluid">
		<table>
			<tr>
				<td>
					<div class="card" style="width: 300px; height: 200px;">
						<img class="card-img-top" src="./images/i1.jpeg" alt="Card image"
							style="width: 100%"><br>
						<div class="card-body">
&nbsp&nbsp&nbsp&nbsp&nbsp<a href="#" class="btn btn-primary">${vproduct.productname}</a>&nbsp&nbsp&nbsp&nbsp<a href="#" class="btn btn-primary">Buy
								Now</a>
						</div>
					</div>
				</td>
				<td>
					<div class="card" style="width: 300px; height: 200px;">
						<img class="card-img-top" src="" alt="Card image"
							style="width: 100%">
						<div class="card-body">

							&nbsp&nbsp&nbsp&nbsp&nbsp<a href="#" class="btn btn-primary">Add Cart</a>&nbsp&nbsp&nbsp&nbsp <a href="#" class="btn btn-primary">Buy
								Now</a>
						</div>
					</div>

				</td>
				<td>

					<div class="card" style="width: 300px; height: 200px;">
						<img class="card-img-top" src="" alt="Card image"
							style="width: 100%">
						<form action="/buynow" method="post">
						<div class="card-body">

							&nbsp&nbsp&nbsp&nbsp&nbsp<a href="#"  class="btn btn-primary">Add
								cart</a>&nbsp&nbsp&nbsp&nbsp 
								<input type="submit"  class="btn btn-primary" value="Buy Now"></div>
								
								</form>
						</div>
					
				</td>
			</tr>
		</table>


	</div>

	</c:when>
	</c:choose>
	<!-- JQuery -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

	<!-- Popper JS -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

	<!-- Latest compiled JavaScript -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>