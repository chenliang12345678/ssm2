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
	
	
	<table width="100%" cellspacing="0" cellpadding="0" border="1px">
		<thead>
			<tr><th>商品名称</th><th>商品价格</th><th>商品描述</th><th>操作</th></tr>
		</thead>
		<tbody>
			<c:forEach items="${pros}" var="p">
				<tr>
					<td>${p.pname}</td>
					<td>${p.price}</td>
					<td>${p.desc}</td>
					<td><a href="${pageContext.request.contextPath}/pro/update/${p.id}">修改</a></td>
				</tr>
			</c:forEach>
			
		</tbody>
	
	
	</table>
</body>
</html>