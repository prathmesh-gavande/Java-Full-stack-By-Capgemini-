<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.sql.*, javax.servlet.*, javax.servlet.http.* ,com.vaccine.DBUtil"%>
<!DOCTYPE html>
<html>
<head>
<title>View Children</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
	<h1>Children</h1>
	<table border="1">
		<tr>
			<th>Child Name</th>
			<th>Parent Name</th>
			<th>Date of Birth</th>
			<th>Contact</th>
			<th>Address</th>
			<th>Actions</th>
		</tr>
		<%
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM child");
			while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getString("childName")%></td>
			<td><%=rs.getString("parentName")%></td>
			<td><%=rs.getDate("dob")%></td>
			<td><%=rs.getString("parentContact")%></td>
			<td><%=rs.getString("address")%></td>
			<td><a href="edit_child.jsp?id=<%=rs.getInt("id")%>">Edit</a>
				<a href="delete_child?id=<%=rs.getInt("id")%>">Delete</a></td>
		</tr>
		<%
		}
		} catch (Exception e) {
		e.printStackTrace();
		} finally {
		if (rs != null)
		try {
			rs.close();
		} catch (Exception e) {
		}
		if (stmt != null)
		try {
			stmt.close();
		} catch (Exception e) {
		}
		if (con != null)
		try {
			con.close();
		} catch (Exception e) {
		}
		}
		%>
	</table>
	<a href="hospital_dashboard.jsp">Back to Dashboard</a>
</body>
</html>
