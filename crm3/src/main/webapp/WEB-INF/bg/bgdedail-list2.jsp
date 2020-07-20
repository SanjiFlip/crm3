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
<title>任务详情管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 办公管理 <span class="c-gray en">&gt;</span> 任务详情管理(当前接收用户：${sessionScope.nowuser.userName }) <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <form action="bgtaskdedailctrl/selectTaskDedailById.do" method="post" id="myform-dedail2">
	<div class="text-c">
	    <input type="hidden" name="pageNum" id="pageNum" value="${p.pageNum }">
		<button type="button" onclick="window.location.href='bgtaskdedailctrl/selectdedail.do'" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 返回</button>
	</div>
	</form>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l">
    </span> 
	<span class="r">共有数据：<strong>${p.total }</strong> 条</span> </div>
	<div class="mt-20">
	<table class="table table-border table-bordered table-hover table-bg table-sort">
		<thead>
			<tr class="text-c">
				<th width="45"><input type="checkbox" name="" value=""></th>
				<th width="90">编号</th>
				<th width="90">任务编号</th>
				<th width="80">是否完成</th>
				<th width="80">状态</th>
				<th width="90">发布人</th>
				<th width="100">公司编号</th>
				<th width="100">最后修改时间</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${p.list }" var="dedail">
			<tr class="text-c">
				<td><input type="checkbox" value="" name=""></td>
				<td>${dedail.bhId }</td>
				<td>${dedail.taskId }</td>
				<td><a href="bgtaskdedailctrl/updateWhetherFinsh.do?bhId=${dedail.bhId}&whetherFinish=${dedail.whetherFinish}">${dedail.whetherFinish } </a></td>
				<td class="text-c"><a href="bgtaskdedailctrl/updateByState.do?bhId=${dedail.bhId}&state=${dedail.state}">${dedail.state }</a>
				<td>${dedail.taskPublishPerson }</td>
				<td>${dedail.companyId }</td>
				<td class="td-status">
				<fmt:formatDate value="${dedail.lastModifyDate }" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
		    </tr>
		</c:forEach>
		</tbody>
	</table>
	</div>
	
	<div style="float: left;margin-bottom:10px;" class="dataTables_info" role="status" aria-live="polite">当前第${p.pageNum }/${p.pages }页，共${p.total }条</div>
	<div style="float: right;" class="paginate_button paging_simple_numbers" id="DataTables_Table_paginate">
	<a class="paginate_button" aria-controls="DataTables" id="DataTables_Table_previous" href="javascript:void(0)" onclick="gopage1(${p.navigateFirstPage })">首页</a>
	<a class="paginate_button previous" aria-controls="DataTables" id="DataTables_Table_previous" href="javascript:void(0)" onclick="gopage1(${p.prePage })">上一页</a>
	<a class="paginate_button next" aria-controls="DataTables" id="DataTables_Table_next" href="javascript:void(0)" onclick="gopage1(${p.nextPage })">下一页</a>
	<a class="paginate_button" aria-controls="DataTables" id="DataTables_Table_previous" href="javascript:void(0)" onclick="gopage1(${p.navigateLastPage })">尾页</a>
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
			url: '',
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

//分页
function gopage1(pageNum){
    $("#pageNum").val(pageNum);
    $("#myform-dedail2").submit();
}
</script> 
</body>
</html>