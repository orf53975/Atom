<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<c:set var="ctx" value="<%=request.getContextPath()%>" />

<html>
<head>

<meta charset="UTF-8">

<title>正在登录OG视讯....</title>


</head>

<body>
正在登录OG视讯....
<form method="post" name="form1" action="${url }">
	<input name="params" value="${params }" type="hidden"/>
	<input name="key" value="${key }" type="hidden"/>
</form>
  
</body>

</html>
<script>
form1.submit();
</script>