<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<%	
		Cookie[] cookies=request.getCookies();
		String id="";
		
		for(int i=0; i<cookies.length; i++){
			if(cookies[i].getName().equals("id")){
        		id=cookies[i].getValue();
			}
		}
		
	%>
    <table id="whole">
        <tr>
            <td width="45%"></td>
            <td width="10%"><a href="index.jsp"><img src="img/logo.png" width="80%"></a></td>
            <td width="45%" style="padding-left:20%;">
            <div id="login"></div>
                		<div id="whilelog"><font style="color:#f54e42;"><%=id %></font>님 로그인 중입니다</div><p>
                		<a href="logout.jsp" class="top_menu" style="color:#f54e42;">로그아웃</a>&nbsp;
            </td>
        </tr>
        <tr class="menu">
            <td colspan=3>
                <table width="100%" height="50px">
                    <tr>
                       <td width="30%"></td>
                        <td class="menu_in"><a href="indexx.jsp" target="area">전체도서</a></td>
                        <td class="menu_in"><a href="recentBookk.jsp" target="area">신간도서</a></td>
                        <td class="menu_in"><a href="oldBookk.jsp" target="area">중고도서</a></td>
                        <td class="menu_in"><a href="toMyPage.jsp?id=<%=id%>" target="area">마이페이지</a></td>
                        <td width="30%"></td>
                    </tr>
                </table></td>
        </tr>
    </table>
</body>
</html> 
