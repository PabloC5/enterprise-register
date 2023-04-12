package br.edu.utfpr.enterprise_edition.controller;

import br.edu.utfpr.enterprise_edition.model.domain.Company;
import br.edu.utfpr.enterprise_edition.model.domain.User;
import br.edu.utfpr.enterprise_edition.service.CompanyService;
import br.edu.utfpr.enterprise_edition.service.UserService;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "CadastroServlet", value = "/cadastro")
public class CadastroController extends HttpServlet {
    private String message;
    private final String VIEW = "WEB-INF/view/";
    public void init() {
        message = "Cadastro";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        request.setAttribute("message", message);
        request.getRequestDispatcher(VIEW + "cadastro.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String emailRepesentante = request.getParameter("emailRepresentante");
        String cnpj = request.getParameter("cnpj");
        String nomeEmpresa = request.getParameter("nomeEmpresa");
        String senha = request.getParameter("senha");
        UserService userService = new UserService();
        HttpSession session = request.getSession();

        String senhaEncript =  userService.encriptPassword(senha);

        User user = new User(emailRepesentante, senhaEncript);

        userService.save(user);
        Company company = new Company(nomeEmpresa, cnpj, user);

        CompanyService companyService = new CompanyService();
        companyService.save(company);

        session.setAttribute("usuarioLogado", user);
//        response.sendRedirect("home");
//        request.getRequestDispatcher("home").forward(request, response);
        response.sendRedirect("home");
    }
}
