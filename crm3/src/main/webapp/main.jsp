<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main.jsp' starting page</title>
    
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
    <center>
    	<h2>欢迎，${empty nowuser ? "游客" : nowuser.username }，来到主页</h2>
    	<h2>
    		<c:if test="${empty nowuser}">
    			<a href="login.jsp" >登录</a>
    		</c:if>
    		<c:if test="${not empty nowuser}">
    			<a href="logout.do" onclick="return window.confirm('是否退出系统？');">退出系统</a>
    		</c:if>
    	</h2>
    	<h3>
    		<a href="goodsctrl/select.do">查看商品列表</a>
    	</h3>
    	<h3>
    		<a href="goodsctrl/listpage.do">查看商品列表-分页</a>
    	</h3>
    	
    	<hr>
    	<h3>文件上传</h3>
    	<form action="carctrl/upload.do" method="post" enctype="multipart/form-data">
    		照片：<input type="file" name="upload">
    			<input type="submit" value="提交">
    	</form>
    </center>
  </body>
</html>
