<%-- 
    Document   : lab4
    Created on : 20 трав. 2021 р., 15:51:01
    Author     : admin
--%>

<%@page import="knu.fit.ist.ta.lab4.TextProcess"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="LightCyan">

        <h1><b> Lab 4 </b></h1>
        <h2> Tasks </h2>
        <p> 1.Очищення тексту.<br>
            2.Визначити загальну кількість слів у тексті.<br>
            3.Визначити кількість унікальних слів у тексті.<br>
            4.Визначити перші 8 слів, що зустрічаються найчастіше.<br>
            5.Визначити кількість слів що не містять літеру o.<br>
            6.Визначити кількість слів, що мають рівно 3 різних літер.<br>
            7.Визначити перші 3 трьохлітерні послідовності у словах тексту, що зустрічаються найчастіше.</p>

        <%TextProcess textProcess = new TextProcess("The Internet of Things essentially enables us to connect ‘things’ to the Internet"
                    + "(and to networks that use Internet technology). These things or items can exchange information between them and transmit data to "
                    + "other devices and systems. They can usually also received data. The information they share can be about objects to which they are "
                    + "attached and the environment they are in (through sensors that come in many shapes for different parameters). Smart devices and machines"
                    + " can also share information about their internal state."
                    + " So, they don’t play games or buy online but capture data, share it and, depending"
                    + " on the precise thing, can act upon data they receive. In other words: physical objects and lots of them, far more than there are people."
                    + " The physical things can dispose of embedded technologies enabling them to do all this (hence often called ‘smart’) or can be rather ‘dumb’ "
                    + "as such but get equipped/tagged to be connected. The Internet of Things is a collective term for these connected things, how they communicate"
                    + " and transmit data, the technologies enabling them to do so, and the reasons/goals why this is done."
                    + " While the Internet of Things starts with the infrastructure of connected things, both its benefits and risks are mainly related to the network"
                    + " technologies, systems, and applications built upon this underlying layer. In theory, anything can be connected to the Internet using IoT"
                    + " technologies: physical objects and living creatures, including animals and people as ‘beings’. All things or connected components of more complex"
                    + " physical objects can be uniquely identified and addressed via the Internet of Things."
                    + " Examples of things range from consumer-oriented devices such as wearables and smart home solutions (Consumer IoT) to connected equipment in the"
                    + " enterprise (Enterprise IoT) and industrial assets such as machines, robots, or even workers in smart factories and industrial facilities.");%>

        <p><b>Text:</b> <%= textProcess.GetText()%></p>
        <p><b>Clean text:</b> <%= textProcess.GetClearedText()%></p>
        <p><b>Number of words:</b> <%= textProcess.GetWordsNumber()%></p>
        <p><b>Number of unique words:</b> <%= textProcess.GetUniqueWordsNumber()%></p>
        <p><b>Most popular words (8):</b> <%= textProcess.GetFirstNMostPopularWords(8)%></p>
        <p><b>Number of words that don't contain letter (o):</b> <%= textProcess.GetNumberOfWordsThatNotContain('o')%>
        </p><b>Number of words that contain 3 different letters: </b> <%= textProcess.GetNumberOfWordsThatContainDifferentLetters(3)%></p>
        <p><b>Most popular sequences (3):</b> <%= textProcess.MostPopularSequences(3, 3)%></p>

    <div>
        <form action="index.jsp">  
            <input type="submit" value="Home">
        </form> 
    </div>

</body>
</html>
