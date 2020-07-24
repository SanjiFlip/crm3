<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<link rel="Bookmark" href="/favicon.ico" >
<link rel="Shortcut Icon" href="/favicon.ico" />
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
<!--/meta 作为公共模版分离出去-->

<title>添加客户联系人 - H-ui.admin v3.1</title>
<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
<article class="page-container">
	<form action="feedbackctrl/addfeedback.do" method="post" class="form form-horizontal" id="form-member-add">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>记录优先级：</label>
			<div class="formControls col-xs-8 col-sm-9">
			   <!--如果是添加则没有id 修改就有id  -->
			    <input type="hidden" class="input-text" value="${feedback.feedbackRecordId}" placeholder="" id="feedbackRecordId" name="feedbackRecordId">
			    <input type="text"  value="${feedback.recordPriority}" placeholder="" id="recordPriority" name="recordPriority">
			</div>
		</div>	
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">客户编号：</label>
			<div class="formControls col-xs-8 col-sm-9">			   
			    <input type="text"  value="${feedback.customerId}" placeholder="" id="customerId" name="customerId">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">状态：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${feedback.state}" placeholder="" id="state" name="state">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">反馈类型：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${feedback.feedbackType}" placeholder="" id="feedbackType" name="feedbackType">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">反馈时间：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" 
			   	value="<fmt:formatDate value='${feedback.feedbackDate}' pattern='yyyy-MM-dd HH:mm:ss' />"
			   	id="feedbackDate" name="feedbackDate"  class="input-text Wdate" style="width:200px;">
				
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">反馈原因：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${feedback.feedbackReason}" placeholder="" id="feedbackReason" name="feedbackReason">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">负责人：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${feedback.head}" placeholder="" id="head" name="head">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">反馈来源：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${feedback.feedbackResource}" placeholder="" id="feedbackResource" name="feedbackResource">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">反馈主题：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${feedback.feedbackTheme}" placeholder="" id="feedbackTheme" name="feedbackTheme">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">反馈描述：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${feedback.feedbackDescribe}" placeholder="" id="feedbackDescribe" name="feedbackDescribe">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">分析：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${feedback.analysis}" placeholder="" id="analysis" name="analysis">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">公司编号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${feedback.companyId}" placeholder="" id="companyId" name="companyId">
			</div>
		</div>		
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">最后修改时间</label>
			<div class="formControls col-xs-8 col-sm-9">
			<%Date date=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String nowtime=sdf.format(date);
			 %>
			<input type="hidden" class="input-text" value="<%=nowtime %>" placeholder="" id="lastModifyDate" name="lastModifyDate">
			<%=nowtime %>
			</div>
		</div>
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				<input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
			</div>
		</div>
	</form>
</article>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本--> 
<script type="text/javascript" src="<%=basePath%>lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$("#form-member-add").validate({
		rules:{
			
			
		},
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			$(form).ajaxSubmit();
			var index = parent.layer.getFrameIndex(window.name);
			parent.$('.btn-refresh').click();
			window.location.reload();
			parent.layer.msg('添加成功!',{icon: 6,time:1000});
			parent.layer.close(index);
	
		}
	});
});
</script> 
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>