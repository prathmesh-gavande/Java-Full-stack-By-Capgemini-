<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, javax.servlet.*, javax.servlet.http.*, com.vaccine.DBUtil" %>
<!DOCTYPE html>
<html>
<head>
    <title>Upcoming Vaccines</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <h1>Upcoming Vaccines (Next 30 Days)</h1>
    <table border="1">
        <tr>
            <th>Child Name</th>
            <th>Vaccine Name</th>
            <th>Date</th>
        </tr>
        <% 
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            String role = (String) session.getAttribute("role"); // Ensure the role is correctly set
            try {
                con = DBUtil.getConnection();
                
                if ("hospital".equals(role)) {
                    ps = con.prepareStatement(
                        "SELECT c.childName, v.vaccineName, l.date " +
                        "FROM vaccineLogs l " +
                        "JOIN child c ON l.childID = c.id " +
                        "JOIN vaccine v ON l.vaccineName = v.vaccineName " +
                        "WHERE l.date BETWEEN CURDATE() AND DATE_ADD(CURDATE(), INTERVAL 30 DAY)");
                } else if ("child".equals(role)) {
                    String email = (String) session.getAttribute("email");
                    // Debugging: Output email to ensure it's correctly retrieved
                    out.println("Email in session: " + email + "<br>");
                    
                    // Retrieve childID from email
                    ps = con.prepareStatement("SELECT id FROM child WHERE id = ?");
                    ps.setString(1, email);
                    ResultSet rsChildID = ps.executeQuery();
                    
                    if (rsChildID.next()) {
                        int childID = rsChildID.getInt("id");
                        
                        ps = con.prepareStatement(
                            "SELECT c.childName, v.vaccineName, l.date " +
                            "FROM vaccineLogs l " +
                            "JOIN child c ON l.childID = c.id " +
                            "JOIN vaccine v ON l.vaccineName = v.vaccineName " +
                            "WHERE l.childID = ? AND l.date BETWEEN CURDATE() AND DATE_ADD(CURDATE(), INTERVAL 30 DAY)");
                        ps.setInt(1, childID);
                    } else {
                        out.println("No child found for the given email.<br>");
                    }
                }
                
                if (ps != null) {
                    rs = ps.executeQuery();
                    while (rs.next()) {
        %>
        <tr>
            <td><%= rs.getString("childName") %></td>
            <td><%= rs.getString("vaccineName") %></td>
            <td><%= rs.getDate("date") %></td>
        </tr>
        <% 
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                out.println("<tr><td colspan='3'>Error retrieving data. Please try again later.</td></tr>");
            } finally {
                if (rs != null) try { rs.close(); } catch (Exception e) {}
                if (ps != null) try { ps.close(); } catch (Exception e) {}
                if (con != null) try { con.close(); } catch (Exception e) {}
            }
        %>
    </table>
    <a href="<%= ("hospital".equals(role)) ? "hospital_dashboard.jsp" : "child_dashboard.jsp" %>">Back to Dashboard</a>
</body>
</html>
