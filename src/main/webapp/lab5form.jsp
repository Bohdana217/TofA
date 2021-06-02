<%-- 
    Document   : lab5form
    Created on : 31 трав. 2021 р., 23:01:18
    Author     : admin
--%>

<%@page import="knu.fit.ist.ta.lab4.Text"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="LightCyan">
        <h1 align="center">Lab 5</h1>

        <%!Text text = new Text();%>

        <div>

            <form action="./lab5" method="post">

                <h2>Clean text</h2>
                <%=text.cleanText(text.text)%>

                <h3>Number of words: - <%=text.sizeOfList(text.cleanText(text.text))%></h3>

                <h2>Enter search word</h2>

                <input type="text" name="word" placeholder="Enter the word"/>
                
                 <h3>Якщо ви хочете знайти слово в певній частині тексту, введіть початковий індекс,
                        індекс фінішу або індекси старту та фінішу</h3>
                
                        <input type="text" name="start" placeholder="Enter the start index"/>
                
                        <input type="text" name="finish" placeholder="Enter the finish index"/>

                        
                <h2 align="center">Sorting</h2>

                <h2>Enter number of objects</h2>

                <input type="text" name="num" placeholder="Enter the number of objects"/>

                <h2></h2>

                <input type="submit" value="Ok"/>
            </form>



        </div>


    </body>
</html>
