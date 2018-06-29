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
<form action="/memberUpdate">
ID:${sessionScope.member.memberId}<br>
<input type="hidden" value="${sessionScope.member.memberId}" name="memberId">
PW:<input type="text" value="${requestScope.member.memberPw}" name="pw"><br>
PW_re:<input type="text" value="${requestScope.member.memberPw}" name="pwre"><br>
이름:${sessionScope.member.memberName}<br>
지역:${sessionScope.member.memberAddr}<br>
<c:if test="${sessionScope.member.gender=='여'}">
<input type="radio"  disabled="disabled" /> 남성
<input type="radio"  checked  disabled="disabled"/> 여성
</c:if>

<c:if test="${sessionScope.member.gender=='남'}">
<input type="radio" checked disabled="disabled" /> 남성
<input type="radio"  disabled="disabled"/> 여성
</c:if>
<br>
취미:${sessionScope.member.hobby}<br>
가입일:${sessionScope.member.regDate}<br>
<input type="submit" value="변경하기">

</form>

</body>
</html>