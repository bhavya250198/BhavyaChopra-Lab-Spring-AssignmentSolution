<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
	<style>
		.container{
		text-align:center;
		}
		a{
		text-decoration:none;
		font-size:16px;
		font-weight:400;
		}
		.form-inline{
			position:relative;
			left:34%;
		}
	</style>
	
	<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

</head>
<body>
	<div class="container">
	<h2>Student-Details</h2>
	<div >
		<h2>Save Student</h2>
		<form class="container" action="/debates/save" method="POST">

			<!-- Add hidden form field to handle update -->
			<input type="hidden" name="sid" value="${debates.sid}" />

			<div class="form-inline">
				<input type="text" name="firstName" value="${debates.firstName}"
					class="form-control mb-4 col-4" placeholder="First Name">



			</div>

			<div class="form-inline">

				<input type="text" name="lastName" value="${debates.lastName}"
					class="form-control mb-4 col-4" placeholder=" Surname">



			</div>

			<div class="form-inline">

				<input type="text" name="emailAddress" value="${debates.email}"
					class="form-control mb-4 col-4" placeholder="Email Address">



			</div>
            <div class="form-inline">

				<input type="text" name="course" value="${debates.course}"
					class="form-control mb-4 col-4" placeholder="Course">



			</div>

			<button type="submit" class="btn btn-info col-2">Save</button>

		</form>

		<hr>
		<a href="/debates/list">Back to Student-Debate List</a>
	</div>
	</div>
</body>

</html>