/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab7;

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
@WebServlet(name = "Lab67Servlet", urlPatterns = {"/lab6-7"})
public class Lab67Servlet extends HttpServlet {

   
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    Integer x = Integer.parseInt(request.getParameter("x"));
        Integer n = Integer.parseInt(request.getParameter("n"));

        Recursion recur = new Recursion(n);
        int resTail = recur.lessThanXTail(x);
        int resLessX = recur.lessThanX(x);
        int iterLess = recur.iterativeLessThanX(x);
        String arr = recur.getArrayString();

        request.setAttribute("res_tail", resTail);
        request.setAttribute("res_recursion", resLessX);
        request.setAttribute("res_iter", iterLess );
        request.setAttribute("res_arr", arr);

        request.getRequestDispatcher("lab6-7.jsp").forward(request, response);
    }

}
