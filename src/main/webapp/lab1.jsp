<%-- 
    Document   : lab 1
    Created on : Apr 22, 2021, 7:19:44 PM
    Author     : admin
--%>

<%@page import="knu.fit.ist.ta.MyFirstJavaClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>This my lab1</h1>
        
        <%! MyFirstJavaClass mFJC = new MyFirstJavaClass(5);%>
        
        <%
           int x= mFJC.getMyInt();
           x+=3;
           x%=3;
           
        %>
            
        <p>8mod3 = <%=x%></p>
        
        <a href="index.jsp">Home</a>
        
    </body>
</html>
