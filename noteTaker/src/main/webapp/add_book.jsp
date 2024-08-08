<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>Please add your book Here..!!</h2>
		<form action="addBookServlet" method="post">
			Title: <input type="text" name="title" required="required"><br>
			<br> Author: <input type="text" name="author"
				required="required"><br>
			<br> Price: <input type="text" name="price" required="required"><br>
			<br> <input type="submit" value="submit"> <input
				type="reset" value="cancel">
		</form>

		<a href="bookList.jsp">Book List</a>

	</div>
</body>
</html>