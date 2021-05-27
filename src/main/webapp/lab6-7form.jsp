<%-- 
    Document   : lab6-7form
    Created on : 27 трав. 2021 р., 20:11:12
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center><b>Laboratory work 6 - 7</b></h1>

            <h2>Підрахувати кількість елементів масиву менших заданого числа</h2>
            <h3> Введіть X і кількість елементів масиву </h3>

            <div>
            <form action= "./lab6-7" method="post">

            <input type="text" name="x" placeholder="X">
            <input type="text" name="n" placeholder="Enter size">
            <input type="submit" value="Submit">
            </form>


            </div>


            </body>
            </html>
