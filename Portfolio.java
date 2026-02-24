import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Portfolio extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>My Portfolio</title>");
        out.println("<style>");
        out.println("body{font-family:Arial; background-color:#f4f4f4;}");
        out.println(".container{width:70%; margin:auto; background:white; padding:20px;}");
        out.println("h1{color:darkblue;}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h1>My Portfolio</h1>");
        out.println("<hr>");
        out.println("<h2>Personal Details</h2>");
        out.println("<p><b>Name:</b> Subham Pradhan</p>");
        out.println("<p><b>Course:</b> B.Tech CSE</p>");
        out.println("<p><b>Email:</b> subham@gmail.com</p>");
        out.println("<h2>Skills</h2>");
        out.println("<ul>");
        out.println("<li>Java,C,PYTHON</li>");
        out.println("<li>Servlet</li>");
        out.println("<li>HTML, CSS</li>");
        out.println("<li>DBMS</li>");
        out.println("</ul>");
        out.println("<h2>Projects</h2>");
        out.println("<ul>");
        out.println("<li>CureCart - Online Pharmacy System</li>");
        out.println("<li>smart quizz portal</li>");
        out.println("</ul>");
        out.println("<h2>Career Objective</h2>");
        out.println("<p>To become a skilled software developer and contribute to innovative projects.</p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}