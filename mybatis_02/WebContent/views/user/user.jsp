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
<form action="/updateUser">
아이디:${user.userId}
<input type="hidden" value="${user.userId}" name="userId">
비밀번호:<input type="text" value="${user.userPw}" name="userPw">
이름:<input type="text" value="${user.userNick}" name="userNick">
전화:<input type="text" value="${user.userTel}" name="userTel">
가입날짜:${user.regDate}
<input type="submit" value="변경">
</form>
</body>
</html>