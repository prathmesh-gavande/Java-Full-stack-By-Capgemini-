<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="LoginServlet" method="get" >
		<h1 >Login Page</h1>
		<label for="username">Username:</label>
        <input type="text" id="username" name="username" placeholder="username" required><br><br>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" placeholder="password" required><br><br>
        
		<button inputmode="text" name="submit" value="submit">Submit</button>
		<button inputmode="text" name="cancel" value="reset">Reset</button>
	</form>
</body>
</html>