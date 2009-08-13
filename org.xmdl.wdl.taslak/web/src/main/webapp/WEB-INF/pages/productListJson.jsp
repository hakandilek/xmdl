<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/json;charset=utf-8" %>
<%@ include file="/common/taglibs.jsp"%>
[
<s:iterator value="products" status="iteratorStatus">
	"product": {
		"id" : <s:property value="id"/>,
		"name" : <s:property value="name" />, 
		"price" : <s:property value="price" />, 
		"productType" : <s:property value="productType" />, 
		"orderElements.id" : <s:property value="orderElements.id" />, 
		"suppliers.id" : <s:property value="suppliers.id" />, 
	}<s:if test="!#iteratorStatus.last">,</s:if>
	
</s:iterator>
]

