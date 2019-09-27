<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="fo" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Add Product
	<table>
		<fo:form action="pagesubmit" method="POST" modelAttribute="model">
			<tr>
				<td>Product ID</td>
				<td><fo:input path="prodId" /></td>
				<td><fo:errors path="prodId"></fo:errors></span></td>
			</tr>
			
			<tr>
				<td>Product Name</td>
				<td><fo:input path="prodName" /></td>
				<td><fo:errors path="prodName"></fo:errors></span></td>
			</tr>

			<tr>
				<td>Product Type</td>
				<td><fo:select path="type" items="${dataitem }" /></td>
				<td><fo:errors path="type"></fo:errors></span></td>
			</tr>
			
			<tr>
				<td>Product features</td>
				<!-- <td><input TYPE=checkbox name="features" value="${dataitem2 }"></td> -->
				<td>
					<input type="radio" name="features" value="Automatic" checked> Automatic<br>
					<input type="radio" name="features" value="Manual" > Manual<br>
				</td>
				<td><fo:errors path="features"></fo:errors></span></td>
 			</tr>
 			
 			<tr>
				<td>Product online</td>
				<td>
					<input type="checkbox" name="online" value="Yes" > Yes<br>
					<input type="checkbox" name="online" value="No" > No<br>
				</td>
				<td><fo:errors path="online"></fo:errors></span></td>
 			</tr>
			
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</fo:form>
	</table>
	
</body>
</html>