<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page buffer="8kb" autoFlush="true" %> <!-- default라 쓸필요없다. -->
<!-- 
페이지에 어떠한 설정도 없으면
default : buffer=8kb, autoflush=true

-자동flush될때
1.기본적으로 buffer가 full되면 자동 flush
2.page에 더이상 실행할 것이 없으면 자동 flush

 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	for(int i=0; i<10; i++){
%>
	출력값 : <%=i %> 
<%
	}
%>
</body>
</html>