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

        <h1 align="center"><b> Lab 4 </b></h1>
        <h2> Tasks </h2>
        <p> 1.Очищення тексту.<br>
            2.Визначити загальну кількість слів у тексті.<br>
            3.Визначити кількість унікальних слів у тексті.<br>
            4.Визначити перші 8 слів, що зустрічаються найчастіше.<br>
            5.Визначити кількість слів що не містять літеру o.<br>
            6.Визначити кількість слів, що мають рівно 3 різних літер.<br>
            7.Визначити перші 3 трьохлітерні послідовності у словах тексту, що зустрічаються найчастіше.</p>

        
        <%
            TextProcess textProcess = new TextProcess("The Internet of Things, or IoT, refers to the billions of physical devices around the world that are now connected to the internet, all collecting and sharing data. Thanks to the arrival of super-cheap computer chips and the ubiquity of wireless networks, it's possible to turn anything, from something as small as a pill to something as big as an aeroplane, into a part of the IoT. Connecting up all these different objects and adding sensors to them adds a level of digital intelligence to devices that would be otherwise dumb, enabling them to communicate real-time data without involving a human being. The Internet of Things is making the fabric of the world around us more smarter and more responsive, merging the digital and physical universes. How big is the Internet of Things? Big and getting bigger -- there are already more connected things than people in the world.\n"
                    + "Tech analyst company IDC predicts that in total there will be 41.6 billion connected IoT devices by 2025, or \"things.\" It also suggests industrial and automotive equipment represent the largest opportunity of connected \"things,\", but it also sees strong adoption of smart home and wearable devices in the near term.  \n"
                    + "Another tech analyst, Gartner, predicts that the enterprise and automotive sectors will account for 5.8 billion devices this year, up almost a quarter on 2019. Utilities will be the highest user of IoT, thanks to the continuing rollout of smart meters. Security devices, in the form of intruder detection and web cameras will be the second biggest use of IoT devices. Building automation – like connected lighting – will be the fastest growing sector, followed by automotive (connected cars) and healthcare (monitoring of chronic conditions). The benefits of the IoT for business depend on the particular implementation; agility and efficiency are usually top considerations.");

        %>

        <h2 align="center"><b>Text:</b></h2>
        <p><%= textProcess.GetText()%></p>
        <h2 align="center"><b>Clean text:</b></h2>
        <p> <%= textProcess.GetClearedText()%></p>
        <h2 align="center"> Tasks </h2>
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
