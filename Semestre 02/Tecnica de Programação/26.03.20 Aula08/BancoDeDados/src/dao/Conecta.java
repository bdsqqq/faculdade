package dao;
import classes.Aluno;
import java.sql.*;

public class Conecta {

    public static Connection getConexao() {
        Connection con = null;
        try {
            String serverName = "localhost";
            String mydatabase = "alunos";
            String username = "root";
            String password = "root";
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado " + e.toString());
        } catch (SQLException e) {
            System.out.println("Erro ao conectar o Banco de Dados " + e.toString());
        }
        return con;
    }
    
    public Aluno getAluno(String rgm) {
        Aluno aluno = new Aluno();
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM dados WHERE rgm=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, rgm);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                aluno.setNome(rs.getString("nome"));
                aluno.setRGM(rs.getString("rgm"));
                aluno.setNota1(rs.getFloat("nota1"));
                aluno.setNota2(rs.getFloat("nota2"));
            } else {
                aluno = null;
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            aluno = null;
        }
        return aluno;
    }
    
}
