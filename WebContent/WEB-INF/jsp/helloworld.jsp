<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hello World</title>
</head>
<body>
   <p>${user.username }</p>
   <table border="1">
      <tr>
         <td>用户名</td>
         <td>性别</td>
         <td>生日</td>
         <td>地址</td>
         <td>评论</td>
         <td>分数</td>
      </tr>
      <tr>
         <td>${user.username }</td>
         <td>${user.sex }</td>
         <td><fmt:formatDate value="${user.birthday }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
         <td>${user.address }</td>
         <td>${user.detail }</td>
         <td>${user.score }</td>
      </tr>
   </table>
</body>
</html>