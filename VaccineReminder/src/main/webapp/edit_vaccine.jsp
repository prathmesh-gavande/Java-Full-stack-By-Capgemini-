<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, javax.servlet.*, javax.servlet.http.*, com.vaccine.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Vaccine</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <h1>Edit Vaccine</h1>
    <form action="update_vaccine" method="post">
        <input type="hidden" name="id" value="<%= request.getParameter("id") %>">
        <label for="vaccineName">Vaccine Name:</label>
        <input type="text" id="vaccineName" name="vaccineName" required>
        
        <label for="vaccineDetails">Details:</label>
        <textarea id="vaccineDetails" name="vaccineDetails" required></textarea>
        
        <label for="price">Price:</label>
        <input type="number" id="price" name="price" step="0.01" required>
        
        <label for="months">Months:</label>
        <input type="number" id="months" name="months" required>
        
        <input type="submit" value="Update Vaccine">
    </form>
    <a href="vViewVaccines">Back to Vaccine List</a>
</body>
</html>
