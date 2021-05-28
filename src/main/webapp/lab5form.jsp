<%-- 
    Document   : lab5form
    Created on : 27 трав. 2021 р., 17:53:38
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

        <%!Text text = new Text();%>
        
        
        <div>

            <h2>Text</h2>

            <form action="./lab5" method="post">

                <%=text.cleanText(text.text)%>

                <h2>The number of words - <%=text.sizeOfList(text.cleanText(text.text))%></h2>



                <h2>Enter the search word</h2>

                <input type="text" name="word" placeholder="Enter the word"/>
                

                <h3>If you want to look for a word in a certain part of the text, enter the start index,
                    the finish index, or the start and the finish indices (Not necessarily)</h3>

                <input type="text" name="start" placeholder="Enter the start index"/>

                <input type="text" name="finish" placeholder="Enter the finish index"/>


                <h1>"Sort objects"</h1>

                <h2>Enter the number of objects</h2>

                <input type="text" name="num" placeholder="Enter the number of objects"/>

                <input type="submit" value="Ok"/>
            </form>

        </div>

    </body>
</html>
