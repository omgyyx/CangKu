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
<body class="bg-primary">
    <div class="page page-login text-center">
        <div class="panel">
            <div class="panel-body">
                <div class="logo">
                    <a href="#">ZUI-ADMIN</a>
                </div>
                <form action="${path }/admin/login.action">
                    <div class="form-group">
                        <input type="text" class="form-control" name="name" placeholder="登录名称">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="psw" placeholder="密码">
                    </div>
                   
                    <button type="submit" class="btn btn-lg btn-primary btn-block">登录</button>
                </form>
            </div>
        </div>
        <footer class="page-copyright page-copyright-inverse">
            <p>copyright BY qzimp</p>
            <p>© 2018-2035. All RIGHT RESERVED.</p>
        </footer>
    </div>
     
    
    <!-- zui js -->
    <script src="${path }/admin/dist/js/zui.min.js"></script>
    <!-- app js -->
    <script src="${path }/admin/js/app.js"></script>
</body>
</html>