package br.com.entra21java.web.alimentos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/alimentos/cadastro")
public class AlimentoCadastro extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Alimentos - Cadastro</title>");
        out.println("<link rel='stylesheet' type='text/css' href='/WebExemplo02/bootstrap/css/bootstrap.css'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container-fluid'>");
        out.println("<form action='/WebExemplo02/alimentos/store' method='post'>");
        out.println("<div class='form-group'>");
        out.println("<label for='campo-nome'>Nome: <span class='text-danger' font-weight-bold>*</span></label>");
        out.println("<input type='text' class='form-control' id='campo-nome' name='nome' required='required'>");
        out.println("</div>");
        out.println("<div class='form-group'>");
        out.println("<label for='campo-quantidade'>Quantidade: <span class='text-danger' font-weight-bold>*</span></label>");
        out.println("<input class='form-control' type='text' id='campo-quantidade' name='quantidade' required='required'>");
        out.println("</div>");
        out.println("<div class='form-group'>");
        out.println("<label for='campo-preco'>Preço: <span class='text-danger' font-weight-bold>*</span></label>");
        out.println("<input class='form-control' type='text' id='campo-preco' name='preco' required='required'>");
        out.println("</div>");
        out.println("<div class='form-group'>");
        out.println("<label for='campo-descricao'>Descrição: <span class='text-danger' font-weight-bold>*</span>"
                + "</label>");
        out.println("<textarea class='form-control' name='' id='campo-descricao' name='descricao'></textarea>");
        out.println("</div>");
        out.println("<input class='btn btn-success' type='submit' value='Cadastrar' required='required'>");
        out.println("</form>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");

    }

}
