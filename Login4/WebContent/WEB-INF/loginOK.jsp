<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "model.User,model.Content,java.util.List" %>
<%


User user = (User) session.getAttribute("loginuser");

List<Content> contentlist = (List<Content>)application.getAttribute("contentlist");






%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

ようこそ<%= user.getUserId() %>さん



<%

for(Content content:contentlist){%>

<center>
<table border>
<tr>
<td>内容</td>
<td>年</td>
<td>月</td>
<td>日付</td>
<td>実行する人</td>
</tr>
<tr>
<td><%= content.getContent() %></td>
<td><%= content.getLimitYear() %></td>
<td><%= content.getLimitMonth() %></td>
<td><%= content.getLimitDay() %></td>
<td><%= content.getPerson() %></td>
</tr>

</table>

</center>



<%} %>


</body>
</html>