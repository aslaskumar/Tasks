

package com.calci;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Authentication implements Filter {
    private static final Logger logger = LoggerFactory.getLogger(Login.class);


    public void init(FilterConfig arg0) throws ServletException {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        logger.info("welcome to loggers");
        PrintWriter out = resp.getWriter();
        String user = req.getParameter("username");
        String password = req.getParameter("password");
        if (password.equals("admin")) {
            logger.info("password correct");
            chain.doFilter(req, resp);
            logger.info("authentication done");
        } else {
            logger.info("incorrect credentials");
            out.print("incorrect username or password");
        }

    }

    public void destroy() {
    }
}
