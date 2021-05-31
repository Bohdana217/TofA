<%-- 
    Document   : lab6-7form
    Created on : 28 трав. 2021 р., 13:45:11
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

        <h1 align="center"><b>Lab 6 - 7</b></h1>

        <h3><b>1)Підрахувати кількість елементів масиву менших заданого числа (x)</b></h3>
        <h3><b>2)Створити симетричне бінарне дерево пошуку з елементів:{7, 14, 4, 1, 15, 6, 8, 10}.
        Вивести на екран початкове дерево та результати виконання операцій над ним</b></h3>
        <p></p>
        <p align="center"><ins><b>Enter (x) and number of elements (size)</ins></b></p>

        <div align="center">
            <form action="./lab6-7" method="post">
                <input type="text" name="x" placeholder="x">
                <input type="text" name="n" placeholder="size">
                <input type="submit" value="Enter!">
            </form>
        </div>




    </body>
</html>
