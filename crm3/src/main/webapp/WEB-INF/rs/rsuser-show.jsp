<%@page import="java.text.SimpleDateFormat"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
 <meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>职务查看</title>
</head>
<body>
<div class="cl pd-20" style=" background-color:#5bacb6">
	<img class="avatar size-XL l" src="upload/${rsuser.staffPhoto }">
	<dl style="margin-left:80px; color:#fff">
		<dt>
			<span class="f-18">员工姓名&nbsp; &nbsp;：${rsuser.staffName }</span><hr>
			<span class="pl-10 f-12">员工编号&nbsp; &nbsp;:${rsuser.staffId }</span>
		</dt>
		<dd class="pt-10 f-12" style="margin-left:0">员工性别&nbsp; &nbsp;：${rsuser.staffSex }</dd>
	</dl>
</div>
<div class="pd-20">
	<table class="table">
		<tbody>
		
			<tr>
				<th>身份证号&nbsp; &nbsp;：${rsuser.idCard }</th>
			</tr>
			<tr>
				<th>家乡地址&nbsp; &nbsp;：${rsuser.hometownAddress }</th>
			</tr>
			<tr>
				<th>现在地址&nbsp; &nbsp;：${rsuser.nowAddress }</th>
			</tr>
			<tr>
				<th>员工学历&nbsp; &nbsp;：${rsuser.staffEducationalBackground }</th>

			</tr>
			<tr>
				<th>政治面貌&nbsp; &nbsp;：${rsuser.politicCountenance }</th>
			</tr>
			<tr>
				<th>毕业学校&nbsp; &nbsp;：${rsuser.graduateSchool }</th>
			</tr>
			<tr>
				<th>网上联系方式：${rsuser.onlineContactInfromation }</th>
			</tr>
			<tr>
				<th>网上联系详情：${rsuser.onlineContactDetails }</th>
			</tr>
			<tr>
				<th>审核状态&nbsp; &nbsp;: ${rsuser.examineState=="已审核" ? "已审核":"未审核"}</th>
			</tr>
			<tr>
				<th>职务编号&nbsp; &nbsp;：${rsuser.postId }</th>
			</tr>
			<tr>
				<th>员工状态&nbsp; &nbsp;：${rsuser.staffState=="1" ? "在线":"下线"}</th>
			</tr>
			<tr>
				<th>备注&nbsp; &nbsp;&nbsp; &nbsp;：${rsuser.remarks }</th>
			</tr>
			<tr>
				<th>公司编号&nbsp; &nbsp;：${rsuser.compnayId }</th>
			</tr>
			<tr>
				<th>最后修改时间：<fmt:formatDate value="${rsuser.lastModifyDate }" pattern="yyyy-MM-dd HH:mm:ss"/></th>
			</tr>
		</tbody>
	</table>
</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> 
<!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
</body>
</html>