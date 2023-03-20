package com.wavemaker.servlet;

import com.wavemaker.daoImpl.UserDaoImpl;
import com.wavemaker.model.User;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Objects;

public class LoginFilter implements Filter {
    private UserDaoImpl userDaoImpl = new UserDaoImpl();

    @Override
    public void init(FilterConfig filterConfig) {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = userDaoImpl.validateUser(username);
        System.out.println(user);

        if (Objects.equals(user.getUserPassword(), password)) {
            response.getWriter().write("Login Success");
            // Authentication successful, continue with the request
            HttpSession session = request.getSession(true);
            session.setAttribute("Session for login", username);
            //filterChain.doFilter(request, response);
        } else {
            // Authentication failed, redirect to login page
            response.getWriter().write("Login Failed");
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
