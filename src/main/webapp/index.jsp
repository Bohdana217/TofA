<%-- 
    Document   : index
    Created on : 17 черв. 2021 р., 13:59:44
    Author     : admin
--%>

<%@page import="fit.ist.demo.Exam.Task"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TA Exam</title>
    </head>
    <body bgcolor="FloralWhite">
        
        <h1 align="center"><strong>Exam work of TA</strong></h1>
        <h3 align="center"><em>Done by Bohdana Illiuk, IR-11 </em></h3>

        <h2><ins>Завдання</ins></h2>
        <p>1)Розробити та реалізувати алгоритм для обчислення значень функції: [f(x)= 2/(6x+1)] </p>
        <p>2)Створити тести для перевірки працездатності розробленого алгоритму </p>
        <p>3)Заповнити список з 98 елементів результатами обчислення виразу для випадкових значень аргументу типу float</p>
        <p>4)Вивести отримані у пункті 3 результати через веб-інтерфейс </p>
        <p>5)Забезпечити можливість сортування та пошуку даних в  отриманому у п.3 списку (порядок сортування та об'єкт пошуку задається користувачем) </p>
        
        
        <h1 align="center"><ins>Обчислення виразу f(x)= 2/(6x+1) </ins></h1>

        <h3>Enter x</h3>
        <div>
            <form action="./task" method="post">

                <input type="text" name="x" />
                <input type="submit" value="Ok"/>               
            </form>
        </div>

        <h3>Result: <%=request.getAttribute("result")%> </h3>



        <h1 align="center"><ins>Список з 98 елементів, який заповнений результатами обчислення виразу для випадкових значень аргументу </ins></h1>



        <%! Task fr = new Task(98);%>  

        <h3><ins>Random arguments:</ins> <%= fr.GetArgs()%> </h3>
        <h3><ins>Result list of modified arguments:</ins> <%= fr.Calc()%></h3>


        <h1 align="center"><ins>Searching </ins></h1>

        <h3>Enter result of massive</h3>
       
        <div>
         <form action="./find" method="post">
                <input type="text" name="num"/>
                <input type="submit" value="Ok"/>          
        </form>
        </div>
        
          <h3>Index: <%=request.getAttribute("ind")%></h3>
        
        
        
        
        
        
        
        
        
        
        
    </body>
</html>
