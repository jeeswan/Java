package Lab3_4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wildflower
 */
import java.io.*;
import java.util.Date;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Q42Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body style='font-family: Arial, sans-serif;'>");

        // Print statement 10 times
        for (int i = 1; i <= 10; i++) {
            out.println(i + ". Java is one of the powerful programming languages!<br>");
        }

        // Current date and time
        out.println("<br><b>Current Date & Time: </b>" + new Date() + "<br><br>");

        // Your details
        out.println("<b>Name:</b> Jeeswan<br>");
        out.println("<b>Roll No:</b> 78<br>");
        out.println("<b>Section:</b> BCA 8th Sem<br>");

        out.println("</body></html>");
    }
}