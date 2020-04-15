<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Transfer Form Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<h1 align="center">Transfer Fund</h1>
	<div class="text-center"><a class="btn btn-danger" href="home">Home</a></div>
	<hr/>
	<h2 class="text-center">Do Transfer</h2>
	<c:if test="${msg ne null }">
		<div class="col-md-4 mx-auto alert alert-danger">${msg}</div>
	</c:if>
	<form:form action="submittransfer" method="post" modelAttribute="tbean">
		<table class="col-md-8 table table-striped mx-auto">
		<tr><td>Form Account ID</td><td><form:input path="fromAccountId" type="number"/></td>
		<td><form:errors path="fromAccountId" class="text-danger"/></td></tr>
		
		<tr><td>To Account ID</td><td><form:input path="toAccountId" type="number"/></td>
		<td><form:errors path="toAccountId" class="text-danger"/></td></tr>
		
		<tr><td>Amount</td><td><form:input path="amt" type="number"/></td>
		<td><form:errors path="amt" class="text-danger"/></td></tr>
		
		<tr><td colspan="3"><input type="submit" value="Transfer"/></td></tr>
		</table>
	
	</form:form>
	<hr/>
	
</body>
</html>