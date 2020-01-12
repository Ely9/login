<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action ="/Login4/Mainservlet" method="post">

内容<input type="text" name="content">
<select type="text" name="year"><option value="2020">2020</option><option value="2021">2021</option><option value="2022">2011</option></select>
<select type="text" name ="month"><option value="1">1月</option><option value="2">2月</option><option value="3">3月</option><option value="4">4月</option><option value="5">5月</option><option value="6">6月</option><option value="7">7月</option><option value="8">8月</option><option value="9">9月<option value="10">10月</option><option value="11">11月</option><option value="12">12月</option></select>
<select type="text" name ="day"><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option><option value="7">7</option><option value="8">8</option><option value="9">9<option value="10">10</option><option value="11">11</option><option value="12">12</option></select>
名前<input type="text" name="name">
<input type="submit" value="登録">

</form>

</body>
</html>