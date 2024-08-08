<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View All Employees</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h2 class="mt-5">View All Employees</h2>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Employee ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Username</th>
                    <th>Address</th>
                    <th>Contact</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="employee" items="${employees}">
                    <tr>
                        <td>${employee.empid}</td>
                        <td>${employee.firstName}</td>
                        <td>${employee.lastName}</td>
                        <td>${employee.userName}</td>
                        <td>${employee.address}</td>
                        <td>${employee.contact}</td>
                    </tr>
                </c:forEach>
            </
