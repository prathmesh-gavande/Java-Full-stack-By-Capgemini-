<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h2>Welcome, <c:out value="${sessionScope.username}"/></h2>
        <div class="list-group mt-4">
            <a href="registerEmployee.jsp" class="list-group-item list-group-item-action">Register Employee</a>
            <a href="update.jsp" class="list-group-item list-group-item-action">Update Employee</a>
            <a href="delete.jsp" class="list-group-item list-group-item-action">Delete Employee</a>
            <a href="ViewAllServlet" class="list-group-item list-group-item-action">View All Employees</a>
        </div>
    </div>
<%@ include file="footer.jsp" %>
</body>
</html>
