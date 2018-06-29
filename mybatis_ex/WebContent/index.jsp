<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${empty sessionScope.member }">
	<form action="/login">
	아이디:<input type="text" name="memberId">
	비밀번호:<input type="text" name="memberPw">
	<input type="submit" value="로그인">
	<a href="/views/join.jsp">회원가입</a>
	</form>
	</c:if>



<c:if test="${not empty sessionScope.member }">
${sessionScope.member.memberName}님 환영 합니다.
<a href="/logout">로그아웃</a>
<a href="/memberInfo">마이정보 보기</a>
<a href="/deleteMember?memberId=${sessionScope.member.memberId}">회원탈퇴</a>
<a href="/memberAll">전체회원 보기</a>
</c:if>
</body>
</html>