package br.edu.utfpr.enterprise_edition.controller;

import br.edu.utfpr.enterprise_edition.model.domain.User;
import br.edu.utfpr.enterprise_edition.service.UserService;

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

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String email = req.getParameter("emailRepresentante");
        String senha = req.getParameter("senha");
        UserService userService = new UserService();
        String senhaEncript = userService.encriptPassword(senha);
        User userLogin = userService.getByProperty("email", email);

        User userBanco = userService.getById(userLogin.getId());

        if (userBanco.getSenha().equals(userLogin.getSenha())) {
            session.setAttribute("usuarioLogado", userBanco);
//            response.setContentType("text/html");
            resp.sendRedirect("home");
//            request.getRequestDispatcher(VIEW + "home.jsp").forward(request, response);
        } else {
            resp.setContentType("text/html");
            req.getRequestDispatcher(VIEW + "login.jsp").forward(req, resp);
        }

    }

    //    public void destroy() {
//    }
}
