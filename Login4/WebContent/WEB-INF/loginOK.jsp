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


<br><br><a href ="update.jsp">登録</a><form ><input type="text" name="text"><input type="submit" value="検索"></form>

<%
for(Content content:contentlist){%>


<table border>
<tr>
<td><%= content.getContent() %></td>
<td><%= content.getYear() %></td>
<td><%= content.getMonth() %></td>
<td><%= content.getDay() %></td>
<td><%= content.getName() %></td>
<td><a href="">更新</a></td>
<td><a href="">削除</a></td>

</tr>

</table>



<%} %>


</body>
</html>