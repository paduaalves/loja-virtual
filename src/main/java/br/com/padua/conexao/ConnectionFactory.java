package br.com.padua.conexao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

    private Properties properties = new Properties();

    private void carregaProperties() throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("lojavirtual/src/main/resources/connection.properties");
        properties.load(fis);
        fis.close();
    }

    public Connection recuperarConexao() throws SQLException, FileNotFoundException, IOException {
        carregaProperties();
        return DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"),
                properties.getProperty("password"));

    }

}