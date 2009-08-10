<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/json;charset=utf-8" %>
<%@ include file="/common/taglibs.jsp"%>
[
<s:iterator value="profiles" status="iteratorStatus">
	"profile": {
		"id" : <s:property value="id"/>,
		"user.id" : <s:property value="user.id" />, 
		"privatePhone" : <s:property value="privatePhone" />, 
	}<s:if test="!#iteratorStatus.last">,</s:if>
	
</s:iterator>
]

