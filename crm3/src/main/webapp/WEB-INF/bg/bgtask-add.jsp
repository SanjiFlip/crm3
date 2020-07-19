<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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

<title>添加任务</title>
<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
<article class="page-container">
	<form action="bgexaminetaskctrl/addtask.do" method="post" class="form form-horizontal" id="form-task-add">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">任务标题：</label>
			<div class="formControls col-xs-8 col-sm-9">
			<input type="hidden" value="${task.taskId }" id="taskId" name="taskId">
				<input autocomplete="off" type="text" class="input-text" value="${task.taskTitle }" placeholder="请输入任务标题" id="taskTitle" name="taskTitle">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">任务具体内容：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<textarea autocomplete="off" name="taskSpecificContent" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" onKeyUp="$.Huitextarealength(this,100)">${task.taskSpecificContent }</textarea>
				<p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">任务发布人：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input autocomplete="off" type="text" class="input-text" value="${task.taskPublishPerson }" placeholder="请输入任务发布人" id="taskPublishPerson" name="taskPublishPerson">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">任务接收者：</label>
			<div class="formControls col-xs-8 col-sm-9">
                <select type="text" class="input-text" style="width:250px" placeholder="" id="" name="acceptUserId">
				    <option value=""></option>
                    <option value="1">admin</option>
                    <option value="2">test</option>
                    <option value="3">ssss</option>
                    <option value="4">mmmm</option>
                    <option value="6">dddddd</option>
                    <option value="7">good</option>
                 </select>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">考核指标：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input autocomplete="off" type="text" class="input-text" value="${task.examineTarget }" placeholder="请输入考核指标" id="examineTarget" name="examineTarget">
			</div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">任务开始时间：</label>
			<div class="formControls col-xs-8 col-sm-9">
			  <input type="text" autocomplete="off"
				onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" id="taskBeginTime" name="taskBeginTime" value="<fmt:formatDate value="${task.taskBeginTime }" pattern="yyyy-MM-dd HH:mm:ss"/>"
				class="input-text Wdate" style="width:200px;">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">任务结束时间：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" autocomplete="off"
				onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" id="taskEndTime" name="taskEndTime" value="<fmt:formatDate value="${task.taskEndTime }" pattern="yyyy-MM-dd HH:mm:ss"/>"
				class="input-text Wdate" style="width:200px;">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">公司编号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input autocomplete="off" type="text" class="input-text" value="${task.companyId }" placeholder="请输入公司编号" id="companyId" name="companyId">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">最后修改时间：</label>
			<div class="formControls col-xs-8 col-sm-9">
			<%Date date=new Date();
			  SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			  String nowtime=sdf.format(date);
			 %>
				<input type="hidden" class="input-text" value="<%=nowtime %>" id="lastModifyDate" name="lastModifyDate">
			    <%=nowtime %>
			</div>
		</div>
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				<input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
				<input class="btn btn-primary radius" type="reset" value="&nbsp;&nbsp;重置&nbsp;&nbsp;">
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
<script type="text/javascript" src="<%=basePath%>lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="<%=basePath%>lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="<%=basePath%>lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript">
$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$("#form-task-add").validate({
		rules:{
			taskTitle:{
				required:true,
			},
		},
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			$(form).ajaxSubmit();
			var index = parent.layer.getFrameIndex(window.name);
			//parent.$('.btn-refresh').click();
			window.parent.location.reload();//刷新父页面
			parent.layer.msg('操作成功！',{icon:6,time:1000});
			parent.layer.close(index);
		}
	});
});
</script> 
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>

