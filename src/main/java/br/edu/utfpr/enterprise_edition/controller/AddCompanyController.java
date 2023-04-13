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

@WebServlet(name = "addCompanyServlet", value = "/addCompany")
public class AddCompanyController extends HttpServlet {

    private final String VIEW = "WEB-INF/view/";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        req.getRequestDispatcher(VIEW + "addCompany.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String cnpj = request.getParameter("cnpj");
        String nomeEmpresa = request.getParameter("nomeEmpresa");
        UserService userService = new UserService();
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("usuarioLogado");

        Company company = new Company(nomeEmpresa, cnpj, user);

        CompanyService companyService = new CompanyService();
        companyService.save(company);
//        response.sendRedirect("home");
//        request.getRequestDispatcher("home").forward(request, response);
        response.sendRedirect("home");
    }
}
