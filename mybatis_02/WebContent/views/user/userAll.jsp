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
<c:forEach items="${list}" var="u">
	
	아이디:${u.userId}<br>
	비번:${u.userPw}<br>
	전화:${u.userTel}<br>
	이름:${u.userNick}<br>
	날짜:${u.regDate}<br>
	<hr>
</c:forEach>
</body>
</html>