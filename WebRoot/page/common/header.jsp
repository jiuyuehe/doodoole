<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
	<title>生活多多乐，打到黑中介</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<link rel="stylesheet" href="<%=basePath%>css/style.css" type="text/css" media="all" />
	<script src="<%=basePath%>js/jquery-1.4.1.min.js" type="text/javascript"></script>
	<script src="<%=basePath%>js/jquery.jcarousel.pack.js" type="text/javascript"></script>
	<script src="<%=basePath%>js/jquery-func.js" type="text/javascript"></script>
</head>
<body>