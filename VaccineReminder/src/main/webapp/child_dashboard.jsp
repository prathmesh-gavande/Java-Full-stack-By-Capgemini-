<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Child Dashboard</title>
    <link rel="stylesheet" href="css/dashboardstyles.css"> <!-- Link to your CSS file -->
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
</head>
<body>
    <nav>
        <div class="logo-name">
            <div class="logo-image">
                <img src="images/logo.png" alt="Logo">
            </div>
            <span class="logo_name">Child Dashboard</span>
        </div>

        <div class="menu-items">
            <ul class="nav-links">
                <li><a href="view_vaccines.jsp">
                    <i class="uil uil-medical-kit"></i>
                    <span class="link-name">View Vaccines</span>
                </a></li>
                <li><a href="upcoming_vaccines.jsp">
                    <i class="uil uil-calendar-alt"></i>
                    <span class="link-name">Upcoming Vaccines</span>
                </a></li>
                <li><a href="view_logs.jsp">
                    <i class="uil uil-file-alt"></i>
                    <span class="link-name">View Vaccine Logs</span>
                </a></li>
                <li><a href="change_password.jsp">
                    <i class="uil uil-lock-alt"></i>
                    <span class="link-name">Change Password</span>
                </a></li>
                <li><a href="logout">
                    <i class="uil uil-signout"></i>
                    <span class="link-name">Logout</span>
                </a></li>
            </ul>
        </div>
    </nav>

    <section class="dashboard">
        <div class="top">
            <i class="uil uil-bars sidebar-toggle"></i>
            <div>
                <h1><i class="uil uil-tachometer-fast-alt"></i> Dashboard</h1>
            </div>
            <img src="images/profile.jpg" alt="Profile Picture">
        </div>

        <div class="dash-content">
            <div class="overview">
                <div class="title">
                    <i class="uil uil-tachometer-fast-alt"></i>
                    <span class="text">Dashboard</span>
                </div>
                <!-- You can add additional content or widgets here -->
            </div>
        </div>
    </section>

    <script src="js/script.js"></script> <!-- Link to your JS file -->
</body>
</html>
