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
        out.println("</head>");
        out.println("<body>");

        out.println("<center>");
        out.println("<h1>My Portfolio</h1>");
        out.println("<hr>");

        out.println("<img src='photo.jpg' width='150' height='150'><br><br>");

        out.println("<h2>Personal Details</h2>");
        out.println("<p><b>Name:</b> Subham Pradhan</p>");
        out.println("<p><b>Course:</b> B.Tech CSE</p>");
        out.println("<p><b>Email:</b> subham@gmail.com</p>");

        out.println("<h2>Skills</h2>");
        out.println("<table border='1'>");
        out.println("<tr>");
        out.println("<th>Skill</th>");
        out.println("<th>Level</th>");
        out.println("</tr>");

        out.println("<tr><td>Java</td><td>Intermediate</td></tr>");
        out.println("<tr><td>C</td><td>Intermediate</td></tr>");
        out.println("<tr><td>Python</td><td>Beginner</td></tr>");
        out.println("<tr><td>Servlet</td><td>Intermediate</td></tr>");
        out.println("<tr><td>HTML & CSS</td><td>Intermediate</td></tr>");
        out.println("<tr><td>DBMS</td><td>Intermediate</td></tr>");
        out.println("</table><br>");

        out.println("<h2>Projects</h2>");
        out.println("<table border='1'>");
        out.println("<tr>");
        out.println("<th>Project Name</th>");
        out.println("<th>Description</th>");
        out.println("</tr>");

        out.println("<tr><td>CureCart</td><td>Online Pharmacy System</td></tr>");
        out.println("<tr><td>Smart Quiz Portal</td><td>Web-based Quiz using Servlet</td></tr>");
        out.println("</table><br>");

        out.println("<h2>Career Objective</h2>");
        out.println("<p>To become a skilled software developer and contribute to innovative projects.</p>");

        out.println("</center>");
        out.println("</body>");
        out.println("</html>");
    }
}