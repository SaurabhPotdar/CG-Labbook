<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Find Product:
	<form action="searchproduct" method="POST">
		<table>

			<tr>
				<td>Product ID</td>
				<td><input name="pid" /></td>
			</tr>


			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>

		</table>
		</form>
		<br><br>
		<jsp:include page="ShowProduct.jsp"/>
</body>
</html>