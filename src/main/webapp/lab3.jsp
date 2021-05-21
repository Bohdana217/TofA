<%-- 
    Document   : lab3
    Created on : Apr 30, 2021, 9:20:55 AM
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
        <h1> Lab 3 (Task 11)</h1> 
        
        <h2>Заповнити масив різних k натуральних чисел більших 10. Визначити масив чисел, елементи якого утворюються сумою квадратів цифр елементів вихідного масиву.</h2>
       

        <p><b>Масив: <%=request.getAttribute("res")%></b></p>        
        <p><b>Новий масив: <%=request.getAttribute("output")%></b></p>
        

        
        <div>
            <form action="lab3form.jsp">  
                <input type="submit" value="New array">
            </form> 
        </div>

        <div>
            <form action="index.jsp">  
                <input type="submit" value="Home">
            </form> 
        </div>
        
    </body>
</html>
