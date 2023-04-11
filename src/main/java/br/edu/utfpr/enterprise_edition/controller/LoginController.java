package br.edu.utfpr.enterprise_edition.controller;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "loginServlet", value = "/login")
public class LoginController extends HttpServlet {
    private String message;
//    private final String VIEW = "../webapp/WEB-INF/view/";
    private final String VIEW = "WEB-INF/view/";

    public void init() {
        message = "Login";
        System.out.println("salveeeeeeeeeee");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        request.setAttribute("message", message);
        request.getRequestDispatcher(VIEW + "login.jsp").forward(request, response);
    }

//    public void destroy() {
//    }
}
