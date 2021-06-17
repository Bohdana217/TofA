/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit.ist.demo.Exam;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
@WebServlet(name = "FindServlet", urlPatterns = {"/find"})
public class FindServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String x = request.getParameter("num");      // получили
        float param = Float.parseFloat(x);           //переконвертували
        int ind = Task.Search(param);              //обробили
        request.setAttribute("ind", ind);          //відправили
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

   

}
