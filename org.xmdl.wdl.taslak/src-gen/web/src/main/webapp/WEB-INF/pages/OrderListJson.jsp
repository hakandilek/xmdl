<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/json;charset=utf-8" %>
<%@ include file="/common/taglibs.jsp"%>
[
<s:iterator value="orders" status="iteratorStatus">
	"order": {
		"id" : <s:property value="id"/>,
		"name" : <s:property value="name" />, 
		"priceTotals" : <s:property value="priceTotals" />, 
		"createDate" : <s:property value="createDate" />, 
		"orderElements.id" : <s:property value="orderElements.id" />, 
	}<s:if test="!#iteratorStatus.last">,</s:if>
	
</s:iterator>
]

