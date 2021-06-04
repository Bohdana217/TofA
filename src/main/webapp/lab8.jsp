<%-- 
    Document   : lab8
    Created on : 4 черв. 2021 р., 07:12:03
    Author     : admin
--%>

<%@page import="java.util.Arrays"%>
<%@page import="knu.fit.ist.ta.lab8.Task"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="LightCyan">
        <h1 align="center">Lab 8 (Results)</h1>

        <%! int[] arr = {4, 8, 52, 26, 3, 18}; %>
        <%! Task alg = new Task();%>
        <%int number = (int) request.getAttribute("labor8");%>


        <h2>Array: <%=Arrays.toString(arr)%></h2>



        <%
            long startTime = System.nanoTime();
            int i = alg.linearSearch(arr, number);
            long endTime = System.nanoTime();
            long SearchDuration = (endTime - startTime);
        %>

        <h2><ins>Linear search</ins></h2>
        <h3>Іndex: <%=i%> </h3>
        <h3>Execution time: <%=SearchDuration%> ms </h3>
        <h3>Algorithm complexity: O(N) </h3>

        <%
            startTime = System.nanoTime();
            i = alg.binarySearch(arr, number);
            endTime = System.nanoTime();
            SearchDuration = (endTime - startTime);
        %>

        <h2><ins>Binary search</ins></h2>
        <h3>Іndex:</b> <%=i%> </h3>
        <h3>Execution time: <%=SearchDuration%> ms</h3>
        <h3>Algorithm complexity: O(log (N))</h3>


    <%
        startTime = System.nanoTime();
        i = alg.jumpSearch(arr, number);
        endTime = System.nanoTime();
        SearchDuration = (endTime - startTime);
    %>

    <h2><ins>Jump search</ins></h2>
    <h3>Іndex: <%=i%></h3>
    <h3>Execution time: <%=SearchDuration%> ms</h3>
    <h3>Algorithm complexity: O(sqrt (N))</h3>



    <div>
        <form action="lab8form.jsp">  
            <input type="submit" value="New number">
        </form> 
    </div>

    <div>
        <form action="index.jsp">  
            <input type="submit" value="Home">
        </form> 
    </div>

</body>
</html>
