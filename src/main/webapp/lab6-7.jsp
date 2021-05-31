<%-- 
    Document   : lab6-7
    Created on : 28 трав. 2021 р., 13:44:53
    Author     : admin
--%>

<%@page import="knu.fit.ist.ta.lab7.Tree"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="LightCyan">
        <h2>Lab 6 (Recursion)</h2>

        <p>Random massive: <b><%= request.getAttribute("res_arr")%></b></p>
        <p> Number of elements that are less than a given number : <b><%= request.getAttribute("res_tail")%></b></p>
        
        <p>  </p>
        <p>  </p>
        <h2>Lab 7 (Binary Tree)</h2>

        <%
            List<Integer> arr = Arrays.asList(7, 14, 4, 1, 15, 6, 8, 10);
            Collections.sort(arr);
            Tree tree = new Tree(arr);
        %>
        <p>Tree Array: <b>(7, 14, 4, 1, 15, 6, 8, 10)</b> </p>
        <p> PostOder Tree: <b>(<%= tree.getPostOrder()%>)</b></p>


        <div>
            <form action="index.jsp">  
                <input type="submit" value="Home">
            </form> 
        </div>

    </body>
</html>
