<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false"%>
<%@include file="home.jsp"%>

<html>
<head>

</head>
<body>
	<!-- Text input-->
	<div class="form-group">
		<br>
		<form:form action="registration/user" commandName="user" method="POST">
			<form:input path="name" placeholder="Name" required="" />
			<br>
			<br>
			<span class="error"></span>

			<form:input path="email" placeholder="Email" required="" />
			<br>
			<br>
			<span class="error"></span>

			<form:input path="password" placeholder="Password" type="password"
				required="" />
			<br>
			<br>
			<span class="error"></span>

			<form:input path="contact" placeholder="Phone" required="" />
			<br>
			<br>
			<span class="error"></span>

			<form:select path="role">
				<form:option value="USER">User</form:option>
				<form:option value="SUPPLIER">Supplier</form:option>
			</form:select>
			<button type="submit" class="btn btn-default">Submit</button>
		</form:form>
	</div>
</body>
</html>