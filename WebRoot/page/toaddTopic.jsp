<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'toaddTopic.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="<%=basePath%>addTopic" method="post">
    <table>
    <tr><td>选择板块：</td><td> <select name="categoryName">
         <option value="A"> A板块</option>
         <option value="B"> B板块</option>
         <option value="C"> C板块</option>
    </select></td></tr>
    <tr><td>主题：</td><td><input type="text" name="topicName" /></td></tr>
    <tr><td>正文：</td><td><textarea rows="10" cols="50" name="topicContent"></textarea></td></tr>
    <tr><td><input type="reset" value="清空"></td><td><input type="submit" value="提交"></td></tr>
    
    
    </table>
    
    		
    
    </form>
  </body>
</html>
