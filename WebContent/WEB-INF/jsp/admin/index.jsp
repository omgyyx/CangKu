<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  String path=request.getContextPath();
  pageContext.setAttribute("path", path);
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>zui-admin</title>
    <!-- zui css -->
    <link rel="stylesheet" href="${path }/admin/dist/css/zui.min.css">
    <link rel="stylesheet" href="${path }/admin/dist/theme/blue.css">
    <!-- app css -->
    <link rel="stylesheet" href="${path }/admin/css/app.css">
    <!-- jquery js -->
    <script src="${path }/admin/dist/lib/jquery/jquery.js"></script>
    
</head>
<body>
    <div class="wrapper">
        <header class="main-header">
            <nav class="navbar navbar-fixed-top bg-primary">
                <div class="navbar-header">
                    <a class="navbar-toggle" href="javascript:;" data-toggle="collapse" data-target=".navbar-collapse"><i class="icon icon-th-large"></i></a>
                    <a class="sidebar-toggle" href="javascript:;" data-toggle="push-menu"><i class="icon icon-bars"></i></a>
                    <a class="navbar-brand" href="#">
                        <span class="logo">ZUIAdmin</span>
                        <span class="logo-mini">ZA</span> 
                    </a>
                </div>
                <div class="collapse navbar-collapse">
                    <div class="container-fluid">
                        <ul class="nav navbar-nav">
                            <li><a href="javascript:;" data-toggle="push-menu"><i class="icon icon-bars"></i></a></li>
                        </ul>
                        <ul class="nav navbar-nav navbar-right">
                            <li>
                                <a href="javascript:;">
                                    <span>
                                        <i class="icon icon-bell-alt"></i>
                                        <span class="label label-danger label-pill up">5</span>
                                    </span>
                                </a>
                            </li>
                            <li>
                                <a href="javascript:;">
                                    <span>
                                        <i class="icon icon-envelope-alt"></i>
                                        <span class="label label-success label-pill up">2</span>
                                    </span>
                                </a>
                            </li>
                            <li class="dropdown">
                                <a href="javascript:;" data-toggle="dropdown"><i class="icon icon-user"></i> 管理员 <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">资料设置</a></li>
                                    <li><a href="#">清除缓存</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#">注销</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>
        <aside class="main-sidebar">
            <section class="sidebar">
                <ul class="sidebar-menu" data-widget="tree">
                    <li class="header">主要菜单</li>
                    <li class="active">
                        <a href="index.html">
                            <i class="icon icon-dashboard"></i> 
                            <span>仪表盘</span>
                            <span class="pull-right-container">
                            </span>
                        </a>
                    </li>
                     <li class="treeview">
                        <a href="javascript:;">
                            <i class="icon icon-file"></i> 
                            <span>导航管理</span>
                            <span class="pull-right-container">
                                <i class="icon icon-angle-left"></i>
                            </span>
                        </a>
                        <ul class="treeview-menu">
                            <li><a href="#"><i class="icon icon-circle-blank"></i> 导航添加</a></li>
                            <li><a href="${path }/admin/nav/index.action" target="content"><i class="icon icon-circle-blank"></i> 导航管理</a></li>
                          
                        </ul>
                    </li>
                    <li class="treeview">
                        <a href="javascript:;">
                            <i class="icon icon-file"></i> 
                            <span>页面演示</span>
                            <span class="pull-right-container">
                                <i class="icon icon-angle-left"></i>
                            </span>
                        </a>
                        <ul class="treeview-menu">
                            <li><a href="layout.html"><i class="icon icon-circle-blank"></i> 空白页</a></li>
                            <li><a href="login.html"><i class="icon icon-circle-blank"></i> 登录</a></li>
                            <li><a href="error-404.html"><i class="icon icon-circle-blank"></i> 404页</a></li>
                            <li><a href="config.html"><i class="icon icon-circle-blank"></i> 系统设置</a></li>
                            <li><a href="list.html"><i class="icon icon-circle-blank"></i> 用户列表</a></li>
                        </ul>
                    </li>
                    <li class="treeview">
                        <a href="javascript:;">
                            <i class="icon icon-columns"></i> 
                            <span>基础组件</span>
                            <span class="pull-right-container">
                                <i class="icon icon-angle-left"></i>
                            </span>
                        </a>
                        <ul class="treeview-menu">
                            <li><a href="component-checkbox-radio.html"><i class="icon icon-circle-blank"></i> 多选和单选框</a></li>
                            <li><a href="component-step.html"><i class="icon icon-circle-blank"></i> 步骤条</a></li>
                        </ul>
                    </li>
                    <li class="treeview">
                        <a href="javascript:;">
                            <i class="icon icon-sign-blank"></i> 
                            <span>扩展插件</span>
                            <span class="pull-right-container">
                                <i class="icon icon-angle-left"></i>
                            </span>
                        </a>
                        <ul class="treeview-menu">
                            <li><a href="plugin-toastr.html"><i class="icon icon-circle-blank"></i> Toastr</a></li>
                            <li><a href="plugin-notify.html"><i class="icon icon-circle-blank"></i> Notify</a></li>
                        </ul>
                    </li>
                </ul>
            </section>
        </aside>
        <div class="content-wrapper">
            <div class="content-header">
                <ul class="breadcrumb">
                    <li><a href="#"><i class="icon icon-home"></i></a></li>
                    <li class="active">仪表盘</li>
                </ul>
            </div>
            <div class="content-body">
                <iframe name="content" id="content" width="100%" style="min-height:800px" border="0" frameborder="no" src="${path }/welcome.action"></iframe>
            </div>
        </div> 
    </div>
    <!-- zui js -->
    <script src="${path }/admin/dist/js/zui.min.js"></script>
    <!-- app js -->
    <script src="${path }/admin/js/app.js"></script>
</body>
</html>
