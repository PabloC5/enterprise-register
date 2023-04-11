package br.edu.utfpr.enterprise_edition.controller;

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
        String emailRepesentante = request.getParameter("emailRepresentante");
        String cnpj = request.getParameter("cnpj");
        String nomeEmpresa = request.getParameter("nomeEmpresa");
        String senha = request.getParameter("senha");

        request.setAttribute("message", message);

    }
}
