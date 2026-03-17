package com.demo.bean;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TableServlet extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

int num = Integer.parseInt(request.getParameter("num"));

TableBean bean = new TableBean();
bean.setNumber(num);

request.setAttribute("bean", bean);

RequestDispatcher rd = request.getRequestDispatcher("/result.jsp");
rd.forward(request, response);

}

}