package br.edu.utfpr.enterprise_edition.controller;

import br.edu.utfpr.enterprise_edition.model.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "logoutServlet", value = "/logout")
public class LogoutController extends HttpServlet {

    private final String VIEW = "WEB-INF/view/";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (session.getAttribute("usuarioLogado") != null) {
            session.invalidate();
            resp.sendRedirect("login");
        }
    }

}
