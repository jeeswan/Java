<%@ page import="java.util.Date" %>
<%
    // a) Retrieve form values using request object
    String name = request.getParameter("name");
    String age = request.getParameter("age");
    String email = request.getParameter("email");

    // b) Demonstrating implicit object scopes

    // Page scope
    pageContext.setAttribute("pageName", name);

    // Request scope
    request.setAttribute("requestAge", age);

    // Session scope
    session.setAttribute("sessionEmail", email);

    // Application scope
    application.setAttribute("appDate", new Date());
%>

<!DOCTYPE html>
<html>
<head>
    <title>Display Details</title>
</head>
<body>
    <h2>Details Entered:</h2>
    Name: <%= name %> <br>
    Age: <%= age %> <br>
    Email: <%= email %> <br><br>

    <h2>Demonstrating Implicit Objects Scope:</h2>
    Page Scope (pageName): <%= pageContext.getAttribute("pageName") %> <br>
    Request Scope (requestAge): <%= request.getAttribute("requestAge") %> <br>
    Session Scope (sessionEmail): <%= session.getAttribute("sessionEmail") %> <br>
    Application Scope (appDate): <%= application.getAttribute("appDate") %> <br>
</body>
</html>
