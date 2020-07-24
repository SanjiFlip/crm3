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
    <nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页<span class="c-gray en">&gt;</span>销售管理<span class="c-gray en">&gt;</span>客户信息管理 (客户编号：${sessionScope.nowcustomerid})
	<a class="btn btn-refresh radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a>
	</nav>
	<div class="page-container">
		<form class="form form-horizontal" id="form-article-add">
			<div id="tab-system" class="HuiTab">
				<div class="tabBar cl">
					<span>客户联系人</span>
					<span>客户联系记录</span>
					<span>客户反馈</span>
				</div>
				<div class="tabCon">
					<!-- 客户联系人 -->
					  <br>
				      <form action="contactctrl/selectcontact.do" method="post" id="myform">
						<div class="text-c"> 日期范围：
							<input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })"  value="<fmt:formatDate value="${contact.datemin }" pattern="yyyy-MM-dd"/>"  id="datemin" name="datemin" class="input-text Wdate" style="width:120px;">
							<input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" value="<fmt:formatDate value="${contact.datemax }" pattern="yyyy-MM-dd"/>" id="datemax" name="datemax" class="input-text Wdate" style="width:120px;">
							<input type="text" class="input-text" style="width:250px" placeholder="输入客户姓名"  value="${contact.contactName}" id="contactName" name="contactName">
							<input type="hidden" name="pageNum" id="pageNum" value="${p.pageNum }">
							<button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜客户联系人</button>
						    <button type="reset" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 重置</button>

						</div>
				      </form>
				     
					  <div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l">
					  <a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> 
					  <a href="javascript:;" onclick="member_add('添加客户联系人','contactctrl/goaddcontact.do?customerId=${record.customerId}','','510')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加客户联系人</a>
					  </span> <span class="r">共有数据：<strong>${p.total}</strong> 条</span> </div>
					  <div class="mt-20">
					
					<form action="contactctrl/deletecontactall.do" method="post" id="myform1">
						<table class="table table-border table-bordered table-hover table-bg table-sort">
							<thead>
							<tr class="text-c">
								<th width="25"><input type="checkbox" name="" value=""></th>
								<th width="80">ID</th>
								<th width="100">客户编号</th>			
								<th width="100">联系人姓名</th>			
								<th width="70">职务</th>
								<th width="100" >手机</th>
								<th width="150">地址</th>
								<th width="150">最后修改时间</th>			
								<th width="150">备注信息</th>
								<th width="180">操作</th>
							</tr>
							</thead>
							
							<tbody>
							<c:forEach items="${p.list}"  var="contact">
								<tr class="text-c">
									<td><input type="checkbox" value="${contact.contactId}" name="ids"></td>
									<td>${contact.contactId}</td>
									<td>${contact.customerId}</td>
									<td><u style="cursor:pointer" class="text-primary" onclick="member_show('张三','member-show.html','10001','360','400')">${contact.contactName}</u></td>				
									<td>${contact.job}</td>
									<td>${contact.mobilephone}</td>
									<td class="text-l">${contact.address}</td>
									<td><!-- 格式化时间 -->
									<fmt:formatDate value="${contact.lastModifyDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
									</td>
									<td>${contact.noteInformation}</td>
									<td class="td-manage">
												
									<a title="编辑" href="javascript:;" onclick="member_edit('编辑客户联系人','contactctrl/goaddcontact.do','${contact.contactId}','','510')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>							
									<a title="删除" href="javascript:;" onclick="member_del(this,'${contact.contactId}')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>
									
									</td>
								</tr>
						    </c:forEach>	
							</tbody>
						</table>
					 </form>
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
	
				
				 
		<div class="tabCon">
			<!-- 客户联系记录 -->
			<div class="page-container">
			   <form action="recordctrl/selectrecord.do" method="post" id="myform">
				<div class="text-c"> 日期范围：
					<input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })"  value="<fmt:formatDate value="${record.datemin }" pattern="yyyy-MM-dd"/>"  id="datemin" name="datemin" class="input-text Wdate" style="width:120px;">
					<input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" value="<fmt:formatDate value="${record.datemax }" pattern="yyyy-MM-dd"/>" id="datemax" name="datemax" class="input-text Wdate" style="width:120px;">
					<input type="text" class="input-text" style="width:250px" placeholder="输入联系记录标题"  value="${record.contactHeading}" id="contactHeading" name="contactHeading">
					<input type="hidden" name="pageNum" id="pageNum" value="${p.pageNum }">
					<button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜客户联系记录</button>
				    <button type="reset" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 重置</button>
				    
				</div>
			   </form>
			   
				<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l">
				<a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> 
				<a href="javascript:;" onclick="member_add('添加客户联系记录','recordctrl/goaddrecord.do?customerId=${record.customerId}','','510')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加客户联系记录</a>
				</span> <span class="r">共有数据：<strong>${p1.total}</strong> 条</span> </div>
				<div class="mt-20">
				
			  <form action="recordctrl/deleterecordall.do" method="post" id="myform1">
				<table class="table table-border table-bordered table-hover table-bg table-sort">
					<thead>
						<tr class="text-c">
							<th width="25"><input type="checkbox" name="" value=""></th>
							<th width="50">ID</th>
							<th width="100">联系标题</th>			
							<th width="130">联系时间</th>			
							<th width="50">客户编号</th>
							<th width="200">联系内容</th>
							<th width="50" >公司编号</th>				
							<th width="130">最后修改时间</th>						
							<th width="80">操作</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${p1.list}"  var="record">
						<tr class="text-c">
							<td><input type="checkbox" value="${record.contactRecordId}" name="ids"></td>
							<td>${record.contactRecordId}</td>
							<td>${record.contactHeading}</td>
							<td><fmt:formatDate value="${record.contactDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
							<td>${record.customerId}</td>
							<td>${record.contactContent}</td>
							<td>${record.companyId}</td>
							<td><fmt:formatDate value="${record.lastModifyDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
						
							<td class="td-manage">
							
							<a title="编辑" href="javascript:;" onclick="member_edit1('编辑客户联系记录','recordctrl/goaddrecord.do','${record.contactRecordId}','','510')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>
							
							<a title="删除" href="javascript:;" onclick="member_del1(this,'${record.contactRecordId}')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>
						
						 
						     </td>
						</tr>
				    </c:forEach>	
					</tbody>
				</table>
				</form>
				</div>
				
				<br>
				<span>当前${p1.pageNum}/${p1.pages}页</span>
				<div style="float: right;">	
				<button onclick="gopage(${p1.navigateFirstPage})" style="height: 26px;width: 50px; border: 0px; border-radius: 5px;">首页</button>
				<button onclick="gopage(${p1.prePage})" style="height: 26px;width: 50px; border: 0px; border-radius: 5px;">上一页</button>	
				<button disabled="disabled" style="width: 26px; height: 26px; background-color: rgb(90, 152, 222) ;border: 0px; border-radius:5px">${p1.pageNum }</button> 	
				<button onclick="gopage(${p1.nextPage })" style="height: 26px;width: 50px; border: 0px; border-radius: 5px;">下一页</button>
				<button onclick="gopage(${p1.navigateLastPage })" style="height: 26px;width: 50px; border: 0px; border-radius: 5px;">尾页</button>
				</div>			
			</div>
		</div>
				
				   
		<div class="tabCon">
			<div class="page-container">
			<!--反馈记录  -->
			   <form action="feedbackctrl/selectfeedback.do" method="post" id="myform">
				<div class="text-c"> 日期范围：
					<input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })"  value="<fmt:formatDate value="${feedback.datemin }" pattern="yyyy-MM-dd"/>"  id="datemin" name="datemin" class="input-text Wdate" style="width:120px;">
					<input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" value="<fmt:formatDate value="${feedback.datemax }" pattern="yyyy-MM-dd"/>" id="datemax" name="datemax" class="input-text Wdate" style="width:120px;">
					<input type="text" class="input-text" style="width:250px" placeholder="输入记录优先级"  value="${feedback.recordPriority}" id="recordPriority" name="recordPriority">
					<input type="hidden" name="pageNum" id="pageNum" value="${p.pageNum }">
					<button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜客户反馈记录</button>
				    <button type="reset" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 重置</button>
				    
				</div>
			   </form>
				<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l">
				<a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> 
				<a href="javascript:;" onclick="member_add('添加客户反馈记录','feedbackctrl/goaddfeedback.do?customerId=${record.customerId}','','510')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加客户反馈记录</a>
				</span> <span class="r">共有数据：<strong>${p2.total}</strong> 条</span> </div>
				<div class="mt-20">
			  <form action="feedbackctrl/deletefeedbackall.do" method="post" id="myform1">
				<table class="table table-border table-bordered table-hover table-bg table-sort">
					<thead>
						<tr class="text-c">
							<th width="25"><input type="checkbox" name="" value=""></th>
							<th width="80">ID</th>
							<th width="80">记录优先级</th>			
							<th width="80">客户编号</th>			
							<th width="80">状态</th>
							<th width="80" >反馈类型</th>
							<th width="180">反馈时间</th>
							<th width="200">反馈原因</th>			
							<th width="100">负责人</th>
							<th width="180">最后修改时间</th>
							<th width="120">操作</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${p2.list}"  var="feedback">
						<tr class="text-c">
							<td><input type="checkbox" value="${feedback.feedbackRecordId}" name="ids"></td>
							<td>${feedback.feedbackRecordId}</td>
							<td>${feedback.recordPriority}</td>
							<td>${feedback.customerId}</td>
							<td>${feedback.state}</td>
							<td>${feedback.feedbackType}</td>
							<td>
							<fmt:formatDate value="${feedback.feedbackDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
							</td>
							<td>${feedback.feedbackReason}</td>
							<td>${feedback.head}</td>
							<td>
							<fmt:formatDate value="${feedback.lastModifyDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
							</td>
							
							<td class="td-manage">
							
							 <a title="编辑" href="javascript:;" onclick="member_edit2('编辑客户反馈记录','feedbackctrl/goaddfeedback.do','${feedback.feedbackRecordId}','800','510')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>
							
							 <a title="删除" href="javascript:;" onclick="member_del2(this,'${feedback.feedbackRecordId}')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>
 

							</td>
						</tr>
				    </c:forEach>	
					</tbody>
				</table>
				</form>
				</div>
				
				<br>
				<span>当前${p2.pageNum}/${p2.pages}页</span>
				<div style="float: right;">	
				<button onclick="gopage(${p2.navigateFirstPage})" style="height: 26px;width: 50px; border: 0px; border-radius: 5px;">首页</button>
				<button onclick="gopage(${p2.prePage})" style="height: 26px;width: 50px; border: 0px; border-radius: 5px;">上一页</button>	
				<button disabled="disabled" style="width: 26px; height: 26px; background-color: rgb(90, 152, 222) ;border: 0px; border-radius:5px">${p2.pageNum }</button> 	
				<button onclick="gopage(${p2.nextPage })" style="height: 26px;width: 50px; border: 0px; border-radius: 5px;">下一页</button>
				<button onclick="gopage(${p2.navigateLastPage })" style="height: 26px;width: 50px; border: 0px; border-radius: 5px;">尾页</button>
				</div>	
			</div>						
		</div>			
  </form>
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
/*联系人-编辑*/
function member_edit(title,url,id,w,h){
   url=url+"?contactId="+id  //修改比添加多带一个id
	layer_show(title,url,w,h);
}

/*联系人-删除*/
function member_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: 'contactctrl/deletecontact.do',
			data:"contactId="+id,
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
/*联系记录-编辑*/
function member_edit1(title,url,id,w,h){
   url=url+"?contactRecordId="+id  //修改比添加多带一个id
	layer_show(title,url,w,h);
}

/*联系记录-删除*/
function member_del1(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: 'recordctrl/deleterecord.do',
			data:"contactRecordId="+id,
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

/*反馈记录-编辑*/
function member_edit2(title,url,id,w,h){
   url=url+"?feedbackRecordId="+id  //修改比添加多带一个id
	layer_show(title,url,w,h);
}

/*反馈记录-删除*/
function member_del2(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: 'feedbackctrl/deletefeedback.do',
			data:"feedbackRecordId="+id,
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
