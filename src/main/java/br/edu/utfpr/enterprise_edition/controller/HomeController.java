package br.edu.utfpr.enterprise_edition.controller;

import br.edu.utfpr.enterprise_edition.model.domain.User;
import br.edu.utfpr.enterprise_edition.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "HomeServlet", value = "/home")
public class HomeController extends HttpServlet {

    private String message;
    private final String VIEW = "WEB-INF/view/";
    public void init() {
        message = "Cadastro";
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        process(request, response);
        response.setContentType("text/html");
        request.getRequestDispatcher(VIEW + "home.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        User userLoginRegister = (User) request.getAttribute("user");
        UserService userService = new UserService();
        User userBanco = userService.getById(userLoginRegister.getId());
//        session.getAttribute("usuarioLogado");
        if (userBanco.getSenha().equals(userLoginRegister.getSenha())) {
            session.setAttribute("usuarioLogado", userBanco);
//            response.setContentType("text/html");
            response.sendRedirect("home");
//            request.getRequestDispatcher(VIEW + "home.jsp").forward(request, response);
        } else {
            response.setContentType("text/html");
            request.getRequestDispatcher(VIEW + "index.jsp").forward(request, response);
        }
    }



}
