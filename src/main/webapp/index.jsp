<%@ page language="java" import="java.util.*"
	pageEncoding="UTF-8"
%>
<html>
<body>
	<h2>Hello World!</h2>

	<h1>new sport shop project .index.jsp</h1>

	<%
		//请求重定向到 /admin/index.do
		response.sendRedirect("/admin/index.do");
	%>
</body>
</html>
