<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SpringMVC Annotation 적용하기</title>
</head>
<body>
	<h3>TEST_1</h3>
	<a href="hello.do">hello.do</a>
	<!-- http://localhost:8090/SpringMVC_Basic03_Annotation/hello.do -->
	
	<h3>TEST_2 : http전송 : form : method : GET,POST</h3>
	게시판 목록 페이지 링크(글쓰기)<br>
	<a href="article/newArticle.do">글쓰기(newArticle.do)</a>
	
	<h3>TEST_3 : http전송 : form : method : GET,POST (List 컬렉션 처리)</h3>
	<a href="order/order.do">주문하기 화면(order.do)</a>
	
	
	<h3>TEST_4 : parameter 다루기 @RequestParam</h3>
	Default : <a href="search/external.do">external.do</a><br>
	Default2 : <a href="search/external.do?query=100">external.do</a><br>
	Default3 : <a href="search/external.do?p=200">external.do</a><br>
	
	<h3>TEST_5 : (spring에서 cookie사용하기)</h3>
	<a href="cookie/make.do">make.do(쿠키만들기)</a><br>
	<a href="cookie/view.do">view.do(쿠키 읽기)</a>
	
	
	<h3>TEST_6 : CommonsMultipartFile DTO 파일 업로드</h3>
	<a href="image/upload.do">image 파일 업로드</a>
</body>
</html>