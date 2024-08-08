
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Vaccine Log</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <h1>Add Vaccine Log</h1>
    <form action="add_vaccine_log" method="post">
        <label for="childID">Child ID:</label>
        <input type="number" id="childID" name="childID" required>
        
        <label for="vaccineName">Vaccine Name:</label>
        <input type="text" id="vaccineName" name="vaccineName" required>
        
        <label for="date">Date:</label>
        <input type="date" id="date" name="date" required>
        
        <label for="ageMonths">Age (Months):</label>
        <input type="number" id="ageMonths" name="ageMonths" required>
        
        <input type="submit" value="Add Vaccine Log">
    </form>
    <a href="hospital_dashboard.jsp">Back to Dashboard</a>
</body>
</html>
