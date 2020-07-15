<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<title>用户账户管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 系统管理 <span class="c-gray en">&gt;</span> 系统角色 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<form action="permctrl/selectcolumns.do" method="post" id="myform2">
		<input type="hidden" name="pageNum" id="pageNum" value="${p.pageNum }">
	</form>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> 	
	<a href="javascript:;" onclick="member_add('添加分栏信息','permctrl/goaddpermcolumns.do','','510')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i>添加分栏信息</a>
	</span> <span class="r">共有数据：<strong>${p.total }</strong> 条</span> </div>
	<div class="mt-20">
	<form action="permctrl/deletecolumns.do" method="post" id="myform1">
	<table class="table table-border table-bordered table-hover table-bg table-sort">
		<thead>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="50">ID</th>
				<th width="80">分栏名称</th>
				<th width="100">备注</th>
				<th width="100">最后修改时间</th>
				<th width="50">操作</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${p.list }" var="column">
				<tr class="text-c">
					<td><input type="checkbox" value="${column.columnsId}" name="ids"></td>
					<td>${column.columnsId}</td>
					<td><u style="cursor:pointer" class="text-primary">${column.columnsName}</u></td>
					<td>${column.remarks}</td>
					<td>
					<fmt:formatDate value="${column.lastModifyDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
					</td>
					<td class="td-manage">
					<a title="查看当前分栏下权限" href="javascript:;" onclick="member_find('查看当前分栏下权限','permctrl/findin.do','${column.columnsId}','','510')" class="ml-5" style="text-decoration:none">
					<i class="Hui-iconfont">&#xe665;</i></a>
					<a title="查看当前分栏没有权限" href="javascript:;" onclick="member_addrole('查看当前分栏下没有的权限','permctrl/findnotin.do','${column.columnsId}','','510')" class="ml-5" style="text-decoration:none">
					<i class="Hui-iconfont">&#xe610;</i></a>
					<a title="修改分栏信息" href="javascript:;" onclick="member_role('修改分栏信息','permctrl/goupdatecolumn.do','${column.columnsId}','','510')" class="ml-5" style="text-decoration:none">
					<i class="Hui-iconfont">&#xe61d;</i></a>
					<a title="删除" href="javascript:;" onclick="member_del(this,'${column.columnsId}')" class="ml-5" style="text-decoration:none">
					<i class="Hui-iconfont">&#xe6e2;</i></a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</form>
	</div>
		<div class="label label-success" role="status" aria-live="polite" style="float: left;margin-top: 10px;margin-bottom: 10px">当前第 ${p.pageNum }/${p.pages }页，共 ${p.total }条</div>
		<div class="dataTables_paginate paging_simple_numbers" id="DataTables_Table_paginate" style="float: right;margin-top: 10px;margin-bottom: 10px">
		<a class="btn btn-default" aria-controls="DataTables_Table" id="DataTables_Table_previous" href="javascript:void(0)" onclick="gopage(${p.navigateFirstPage })">首页</a>
		<a class="btn btn-default" aria-controls="DataTables_Table" id="DataTables_Table_previous" href="javascript:void(0)" onclick="gopage(${p.prePage })">上一页</a>
		<a class="btn btn-default" aria-controls="DataTables_Table" id="DataTables_Table_next" href="javascript:void(0)" onclick="gopage(${p.nextPage })">下一页</a>
		<a class="btn btn-default" aria-controls="DataTables_Table" id="DataTables_Table_previous" href="javascript:void(0)" onclick="gopage(${p.navigateLastPage })">尾页</a>
		</div>
</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="<%=basePath%>lib/My97DatePicker/4.8/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
$(function(){
	$('.table-sort').dataTable({
		"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[0,4]}// 制定列不参与排序
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
/*查看成员*/
function member_find(title,url,id,w,h){
	url=url+"?columnsId="+id;
	layer_show(title,url,w,h);
}
/*添加成员*/
function member_addrole(title,url,id,w,h){
	url=url+"?columnsId="+id;
	layer_show(title,url,w,h);
}
/*权限设置*/
function member_role(title,url,id,w,h){
	url=url+"?columnsId="+id;
	layer_show(title,url,w,h);
}

/*用户-删除*/
function member_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: 'permctrl/deletecolumn.do',
			data: "columnsId="+id,
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").remove();
				layer.msg('已删除!',{icon:1,time:1000});
			},
			error: function(data) {
				console.log(data.msg);
			},
		});		
	});
}
//分页
function gopage(pageNum){
	$("#pageNum").val(pageNum);
	$("#myform2").submit();
}

//批量删除
function datadel(){
	if($("input[name='ids']:checked").length>=1){
   
	   layer.confirm('确认要删除这些数据吗？',function(index){
	      $("#myform1").submit();
	      layer.msg('删除成功!',{icon:6,time:3000});
	   });
   }else{
       layer.msg('请至少选择一条数据!',{icon:5,time:1000});
   }
	
}

</script> 
</body>
</html>