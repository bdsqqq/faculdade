package dao;

import classes.Aluno;
import java.sql.*;

public class alunoDAO {

    public String gravarAluno(Aluno aluno) {
        String resp = "";
        try {
            Connection con = Conecta.getConexao();
            String sql = "INSERT INTO dados(rgm, nome, nota1, nota2) ";
            sql += "VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, aluno.getRGM());
            ps.setString(2, aluno.getNome());
            ps.setFloat(3, aluno.getNota1());
            ps.setFloat(4, aluno.getNota2());
            ps.execute();
            ps.close();
            con.close();
            resp = "OK";
        } catch (Exception e) {
            resp = e.toString();
        }
        return resp;
    }
}
