<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>도란도란 : 마이페이지</title>
<link rel="stylesheet" href="css/myPage.css">
<link href="https://fonts.googleapis.com/css?family=Sunflower:300&display=swap" rel="stylesheet">
</head>
<body>
<jsp:include page="top.jsp" flush="false"/><p>
<%
	String id=request.getParameter("id");
%>
<%=id %>님의 마이페이지
</body>
</html>