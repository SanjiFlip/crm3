<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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

<title>添加客户 - H-ui.admin v3.1</title>
<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
<article class="page-container">
	<form action="customerctrl/addcustomer.do" method="post" class="form form-horizontal" id="form-member-add">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>客户名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
			   <!--如果是添加则没有id 修改就有id  -->
			   <input type="hidden" class="input-text" value="${customer.customerId}" placeholder="" id="customerId" name="customerId">
			    <input type="text"  value="${customer.customerName}" placeholder="" id="customerName" name="customerName">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">客户属性：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${customer.customerAttr}" placeholder="" id="customerAttr" name="customerAttr">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">网站：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${customer.website}" placeholder="" id="website" name="website">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">股票代码：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${customer.stockCode}" placeholder="" id="stockCode" name="stockCode">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">上级单位：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${customer.unitHigher}" placeholder="" id="unitHigher" name="unitHigher">
			</div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">所有者：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${customer.owner}" placeholder="" id="owner" name="owner">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">员工数：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${customer.numberEmployee}" placeholder="" id="numberEmployee" name="numberEmployee">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">行业编号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${customer.industryId}" placeholder="" id="industryId" name="industryId">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">客户类型：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${customer.customerType}" placeholder="" id="customerType" name="customerType">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">客户状态：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${customer.customerState}" placeholder="" id="customerState" name="customerState">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">客户来源：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${customer.customerSource}" placeholder="" id="customerSource" name="customerSource">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">负责人编号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${customer.headId}" placeholder="" id="headId" name="headId">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">固定电话：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${customer.phoneFixed}" placeholder="" id="phoneFixed" name="phoneFixed">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>移动电话：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${customer.phoneMove}" placeholder="" id="phoneMove" name="phoneMove">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">客户传真：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${customer.customerFax}" placeholder="" id="customerFax" name="customerFax">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">开户银行：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${customer.bank}" placeholder="" id="bank" name="bank">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">银行账户：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${customer.bankAccount}" placeholder="" id="bankAccount" name="bankAccount">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">下次联系时间：</label>
			<div class="formControls col-xs-8 col-sm-9">			   
			   	<input type="text" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" 
			   	value="<fmt:formatDate value='${customer.nextContactDate }' pattern='yyyy-MM-dd HH:mm:ss' />"
			   	id="nextContactDate" name="nextContactDate"  class="input-text Wdate" style="width:200px;">
			</div>		
		</div>	
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>邮箱：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" placeholder="@" name="email" id="email" value="${customer.email}">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">SIC编码：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${customer.sicCode}" placeholder="" id="sicCode" name="sicCode">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">支付方式：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${customer.payWay}" placeholder="" id="payWay" name="payWay">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">是否有效：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${customer.isEffective}" placeholder="" id="isEffective" name="isEffective">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">详细地址：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${customer.addressDetail}" placeholder="" id="addressDetail" name="addressDetail">
			</div>
		</div>	
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">备注信息：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<textarea name="noteInformation" value="${customer.noteInformation}" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" onKeyUp="$.Huitextarealength(this,100)">${customer.noteInformation}</textarea>
				<p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">最后修改时间</label>
			<div class="formControls col-xs-8 col-sm-9">
			<%Date date=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String nowtime=sdf.format(date);
			 %>
			<input type="hidden" class="input-text" value="<%=nowtime %>" class="input-text" placeholder="" id="lastModifyDate" name="lastModifyDate">
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
			customerName:{
				required:true,
				
			},			
			phoneMove:{
				required:true,
				isMobile:true,
			},
			email:{
				required:true,
				email:true,
			},
			
			
		},
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			$(form).ajaxSubmit();
			var index = parent.layer.getFrameIndex(window.name);
			window.parent.location.reload();
			parent.$('.btn-refresh').click();
			parent.layer.msg('添加成功!',{icon: 6,time:1000});
			parent.layer.close(index);
	
		}
	});
});
</script> 
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>