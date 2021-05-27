<%-- 
    Document   : lab5
    Created on : 24 трав. 2021 р., 13:34:18
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="LightCyan">

        <h1>Lab 5</h1>

        <h2>Search the word</h2>

        <h3>The search word</h3>


        <h3><%=request.getAttribute("searchWord")%></h3>


        <h2>Sort the list of objects</h2>

        <h3>Unsorted list of objects</h3>


        <h3><%=request.getAttribute("list")%></h3>


        <h3>The sorted String fields</h3>


        <h3><%=request.getAttribute("sortStr")%></h3>


        <h3>The sorted Short fields</h3>


        <h3><%=request.getAttribute("sortShr")%></h3>


        <h3>The sorted list of objects</h3>


        <h3><%=request.getAttribute("sortedList")%></h3>

        <div>

            <form action="lab5form.jsp">

                <input type="submit" value="New values">

            </form>

        </div>

        <form action="index.jsp">

            <input type="submit" value="Home">

        </form>

    </div>


</body>
</html>
