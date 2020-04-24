package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conecta {

    public static Connection getConexao() {
        Connection con = null;
        try {
            String serverName = "localhost";
            String mydatabase = "urna";
            String username = "root";
            String password = "ilfr741852";
            //String driverName = "com.mysql.jdbc.Driver";
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName);
            //String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String url = "jdbc:mysql://localhost:3306/urna?useTimezone=true&serverTimezone=UTC";
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado " + e.toString());
        } catch (SQLException e) {
            System.out.println("Erro ao conectar o Banco de Dados " + e.toString());
        }
        return con;
    }
}
