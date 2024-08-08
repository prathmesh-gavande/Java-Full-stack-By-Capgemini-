<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, javax.servlet.*, javax.servlet.http.*"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- CSS -->
<link rel="stylesheet" href="css/dashboardstyles.css">
<link rel="stylesheet" href="css/add_vaccine_styles.css">

<!-- Iconscout CSS -->
<link rel="stylesheet"
	href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
<title>Add Child</title>
</head>

<body>
	<nav>
		<div class="logo-name">
			<div class="logo-image">
				<img src="images/logo.png" alt="">
			</div>
			<span class="logo_name">Hospital</span>
		</div>

		<div class="menu-items">
			<ul class="nav-links">
				<li><a href="add_vaccine.jsp"> <i
						class="uil uil-plus-square"></i> <span class="link-name">Add
							Vaccine</span></a></li>
				<li style="background: #EFE8F4;"><a href="view_vaccines.jsp">
						<i class="uil uil-clipboard-alt"></i> <span class="link-name">View
							Vaccines</span>
				</a></li>
				<li><a href="add_child_dashboard.jsp"> <i
						class="uil uil-user-plus"></i> <span class="link-name">Add
							Child</span></a></li>
				<li><a href="view_children.jsp"> <i
						class="uil uil-users-alt"></i> <span class="link-name">View
							Children</span></a></li>
				<li><a href="add_vaccineLog.jsp"> <i
						class="uil uil-file-plus"></i> <span class="link-name">Add
							Vaccine Log</span></a></li>
				<li><a href="upcoming_vaccines.jsp"> <i
						class="uil uil-calendar-alt"></i> <span class="link-name">Upcoming
							Vaccines</span></a></li>
				<li><a href="change_password.jsp"> <i
						class="uil uil-lock-alt"></i> <span class="link-name">Change
							Password</span></a></li>
				<li><a href="HospitalLogout"> <i class="uil uil-signout"></i>
						<span class="link-name">Logout</span></a></li>
			</ul>
		</div>
	</nav>

	<section class="dashboard">
		<div class="top">
			<i class="uil uil-bars sidebar-toggle"></i>
			<div>
				<h1>
					<i class="uil uil-tachometer-fast-alt"></i> Add Child
				</h1>
			</div>
			<img src="images/profile.jpg" alt="">
		</div>

		<div class="dash-content">
			<section class="dash-content-container">
				<form action="add_child" method="post" class="form">
					<div class="input-box">
						<label for="childName">Child Name:</label> <input type="text"
							id="childName" name="childName" required>
					</div>
					<div class="input-box">
						<label for="parentName">Parent Name:</label> <input type="text"
							id="parentName" name="parentName" required>
					</div>
					<div class="input-box">
						<label for="dob">Date of Birth:</label> <input type="date"
							id="dob" name="dob" required>
					</div>
					<div class="input-box">
						<label for="parentContact">Parent Contact:</label> <input
							type="text" id="parentContact" name="parentContact">
					</div>
					<div class="input-box">
						<label for="address">Address:</label>
						<textarea id="address" name="address"></textarea>
					</div>
					<button type="submit">Add Child</button>
				</form>
			</section>
		</div>
	</section>

	<script>
        const body = document.querySelector("body"),
              modeToggle = body.querySelector(".mode-toggle"),
              sidebar = body.querySelector("nav"),
              sidebarToggle = body.querySelector(".sidebar-toggle");

        let getStatus = localStorage.getItem("status");
        if(getStatus && getStatus === "close"){
            sidebar.classList.toggle("close");
        }

        sidebarToggle.addEventListener("click", () => {
            sidebar.classList.toggle("close");
            if(sidebar.classList.contains("close")){
                localStorage.setItem("status", "close");
            } else {
                localStorage.setItem("status", "open");
            }
        });
    </script>
</body>
</html>
