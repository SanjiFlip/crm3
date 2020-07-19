<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<title>短信息管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 办公管理 <span class="c-gray en">&gt;</span> 短信息管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l">
	
    <a href="bgsmsdetailctrl/selectsmsdetail.do" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 查看接收信息</a>
    <a href="bgsmsctrl/selectsms.do" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 查看已发送信息</a>
	<a href="javascript:;" onclick="member_add('发送信息','bgsmsctrl/goaddsms.do','','510')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 发送信息</a></span> 
	<span class="r">共有数据：<strong>${p.total }</strong> 条</span> </div>
	<div class="mt-20">
	<table class="table table-border table-bordered table-hover table-bg table-sort">
		<thead>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="100">编号</th>
				<th width="100">标题</th>
				<th width="170">内容</th>
				<th width="90">发送人</th>
				<th width="100">最后修改时间</th>
				<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${p.list }" var="sms">
			<tr class="text-c">
				<td><input type="checkbox" value="" name=""></td>
				<td>${sms.bhId }</td>
				<td>${sms.title }</td>
				<td><u style="cursor:pointer" class="text-primary" onclick="member_show('张三','member-show.html','10001','360','400')">${sms.content }</u></td>
				<td>${sms.sendPerson }</td>
				<td>
				<fmt:formatDate value="${sms.lastModifyDate }" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<td class="td-manage"> 
				<a title="删除" href="javascript:;" onclick="member_del(this,'${sms.bhId }')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</div>
	
	<div style="float: left;margin-bottom:10px;" class="dataTables_info" role="status" aria-live="polite">当前第${p.pageNum }/${p.pages }页，共${p.total }条</div>
	<div style="float: right;" class="paginate_button paging_simple_numbers" id="DataTables_Table_paginate">
	<a class="paginate_button" aria-controls="DataTables" id="DataTables_Table_previous" href="bgsmsctrl/selectsms.do?pageNum=${p.navigateFirstPage }">首页</a>
	<a class="paginate_button previous" aria-controls="DataTables" id="DataTables_Table_previous" href="bgsmsctrl/selectsms.do?pageNum=${p.prePage }">上一页</a>
	<a class="paginate_button next" aria-controls="DataTables" id="DataTables_Table_next" href="bgsmsctrl/selectsms.do?pageNum=${p.nextPage }">下一页</a>
	<a class="paginate_button" aria-controls="DataTables" id="DataTables_Table_previous" href="bgsmsctrl/selectsms.do?pageNum=${p.navigateLastPage }">尾页</a>
	</div>
</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="lib/My97DatePicker/4.8/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
$(function(){
	$('.table-sort').dataTable({
		"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[0,6]}// 制定列不参与排序
		],
	    paging:false,
	});
	$("#DataTables_Table_0_info").hide();
	$("#DataTables_Table_0_filter").hide();
});
/*用户-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*用户-查看*/
function member_show(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*用户-编辑*/
function member_edit(title,url,id,w,h){
    url=url+"?bhId="+id;
	layer_show(title,url,w,h);
}
/*密码-修改*/
function change_password(title,url,id,w,h){
	layer_show(title,url,w,h);	
}
/*用户-删除*/
function member_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			data: 'bhId='+id,
			url: 'bgsmsctrl/deletesms.do',
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").remove();
				layer.msg('已删除!',{icon:1,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});		
	});
}

</script> 
</body>
</html>