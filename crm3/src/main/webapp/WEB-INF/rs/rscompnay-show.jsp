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
<title>公司查看</title>
</head>
<body>
<div class="cl pd-20" style=" background-color:#5bacb6">
	<dl style="color:#fff">
		<dt>
			<span>公司姓名：${rscompnay.compnayName }</span><hr>
			<span>公司ID:${rscompnay.compnayId }</span>
		</dt>
		<dd class="pt-10 f-12" style="margin-left:0">公司代码：${rscompnay.compnayCode }</dd>
	</dl>
</div>
<div class="pd-20">
	<table class="table">
		<tbody>
		<tr>
				<th>邮箱&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:${rscompnay.mailbox }</th>
			</tr>
			<tr>
				<th>联系人&nbsp; &nbsp;：${rscompnay.contacts }</th>
			</tr>
			<tr>
				<th>公司地址&nbsp;：${rscompnay.compnayAddress }</th>
			</tr>
			<tr>
				<th>固定电话&nbsp;：${rscompnay.fixedTelephone }</th>
			</tr>
			<tr>
				<th>移动电话&nbsp;：${rscompnay.mobilePhone }</th>

			</tr>
			<tr>
				<th>传真&nbsp; &nbsp;&nbsp;：${rscompnay.fax }</th>
			</tr>
			<tr>
				<th>开户银行 &nbsp;：${rscompnay.bankOfDeposit }</th>
			</tr>
			<tr>
				<th>银行账户 &nbsp;：${rscompnay.bankAccount }</th>
			</tr>
			<tr>
				<th>是否有效 &nbsp;:${rscompnay.enabled==1 ? "有效":"无效"}</th>
			</tr>
			<tr>
				<th>备注信息 &nbsp;：${rscompnay.remarks }</th>
			</tr>
			<tr>
				<th>最后修改时间：<fmt:formatDate value="${rscompnay.lastModifyDate }" pattern="yyyy-MM-dd HH:mm:ss"/></th>
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