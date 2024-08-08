<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete Employee</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h2 class="mt-5">Delete Employee</h2>
        <form action="DeleteServlet" method="post">
            <div class="form-group">
                <label for="empid">Employee ID:</label>
                <input type="number" class="form-control" id="empid" name="empid" required>
            </div>
            <button type="submit" class="btn btn-danger">Delete</button>
        </form>
    </div>
</body>
</html>
