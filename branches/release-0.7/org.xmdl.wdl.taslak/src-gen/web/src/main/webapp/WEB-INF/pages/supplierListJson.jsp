<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/json;charset=utf-8" %>
<%@ include file="/common/taglibs.jsp"%>
[
<s:iterator value="suppliers" status="iteratorStatus">
	"supplier": {
		"id" : <s:property value="id"/>,
		"name" : <s:property value="name" />, 
		"products.id" : <s:property value="products.id" />, 
	}<s:if test="!#iteratorStatus.last">,</s:if>
	
</s:iterator>
]

