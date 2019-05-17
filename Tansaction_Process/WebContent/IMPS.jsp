<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*;" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.sub{
border:none;
text-decoration: underline;
}
</style>
</head>
<body>
<table>
<form name="IMPS-form">
<table align="center">
<tr><td>Source Account</td>  <td><select name="source_Acc">
                 <option value="0">Source Account Number</option>
                 <%
                 try{
                	 DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                	 Statement st=con.createStatement();
                	 ResultSet rs=st.executeQuery("select distinct BENEFICIARY_ID from priya1996.Beneficiary");
                	 while(rs.next())
                	 {
                		 %>
                		 <option value="<%=rs.getString("BENEFICIARY_ID") %>"><%=rs.getString("BENEFICIARY_ID") %></option>
                		 <%
                	 }
                 }
                 catch(Exception e)
                 {
                	 e.printStackTrace();
                 }
                 %>
                 </select></td></tr>
<tr><td>Source MMID</td> <td><select name="source_Acc">
                 <option value="0">Source Account Number</option>
                 <%
                 try{
                	 DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                	 Statement st=con.createStatement();
                	 ResultSet rs=st.executeQuery("select distinct BENEFICIARY_ID from priya1996.Beneficiary");
                	 while(rs.next())
                	 {
                		 %>
                		 <option value="<%=rs.getString("BENEFICIARY_ID") %>"><%=rs.getString("BENEFICIARY_ID") %></option>
                		 <%
                	 }
                 }
                 catch(Exception e)
                 {
                	 e.printStackTrace();
                 }
                 %>
                 </select></td></tr>
<tr><td>Beneficiary ID</td>  <td><select name="bef_list">
                 <option value="0">Beneficiary ID</option>
                 <%
                 try{
                	 DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                	 Statement st=con.createStatement();
                	 ResultSet rs=st.executeQuery("select distinct BENEFICIARY_ID from priya1996.Beneficiary");
                	 while(rs.next())
                	 {
                		 %>
                		 <option value="<%=rs.getString("BENEFICIARY_ID") %>"><%=rs.getString("BENEFICIARY_ID") %></option>
                		 <%
                	 }
                 }
                 catch(Exception e)
                 {
                	 e.printStackTrace();
                 }
                 %>
                 </select></td></tr>
<tr><td>Beneficiary Name</td> <td><select name="bef_Name">
                 <option value="0">Beneficary Name</option>
                 <%
                 try{
                	 DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                	 Statement st=con.createStatement();
                	 ResultSet rs=st.executeQuery("select BENEFICIARY_NAME from priya1996.Beneficiary");
                	 while(rs.next())
                	 {
                		 %>
                		 <option value="<%=rs.getString("BENEFICIARY_NAME") %>"><%=rs.getString("BENEFICIARY_NAME") %></option>
                		 <%
                	 }
                 }
                 catch(Exception e)
                 {
                	 e.printStackTrace();
                 }
                 %>
                 </select></td></tr>
<tr><td>Beneficiary MMID</td> <td><select name="source_Acc">
                 <option value="0">Source Account Number</option>
                 <%
                 try{
                	 DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                	 Statement st=con.createStatement();
                	 ResultSet rs=st.executeQuery("select distinct BENEFICIARY_ID from priya1996.Beneficiary");
                	 while(rs.next())
                	 {
                		 %>
                		 <option value="<%=rs.getString("BENEFICIARY_ID") %>"><%=rs.getString("BENEFICIARY_ID") %></option>
                		 <%
                	 }
                 }
                 catch(Exception e)
                 {
                	 e.printStackTrace();
                 }
                 %>
                 </select></td></tr>
<tr><td>Transfer Amount</td><td><input type="text" name="trans_amount"></td></tr>
<tr><td>Remarks</td><td><input type="text" name="payment_details"></td></tr> 
<tr><td><input type="submit" value="Transfer" class="sub" name="action"></td>
<td><a href="IMPS.jsp">Clear</a></td></tr>
</table>
</form>
</table>
</body>
</html>