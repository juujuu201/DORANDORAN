<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.sql.*"%>
<%@ page import="doran.db.connection.DBConnection" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");

	String title=request.getParameter("title");
	String writer=request.getParameter("writer");
	String publisher=request.getParameter("publisher");
	String publish_date=request.getParameter("publish_date");
	int amount=Integer.parseInt(request.getParameter("amount"));
	int price=Integer.parseInt(request.getParameter("price"));
	int genre=Integer.parseInt(request.getParameter("genre"));
	String translator=request.getParameter("translator");
	
	String genree="";
	
	switch(genre){
		case 0 : genree="총류"; break;
		case 1 : genree="철학"; break;
		case 2 : genree="종교"; break;
		case 3 : genree="사회과학"; break;
		case 4 : genree="순수과학"; break;
		case 5 : genree="기술과학"; break;
		case 6 : genree="예술"; break;
		case 7 : genree="언어"; break;
		case 8 : genree="문학"; break;
		case 9 : genree="역사"; break;
		default: genree="분류 없음"; break;
	}
	
	//db연결
	Connection conn=null;
	PreparedStatement pstmt=null;
	String sql="insert into book(title, writer, publisher, publish_date, stock, price, genre, translator) values(?,?,?,?,?,?,?,?)";
	int n=0;
	
	try{
		conn=DBConnection.getCon();
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1,title);
		pstmt.setString(2,writer);
		pstmt.setString(3,publisher);
		pstmt.setString(4,publish_date);
		pstmt.setInt(5,amount);
		pstmt.setInt(6,price);
		pstmt.setString(7,genree);
		pstmt.setString(8,translator);
		
		n=pstmt.executeUpdate();
	}
	catch(SQLException e){
		System.out.println(e.getMessage());
	}
	finally{
		try{
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		}
		catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}
%>
<script>
	var title="<%=title%>";
	if(<%=n%>>0){
		alert("책 \'"+title+"\'이 등록되었습니다 :)");
		location.href="index.jsp";
	}
	else{
		alert("책 등록에 실패하였습니다 :(");
		history.go(-1);
	}
</script>
</body>
</html>