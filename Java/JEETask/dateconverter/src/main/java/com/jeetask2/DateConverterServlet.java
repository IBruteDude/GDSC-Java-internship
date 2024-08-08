package com.jeetask2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

import java.time.LocalDate;
import java.time.Period;

public class DateConverterServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");
        try {
            PrintWriter out = response.getWriter();
            String birthDate = request.getParameter("birth-date");
            String currentDate = request.getParameter("current-date");
            int days;

            if (birthDate.isEmpty() || currentDate.isEmpty()) {
                days = 0;
            } else {
                LocalDate startDate = LocalDate.parse(birthDate);
                LocalDate endDate = LocalDate.parse(currentDate);

                days = Period.between(startDate, endDate).getDays();
            }

            out.println("<html>");
            out.println("   <head><title>Your Age</title></head>");
            out.println("   <body style='font-size: x-large;'>");
            out.println("       <b>Age:</b> <br />");
            out.println("       " + days + " days <br />");
            out.println("       or " + (days * 24) + " hours <br />");
            out.println("       or " + (days * 24 * 60) + " minutes <br />");
            out.println("       or " + (days * 24 * 60 * 60) + " seconds <br />");
            out.println("   </body>");
            out.println("</html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
