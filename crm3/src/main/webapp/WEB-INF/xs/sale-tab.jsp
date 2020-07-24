<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
  <title>客户</title>
  </head>
  <body>
    <nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页<span class="c-gray en">&gt;</span>销售管理<span class="c-gray en">&gt;</span>客户信息管理 (客户编号：${sessionScope.nowsaleid})
	<a class="btn btn-refresh radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a>
	</nav>
	<div class="page-container">
		<form class="form form-horizontal" id="form-article-add">
			<div id="tab-system" class="HuiTab">
				<div class="tabBar cl">
					<span>销售详情单</span>
				</div>
				<div class="tabCon">
					<div class="page-container">
		   <form action="detailctrl/selectdetail.do" method="post" id="myform">
			<div class="text-c"> 日期范围：
				<input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })"  value="<fmt:formatDate value="${detail.datemin }" pattern="yyyy-MM-dd"/>"  id="datemin" name="datemin" class="input-text Wdate" style="width:120px;">
				<input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" value="<fmt:formatDate value="${detail.datemax }" pattern="yyyy-MM-dd"/>" id="datemax" name="datemax" class="input-text Wdate" style="width:120px;">
				<input type="hidden" name="pageNum" id="pageNum" value="${p.pageNum }">
				<button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
			    <button type="reset" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 重置</button>
			</div>
		   </form>
			<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l">
			<a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> 
			<a href="javascript:;" onclick="member_add('添加销售详情','detailctrl/goadddetail.do?salesId=${detail.salesId}','','510')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加销售详情单</a>
			</span> <span class="r">共有数据：<strong>${p.total}</strong> 条</span> </div>
			<div class="mt-20">
		  <form action="detailctrl/deletedetailall" method="post" id="myform1">
			<table class="table table-border table-bordered table-hover table-bg table-sort">
				<thead>
					<tr class="text-c">
						<th width="25"><input type="checkbox" name="" value=""></th>
						<th width="80 ">ID</th>
						<th width="100">销售单编号</th>			
						<th width="100">商品编号</th>			
						<th width="70 ">商品数量</th>
						<th width="100">商品价格</th>
						<th width="150">备注说明</th>
						<th width="130">公司编号</th>			
						<th width="150">最后修改时间</th>
						<th width="180">操作</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${p.list}"  var="detail">
					<tr class="text-c">
						<td><input type="checkbox" value="${detail.salesDetailId}" name="ids"></td>
						<td>${detail.salesDetailId}</td>
						<td>${detail.salesId}</td>
						<td>${detail.goodsId}</td>
						<td>${detail.goodsNumber}</td>
						<td>${detail.goodsPrice}</td>			
						<td>${detail.noteInformation}</td>
						<td>${detail.companyId}</td>
						<td>
						<fmt:formatDate value="${detail.lastModifyDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
						</td>
						
						 <td class="td-manage">
						
						 <a title="编辑" href="javascript:;" onclick="member_edit('编辑销售详情单','detailctrl/goadddetail.do','${detail.salesDetailId}','','510')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>
						
						 <a title="删除" href="javascript:;" onclick="member_del(this,'${detail.salesDetailId}')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
					</tr>
			    </c:forEach>	
				</tbody>
			</table>
			</form>
			</div>
			
			<br>
			<span>当前${p.pageNum}/${p.pages}页</span>
			<div style="float: right;">	
			<button onclick="gopage(${p.navigateFirstPage})" style="height: 26px;width: 50px; border: 0px; border-radius: 5px;">首页</button>
			<button onclick="gopage(${p.prePage})" style="height: 26px;width: 50px; border: 0px; border-radius: 5px;">上一页</button>	
			<button disabled="disabled" style="width: 26px; height: 26px; background-color: rgb(90, 152, 222) ;border: 0px; border-radius:5px">${p.pageNum }</button> 	
			<button onclick="gopage(${p.nextPage })" style="height: 26px;width: 50px; border: 0px; border-radius: 5px;">下一页</button>
			<button onclick="gopage(${p.navigateLastPage })" style="height: 26px;width: 50px; border: 0px; border-radius: 5px;">尾页</button>
			</div>
	
	  </div>
</div>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="<%=basePath%>lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath%>lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="<%=basePath%>static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="<%=basePath%>lib/My97DatePicker/4.8/WdatePicker.js"></script>
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
	$("#tab-system").Huitab({
		index:0
	});
});
/*用户-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
	var index = parent.layer.getFrameIndex(window.name);
}
/*用户-查看*/
function member_show(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*-编辑*/
function member_edit(title,url,id,w,h){
   url=url+"?salesDetailId="+id  //修改比添加多带一个id
	layer_show(title,url,w,h);
}

/*-删除*/
function member_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: 'detailctrl/deletedetail.do',
			data:"salesDetailId="+id,
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
$(function(){
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
			window.parent.location.reload();
			parent.layer.msg('添加成功!',{icon: 6,time:1000});
			parent.layer.close(index);
	
		}
	});
});
</script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>
