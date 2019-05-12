<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="/pro/doUpdate" method="post"  enctype="multipart/form-data">
	<table width="100%" cellspacing="0" cellpadding="0" border="1px">
			<tr><td>商品名称</td><td><input type="text" value="${pro.pname }" name="pname"></td><tr>
			
			<tr><td>商品价格</td><td><input type="text" value="${pro.price}" name="price"></td></tr>
			<tr><td>商品描述</td><td><textarea type="text" name="desc">${pro.desc}</textarea></td></tr>
			<tr><td>商品图片</td><td><input type="file" name="pictureFile"/><img src="/pic/${p.pic}"></td></tr>
			<input type="hidden" name ="id" value="${id}">
			<tr><td colspan="2"><input type="submit" value="提交"></td></tr>
	</table>
	</form>
</body>
</html>