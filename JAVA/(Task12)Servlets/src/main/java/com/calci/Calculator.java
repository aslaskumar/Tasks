
package com.calci;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet {
    public Calculator() {
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("okay byeeee......");
        PrintWriter pw = resp.getWriter();
        pw.print("hello ");
        int a = Integer.parseInt(req.getParameter("value1"));
        int b = Integer.parseInt(req.getParameter("value2"));
        String s = req.getParameter("operation");
        if (s.equals("add")) {
            pw.print(a + b);
        } else if (s.equals("sub")) {
            pw.print(a - b);
        } else if (s.equals("mul")) {
            pw.print(a * b);
        } else if (s.equals("div")) {
            pw.print(a / b);
        }

    }
}
