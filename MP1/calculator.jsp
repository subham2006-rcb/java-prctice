<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Simple JSP Calculator</title>
</head>
<body>
    <h2>Calculator using JSP</h2>
    <form method="post">
        Enter First Number: <input type="text" name="num1" /><br/><br/>
        Enter Second Number: <input type="text" name="num2" /><br/><br/>
        
        Select Operation:
        <select name="operation">
            <option value="add">Addition (+)</option>
            <option value="sub">Subtraction (-)</option>
            <option value="mul">Multiplication (*)</option>
            <option value="div">Division (/)</option>
        </select><br/><br/>
        
        <input type="submit" value="Calculate" />
    </form>

    <%
        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");
        String op = request.getParameter("operation");

        if(n1 != null && n2 != null && op != null) {
            try {
                double num1 = Double.parseDouble(n1);
                double num2 = Double.parseDouble(n2);
                double result = 0;

                switch(op) {
                    case "add": result = num1 + num2; break;
                    case "sub": result = num1 - num2; break;
                    case "mul": result = num1 * num2; break;
                    case "div": 
                        if(num2 != 0) {
                            result = num1 / num2; 
                        } else {
                            out.println("<p style='color:red;'>Error: Division by zero!</p>");
                        }
                        break;
                }
                out.println("<h3>Result: " + result + "</h3>");
            } catch(NumberFormatException e) {
                out.println("<p style='color:red;'>Please enter valid numbers!</p>");
            }
        }
    %>
</body>
</html>