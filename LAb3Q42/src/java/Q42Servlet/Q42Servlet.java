package Q42Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/Q42Servlet") // maps this servlet to /Q42Servlet
public class Q42Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Servlet Demo</title></head><body>");

        // Display the message 10 times
        for (int i = 1; i <= 10; i++) {
            out.println(i + ". Java is one of the powerful programming languages!<br>");
        }

        // Display current date and time
        Date currentDate = new Date();
        out.println("<br><b>Current Date and Time:</b> " + currentDate + "<br>");

        // Display your Name, Roll No, Section
        out.println("<b>Name:</b> Jeeswan<br>");
        out.println("<b>Roll No:</b> 12345<br>");
        out.println("<b>Section:</b> A<br>");

        out.println("</body></html>");
    }
}
