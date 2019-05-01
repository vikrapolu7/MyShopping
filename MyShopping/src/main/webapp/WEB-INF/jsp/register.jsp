<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<meta charset="utf-8">
	 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	 <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	 <style type="text/css">
	 	.form-container{
	 		position: absolute;
	 		top : 13vh;
	 		box-shadow: 0px 0px 0px 2px; 
	 		padding: 30px;
	 	}
	 </style>
</head>

<body>
<c:choose>
<c:when test="${mode=='MODE_REGISTER' }">
<div class="container-fluid">
			<section class="row justify-content-center">
				<section class="col-12 col-sm-6 col-md-3">
			<form class="form-container" method="post" action="/registeruser">
				 <div class="form-group">
			    
			    <input type="text" class="form-control" name="firstName" placeholder="Enter first name" value="${user.firstName}">
			    </div>
			     <div class="form-group">
			    <input type="text" class="form-control" name="lastName" placeholder="Enter last name" value="${user.lastName}">
			    </div>
			  <div class="form-group">
			    <input type="email" class="form-control" name="emailId" aria-describedby="emailHelp" placeholder="Enter email" value="${user.emailId}">
			    </div>
			  <div class="form-group">
			    
			    <input type="password" class="form-control" name="password" placeholder="Password" value="${user.password}">
			  </div>
			  <div class="form-group">
			    
			    <input type="password" class="form-control" name="password1" placeholder="Confirm Password">
			  </div>
			  
			  <div class="form-group">
			    
			    <input type="text" class="form-control" name="phoneNumber" placeholder="phone number" value="${user.phoneNumber}">
			  </div>
			  <div class="form-group">
			    
			    <input type="text" class="form-control" name="address" placeholder="enter address" value="${user.address}">
			  </div>
			  <button type="submit" class="btn btn-primary btn-block">Submit</button>
			</form>
			</section>
			</section>
</div>
</c:when>
</c:choose>
	
	<!-- JQuery -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>