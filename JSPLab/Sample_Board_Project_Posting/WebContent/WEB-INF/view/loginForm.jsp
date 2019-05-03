<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script type="text/javascript" src="https://static.nid.naver.com/js/naverLogin_implicit-1.0.2.js" charset="utf-8"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
<style>
    .help-block {
        color: red;
        font-size: 12px;
    }    
</style>
<title>Insert title here</title>
</head>
<body>
		<%@ include file="/WEB-INF/view/header.jsp" %>
		<section>
		<h3>로그인</h3>
		
		<form action="/login.do" method="post">
			<div class="form-group">
				<label for="email">이메일 주소</label> 
                <input type="text"
						class="form-control" id="email" name="email" placeholder="이메일 주소">
				<p class="help-block" id="email-error"></p>
			</div>
			<div class="form-group">
				<label for="pwd">비밀번호</label> 
                <input type="password"
						class="form-control" id="password" name="password" placeholder="비밀번호 (영문+숫자혼합 8자리 이상)">
				<c:if test="${!errors.idOrPwNotMatch }"> 
					<p class="help-block" id="password-error"></p>
				</c:if>
				<c:if test="${errors.idOrPwNotMatch }"> 
					<p class="help-block" id="password-error">*이메일 혹은 패스워드를 다시 한 번 확인하세요.</p>
				</c:if>
				
			</div>
			<div class="checkbox">
				<label><input type="checkbox" name="remember" checked="checked">로그인 유지</label> <br>
				<a href="/findPwd.do">비밀번호가 기억나지 않으신다구요?</a>
			</div>

			<button type="submit" id="btn_submit" class="btn btn-primary btn-block">로그인</button>
			<a href="/join.do" class="btn btn-primary btn-block" role="button">회원가입</a>
			<br>
			<div id="naver_id_login"></div>
  			<!-- //네이버아이디로로그인 버튼 노출 영역 -->
			<script type="text/javascript">
				var naver_id_login = new naver_id_login("EDVRCkCrw7wo3UNay3lP",
						"http://localhost:8080/callback.html");
				var state = naver_id_login.getUniqState();
				naver_id_login.setButton("green", 3, 40);
				naver_id_login.setDomain("http://localhost:8080/");
				naver_id_login.setState(state);
				naver_id_login.init_naver_id_login();
			</script>
		</form>
		</section>
	</div>
		  
	<script src="js/loginForm.js"></script>
</body>
</html>