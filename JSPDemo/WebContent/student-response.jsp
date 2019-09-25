<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>

The student is confirmed: ${param.Id} ${param.Name }

<br/><br/>
The student's course: ${param.Qualification}

<br/><br/>
The student's gender is ${param.Gender }

<br/><br/>

<ul>
	<%
		String[] langs = request.getParameterValues("Language");
		for(String temp:langs)
			out.println("<li>" + temp + "</li>");
	%>
</ul>

</body>
</html>