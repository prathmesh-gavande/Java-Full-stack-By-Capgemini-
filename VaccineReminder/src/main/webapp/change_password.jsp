<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Change Password</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <form action="change_password" method="post">
        <label for="currentPassword">Current Password:</label>
        <input type="password" id="currentPassword" name="currentPassword" required>
        <label for="newPassword">New Password:</label>
        <input type="password" id="newPassword" name="newPassword" required>
        <input type="submit" value="Change Password">
    </form>
</body>
</html>
