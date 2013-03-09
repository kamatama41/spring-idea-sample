<%@ page language="java" trimDirectiveWhitespaces="true" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%-- ▼ taglib --%>
<%@ include file="/include/taglibs.inc.jsp"%>
<%-- ▲ taglib --%>
<html>
<head>
    <title>Spring 3.0 MVC : Hello World</title>
</head>
<body>
<p>モデルの値の呼び出し。</p>
<ul>
    <li>message1=${message1}</li>
    <li>message1(カスタムタグから)=<c:out value="${message1}" /></li>
    <li>message2=${message2}</li>
    <li>currentDate(フォーマットする)=<fmt:formatDate value="${currentDate}" pattern="yyyy 年MM 月dd 日"/></li>
</ul>
</body>
</html>