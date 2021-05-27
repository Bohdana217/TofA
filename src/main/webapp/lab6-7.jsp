<%-- 
    Document   : lab6-7
    Created on : 27 трав. 2021 р., 20:10:57
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
    <body>
        <h1 align="center><b>Lab 6 (Recursion)</b></h1>

            <p>Random massive:  <%= request.getAttribute("res_arr")%></p>
            <p>Number of elements that are less than a given number : <%= request.getAttribute("res_tail")%></p>
            <p>Recursion: <%= request.getAttribute("res_recursion")%></p>
            <p>Iteration: <%= request.getAttribute("res_iter")%></p>


            <h1 align="center><b>Lab 7 (Tree)</b></h1>

        <%
            List<Integer> arr = Arrays.asList(7, 14, 4, 1, 15, 6, 8, 10);
            Collections.sort(arr);
            Tree tree = new Tree(arr);
        %>

        <p><b> Tree Array: (7, 14, 4, 1, 15, 6, 8, 10)</b> </p>

        <p> Recursion Tree:-- <%= tree.getPostOrder()%></p>
        <p> Iterative Tree:-- <%= tree.getPostOrderIterative()%></p>

        
        <div>
        <form action="index.jsp">  
            <input type="submit" value="Home">
        </form> 
    </div>

    </body>
</html>
