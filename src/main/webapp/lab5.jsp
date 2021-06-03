<%-- 
    Document   : lab5
    Created on : 31 трав. 2021 р., 23:01:06
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
        <h1 align="center"><strong> Lab 5 </strong></h1>



            <h2 align="center">Search word <ins><big><%=request.getParameter("word")%></big></ins></h2>
            <h2 align="center"><em><%=request.getAttribute("searchWord")%></em></h2>

            <h2 align="center">Unsorterd list of objects</h2>
            <p><%=request.getAttribute("list")%></p>


            <h2 align="center">Sorted fields <b>(Strings)</b> </h2>
            <p><%=request.getAttribute("sortStr")%></p>


            <h2 align="center">Sorted fields <b>(Short)</b></h2>
            <p><%=request.getAttribute("sortShr")%></p>


            <h2 align="center">Sorterd list of objects</h2>
            <p><%=request.getAttribute("sortedList")%></p>

                         


        <div>

            <form action="lab5form.jsp">
                <input type="submit" value="New values">
            </form>

        </div>


        <div>
            <form action="index.jsp">
                <input type="submit" value="Home">
            </form>

        </div>






    </body>
</html>
