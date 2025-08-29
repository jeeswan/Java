/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServletDemo;

/**
 *
 * @author wildflower
 */
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.*;


public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        Cookie cookie = new Cookie("username", "");
        cookie.setMaxAge(0); // delete cookie
        response.addCookie(cookie);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<p>You have been logged out.</p>");
        request.getRequestDispatcher("LogoutCookies.html").include(request, response);
    }
}