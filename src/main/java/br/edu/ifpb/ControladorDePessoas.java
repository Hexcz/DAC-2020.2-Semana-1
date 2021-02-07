package br.edu.ifpb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ControladorDePessoa", urlPatterns = {"/controladorDePessoa"})
public class ControladorDePessoas extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("nome");
        Pessoa pessoa = new Pessoa(nome);

        pessoa.alterarNome();

        encaminharResposta(request, response, pessoa);
    }

    private void encaminharResposta(HttpServletRequest request, HttpServletResponse response, Pessoa pessoa) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorDePessoas</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Nome: " + pessoa.getNome() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
