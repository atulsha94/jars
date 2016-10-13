<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Case Display</title>
</head>
<body>
	<center>
		<h2>Bellow are test case details</h2>
		<table>
			<tr>
				<td>Test Case Id</td>
				<td>Test Case Name</td>
				<td>Test Case Description</td>
			</tr>
			<tr>
				<td>${testCaseDTO.id}</td>
				<td>${testCaseDTO.testCaseName}</td>
				<td>${testCaseDTO.testCaseDescription}</td>
			</tr>
		</table>
	</center>
</body>
</html>