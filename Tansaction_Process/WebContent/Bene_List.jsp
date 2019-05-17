<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*;" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="Bef_list">
<table>
<tr><td>Beneficiary Id </td><td><%=request.getAttribute("id")%></td></tr>
<tr><td>Beneficiary Name </td><td><%= request.getAttribute("name")%></td></tr>
<tr><td>Beneficiary Account Type </td><td><%= request.getAttribute("atype")%></td></tr>
<tr><td>Beneficiary Account Number </td><td><%= request.getAttribute("mmid")%></td></tr>
<tr><td>Beneficiary MMID </td><td><%= request.getAttribute("ifsc")%></td></tr>
<tr><td>IFSC Code </td><td><%= request.getAttribute("limit")%></td></tr>
<tr><input type="button" onclick=""></tr>
</table>
</form>
</body>
</html>