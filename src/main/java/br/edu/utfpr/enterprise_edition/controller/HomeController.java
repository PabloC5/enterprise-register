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
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "HomeServlet", value = "/home")
public class HomeController extends HttpServlet {

    private String message;
    private final String VIEW = "WEB-INF/view/";
    public void init() {
        message = "Cadastro";
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        User user = (User) session.getAttribute("usuarioLogado");
        CompanyService companyService = new CompanyService();
        List<Company> companyListAll = companyService.findAll();
        List<Company> companyList = new ArrayList<>();

        if (session.getAttribute("usuarioLogado") == null) {
            response.setContentType("text/html");
            request.getRequestDispatcher(VIEW + "login.jsp").forward(request, response);
        } else {
            for (Company item: companyListAll) {
                if (item.getUser().getEmail().equals(user.getEmail())) {
                    companyList.add(item);
                }
            }

            getServletContext().setAttribute("companys", companyList);
            response.setContentType("text/html");
            request.getRequestDispatcher(VIEW + "home.jsp").forward(request, response);
        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    }

    @Override
    public void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("testandooooooo");
        Long id = Long.valueOf(req.getParameter("id"));
        CompanyService companyService = new CompanyService();
        companyService.deleteById(id);
//        resp.sendRedirect("/home");
//        resp.setContentType("text/html");
//        resp.getRequestDispatcher(VIEW + "home.jsp").forward(resp, resp);
//        resp.setContentType("text/html");
//        req.getRequestDispatcher(VIEW + "home.jsp").forward(req, resp);
    }
}
