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
<%
	//db연결
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	try{
    	conn=DBConnection.getCon();
    	String sql="select * from book where publish_date >= SYSDATE-30";
    	pstmt=conn.prepareStatement(sql);
    	rs=pstmt.executeQuery();%>
		
		<table>
			<tr>
				<td>제목</td>
				<td>작가</td>
				<td>출판사</td>
				<td>출판일</td>
				<td>재고</td>
				<td>가격</td>
				<td>장르</td>
				<td>번역자</td>
				<td>이미지</td>
			</tr>
			<%
			while(rs.next()){%>
				<tr>
					<td><%=rs.getString("title") %></td>
					<td><%=rs.getString("writer") %></td>
					<td><%=rs.getString("publisher") %></td>
					<td><%=rs.getString("publish_date") %></td>
					<td><%=rs.getInt("stock") %></td>
					<td><%=rs.getInt("price") %></td>
					<td><%=rs.getString("genre") %></td>
					<td><%=rs.getString("translator") %></td>
					
				</tr>	
			<%}%>
		</table>
		    	
<%}//try
    catch(SQLException e){
    	System.out.println(e.getMessage());
    }
    finally{
		try{
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		}
		catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}
%>
</body>
</html>