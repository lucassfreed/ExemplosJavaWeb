package br.com.entra21java.web.alimentos;

import br.com.entra21java.bean.AlimentoBean;
import br.com.entra21java.dao.AlimentoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/alimentos/store")
public class AlimentoStore extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        String nome = req.getParameter("nome");
        byte quantidade = Byte.parseByte(req.getParameter("quantidade"));
        double preco = Double.parseDouble(req.getParameter("preco"));
        String descricao = req.getParameter("descrição");
        
        AlimentoBean alimento = new AlimentoBean();
        alimento.setNome(nome);
        alimento.setQuantidade(quantidade);
        alimento.setPreco(preco);
        alimento.setDescricao(descricao);
        int codigo = new AlimentoDAO().adicionar(alimento);
        
        PrintWriter out = resp.getWriter();
        out.println("Cadastrado com sucesso!");
    }
    
    

}
