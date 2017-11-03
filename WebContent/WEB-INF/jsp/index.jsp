<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:iterator value="orderList" status="n">
	点单ID:<s:property value="id" />
	地址：<s:property value="address"/>
	电话<s:property value="telNum"/><br>
	订单明细：<br>
	<s:iterator value="orderItems" status="t">	
		<s:property value="name" />*
	</s:iterator>	
	
	<br/><br/><br/>
</s:iterator>

<s:if test="userList.size()==0">
没有查找到数据
</s:if>
</body>
</html>