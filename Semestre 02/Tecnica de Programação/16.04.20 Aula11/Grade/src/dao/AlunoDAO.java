package dao;
import java.sql.*;

import classes.Aluno;
import java.util.ArrayList;

public class AlunoDAO {

    public ArrayList<Aluno> listaAlunos() {
        ArrayList<Aluno> lista = new ArrayList<Aluno>();
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM alunos ORDER BY rgm";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setRgm(rs.getString("rgm"));
                aluno.setNome(rs.getString("nome"));
                lista.add(aluno);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.toString());
        }
        return lista;
    }
}
