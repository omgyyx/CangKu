<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<!-- jstl -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
  String path=request.getContextPath();
  pageContext.setAttribute("path", path);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>导航管理</title>
 <!-- zui css -->
    <link rel="stylesheet" href="${path }/admin/dist/css/zui.min.css">
    <link rel="stylesheet" href="${path }/admin/dist/theme/blue.css">
    <!-- app css -->
    <link rel="stylesheet" href="${path }/admin/css/app.css">
    <!-- jquery js -->
    <script src="${path }/admin/dist/lib/jquery/jquery.js"></script>
</head>
<body>
<!-- HTML 代码 -->
<table class="table datatable">
  <thead>
    <tr>
      <!-- 以下两列左侧固定 -->
      <th>#</th>
      <th>name</th>
      <th>url</th>
      <!-- 以下列右侧固定 -->
      <th>enable</th>
      <th>manage</th>
    </tr>
    
    <tr>
    <td colspan="5" align="right">
    <a class="btn btn-primary" href="#">添加</a>
     </td>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${navs }" var="nav">
    <tr>
    <td>${nav.id }</td>
    <td>${nav.name }</td>
    <td>${nav.url}</td>
    <td>${nav.enable }</td>
    <td></td>
    </tr>

</c:forEach>
  </tbody>
</table>
	<!-- zui js -->
    <script src="${path }/admin/dist/js/zui.min.js"></script>
    <!-- app js -->
    <script src="${path }/admin/js/app.js"></script>

</body>
</html>