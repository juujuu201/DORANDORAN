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

	String id=request.getParameter("id");
	String pw=request.getParameter("pw");

	Boolean isLogin=false;
	
	//db연결
    Connection conn=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    
    try{
    	conn=DBConnection.getCon();
    	String sql="select id, pw from member where id='"+id+"' and pw='"+pw+"'";
    	pstmt=conn.prepareStatement(sql);
    	rs=pstmt.executeQuery();
    	
    	while(rs.next()){
  			//isLogin=true;
    		%>
  			<script>
  				var id="<%=id%>";
  				alert(id+"님 로그인되었습니다");
  				<%session.setAttribute("id", id); //세션%>
  				location.href="index.jsp";
  			</script>
  				  			
<%
  		}//while
  		
  		
    }//try
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
	//if(id.equals(디비에서 불러온 id값) && pw.equals(디비에서 불러온 id값))
	//세션 값 설정해주고
	//메인 페이지로 이동
	
	//else
	//alert창 띄우고
	//로그인 창 다시 불러옴
%>

</body>
</html>