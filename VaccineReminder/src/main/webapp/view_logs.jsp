<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, javax.servlet.*, javax.servlet.http.*, com.vaccine.DBUtil" %>
<!DOCTYPE html>
<html>
<head>
    <title>View Vaccine Logs</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <h1>Vaccine Logs</h1>
    <table border="1">
        <tr>
            <th>Vaccine Name</th>
            <th>Date</th>
            <th>Age in Months</th>
        </tr>
        <% 
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            try {
                // Test database connection
                con = DBUtil.getConnection();
                out.println("Database connection successful.<br>");
                
                // Retrieve childID from session as a String and convert to Integer
                String childIdStr = (String) session.getAttribute("email");
                
                if (childIdStr == null || childIdStr.isEmpty()) {
                    out.println("No childID found in session.<br>");
                } else {
                    int childId = Integer.parseInt(childIdStr);
                    out.println("Retrieved childID from session: " + childId + "<br>");
                    
                    // Fetch vaccine logs for the retrieved child ID
                    ps = con.prepareStatement(
                        "SELECT l.vaccineName, l.date, l.ageMonths " +
                        "FROM vaccineLogs l " +
                        "WHERE l.childID = ?");
                    ps.setInt(1, childId);
                    
                    // Execute query and debug
                    try {
                        rs = ps.executeQuery();
                        out.println("Query executed successfully.<br>");
                        
                        boolean hasResults = false;
                        while (rs.next()) {
                            hasResults = true;
        %>
        <tr>
            <td><%= rs.getString("vaccineName") %></td>
            <td><%= rs.getDate("date") %></td>
            <td><%= rs.getInt("ageMonths") %></td>
        </tr>
        <% 
                        }
                        if (!hasResults) {
                            out.println("<tr><td colspan='3'>No vaccine logs found for this child.</td></tr>");
                        }
                    } catch (SQLException sqlEx) {
                        out.println("SQL Exception: " + sqlEx.getMessage() + "<br>");
                        sqlEx.printStackTrace();
                    }
                }
            } catch (Exception e) {
                out.println("Exception: " + e.getMessage() + "<br>");
                e.printStackTrace();
            } finally {
                if (rs != null) try { rs.close(); } catch (Exception e) {}
                if (ps != null) try { ps.close(); } catch (Exception e) {}
                if (con != null) try { con.close(); } catch (Exception e) {}
            }
        %>
    </table>
    <a href="child_dashboard.jsp">Back to Dashboard</a>
</body>
</html>
