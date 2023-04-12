package br.edu.utfpr.enterprise_edition.controller;

import br.edu.utfpr.enterprise_edition.model.domain.Company;
import br.edu.utfpr.enterprise_edition.model.domain.User;
import br.edu.utfpr.enterprise_edition.service.CompanyService;
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
        HttpSession session = request.getSession(false);
        User user = (User) session.getAttribute("usuarioLogado");
        CompanyService companyService = new CompanyService();
//        Company company = companyService.findAll();

        if (session.getAttribute("usuarioLogado") == null) {
            response.setContentType("text/html");
            request.getRequestDispatcher(VIEW + "login.jsp").forward(request, response);
        } else {
            response.setContentType("text/html");
            request.getRequestDispatcher(VIEW + "home.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    }



}
