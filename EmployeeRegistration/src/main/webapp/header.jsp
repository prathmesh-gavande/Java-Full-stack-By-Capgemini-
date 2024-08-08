<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title><c:out value="${pageTitle}"/></title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">Employee Management</a>
    <div class="collapse navbar-collapse">
        <ul class="navbar-nav ml-auto">
            <c:if test="${not empty sessionScope.username}">
                <li class="nav-item">
                    <a class="nav-link" href="registerEmployee.jsp">New Registration</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="LogoutServlet">Logout</a>
                </li>
            </c:if>
            <c:if test="${empty sessionScope.username}">
                <li class="nav-item">
                    <a class="nav-link" href="login.jsp">Login</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="registerEmployee.jsp">Register</a>
                </li>
            </c:if>
        </ul>
    </div>
</nav>
