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
<title>人事管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 人事管理 <span class="c-gray en">&gt;</span> 部门管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
<form action="rsdeptmentctrl/selectrsdeptment.do" method="post" id="myform">
	<div class="text-c"> 日期范围：
		<input type="text"  value="<fmt:formatDate value="${rsdepartment.datemin }" pattern="yyyy-MM-dd"/>" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin" name="datemin" class="input-text Wdate" style="width:120px;">
		-
		<input type="text"  value="<fmt:formatDate value="${rsdepartment.datemax }" pattern="yyyy-MM-dd"/>" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="datemax" name="datemax" class="input-text Wdate" style="width:120px;">
		<input type="text"  value="${rsdepartment.departmentName }" class="input-text" style="width:250px" placeholder="输入部门名称 " id="" name="departmentName">
		<input type="hidden" name="pageNum" id="pageNum" value="${p.pageNum }">
		<button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜部门</button>
		<a class="btn btn-success radius"  href="javascript:location.replace(location.href);" title="刷新" >刷新</a>
	</div>
	</form>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <a href="javascript:;" onclick="member_add('添加部门','rsdeptmentctrl/goaddrsdepartment.do','','510')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加部门</a></span> </div>
	<div class="mt-20">
	<form action="rsdeptmentctrl/deletedepartmentall.do" method="post" id="myform1">
	<table class="table table-border table-bordered table-hover table-bg table-sort">
		<thead>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
					<th width="70">部门编号</th>
					<th width="70">部门名称</th>
					<th width="100">备注说明</th>
					<th width="80">公司编号</th>
					<th width="150">最后修改时间</th>
					<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${p.list }" var="rsdepartment">
		
			<tr class="text-c">
				<td><input type="checkbox" value="${rsdepartment.departmentId }" name="ids"></td>
				<td>${rsdepartment.departmentId }</td>
				<td><u style="cursor:pointer" class="text-primary" onclick="member_show('${rsdepartment.departmentName }','rsdeptmentctrl/showrsdepartment.do','${rsdepartment.departmentId }','360','400')">${rsdepartment.departmentName }</u></td>
				<td class="text-l">${rsdepartment.remarkExplain }</td>
				<td class="text-l">${rsdepartment.companyId }</td>
				<td class="text-l">
				<fmt:formatDate value="${rsdepartment.lastModifyDate }" pattern="yyyy-MM-dd HH:mm:ss"/> 
				</td>
				
				<!--<td class="td-manage"><a style="text-decoration:none" onClick="member_stop(this,'10001')" 
				  <a href="selectcompnay?compnayId=${rscompnay.compnayId }&enabled=${rscompnay.enabled==0 ? 1:0 }">状态</a>><i class="Hui-iconfont">&#xe631;</i></a> -->
				  <td class="td-manage">
				<a title="编辑" href="javascript:;" onclick="member_edit('编辑','rsdeptmentctrl/goaddrsdepartment.do','${rsdepartment.departmentId }','','510')" class="ml-5" style="text-decoration:none">
				<i class="Hui-iconfont">&#xe6df;</i></a> 
				 <a title="删除" href="javascript:;" onclick="member_del(this,'${rsdepartment.departmentId }')" class="ml-5" style="text-decoration:none">
				<i class="Hui-iconfont">&#xe6e2;</i></a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	</form>
	</div>
	
	 <div class="dataTables_info" role="status" aria-live="polite" style="float: left;margin-top: 10px;margin-bottom: 10px"><span class="btn btn-success radius">当前第 ${p.pageNum }/${p.pages }页，共 ${p.total }条</span></div>
	<div class="dataTables_paginate paging_simple_numbers" id="DataTables_Table_paginate" style="float: right;margin-top: 10px;margin-bottom: 10px">
	<a class="paginate_button" aria-controls="DataTables_Table" id="DataTables_Table_previous" href="javascript:void(0)" onclick="gopage(${p.navigateFirstPage })"><span class="btn btn-success radius">首页</span></a>
	<a class="paginate_button previous" aria-controls="DataTables_Table" id="DataTables_Table_previous" href="javascript:void(0)" onclick="gopage(${p.prePage })"><span class="btn btn-success radius">上一页</span></a>
	<a class="paginate_button next" aria-controls="DataTables_Table" id="DataTables_Table_next" href="javascript:void(0)" onclick="gopage(${p.nextPage })"><span class="btn btn-success radius">下一页</span></a>
	<a class="paginate_button" aria-controls="DataTables_Table" id="DataTables_Table_previous" href="javascript:void(0)" onclick="gopage(${p.navigateLastPage })"><span class="btn btn-success radius">尾页</span></a>
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
		"aaSorting": [[ 1, "3" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[0,3]}// 制定列不参与排序
		],
		paging: false,
	});
	$("#DataTables_Table_0_info").hide();
	$("#DataTables_Table_0_filter").hide();
});
/*公司-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*公司-查看*/
function member_show(title,url,id,w,h){
	url=url+"?departmentId="+id;
	layer_show(title,url,w,h);
}

/*公司-编辑*/
function member_edit(title,url,id,w,h){
	url=url+"?departmentId="+id;
	layer_show(title,url,w,h);
}
/*公司-修改*/
function change_password(title,url,id,w,h){
	layer_show(title,url,w,h);	
}
/*公司-删除*/
function member_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: 'rsdeptmentctrl/deletedepartment.do',
			data: "departmentId="+id,
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").remove();
				layer.msg('已删除!',{icon:1,time:1000});
				window.location.reload();
			},
			error:function(data) {
				console.log(data.msg);
			},
		});		
	});
}

//分页
function gopage(pageNum){
   $("#pageNum").val(pageNum);
   $("#myform").submit();
}

//批量删除
function datadel(){
   
   $("input[name='ids']")
   
   if($("input[name='ids']:checked").length>=1){
   
	   layer.confirm('确认要删除这些数据吗？',function(index){
	      $("#myform1").submit();
	   });
   }else{
       layer.msg('请至少选择一条数据!',{icon:5,time:1000});
   }
}

</script> 
</body>
</html>