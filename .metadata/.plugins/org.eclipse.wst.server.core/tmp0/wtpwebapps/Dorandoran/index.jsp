<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<%@ page import="doran.db.connection.DBConnection" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>도란도란</title>
<!--
<link rel="shortcut icon" href="img/logo.png">
<link rel="apple-touch-icon" href="img/logo_apple.png">
-->
<link rel="stylesheet" href="css/index.css">
<link href="https://fonts.googleapis.com/css?family=Sunflower:300&display=swap" rel="stylesheet">
</head>
<body>
<jsp:include page="top.jsp" flush="false"/><p>
<%--
    Connection conn=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;
   
    
    pstmt=conn.prepareStatement("select * from BOOK");
    rs=pstmt.executeQuery();
    out.println("<table border=\"1\" style=\"color:black;\">");
    while(rs.next()){
        out.println("<tr>");
        out.println("<td>"+rs.getString("title")+"</td>");
        log(rs.getString("title"));
        out.println("<td>"+rs.getString("writer")+"</td>");
        out.println("<td>"+rs.getString("publisher")+"</td>");
        out.println("<td>"+rs.getString("publish_date")+"</td>");
        out.println("<td>"+rs.getString("stock")+"</td>");
        out.println("<td>"+rs.getString("price")+"</td>");
        out.println("<td>"+rs.getString("genre")+"</td>");
        out.println("<td>"+rs.getString("translator")+"</td>");
        out.println("<td>"+rs.getString("review1")+"</td>");
        out.println("<td>"+rs.getString("review2")+"</td>");
        out.println("</tr>");
    }
    out.println("</table>");
     
    conn.close();
--%>
</body>
</html>