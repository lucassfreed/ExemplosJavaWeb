package br.com.entra21java.dao;

import br.com.entra21java.bean.AlimentoBean;
import br.com.entra21java.database.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AlimentoDAO {
    
    public List<AlimentoBean> obterTodos() {
        List<AlimentoBean> alimentos = new ArrayList<>();
        String sql = "SELECT * FROM alimentos";
        try {
            Statement st = Conexao.obterConexao().createStatement();
            st.execute(sql);
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                AlimentoBean alimento = new AlimentoBean();
                alimento.setId(rs.getInt("id"));
                alimento.setNome(rs.getString("nome"));
                alimento.setPreco(rs.getDouble("preco"));
                alimento.setQuantidade(rs.getByte("quantidade"));
                alimentos.add(alimento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        
        return alimentos;
    }
    
}
