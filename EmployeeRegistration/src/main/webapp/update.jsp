<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Employee</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h2 class="mt-5">Update Employee</h2>
        <form action="UpdateServlet" method="post">
            <div class="form-group">
                <label for="empid">Employee ID:</label>
                <input type="number" class="form-control" id="empid" name="empid" required>
            </div>
            <div class="form-group">
                <label for="firstName">First Name:</label>
                <input type="text" class="form-control" id="firstName" name="firstName" required>
            </div>
            <div class="form-group">
                <label for="lastName">Last Name:</label>
                <input type="text" class="form-control" id="lastName" name="lastName" required>
            </div>
            <div class="form-group">
                <label for="userName">Username:</label>
                <input type="text" class="form-control" id="userName" name="userName" required>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" class="form-control" id="password" name="password" required>
            </div>
            <div class="form-group">
                <label for="address">Address:</label>
                <input type="text" class="form-control" id="address" name="address" required>
            </div>
            <div class="form-group">
                <label for="contact">Contact:</label>
                <input type="text" class="form-control" id="contact" name="contact" required>
            </div>
            <button type="submit" class="btn btn-primary">Update</button>
        </form>
    </div>
</body>
</html>
