package br.com.padua.conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.padua.modelo.Produto;

public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.recuperarConexao();

        Statement stm = con.createStatement();
        boolean resultado = stm.execute("select * from produto");
        ResultSet rst = stm.getResultSet();
        while (rst.next()) {
            Integer id = rst.getInt("id");
            String nome = rst.getString("nome");
            String descricao = rst.getString("descricao");
            Produto produto = new Produto(id, nome, descricao);
            System.out.println(produto);
        }
        con.close();

    }

}
