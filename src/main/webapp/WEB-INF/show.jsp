<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isErrorPage="true" %> 
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display one</title>
</head>
<body>
<a href="/languages">Dashboard</a>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
		<h1>Language: <c:out value="${language.name}"/></h1>
		<p>Creator: <c:out value="${language.creator}"/></p>
		<p>Version: <c:out value="${language.version}"/></p>
		<a href="/languages/${language.id}/edit">Edit</a>
		<form action="/languages/${language.id}" method="post">
    		<input type="hidden" name="_method" value="delete">
    		<input type="submit" value="Delete">
		</form>
		<form action="/languages/${book.id}" method="post">
</form>


</body>
</html>