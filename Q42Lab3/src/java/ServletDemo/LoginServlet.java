package ServletDemo;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Check credentials
        if ("admin".equals(username) && "1234".equals(password)) {
            // Successful login: create session
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            // Redirect to WelcomeServlet
            response.sendRedirect("WelcomeServlet");
        } else {
            // Failed login: show error message with link to login page
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h2>Login Failed. Invalid username or password.</h2>");
            out.println("<a href='Login.html'>Try Again</a>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Redirect GET requests to login page to prevent 405 error
        response.sendRedirect("Login.html");
    }
}   