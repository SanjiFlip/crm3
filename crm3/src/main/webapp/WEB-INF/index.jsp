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
<title>H-ui.admin v3.1</title>
<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
<header class="navbar-wrapper">
	<div class="navbar navbar-fixed-top">
		<div class="container-fluid cl"> <a class="logo navbar-logo f-l mr-10 hidden-xs" href="javascript:;">Sanji管理平台</a> <a class="logo navbar-logo-m f-l mr-10 visible-xs" href="/aboutHui.shtml">H-ui</a> 
			<span class="logo navbar-slogan f-l mr-10 hidden-xs">v6.6</span> 
			<a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:;">&#xe667;</a>
			
		<nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
			<ul class="cl">
				<li>${nowrole.roleName}</li>
				<li class="dropDown dropDown_hover">
					<a href="#" class="dropDown_A">${nowuser.userName}<i class="Hui-iconfont">&#xe6d5;</i></a>
					<ul class="dropDown-menu menu radius box-shadow">
						<li><a href="javascript:;" onClick="myselfinfo()">个人信息</a></li>
						<li><a href="logout.do">退出</a></li>
				</ul>
			</li>
				<!-- <li id="Hui-msg"> <a href="#" title="消息"><span class="badge badge-danger">1</span><i class="Hui-iconfont" style="font-size:18px">&#xe68a;</i></a> </li> -->
				<li id="Hui-skin" class="dropDown right dropDown_hover"> <a href="javascript:;" class="dropDown_A" title="换肤"><i class="Hui-iconfont" style="font-size:18px">&#xe62a;</i></a>
					<ul class="dropDown-menu menu radius box-shadow">
						<li><a href="javascript:;" data-val="default" title="默认（黑色）">默认（黑色）</a></li>
						<li><a href="javascript:;" data-val="blue" title="蓝色">蓝色</a></li>
						<li><a href="javascript:;" data-val="green" title="绿色">绿色</a></li>
						<li><a href="javascript:;" data-val="red" title="红色">红色</a></li>
						<li><a href="javascript:;" data-val="yellow" title="黄色">黄色</a></li>
						<li><a href="javascript:;" data-val="orange" title="橙色">橙色</a></li>
					</ul>
				</li>
			</ul>
		</nav>
	</div>
</div>
</header>
<aside class="Hui-aside">
	<div class="menu_dropdown bk_2">
		<dl id="menu-product">
			<dt><i class="Hui-iconfont">&#xe620;</i> 采购库存管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>

			<ul>
			<li><span style="margin-left: 24px;cursor:pointer;"onclick="kc1()" >仓库管理</span></li>
			   <ul id="kc" style="display: none;">
								<li><a data-href="KcDeptCtrl/selectdepo.do"
									data-title="仓库信息管理"> <i class="Hui-iconfont">&#xe623;</i>&nbsp仓库信息管理
								</a></li>
								<li><a data-href="KcGoodsCtrl/selectgoods.do" data-title="仓库商品管理">
										<i class="Hui-iconfont">&#xe623;</i>&nbsp仓库商品管理
								</a></li>
							</ul>
				<li><span style="margin-left: 24px;cursor:pointer;"onclick="cg1()" >采购管理</span></li>
				<ul id="cg" style="display: none;">
								<li><a data-href="cgrepctrl/selectcgrep.do"
									data-title="需补货产品管理"> <i class="Hui-iconfont">&#xe623;</i>&nbsp需补货产品管理
								</a></li>
								<li><a data-href="cgpurctrl/selectpur.do " data-title="采购订单信息">
										<i class="Hui-iconfont">&#xe623;</i>&nbsp采购订单信息
								</a></li>
								<!-- <li><a data-href="cgdetailorder/selectcgdetail.do" data-title="采购订单详情信息">
										<i class="Hui-iconfont">&#xe623;</i>&nbsp采购订单详情信息
								</a></li> -->
								<li><a data-href="cgsupplier/selectsupp.do" data-title="供应商管理">
										<i class="Hui-iconfont">&#xe623;</i>&nbsp供应商管理
								</a></li>
							</ul>
		</dd>
	</dl>
		<dl id="menu-member">
			<dt><i class="Hui-iconfont">&#xe60d;</i> 人事管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="rscompnayctrl/selectcompnay.do" data-title="公司管理" href="javascript:;">公司管理</a></li>
					<li><a data-href="rsuserctrl/selectuser.do" data-title="员工管理" href="javascript:;">员工管理</a></li>
					<li><a data-href="rsdeptmentctrl/selectrsdeptment.do" data-title="部门管理" href="javascript:;">部门管理</a></li>
					<li><a data-href="rspostctrl/selectrspost.do" data-title="职务管理" href="javascript:;">职务管理</a></li>
					
			</ul>
		</dd>
	</dl>
		<dl id="menu-product">
			<dt><i class="Hui-iconfont">&#xe620;</i> 办公管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="bgexaminetargetctrl/selecttarget.do" data-title="任务指标管理" href="javascript:void(0)">任务指标管理</a></li>
					<li><a data-href="bgexaminetaskctrl/selecttask.do" data-title="任务发布管理" href="javascript:void(0)">任务发布管理</a></li>
					<li><a data-href="bgtaskdedailctrl/selectdedail.do" data-title="任务详情管理" href="javascript:void(0)">任务详情管理</a></li>
					<li><a data-href="bgsmsctrl/selectsms.do" data-title="短信息管理" href="javascript:void(0)">短信息管理</a></li>
					<li><a data-href="bgpersonalschedule/selectschedule.do" data-title="个人日程管理" href="javascript:void(0)">个人日程管理</a></li>
			</ul>
		</dd>
	</dl>
		<dl id="menu-tongji">
			<dt><i class="Hui-iconfont">&#xe61a;</i> 销售管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="customerctrl/selectcustomer.do" data-title="客户信息管理" href="javascript:void(0)">客户信息</a></li>
					<li><a data-href="contactctrl/selectcontact.do" data-title="客户联系人" href="javascript:void(0)">客户联系人</a></li>
					<li><a data-href="recordctrl/selectrecord.do" data-title="客户联系记录" href="javascript:void(0)">客户联系记录</a></li>
					<li><a data-href="salelistctrl/selectsalelist.do" data-title="销售出库单" href="javascript:void(0)">销售出库单</a></li>
					<li><a data-href="detailctrl/selectdetail.do" data-title="销售详情" href="javascript:void(0)">销售详情</a></li>
					<li><a data-href="feedbackctrl/selectfeedback.do" data-title="客户反馈" href="javascript:void(0)">客户反馈</a></li>
					<li><a data-href="losectrl/selectlose.do" data-title="客户流失" href="javascript:void(0)">客户流失</a></li>
			</ul>
		</dd>
	</dl>
		<dl id="menu-system">
			<dt><i class="Hui-iconfont">&#xe62e;</i> 系统管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="xtaccountctrl/selectaccount.do" data-title="用户账户管理" href="javascript:void(0)">用户账户管理</a></li>
					<li><a data-href="xtrolectrl/selectxtrole.do" data-title="角色管理" href="javascript:void(0)">角色管理</a></li>
					<li><a data-href="permctrl/selectcolumns.do" data-title="权限分栏管理" href="javascript:void(0)">权限分栏管理</a></li>
					<li><a data-href="xtlogctrl/selectxtlog.do" data-title="系统日志管理" href="javascript:void(0)">系统日志管理</a></li>
			</ul>
		</dd>
	</dl>
</div>
</aside>
<div class="dislpayArrow hidden-xs"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
<section class="Hui-article-box">
	<div id="Hui-tabNav" class="Hui-tabNav hidden-xs">
		<div class="Hui-tabNav-wp">
			<ul id="min_title_list" class="acrossTab cl">
				<li class="active">
					<span title="我的桌面" data-href="druid">我的桌面</span>
					<em></em></li>
		</ul>
	</div>
		<div class="Hui-tabNav-more btn-group"><a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i></a><a id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i></a></div>
</div>
	<div id="iframe_box" class="Hui-article">
		<div class="show_iframe">
			<div style="display:none" class="loading"></div>
			<iframe scrolling="yes" frameborder="0" src="http://localhost:8080/crm3/druid/index.html"></iframe>
	</div>
</div>
</section>

<div class="contextMenu" id="Huiadminmenu">
	<ul>
		<li id="closethis">关闭当前 </li>
		<li id="closeall">关闭全部 </li>
</ul>
</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="lib/jquery.contextmenu/jquery.contextmenu.r2.js"></script>
<script type="text/javascript">
$(function(){
	/*$("#min_title_list li").contextMenu('Huiadminmenu', {
		bindings: {
			'closethis': function(t) {
				console.log(t);
				if(t.find("i")){
					t.find("i").trigger("click");
				}		
			},
			'closeall': function(t) {
				alert('Trigger was '+t.id+'\nAction was Email');
			},
		}
	});*/
});
/*个人信息*/
function myselfinfo(){
	layer.open({
		type: 1,
		area: ['300px','200px'],
		fix: false, //不固定
		maxmin: true,
		shade:0.4,
		title: '查看信息',
		content: '<div>管理员信息</div>'
	});
}

/*资讯-添加*/
function article_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*图片-添加*/
function picture_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*产品-添加*/
function product_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*用户-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}

//样式的开启和关闭
function kc1() {
	var kcdepo = document.getElementById("kc").style.display;
/* alert("这是我自己写的树状列表，你们需要的话就看代码，当前状态："+zt); */
	if (kcdepo == "none") {
		document.getElementById("kc").style.display = "block";
			}
		if (kcdepo == "block") {
		document.getElementById("kc").style.display = "none";
			}
	}
	
function cg1() {
	var cggoods = document.getElementById("cg").style.display;
/* alert("这是我自己写的树状列表，你们需要的话就看代码，当前状态："+zt); */
	if (cggoods == "none") {
		document.getElementById("cg").style.display = "block";
			}
		if (cggoods == "block") {
		document.getElementById("cg").style.display = "none";
			}
	}
</script> 


</body>
</html>
