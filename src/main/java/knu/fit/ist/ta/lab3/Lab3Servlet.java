/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author admin
 */
@WebServlet(name = "Lab3Servlet", urlPatterns = {"/lab3"})
public class Lab3Servlet extends HttpServlet {

    @Autowired
    Lab3View lab3view;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        Lab3View lab3view = new Lab3View();
        

        String res = lab3view.showInitialArray(request.getParameter("length"));

        request.setAttribute("res", res);

        String output = lab3view.showResult();

        request.setAttribute("output", output);

        request.getRequestDispatcher("lab3.jsp").forward(request, response);

    }
     @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}