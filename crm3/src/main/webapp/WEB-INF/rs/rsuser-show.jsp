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
			<span class="f-18">员工姓名：${rsuser.staffName }</span><hr>
			<span class="pl-10 f-12">员工编号:${rsuser.staffId }</span>
		</dt>
		<dd class="pt-10 f-12" style="margin-left:0">员工性别：${rsuser.staffSex }</dd>
	</dl>
</div>
<div class="pd-20">
	<table class="table">
		<tbody>
		
			<tr>
				<th class="text-r" width="150">身份证号：${rsuser.idCard }</th>
				<td></td>
			</tr>
			<tr>
				<th class="text-r" width="150">家乡地址：${rsuser.hometownAddress }</th>
				<td></td>
			</tr>
			<tr>
				<th class="text-r" width="150">现在地址：${rsuser.nowAddress }</th>
				<td></td>
			</tr>
			<tr>
				<th class="text-r" width="150">员工学历：</th>
				<td>${rsuser.staffEducationalBackground }</td>
			</tr>
			<tr>
				<th class="text-r" width="150">政治面貌：</th>
				<td>${rsuser.politicCountenance }</td>
			</tr>
			<tr>
				<th class="text-r" width="150">毕业学校：</th>
				<td>${rsuser.graduateSchool }</td>
			</tr>
			<tr>
				<th class="text-r" width="150">网上联系方式：</th>
				<td>${rsuser.onlineContactInfromation }</td>
			</tr>
			<tr>
				<th class="text-r" width="150">网上联系详情：</th>
				<td>${rsuser.onlineContactDetails }</td>
			</tr>
			<tr>
				<th class="text-r" width="150">审核状态</th>
				<td>${rsuser.examineState==1 ? "已启用":"已停用"}</td>
			</tr>
			<tr>
				<th class="text-r" width="150">职务编号：</th>
				<td>${rsuser.postId }</td>
			</tr>
			<tr>
				<th class="text-r" width="150">员工状态：</th>
				<td>${rsuser.staffState }</td>
			</tr>
			<tr>
				<th class="text-r" width="150">备注：</th>
				<td>${rsuser.remarks }</td>
			</tr>
			<tr>
				<th class="text-r" width="150">公司编号：</th>
				<td>${rsuser.compnayId }</td>
			</tr>
			<tr>
				<th class="text-r" width="150">最后修改时间：</th>
				<td><fmt:formatDate value="${rsuser.lastModifyDate }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
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