<%-- 
    Document   : lab2
    Created on : Apr 22, 2021, 10:27:52 PM
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
        
        <h1>Обчислення виразу d/(ax2+bx+c)</h1>
        
        <p>Result: <%=request.getAttribute("result")%></p>
        
        <div>
            <form action="lab2form.jsp">  
                <input type="submit" value="New x">
            </form> 
        </div>

        <div>
            <form action="index.jsp">  
                <input type="submit" value="Home">
            </form> 
        </div>

    </body>
</html>
