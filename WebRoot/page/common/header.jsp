<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>
	<head>
		<base href="<%=basePath%>">
		<title>生活在当下，唯有多多乐</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">


		<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
		<link rel="stylesheet" href="<%=basePath%>css/style.css"
			type="text/css" media="all" />
		<link rel="stylesheet"
			href="<%=basePath%>app-plugins/bootstrap/css/bootstrap.min.css"
			type="text/css" media="all" />
		<script src="<%=basePath%>app-plugins/jquery/jquery-1.10.0.min.js"
			type="text/javascript">
</script>
		<script src="<%=basePath%>app-plugins/bootstrap/js/bootstrap.min.js"
			type="text/javascript">
</script>
	</head>
	<body>