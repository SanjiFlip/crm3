<%@page import="java.text.SimpleDateFormat"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<title>添加员工 - H-ui.admin v3.1</title>
<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
<article class="page-container">
	<form action="rsuserctrl/adduser.do" method="post" class="form form-horizontal" id="form-member-add"  enctype="multipart/form-data">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>员工名：</label>
			<div class="formControls col-xs-8 col-sm-9">
			<!-- 如果是添加就没有ID，如果是修改就有ID -->	
			<input type="hidden" class="input-text" value="${rsuser.staffId }" id="staffId" name="staffId">	
				<input type="text" class="input-text" value="${rsuser.staffName }" placeholder="请输入员工姓名" id="staffName" name="staffName">
			</div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">上传头像：</label>
			<div class="formControls col-xs-8 col-sm-9"> <span class="btn-upload form-group">
				<input class="input-text upload-url" value="${rsuser.staffPhoto }" type="hidden" name="staffPhoto" id="staffPhoto" readonly nullmsg="请添加附件！" style="width:200px">
				<input type="file" name="upload">
				</span> </div>
		</div>
		
		
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>员工性别：</label>
			<div class="formControls col-xs-8 col-sm-9">
				 <input type="radio" name="staffSex" value="男"  ${rsuser.staffSex=="男" ? "checked":"" }>男
              <input type="radio" name="staffSex" value="女" ${rsuser.staffSex=="女" ? "checked":"" }>女
			</div>
			
		</div>
		
		
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>身份证号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${rsuser.idCard }" placeholder="请输入身份证号" name="idCard" id="idCard">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>家乡地址：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${rsuser.hometownAddress }" placeholder="请输入家乡地址" name="hometownAddress" id="hometownAddress">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>现在地址：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${rsuser.nowAddress }" placeholder="请输入现在所在地址" name="nowAddress" id="nowAddress">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>员工学历：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${rsuser.staffEducationalBackground }" placeholder="请输入员工学历" name="staffEducationalBackground" id="staffEducationalBackground">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>政治面貌：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${rsuser.politicCountenance }" placeholder="请输入员工政治面貌" name="politicCountenance" id="politicCountenance">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>毕业学校：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${rsuser.graduateSchool }" placeholder="请输入毕业学校" name="graduateSchool" id="pgraduateSchool">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>网上联系方式：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${rsuser.onlineContactInfromation }" placeholder="请输入网上联系方式" name="onlineContactInfromation" id="onlineContactInfromation">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>网上联系详情：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${rsuser.onlineContactDetails }" placeholder="请输入网上联系详情" name="onlineContactDetails" id="onlineContactDetails">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>审核状态：</label>
			<div class="formControls col-xs-8 col-sm-9">
				 <input type="radio" name="examineState" value="已审核"  ${rsuser.examineState=="已审核" ? "checked":"" }>已审核
              <input type="radio" name="examineState" value="未审核" ${rsuser.examineState=="未审核" ? "checked":"" }>未审核
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>职务编号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${rsuser.postId }" placeholder="请输入职务编号" name="postId" id="postId">
			</div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>员工状态״：</label>
               <td>
              <input type="hidden" class="input-text" value="1" name="staffState" id="staffState">在线
           </td>
          </div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>公司编号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${rsuser.compnayId }" placeholder="请输入公司编号" name="compnayId" id="compnayId">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">备注：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<textarea name="remarks" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" onKeyUp="$.Huitextarealength(this,100)">${rsuser.remarks }</textarea>
				<p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
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
<script type="text/javascript" src="lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript">
$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$("#form-member-add").validate({
		rules:{
			staffName:{
				required:true,
			},
			},
			
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			/*
			$(form).ajaxSubmit();
			var index = parent.layer.getFrameIndex(window.name);
			//parent.$('.btn-refresh').click();
			window.parent.location.reload();//刷新页面
			parent.layer.msg('操作成功！',{icon: 6,time:1000});
			parent.layer.close(index);*/
			$(form).ajaxSubmit({
			  success:function(){
			    var index = parent.layer.getFrameIndex(window.name);
			    //parent.$('#btn-refresh').click();
			    window.parent.location.reload();//刷新父页面
			    parent.layer.msg('操作成功!',{icon: 6,time:1000});
			    parent.layer.close(index);
			  }
			 });
		}
	});
});
</script> 
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>
