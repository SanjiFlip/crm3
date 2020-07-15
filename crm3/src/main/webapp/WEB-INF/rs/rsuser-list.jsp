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
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 人事管理 <span class="c-gray en">&gt;</span> 员工管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
<form action="rsuserctrl/selectuser.do" method="post" id="myform">
	<div class="text-c"> 日期范围：
		<input type="text"  value="<fmt:formatDate value="${rsuser.datemin }" pattern="yyyy-MM-dd"/>" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin" name="datemin" class="input-text Wdate" style="width:120px;">
		-
		<input type="text"  value="<fmt:formatDate value="${rsuser.datemax }" pattern="yyyy-MM-dd"/>" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="datemax" name="datemax" class="input-text Wdate" style="width:120px;">
		<input type="text" value="${rsuser.staffName }" class="input-text" style="width:250px" placeholder="输入员工名称" id="staffName" name="staffName">
		 <a class="btn btn-success radius r"  href="javascript:location.replace(location.href);" title="刷新" >刷新</a>
		<button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜公司</button>
	</div>
	</form>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <a href="javascript:;" onclick="member_add('添加员工','rsuserctrl/goadduser.do','','510')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加员工</a></span> </div>
	<div class="mt-20">
	<form action="rsuserctrl/deleteuserall.do" method="post" id="myform1">
	<table class="table table-border table-bordered table-hover table-bg table-sort">
		<thead>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
					<th width="70">员工编号</th>
					<th width="70">员工姓名</th>
					<th width="70">员工性别</th>
					<th width="80">员工照片</th>
					<th width="150">现在地址</th>
					<th width="150">员工学历</th>
					<th width="70">审核状态</th>
					<th width="70">职务编号</th>
					<th width="80">员工状态</th>
					<th width="70">公司编号</th>
					<th width="150">最后修改时间</th>
					<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${p.list }" var="rsuser">
		
			<tr class="text-c">
				<td><input type="checkbox" value="${rsuser.staffId }" name="ids"></td>
				<td>${rsuser.staffId }</td>
				<td><u style="cursor:pointer" class="text-primary" onclick="member_show('${rsuser.staffName }','rsuserctrl/showuser.do','${rsuser.staffId }','360','400')">${rsuser.staffName }</u></td>
				<td class="text-l">${rsuser.staffSex }</td>
				<td class="text-l"><img width="60" class="product-thumb" src="upload/${rsuser.staffPhoto }"></td>
				<td class="text-l">${rsuser.nowAddress }</td>
				<td class="text-l">${rsuser.staffEducationalBackground }</td>
				<td class="td-status"><span class="label label-success radius">${rsuser.examineState=="1" ? "已审核":"未审核"}</span></td>
				<td class="text-l">${rsuser.postId }</td>
				<td class="text-l"><span class="label label-success radius">${rsuser.staffState=="在线" ? "在线":"下线"}</span></td>
				<td class="text-l">${rsuser.compnayId }</td>
				<td class="text-l">
				<fmt:formatDate value="${rsuser.lastModifyDate }" pattern="yyyy-MM-dd HH:mm:ss"/> 
				</td>
				
				<!--<td class="td-manage"><a style="text-decoration:none" onClick="member_stop(this,'10001')" 
				  <a href="selectcompnay?compnayId=${rscompnay.compnayId }&enabled=${rscompnay.enabled==0 ? 1:0 }">状态</a>><i class="Hui-iconfont">&#xe631;</i></a> -->

				  <td class="td-manage"><a style="text-decoration:none" onClick="member_stop(this,'${rsuser.staffId}')" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>
				<a title="编辑" href="javascript:;" onclick="member_edit('编辑','rsuserctrl/goadduser.do','${rsuser.staffId }','','510')" class="ml-5" style="text-decoration:none">
				<i class="Hui-iconfont">&#xe6df;</i></a> 
				 <a title="删除" href="javascript:;" onclick="member_del(this,'${rsuser.staffId }')" class="ml-5" style="text-decoration:none">
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
<script type="text/javascript" src="<%=basePath%>lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="<%=basePath%>lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="<%=basePath%>static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="<%=basePath%>static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="<%=basePath%>lib/My97DatePicker/4.8/WdatePicker.js"></script> 
<script type="text/javascript" src="<%=basePath%>lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="<%=basePath%>lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
$(function(){
	$('.table-sort').dataTable({
		"aaSorting": [[ 1, "11" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[0,10]}// 制定列不参与排序
		],
		paging: false,
	});
	$("#DataTables_Table_0_info").hide();
	$("#DataTables_Table_0_filter").hide();
});

/*公司-停用*/
function member_stop(obj,id){
	layer.confirm('确认要停用吗？',function(index){
		$.ajax({
			type: 'POST',
			url: 'rsuserctrl/examineStateuser.do',
			data: "staffId="+id+"&examineState=0",
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_start(this,'+id+')" href="javascript:;" title="审核"><i class="Hui-iconfont">&#xe6e1;</i></a>');
				$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">未审核</span>');
				$(obj).remove();
				layer.msg('未审核!',{icon: 5,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});		
	});
}

/*公司-启用*/
function member_start(obj,id){
	layer.confirm('确认要启用吗？',function(index){
		$.ajax({
			type: 'POST',
			url: 'rsuserctrl/examineStateuser.do',
			data: "staffId="+id+"&examineState=1",
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_stop(this,'+id+'})" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>');
				$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已审核</span>');
				$(obj).remove();
				layer.msg('已审核!',{icon: 6,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});
	});
}




/*公司-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*公司-查看*/
function member_show(title,url,id,w,h){
	url=url+"?staffId="+id;
	layer_show(title,url,w,h);
}

/*公司-编辑*/
function member_edit(title,url,id,w,h){
	url=url+"?staffId="+id;
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
			url: 'rsuserctrl/deleteuser.do',
			data: "staffId="+id,
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
