/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit.ist.demo.Exam;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
@WebServlet(name = "ListServlet", urlPatterns = {"/task"})
public class ListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String x = request.getParameter("x");
        float param = Float.parseFloat(x);
        float res = Calculation.Calc(param);
        request.setAttribute("result", res);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    
}
