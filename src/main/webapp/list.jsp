<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
<form action="querylist">
<input name="pagenum" value="${model.pagenum}" type="hidden">
品牌：<input name="key" value="${model.key}" >
<input type="submit" value="查詢">
<input type="button" value="批删" onclick="del()">
</form>
<table>
<tr>
<td><input type="checkbox"  id="qx"></td>
<td>${g.id }</td>
<td>${g.name }</td>
<td>${g.datea }</td>
<td>${g.tname }</td>
<td>${g.price }</td>
<td>操作</td>
</tr>
<c:forEach items="${list}" var="g">
<tr>
<td><input type="checkbox" value="${g.id}" name="id"></td>
<td>${g.id }</td>
<td>${g.name }</td>
<td>${g.datea }</td>
<td>${g.tname }</td>
<td>${g.price }</td>
<td>操作</td>
</tr>


</c:forEach>
</table>
<a href="#" onclick="getpage(1)">首页</a>
<a href="#" onclick="getpage(${model.pagenum-1})">上一页</a>
<a href="#" onclick="getpage(${model.pagenum+1})">下一页</a>
<a href="#" onclick="getpage(${model.pages})">尾页</a>
当前${model.pagenum }页/总${model.pages }页
</body>
<script type="text/javascript">
function getpage(p){
	$("[name=pagenum]").val(p);
	$("form").submit();
}

$(function(){
	$("#qx").toggle(function(){
		$("[name='id']").attr("checked",true);
	},
	function(){
		$("[name='id']").attr("checked",false);	
	}
	)
})
function del(){
	var ids=$("[name='id']:checked").map(function(){
		return $(this).val();
	}).get().join(",");
	alert(ids);
	$.post(
		"del",
		{"ids":ids},
		function(list){
			location.href="querylist";
		}
	
	)
}




</script>
</html>